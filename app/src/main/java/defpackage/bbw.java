package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import com.alipay.mobile.monitor.track.spm.merge.MergeUtil;

/* renamed from: bbw reason: default package */
/* compiled from: SearchServerUtil */
public final class bbw {
    public static String a(Rect rect) {
        StringBuffer stringBuffer = new StringBuffer();
        if (rect != null) {
            bbt a = a((long) rect.left, (long) rect.top);
            bbt a2 = a((long) rect.right, (long) rect.bottom);
            stringBuffer.append(a.a);
            stringBuffer.append(MergeUtil.SEPARATOR_KV);
            stringBuffer.append(a.b);
            stringBuffer.append(MergeUtil.SEPARATOR_KV);
            stringBuffer.append(a2.a);
            stringBuffer.append(MergeUtil.SEPARATOR_KV);
            stringBuffer.append(a2.b);
        }
        return stringBuffer.toString();
    }

    private static double a(double d, double d2, double d3) {
        return Math.min(Math.max(d, d2), d3);
    }

    public static Point a(double d, double d2) {
        Point point = new Point();
        double sin = Math.sin((a(d, -85.0511287798d, 85.0511287798d) * 3.141592653589793d) / 180.0d);
        point.x = (int) a((((((a(d2, -180.0d, 180.0d) * 3.141592653589793d) / 180.0d) * 6378137.0d) + 2.0037508342789244E7d) / 0.14929107086948487d) + 0.5d, 0.0d, 2.68435455E8d);
        point.y = (int) a((((double) ((long) (2.0037508342789244E7d - (Math.log((sin + 1.0d) / (1.0d - sin)) * 3189068.0d)))) / 0.14929107086948487d) + 0.5d, 0.0d, 2.68435455E8d);
        return point;
    }

    private static bbt a(long j, long j2) {
        bbt bbt = new bbt();
        bbt.b = 1.5707963267948966d - (Math.atan(Math.exp((-(2.0037508342789244E7d - (((double) j2) * 0.14929107086948487d))) / 6378137.0d)) * 2.0d);
        bbt.b *= 57.29577951308232d;
        bbt.a = ((((double) j) * 0.14929107086948487d) - 2.0037508342789244E7d) / 6378137.0d;
        bbt.a *= 57.29577951308232d;
        return bbt;
    }
}
