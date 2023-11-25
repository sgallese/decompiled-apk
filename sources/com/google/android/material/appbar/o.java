package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.p;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes3.dex */
class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f9510a = {16843848};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, float f10) {
        int integer = view.getResources().getInteger(v6.g.f24738a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{16842910, v6.b.Z, -v6.b.f24623a0}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, AttributeSet attributeSet, int i10, int i11) {
        Context context = view.getContext();
        TypedArray i12 = p.i(context, attributeSet, f9510a, i10, i11, new int[0]);
        try {
            if (i12.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, i12.getResourceId(0, 0)));
            }
        } finally {
            i12.recycle();
        }
    }
}
