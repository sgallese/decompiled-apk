package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ViewLayerContainer.android.kt */
/* loaded from: classes.dex */
public class e1 extends ViewGroup {

    /* renamed from: f  reason: collision with root package name */
    private boolean f2656f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(Context context) {
        super(context);
        qc.q.i(context, "context");
        setClipChildren(false);
        setTag(v0.h.I, Boolean.TRUE);
    }

    public final void a(a1.h1 h1Var, View view, long j10) {
        qc.q.i(h1Var, "canvas");
        qc.q.i(view, "view");
        super.drawChild(a1.f0.c(h1Var), view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        boolean z10;
        qc.q.i(canvas, "canvas");
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 < childCount) {
                View childAt = getChildAt(i10);
                qc.q.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                if (((h4) childAt).s()) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            this.f2656f = true;
            try {
                super.dispatchDraw(canvas);
            } finally {
                this.f2656f = false;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f2656f) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
