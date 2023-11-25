package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.u {
    int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private y0 G;
    private int H;
    private int I;
    private int J;
    private CharSequence K;
    private CharSequence L;
    private ColorStateList M;
    private ColorStateList N;
    private boolean O;
    private boolean P;
    private final ArrayList<View> Q;
    private final ArrayList<View> R;
    private final int[] S;
    final androidx.core.view.x T;
    private ArrayList<MenuItem> U;
    h V;
    private final ActionMenuView.e W;

    /* renamed from: a0  reason: collision with root package name */
    private k1 f1374a0;

    /* renamed from: b0  reason: collision with root package name */
    private androidx.appcompat.widget.c f1375b0;

    /* renamed from: c0  reason: collision with root package name */
    private f f1376c0;

    /* renamed from: d0  reason: collision with root package name */
    private m.a f1377d0;

    /* renamed from: e0  reason: collision with root package name */
    g.a f1378e0;

    /* renamed from: f  reason: collision with root package name */
    ActionMenuView f1379f;

    /* renamed from: f0  reason: collision with root package name */
    private boolean f1380f0;

    /* renamed from: g0  reason: collision with root package name */
    private OnBackInvokedCallback f1381g0;

    /* renamed from: h0  reason: collision with root package name */
    private OnBackInvokedDispatcher f1382h0;

    /* renamed from: i0  reason: collision with root package name */
    private boolean f1383i0;

    /* renamed from: j0  reason: collision with root package name */
    private final Runnable f1384j0;

    /* renamed from: m  reason: collision with root package name */
    private TextView f1385m;

    /* renamed from: p  reason: collision with root package name */
    private TextView f1386p;

    /* renamed from: q  reason: collision with root package name */
    private ImageButton f1387q;

    /* renamed from: r  reason: collision with root package name */
    private ImageView f1388r;

    /* renamed from: s  reason: collision with root package name */
    private Drawable f1389s;

    /* renamed from: t  reason: collision with root package name */
    private CharSequence f1390t;

    /* renamed from: u  reason: collision with root package name */
    ImageButton f1391u;

    /* renamed from: v  reason: collision with root package name */
    View f1392v;

    /* renamed from: w  reason: collision with root package name */
    private Context f1393w;

    /* renamed from: x  reason: collision with root package name */
    private int f1394x;

    /* renamed from: y  reason: collision with root package name */
    private int f1395y;

    /* renamed from: z  reason: collision with root package name */
    private int f1396z;

    /* loaded from: classes.dex */
    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.T.j(menuItem)) {
                return true;
            }
            h hVar = Toolbar.this.V;
            if (hVar != null) {
                return hVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.f1378e0;
            if (aVar != null && aVar.a(gVar, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.f1379f.J()) {
                Toolbar.this.T.k(gVar);
            }
            g.a aVar = Toolbar.this.f1378e0;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: androidx.appcompat.widget.j1
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.R);
    }

    private int C(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q10, max + measuredWidth, view.getMeasuredHeight() + q10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    private int D(View view, int i10, int[] iArr, int i11) {
        g gVar = (g) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int q10 = q(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q10, max, view.getMeasuredHeight() + q10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    private int E(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void F(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.T.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.U = currentMenuItems2;
    }

    private void H() {
        removeCallbacks(this.f1384j0);
        post(this.f1384j0);
    }

    private boolean O() {
        if (!this.f1380f0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean P(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    private void b(List<View> list, int i10) {
        boolean z10;
        if (androidx.core.view.p0.E(this) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int childCount = getChildCount();
        int b10 = androidx.core.view.p.b(i10, androidx.core.view.p0.E(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f1406b == 0 && P(childAt) && p(gVar.f763a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt2 = getChildAt(i12);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f1406b == 0 && P(childAt2) && p(gVar2.f763a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        g gVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            gVar = generateLayoutParams(layoutParams);
        } else {
            gVar = (g) layoutParams;
        }
        gVar.f1406b = 1;
        if (z10 && this.f1392v != null) {
            view.setLayoutParams(gVar);
            this.R.add(view);
            return;
        }
        addView(view, gVar);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private void h() {
        if (this.G == null) {
            this.G = new y0();
        }
    }

    private void i() {
        if (this.f1388r == null) {
            this.f1388r = new AppCompatImageView(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1379f.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1379f.getMenu();
            if (this.f1376c0 == null) {
                this.f1376c0 = new f();
            }
            this.f1379f.setExpandedActionViewsExclusive(true);
            gVar.c(this.f1376c0, this.f1393w);
            R();
        }
    }

    private void k() {
        if (this.f1379f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1379f = actionMenuView;
            actionMenuView.setPopupTheme(this.f1394x);
            this.f1379f.setOnMenuItemClickListener(this.W);
            this.f1379f.O(this.f1377d0, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f763a = (this.A & 112) | 8388613;
            this.f1379f.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1379f, false);
        }
    }

    private void l() {
        if (this.f1387q == null) {
            this.f1387q = new n(getContext(), null, g.a.Q);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f763a = (this.A & 112) | 8388611;
            this.f1387q.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int p(int i10) {
        int E = androidx.core.view.p0.E(this);
        int b10 = androidx.core.view.p.b(i10, E) & 7;
        if (b10 != 1 && b10 != 3 && b10 != 5) {
            if (E != 1) {
                return 3;
            }
            return 5;
        }
        return b10;
    }

    private int q(View view, int i10) {
        int i11;
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int r10 = r(gVar.f763a);
        if (r10 != 48) {
            if (r10 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i13 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                if (i12 < i13) {
                    i12 = i13;
                } else {
                    int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                    int i15 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    if (i14 < i15) {
                        i12 = Math.max(0, i12 - (i15 - i14));
                    }
                }
                return paddingTop + i12;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    private int r(int i10) {
        int i11 = i10 & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            return this.J & 112;
        }
        return i11;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.s.b(marginLayoutParams) + androidx.core.view.s.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            g gVar = (g) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    private boolean z(View view) {
        if (view.getParent() != this && !this.R.contains(view)) {
            return false;
        }
        return true;
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null && actionMenuView.I()) {
            return true;
        }
        return false;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null && actionMenuView.J()) {
            return true;
        }
        return false;
    }

    void I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f1406b != 2 && childAt != this.f1379f) {
                removeViewAt(childCount);
                this.R.add(childAt);
            }
        }
    }

    public void J(int i10, int i11) {
        h();
        this.G.g(i10, i11);
    }

    public void K(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f1379f == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g N = this.f1379f.N();
        if (N == gVar) {
            return;
        }
        if (N != null) {
            N.O(this.f1375b0);
            N.O(this.f1376c0);
        }
        if (this.f1376c0 == null) {
            this.f1376c0 = new f();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.f1393w);
            gVar.c(this.f1376c0, this.f1393w);
        } else {
            cVar.i(this.f1393w, null);
            this.f1376c0.i(this.f1393w, null);
            cVar.d(true);
            this.f1376c0.d(true);
        }
        this.f1379f.setPopupTheme(this.f1394x);
        this.f1379f.setPresenter(cVar);
        this.f1375b0 = cVar;
        R();
    }

    public void L(m.a aVar, g.a aVar2) {
        this.f1377d0 = aVar;
        this.f1378e0 = aVar2;
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void M(Context context, int i10) {
        this.f1396z = i10;
        TextView textView = this.f1386p;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void N(Context context, int i10) {
        this.f1395y = i10;
        TextView textView = this.f1385m;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean Q() {
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null && actionMenuView.P()) {
            return true;
        }
        return false;
    }

    void R() {
        boolean z10;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = e.a(this);
            if (v() && a10 != null && androidx.core.view.p0.X(this) && this.f1383i0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && this.f1382h0 == null) {
                if (this.f1381g0 == null) {
                    this.f1381g0 = e.b(new Runnable() { // from class: androidx.appcompat.widget.i1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.e();
                        }
                    });
                }
                e.c(a10, this.f1381g0);
                this.f1382h0 = a10;
            } else if (!z10 && (onBackInvokedDispatcher = this.f1382h0) != null) {
                e.d(onBackInvokedDispatcher, this.f1381g0);
                this.f1382h0 = null;
            }
        }
    }

    void a() {
        for (int size = this.R.size() - 1; size >= 0; size--) {
            addView(this.R.get(size));
        }
        this.R.clear();
    }

    @Override // androidx.core.view.u
    public void addMenuProvider(androidx.core.view.a0 a0Var) {
        this.T.c(a0Var);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof g)) {
            return true;
        }
        return false;
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        if (getVisibility() == 0 && (actionMenuView = this.f1379f) != null && actionMenuView.K()) {
            return true;
        }
        return false;
    }

    public void e() {
        androidx.appcompat.view.menu.i iVar;
        f fVar = this.f1376c0;
        if (fVar == null) {
            iVar = null;
        } else {
            iVar = fVar.f1404m;
        }
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.f1391u == null) {
            n nVar = new n(getContext(), null, g.a.Q);
            this.f1391u = nVar;
            nVar.setImageDrawable(this.f1389s);
            this.f1391u.setContentDescription(this.f1390t);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f763a = (this.A & 112) | 8388611;
            generateDefaultLayoutParams.f1406b = 2;
            this.f1391u.setLayoutParams(generateDefaultLayoutParams);
            this.f1391u.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1391u;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1391u;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        y0 y0Var = this.G;
        if (y0Var != null) {
            return y0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.I;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        y0 y0Var = this.G;
        if (y0Var != null) {
            return y0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        y0 y0Var = this.G;
        if (y0Var != null) {
            return y0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        y0 y0Var = this.G;
        if (y0Var != null) {
            return y0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.H;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z10;
        androidx.appcompat.view.menu.g N;
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null && (N = actionMenuView.N()) != null && N.hasVisibleItems()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.max(getContentInsetEnd(), Math.max(this.I, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (androidx.core.view.p0.E(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (androidx.core.view.p0.E(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.H, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1388r;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1388r;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1379f.getMenu();
    }

    View getNavButtonView() {
        return this.f1387q;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1387q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1387q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f1375b0;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1379f.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1393w;
    }

    public int getPopupTheme() {
        return this.f1394x;
    }

    public CharSequence getSubtitle() {
        return this.L;
    }

    final TextView getSubtitleTextView() {
        return this.f1386p;
    }

    public CharSequence getTitle() {
        return this.K;
    }

    public int getTitleMarginBottom() {
        return this.F;
    }

    public int getTitleMarginEnd() {
        return this.D;
    }

    public int getTitleMarginStart() {
        return this.C;
    }

    public int getTitleMarginTop() {
        return this.E;
    }

    final TextView getTitleTextView() {
        return this.f1385m;
    }

    public i0 getWrapper() {
        if (this.f1374a0 == null) {
            this.f1374a0 = new k1(this, true);
        }
        return this.f1374a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m  reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof a.C0010a) {
            return new g((a.C0010a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new g(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1384j0);
        R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.P = false;
        }
        if (!this.P) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.P = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.P = false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:105:0x029f A[LOOP:0: B:104:0x029d->B:105:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c1 A[LOOP:1: B:107:0x02bf->B:108:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fa A[LOOP:2: B:116:0x02f8->B:117:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.S;
        boolean b10 = r1.b(this);
        int i19 = 0;
        int i20 = !b10 ? 1 : 0;
        if (P(this.f1387q)) {
            F(this.f1387q, i10, 0, i11, 0, this.B);
            i12 = this.f1387q.getMeasuredWidth() + s(this.f1387q);
            i13 = Math.max(0, this.f1387q.getMeasuredHeight() + t(this.f1387q));
            i14 = View.combineMeasuredStates(0, this.f1387q.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        if (P(this.f1391u)) {
            F(this.f1391u, i10, 0, i11, 0, this.B);
            i12 = this.f1391u.getMeasuredWidth() + s(this.f1391u);
            i13 = Math.max(i13, this.f1391u.getMeasuredHeight() + t(this.f1391u));
            i14 = View.combineMeasuredStates(i14, this.f1391u.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i12);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i12);
        if (P(this.f1379f)) {
            F(this.f1379f, i10, max, i11, 0, this.B);
            i15 = this.f1379f.getMeasuredWidth() + s(this.f1379f);
            i13 = Math.max(i13, this.f1379f.getMeasuredHeight() + t(this.f1379f));
            i14 = View.combineMeasuredStates(i14, this.f1379f.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i20] = Math.max(0, currentContentInsetEnd - i15);
        if (P(this.f1392v)) {
            max2 += E(this.f1392v, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1392v.getMeasuredHeight() + t(this.f1392v));
            i14 = View.combineMeasuredStates(i14, this.f1392v.getMeasuredState());
        }
        if (P(this.f1388r)) {
            max2 += E(this.f1388r, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1388r.getMeasuredHeight() + t(this.f1388r));
            i14 = View.combineMeasuredStates(i14, this.f1388r.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((g) childAt.getLayoutParams()).f1406b == 0 && P(childAt)) {
                max2 += E(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + t(childAt));
                i14 = View.combineMeasuredStates(i14, childAt.getMeasuredState());
            }
        }
        int i22 = this.E + this.F;
        int i23 = this.C + this.D;
        if (P(this.f1385m)) {
            E(this.f1385m, i10, max2 + i23, i11, i22, iArr);
            int measuredWidth = this.f1385m.getMeasuredWidth() + s(this.f1385m);
            i18 = this.f1385m.getMeasuredHeight() + t(this.f1385m);
            i16 = View.combineMeasuredStates(i14, this.f1385m.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = i14;
            i17 = 0;
            i18 = 0;
        }
        if (P(this.f1386p)) {
            i17 = Math.max(i17, E(this.f1386p, i10, max2 + i23, i11, i18 + i22, iArr));
            i18 += this.f1386p.getMeasuredHeight() + t(this.f1386p);
            i16 = View.combineMeasuredStates(i16, this.f1386p.getMeasuredState());
        }
        int max3 = Math.max(i13, i18);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, (-16777216) & i16);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i16 << 16);
        if (!O()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.g gVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null) {
            gVar = actionMenuView.N();
        } else {
            gVar = null;
        }
        int i10 = savedState.f1397p;
        if (i10 != 0 && this.f1376c0 != null && gVar != null && (findItem = gVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f1398q) {
            H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        y0 y0Var = this.G;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        y0Var.f(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.f1376c0;
        if (fVar != null && (iVar = fVar.f1404m) != null) {
            savedState.f1397p = iVar.getItemId();
        }
        savedState.f1398q = B();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O = false;
        }
        if (!this.O) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.O = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.O = false;
        }
        return true;
    }

    @Override // androidx.core.view.u
    public void removeMenuProvider(androidx.core.view.a0 a0Var) {
        this.T.l(a0Var);
    }

    public void setBackInvokedCallbackEnabled(boolean z10) {
        if (this.f1383i0 != z10) {
            this.f1383i0 = z10;
            R();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(h.a.b(getContext(), i10));
    }

    public void setCollapsible(boolean z10) {
        this.f1380f0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.I) {
            this.I = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i10 != this.H) {
            this.H = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(h.a.b(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(h.a.b(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1387q.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
        this.V = hVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1379f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.f1394x != i10) {
            this.f1394x = i10;
            if (i10 == 0) {
                this.f1393w = getContext();
            } else {
                this.f1393w = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.F = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.D = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.C = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.E = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public boolean v() {
        f fVar = this.f1376c0;
        if (fVar != null && fVar.f1404m != null) {
            return true;
        }
        return false;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1379f;
        if (actionMenuView != null && actionMenuView.H()) {
            return true;
        }
        return false;
    }

    public void x(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void y() {
        Iterator<MenuItem> it = this.U.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        G();
    }

    /* loaded from: classes.dex */
    public static class g extends a.C0010a {

        /* renamed from: b  reason: collision with root package name */
        int f1406b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1406b = 0;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i10, int i11) {
            super(i10, i11);
            this.f1406b = 0;
            this.f763a = 8388627;
        }

        public g(g gVar) {
            super((a.C0010a) gVar);
            this.f1406b = 0;
            this.f1406b = gVar.f1406b;
        }

        public g(a.C0010a c0010a) {
            super(c0010a);
            this.f1406b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1406b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1406b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.J = 8388627;
        this.Q = new ArrayList<>();
        this.R = new ArrayList<>();
        this.S = new int[2];
        this.T = new androidx.core.view.x(new Runnable() { // from class: androidx.appcompat.widget.h1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.y();
            }
        });
        this.U = new ArrayList<>();
        this.W = new a();
        this.f1384j0 = new b();
        Context context2 = getContext();
        int[] iArr = g.j.f15903n3;
        g1 v10 = g1.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.p0.s0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1395y = v10.n(g.j.P3, 0);
        this.f1396z = v10.n(g.j.G3, 0);
        this.J = v10.l(g.j.f15908o3, this.J);
        this.A = v10.l(g.j.f15913p3, 48);
        int e10 = v10.e(g.j.J3, 0);
        int i11 = g.j.O3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.F = e10;
        this.E = e10;
        this.D = e10;
        this.C = e10;
        int e11 = v10.e(g.j.M3, -1);
        if (e11 >= 0) {
            this.C = e11;
        }
        int e12 = v10.e(g.j.L3, -1);
        if (e12 >= 0) {
            this.D = e12;
        }
        int e13 = v10.e(g.j.N3, -1);
        if (e13 >= 0) {
            this.E = e13;
        }
        int e14 = v10.e(g.j.K3, -1);
        if (e14 >= 0) {
            this.F = e14;
        }
        this.B = v10.f(g.j.A3, -1);
        int e15 = v10.e(g.j.f15948w3, RecyclerView.UNDEFINED_DURATION);
        int e16 = v10.e(g.j.f15928s3, RecyclerView.UNDEFINED_DURATION);
        int f10 = v10.f(g.j.f15938u3, 0);
        int f11 = v10.f(g.j.f15943v3, 0);
        h();
        this.G.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.G.g(e15, e16);
        }
        this.H = v10.e(g.j.f15953x3, RecyclerView.UNDEFINED_DURATION);
        this.I = v10.e(g.j.f15933t3, RecyclerView.UNDEFINED_DURATION);
        this.f1389s = v10.g(g.j.f15923r3);
        this.f1390t = v10.p(g.j.f15918q3);
        CharSequence p10 = v10.p(g.j.I3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(g.j.F3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.f1393w = getContext();
        setPopupTheme(v10.n(g.j.E3, 0));
        Drawable g10 = v10.g(g.j.D3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(g.j.C3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(g.j.f15958y3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(g.j.f15963z3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = g.j.Q3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = g.j.H3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = g.j.B3;
        if (v10.s(i14)) {
            x(v10.n(i14, 0));
        }
        v10.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f1391u;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f1391u.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1391u;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1389s);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!z(this.f1388r)) {
                c(this.f1388r, true);
            }
        } else {
            ImageView imageView = this.f1388r;
            if (imageView != null && z(imageView)) {
                removeView(this.f1388r);
                this.R.remove(this.f1388r);
            }
        }
        ImageView imageView2 = this.f1388r;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1388r;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1387q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            l1.a(this.f1387q, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!z(this.f1387q)) {
                c(this.f1387q, true);
            }
        } else {
            ImageButton imageButton = this.f1387q;
            if (imageButton != null && z(imageButton)) {
                removeView(this.f1387q);
                this.R.remove(this.f1387q);
            }
        }
        ImageButton imageButton2 = this.f1387q;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1386p == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.f1386p = b0Var;
                b0Var.setSingleLine();
                this.f1386p.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1396z;
                if (i10 != 0) {
                    this.f1386p.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.N;
                if (colorStateList != null) {
                    this.f1386p.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1386p)) {
                c(this.f1386p, true);
            }
        } else {
            TextView textView = this.f1386p;
            if (textView != null && z(textView)) {
                removeView(this.f1386p);
                this.R.remove(this.f1386p);
            }
        }
        TextView textView2 = this.f1386p;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.L = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.N = colorStateList;
        TextView textView = this.f1386p;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1385m == null) {
                Context context = getContext();
                b0 b0Var = new b0(context);
                this.f1385m = b0Var;
                b0Var.setSingleLine();
                this.f1385m.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1395y;
                if (i10 != 0) {
                    this.f1385m.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.M;
                if (colorStateList != null) {
                    this.f1385m.setTextColor(colorStateList);
                }
            }
            if (!z(this.f1385m)) {
                c(this.f1385m, true);
            }
        } else {
            TextView textView = this.f1385m;
            if (textView != null && z(textView)) {
                removeView(this.f1385m);
                this.R.remove(this.f1385m);
            }
        }
        TextView textView2 = this.f1385m;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.K = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        TextView textView = this.f1385m;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: p  reason: collision with root package name */
        int f1397p;

        /* renamed from: q  reason: collision with root package name */
        boolean f1398q;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b  reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c  reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1397p = parcel.readInt();
            this.f1398q = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1397p);
            parcel.writeInt(this.f1398q ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements androidx.appcompat.view.menu.m {

        /* renamed from: f  reason: collision with root package name */
        androidx.appcompat.view.menu.g f1403f;

        /* renamed from: m  reason: collision with root package name */
        androidx.appcompat.view.menu.i f1404m;

        f() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(boolean z10) {
            if (this.f1404m != null) {
                androidx.appcompat.view.menu.g gVar = this.f1403f;
                boolean z11 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1403f.getItem(i10) == this.f1404m) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (!z11) {
                    f(this.f1403f, this.f1404m);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            View view = Toolbar.this.f1392v;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1392v);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1391u);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1392v = null;
            toolbar3.a();
            this.f1404m = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f1391u.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1391u);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1391u);
            }
            Toolbar.this.f1392v = iVar.getActionView();
            this.f1404m = iVar;
            ViewParent parent2 = Toolbar.this.f1392v.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1392v);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f763a = (toolbar4.A & 112) | 8388611;
                generateDefaultLayoutParams.f1406b = 2;
                toolbar4.f1392v.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1392v);
            }
            Toolbar.this.I();
            Toolbar.this.requestLayout();
            iVar.r(true);
            View view = Toolbar.this.f1392v;
            if (view instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) view).c();
            }
            Toolbar.this.R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public void i(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1403f;
            if (gVar2 != null && (iVar = this.f1404m) != null) {
                gVar2.f(iVar);
            }
            this.f1403f = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean k(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z10) {
        }
    }
}
