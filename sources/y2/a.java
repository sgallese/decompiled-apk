package y2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.h;
import androidx.core.view.accessibility.n0;
import androidx.core.view.accessibility.q0;
import androidx.core.view.accessibility.r0;
import androidx.core.view.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import y2.b;

/* compiled from: ExploreByTouchHelper.java */
/* loaded from: classes.dex */
public abstract class a extends androidx.core.view.a {

    /* renamed from: n  reason: collision with root package name */
    private static final Rect f26211n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    private static final b.a<n0> f26212o = new C0602a();

    /* renamed from: p  reason: collision with root package name */
    private static final b.InterfaceC0603b<h<n0>, n0> f26213p = new b();

    /* renamed from: h  reason: collision with root package name */
    private final AccessibilityManager f26218h;

    /* renamed from: i  reason: collision with root package name */
    private final View f26219i;

    /* renamed from: j  reason: collision with root package name */
    private c f26220j;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f26214d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f26215e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final Rect f26216f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    private final int[] f26217g = new int[2];

    /* renamed from: k  reason: collision with root package name */
    int f26221k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    int f26222l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    private int f26223m = RecyclerView.UNDEFINED_DURATION;

    /* compiled from: ExploreByTouchHelper.java */
    /* renamed from: y2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0602a implements b.a<n0> {
        C0602a() {
        }

        @Override // y2.b.a
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public void a(n0 n0Var, Rect rect) {
            n0Var.m(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    class b implements b.InterfaceC0603b<h<n0>, n0> {
        b() {
        }

        @Override // y2.b.InterfaceC0603b
        /* renamed from: c  reason: merged with bridge method [inline-methods] */
        public n0 a(h<n0> hVar, int i10) {
            return hVar.r(i10);
        }

        @Override // y2.b.InterfaceC0603b
        /* renamed from: d  reason: merged with bridge method [inline-methods] */
        public int b(h<n0> hVar) {
            return hVar.q();
        }
    }

    /* compiled from: ExploreByTouchHelper.java */
    /* loaded from: classes.dex */
    private class c extends q0 {
        c() {
        }

        @Override // androidx.core.view.accessibility.q0
        public n0 b(int i10) {
            return n0.c0(a.this.H(i10));
        }

        @Override // androidx.core.view.accessibility.q0
        public n0 d(int i10) {
            int i11;
            if (i10 == 2) {
                i11 = a.this.f26221k;
            } else {
                i11 = a.this.f26222l;
            }
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.q0
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f26219i = view;
            this.f26218h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (p0.C(view) == 0) {
                p0.F0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 == 130) {
                        rect.set(0, -1, width, -1);
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    rect.set(-1, 0, -1, height);
                }
            } else {
                rect.set(0, height, width, height);
            }
        } else {
            rect.set(width, 0, width, height);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f26219i.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f26219i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent == null) {
            return false;
        }
        return true;
    }

    private static int F(int i10) {
        if (i10 != 19) {
            if (i10 != 21) {
                if (i10 != 22) {
                    return 130;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean G(int i10, Rect rect) {
        n0 g10;
        boolean z10;
        n0 n0Var;
        h<n0> y10 = y();
        int i11 = this.f26222l;
        int i12 = RecyclerView.UNDEFINED_DURATION;
        if (i11 == Integer.MIN_VALUE) {
            g10 = null;
        } else {
            g10 = y10.g(i11);
        }
        n0 n0Var2 = g10;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f26222l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f26219i, i10, rect2);
            }
            n0Var = (n0) y2.b.c(y10, f26213p, f26212o, n0Var2, rect2, i10);
        } else {
            if (p0.E(this.f26219i) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            n0Var = (n0) y2.b.d(y10, f26213p, f26212o, n0Var2, i10, z10, false);
        }
        if (n0Var != null) {
            i12 = y10.l(y10.j(n0Var));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 64) {
                    if (i11 != 128) {
                        return J(i10, i11, bundle);
                    }
                    return n(i10);
                }
                return S(i10);
            }
            return o(i10);
        }
        return T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return p0.j0(this.f26219i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f26218h.isEnabled() || !this.f26218h.isTouchExplorationEnabled() || (i11 = this.f26221k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f26221k = i10;
        this.f26219i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f26223m;
        if (i11 == i10) {
            return;
        }
        this.f26223m = i10;
        U(i10, 128);
        U(i11, UserVerificationMethods.USER_VERIFY_HANDPRINT);
    }

    private boolean n(int i10) {
        if (this.f26221k == i10) {
            this.f26221k = RecyclerView.UNDEFINED_DURATION;
            this.f26219i.invalidate();
            U(i10, 65536);
            return true;
        }
        return false;
    }

    private boolean p() {
        int i10 = this.f26222l;
        if (i10 != Integer.MIN_VALUE && J(i10, 16, null)) {
            return true;
        }
        return false;
    }

    private AccessibilityEvent q(int i10, int i11) {
        if (i10 != -1) {
            return r(i10, i11);
        }
        return s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        n0 H = H(i10);
        obtain.getText().add(H.C());
        obtain.setContentDescription(H.t());
        obtain.setScrollable(H.V());
        obtain.setPassword(H.U());
        obtain.setEnabled(H.O());
        obtain.setChecked(H.L());
        L(i10, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H.q());
        r0.c(obtain, this.f26219i, i10);
        obtain.setPackageName(this.f26219i.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i10);
        this.f26219i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    private n0 t(int i10) {
        boolean z10;
        n0 a02 = n0.a0();
        a02.v0(true);
        a02.x0(true);
        a02.n0("android.view.View");
        Rect rect = f26211n;
        a02.j0(rect);
        a02.k0(rect);
        a02.J0(this.f26219i);
        N(i10, a02);
        if (a02.C() == null && a02.t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a02.m(this.f26215e);
        if (!this.f26215e.equals(rect)) {
            int k10 = a02.k();
            if ((k10 & 64) == 0) {
                if ((k10 & 128) == 0) {
                    a02.H0(this.f26219i.getContext().getPackageName());
                    a02.T0(this.f26219i, i10);
                    if (this.f26221k == i10) {
                        a02.h0(true);
                        a02.a(128);
                    } else {
                        a02.h0(false);
                        a02.a(64);
                    }
                    if (this.f26222l == i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        a02.a(2);
                    } else if (a02.P()) {
                        a02.a(1);
                    }
                    a02.y0(z10);
                    this.f26219i.getLocationOnScreen(this.f26217g);
                    a02.n(this.f26214d);
                    if (this.f26214d.equals(rect)) {
                        a02.m(this.f26214d);
                        if (a02.f4075b != -1) {
                            n0 a03 = n0.a0();
                            for (int i11 = a02.f4075b; i11 != -1; i11 = a03.f4075b) {
                                a03.K0(this.f26219i, -1);
                                a03.j0(f26211n);
                                N(i11, a03);
                                a03.m(this.f26215e);
                                Rect rect2 = this.f26214d;
                                Rect rect3 = this.f26215e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            a03.e0();
                        }
                        this.f26214d.offset(this.f26217g[0] - this.f26219i.getScrollX(), this.f26217g[1] - this.f26219i.getScrollY());
                    }
                    if (this.f26219i.getLocalVisibleRect(this.f26216f)) {
                        this.f26216f.offset(this.f26217g[0] - this.f26219i.getScrollX(), this.f26217g[1] - this.f26219i.getScrollY());
                        if (this.f26214d.intersect(this.f26216f)) {
                            a02.k0(this.f26214d);
                            if (E(this.f26214d)) {
                                a02.c1(true);
                            }
                        }
                    }
                    return a02;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    private n0 u() {
        n0 b02 = n0.b0(this.f26219i);
        p0.h0(this.f26219i, b02);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (b02.p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b02.d(this.f26219i, ((Integer) arrayList.get(i10)).intValue());
        }
        return b02;
    }

    private h<n0> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<n0> hVar = new h<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            hVar.n(arrayList.get(i10).intValue(), t(arrayList.get(i10).intValue()));
        }
        return hVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f26222l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List<Integer> list);

    n0 H(int i10) {
        if (i10 == -1) {
            return u();
        }
        return t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f26222l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected abstract void M(n0 n0Var);

    protected abstract void N(int i10, n0 n0Var);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        if (i10 != -1) {
            return Q(i10, i11, bundle);
        }
        return R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f26219i.isFocused() && !this.f26219i.requestFocus()) || (i11 = this.f26222l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f26222l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f26218h.isEnabled() || (parent = this.f26219i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f26219i, q(i10, i11));
    }

    @Override // androidx.core.view.a
    public q0 b(View view) {
        if (this.f26220j == null) {
            this.f26220j = new c();
        }
        return this.f26220j;
    }

    @Override // androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void g(View view, n0 n0Var) {
        super.g(view, n0Var);
        M(n0Var);
    }

    public final boolean o(int i10) {
        if (this.f26222l != i10) {
            return false;
        }
        this.f26222l = RecyclerView.UNDEFINED_DURATION;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.f26218h.isEnabled() || !this.f26218h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7 && action != 9) {
            if (action != 10 || this.f26223m == Integer.MIN_VALUE) {
                return false;
            }
            V(RecyclerView.UNDEFINED_DURATION);
            return true;
        }
        int B = B(motionEvent.getX(), motionEvent.getY());
        V(B);
        if (B == Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z10 = false;
                        while (i10 < repeatCount && G(F, null)) {
                            i10++;
                            z10 = true;
                        }
                        return z10;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return G(2, null);
        } else {
            if (!keyEvent.hasModifiers(1)) {
                return false;
            }
            return G(1, null);
        }
    }

    public final int x() {
        return this.f26221k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }
}
