package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class o2 {

    /* renamed from: a  reason: collision with root package name */
    private final e f4177a;

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    private static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        protected final Window f4178a;

        /* renamed from: b  reason: collision with root package name */
        private final m0 f4179b;

        a(Window window, m0 m0Var) {
            this.f4178a = window;
            this.f4179b = m0Var;
        }

        protected void e(int i10) {
            View decorView = this.f4178a.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            this.f4178a.addFlags(i10);
        }

        protected void g(int i10) {
            View decorView = this.f4178a.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        protected void h(int i10) {
            this.f4178a.clearFlags(i10);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    private static class b extends a {
        b(Window window, m0 m0Var) {
            super(window, m0Var);
        }

        @Override // androidx.core.view.o2.e
        public boolean b() {
            if ((this.f4178a.getDecorView().getSystemUiVisibility() & 8192) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.o2.e
        public void d(boolean z10) {
            if (z10) {
                h(67108864);
                f(RecyclerView.UNDEFINED_DURATION);
                e(8192);
                return;
            }
            g(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    private static class c extends b {
        c(Window window, m0 m0Var) {
            super(window, m0Var);
        }

        @Override // androidx.core.view.o2.e
        public boolean a() {
            if ((this.f4178a.getDecorView().getSystemUiVisibility() & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.o2.e
        public void c(boolean z10) {
            if (z10) {
                h(134217728);
                f(RecyclerView.UNDEFINED_DURATION);
                e(16);
                return;
            }
            g(16);
        }
    }

    @Deprecated
    private o2(WindowInsetsController windowInsetsController) {
        this.f4177a = new d(windowInsetsController, this, new m0(windowInsetsController));
    }

    @Deprecated
    public static o2 e(WindowInsetsController windowInsetsController) {
        return new o2(windowInsetsController);
    }

    public boolean a() {
        return this.f4177a.a();
    }

    public boolean b() {
        return this.f4177a.b();
    }

    public void c(boolean z10) {
        this.f4177a.c(z10);
    }

    public void d(boolean z10) {
        this.f4177a.d(z10);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    private static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final o2 f4180a;

        /* renamed from: b  reason: collision with root package name */
        final WindowInsetsController f4181b;

        /* renamed from: c  reason: collision with root package name */
        final m0 f4182c;

        /* renamed from: d  reason: collision with root package name */
        private final androidx.collection.g<Object, WindowInsetsController.OnControllableInsetsChangedListener> f4183d;

        /* renamed from: e  reason: collision with root package name */
        protected Window f4184e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(android.view.Window r2, androidx.core.view.o2 r3, androidx.core.view.m0 r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.p2.a(r2)
                r1.<init>(r0, r3, r4)
                r1.f4184e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.o2.d.<init>(android.view.Window, androidx.core.view.o2, androidx.core.view.m0):void");
        }

        @Override // androidx.core.view.o2.e
        public boolean a() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f4181b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 16) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.o2.e
        public boolean b() {
            int systemBarsAppearance;
            systemBarsAppearance = this.f4181b.getSystemBarsAppearance();
            if ((systemBarsAppearance & 8) != 0) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.o2.e
        public void c(boolean z10) {
            if (z10) {
                if (this.f4184e != null) {
                    e(16);
                }
                this.f4181b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f4184e != null) {
                f(16);
            }
            this.f4181b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.o2.e
        public void d(boolean z10) {
            if (z10) {
                if (this.f4184e != null) {
                    e(8192);
                }
                this.f4181b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f4184e != null) {
                f(8192);
            }
            this.f4181b.setSystemBarsAppearance(0, 8);
        }

        protected void e(int i10) {
            View decorView = this.f4184e.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        }

        protected void f(int i10) {
            View decorView = this.f4184e.getDecorView();
            decorView.setSystemUiVisibility((~i10) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, o2 o2Var, m0 m0Var) {
            this.f4183d = new androidx.collection.g<>();
            this.f4181b = windowInsetsController;
            this.f4180a = o2Var;
            this.f4182c = m0Var;
        }
    }

    public o2(Window window, View view) {
        m0 m0Var = new m0(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f4177a = new d(window, this, m0Var);
        } else if (i10 >= 26) {
            this.f4177a = new c(window, m0Var);
        } else if (i10 >= 23) {
            this.f4177a = new b(window, m0Var);
        } else {
            this.f4177a = new a(window, m0Var);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    private static class e {
        e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean z10) {
        }

        public void d(boolean z10) {
        }
    }
}
