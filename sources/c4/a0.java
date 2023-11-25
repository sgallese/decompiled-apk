package c4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewUtils.java */
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final l0 f8708a;

    /* renamed from: b  reason: collision with root package name */
    static final Property<View, Float> f8709b;

    /* renamed from: c  reason: collision with root package name */
    static final Property<View, Rect> f8710c;

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(a0.c(view));
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            a0.g(view, f10.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    /* loaded from: classes.dex */
    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return p0.w(view);
        }

        @Override // android.util.Property
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            p0.B0(view, rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f8708a = new k0();
        } else if (i10 >= 23) {
            f8708a = new j0();
        } else if (i10 >= 22) {
            f8708a = new h0();
        } else {
            f8708a = new f0();
        }
        f8709b = new a(Float.class, "translationAlpha");
        f8710c = new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        f8708a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z b(View view) {
        return new y(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(View view) {
        return f8708a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o0 d(View view) {
        return new n0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view) {
        f8708a.d(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, int i10, int i11, int i12, int i13) {
        f8708a.e(view, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void g(View view, float f10) {
        f8708a.f(view, f10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, int i10) {
        f8708a.g(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(View view, Matrix matrix) {
        f8708a.h(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, Matrix matrix) {
        f8708a.i(view, matrix);
    }
}
