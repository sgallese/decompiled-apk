package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    private AnimatorSet f10674b;

    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f10674b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    public boolean H(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        AnimatorSet animatorSet = this.f10674b;
        if (animatorSet != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet J = J(view, view2, z10, z12);
        this.f10674b = J;
        J.addListener(new a());
        this.f10674b.start();
        if (!z11) {
            this.f10674b.end();
        }
        return true;
    }

    protected abstract AnimatorSet J(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
