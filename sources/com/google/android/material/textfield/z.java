package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.g1;
import androidx.core.view.accessibility.n0;
import androidx.core.view.p0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartCompoundLayout.java */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public class z extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    private final TextInputLayout f10617f;

    /* renamed from: m  reason: collision with root package name */
    private final TextView f10618m;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f10619p;

    /* renamed from: q  reason: collision with root package name */
    private final CheckableImageButton f10620q;

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f10621r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuff.Mode f10622s;

    /* renamed from: t  reason: collision with root package name */
    private int f10623t;

    /* renamed from: u  reason: collision with root package name */
    private ImageView.ScaleType f10624u;

    /* renamed from: v  reason: collision with root package name */
    private View.OnLongClickListener f10625v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10626w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(TextInputLayout textInputLayout, g1 g1Var) {
        super(textInputLayout.getContext());
        this.f10617f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(v6.h.f24747g, (ViewGroup) this, false);
        this.f10620q = checkableImageButton;
        t.e(checkableImageButton);
        androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(getContext());
        this.f10618m = b0Var;
        i(g1Var);
        h(g1Var);
        addView(checkableImageButton);
        addView(b0Var);
    }

    private void B() {
        int i10;
        boolean z10;
        int i11 = 8;
        if (this.f10619p != null && !this.f10626w) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f10620q.getVisibility() != 0 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f10618m.setVisibility(i10);
        this.f10617f.l0();
    }

    private void h(g1 g1Var) {
        this.f10618m.setVisibility(8);
        this.f10618m.setId(v6.f.U);
        this.f10618m.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        p0.w0(this.f10618m, 1);
        n(g1Var.n(v6.l.f25036v8, 0));
        int i10 = v6.l.f25046w8;
        if (g1Var.s(i10)) {
            o(g1Var.c(i10));
        }
        m(g1Var.p(v6.l.f25026u8));
    }

    private void i(g1 g1Var) {
        if (m7.c.g(getContext())) {
            androidx.core.view.s.c((ViewGroup.MarginLayoutParams) this.f10620q.getLayoutParams(), 0);
        }
        t(null);
        u(null);
        int i10 = v6.l.C8;
        if (g1Var.s(i10)) {
            this.f10621r = m7.c.b(getContext(), g1Var, i10);
        }
        int i11 = v6.l.D8;
        if (g1Var.s(i11)) {
            this.f10622s = com.google.android.material.internal.r.g(g1Var.k(i11, -1), null);
        }
        int i12 = v6.l.f25076z8;
        if (g1Var.s(i12)) {
            r(g1Var.g(i12));
            int i13 = v6.l.f25066y8;
            if (g1Var.s(i13)) {
                q(g1Var.p(i13));
            }
            p(g1Var.a(v6.l.f25056x8, true));
        }
        s(g1Var.f(v6.l.A8, getResources().getDimensionPixelSize(v6.d.f24668c0)));
        int i14 = v6.l.B8;
        if (g1Var.s(i14)) {
            v(t.b(g1Var.k(i14, -1)));
        }
    }

    void A() {
        int J;
        EditText editText = this.f10617f.f10479q;
        if (editText == null) {
            return;
        }
        if (j()) {
            J = 0;
        } else {
            J = p0.J(editText);
        }
        p0.K0(this.f10618m, J, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(v6.d.I), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence a() {
        return this.f10619p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f10618m.getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextView c() {
        return this.f10618m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.f10620q.getContentDescription();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Drawable e() {
        return this.f10620q.getDrawable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f10623t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageView.ScaleType g() {
        return this.f10624u;
    }

    boolean j() {
        if (this.f10620q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(boolean z10) {
        this.f10626w = z10;
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        t.d(this.f10617f, this.f10620q, this.f10621r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f10619p = charSequence2;
        this.f10618m.setText(charSequence);
        B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n(int i10) {
        androidx.core.widget.j.o(this.f10618m, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(ColorStateList colorStateList) {
        this.f10618m.setTextColor(colorStateList);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(boolean z10) {
        this.f10620q.setCheckable(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(CharSequence charSequence) {
        if (d() != charSequence) {
            this.f10620q.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Drawable drawable) {
        this.f10620q.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f10617f, this.f10620q, this.f10621r, this.f10622s);
            y(true);
            l();
            return;
        }
        y(false);
        t(null);
        u(null);
        q(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f10623t) {
                this.f10623t = i10;
                t.g(this.f10620q, i10);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(View.OnClickListener onClickListener) {
        t.h(this.f10620q, onClickListener, this.f10625v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(View.OnLongClickListener onLongClickListener) {
        this.f10625v = onLongClickListener;
        t.i(this.f10620q, onLongClickListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(ImageView.ScaleType scaleType) {
        this.f10624u = scaleType;
        t.j(this.f10620q, scaleType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(ColorStateList colorStateList) {
        if (this.f10621r != colorStateList) {
            this.f10621r = colorStateList;
            t.a(this.f10617f, this.f10620q, colorStateList, this.f10622s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(PorterDuff.Mode mode) {
        if (this.f10622s != mode) {
            this.f10622s = mode;
            t.a(this.f10617f, this.f10620q, this.f10621r, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(boolean z10) {
        int i10;
        if (j() != z10) {
            CheckableImageButton checkableImageButton = this.f10620q;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            A();
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z(n0 n0Var) {
        if (this.f10618m.getVisibility() == 0) {
            n0Var.C0(this.f10618m);
            n0Var.X0(this.f10618m);
            return;
        }
        n0Var.X0(this.f10620q);
    }
}
