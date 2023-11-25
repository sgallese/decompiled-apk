package com.habitrpg.android.habitica.ui.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.b0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import qc.q;

/* compiled from: EllipsisTextView.kt */
/* loaded from: classes4.dex */
public final class EllipsisTextView extends b0 {
    public static final int $stable = 8;
    private boolean ellipses;
    private final ArrayList<EllipsisListener> ellipsesListeners;

    /* compiled from: EllipsisTextView.kt */
    /* loaded from: classes4.dex */
    public interface EllipsisListener {
        void ellipsisStateChanged(boolean z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsisTextView(Context context) {
        super(context);
        q.i(context, "context");
        this.ellipsesListeners = new ArrayList<>();
    }

    public final void addEllipsesListener(EllipsisListener ellipsisListener) {
        ellipsisListener.getClass();
        this.ellipsesListeners.add(ellipsisListener);
    }

    public final boolean hadEllipses() {
        return this.ellipses;
    }

    @Override // android.view.View
    public void layout(int i10, int i11, int i12, int i13) {
        super.layout(i10, i11, i12, i13);
        this.ellipses = false;
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() >= getMaxLines()) {
            this.ellipses = true;
        }
        Iterator<EllipsisListener> it = this.ellipsesListeners.iterator();
        while (it.hasNext()) {
            it.next().ellipsisStateChanged(this.ellipses);
        }
    }

    public final void removeEllipsesListener(EllipsisListener ellipsisListener) {
        q.i(ellipsisListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.ellipsesListeners.remove(ellipsisListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsisTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.ellipsesListeners = new ArrayList<>();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EllipsisTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.i(context, "context");
        q.i(attributeSet, "attrs");
        this.ellipsesListeners = new ArrayList<>();
    }
}
