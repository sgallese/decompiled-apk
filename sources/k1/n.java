package k1;

import android.view.MotionEvent;

/* compiled from: MotionEventAdapter.android.kt */
/* loaded from: classes.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f19214a = new n();

    private n() {
    }

    public final long a(MotionEvent motionEvent, int i10) {
        float rawX;
        float rawY;
        qc.q.i(motionEvent, "motionEvent");
        rawX = motionEvent.getRawX(i10);
        rawY = motionEvent.getRawY(i10);
        return z0.g.a(rawX, rawY);
    }
}
