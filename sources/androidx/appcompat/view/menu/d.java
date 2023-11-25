package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u0;
import androidx.core.view.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int O = g.g.f15796e;
    private View B;
    View C;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private boolean J;
    private m.a K;
    ViewTreeObserver L;
    private PopupWindow.OnDismissListener M;
    boolean N;

    /* renamed from: m  reason: collision with root package name */
    private final Context f1073m;

    /* renamed from: p  reason: collision with root package name */
    private final int f1074p;

    /* renamed from: q  reason: collision with root package name */
    private final int f1075q;

    /* renamed from: r  reason: collision with root package name */
    private final int f1076r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f1077s;

    /* renamed from: t  reason: collision with root package name */
    final Handler f1078t;

    /* renamed from: u  reason: collision with root package name */
    private final List<g> f1079u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    final List<C0013d> f1080v = new ArrayList();

    /* renamed from: w  reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f1081w = new a();

    /* renamed from: x  reason: collision with root package name */
    private final View.OnAttachStateChangeListener f1082x = new b();

    /* renamed from: y  reason: collision with root package name */
    private final t0 f1083y = new c();

    /* renamed from: z  reason: collision with root package name */
    private int f1084z = 0;
    private int A = 0;
    private boolean I = false;
    private int D = D();

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d.this.b() && d.this.f1080v.size() > 0 && !d.this.f1080v.get(0).f1092a.A()) {
                View view = d.this.C;
                if (view != null && view.isShown()) {
                    Iterator<C0013d> it = d.this.f1080v.iterator();
                    while (it.hasNext()) {
                        it.next().f1092a.c();
                    }
                    return;
                }
                d.this.dismiss();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class c implements t0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C0013d f1088f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ MenuItem f1089m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ g f1090p;

            a(C0013d c0013d, MenuItem menuItem, g gVar) {
                this.f1088f = c0013d;
                this.f1089m = menuItem;
                this.f1090p = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0013d c0013d = this.f1088f;
                if (c0013d != null) {
                    d.this.N = true;
                    c0013d.f1093b.e(false);
                    d.this.N = false;
                }
                if (this.f1089m.isEnabled() && this.f1089m.hasSubMenu()) {
                    this.f1090p.L(this.f1089m, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.t0
        public void e(g gVar, MenuItem menuItem) {
            C0013d c0013d = null;
            d.this.f1078t.removeCallbacksAndMessages(null);
            int size = d.this.f1080v.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (gVar == d.this.f1080v.get(i10).f1093b) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                return;
            }
            int i11 = i10 + 1;
            if (i11 < d.this.f1080v.size()) {
                c0013d = d.this.f1080v.get(i11);
            }
            d.this.f1078t.postAtTime(new a(c0013d, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.t0
        public void h(g gVar, MenuItem menuItem) {
            d.this.f1078t.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013d {

        /* renamed from: a  reason: collision with root package name */
        public final u0 f1092a;

        /* renamed from: b  reason: collision with root package name */
        public final g f1093b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1094c;

        public C0013d(u0 u0Var, g gVar, int i10) {
            this.f1092a = u0Var;
            this.f1093b = gVar;
            this.f1094c = i10;
        }

        public ListView a() {
            return this.f1092a.j();
        }
    }

    public d(Context context, View view, int i10, int i11, boolean z10) {
        this.f1073m = context;
        this.B = view;
        this.f1075q = i10;
        this.f1076r = i11;
        this.f1077s = z10;
        Resources resources = context.getResources();
        this.f1074p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(g.d.f15728d));
        this.f1078t = new Handler();
    }

    private int A(g gVar) {
        int size = this.f1080v.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (gVar == this.f1080v.get(i10).f1093b) {
                return i10;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = gVar.getItem(i10);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0013d c0013d, g gVar) {
        f fVar;
        int i10;
        int firstVisiblePosition;
        MenuItem B = B(c0013d.f1093b, gVar);
        if (B == null) {
            return null;
        }
        ListView a10 = c0013d.a();
        ListAdapter adapter = a10.getAdapter();
        int i11 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i10 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i10 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i11 < count) {
                if (B == fVar.getItem(i11)) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 == -1 || (firstVisiblePosition = (i11 + i10) - a10.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= a10.getChildCount()) {
            return null;
        }
        return a10.getChildAt(firstVisiblePosition);
    }

    private int D() {
        if (p0.E(this.B) != 1) {
            return 1;
        }
        return 0;
    }

    private int E(int i10) {
        List<C0013d> list = this.f1080v;
        ListView a10 = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        a10.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.C.getWindowVisibleDisplayFrame(rect);
        if (this.D == 1) {
            if (iArr[0] + a10.getWidth() + i10 <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i10 < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void F(g gVar) {
        C0013d c0013d;
        View view;
        boolean z10;
        int i10;
        int i11;
        int i12;
        LayoutInflater from = LayoutInflater.from(this.f1073m);
        f fVar = new f(gVar, from, this.f1077s, O);
        if (!b() && this.I) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int o10 = k.o(fVar, null, this.f1073m, this.f1074p);
        u0 z11 = z();
        z11.o(fVar);
        z11.E(o10);
        z11.F(this.A);
        if (this.f1080v.size() > 0) {
            List<C0013d> list = this.f1080v;
            c0013d = list.get(list.size() - 1);
            view = C(c0013d, gVar);
        } else {
            c0013d = null;
            view = null;
        }
        if (view != null) {
            z11.U(false);
            z11.R(null);
            int E = E(o10);
            if (E == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.D = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z11.C(view);
                i11 = 0;
                i10 = 0;
            } else {
                int[] iArr = new int[2];
                this.B.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.A & 7) == 5) {
                    iArr[0] = iArr[0] + this.B.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i10 = iArr2[0] - iArr[0];
                i11 = iArr2[1] - iArr[1];
            }
            if ((this.A & 5) == 5) {
                if (!z10) {
                    o10 = view.getWidth();
                    i12 = i10 - o10;
                }
                i12 = i10 + o10;
            } else {
                if (z10) {
                    o10 = view.getWidth();
                    i12 = i10 + o10;
                }
                i12 = i10 - o10;
            }
            z11.f(i12);
            z11.M(true);
            z11.k(i11);
        } else {
            if (this.E) {
                z11.f(this.G);
            }
            if (this.F) {
                z11.k(this.H);
            }
            z11.G(n());
        }
        this.f1080v.add(new C0013d(z11, gVar, this.D));
        z11.c();
        ListView j10 = z11.j();
        j10.setOnKeyListener(this);
        if (c0013d == null && this.J && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(g.g.f15803l, (ViewGroup) j10, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            j10.addHeaderView(frameLayout, null, false);
            z11.c();
        }
    }

    private u0 z() {
        u0 u0Var = new u0(this.f1073m, null, this.f1075q, this.f1076r);
        u0Var.T(this.f1083y);
        u0Var.K(this);
        u0Var.J(this);
        u0Var.C(this.B);
        u0Var.F(this.A);
        u0Var.I(true);
        u0Var.H(2);
        return u0Var;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z10) {
        int A = A(gVar);
        if (A < 0) {
            return;
        }
        int i10 = A + 1;
        if (i10 < this.f1080v.size()) {
            this.f1080v.get(i10).f1093b.e(false);
        }
        C0013d remove = this.f1080v.remove(A);
        remove.f1093b.O(this);
        if (this.N) {
            remove.f1092a.S(null);
            remove.f1092a.D(0);
        }
        remove.f1092a.dismiss();
        int size = this.f1080v.size();
        if (size > 0) {
            this.D = this.f1080v.get(size - 1).f1094c;
        } else {
            this.D = D();
        }
        if (size == 0) {
            dismiss();
            m.a aVar = this.K;
            if (aVar != null) {
                aVar.a(gVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.L;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.L.removeGlobalOnLayoutListener(this.f1081w);
                }
                this.L = null;
            }
            this.C.removeOnAttachStateChangeListener(this.f1082x);
            this.M.onDismiss();
        } else if (z10) {
            this.f1080v.get(0).f1093b.e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        if (this.f1080v.size() <= 0 || !this.f1080v.get(0).f1092a.b()) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void c() {
        boolean z10;
        if (b()) {
            return;
        }
        Iterator<g> it = this.f1079u.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.f1079u.clear();
        View view = this.B;
        this.C = view;
        if (view != null) {
            if (this.L == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.L = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1081w);
            }
            this.C.addOnAttachStateChangeListener(this.f1082x);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z10) {
        Iterator<C0013d> it = this.f1080v.iterator();
        while (it.hasNext()) {
            k.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f1080v.size();
        if (size > 0) {
            C0013d[] c0013dArr = (C0013d[]) this.f1080v.toArray(new C0013d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                C0013d c0013d = c0013dArr[i10];
                if (c0013d.f1092a.b()) {
                    c0013d.f1092a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.K = aVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        if (this.f1080v.isEmpty()) {
            return null;
        }
        return this.f1080v.get(r0.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        for (C0013d c0013d : this.f1080v) {
            if (rVar == c0013d.f1093b) {
                c0013d.a().requestFocus();
                return true;
            }
        }
        if (rVar.hasVisibleItems()) {
            l(rVar);
            m.a aVar = this.K;
            if (aVar != null) {
                aVar.b(rVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public void l(g gVar) {
        gVar.c(this, this.f1073m);
        if (b()) {
            F(gVar);
        } else {
            this.f1079u.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0013d c0013d;
        int size = this.f1080v.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                c0013d = this.f1080v.get(i10);
                if (!c0013d.f1092a.b()) {
                    break;
                }
                i10++;
            } else {
                c0013d = null;
                break;
            }
        }
        if (c0013d != null) {
            c0013d.f1093b.e(false);
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
        if (this.B != view) {
            this.B = view;
            this.A = androidx.core.view.p.b(this.f1084z, p0.E(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z10) {
        this.I = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i10) {
        if (this.f1084z != i10) {
            this.f1084z = i10;
            this.A = androidx.core.view.p.b(i10, p0.E(this.B));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i10) {
        this.E = true;
        this.G = i10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.M = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z10) {
        this.J = z10;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i10) {
        this.F = true;
        this.H = i10;
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.L;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.L = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.L.removeGlobalOnLayoutListener(dVar.f1081w);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
