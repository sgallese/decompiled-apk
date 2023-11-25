package com.habitrpg.common.habitica.helpers;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import qc.q;

/* compiled from: Animations.kt */
/* loaded from: classes4.dex */
public final class Animations {
    public static final Animations INSTANCE = new Animations();

    private Animations() {
    }

    public static /* synthetic */ Animation bobbingAnimation$default(Animations animations, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 8.0f;
        }
        return animations.bobbingAnimation(f10);
    }

    public static /* synthetic */ void circularHide$default(Animations animations, View view, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 300;
        }
        animations.circularHide(view, j10);
    }

    public static /* synthetic */ void circularReveal$default(Animations animations, View view, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 300;
        }
        animations.circularReveal(view, j10);
    }

    public static /* synthetic */ Animation fadeInAnimation$default(Animations animations, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 300;
        }
        return animations.fadeInAnimation(j10);
    }

    public static /* synthetic */ Animation negativeShakeAnimation$default(Animations animations, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return animations.negativeShakeAnimation(f10);
    }

    private final float randomFloat(float f10, float f11) {
        return f10 + (tc.c.f23726f.f() * (f11 - f10));
    }

    public final Animation bobbingAnimation(float f10) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, -f10, f10);
        translateAnimation.setDuration(2500L);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        translateAnimation.setRepeatCount(-1);
        translateAnimation.setRepeatMode(2);
        return translateAnimation;
    }

    public final void circularHide(final View view, long j10) {
        q.i(view, "view");
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, height, (float) Math.hypot(width, height), 0.0f);
        createCircularReveal.setDuration(j10);
        createCircularReveal.setInterpolator(new AccelerateInterpolator());
        q.f(createCircularReveal);
        createCircularReveal.addListener(new Animator.AnimatorListener() { // from class: com.habitrpg.common.habitica.helpers.Animations$circularHide$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        createCircularReveal.start();
    }

    public final void circularReveal(View view, long j10) {
        q.i(view, "view");
        if (!view.isAttachedToWindow()) {
            return;
        }
        int width = view.getWidth() / 2;
        int height = view.getHeight() / 2;
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, height, 0.0f, (float) Math.hypot(width, height));
        createCircularReveal.setDuration(j10);
        createCircularReveal.setInterpolator(new AccelerateInterpolator());
        view.setVisibility(0);
        createCircularReveal.start();
    }

    public final Animation fadeInAnimation(long j10) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        alphaAnimation.setFillBefore(true);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setDuration(j10);
        return alphaAnimation;
    }

    public final Animation fadeOutAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        return alphaAnimation;
    }

    public final Animation negativeShakeAnimation(float f10) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new LinearInterpolator());
        TranslateAnimation translateAnimation = new TranslateAnimation(randomFloat((-2.0f) * f10, 0.0f), randomFloat(0.0f, 2.0f * f10), randomFloat((-1.0f) * f10, 0.0f), randomFloat(0.0f, 1.0f * f10));
        translateAnimation.setDuration(70L);
        translateAnimation.setRepeatCount(5);
        translateAnimation.setRepeatMode(2);
        animationSet.addAnimation(translateAnimation);
        RotateAnimation rotateAnimation = new RotateAnimation(randomFloat((-0.4f) * f10, 0.0f), randomFloat(0.0f, f10 * 0.4f), 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(70L);
        rotateAnimation.setRepeatCount(5);
        rotateAnimation.setRepeatMode(2);
        animationSet.addAnimation(rotateAnimation);
        return animationSet;
    }
}
