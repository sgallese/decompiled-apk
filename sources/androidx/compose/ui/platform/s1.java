package androidx.compose.ui.platform;

import android.view.MotionEvent;

/* compiled from: AndroidComposeView.android.kt */
/* loaded from: classes.dex */
final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final s1 f2821a = new s1();

    private s1() {
    }

    public final boolean a(MotionEvent motionEvent, int i10) {
        float rawX;
        boolean z10;
        float rawY;
        boolean z11;
        qc.q.i(motionEvent, "event");
        rawX = motionEvent.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            rawY = motionEvent.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }
}
