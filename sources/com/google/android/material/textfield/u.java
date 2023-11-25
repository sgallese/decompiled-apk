package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndicatorViewController.java */
/* loaded from: classes3.dex */
public final class u {
    private ColorStateList A;
    private Typeface B;

    /* renamed from: a  reason: collision with root package name */
    private final int f10570a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10571b;

    /* renamed from: c  reason: collision with root package name */
    private final int f10572c;

    /* renamed from: d  reason: collision with root package name */
    private final TimeInterpolator f10573d;

    /* renamed from: e  reason: collision with root package name */
    private final TimeInterpolator f10574e;

    /* renamed from: f  reason: collision with root package name */
    private final TimeInterpolator f10575f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f10576g;

    /* renamed from: h  reason: collision with root package name */
    private final TextInputLayout f10577h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f10578i;

    /* renamed from: j  reason: collision with root package name */
    private int f10579j;

    /* renamed from: k  reason: collision with root package name */
    private FrameLayout f10580k;

    /* renamed from: l  reason: collision with root package name */
    private Animator f10581l;

    /* renamed from: m  reason: collision with root package name */
    private final float f10582m;

    /* renamed from: n  reason: collision with root package name */
    private int f10583n;

    /* renamed from: o  reason: collision with root package name */
    private int f10584o;

    /* renamed from: p  reason: collision with root package name */
    private CharSequence f10585p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10586q;

    /* renamed from: r  reason: collision with root package name */
    private TextView f10587r;

    /* renamed from: s  reason: collision with root package name */
    private CharSequence f10588s;

    /* renamed from: t  reason: collision with root package name */
    private int f10589t;

    /* renamed from: u  reason: collision with root package name */
    private int f10590u;

    /* renamed from: v  reason: collision with root package name */
    private ColorStateList f10591v;

    /* renamed from: w  reason: collision with root package name */
    private CharSequence f10592w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10593x;

    /* renamed from: y  reason: collision with root package name */
    private TextView f10594y;

    /* renamed from: z  reason: collision with root package name */
    private int f10595z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f10596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextView f10597b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10598c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TextView f10599d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f10596a = i10;
            this.f10597b = textView;
            this.f10598c = i11;
            this.f10599d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f10583n = this.f10596a;
            u.this.f10581l = null;
            TextView textView = this.f10597b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f10598c == 1 && u.this.f10587r != null) {
                    u.this.f10587r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f10599d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f10599d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f10599d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f10599d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: IndicatorViewController.java */
    /* loaded from: classes3.dex */
    public class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f10577h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10576g = context;
        this.f10577h = textInputLayout;
        this.f10582m = context.getResources().getDimensionPixelSize(v6.d.f24681j);
        int i10 = v6.b.L;
        this.f10570a = j7.a.f(context, i10, 217);
        this.f10571b = j7.a.f(context, v6.b.H, 167);
        this.f10572c = j7.a.f(context, i10, 167);
        int i11 = v6.b.N;
        this.f10573d = j7.a.g(context, i11, w6.a.f25413d);
        TimeInterpolator timeInterpolator = w6.a.f25410a;
        this.f10574e = j7.a.g(context, i11, timeInterpolator);
        this.f10575f = j7.a.g(context, v6.b.P, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView m10;
        TextView m11;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (m11 = m(i11)) != null) {
            m11.setVisibility(0);
            m11.setAlpha(1.0f);
        }
        if (i10 != 0 && (m10 = m(i10)) != null) {
            m10.setVisibility(4);
            if (i10 == 1) {
                m10.setText((CharSequence) null);
            }
        }
        this.f10583n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (p0.Y(this.f10577h) && this.f10577h.isEnabled() && (this.f10584o != this.f10583n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10581l = animatorSet;
            ArrayList arrayList = new ArrayList();
            i(arrayList, this.f10593x, this.f10594y, 2, i10, i11);
            i(arrayList, this.f10586q, this.f10587r, 1, i10, i11);
            w6.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            D(i10, i11);
        }
        this.f10577h.m0();
        this.f10577h.q0(z10);
        this.f10577h.w0();
    }

    private boolean g() {
        if (this.f10578i != null && this.f10577h.getEditText() != null) {
            return true;
        }
        return false;
    }

    private void i(List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        boolean z11;
        boolean z12;
        if (textView != null && z10) {
            boolean z13 = false;
            if (i10 != i12 && i10 != i11) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i12 == i10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                ObjectAnimator j10 = j(textView, z12);
                if (i10 == i12 && i11 != 0) {
                    z13 = true;
                }
                if (z13) {
                    j10.setStartDelay(this.f10572c);
                }
                list.add(j10);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator k10 = k(textView);
                    k10.setStartDelay(this.f10572c);
                    list.add(k10);
                }
            }
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        float f10;
        int i10;
        TimeInterpolator timeInterpolator;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f10);
        if (z10) {
            i10 = this.f10571b;
        } else {
            i10 = this.f10572c;
        }
        ofFloat.setDuration(i10);
        if (z10) {
            timeInterpolator = this.f10574e;
        } else {
            timeInterpolator = this.f10575f;
        }
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f10582m, 0.0f);
        ofFloat.setDuration(this.f10570a);
        ofFloat.setInterpolator(this.f10573d);
        return ofFloat;
    }

    private TextView m(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f10594y;
        }
        return this.f10587r;
    }

    private int v(boolean z10, int i10, int i11) {
        if (z10) {
            return this.f10576g.getResources().getDimensionPixelSize(i10);
        }
        return i11;
    }

    private boolean y(int i10) {
        if (i10 == 1 && this.f10587r != null && !TextUtils.isEmpty(this.f10585p)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A() {
        return this.f10586q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean B() {
        return this.f10593x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f10578i == null) {
            return;
        }
        if (z(i10) && (frameLayout = this.f10580k) != null) {
            frameLayout.removeView(textView);
        } else {
            this.f10578i.removeView(textView);
        }
        int i11 = this.f10579j - 1;
        this.f10579j = i11;
        O(this.f10578i, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void E(int i10) {
        this.f10589t = i10;
        TextView textView = this.f10587r;
        if (textView != null) {
            p0.w0(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F(CharSequence charSequence) {
        this.f10588s = charSequence;
        TextView textView = this.f10587r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void G(boolean z10) {
        if (this.f10586q == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(this.f10576g);
            this.f10587r = b0Var;
            b0Var.setId(v6.f.R);
            this.f10587r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f10587r.setTypeface(typeface);
            }
            H(this.f10590u);
            I(this.f10591v);
            F(this.f10588s);
            E(this.f10589t);
            this.f10587r.setVisibility(4);
            e(this.f10587r, 0);
        } else {
            w();
            C(this.f10587r, 0);
            this.f10587r = null;
            this.f10577h.m0();
            this.f10577h.w0();
        }
        this.f10586q = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(int i10) {
        this.f10590u = i10;
        TextView textView = this.f10587r;
        if (textView != null) {
            this.f10577h.Z(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void I(ColorStateList colorStateList) {
        this.f10591v = colorStateList;
        TextView textView = this.f10587r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(int i10) {
        this.f10595z = i10;
        TextView textView = this.f10594y;
        if (textView != null) {
            androidx.core.widget.j.o(textView, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void K(boolean z10) {
        if (this.f10593x == z10) {
            return;
        }
        h();
        if (z10) {
            androidx.appcompat.widget.b0 b0Var = new androidx.appcompat.widget.b0(this.f10576g);
            this.f10594y = b0Var;
            b0Var.setId(v6.f.S);
            this.f10594y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f10594y.setTypeface(typeface);
            }
            this.f10594y.setVisibility(4);
            p0.w0(this.f10594y, 1);
            J(this.f10595z);
            L(this.A);
            e(this.f10594y, 1);
            this.f10594y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f10594y, 1);
            this.f10594y = null;
            this.f10577h.m0();
            this.f10577h.w0();
        }
        this.f10593x = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f10594y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f10587r, typeface);
            M(this.f10594y, typeface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Q(CharSequence charSequence) {
        h();
        this.f10585p = charSequence;
        this.f10587r.setText(charSequence);
        int i10 = this.f10583n;
        if (i10 != 1) {
            this.f10584o = 1;
        }
        S(i10, this.f10584o, P(this.f10587r, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(CharSequence charSequence) {
        h();
        this.f10592w = charSequence;
        this.f10594y.setText(charSequence);
        int i10 = this.f10583n;
        if (i10 != 2) {
            this.f10584o = 2;
        }
        S(i10, this.f10584o, P(this.f10594y, charSequence));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, int i10) {
        if (this.f10578i == null && this.f10580k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f10576g);
            this.f10578i = linearLayout;
            linearLayout.setOrientation(0);
            this.f10577h.addView(this.f10578i, -1, -2);
            this.f10580k = new FrameLayout(this.f10576g);
            this.f10578i.addView(this.f10580k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f10577h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f10580k.setVisibility(0);
            this.f10580k.addView(textView);
        } else {
            this.f10578i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10578i.setVisibility(0);
        this.f10579j++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        if (g()) {
            EditText editText = this.f10577h.getEditText();
            boolean g10 = m7.c.g(this.f10576g);
            LinearLayout linearLayout = this.f10578i;
            int i10 = v6.d.G;
            p0.K0(linearLayout, v(g10, i10, p0.J(editText)), v(g10, v6.d.H, this.f10576g.getResources().getDimensionPixelSize(v6.d.F)), v(g10, i10, p0.I(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f10581l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return y(this.f10584o);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int n() {
        return this.f10589t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence o() {
        return this.f10588s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence p() {
        return this.f10585p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        TextView textView = this.f10587r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList r() {
        TextView textView = this.f10587r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence s() {
        return this.f10592w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View t() {
        return this.f10594y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int u() {
        TextView textView = this.f10594y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w() {
        this.f10585p = null;
        h();
        if (this.f10583n == 1) {
            if (this.f10593x && !TextUtils.isEmpty(this.f10592w)) {
                this.f10584o = 2;
            } else {
                this.f10584o = 0;
            }
        }
        S(this.f10583n, this.f10584o, P(this.f10587r, ""));
    }

    void x() {
        h();
        int i10 = this.f10583n;
        if (i10 == 2) {
            this.f10584o = 0;
        }
        S(i10, this.f10584o, P(this.f10594y, ""));
    }

    boolean z(int i10) {
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }
}
