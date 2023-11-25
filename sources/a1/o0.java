package a1;

import a1.s4;
import a1.t4;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: AndroidPaint.android.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* compiled from: AndroidPaint.android.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f130a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f131b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f132c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f130a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f131b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f132c = iArr3;
        }
    }

    public static final b4 a() {
        return new n0();
    }

    public static final b4 b(Paint paint) {
        qc.q.i(paint, "<this>");
        return new n0(paint);
    }

    public static final float c(Paint paint) {
        qc.q.i(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        qc.q.i(paint, "<this>");
        return r1.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        qc.q.i(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return q3.f165a.b();
        }
        return q3.f165a.a();
    }

    public static final int f(Paint paint) {
        int i10;
        qc.q.i(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i10 = -1;
        } else {
            i10 = a.f131b[strokeCap.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return s4.f186b.a();
                }
                return s4.f186b.c();
            }
            return s4.f186b.b();
        }
        return s4.f186b.a();
    }

    public static final int g(Paint paint) {
        int i10;
        qc.q.i(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i10 = -1;
        } else {
            i10 = a.f132c[strokeJoin.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return t4.f193b.b();
                }
                return t4.f193b.c();
            }
            return t4.f193b.a();
        }
        return t4.f193b.b();
    }

    public static final float h(Paint paint) {
        qc.q.i(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        qc.q.i(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        qc.q.i(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, int i10) {
        qc.q.i(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            a5.f88a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(d0.b(i10)));
        }
    }

    public static final void m(Paint paint, long j10) {
        qc.q.i(paint, "$this$setNativeColor");
        paint.setColor(r1.k(j10));
    }

    public static final void n(Paint paint, q1 q1Var) {
        ColorFilter colorFilter;
        qc.q.i(paint, "<this>");
        if (q1Var != null) {
            colorFilter = g0.b(q1Var);
        } else {
            colorFilter = null;
        }
        paint.setColorFilter(colorFilter);
    }

    public static final void o(Paint paint, int i10) {
        qc.q.i(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!q3.d(i10, q3.f165a.b()));
    }

    public static final void p(Paint paint, f4 f4Var) {
        PathEffect pathEffect;
        qc.q.i(paint, "<this>");
        q0 q0Var = (q0) f4Var;
        if (q0Var != null) {
            pathEffect = q0Var.a();
        } else {
            pathEffect = null;
        }
        paint.setPathEffect(pathEffect);
    }

    public static final void q(Paint paint, Shader shader) {
        qc.q.i(paint, "<this>");
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i10) {
        Paint.Cap cap;
        qc.q.i(paint, "$this$setNativeStrokeCap");
        s4.a aVar = s4.f186b;
        if (s4.g(i10, aVar.c())) {
            cap = Paint.Cap.SQUARE;
        } else if (s4.g(i10, aVar.b())) {
            cap = Paint.Cap.ROUND;
        } else if (s4.g(i10, aVar.a())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final void s(Paint paint, int i10) {
        Paint.Join join;
        qc.q.i(paint, "$this$setNativeStrokeJoin");
        t4.a aVar = t4.f193b;
        if (t4.g(i10, aVar.b())) {
            join = Paint.Join.MITER;
        } else if (t4.g(i10, aVar.a())) {
            join = Paint.Join.BEVEL;
        } else if (t4.g(i10, aVar.c())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void t(Paint paint, float f10) {
        qc.q.i(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void u(Paint paint, float f10) {
        qc.q.i(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    public static final void v(Paint paint, int i10) {
        Paint.Style style;
        qc.q.i(paint, "$this$setNativeStyle");
        if (c4.d(i10, c4.f89a.b())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }
}
