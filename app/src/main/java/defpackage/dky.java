package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.autonavi.annotation.MainMapInvokePriority;
import com.autonavi.minimap.bundle.maphome.service.IMainMapService;

/* renamed from: dky reason: default package */
/* compiled from: MainMapRecordLogManager */
public class dky implements czy {
    private OnPreDrawListener a = new a(this, 0);

    /* renamed from: dky$a */
    /* compiled from: MainMapRecordLogManager */
    class a implements OnPreDrawListener {
        private a() {
        }

        /* synthetic */ a(dky dky, byte b) {
            this();
        }

        public final boolean onPreDraw() {
            la.d();
            dky.this.a();
            return true;
        }
    }

    @MainMapInvokePriority(1.0f)
    public void onResume() {
        cqb cqb = (cqb) ank.a(cqb.class);
        if (cqb != null && cqb.c()) {
            IMainMapService iMainMapService = (IMainMapService) ank.a(IMainMapService.class);
            if (iMainMapService != null) {
                czh czh = (czh) iMainMapService.a(czh.class);
                if (czh != null) {
                    final View b = czh.b();
                    if (b != null) {
                        b.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                            public final boolean onPreDraw() {
                                if (b != null) {
                                    b.getViewTreeObserver().removeOnPreDrawListener(this);
                                }
                                cqb cqb = (cqb) ank.a(cqb.class);
                                if (cqb != null) {
                                    cqb.b();
                                }
                                return false;
                            }
                        });
                    }
                }
            }
        }
        if (bny.a && this.a != null) {
            IMainMapService iMainMapService2 = (IMainMapService) ank.a(IMainMapService.class);
            if (iMainMapService2 != null) {
                bty g = iMainMapService2.g();
                if (g != null) {
                    g.f(1);
                    czh czh2 = (czh) iMainMapService2.a(czh.class);
                    if (czh2 != null) {
                        View b2 = czh2.b();
                        if (b2 != null) {
                            b2.getViewTreeObserver().addOnPreDrawListener(this.a);
                        }
                    }
                }
            }
        }
    }

    public void onPause() {
        a();
    }

    /* access modifiers changed from: private */
    public void a() {
        if (bny.a && this.a != null) {
            czh czh = (czh) ((IMainMapService) ank.a(IMainMapService.class)).a(czh.class);
            if (czh != null) {
                View b = czh.b();
                if (b != null) {
                    b.getViewTreeObserver().removeOnPreDrawListener(this.a);
                    this.a = null;
                }
            }
        }
    }
}
