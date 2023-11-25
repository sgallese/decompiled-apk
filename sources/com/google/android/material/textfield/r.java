package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.g1;
import androidx.core.view.accessibility.c;
import androidx.core.view.p0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EndCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class r extends LinearLayout {
    private ImageView.ScaleType A;
    private View.OnLongClickListener B;
    private CharSequence C;
    private final TextView D;
    private boolean E;
    private EditText F;
    private final AccessibilityManager G;
    private c.b H;
    private final TextWatcher I;
    private final TextInputLayout.g J;

    /* renamed from: f  reason: collision with root package name */
    final TextInputLayout f10546f;

    /* renamed from: m  reason: collision with root package name */
    private final FrameLayout f10547m;

    /* renamed from: p  reason: collision with root package name */
    private final CheckableImageButton f10548p;

    /* renamed from: q  reason: collision with root package name */
    private ColorStateList f10549q;

    /* renamed from: r  reason: collision with root package name */
    private PorterDuff.Mode f10550r;

    /* renamed from: s  reason: collision with root package name */
    private View.OnLongClickListener f10551s;

    /* renamed from: t  reason: collision with root package name */
    private final CheckableImageButton f10552t;

    /* renamed from: u  reason: collision with root package name */
    private final d f10553u;

    /* renamed from: v  reason: collision with root package name */
    private int f10554v;

    /* renamed from: w  reason: collision with root package name */
    private final LinkedHashSet<TextInputLayout.h> f10555w;

    /* renamed from: x  reason: collision with root package name */
    private ColorStateList f10556x;

    /* renamed from: y  reason: collision with root package name */
    private PorterDuff.Mode f10557y;

    /* renamed from: z  reason: collision with root package name */
    private int f10558z;

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes3.dex */
    class a extends com.google.android.material.internal.o {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            r.this.m().a(editable);
        }

        @Override // com.google.android.material.internal.o, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            r.this.m().b(charSequence, i10, i11, i12);
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes3.dex */
    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (r.this.F == textInputLayout.getEditText()) {
                return;
            }
            if (r.this.F != null) {
                r.this.F.removeTextChangedListener(r.this.I);
                if (r.this.F.getOnFocusChangeListener() == r.this.m().e()) {
                    r.this.F.setOnFocusChangeListener(null);
                }
            }
            r.this.F = textInputLayout.getEditText();
            if (r.this.F != null) {
                r.this.F.addTextChangedListener(r.this.I);
            }
            r.this.m().n(r.this.F);
            r rVar = r.this;
            rVar.g0(rVar.m());
        }
    }

    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes3.dex */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EndCompoundLayout.java */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<s> f10562a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private final r f10563b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10564c;

        /* renamed from: d  reason: collision with root package name */
        private final int f10565d;

        d(r rVar, g1 g1Var) {
            this.f10563b = rVar;
            this.f10564c = g1Var.n(v6.l.P7, 0);
            this.f10565d = g1Var.n(v6.l.f24956n8, 0);
        }

        private s b(int i10) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                return new p(this.f10563b);
                            }
                            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
                        }
                        return new f(this.f10563b);
                    }
                    return new y(this.f10563b, this.f10565d);
                }
                return new w(this.f10563b);
            }
            return new g(this.f10563b);
        }

        s c(int i10) {
            s sVar = this.f10562a.get(i10);
            if (sVar == null) {
                s b10 = b(i10);
                this.f10562a.append(i10, b10);
                return b10;
            }
            return sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(TextInputLayout textInputLayout, g1 g1Var) {
        super(textInputLayout.getContext());
        this.f10554v = 0;
        this.f10555w = new LinkedHashSet<>();
        this.I = new a();
        b bVar = new b();
        this.J = bVar;
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10546f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10547m = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i10 = i(this, from, v6.f.P);
        this.f10548p = i10;
        CheckableImageButton i11 = i(frameLayout, from, v6.f.O);
        this.f10552t = i11;
        this.f10553u = new d(this, g1Var);
        androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(getContext());
        this.D = b0Var;
        B(g1Var);
        A(g1Var);
        C(g1Var);
        frameLayout.addView(i11);
        addView(b0Var);
        addView(frameLayout);
        addView(i10);
        textInputLayout.h(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void A(g1 g1Var) {
        int i10 = v6.l.f24966o8;
        if (!g1Var.s(i10)) {
            int i11 = v6.l.T7;
            if (g1Var.s(i11)) {
                this.f10556x = m7.c.b(getContext(), g1Var, i11);
            }
            int i12 = v6.l.U7;
            if (g1Var.s(i12)) {
                this.f10557y = com.google.android.material.internal.r.g(g1Var.k(i12, -1), null);
            }
        }
        int i13 = v6.l.R7;
        if (g1Var.s(i13)) {
            T(g1Var.k(i13, 0));
            int i14 = v6.l.O7;
            if (g1Var.s(i14)) {
                P(g1Var.p(i14));
            }
            N(g1Var.a(v6.l.N7, true));
        } else if (g1Var.s(i10)) {
            int i15 = v6.l.f24976p8;
            if (g1Var.s(i15)) {
                this.f10556x = m7.c.b(getContext(), g1Var, i15);
            }
            int i16 = v6.l.f24986q8;
            if (g1Var.s(i16)) {
                this.f10557y = com.google.android.material.internal.r.g(g1Var.k(i16, -1), null);
            }
            T(g1Var.a(i10, false) ? 1 : 0);
            P(g1Var.p(v6.l.f24946m8));
        }
        S(g1Var.f(v6.l.Q7, getResources().getDimensionPixelSize(v6.d.f24668c0)));
        int i17 = v6.l.S7;
        if (g1Var.s(i17)) {
            W(t.b(g1Var.k(i17, -1)));
        }
    }

    private void B(g1 g1Var) {
        int i10 = v6.l.Z7;
        if (g1Var.s(i10)) {
            this.f10549q = m7.c.b(getContext(), g1Var, i10);
        }
        int i11 = v6.l.f24826a8;
        if (g1Var.s(i11)) {
            this.f10550r = com.google.android.material.internal.r.g(g1Var.k(i11, -1), null);
        }
        int i12 = v6.l.Y7;
        if (g1Var.s(i12)) {
            b0(g1Var.g(i12));
        }
        this.f10548p.setContentDescription(getResources().getText(v6.j.f24770f));
        p0.F0(this.f10548p, 2);
        this.f10548p.setClickable(false);
        this.f10548p.setPressable(false);
        this.f10548p.setFocusable(false);
    }

    private void C(g1 g1Var) {
        this.D.setVisibility(8);
        this.D.setId(v6.f.V);
        this.D.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        p0.w0(this.D, 1);
        p0(g1Var.n(v6.l.F8, 0));
        int i10 = v6.l.G8;
        if (g1Var.s(i10)) {
            q0(g1Var.c(i10));
        }
        o0(g1Var.p(v6.l.E8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        AccessibilityManager accessibilityManager;
        c.b bVar = this.H;
        if (bVar != null && (accessibilityManager = this.G) != null) {
            androidx.core.view.accessibility.c.b(accessibilityManager, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.H != null && this.G != null && p0.X(this)) {
            androidx.core.view.accessibility.c.a(this.G, this.H);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(s sVar) {
        if (this.F == null) {
            return;
        }
        if (sVar.e() != null) {
            this.F.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f10552t.setOnFocusChangeListener(sVar.g());
        }
    }

    private CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(v6.h.f24746f, viewGroup, false);
        checkableImageButton.setId(i10);
        t.e(checkableImageButton);
        if (m7.c.g(getContext())) {
            androidx.core.view.s.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    private void j(int i10) {
        Iterator<TextInputLayout.h> it = this.f10555w.iterator();
        while (it.hasNext()) {
            it.next().a(this.f10546f, i10);
        }
    }

    private void r0(s sVar) {
        sVar.s();
        this.H = sVar.h();
        g();
    }

    private void s0(s sVar) {
        L();
        this.H = null;
        sVar.u();
    }

    private int t(s sVar) {
        int i10 = this.f10553u.f10564c;
        if (i10 == 0) {
            return sVar.d();
        }
        return i10;
    }

    private void t0(boolean z10) {
        if (z10 && n() != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(n()).mutate();
            androidx.core.graphics.drawable.a.n(mutate, this.f10546f.getErrorCurrentTextColors());
            this.f10552t.setImageDrawable(mutate);
            return;
        }
        t.a(this.f10546f, this.f10552t, this.f10556x, this.f10557y);
    }

    private void u0() {
        int i10;
        char c10;
        boolean z10;
        FrameLayout frameLayout = this.f10547m;
        int i11 = 8;
        if (this.f10552t.getVisibility() == 0 && !F()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        frameLayout.setVisibility(i10);
        if (this.C != null && !this.E) {
            c10 = 0;
        } else {
            c10 = '\b';
        }
        if (!E() && !F() && c10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    private void v0() {
        boolean z10;
        int i10 = 0;
        if (s() != null && this.f10546f.M() && this.f10546f.a0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = this.f10548p;
        if (!z10) {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        u0();
        w0();
        if (!z()) {
            this.f10546f.l0();
        }
    }

    private void x0() {
        int i10;
        int visibility = this.D.getVisibility();
        boolean z10 = false;
        if (this.C != null && !this.E) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            s m10 = m();
            if (i10 == 0) {
                z10 = true;
            }
            m10.q(z10);
        }
        u0();
        this.D.setVisibility(i10);
        this.f10546f.l0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean D() {
        if (z() && this.f10552t.isChecked()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean E() {
        if (this.f10547m.getVisibility() == 0 && this.f10552t.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean F() {
        if (this.f10548p.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(boolean z10) {
        this.E = z10;
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H() {
        v0();
        J();
        I();
        if (m().t()) {
            t0(this.f10546f.a0());
        }
    }

    void I() {
        t.d(this.f10546f, this.f10552t, this.f10556x);
    }

    void J() {
        t.d(this.f10546f, this.f10548p, this.f10549q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z10) {
        boolean z11;
        boolean isActivated;
        boolean isChecked;
        s m10 = m();
        boolean z12 = true;
        if (m10.l() && (isChecked = this.f10552t.isChecked()) != m10.m()) {
            this.f10552t.setChecked(!isChecked);
            z11 = true;
        } else {
            z11 = false;
        }
        if (m10.j() && (isActivated = this.f10552t.isActivated()) != m10.k()) {
            M(!isActivated);
        } else {
            z12 = z11;
        }
        if (z10 || z12) {
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(boolean z10) {
        this.f10552t.setActivated(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(boolean z10) {
        this.f10552t.setCheckable(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        P(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f10552t.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        R(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(Drawable drawable) {
        this.f10552t.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f10546f, this.f10552t, this.f10556x, this.f10557y);
            I();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f10558z) {
                this.f10558z = i10;
                t.g(this.f10552t, i10);
                t.g(this.f10548p, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(int i10) {
        boolean z10;
        if (this.f10554v == i10) {
            return;
        }
        s0(m());
        int i11 = this.f10554v;
        this.f10554v = i10;
        j(i11);
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Z(z10);
        s m10 = m();
        Q(t(m10));
        O(m10.c());
        N(m10.l());
        if (m10.i(this.f10546f.getBoxBackgroundMode())) {
            r0(m10);
            U(m10.f());
            EditText editText = this.F;
            if (editText != null) {
                m10.n(editText);
                g0(m10);
            }
            t.a(this.f10546f, this.f10552t, this.f10556x, this.f10557y);
            K(true);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f10546f.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void U(View.OnClickListener onClickListener) {
        t.h(this.f10552t, onClickListener, this.B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(View.OnLongClickListener onLongClickListener) {
        this.B = onLongClickListener;
        t.i(this.f10552t, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void W(ImageView.ScaleType scaleType) {
        this.A = scaleType;
        t.j(this.f10552t, scaleType);
        t.j(this.f10548p, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(ColorStateList colorStateList) {
        if (this.f10556x != colorStateList) {
            this.f10556x = colorStateList;
            t.a(this.f10546f, this.f10552t, colorStateList, this.f10557y);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(PorterDuff.Mode mode) {
        if (this.f10557y != mode) {
            this.f10557y = mode;
            t.a(this.f10546f, this.f10552t, this.f10556x, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Z(boolean z10) {
        int i10;
        if (E() != z10) {
            CheckableImageButton checkableImageButton = this.f10552t;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            u0();
            w0();
            this.f10546f.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a0(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        b0(drawable);
        J();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b0(Drawable drawable) {
        this.f10548p.setImageDrawable(drawable);
        v0();
        t.a(this.f10546f, this.f10548p, this.f10549q, this.f10550r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c0(View.OnClickListener onClickListener) {
        t.h(this.f10548p, onClickListener, this.f10551s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(View.OnLongClickListener onLongClickListener) {
        this.f10551s = onLongClickListener;
        t.i(this.f10548p, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(ColorStateList colorStateList) {
        if (this.f10549q != colorStateList) {
            this.f10549q = colorStateList;
            t.a(this.f10546f, this.f10548p, colorStateList, this.f10550r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f0(PorterDuff.Mode mode) {
        if (this.f10550r != mode) {
            this.f10550r = mode;
            t.a(this.f10546f, this.f10548p, this.f10549q, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.f10552t.performClick();
        this.f10552t.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h0(int i10) {
        CharSequence charSequence;
        if (i10 != 0) {
            charSequence = getResources().getText(i10);
        } else {
            charSequence = null;
        }
        i0(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i0(CharSequence charSequence) {
        this.f10552t.setContentDescription(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j0(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = h.a.b(getContext(), i10);
        } else {
            drawable = null;
        }
        k0(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton k() {
        if (F()) {
            return this.f10548p;
        }
        if (z() && E()) {
            return this.f10552t;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k0(Drawable drawable) {
        this.f10552t.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence l() {
        return this.f10552t.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l0(boolean z10) {
        if (z10 && this.f10554v != 1) {
            T(1);
        } else if (!z10) {
            T(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s m() {
        return this.f10553u.c(this.f10554v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0(ColorStateList colorStateList) {
        this.f10556x = colorStateList;
        t.a(this.f10546f, this.f10552t, colorStateList, this.f10557y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable n() {
        return this.f10552t.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n0(PorterDuff.Mode mode) {
        this.f10557y = mode;
        t.a(this.f10546f, this.f10552t, this.f10556x, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.f10558z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o0(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.C = charSequence2;
        this.D.setText(charSequence);
        x0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.f10554v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p0(int i10) {
        androidx.core.widget.j.o(this.D, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageView.ScaleType q() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(ColorStateList colorStateList) {
        this.D.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton r() {
        return this.f10552t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable s() {
        return this.f10548p.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence u() {
        return this.f10552t.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable v() {
        return this.f10552t.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence w() {
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w0() {
        int i10;
        if (this.f10546f.f10479q == null) {
            return;
        }
        if (!E() && !F()) {
            i10 = p0.I(this.f10546f.f10479q);
        } else {
            i10 = 0;
        }
        p0.K0(this.D, getContext().getResources().getDimensionPixelSize(v6.d.I), this.f10546f.f10479q.getPaddingTop(), i10, this.f10546f.f10479q.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList x() {
        return this.D.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView y() {
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean z() {
        if (this.f10554v != 0) {
            return true;
        }
        return false;
    }
}
