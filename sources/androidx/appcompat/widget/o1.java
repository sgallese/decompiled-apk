package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public class o1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: x  reason: collision with root package name */
    private static o1 f1611x;

    /* renamed from: y  reason: collision with root package name */
    private static o1 f1612y;

    /* renamed from: f  reason: collision with root package name */
    private final View f1613f;

    /* renamed from: m  reason: collision with root package name */
    private final CharSequence f1614m;

    /* renamed from: p  reason: collision with root package name */
    private final int f1615p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f1616q = new Runnable() { // from class: androidx.appcompat.widget.m1
        @Override // java.lang.Runnable
        public final void run() {
            o1.this.e();
        }
    };

    /* renamed from: r  reason: collision with root package name */
    private final Runnable f1617r = new Runnable() { // from class: androidx.appcompat.widget.n1
        @Override // java.lang.Runnable
        public final void run() {
            o1.this.d();
        }
    };

    /* renamed from: s  reason: collision with root package name */
    private int f1618s;

    /* renamed from: t  reason: collision with root package name */
    private int f1619t;

    /* renamed from: u  reason: collision with root package name */
    private p1 f1620u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f1621v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f1622w;

    private o1(View view, CharSequence charSequence) {
        this.f1613f = view;
        this.f1614m = charSequence;
        this.f1615p = androidx.core.view.r0.d(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f1613f.removeCallbacks(this.f1616q);
    }

    private void c() {
        this.f1622w = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        i(false);
    }

    private void f() {
        this.f1613f.postDelayed(this.f1616q, ViewConfiguration.getLongPressTimeout());
    }

    private static void g(o1 o1Var) {
        o1 o1Var2 = f1611x;
        if (o1Var2 != null) {
            o1Var2.b();
        }
        f1611x = o1Var;
        if (o1Var != null) {
            o1Var.f();
        }
    }

    public static void h(View view, CharSequence charSequence) {
        o1 o1Var = f1611x;
        if (o1Var != null && o1Var.f1613f == view) {
            g(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            o1 o1Var2 = f1612y;
            if (o1Var2 != null && o1Var2.f1613f == view) {
                o1Var2.d();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new o1(view, charSequence);
    }

    private boolean j(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f1622w && Math.abs(x10 - this.f1618s) <= this.f1615p && Math.abs(y10 - this.f1619t) <= this.f1615p) {
            return false;
        }
        this.f1618s = x10;
        this.f1619t = y10;
        this.f1622w = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (f1612y == this) {
            f1612y = null;
            p1 p1Var = this.f1620u;
            if (p1Var != null) {
                p1Var.c();
                this.f1620u = null;
                c();
                this.f1613f.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1611x == this) {
            g(null);
        }
        this.f1613f.removeCallbacks(this.f1617r);
    }

    void i(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (!androidx.core.view.p0.X(this.f1613f)) {
            return;
        }
        g(null);
        o1 o1Var = f1612y;
        if (o1Var != null) {
            o1Var.d();
        }
        f1612y = this;
        this.f1621v = z10;
        p1 p1Var = new p1(this.f1613f.getContext());
        this.f1620u = p1Var;
        p1Var.e(this.f1613f, this.f1618s, this.f1619t, this.f1621v, this.f1614m);
        this.f1613f.addOnAttachStateChangeListener(this);
        if (this.f1621v) {
            j11 = 2500;
        } else {
            if ((androidx.core.view.p0.Q(this.f1613f) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j10 = 15000;
            }
            j11 = j10 - longPressTimeout;
        }
        this.f1613f.removeCallbacks(this.f1617r);
        this.f1613f.postDelayed(this.f1617r, j11);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1620u != null && this.f1621v) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1613f.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f1613f.isEnabled() && this.f1620u == null && j(motionEvent)) {
            g(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1618s = view.getWidth() / 2;
        this.f1619t = view.getHeight() / 2;
        i(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
