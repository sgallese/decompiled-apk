package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import qc.q;

/* compiled from: FadingViewPager.kt */
/* loaded from: classes4.dex */
public final class FadingViewPager extends ViewPager {
    public static final int $stable = 8;
    private boolean disableFading;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingViewPager(Context context) {
        super(context);
        q.i(context, "context");
        setTransformer();
    }

    private final void setTransformer() {
        setPageTransformer(true, new ViewPager.k() { // from class: com.habitrpg.android.habitica.ui.views.e
            @Override // androidx.viewpager.widget.ViewPager.k
            public final void a(View view, float f10) {
                FadingViewPager.setTransformer$lambda$0(FadingViewPager.this, view, f10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTransformer$lambda$0(FadingViewPager fadingViewPager, View view, float f10) {
        boolean z10;
        q.i(fadingViewPager, "this$0");
        q.i(view, "page");
        view.setTranslationX(view.getWidth() * (-f10));
        if (f10 > -1.0f && f10 < 1.0f) {
            if (f10 == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
                return;
            } else if (fadingViewPager.disableFading) {
                return;
            } else {
                view.setVisibility(0);
                view.setAlpha(1.0f - Math.abs(f10));
                return;
            }
        }
        view.setAlpha(0.0f);
        view.setVisibility(4);
    }

    public final boolean getDisableFading() {
        return this.disableFading;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        q.i(motionEvent, "event");
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q.i(motionEvent, "ev");
        return false;
    }

    public final void setDisableFading(boolean z10) {
        this.disableFading = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadingViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        setTransformer();
    }
}
