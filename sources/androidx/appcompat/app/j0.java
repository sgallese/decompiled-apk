package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.a;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.z0;
import androidx.core.view.a1;
import androidx.core.view.p0;
import androidx.core.view.x0;
import androidx.core.view.y0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class j0 extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator E = new AccelerateInterpolator();
    private static final Interpolator F = new DecelerateInterpolator();
    boolean A;

    /* renamed from: a  reason: collision with root package name */
    Context f897a;

    /* renamed from: b  reason: collision with root package name */
    private Context f898b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f899c;

    /* renamed from: d  reason: collision with root package name */
    ActionBarOverlayLayout f900d;

    /* renamed from: e  reason: collision with root package name */
    ActionBarContainer f901e;

    /* renamed from: f  reason: collision with root package name */
    androidx.appcompat.widget.i0 f902f;

    /* renamed from: g  reason: collision with root package name */
    ActionBarContextView f903g;

    /* renamed from: h  reason: collision with root package name */
    View f904h;

    /* renamed from: i  reason: collision with root package name */
    z0 f905i;

    /* renamed from: l  reason: collision with root package name */
    private boolean f908l;

    /* renamed from: m  reason: collision with root package name */
    d f909m;

    /* renamed from: n  reason: collision with root package name */
    androidx.appcompat.view.b f910n;

    /* renamed from: o  reason: collision with root package name */
    b.a f911o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f912p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f914r;

    /* renamed from: u  reason: collision with root package name */
    boolean f917u;

    /* renamed from: v  reason: collision with root package name */
    boolean f918v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f919w;

    /* renamed from: y  reason: collision with root package name */
    androidx.appcompat.view.h f921y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f922z;

    /* renamed from: j  reason: collision with root package name */
    private ArrayList<Object> f906j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    private int f907k = -1;

    /* renamed from: q  reason: collision with root package name */
    private ArrayList<a.b> f913q = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    private int f915s = 0;

    /* renamed from: t  reason: collision with root package name */
    boolean f916t = true;

    /* renamed from: x  reason: collision with root package name */
    private boolean f920x = true;
    final y0 B = new a();
    final y0 C = new b();
    final a1 D = new c();

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class a extends androidx.core.view.z0 {
        a() {
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            View view2;
            j0 j0Var = j0.this;
            if (j0Var.f916t && (view2 = j0Var.f904h) != null) {
                view2.setTranslationY(0.0f);
                j0.this.f901e.setTranslationY(0.0f);
            }
            j0.this.f901e.setVisibility(8);
            j0.this.f901e.setTransitioning(false);
            j0 j0Var2 = j0.this;
            j0Var2.f921y = null;
            j0Var2.J();
            ActionBarOverlayLayout actionBarOverlayLayout = j0.this.f900d;
            if (actionBarOverlayLayout != null) {
                p0.r0(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class b extends androidx.core.view.z0 {
        b() {
        }

        @Override // androidx.core.view.y0
        public void b(View view) {
            j0 j0Var = j0.this;
            j0Var.f921y = null;
            j0Var.f901e.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    class c implements a1 {
        c() {
        }

        @Override // androidx.core.view.a1
        public void a(View view) {
            ((View) j0.this.f901e.getParent()).invalidate();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends androidx.appcompat.view.b implements g.a {

        /* renamed from: p  reason: collision with root package name */
        private final Context f926p;

        /* renamed from: q  reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f927q;

        /* renamed from: r  reason: collision with root package name */
        private b.a f928r;

        /* renamed from: s  reason: collision with root package name */
        private WeakReference<View> f929s;

        public d(Context context, b.a aVar) {
            this.f926p = context;
            this.f928r = aVar;
            androidx.appcompat.view.menu.g S = new androidx.appcompat.view.menu.g(context).S(1);
            this.f927q = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            b.a aVar = this.f928r;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f928r == null) {
                return;
            }
            k();
            j0.this.f903g.l();
        }

        @Override // androidx.appcompat.view.b
        public void c() {
            j0 j0Var = j0.this;
            if (j0Var.f909m != this) {
                return;
            }
            if (!j0.I(j0Var.f917u, j0Var.f918v, false)) {
                j0 j0Var2 = j0.this;
                j0Var2.f910n = this;
                j0Var2.f911o = this.f928r;
            } else {
                this.f928r.a(this);
            }
            this.f928r = null;
            j0.this.H(false);
            j0.this.f903g.g();
            j0 j0Var3 = j0.this;
            j0Var3.f900d.setHideOnContentScrollEnabled(j0Var3.A);
            j0.this.f909m = null;
        }

        @Override // androidx.appcompat.view.b
        public View d() {
            WeakReference<View> weakReference = this.f929s;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.b
        public Menu e() {
            return this.f927q;
        }

        @Override // androidx.appcompat.view.b
        public MenuInflater f() {
            return new androidx.appcompat.view.g(this.f926p);
        }

        @Override // androidx.appcompat.view.b
        public CharSequence g() {
            return j0.this.f903g.getSubtitle();
        }

        @Override // androidx.appcompat.view.b
        public CharSequence i() {
            return j0.this.f903g.getTitle();
        }

        @Override // androidx.appcompat.view.b
        public void k() {
            if (j0.this.f909m != this) {
                return;
            }
            this.f927q.d0();
            try {
                this.f928r.c(this, this.f927q);
            } finally {
                this.f927q.c0();
            }
        }

        @Override // androidx.appcompat.view.b
        public boolean l() {
            return j0.this.f903g.j();
        }

        @Override // androidx.appcompat.view.b
        public void m(View view) {
            j0.this.f903g.setCustomView(view);
            this.f929s = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.b
        public void n(int i10) {
            o(j0.this.f897a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void o(CharSequence charSequence) {
            j0.this.f903g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void q(int i10) {
            r(j0.this.f897a.getResources().getString(i10));
        }

        @Override // androidx.appcompat.view.b
        public void r(CharSequence charSequence) {
            j0.this.f903g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.b
        public void s(boolean z10) {
            super.s(z10);
            j0.this.f903g.setTitleOptional(z10);
        }

        public boolean t() {
            this.f927q.d0();
            try {
                return this.f928r.b(this, this.f927q);
            } finally {
                this.f927q.c0();
            }
        }
    }

    public j0(Activity activity, boolean z10) {
        this.f899c = activity;
        View decorView = activity.getWindow().getDecorView();
        P(decorView);
        if (z10) {
            return;
        }
        this.f904h = decorView.findViewById(16908290);
    }

    static boolean I(boolean z10, boolean z11, boolean z12) {
        if (z12) {
            return true;
        }
        if (!z10 && !z11) {
            return true;
        }
        return false;
    }

    private androidx.appcompat.widget.i0 M(View view) {
        String str;
        if (view instanceof androidx.appcompat.widget.i0) {
            return (androidx.appcompat.widget.i0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    private void O() {
        if (this.f919w) {
            this.f919w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f900d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            V(false);
        }
    }

    private void P(View view) {
        boolean z10;
        boolean z11;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(g.f.f15781p);
        this.f900d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f902f = M(view.findViewById(g.f.f15766a));
        this.f903g = (ActionBarContextView) view.findViewById(g.f.f15771f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(g.f.f15768c);
        this.f901e = actionBarContainer;
        androidx.appcompat.widget.i0 i0Var = this.f902f;
        if (i0Var != null && this.f903g != null && actionBarContainer != null) {
            this.f897a = i0Var.getContext();
            if ((this.f902f.w() & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f908l = true;
            }
            androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(this.f897a);
            if (!b10.a() && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            B(z11);
            R(b10.g());
            TypedArray obtainStyledAttributes = this.f897a.obtainStyledAttributes(null, g.j.f15832a, g.a.f15692c, 0);
            if (obtainStyledAttributes.getBoolean(g.j.f15884k, false)) {
                S(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(g.j.f15874i, 0);
            if (dimensionPixelSize != 0) {
                x(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    private void R(boolean z10) {
        boolean z11;
        boolean z12;
        this.f914r = z10;
        if (!z10) {
            this.f902f.j(null);
            this.f901e.setTabContainer(this.f905i);
        } else {
            this.f901e.setTabContainer(null);
            this.f902f.j(this.f905i);
        }
        boolean z13 = true;
        if (N() == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        z0 z0Var = this.f905i;
        if (z0Var != null) {
            if (z11) {
                z0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f900d;
                if (actionBarOverlayLayout != null) {
                    p0.r0(actionBarOverlayLayout);
                }
            } else {
                z0Var.setVisibility(8);
            }
        }
        androidx.appcompat.widget.i0 i0Var = this.f902f;
        if (!this.f914r && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        i0Var.B(z12);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f900d;
        if (this.f914r || !z11) {
            z13 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z13);
    }

    private boolean T() {
        return p0.Y(this.f901e);
    }

    private void U() {
        if (!this.f919w) {
            this.f919w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f900d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            V(false);
        }
    }

    private void V(boolean z10) {
        if (I(this.f917u, this.f918v, this.f919w)) {
            if (!this.f920x) {
                this.f920x = true;
                L(z10);
            }
        } else if (this.f920x) {
            this.f920x = false;
            K(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(Drawable drawable) {
        this.f902f.A(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void B(boolean z10) {
        this.f902f.v(z10);
    }

    @Override // androidx.appcompat.app.a
    public void C(boolean z10) {
        androidx.appcompat.view.h hVar;
        this.f922z = z10;
        if (!z10 && (hVar = this.f921y) != null) {
            hVar.a();
        }
    }

    @Override // androidx.appcompat.app.a
    public void D(CharSequence charSequence) {
        this.f902f.m(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void E(CharSequence charSequence) {
        this.f902f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void F(CharSequence charSequence) {
        this.f902f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public androidx.appcompat.view.b G(b.a aVar) {
        d dVar = this.f909m;
        if (dVar != null) {
            dVar.c();
        }
        this.f900d.setHideOnContentScrollEnabled(false);
        this.f903g.k();
        d dVar2 = new d(this.f903g.getContext(), aVar);
        if (dVar2.t()) {
            this.f909m = dVar2;
            dVar2.k();
            this.f903g.h(dVar2);
            H(true);
            return dVar2;
        }
        return null;
    }

    public void H(boolean z10) {
        x0 q10;
        x0 f10;
        if (z10) {
            U();
        } else {
            O();
        }
        if (T()) {
            if (z10) {
                f10 = this.f902f.q(4, 100L);
                q10 = this.f903g.f(0, 200L);
            } else {
                q10 = this.f902f.q(0, 200L);
                f10 = this.f903g.f(8, 100L);
            }
            androidx.appcompat.view.h hVar = new androidx.appcompat.view.h();
            hVar.d(f10, q10);
            hVar.h();
        } else if (z10) {
            this.f902f.t(4);
            this.f903g.setVisibility(0);
        } else {
            this.f902f.t(0);
            this.f903g.setVisibility(8);
        }
    }

    void J() {
        b.a aVar = this.f911o;
        if (aVar != null) {
            aVar.a(this.f910n);
            this.f910n = null;
            this.f911o = null;
        }
    }

    public void K(boolean z10) {
        View view;
        androidx.appcompat.view.h hVar = this.f921y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f915s == 0 && (this.f922z || z10)) {
            this.f901e.setAlpha(1.0f);
            this.f901e.setTransitioning(true);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            float f10 = -this.f901e.getHeight();
            if (z10) {
                this.f901e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            x0 o10 = p0.e(this.f901e).o(f10);
            o10.m(this.D);
            hVar2.c(o10);
            if (this.f916t && (view = this.f904h) != null) {
                hVar2.c(p0.e(view).o(f10));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f921y = hVar2;
            hVar2.h();
            return;
        }
        this.B.b(null);
    }

    public void L(boolean z10) {
        View view;
        View view2;
        androidx.appcompat.view.h hVar = this.f921y;
        if (hVar != null) {
            hVar.a();
        }
        this.f901e.setVisibility(0);
        if (this.f915s == 0 && (this.f922z || z10)) {
            this.f901e.setTranslationY(0.0f);
            float f10 = -this.f901e.getHeight();
            if (z10) {
                this.f901e.getLocationInWindow(new int[]{0, 0});
                f10 -= r5[1];
            }
            this.f901e.setTranslationY(f10);
            androidx.appcompat.view.h hVar2 = new androidx.appcompat.view.h();
            x0 o10 = p0.e(this.f901e).o(0.0f);
            o10.m(this.D);
            hVar2.c(o10);
            if (this.f916t && (view2 = this.f904h) != null) {
                view2.setTranslationY(f10);
                hVar2.c(p0.e(this.f904h).o(0.0f));
            }
            hVar2.f(F);
            hVar2.e(250L);
            hVar2.g(this.C);
            this.f921y = hVar2;
            hVar2.h();
        } else {
            this.f901e.setAlpha(1.0f);
            this.f901e.setTranslationY(0.0f);
            if (this.f916t && (view = this.f904h) != null) {
                view.setTranslationY(0.0f);
            }
            this.C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f900d;
        if (actionBarOverlayLayout != null) {
            p0.r0(actionBarOverlayLayout);
        }
    }

    public int N() {
        return this.f902f.p();
    }

    public void Q(int i10, int i11) {
        int w10 = this.f902f.w();
        if ((i11 & 4) != 0) {
            this.f908l = true;
        }
        this.f902f.l((i10 & i11) | ((~i11) & w10));
    }

    public void S(boolean z10) {
        if (z10 && !this.f900d.q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.A = z10;
        this.f900d.setHideOnContentScrollEnabled(z10);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f918v) {
            this.f918v = false;
            V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z10) {
        this.f916t = z10;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (!this.f918v) {
            this.f918v = true;
            V(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        androidx.appcompat.view.h hVar = this.f921y;
        if (hVar != null) {
            hVar.a();
            this.f921y = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        androidx.appcompat.widget.i0 i0Var = this.f902f;
        if (i0Var != null && i0Var.k()) {
            this.f902f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f912p) {
            return;
        }
        this.f912p = z10;
        int size = this.f913q.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f913q.get(i10).a(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f902f.w();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f898b == null) {
            TypedValue typedValue = new TypedValue();
            this.f897a.getTheme().resolveAttribute(g.a.f15696g, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f898b = new ContextThemeWrapper(this.f897a, i10);
            } else {
                this.f898b = this.f897a;
            }
        }
        return this.f898b;
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        if (!this.f917u) {
            this.f917u = true;
            V(false);
        }
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        R(androidx.appcompat.view.a.b(this.f897a).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        Menu e10;
        int i11;
        d dVar = this.f909m;
        if (dVar == null || (e10 = dVar.e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i11 = keyEvent.getDeviceId();
        } else {
            i11 = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(i11).getKeyboardType() == 1) {
            z10 = false;
        }
        e10.setQwertyMode(z10);
        return e10.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i10) {
        this.f915s = i10;
    }

    @Override // androidx.appcompat.app.a
    public void r(Drawable drawable) {
        this.f901e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        if (!this.f908l) {
            t(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        int i10;
        if (z10) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        Q(i10, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        int i10;
        if (z10) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        Q(i10, 2);
    }

    @Override // androidx.appcompat.app.a
    public void v(boolean z10) {
        int i10;
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        Q(i10, 8);
    }

    @Override // androidx.appcompat.app.a
    public void w(boolean z10) {
        Q(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void x(float f10) {
        p0.C0(this.f901e, f10);
    }

    @Override // androidx.appcompat.app.a
    public void y(int i10) {
        this.f902f.x(i10);
    }

    @Override // androidx.appcompat.app.a
    public void z(int i10) {
        this.f902f.r(i10);
    }

    public j0(Dialog dialog) {
        P(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
