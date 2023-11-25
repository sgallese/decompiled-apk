package com.habitrpg.android.habitica.extensions;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.extensions.IntExtensionsKt;
import dc.w;
import pc.l;
import qc.q;

/* compiled from: ViewExt.kt */
/* loaded from: classes4.dex */
public final class ViewExtKt {
    public static final void afterMeasured(final View view, final l<? super View, w> lVar) {
        q.i(view, "<this>");
        q.i(lVar, "f");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.habitrpg.android.habitica.extensions.ViewExtKt$afterMeasured$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    lVar.invoke(view);
                }
            }
        });
    }

    public static final void fadeInAnimation(View view, long j10) {
        q.i(view, "<this>");
        view.setAlpha(0.0f);
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(j10);
        ofFloat.start();
    }

    public static /* synthetic */ void fadeInAnimation$default(View view, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        fadeInAnimation(view, j10);
    }

    public static final void flash(final View view) {
        ColorDrawable colorDrawable;
        q.i(view, "<this>");
        Drawable background = view.getBackground();
        final Integer num = null;
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        } else {
            colorDrawable = null;
        }
        if (colorDrawable != null) {
            num = Integer.valueOf(colorDrawable.getColor());
        }
        Context context = view.getContext();
        q.h(context, "getContext(...)");
        if (ContextExtensionsKt.isUsingNightModeResources(context)) {
            view.setBackgroundColor(-12303292);
        } else {
            view.setBackgroundColor(-3355444);
        }
        view.postDelayed(new Runnable() { // from class: com.habitrpg.android.habitica.extensions.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewExtKt.flash$lambda$2(num, view);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flash$lambda$2(Integer num, View view) {
        w wVar;
        q.i(view, "$this_flash");
        if (num != null) {
            view.setBackgroundColor(num.intValue());
            wVar = w.f13270a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            view.setBackgroundResource(0);
        }
    }

    public static final void setScaledPadding(View view, Context context, int i10, int i11, int i12, int i13) {
        q.i(view, "<this>");
        view.setPadding(IntExtensionsKt.dpToPx(i10, context), IntExtensionsKt.dpToPx(i11, context), IntExtensionsKt.dpToPx(i12, context), IntExtensionsKt.dpToPx(i13, context));
    }

    public static final void waitForLayout(final View view, final l<? super View, w> lVar) {
        q.i(view, "<this>");
        q.i(lVar, "f");
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.habitrpg.android.habitica.extensions.ViewExtKt$waitForLayout$1$1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                lVar.invoke(view);
            }
        });
    }
}
