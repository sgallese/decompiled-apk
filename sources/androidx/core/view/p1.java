package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class p1 {

    /* renamed from: b  reason: collision with root package name */
    public static final p1 f4206b;

    /* renamed from: a  reason: collision with root package name */
    private final l f4207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static Field f4208a;

        /* renamed from: b  reason: collision with root package name */
        private static Field f4209b;

        /* renamed from: c  reason: collision with root package name */
        private static Field f4210c;

        /* renamed from: d  reason: collision with root package name */
        private static boolean f4211d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f4208a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f4209b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f4210c = declaredField3;
                declaredField3.setAccessible(true);
                f4211d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }

        public static p1 a(View view) {
            if (f4211d && view.isAttachedToWindow()) {
                try {
                    Object obj = f4208a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f4209b.get(obj);
                        Rect rect2 = (Rect) f4210c.get(obj);
                        if (rect != null && rect2 != null) {
                            p1 a10 = new b().c(androidx.core.graphics.b.c(rect)).d(androidx.core.graphics.b.c(rect2)).a();
                            a10.s(a10);
                            a10.d(view.getRootView());
                            return a10;
                        }
                    }
                } catch (IllegalAccessException e10) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
                }
            }
            return null;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class e extends d {
        e() {
        }

        @Override // androidx.core.view.p1.f
        void c(int i10, androidx.core.graphics.b bVar) {
            this.f4219c.setInsets(n.a(i10), bVar.e());
        }

        e(p1 p1Var) {
            super(p1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        private final p1 f4220a;

        /* renamed from: b  reason: collision with root package name */
        androidx.core.graphics.b[] f4221b;

        f() {
            this(new p1((p1) null));
        }

        protected final void a() {
            androidx.core.graphics.b[] bVarArr = this.f4221b;
            if (bVarArr != null) {
                androidx.core.graphics.b bVar = bVarArr[m.b(1)];
                androidx.core.graphics.b bVar2 = this.f4221b[m.b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f4220a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f4220a.f(1);
                }
                g(androidx.core.graphics.b.a(bVar, bVar2));
                androidx.core.graphics.b bVar3 = this.f4221b[m.b(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                androidx.core.graphics.b bVar4 = this.f4221b[m.b(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                androidx.core.graphics.b bVar5 = this.f4221b[m.b(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        p1 b() {
            throw null;
        }

        void c(int i10, androidx.core.graphics.b bVar) {
            if (this.f4221b == null) {
                this.f4221b = new androidx.core.graphics.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f4221b[m.b(i11)] = bVar;
                }
            }
        }

        void e(androidx.core.graphics.b bVar) {
            throw null;
        }

        void g(androidx.core.graphics.b bVar) {
            throw null;
        }

        f(p1 p1Var) {
            this.f4220a = p1Var;
        }

        void d(androidx.core.graphics.b bVar) {
        }

        void f(androidx.core.graphics.b bVar) {
        }

        void h(androidx.core.graphics.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class i extends h {
        i(p1 p1Var, WindowInsets windowInsets) {
            super(p1Var, windowInsets);
        }

        @Override // androidx.core.view.p1.l
        p1 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f4227c.consumeDisplayCutout();
            return p1.v(consumeDisplayCutout);
        }

        @Override // androidx.core.view.p1.g, androidx.core.view.p1.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f4227c, iVar.f4227c) && Objects.equals(this.f4231g, iVar.f4231g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.p1.l
        androidx.core.view.n f() {
            DisplayCutout displayCutout;
            displayCutout = this.f4227c.getDisplayCutout();
            return androidx.core.view.n.e(displayCutout);
        }

        @Override // androidx.core.view.p1.l
        public int hashCode() {
            return this.f4227c.hashCode();
        }

        i(p1 p1Var, i iVar) {
            super(p1Var, iVar);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        static final p1 f4236q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f4236q = p1.v(windowInsets);
        }

        k(p1 p1Var, WindowInsets windowInsets) {
            super(p1Var, windowInsets);
        }

        @Override // androidx.core.view.p1.g, androidx.core.view.p1.l
        public androidx.core.graphics.b g(int i10) {
            Insets insets;
            insets = this.f4227c.getInsets(n.a(i10));
            return androidx.core.graphics.b.d(insets);
        }

        k(p1 p1Var, k kVar) {
            super(p1Var, kVar);
        }

        @Override // androidx.core.view.p1.g, androidx.core.view.p1.l
        final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class m {
        public static int a() {
            return 8;
        }

        static int b(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 != 8) {
                    if (i10 == 16) {
                        return 4;
                    }
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                if (i10 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }

        public static int c() {
            return 32;
        }

        public static int d() {
            return 7;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static final class n {
        static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4206b = k.f4236q;
        } else {
            f4206b = l.f4237b;
        }
    }

    private p1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f4207a = new k(this, windowInsets);
        } else if (i10 >= 29) {
            this.f4207a = new j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f4207a = new i(this, windowInsets);
        } else {
            this.f4207a = new h(this, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static androidx.core.graphics.b n(androidx.core.graphics.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f3872a - i10);
        int max2 = Math.max(0, bVar.f3873b - i11);
        int max3 = Math.max(0, bVar.f3874c - i12);
        int max4 = Math.max(0, bVar.f3875d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return androidx.core.graphics.b.b(max, max2, max3, max4);
    }

    public static p1 v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static p1 w(WindowInsets windowInsets, View view) {
        p1 p1Var = new p1((WindowInsets) androidx.core.util.i.g(windowInsets));
        if (view != null && p0.X(view)) {
            p1Var.s(p0.L(view));
            p1Var.d(view.getRootView());
        }
        return p1Var;
    }

    @Deprecated
    public p1 a() {
        return this.f4207a.a();
    }

    @Deprecated
    public p1 b() {
        return this.f4207a.b();
    }

    @Deprecated
    public p1 c() {
        return this.f4207a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view) {
        this.f4207a.d(view);
    }

    public androidx.core.view.n e() {
        return this.f4207a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        return androidx.core.util.c.a(this.f4207a, ((p1) obj).f4207a);
    }

    public androidx.core.graphics.b f(int i10) {
        return this.f4207a.g(i10);
    }

    @Deprecated
    public androidx.core.graphics.b g() {
        return this.f4207a.i();
    }

    @Deprecated
    public androidx.core.graphics.b h() {
        return this.f4207a.j();
    }

    public int hashCode() {
        l lVar = this.f4207a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f4207a.k().f3875d;
    }

    @Deprecated
    public int j() {
        return this.f4207a.k().f3872a;
    }

    @Deprecated
    public int k() {
        return this.f4207a.k().f3874c;
    }

    @Deprecated
    public int l() {
        return this.f4207a.k().f3873b;
    }

    public p1 m(int i10, int i11, int i12, int i13) {
        return this.f4207a.m(i10, i11, i12, i13);
    }

    public boolean o() {
        return this.f4207a.n();
    }

    @Deprecated
    public p1 p(int i10, int i11, int i12, int i13) {
        return new b(this).d(androidx.core.graphics.b.b(i10, i11, i12, i13)).a();
    }

    void q(androidx.core.graphics.b[] bVarArr) {
        this.f4207a.p(bVarArr);
    }

    void r(androidx.core.graphics.b bVar) {
        this.f4207a.q(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(p1 p1Var) {
        this.f4207a.r(p1Var);
    }

    void t(androidx.core.graphics.b bVar) {
        this.f4207a.s(bVar);
    }

    public WindowInsets u() {
        l lVar = this.f4207a;
        if (lVar instanceof g) {
            return ((g) lVar).f4227c;
        }
        return null;
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private static Field f4213e = null;

        /* renamed from: f  reason: collision with root package name */
        private static boolean f4214f = false;

        /* renamed from: g  reason: collision with root package name */
        private static Constructor<WindowInsets> f4215g = null;

        /* renamed from: h  reason: collision with root package name */
        private static boolean f4216h = false;

        /* renamed from: c  reason: collision with root package name */
        private WindowInsets f4217c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b f4218d;

        c() {
            this.f4217c = i();
        }

        private static WindowInsets i() {
            if (!f4214f) {
                try {
                    f4213e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f4214f = true;
            }
            Field field = f4213e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f4216h) {
                try {
                    f4215g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f4216h = true;
            }
            Constructor<WindowInsets> constructor = f4215g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.p1.f
        p1 b() {
            a();
            p1 v10 = p1.v(this.f4217c);
            v10.q(this.f4221b);
            v10.t(this.f4218d);
            return v10;
        }

        @Override // androidx.core.view.p1.f
        void e(androidx.core.graphics.b bVar) {
            this.f4218d = bVar;
        }

        @Override // androidx.core.view.p1.f
        void g(androidx.core.graphics.b bVar) {
            WindowInsets windowInsets = this.f4217c;
            if (windowInsets != null) {
                this.f4217c = windowInsets.replaceSystemWindowInsets(bVar.f3872a, bVar.f3873b, bVar.f3874c, bVar.f3875d);
            }
        }

        c(p1 p1Var) {
            super(p1Var);
            this.f4217c = p1Var.u();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets.Builder f4219c;

        d() {
            this.f4219c = w1.a();
        }

        @Override // androidx.core.view.p1.f
        p1 b() {
            WindowInsets build;
            a();
            build = this.f4219c.build();
            p1 v10 = p1.v(build);
            v10.q(this.f4221b);
            return v10;
        }

        @Override // androidx.core.view.p1.f
        void d(androidx.core.graphics.b bVar) {
            this.f4219c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.p1.f
        void e(androidx.core.graphics.b bVar) {
            this.f4219c.setStableInsets(bVar.e());
        }

        @Override // androidx.core.view.p1.f
        void f(androidx.core.graphics.b bVar) {
            this.f4219c.setSystemGestureInsets(bVar.e());
        }

        @Override // androidx.core.view.p1.f
        void g(androidx.core.graphics.b bVar) {
            this.f4219c.setSystemWindowInsets(bVar.e());
        }

        @Override // androidx.core.view.p1.f
        void h(androidx.core.graphics.b bVar) {
            this.f4219c.setTappableElementInsets(bVar.e());
        }

        d(p1 p1Var) {
            super(p1Var);
            WindowInsets.Builder a10;
            WindowInsets u10 = p1Var.u();
            if (u10 != null) {
                a10 = x1.a(u10);
            } else {
                a10 = w1.a();
            }
            this.f4219c = a10;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        private androidx.core.graphics.b f4232m;

        h(p1 p1Var, WindowInsets windowInsets) {
            super(p1Var, windowInsets);
            this.f4232m = null;
        }

        @Override // androidx.core.view.p1.l
        p1 b() {
            return p1.v(this.f4227c.consumeStableInsets());
        }

        @Override // androidx.core.view.p1.l
        p1 c() {
            return p1.v(this.f4227c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.p1.l
        final androidx.core.graphics.b i() {
            if (this.f4232m == null) {
                this.f4232m = androidx.core.graphics.b.b(this.f4227c.getStableInsetLeft(), this.f4227c.getStableInsetTop(), this.f4227c.getStableInsetRight(), this.f4227c.getStableInsetBottom());
            }
            return this.f4232m;
        }

        @Override // androidx.core.view.p1.l
        boolean n() {
            return this.f4227c.isConsumed();
        }

        @Override // androidx.core.view.p1.l
        public void s(androidx.core.graphics.b bVar) {
            this.f4232m = bVar;
        }

        h(p1 p1Var, h hVar) {
            super(p1Var, hVar);
            this.f4232m = null;
            this.f4232m = hVar.f4232m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        private static boolean f4222h = false;

        /* renamed from: i  reason: collision with root package name */
        private static Method f4223i;

        /* renamed from: j  reason: collision with root package name */
        private static Class<?> f4224j;

        /* renamed from: k  reason: collision with root package name */
        private static Field f4225k;

        /* renamed from: l  reason: collision with root package name */
        private static Field f4226l;

        /* renamed from: c  reason: collision with root package name */
        final WindowInsets f4227c;

        /* renamed from: d  reason: collision with root package name */
        private androidx.core.graphics.b[] f4228d;

        /* renamed from: e  reason: collision with root package name */
        private androidx.core.graphics.b f4229e;

        /* renamed from: f  reason: collision with root package name */
        private p1 f4230f;

        /* renamed from: g  reason: collision with root package name */
        androidx.core.graphics.b f4231g;

        g(p1 p1Var, WindowInsets windowInsets) {
            super(p1Var);
            this.f4229e = null;
            this.f4227c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private androidx.core.graphics.b t(int i10, boolean z10) {
            androidx.core.graphics.b bVar = androidx.core.graphics.b.f3871e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = androidx.core.graphics.b.a(bVar, u(i11, z10));
                }
            }
            return bVar;
        }

        private androidx.core.graphics.b v() {
            p1 p1Var = this.f4230f;
            if (p1Var != null) {
                return p1Var.g();
            }
            return androidx.core.graphics.b.f3871e;
        }

        private androidx.core.graphics.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f4222h) {
                    x();
                }
                Method method = f4223i;
                if (method != null && f4224j != null && f4225k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f4225k.get(f4226l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return androidx.core.graphics.b.c(rect);
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f4223i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f4224j = cls;
                f4225k = cls.getDeclaredField("mVisibleInsets");
                f4226l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f4225k.setAccessible(true);
                f4226l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f4222h = true;
        }

        @Override // androidx.core.view.p1.l
        void d(View view) {
            androidx.core.graphics.b w10 = w(view);
            if (w10 == null) {
                w10 = androidx.core.graphics.b.f3871e;
            }
            q(w10);
        }

        @Override // androidx.core.view.p1.l
        void e(p1 p1Var) {
            p1Var.s(this.f4230f);
            p1Var.r(this.f4231g);
        }

        @Override // androidx.core.view.p1.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f4231g, ((g) obj).f4231g);
        }

        @Override // androidx.core.view.p1.l
        public androidx.core.graphics.b g(int i10) {
            return t(i10, false);
        }

        @Override // androidx.core.view.p1.l
        final androidx.core.graphics.b k() {
            if (this.f4229e == null) {
                this.f4229e = androidx.core.graphics.b.b(this.f4227c.getSystemWindowInsetLeft(), this.f4227c.getSystemWindowInsetTop(), this.f4227c.getSystemWindowInsetRight(), this.f4227c.getSystemWindowInsetBottom());
            }
            return this.f4229e;
        }

        @Override // androidx.core.view.p1.l
        p1 m(int i10, int i11, int i12, int i13) {
            b bVar = new b(p1.v(this.f4227c));
            bVar.d(p1.n(k(), i10, i11, i12, i13));
            bVar.c(p1.n(i(), i10, i11, i12, i13));
            return bVar.a();
        }

        @Override // androidx.core.view.p1.l
        boolean o() {
            return this.f4227c.isRound();
        }

        @Override // androidx.core.view.p1.l
        public void p(androidx.core.graphics.b[] bVarArr) {
            this.f4228d = bVarArr;
        }

        @Override // androidx.core.view.p1.l
        void q(androidx.core.graphics.b bVar) {
            this.f4231g = bVar;
        }

        @Override // androidx.core.view.p1.l
        void r(p1 p1Var) {
            this.f4230f = p1Var;
        }

        protected androidx.core.graphics.b u(int i10, boolean z10) {
            int i11;
            androidx.core.view.n f10;
            if (i10 != 1) {
                androidx.core.graphics.b bVar = null;
                if (i10 != 2) {
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return androidx.core.graphics.b.f3871e;
                                    }
                                    p1 p1Var = this.f4230f;
                                    if (p1Var != null) {
                                        f10 = p1Var.e();
                                    } else {
                                        f10 = f();
                                    }
                                    if (f10 != null) {
                                        return androidx.core.graphics.b.b(f10.b(), f10.d(), f10.c(), f10.a());
                                    }
                                    return androidx.core.graphics.b.f3871e;
                                }
                                return l();
                            }
                            return h();
                        }
                        return j();
                    }
                    androidx.core.graphics.b[] bVarArr = this.f4228d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.b(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    androidx.core.graphics.b k10 = k();
                    androidx.core.graphics.b v10 = v();
                    int i12 = k10.f3875d;
                    if (i12 > v10.f3875d) {
                        return androidx.core.graphics.b.b(0, 0, 0, i12);
                    }
                    androidx.core.graphics.b bVar2 = this.f4231g;
                    if (bVar2 != null && !bVar2.equals(androidx.core.graphics.b.f3871e) && (i11 = this.f4231g.f3875d) > v10.f3875d) {
                        return androidx.core.graphics.b.b(0, 0, 0, i11);
                    }
                    return androidx.core.graphics.b.f3871e;
                } else if (z10) {
                    androidx.core.graphics.b v11 = v();
                    androidx.core.graphics.b i13 = i();
                    return androidx.core.graphics.b.b(Math.max(v11.f3872a, i13.f3872a), 0, Math.max(v11.f3874c, i13.f3874c), Math.max(v11.f3875d, i13.f3875d));
                } else {
                    androidx.core.graphics.b k11 = k();
                    p1 p1Var2 = this.f4230f;
                    if (p1Var2 != null) {
                        bVar = p1Var2.g();
                    }
                    int i14 = k11.f3875d;
                    if (bVar != null) {
                        i14 = Math.min(i14, bVar.f3875d);
                    }
                    return androidx.core.graphics.b.b(k11.f3872a, 0, k11.f3874c, i14);
                }
            } else if (z10) {
                return androidx.core.graphics.b.b(0, Math.max(v().f3873b, k().f3873b), 0, 0);
            } else {
                return androidx.core.graphics.b.b(0, k().f3873b, 0, 0);
            }
        }

        g(p1 p1Var, g gVar) {
            this(p1Var, new WindowInsets(gVar.f4227c));
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    private static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        private androidx.core.graphics.b f4233n;

        /* renamed from: o  reason: collision with root package name */
        private androidx.core.graphics.b f4234o;

        /* renamed from: p  reason: collision with root package name */
        private androidx.core.graphics.b f4235p;

        j(p1 p1Var, WindowInsets windowInsets) {
            super(p1Var, windowInsets);
            this.f4233n = null;
            this.f4234o = null;
            this.f4235p = null;
        }

        @Override // androidx.core.view.p1.l
        androidx.core.graphics.b h() {
            Insets mandatorySystemGestureInsets;
            if (this.f4234o == null) {
                mandatorySystemGestureInsets = this.f4227c.getMandatorySystemGestureInsets();
                this.f4234o = androidx.core.graphics.b.d(mandatorySystemGestureInsets);
            }
            return this.f4234o;
        }

        @Override // androidx.core.view.p1.l
        androidx.core.graphics.b j() {
            Insets systemGestureInsets;
            if (this.f4233n == null) {
                systemGestureInsets = this.f4227c.getSystemGestureInsets();
                this.f4233n = androidx.core.graphics.b.d(systemGestureInsets);
            }
            return this.f4233n;
        }

        @Override // androidx.core.view.p1.l
        androidx.core.graphics.b l() {
            Insets tappableElementInsets;
            if (this.f4235p == null) {
                tappableElementInsets = this.f4227c.getTappableElementInsets();
                this.f4235p = androidx.core.graphics.b.d(tappableElementInsets);
            }
            return this.f4235p;
        }

        @Override // androidx.core.view.p1.g, androidx.core.view.p1.l
        p1 m(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.f4227c.inset(i10, i11, i12, i13);
            return p1.v(inset);
        }

        j(p1 p1Var, j jVar) {
            super(p1Var, jVar);
            this.f4233n = null;
            this.f4234o = null;
            this.f4235p = null;
        }

        @Override // androidx.core.view.p1.h, androidx.core.view.p1.l
        public void s(androidx.core.graphics.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final f f4212a;

        public b() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f4212a = new e();
            } else if (i10 >= 29) {
                this.f4212a = new d();
            } else {
                this.f4212a = new c();
            }
        }

        public p1 a() {
            return this.f4212a.b();
        }

        public b b(int i10, androidx.core.graphics.b bVar) {
            this.f4212a.c(i10, bVar);
            return this;
        }

        @Deprecated
        public b c(androidx.core.graphics.b bVar) {
            this.f4212a.e(bVar);
            return this;
        }

        @Deprecated
        public b d(androidx.core.graphics.b bVar) {
            this.f4212a.g(bVar);
            return this;
        }

        public b(p1 p1Var) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                this.f4212a = new e(p1Var);
            } else if (i10 >= 29) {
                this.f4212a = new d(p1Var);
            } else {
                this.f4212a = new c(p1Var);
            }
        }
    }

    public p1(p1 p1Var) {
        if (p1Var != null) {
            l lVar = p1Var.f4207a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30 && (lVar instanceof k)) {
                this.f4207a = new k(this, (k) lVar);
            } else if (i10 >= 29 && (lVar instanceof j)) {
                this.f4207a = new j(this, (j) lVar);
            } else if (i10 >= 28 && (lVar instanceof i)) {
                this.f4207a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f4207a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f4207a = new g(this, (g) lVar);
            } else {
                this.f4207a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f4207a = new l(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class l {

        /* renamed from: b  reason: collision with root package name */
        static final p1 f4237b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        final p1 f4238a;

        l(p1 p1Var) {
            this.f4238a = p1Var;
        }

        p1 a() {
            return this.f4238a;
        }

        p1 b() {
            return this.f4238a;
        }

        p1 c() {
            return this.f4238a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            if (o() == lVar.o() && n() == lVar.n() && androidx.core.util.c.a(k(), lVar.k()) && androidx.core.util.c.a(i(), lVar.i()) && androidx.core.util.c.a(f(), lVar.f())) {
                return true;
            }
            return false;
        }

        androidx.core.view.n f() {
            return null;
        }

        androidx.core.graphics.b g(int i10) {
            return androidx.core.graphics.b.f3871e;
        }

        androidx.core.graphics.b h() {
            return k();
        }

        public int hashCode() {
            return androidx.core.util.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        androidx.core.graphics.b i() {
            return androidx.core.graphics.b.f3871e;
        }

        androidx.core.graphics.b j() {
            return k();
        }

        androidx.core.graphics.b k() {
            return androidx.core.graphics.b.f3871e;
        }

        androidx.core.graphics.b l() {
            return k();
        }

        p1 m(int i10, int i11, int i12, int i13) {
            return f4237b;
        }

        boolean n() {
            return false;
        }

        boolean o() {
            return false;
        }

        void d(View view) {
        }

        void e(p1 p1Var) {
        }

        public void p(androidx.core.graphics.b[] bVarArr) {
        }

        void q(androidx.core.graphics.b bVar) {
        }

        void r(p1 p1Var) {
        }

        public void s(androidx.core.graphics.b bVar) {
        }
    }
}
