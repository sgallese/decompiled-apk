package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.p1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: WindowInsetsAnimationCompat.java */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private e f4112a;

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        WindowInsets f4115a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4116b;

        public b(int i10) {
            this.f4116b = i10;
        }

        public final int a() {
            return this.f4116b;
        }

        public abstract void b(c1 c1Var);

        public abstract void c(c1 c1Var);

        public abstract p1 d(p1 p1Var, List<c1> list);

        public abstract a e(c1 c1Var, a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: e  reason: collision with root package name */
        private static final Interpolator f4117e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f  reason: collision with root package name */
        private static final Interpolator f4118f = new g3.a();

        /* renamed from: g  reason: collision with root package name */
        private static final Interpolator f4119g = new DecelerateInterpolator();

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            final b f4120a;

            /* renamed from: b  reason: collision with root package name */
            private p1 f4121b;

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.c1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class C0081a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c1 f4122a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ p1 f4123b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ p1 f4124c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f4125d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ View f4126e;

                C0081a(c1 c1Var, p1 p1Var, p1 p1Var2, int i10, View view) {
                    this.f4122a = c1Var;
                    this.f4123b = p1Var;
                    this.f4124c = p1Var2;
                    this.f4125d = i10;
                    this.f4126e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f4122a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f4126e, c.o(this.f4123b, this.f4124c, this.f4122a.b(), this.f4125d), Collections.singletonList(this.f4122a));
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* loaded from: classes.dex */
            class b extends AnimatorListenerAdapter {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c1 f4128a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ View f4129b;

                b(c1 c1Var, View view) {
                    this.f4128a = c1Var;
                    this.f4129b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f4128a.e(1.0f);
                    c.i(this.f4129b, this.f4128a);
                }
            }

            /* compiled from: WindowInsetsAnimationCompat.java */
            /* renamed from: androidx.core.view.c1$c$a$c  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0082c implements Runnable {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ View f4131f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ c1 f4132m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ a f4133p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ ValueAnimator f4134q;

                RunnableC0082c(View view, c1 c1Var, a aVar, ValueAnimator valueAnimator) {
                    this.f4131f = view;
                    this.f4132m = c1Var;
                    this.f4133p = aVar;
                    this.f4134q = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f4131f, this.f4132m, this.f4133p);
                    this.f4134q.start();
                }
            }

            a(View view, b bVar) {
                p1 p1Var;
                this.f4120a = bVar;
                p1 L = p0.L(view);
                if (L != null) {
                    p1Var = new p1.b(L).a();
                } else {
                    p1Var = null;
                }
                this.f4121b = p1Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f4121b = p1.w(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                p1 w10 = p1.w(windowInsets, view);
                if (this.f4121b == null) {
                    this.f4121b = p0.L(view);
                }
                if (this.f4121b == null) {
                    this.f4121b = w10;
                    return c.m(view, windowInsets);
                }
                b n10 = c.n(view);
                if (n10 != null && Objects.equals(n10.f4115a, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int e10 = c.e(w10, this.f4121b);
                if (e10 == 0) {
                    return c.m(view, windowInsets);
                }
                p1 p1Var = this.f4121b;
                c1 c1Var = new c1(e10, c.g(e10, w10, p1Var), 160L);
                c1Var.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c1Var.a());
                a f10 = c.f(w10, p1Var, e10);
                c.j(view, c1Var, windowInsets, false);
                duration.addUpdateListener(new C0081a(c1Var, w10, p1Var, e10, view));
                duration.addListener(new b(c1Var, view));
                k0.a(view, new RunnableC0082c(view, c1Var, f10, duration));
                this.f4121b = w10;
                return c.m(view, windowInsets);
            }
        }

        c(int i10, Interpolator interpolator, long j10) {
            super(i10, interpolator, j10);
        }

        @SuppressLint({"WrongConstant"})
        static int e(p1 p1Var, p1 p1Var2) {
            int i10 = 0;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if (!p1Var.f(i11).equals(p1Var2.f(i11))) {
                    i10 |= i11;
                }
            }
            return i10;
        }

        static a f(p1 p1Var, p1 p1Var2, int i10) {
            androidx.core.graphics.b f10 = p1Var.f(i10);
            androidx.core.graphics.b f11 = p1Var2.f(i10);
            return new a(androidx.core.graphics.b.b(Math.min(f10.f3872a, f11.f3872a), Math.min(f10.f3873b, f11.f3873b), Math.min(f10.f3874c, f11.f3874c), Math.min(f10.f3875d, f11.f3875d)), androidx.core.graphics.b.b(Math.max(f10.f3872a, f11.f3872a), Math.max(f10.f3873b, f11.f3873b), Math.max(f10.f3874c, f11.f3874c), Math.max(f10.f3875d, f11.f3875d)));
        }

        static Interpolator g(int i10, p1 p1Var, p1 p1Var2) {
            if ((i10 & 8) != 0) {
                if (p1Var.f(p1.m.a()).f3875d > p1Var2.f(p1.m.a()).f3875d) {
                    return f4117e;
                }
                return f4118f;
            }
            return f4119g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, c1 c1Var) {
            b n10 = n(view);
            if (n10 != null) {
                n10.b(c1Var);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    i(viewGroup.getChildAt(i10), c1Var);
                }
            }
        }

        static void j(View view, c1 c1Var, WindowInsets windowInsets, boolean z10) {
            b n10 = n(view);
            if (n10 != null) {
                n10.f4115a = windowInsets;
                if (!z10) {
                    n10.c(c1Var);
                    if (n10.a() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    j(viewGroup.getChildAt(i10), c1Var, windowInsets, z10);
                }
            }
        }

        static void k(View view, p1 p1Var, List<c1> list) {
            b n10 = n(view);
            if (n10 != null) {
                p1Var = n10.d(p1Var, list);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    k(viewGroup.getChildAt(i10), p1Var, list);
                }
            }
        }

        static void l(View view, c1 c1Var, a aVar) {
            b n10 = n(view);
            if (n10 != null) {
                n10.e(c1Var, aVar);
                if (n10.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    l(viewGroup.getChildAt(i10), c1Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            if (view.getTag(r2.e.L) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(r2.e.S);
            if (tag instanceof a) {
                return ((a) tag).f4120a;
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        static p1 o(p1 p1Var, p1 p1Var2, float f10, int i10) {
            p1.b bVar = new p1.b(p1Var);
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) == 0) {
                    bVar.b(i11, p1Var.f(i11));
                } else {
                    androidx.core.graphics.b f11 = p1Var.f(i11);
                    androidx.core.graphics.b f12 = p1Var2.f(i11);
                    float f13 = 1.0f - f10;
                    bVar.b(i11, p1.n(f11, (int) (((f11.f3872a - f12.f3872a) * f13) + 0.5d), (int) (((f11.f3873b - f12.f3873b) * f13) + 0.5d), (int) (((f11.f3874c - f12.f3874c) * f13) + 0.5d), (int) (((f11.f3875d - f12.f3875d) * f13) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(r2.e.L);
            if (bVar == null) {
                view.setTag(r2.e.S, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h10 = h(view, bVar);
            view.setTag(r2.e.S, h10);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        private final int f4141a;

        /* renamed from: b  reason: collision with root package name */
        private float f4142b;

        /* renamed from: c  reason: collision with root package name */
        private final Interpolator f4143c;

        /* renamed from: d  reason: collision with root package name */
        private final long f4144d;

        e(int i10, Interpolator interpolator, long j10) {
            this.f4141a = i10;
            this.f4143c = interpolator;
            this.f4144d = j10;
        }

        public long a() {
            return this.f4144d;
        }

        public float b() {
            Interpolator interpolator = this.f4143c;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.f4142b);
            }
            return this.f4142b;
        }

        public int c() {
            return this.f4141a;
        }

        public void d(float f10) {
            this.f4142b = f10;
        }
    }

    public c1(int i10, Interpolator interpolator, long j10) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4112a = new d(i10, interpolator, j10);
        } else {
            this.f4112a = new c(i10, interpolator, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static c1 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new c1(windowInsetsAnimation);
    }

    public long a() {
        return this.f4112a.a();
    }

    public float b() {
        return this.f4112a.b();
    }

    public int c() {
        return this.f4112a.c();
    }

    public void e(float f10) {
        this.f4112a.d(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: e  reason: collision with root package name */
        private final WindowInsetsAnimation f4136e;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: WindowInsetsAnimationCompat.java */
        /* loaded from: classes.dex */
        public static class a extends WindowInsetsAnimation.Callback {

            /* renamed from: a  reason: collision with root package name */
            private final b f4137a;

            /* renamed from: b  reason: collision with root package name */
            private List<c1> f4138b;

            /* renamed from: c  reason: collision with root package name */
            private ArrayList<c1> f4139c;

            /* renamed from: d  reason: collision with root package name */
            private final HashMap<WindowInsetsAnimation, c1> f4140d;

            a(b bVar) {
                super(bVar.a());
                this.f4140d = new HashMap<>();
                this.f4137a = bVar;
            }

            private c1 a(WindowInsetsAnimation windowInsetsAnimation) {
                c1 c1Var = this.f4140d.get(windowInsetsAnimation);
                if (c1Var == null) {
                    c1 f10 = c1.f(windowInsetsAnimation);
                    this.f4140d.put(windowInsetsAnimation, f10);
                    return f10;
                }
                return c1Var;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f4137a.b(a(windowInsetsAnimation));
                this.f4140d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f4137a.c(a(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<c1> arrayList = this.f4139c;
                if (arrayList == null) {
                    ArrayList<c1> arrayList2 = new ArrayList<>(list.size());
                    this.f4139c = arrayList2;
                    this.f4138b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a10 = n1.a(list.get(size));
                    c1 a11 = a(a10);
                    fraction = a10.getFraction();
                    a11.e(fraction);
                    this.f4139c.add(a11);
                }
                return this.f4137a.d(p1.v(windowInsets), this.f4138b).u();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f4137a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f4136e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            k1.a();
            return j1.a(aVar.a().e(), aVar.b().e());
        }

        public static androidx.core.graphics.b f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return androidx.core.graphics.b.d(upperBound);
        }

        public static androidx.core.graphics.b g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return androidx.core.graphics.b.d(lowerBound);
        }

        public static void h(View view, b bVar) {
            a aVar;
            if (bVar != null) {
                aVar = new a(bVar);
            } else {
                aVar = null;
            }
            view.setWindowInsetsAnimationCallback(aVar);
        }

        @Override // androidx.core.view.c1.e
        public long a() {
            long durationMillis;
            durationMillis = this.f4136e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.c1.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f4136e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.c1.e
        public int c() {
            int typeMask;
            typeMask = this.f4136e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.c1.e
        public void d(float f10) {
            this.f4136e.setFraction(f10);
        }

        d(int i10, Interpolator interpolator, long j10) {
            this(i1.a(i10, interpolator, j10));
        }
    }

    /* compiled from: WindowInsetsAnimationCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.core.graphics.b f4113a;

        /* renamed from: b  reason: collision with root package name */
        private final androidx.core.graphics.b f4114b;

        public a(androidx.core.graphics.b bVar, androidx.core.graphics.b bVar2) {
            this.f4113a = bVar;
            this.f4114b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public androidx.core.graphics.b a() {
            return this.f4113a;
        }

        public androidx.core.graphics.b b() {
            return this.f4114b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f4113a + " upper=" + this.f4114b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.f4113a = d.g(bounds);
            this.f4114b = d.f(bounds);
        }
    }

    private c1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4112a = new d(windowInsetsAnimation);
        }
    }
}
