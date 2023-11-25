package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.u0;
import androidx.core.view.p0;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {
    private static final int I = g.g.f15804m;
    View A;
    private m.a B;
    ViewTreeObserver C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean H;

    /* renamed from: m  reason: collision with root package name */
    private final Context f1195m;

    /* renamed from: p  reason: collision with root package name */
    private final g f1196p;

    /* renamed from: q  reason: collision with root package name */
    private final f f1197q;

    /* renamed from: r  reason: collision with root package name */
    private final boolean f1198r;

    /* renamed from: s  reason: collision with root package name */
    private final int f1199s;

    /* renamed from: t  reason: collision with root package name */
    private final int f1200t;

    /* renamed from: u  reason: collision with root package name */
    private final int f1201u;

    /* renamed from: v  reason: collision with root package name */
    final u0 f1202v;

    /* renamed from: y  reason: collision with root package name */
    private PopupWindow.OnDismissListener f1205y;

    /* renamed from: z  reason: collision with root package name */
    private View f1206z;

    /* renamed from: w  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1203w = new a();

    /* renamed from: x  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1204x = new b();
    private int G = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.b() && !q.this.f1202v.A()) {
                View view = q.this.A;
                if (view != null && view.isShown()) {
                    q.this.f1202v.c();
                } else {
                    q.this.dismiss();
                }
            }
        }
    }

    public q(Context context, g gVar, View view, int i10, int i11, boolean z10) {
        this.f1195m = context;
        this.f1196p = gVar;
        this.f1198r = z10;
        this.f1197q = new f(gVar, LayoutInflater.from(context), z10, I);
        this.f1200t = i10;
        this.f1201u = i11;
        Resources resources = context.getResources();
        this.f1199s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15728d));
        this.f1206z = view;
        this.f1202v = new u0(context, null, i10, i11);
        gVar.c(this, context);
    }

    private boolean z() {
        View view;
        boolean z10;
        if (b()) {
            return true;
        }
        if (this.D || (view = this.f1206z) == null) {
            return false;
        }
        this.A = view;
        this.f1202v.J(this);
        this.f1202v.K(this);
        this.f1202v.I(true);
        View view2 = this.A;
        if (this.C == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.C = viewTreeObserver;
        if (z10) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1203w);
        }
        view2.addOnAttachStateChangeListener(this.f1204x);
        this.f1202v.C(view2);
        this.f1202v.F(this.G);
        if (!this.E) {
            this.F = k.o(this.f1197q, null, this.f1195m, this.f1199s);
            this.E = true;
        }
        this.f1202v.E(this.F);
        this.f1202v.H(2);
        this.f1202v.G(n());
        this.f1202v.c();
        ListView j10 = this.f1202v.j();
        j10.setOnKeyListener(this);
        if (this.H && this.f1196p.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1195m).inflate(g.g.f15803l, (ViewGroup) j10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1196p.x());
            }
            frameLayout.setEnabled(false);
            j10.addHeaderView(frameLayout, null, false);
        }
        this.f1202v.o(this.f1197q);
        this.f1202v.c();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        if (gVar != this.f1196p) {
            return;
        }
        dismiss();
        m.a aVar = this.B;
        if (aVar != null) {
            aVar.a(gVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        if (!this.D && this.f1202v.b()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void c() {
        if (z()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z10) {
        this.E = false;
        f fVar = this.f1197q;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (b()) {
            this.f1202v.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.B = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f1202v.j();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f1195m, rVar, this.A, this.f1198r, this.f1200t, this.f1201u);
            lVar.j(this.B);
            lVar.g(k.x(rVar));
            lVar.i(this.f1205y);
            this.f1205y = null;
            this.f1196p.e(false);
            int d10 = this.f1202v.d();
            int n10 = this.f1202v.n();
            if ((Gravity.getAbsoluteGravity(this.G, p0.E(this.f1206z)) & 7) == 5) {
                d10 += this.f1206z.getWidth();
            }
            if (lVar.n(d10, n10)) {
                m.a aVar = this.B;
                if (aVar != null) {
                    aVar.b(rVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.D = true;
        this.f1196p.close();
        ViewTreeObserver viewTreeObserver = this.C;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.C = this.A.getViewTreeObserver();
            }
            this.C.removeGlobalOnLayoutListener(this.f1203w);
            this.C = null;
        }
        this.A.removeOnAttachStateChangeListener(this.f1204x);
        PopupWindow.OnDismissListener onDismissListener = this.f1205y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i10 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        this.f1206z = view;
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z10) {
        this.f1197q.d(z10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        this.G = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i10) {
        this.f1202v.f(i10);
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f1205y = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z10) {
        this.H = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i10) {
        this.f1202v.k(i10);
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.C = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.C.removeGlobalOnLayoutListener(qVar.f1203w);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
    }
}
