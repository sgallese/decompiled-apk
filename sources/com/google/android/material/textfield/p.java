package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.accessibility.c;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes3.dex */
public class p extends s {

    /* renamed from: s  reason: collision with root package name */
    private static final boolean f10530s = true;

    /* renamed from: e  reason: collision with root package name */
    private final int f10531e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10532f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f10533g;

    /* renamed from: h  reason: collision with root package name */
    private AutoCompleteTextView f10534h;

    /* renamed from: i  reason: collision with root package name */
    private final View.OnClickListener f10535i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnFocusChangeListener f10536j;

    /* renamed from: k  reason: collision with root package name */
    private final c.b f10537k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f10538l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f10539m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f10540n;

    /* renamed from: o  reason: collision with root package name */
    private long f10541o;

    /* renamed from: p  reason: collision with root package name */
    private AccessibilityManager f10542p;

    /* renamed from: q  reason: collision with root package name */
    private ValueAnimator f10543q;

    /* renamed from: r  reason: collision with root package name */
    private ValueAnimator f10544r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DropdownMenuEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f10544r.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(r rVar) {
        super(rVar);
        this.f10535i = new View.OnClickListener() { // from class: com.google.android.material.textfield.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p.this.J(view);
            }
        };
        this.f10536j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.this.K(view, z10);
            }
        };
        this.f10537k = new c.b() { // from class: com.google.android.material.textfield.k
            @Override // androidx.core.view.accessibility.c.b
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.this.L(z10);
            }
        };
        this.f10541o = Long.MAX_VALUE;
        Context context = rVar.getContext();
        int i10 = v6.b.K;
        this.f10532f = j7.a.f(context, i10, 67);
        this.f10531e = j7.a.f(rVar.getContext(), i10, 50);
        this.f10533g = j7.a.g(rVar.getContext(), v6.b.P, w6.a.f25410a);
    }

    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f10533g);
        ofFloat.setDuration(i10);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.this.I(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void F() {
        this.f10544r = E(this.f10532f, 0.0f, 1.0f);
        ValueAnimator E = E(this.f10531e, 1.0f, 0.0f);
        this.f10543q = E;
        E.addListener(new a());
    }

    private boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f10541o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        boolean isPopupShowing = this.f10534h.isPopupShowing();
        O(isPopupShowing);
        this.f10539m = isPopupShowing;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(ValueAnimator valueAnimator) {
        this.f10569d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(View view) {
        Q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(View view, boolean z10) {
        this.f10538l = z10;
        r();
        if (!z10) {
            O(false);
            this.f10539m = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(boolean z10) {
        int i10;
        AutoCompleteTextView autoCompleteTextView = this.f10534h;
        if (autoCompleteTextView != null && !q.a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = this.f10569d;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            p0.F0(checkableImageButton, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean M(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (G()) {
                this.f10539m = false;
            }
            Q();
            R();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N() {
        R();
        O(false);
    }

    private void O(boolean z10) {
        if (this.f10540n != z10) {
            this.f10540n = z10;
            this.f10544r.cancel();
            this.f10543q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void P() {
        this.f10534h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean M;
                M = p.this.M(view, motionEvent);
                return M;
            }
        });
        if (f10530s) {
            this.f10534h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.o
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.this.N();
                }
            });
        }
        this.f10534h.setThreshold(0);
    }

    private void Q() {
        if (this.f10534h == null) {
            return;
        }
        if (G()) {
            this.f10539m = false;
        }
        if (!this.f10539m) {
            if (f10530s) {
                O(!this.f10540n);
            } else {
                this.f10540n = !this.f10540n;
                r();
            }
            if (this.f10540n) {
                this.f10534h.requestFocus();
                this.f10534h.showDropDown();
                return;
            }
            this.f10534h.dismissDropDown();
            return;
        }
        this.f10539m = false;
    }

    private void R() {
        this.f10539m = true;
        this.f10541o = System.currentTimeMillis();
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f10542p.isTouchExplorationEnabled() && q.a(this.f10534h) && !this.f10569d.hasFocus()) {
            this.f10534h.dismissDropDown();
        }
        this.f10534h.post(new Runnable() { // from class: com.google.android.material.textfield.m
            @Override // java.lang.Runnable
            public final void run() {
                p.this.H();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public int c() {
        return v6.j.f24771g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public int d() {
        if (f10530s) {
            return v6.e.f24708g;
        }
        return v6.e.f24709h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener e() {
        return this.f10536j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public View.OnClickListener f() {
        return this.f10535i;
    }

    @Override // com.google.android.material.textfield.s
    public c.b h() {
        return this.f10537k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean i(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean j() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean k() {
        return this.f10538l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean m() {
        return this.f10540n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f10534h = D(editText);
        P();
        this.f10566a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f10542p.isTouchExplorationEnabled()) {
            p0.F0(this.f10569d, 2);
        }
        this.f10566a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, n0 n0Var) {
        if (!q.a(this.f10534h)) {
            n0Var.n0(Spinner.class.getName());
        }
        if (n0Var.X()) {
            n0Var.A0(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @SuppressLint({"WrongConstant"})
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (this.f10542p.isEnabled() && !q.a(this.f10534h)) {
            if (accessibilityEvent.getEventType() == 32768 && this.f10540n && !this.f10534h.isPopupShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z10) {
                Q();
                R();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public void s() {
        F();
        this.f10542p = (AccessibilityManager) this.f10568c.getSystemService("accessibility");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public boolean t() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f10534h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f10530s) {
                this.f10534h.setOnDismissListener(null);
            }
        }
    }
}
