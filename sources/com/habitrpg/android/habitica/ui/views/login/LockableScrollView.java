package com.habitrpg.android.habitica.ui.views.login;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import qc.q;

/* compiled from: LockableScrollView.kt */
/* loaded from: classes4.dex */
public final class LockableScrollView extends NestedScrollView {
    public static final int $stable = 8;
    private boolean isScrollable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.isScrollable = true;
    }

    public final boolean isScrollable() {
        return this.isScrollable;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        q.i(motionEvent, "ev");
        if (!this.isScrollable) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q.i(motionEvent, "ev");
        if (motionEvent.getAction() == 0) {
            boolean z10 = this.isScrollable;
            if (z10) {
                return super.onTouchEvent(motionEvent);
            }
            return z10;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setScrollable(boolean z10) {
        this.isScrollable = z10;
    }
}
