package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes3.dex */
class b extends a {
    private StateListAnimator N;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, o7.b bVar) {
        super(floatingActionButton, bVar);
    }

    private StateListAnimator f0(float f10, float f11, float f12) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(a.H, g0(f10, f12));
        stateListAnimator.addState(a.I, g0(f10, f11));
        stateListAnimator.addState(a.J, g0(f10, f11));
        stateListAnimator.addState(a.K, g0(f10, f11));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f10046v, "elevation", f10).setDuration(0L));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 22 && i10 <= 24) {
            FloatingActionButton floatingActionButton = this.f10046v;
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f10046v, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(a.C);
        stateListAnimator.addState(a.L, animatorSet);
        stateListAnimator.addState(a.M, g0(0.0f, 0.0f));
        return stateListAnimator;
    }

    private Animator g0(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f10046v, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f10046v, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(a.C);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void A() {
        c0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void C(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f10046v.isEnabled()) {
                this.f10046v.setElevation(this.f10031g);
                if (this.f10046v.isPressed()) {
                    this.f10046v.setTranslationZ(this.f10033i);
                    return;
                } else if (!this.f10046v.isFocused() && !this.f10046v.isHovered()) {
                    this.f10046v.setTranslationZ(0.0f);
                    return;
                } else {
                    this.f10046v.setTranslationZ(this.f10032h);
                    return;
                }
            }
            this.f10046v.setElevation(0.0f);
            this.f10046v.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void D(float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT == 21) {
            this.f10046v.refreshDrawableState();
        } else if (this.f10046v.getStateListAnimator() == this.N) {
            StateListAnimator f02 = f0(f10, f11, f12);
            this.N = f02;
            this.f10046v.setStateListAnimator(f02);
        }
        if (W()) {
            c0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean I() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void S(ColorStateList colorStateList) {
        Drawable drawable = this.f10027c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(n7.b.e(colorStateList));
        } else {
            super.S(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    boolean W() {
        if (!this.f10047w.c() && Y()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.a
    public float m() {
        return this.f10046v.getElevation();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void r(Rect rect) {
        if (this.f10047w.c()) {
            super.r(rect);
        } else if (!Y()) {
            int sizeDimension = (this.f10034j - this.f10046v.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.a
    void a0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.floatingactionbutton.a
    public void y() {
    }
}
