package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionMenuPresenter.java */
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.b implements b.a {
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private int J;
    private final SparseBooleanArray K;
    e L;
    a M;
    RunnableC0015c N;
    private b O;
    final f P;
    int Q;

    /* renamed from: x  reason: collision with root package name */
    d f1463x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f1464y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1465z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.l {
        public a(Context context, androidx.appcompat.view.menu.r rVar, View view) {
            super(context, rVar, view, false, g.a.f15701l);
            if (!((androidx.appcompat.view.menu.i) rVar.getItem()).l()) {
                View view2 = c.this.f1463x;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.b) c.this).f1068v : view2);
            }
            j(c.this.P);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void e() {
            c cVar = c.this;
            cVar.M = null;
            cVar.Q = 0;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public androidx.appcompat.view.menu.p a() {
            a aVar = c.this.M;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0015c implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private e f1468f;

        public RunnableC0015c(e eVar) {
            this.f1468f = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.b) c.this).f1062p != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1062p.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.b) c.this).f1068v;
            if (view != null && view.getWindowToken() != null && this.f1468f.m()) {
                c.this.L = this.f1468f;
            }
            c.this.N = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter.java */
        /* loaded from: classes.dex */
        class a extends q0 {

            /* renamed from: w  reason: collision with root package name */
            final /* synthetic */ c f1471w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f1471w = cVar;
            }

            @Override // androidx.appcompat.widget.q0
            public androidx.appcompat.view.menu.p b() {
                e eVar = c.this.L;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.q0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.q0
            public boolean d() {
                c cVar = c.this;
                if (cVar.N != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, g.a.f15700k);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            l1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.l {
        public e(Context context, androidx.appcompat.view.menu.g gVar, View view, boolean z10) {
            super(context, gVar, view, z10, g.a.f15701l);
            h(8388613);
            j(c.this.P);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.l
        public void e() {
            if (((androidx.appcompat.view.menu.b) c.this).f1062p != null) {
                ((androidx.appcompat.view.menu.b) c.this).f1062p.close();
            }
            c.this.L = null;
            super.e();
        }
    }

    /* compiled from: ActionMenuPresenter.java */
    /* loaded from: classes.dex */
    private class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
            if (gVar instanceof androidx.appcompat.view.menu.r) {
                gVar.D().e(false);
            }
            m.a m10 = c.this.m();
            if (m10 != null) {
                m10.a(gVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            if (gVar == ((androidx.appcompat.view.menu.b) c.this).f1062p) {
                return false;
            }
            c.this.Q = ((androidx.appcompat.view.menu.r) gVar).getItem().getItemId();
            m.a m10 = c.this.m();
            if (m10 == null) {
                return false;
            }
            return m10.b(gVar);
        }
    }

    public c(Context context) {
        super(context, g.g.f15794c, g.g.f15793b);
        this.K = new SparseBooleanArray();
        this.P = new f();
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1068v;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.f1463x;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1465z) {
            return this.f1464y;
        }
        return null;
    }

    public boolean B() {
        androidx.appcompat.view.menu.n nVar;
        RunnableC0015c runnableC0015c = this.N;
        if (runnableC0015c != null && (nVar = this.f1068v) != null) {
            ((View) nVar).removeCallbacks(runnableC0015c);
            this.N = null;
            return true;
        }
        e eVar = this.L;
        if (eVar != null) {
            eVar.b();
            return true;
        }
        return false;
    }

    public boolean C() {
        a aVar = this.M;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        if (this.N == null && !E()) {
            return false;
        }
        return true;
    }

    public boolean E() {
        e eVar = this.L;
        if (eVar != null && eVar.d()) {
            return true;
        }
        return false;
    }

    public void F(Configuration configuration) {
        if (!this.F) {
            this.E = androidx.appcompat.view.a.b(this.f1061m).d();
        }
        androidx.appcompat.view.menu.g gVar = this.f1062p;
        if (gVar != null) {
            gVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.I = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f1068v = actionMenuView;
        actionMenuView.b(this.f1062p);
    }

    public void I(Drawable drawable) {
        d dVar = this.f1463x;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1465z = true;
        this.f1464y = drawable;
    }

    public void J(boolean z10) {
        this.A = z10;
        this.B = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.g gVar;
        if (this.A && !E() && (gVar = this.f1062p) != null && this.f1068v != null && this.N == null && !gVar.z().isEmpty()) {
            RunnableC0015c runnableC0015c = new RunnableC0015c(new e(this.f1061m, this.f1062p, this.f1463x, true));
            this.N = runnableC0015c;
            ((View) this.f1068v).post(runnableC0015c);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        y();
        super.a(gVar, z10);
    }

    @Override // androidx.appcompat.view.menu.b
    public void c(androidx.appcompat.view.menu.i iVar, n.a aVar) {
        aVar.e(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1068v);
        if (this.O == null) {
            this.O = new b();
        }
        actionMenuItemView.setPopupCallback(this.O);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void d(boolean z10) {
        ArrayList<androidx.appcompat.view.menu.i> arrayList;
        super.d(z10);
        ((View) this.f1068v).requestLayout();
        androidx.appcompat.view.menu.g gVar = this.f1062p;
        boolean z11 = false;
        if (gVar != null) {
            ArrayList<androidx.appcompat.view.menu.i> s10 = gVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s10.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.g gVar2 = this.f1062p;
        if (gVar2 != null) {
            arrayList = gVar2.z();
        } else {
            arrayList = null;
        }
        if (this.A && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z11 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        if (z11) {
            if (this.f1463x == null) {
                this.f1463x = new d(this.f1060f);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1463x.getParent();
            if (viewGroup != this.f1068v) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1463x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1068v;
                actionMenuView.addView(this.f1463x, actionMenuView.F());
            }
        } else {
            d dVar = this.f1463x;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                androidx.appcompat.view.menu.n nVar = this.f1068v;
                if (parent == nVar) {
                    ((ViewGroup) nVar).removeView(this.f1463x);
                }
            }
        }
        ((ActionMenuView) this.f1068v).setOverflowReserved(this.A);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        ArrayList<androidx.appcompat.view.menu.i> arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        c cVar = this;
        androidx.appcompat.view.menu.g gVar = cVar.f1062p;
        View view = null;
        int i14 = 0;
        if (gVar != null) {
            arrayList = gVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i15 = cVar.E;
        int i16 = cVar.D;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f1068v;
        boolean z12 = false;
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < i10; i19++) {
            androidx.appcompat.view.menu.i iVar = arrayList.get(i19);
            if (iVar.o()) {
                i17++;
            } else if (iVar.n()) {
                i18++;
            } else {
                z12 = true;
            }
            if (cVar.I && iVar.isActionViewExpanded()) {
                i15 = 0;
            }
        }
        if (cVar.A && (z12 || i18 + i17 > i15)) {
            i15--;
        }
        int i20 = i15 - i17;
        SparseBooleanArray sparseBooleanArray = cVar.K;
        sparseBooleanArray.clear();
        if (cVar.G) {
            int i21 = cVar.J;
            i12 = i16 / i21;
            i11 = i21 + ((i16 % i21) / i12);
        } else {
            i11 = 0;
            i12 = 0;
        }
        int i22 = 0;
        int i23 = 0;
        while (i22 < i10) {
            androidx.appcompat.view.menu.i iVar2 = arrayList.get(i22);
            if (iVar2.o()) {
                View n10 = cVar.n(iVar2, view, viewGroup);
                if (cVar.G) {
                    i12 -= ActionMenuView.L(n10, i11, i12, makeMeasureSpec, i14);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i16 -= measuredWidth;
                if (i23 == 0) {
                    i23 = measuredWidth;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.u(true);
                i13 = i10;
            } else if (iVar2.n()) {
                int groupId2 = iVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                if ((i20 > 0 || z13) && i16 > 0 && (!cVar.G || i12 > 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z14 = z10;
                i13 = i10;
                if (z10) {
                    View n11 = cVar.n(iVar2, null, viewGroup);
                    if (cVar.G) {
                        int L = ActionMenuView.L(n11, i11, i12, makeMeasureSpec, 0);
                        i12 -= L;
                        if (L == 0) {
                            z14 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z15 = z14;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i16 -= measuredWidth2;
                    if (i23 == 0) {
                        i23 = measuredWidth2;
                    }
                    if (!cVar.G ? i16 + i23 > 0 : i16 >= 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 = z15 & z11;
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i24 = 0; i24 < i22; i24++) {
                        androidx.appcompat.view.menu.i iVar3 = arrayList.get(i24);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.l()) {
                                i20++;
                            }
                            iVar3.u(false);
                        }
                    }
                }
                if (z10) {
                    i20--;
                }
                iVar2.u(z10);
            } else {
                i13 = i10;
                iVar2.u(false);
                i22++;
                view = null;
                cVar = this;
                i10 = i13;
                i14 = 0;
            }
            i22++;
            view = null;
            cVar = this;
            i10 = i13;
            i14 = 0;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public void i(Context context, androidx.appcompat.view.menu.g gVar) {
        super.i(context, gVar);
        Resources resources = context.getResources();
        androidx.appcompat.view.a b10 = androidx.appcompat.view.a.b(context);
        if (!this.B) {
            this.A = b10.h();
        }
        if (!this.H) {
            this.C = b10.c();
        }
        if (!this.F) {
            this.E = b10.d();
        }
        int i10 = this.C;
        if (this.A) {
            if (this.f1463x == null) {
                d dVar = new d(this.f1060f);
                this.f1463x = dVar;
                if (this.f1465z) {
                    dVar.setImageDrawable(this.f1464y);
                    this.f1464y = null;
                    this.f1465z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1463x.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.f1463x.getMeasuredWidth();
        } else {
            this.f1463x = null;
        }
        this.D = i10;
        this.J = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.b, androidx.appcompat.view.menu.m
    public boolean k(androidx.appcompat.view.menu.r rVar) {
        boolean z10 = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.r rVar2 = rVar;
        while (rVar2.e0() != this.f1062p) {
            rVar2 = (androidx.appcompat.view.menu.r) rVar2.e0();
        }
        View z11 = z(rVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.Q = rVar.getItem().getItemId();
        int size = rVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f1061m, rVar, z11);
        this.M = aVar;
        aVar.g(z10);
        this.M.k();
        super.k(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1463x) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.b
    public View n(androidx.appcompat.view.menu.i iVar, View view, ViewGroup viewGroup) {
        int i10;
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.j()) {
            actionView = super.n(iVar, view, viewGroup);
        }
        if (iVar.isActionViewExpanded()) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.b
    public androidx.appcompat.view.menu.n o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.n nVar = this.f1068v;
        androidx.appcompat.view.menu.n o10 = super.o(viewGroup);
        if (nVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.b
    public boolean q(int i10, androidx.appcompat.view.menu.i iVar) {
        return iVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
