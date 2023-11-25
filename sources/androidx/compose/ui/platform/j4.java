package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: ViewLayerContainer.android.kt */
/* loaded from: classes.dex */
public final class j4 extends e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(Context context) {
        super(context);
        qc.q.i(context, "context");
    }

    @Override // androidx.compose.ui.platform.e1, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        qc.q.i(canvas, "canvas");
    }

    protected final void dispatchGetDisplayList() {
    }
}
