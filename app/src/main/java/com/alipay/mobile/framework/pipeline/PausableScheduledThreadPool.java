package com.alipay.mobile.framework.pipeline;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PausableScheduledThreadPool extends ScheduledThreadPoolExecutor {
    private static int e = 7;
    private boolean a;
    private ReentrantLock b = new ReentrantLock();
    private Condition c = this.b.newCondition();
    private long d = -1;

    public PausableScheduledThreadPool(int corePoolSize) {
        super(corePoolSize);
    }

    public PausableScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory) {
        super(corePoolSize, threadFactory);
    }

    public PausableScheduledThreadPool(int corePoolSize, RejectedExecutionHandler handler) {
        super(corePoolSize, handler);
    }

    public PausableScheduledThreadPool(int corePoolSize, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, threadFactory, handler);
    }

    /* access modifiers changed from: protected */
    public void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        this.b.lock();
        try {
            if (this.a) {
                if (this.d <= 0 || SystemClock.elapsedRealtime() - this.d <= TimeUnit.SECONDS.toMillis((long) e)) {
                    this.c.await((long) e, TimeUnit.SECONDS);
                } else {
                    resume();
                    return;
                }
            }
            this.b.unlock();
        } catch (InterruptedException e2) {
            t.interrupt();
        } finally {
            this.b.unlock();
        }
    }

    public void pause() {
        this.b.lock();
        try {
            this.a = true;
            this.d = SystemClock.elapsedRealtime();
        } finally {
            this.b.unlock();
        }
    }

    public void resume() {
        this.b.lock();
        try {
            this.a = false;
            this.d = -1;
            this.c.signalAll();
        } finally {
            this.b.unlock();
        }
    }

    public static void setAwaitTime(int awaitTime) {
        e = awaitTime;
    }
}
