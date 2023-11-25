package a1;

import android.graphics.Canvas;

/* compiled from: CanvasUtils.android.kt */
/* loaded from: classes.dex */
final class n1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n1 f128a = new n1();

    private n1() {
    }

    public final void a(Canvas canvas, boolean z10) {
        qc.q.i(canvas, "canvas");
        if (z10) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
