package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class k1 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    Toolbar f1548a;

    /* renamed from: b  reason: collision with root package name */
    private int f1549b;

    /* renamed from: c  reason: collision with root package name */
    private View f1550c;

    /* renamed from: d  reason: collision with root package name */
    private View f1551d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f1552e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f1553f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f1554g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1555h;

    /* renamed from: i  reason: collision with root package name */
    CharSequence f1556i;

    /* renamed from: j  reason: collision with root package name */
    private CharSequence f1557j;

    /* renamed from: k  reason: collision with root package name */
    private CharSequence f1558k;

    /* renamed from: l  reason: collision with root package name */
    Window.Callback f1559l;

    /* renamed from: m  reason: collision with root package name */
    boolean f1560m;

    /* renamed from: n  reason: collision with root package name */
    private c f1561n;

    /* renamed from: o  reason: collision with root package name */
    private int f1562o;

    /* renamed from: p  reason: collision with root package name */
    private int f1563p;

    /* renamed from: q  reason: collision with root package name */
    private Drawable f1564q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class a implements View.OnClickListener {

        /* renamed from: f  reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1565f;

        a() {
            this.f1565f = new androidx.appcompat.view.menu.a(k1.this.f1548a.getContext(), 0, 16908332, 0, 0, k1.this.f1556i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k1 k1Var = k1.this;
            Window.Callback callback = k1Var.f1559l;
            if (callback != null && k1Var.f1560m) {
                callback.onMenuItemSelected(0, this.f1565f);
            }
        }
    }

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    class b extends androidx.core.view.z0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1567a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1568b;

        b(int i10) {
            this.f1568b = i10;
        }

        @Override // androidx.core.view.z0, androidx.core.view.y0
        public void a(View view) {
            this.f1567a = true;
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            if (!this.f1567a) {
                k1.this.f1548a.setVisibility(this.f1568b);
            }
        }

        @Override // androidx.core.view.z0, androidx.core.view.y0
        public void c(View view) {
            k1.this.f1548a.setVisibility(0);
        }
    }

    public k1(Toolbar toolbar, boolean z10) {
        this(toolbar, z10, g.h.f15812a, g.e.f15753n);
    }

    private int C() {
        if (this.f1548a.getNavigationIcon() != null) {
            this.f1564q = this.f1548a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    private void H(CharSequence charSequence) {
        this.f1556i = charSequence;
        if ((this.f1549b & 8) != 0) {
            this.f1548a.setTitle(charSequence);
            if (this.f1555h) {
                androidx.core.view.p0.x0(this.f1548a.getRootView(), charSequence);
            }
        }
    }

    private void I() {
        if ((this.f1549b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1558k)) {
                this.f1548a.setNavigationContentDescription(this.f1563p);
            } else {
                this.f1548a.setNavigationContentDescription(this.f1558k);
            }
        }
    }

    private void J() {
        if ((this.f1549b & 4) != 0) {
            Toolbar toolbar = this.f1548a;
            Drawable drawable = this.f1554g;
            if (drawable == null) {
                drawable = this.f1564q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1548a.setNavigationIcon((Drawable) null);
    }

    private void K() {
        Drawable drawable;
        int i10 = this.f1549b;
        if ((i10 & 2) != 0) {
            if ((i10 & 1) != 0) {
                drawable = this.f1553f;
                if (drawable == null) {
                    drawable = this.f1552e;
                }
            } else {
                drawable = this.f1552e;
            }
        } else {
            drawable = null;
        }
        this.f1548a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.i0
    public void A(Drawable drawable) {
        this.f1554g = drawable;
        J();
    }

    @Override // androidx.appcompat.widget.i0
    public void B(boolean z10) {
        this.f1548a.setCollapsible(z10);
    }

    public void D(View view) {
        View view2 = this.f1551d;
        if (view2 != null && (this.f1549b & 16) != 0) {
            this.f1548a.removeView(view2);
        }
        this.f1551d = view;
        if (view != null && (this.f1549b & 16) != 0) {
            this.f1548a.addView(view);
        }
    }

    public void E(int i10) {
        if (i10 == this.f1563p) {
            return;
        }
        this.f1563p = i10;
        if (TextUtils.isEmpty(this.f1548a.getNavigationContentDescription())) {
            x(this.f1563p);
        }
    }

    public void F(Drawable drawable) {
        this.f1553f = drawable;
        K();
    }

    public void G(CharSequence charSequence) {
        this.f1558k = charSequence;
        I();
    }

    @Override // androidx.appcompat.widget.i0
    public void a(Drawable drawable) {
        androidx.core.view.p0.y0(this.f1548a, drawable);
    }

    @Override // androidx.appcompat.widget.i0
    public void b(Menu menu, m.a aVar) {
        if (this.f1561n == null) {
            c cVar = new c(this.f1548a.getContext());
            this.f1561n = cVar;
            cVar.p(g.f.f15772g);
        }
        this.f1561n.h(aVar);
        this.f1548a.K((androidx.appcompat.view.menu.g) menu, this.f1561n);
    }

    @Override // androidx.appcompat.widget.i0
    public boolean c() {
        return this.f1548a.B();
    }

    @Override // androidx.appcompat.widget.i0
    public void collapseActionView() {
        this.f1548a.e();
    }

    @Override // androidx.appcompat.widget.i0
    public void d() {
        this.f1560m = true;
    }

    @Override // androidx.appcompat.widget.i0
    public boolean e() {
        return this.f1548a.d();
    }

    @Override // androidx.appcompat.widget.i0
    public boolean f() {
        return this.f1548a.A();
    }

    @Override // androidx.appcompat.widget.i0
    public boolean g() {
        return this.f1548a.w();
    }

    @Override // androidx.appcompat.widget.i0
    public Context getContext() {
        return this.f1548a.getContext();
    }

    @Override // androidx.appcompat.widget.i0
    public CharSequence getTitle() {
        return this.f1548a.getTitle();
    }

    @Override // androidx.appcompat.widget.i0
    public boolean h() {
        return this.f1548a.Q();
    }

    @Override // androidx.appcompat.widget.i0
    public void i() {
        this.f1548a.f();
    }

    @Override // androidx.appcompat.widget.i0
    public void j(z0 z0Var) {
        View view = this.f1550c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1548a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1550c);
            }
        }
        this.f1550c = z0Var;
        if (z0Var != null && this.f1562o == 2) {
            this.f1548a.addView(z0Var, 0);
            Toolbar.g gVar = (Toolbar.g) this.f1550c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) gVar).width = -2;
            ((ViewGroup.MarginLayoutParams) gVar).height = -2;
            gVar.f763a = 8388691;
            z0Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public boolean k() {
        return this.f1548a.v();
    }

    @Override // androidx.appcompat.widget.i0
    public void l(int i10) {
        View view;
        int i11 = this.f1549b ^ i10;
        this.f1549b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i11 & 3) != 0) {
                K();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1548a.setTitle(this.f1556i);
                    this.f1548a.setSubtitle(this.f1557j);
                } else {
                    this.f1548a.setTitle((CharSequence) null);
                    this.f1548a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1551d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1548a.addView(view);
                } else {
                    this.f1548a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void m(CharSequence charSequence) {
        this.f1557j = charSequence;
        if ((this.f1549b & 8) != 0) {
            this.f1548a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public Menu n() {
        return this.f1548a.getMenu();
    }

    @Override // androidx.appcompat.widget.i0
    public void o(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        F(drawable);
    }

    @Override // androidx.appcompat.widget.i0
    public int p() {
        return this.f1562o;
    }

    @Override // androidx.appcompat.widget.i0
    public androidx.core.view.x0 q(int i10, long j10) {
        float f10;
        androidx.core.view.x0 e10 = androidx.core.view.p0.e(this.f1548a);
        if (i10 == 0) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        return e10.b(f10).h(j10).j(new b(i10));
    }

    @Override // androidx.appcompat.widget.i0
    public void r(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        A(drawable);
    }

    @Override // androidx.appcompat.widget.i0
    public void s(m.a aVar, g.a aVar2) {
        this.f1548a.L(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.i0
    public void setIcon(int i10) {
        setIcon(i10 != 0 ? h.a.b(getContext(), i10) : null);
    }

    @Override // androidx.appcompat.widget.i0
    public void setTitle(CharSequence charSequence) {
        this.f1555h = true;
        H(charSequence);
    }

    @Override // androidx.appcompat.widget.i0
    public void setWindowCallback(Window.Callback callback) {
        this.f1559l = callback;
    }

    @Override // androidx.appcompat.widget.i0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1555h) {
            H(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.i0
    public void t(int i10) {
        this.f1548a.setVisibility(i10);
    }

    @Override // androidx.appcompat.widget.i0
    public ViewGroup u() {
        return this.f1548a;
    }

    @Override // androidx.appcompat.widget.i0
    public int w() {
        return this.f1549b;
    }

    @Override // androidx.appcompat.widget.i0
    public void x(int i10) {
        String string;
        if (i10 == 0) {
            string = null;
        } else {
            string = getContext().getString(i10);
        }
        G(string);
    }

    @Override // androidx.appcompat.widget.i0
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.i0
    public void z() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public k1(Toolbar toolbar, boolean z10, int i10, int i11) {
        Drawable drawable;
        this.f1562o = 0;
        this.f1563p = 0;
        this.f1548a = toolbar;
        this.f1556i = toolbar.getTitle();
        this.f1557j = toolbar.getSubtitle();
        this.f1555h = this.f1556i != null;
        this.f1554g = toolbar.getNavigationIcon();
        g1 v10 = g1.v(toolbar.getContext(), null, g.j.f15832a, g.a.f15692c, 0);
        this.f1564q = v10.g(g.j.f15889l);
        if (z10) {
            CharSequence p10 = v10.p(g.j.f15919r);
            if (!TextUtils.isEmpty(p10)) {
                setTitle(p10);
            }
            CharSequence p11 = v10.p(g.j.f15909p);
            if (!TextUtils.isEmpty(p11)) {
                m(p11);
            }
            Drawable g10 = v10.g(g.j.f15899n);
            if (g10 != null) {
                F(g10);
            }
            Drawable g11 = v10.g(g.j.f15894m);
            if (g11 != null) {
                setIcon(g11);
            }
            if (this.f1554g == null && (drawable = this.f1564q) != null) {
                A(drawable);
            }
            l(v10.k(g.j.f15869h, 0));
            int n10 = v10.n(g.j.f15864g, 0);
            if (n10 != 0) {
                D(LayoutInflater.from(this.f1548a.getContext()).inflate(n10, (ViewGroup) this.f1548a, false));
                l(this.f1549b | 16);
            }
            int m10 = v10.m(g.j.f15879j, 0);
            if (m10 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1548a.getLayoutParams();
                layoutParams.height = m10;
                this.f1548a.setLayoutParams(layoutParams);
            }
            int e10 = v10.e(g.j.f15859f, -1);
            int e11 = v10.e(g.j.f15854e, -1);
            if (e10 >= 0 || e11 >= 0) {
                this.f1548a.J(Math.max(e10, 0), Math.max(e11, 0));
            }
            int n11 = v10.n(g.j.f15924s, 0);
            if (n11 != 0) {
                Toolbar toolbar2 = this.f1548a;
                toolbar2.N(toolbar2.getContext(), n11);
            }
            int n12 = v10.n(g.j.f15914q, 0);
            if (n12 != 0) {
                Toolbar toolbar3 = this.f1548a;
                toolbar3.M(toolbar3.getContext(), n12);
            }
            int n13 = v10.n(g.j.f15904o, 0);
            if (n13 != 0) {
                this.f1548a.setPopupTheme(n13);
            }
        } else {
            this.f1549b = C();
        }
        v10.w();
        E(i10);
        this.f1558k = this.f1548a.getNavigationContentDescription();
        this.f1548a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.i0
    public void setIcon(Drawable drawable) {
        this.f1552e = drawable;
        K();
    }

    @Override // androidx.appcompat.widget.i0
    public void v(boolean z10) {
    }
}
