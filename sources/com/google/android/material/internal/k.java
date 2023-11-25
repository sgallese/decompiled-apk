package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<b> f10148a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private b f10149b = null;

    /* renamed from: c  reason: collision with root package name */
    ValueAnimator f10150c = null;

    /* renamed from: d  reason: collision with root package name */
    private final Animator.AnimatorListener f10151d = new a();

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            k kVar = k.this;
            if (kVar.f10150c == animator) {
                kVar.f10150c = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a  reason: collision with root package name */
        final int[] f10153a;

        /* renamed from: b  reason: collision with root package name */
        final ValueAnimator f10154b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f10153a = iArr;
            this.f10154b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f10151d);
        this.f10148a.add(bVar);
    }
}
