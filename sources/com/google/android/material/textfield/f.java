package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes3.dex */
public class f extends s {

    /* renamed from: e  reason: collision with root package name */
    private final int f10511e;

    /* renamed from: f  reason: collision with root package name */
    private final int f10512f;

    /* renamed from: g  reason: collision with root package name */
    private final TimeInterpolator f10513g;

    /* renamed from: h  reason: collision with root package name */
    private final TimeInterpolator f10514h;

    /* renamed from: i  reason: collision with root package name */
    private EditText f10515i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnClickListener f10516j;

    /* renamed from: k  reason: collision with root package name */
    private final View.OnFocusChangeListener f10517k;

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f10518l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f10519m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f10567b.Z(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f10567b.Z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(r rVar) {
        super(rVar);
        this.f10516j = new View.OnClickListener() { // from class: com.google.android.material.textfield.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.this.G(view);
            }
        };
        this.f10517k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f.this.H(view, z10);
            }
        };
        Context context = rVar.getContext();
        int i10 = v6.b.K;
        this.f10511e = j7.a.f(context, i10, 100);
        this.f10512f = j7.a.f(rVar.getContext(), i10, 150);
        this.f10513g = j7.a.g(rVar.getContext(), v6.b.P, w6.a.f25410a);
        this.f10514h = j7.a.g(rVar.getContext(), v6.b.O, w6.a.f25413d);
    }

    private void A(boolean z10) {
        boolean z11;
        if (this.f10567b.E() == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && !this.f10518l.isRunning()) {
            this.f10519m.cancel();
            this.f10518l.start();
            if (z11) {
                this.f10518l.end();
            }
        } else if (!z10) {
            this.f10518l.cancel();
            this.f10519m.start();
            if (z11) {
                this.f10519m.end();
            }
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f10513g);
        ofFloat.setDuration(this.f10511e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.E(valueAnimator);
            }
        });
        return ofFloat;
    }

    private ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f10514h);
        ofFloat.setDuration(this.f10512f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.F(valueAnimator);
            }
        });
        return ofFloat;
    }

    private void D() {
        ValueAnimator C = C();
        ValueAnimator B = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10518l = animatorSet;
        animatorSet.playTogether(C, B);
        this.f10518l.addListener(new a());
        ValueAnimator B2 = B(1.0f, 0.0f);
        this.f10519m = B2;
        B2.addListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(ValueAnimator valueAnimator) {
        this.f10569d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f10569d.setScaleX(floatValue);
        this.f10569d.setScaleY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(View view) {
        EditText editText = this.f10515i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(View view, boolean z10) {
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        A(true);
    }

    private boolean J() {
        EditText editText = this.f10515i;
        if (editText != null && ((editText.hasFocus() || this.f10569d.hasFocus()) && this.f10515i.getText().length() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f10567b.w() != null) {
            return;
        }
        A(J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public int c() {
        return v6.j.f24769e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public int d() {
        return v6.e.f24710i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener e() {
        return this.f10517k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public View.OnClickListener f() {
        return this.f10516j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public View.OnFocusChangeListener g() {
        return this.f10517k;
    }

    @Override // com.google.android.material.textfield.s
    public void n(EditText editText) {
        this.f10515i = editText;
        this.f10566a.setEndIconVisible(J());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public void q(boolean z10) {
        if (this.f10567b.w() == null) {
            return;
        }
        A(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public void s() {
        D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.s
    public void u() {
        EditText editText = this.f10515i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.a
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.I();
                }
            });
        }
    }
}
