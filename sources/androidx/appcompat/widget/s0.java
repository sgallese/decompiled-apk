package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public class s0 implements androidx.appcompat.view.menu.p {
    private static Method T;
    private static Method U;
    private static Method V;
    private boolean A;
    int B;
    private View C;
    private int D;
    private DataSetObserver E;
    private View F;
    private Drawable G;
    private AdapterView.OnItemClickListener H;
    private AdapterView.OnItemSelectedListener I;
    final i J;
    private final h K;
    private final g L;
    private final e M;
    private Runnable N;
    final Handler O;
    private final Rect P;
    private Rect Q;
    private boolean R;
    PopupWindow S;

    /* renamed from: f  reason: collision with root package name */
    private Context f1667f;

    /* renamed from: m  reason: collision with root package name */
    private ListAdapter f1668m;

    /* renamed from: p  reason: collision with root package name */
    o0 f1669p;

    /* renamed from: q  reason: collision with root package name */
    private int f1670q;

    /* renamed from: r  reason: collision with root package name */
    private int f1671r;

    /* renamed from: s  reason: collision with root package name */
    private int f1672s;

    /* renamed from: t  reason: collision with root package name */
    private int f1673t;

    /* renamed from: u  reason: collision with root package name */
    private int f1674u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1675v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1676w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f1677x;

    /* renamed from: y  reason: collision with root package name */
    private int f1678y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f1679z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View s10 = s0.this.s();
            if (s10 != null && s10.getWindowToken() != null) {
                s0.this.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class c {
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public static class d {
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (s0.this.b()) {
                s0.this.c();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            s0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = s0.this.S) != null && popupWindow.isShowing() && x10 >= 0 && x10 < s0.this.S.getWidth() && y10 >= 0 && y10 < s0.this.S.getHeight()) {
                s0 s0Var = s0.this;
                s0Var.O.postDelayed(s0Var.J, 250L);
                return false;
            } else if (action == 1) {
                s0 s0Var2 = s0.this;
                s0Var2.O.removeCallbacks(s0Var2.J);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0 o0Var = s0.this.f1669p;
            if (o0Var != null && androidx.core.view.p0.X(o0Var) && s0.this.f1669p.getCount() > s0.this.f1669p.getChildCount()) {
                int childCount = s0.this.f1669p.getChildCount();
                s0 s0Var = s0.this;
                if (childCount <= s0Var.B) {
                    s0Var.S.setInputMethodMode(2);
                    s0.this.c();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                T = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                V = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                U = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public s0(Context context) {
        this(context, null, g.a.G);
    }

    private void B() {
        View view = this.C;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.C);
            }
        }
    }

    private void N(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = T;
            if (method != null) {
                try {
                    method.invoke(this.S, Boolean.valueOf(z10));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        d.b(this.S, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int p() {
        int i10;
        int i11;
        int makeMeasureSpec;
        int i12;
        boolean z10 = true;
        if (this.f1669p == null) {
            Context context = this.f1667f;
            this.N = new a();
            o0 r10 = r(context, !this.R);
            this.f1669p = r10;
            Drawable drawable = this.G;
            if (drawable != null) {
                r10.setSelector(drawable);
            }
            this.f1669p.setAdapter(this.f1668m);
            this.f1669p.setOnItemClickListener(this.H);
            this.f1669p.setFocusable(true);
            this.f1669p.setFocusableInTouchMode(true);
            this.f1669p.setOnItemSelectedListener(new b());
            this.f1669p.setOnScrollListener(this.L);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.I;
            if (onItemSelectedListener != null) {
                this.f1669p.setOnItemSelectedListener(onItemSelectedListener);
            }
            o0 o0Var = this.f1669p;
            View view = this.C;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.D;
                if (i13 != 0) {
                    if (i13 != 1) {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.D);
                    } else {
                        linearLayout.addView(o0Var, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(o0Var, layoutParams);
                }
                int i14 = this.f1671r;
                if (i14 >= 0) {
                    i12 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i10 = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                o0Var = linearLayout;
            } else {
                i10 = 0;
            }
            this.S.setContentView(o0Var);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.S.getContentView();
            View view2 = this.C;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i10 = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i10 = 0;
            }
        }
        Drawable background = this.S.getBackground();
        if (background != null) {
            background.getPadding(this.P);
            Rect rect = this.P;
            int i15 = rect.top;
            i11 = rect.bottom + i15;
            if (!this.f1675v) {
                this.f1673t = -i15;
            }
        } else {
            this.P.setEmpty();
            i11 = 0;
        }
        if (this.S.getInputMethodMode() != 2) {
            z10 = false;
        }
        int t10 = t(s(), this.f1673t, z10);
        if (!this.f1679z && this.f1670q != -1) {
            int i16 = this.f1671r;
            if (i16 != -2) {
                if (i16 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                } else {
                    int i17 = this.f1667f.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.P;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i18 = this.f1667f.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.P;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i18 - (rect3.left + rect3.right), RecyclerView.UNDEFINED_DURATION);
            }
            int d10 = this.f1669p.d(makeMeasureSpec, 0, -1, t10 - i10, -1);
            if (d10 > 0) {
                i10 += i11 + this.f1669p.getPaddingTop() + this.f1669p.getPaddingBottom();
            }
            return d10 + i10;
        }
        return t10 + i11;
    }

    private int t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = U;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.S, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.S.getMaxAvailableHeight(view, i10);
        }
        return c.a(this.S, view, i10, z10);
    }

    public boolean A() {
        return this.R;
    }

    public void C(View view) {
        this.F = view;
    }

    public void D(int i10) {
        this.S.setAnimationStyle(i10);
    }

    public void E(int i10) {
        Drawable background = this.S.getBackground();
        if (background != null) {
            background.getPadding(this.P);
            Rect rect = this.P;
            this.f1671r = rect.left + rect.right + i10;
            return;
        }
        Q(i10);
    }

    public void F(int i10) {
        this.f1678y = i10;
    }

    public void G(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.Q = rect2;
    }

    public void H(int i10) {
        this.S.setInputMethodMode(i10);
    }

    public void I(boolean z10) {
        this.R = z10;
        this.S.setFocusable(z10);
    }

    public void J(PopupWindow.OnDismissListener onDismissListener) {
        this.S.setOnDismissListener(onDismissListener);
    }

    public void K(AdapterView.OnItemClickListener onItemClickListener) {
        this.H = onItemClickListener;
    }

    public void L(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.I = onItemSelectedListener;
    }

    public void M(boolean z10) {
        this.f1677x = true;
        this.f1676w = z10;
    }

    public void O(int i10) {
        this.D = i10;
    }

    public void P(int i10) {
        o0 o0Var = this.f1669p;
        if (b() && o0Var != null) {
            o0Var.setListSelectionHidden(false);
            o0Var.setSelection(i10);
            if (o0Var.getChoiceMode() != 0) {
                o0Var.setItemChecked(i10, true);
            }
        }
    }

    public void Q(int i10) {
        this.f1671r = i10;
    }

    public void a(Drawable drawable) {
        this.S.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.p
    public void c() {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int p10 = p();
        boolean z11 = z();
        androidx.core.widget.h.b(this.S, this.f1674u);
        boolean z12 = true;
        if (this.S.isShowing()) {
            if (!androidx.core.view.p0.X(s())) {
                return;
            }
            int i14 = this.f1671r;
            if (i14 == -1) {
                i14 = -1;
            } else if (i14 == -2) {
                i14 = s().getWidth();
            }
            int i15 = this.f1670q;
            if (i15 == -1) {
                if (!z11) {
                    p10 = -1;
                }
                if (z11) {
                    PopupWindow popupWindow = this.S;
                    if (this.f1671r == -1) {
                        i13 = -1;
                    } else {
                        i13 = 0;
                    }
                    popupWindow.setWidth(i13);
                    this.S.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.S;
                    if (this.f1671r == -1) {
                        i12 = -1;
                    } else {
                        i12 = 0;
                    }
                    popupWindow2.setWidth(i12);
                    this.S.setHeight(-1);
                }
            } else if (i15 != -2) {
                p10 = i15;
            }
            PopupWindow popupWindow3 = this.S;
            if (this.A || this.f1679z) {
                z12 = false;
            }
            popupWindow3.setOutsideTouchable(z12);
            PopupWindow popupWindow4 = this.S;
            View s10 = s();
            int i16 = this.f1672s;
            int i17 = this.f1673t;
            if (i14 < 0) {
                i10 = -1;
            } else {
                i10 = i14;
            }
            if (p10 < 0) {
                i11 = -1;
            } else {
                i11 = p10;
            }
            popupWindow4.update(s10, i16, i17, i10, i11);
            return;
        }
        int i18 = this.f1671r;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = s().getWidth();
        }
        int i19 = this.f1670q;
        if (i19 == -1) {
            p10 = -1;
        } else if (i19 != -2) {
            p10 = i19;
        }
        this.S.setWidth(i18);
        this.S.setHeight(p10);
        N(true);
        PopupWindow popupWindow5 = this.S;
        if (!this.A && !this.f1679z) {
            z10 = true;
        } else {
            z10 = false;
        }
        popupWindow5.setOutsideTouchable(z10);
        this.S.setTouchInterceptor(this.K);
        if (this.f1677x) {
            androidx.core.widget.h.a(this.S, this.f1676w);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = V;
            if (method != null) {
                try {
                    method.invoke(this.S, this.Q);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.a(this.S, this.Q);
        }
        androidx.core.widget.h.c(this.S, s(), this.f1672s, this.f1673t, this.f1678y);
        this.f1669p.setSelection(-1);
        if (!this.R || this.f1669p.isInTouchMode()) {
            q();
        }
        if (!this.R) {
            this.O.post(this.M);
        }
    }

    public int d() {
        return this.f1672s;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.S.dismiss();
        B();
        this.S.setContentView(null);
        this.f1669p = null;
        this.O.removeCallbacks(this.J);
    }

    public void f(int i10) {
        this.f1672s = i10;
    }

    public Drawable getBackground() {
        return this.S.getBackground();
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView j() {
        return this.f1669p;
    }

    public void k(int i10) {
        this.f1673t = i10;
        this.f1675v = true;
    }

    public int n() {
        if (!this.f1675v) {
            return 0;
        }
        return this.f1673t;
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.E;
        if (dataSetObserver == null) {
            this.E = new f();
        } else {
            ListAdapter listAdapter2 = this.f1668m;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1668m = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        o0 o0Var = this.f1669p;
        if (o0Var != null) {
            o0Var.setAdapter(this.f1668m);
        }
    }

    public void q() {
        o0 o0Var = this.f1669p;
        if (o0Var != null) {
            o0Var.setListSelectionHidden(true);
            o0Var.requestLayout();
        }
    }

    o0 r(Context context, boolean z10) {
        return new o0(context, z10);
    }

    public View s() {
        return this.F;
    }

    public Object u() {
        if (!b()) {
            return null;
        }
        return this.f1669p.getSelectedItem();
    }

    public long v() {
        if (!b()) {
            return Long.MIN_VALUE;
        }
        return this.f1669p.getSelectedItemId();
    }

    public int w() {
        if (!b()) {
            return -1;
        }
        return this.f1669p.getSelectedItemPosition();
    }

    public View x() {
        if (!b()) {
            return null;
        }
        return this.f1669p.getSelectedView();
    }

    public int y() {
        return this.f1671r;
    }

    public boolean z() {
        if (this.S.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    public s0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public s0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1670q = -2;
        this.f1671r = -2;
        this.f1674u = CredentialsApi.ACTIVITY_RESULT_NO_HINTS_AVAILABLE;
        this.f1678y = 0;
        this.f1679z = false;
        this.A = false;
        this.B = Integer.MAX_VALUE;
        this.D = 0;
        this.J = new i();
        this.K = new h();
        this.L = new g();
        this.M = new e();
        this.P = new Rect();
        this.f1667f = context;
        this.O = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f15931t1, i10, i11);
        this.f1672s = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15936u1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(g.j.f15941v1, 0);
        this.f1673t = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1675v = true;
        }
        obtainStyledAttributes.recycle();
        q qVar = new q(context, attributeSet, i10, i11);
        this.S = qVar;
        qVar.setInputMethodMode(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            o0 o0Var;
            if (i10 != -1 && (o0Var = s0.this.f1669p) != null) {
                o0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListPopupWindow.java */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !s0.this.z() && s0.this.S.getContentView() != null) {
                s0 s0Var = s0.this;
                s0Var.O.removeCallbacks(s0Var.J);
                s0.this.J.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
