package androidx.core.graphics;

import android.graphics.Color;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<double[]> f3870a = new ThreadLocal<>();

    public static void a(int i10, int i11, int i12, double[] dArr) {
        double pow;
        double pow2;
        double pow3;
        if (dArr.length == 3) {
            double d10 = i10 / 255.0d;
            if (d10 < 0.04045d) {
                pow = d10 / 12.92d;
            } else {
                pow = Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
            }
            double d11 = i11 / 255.0d;
            if (d11 < 0.04045d) {
                pow2 = d11 / 12.92d;
            } else {
                pow2 = Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
            }
            double d12 = i12 / 255.0d;
            if (d12 < 0.04045d) {
                pow3 = d12 / 12.92d;
            } else {
                pow3 = Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
            }
            dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
            dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
            dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
            return;
        }
        throw new IllegalArgumentException("outXyz must have a length of 3.");
    }

    public static int b(double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16 = (((3.2406d * d10) + ((-1.5372d) * d11)) + ((-0.4986d) * d12)) / 100.0d;
        double d17 = ((((-0.9689d) * d10) + (1.8758d * d11)) + (0.0415d * d12)) / 100.0d;
        double d18 = (((0.0557d * d10) + ((-0.204d) * d11)) + (1.057d * d12)) / 100.0d;
        if (d16 > 0.0031308d) {
            d13 = (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d13 = d16 * 12.92d;
        }
        if (d17 > 0.0031308d) {
            d14 = (Math.pow(d17, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d14 = d17 * 12.92d;
        }
        if (d18 > 0.0031308d) {
            d15 = (Math.pow(d18, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d15 = d18 * 12.92d;
        }
        return Color.rgb(i((int) Math.round(d13 * 255.0d), 0, 255), i((int) Math.round(d14 * 255.0d), 0, 255), i((int) Math.round(d15 * 255.0d), 0, 255));
    }

    public static int c(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb((int) ((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), (int) ((Color.red(i10) * f11) + (Color.red(i11) * f10)), (int) ((Color.green(i10) * f11) + (Color.green(i11) * f10)), (int) ((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public static double d(int i10) {
        double[] j10 = j();
        e(i10, j10);
        return j10[1] / 100.0d;
    }

    public static void e(int i10, double[] dArr) {
        a(Color.red(i10), Color.green(i10), Color.blue(i10), dArr);
    }

    private static int f(int i10, int i11) {
        return 255 - (((255 - i11) * (255 - i10)) / 255);
    }

    public static int g(int i10, int i11) {
        int alpha = Color.alpha(i11);
        int alpha2 = Color.alpha(i10);
        int f10 = f(alpha2, alpha);
        return Color.argb(f10, h(Color.red(i10), alpha2, Color.red(i11), alpha, f10), h(Color.green(i10), alpha2, Color.green(i11), alpha, f10), h(Color.blue(i10), alpha2, Color.blue(i11), alpha, f10));
    }

    private static int h(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            return 0;
        }
        return (((i10 * 255) * i11) + ((i12 * i13) * (255 - i11))) / (i14 * 255);
    }

    private static int i(int i10, int i11, int i12) {
        if (i10 >= i11) {
            return Math.min(i10, i12);
        }
        return i11;
    }

    private static double[] j() {
        ThreadLocal<double[]> threadLocal = f3870a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            double[] dArr2 = new double[3];
            threadLocal.set(dArr2);
            return dArr2;
        }
        return dArr;
    }

    public static int k(int i10, int i11) {
        if (i11 >= 0 && i11 <= 255) {
            return (i10 & 16777215) | (i11 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
