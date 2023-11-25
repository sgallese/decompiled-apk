package c0;

import android.view.KeyEvent;

/* compiled from: KeyEventHelpers.android.kt */
/* loaded from: classes.dex */
public final class r {
    public static final boolean a(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "$this$cancelsTextSelection");
        if (keyEvent.getKeyCode() == 4 && i1.c.e(i1.d.b(keyEvent), i1.c.f16951a.b())) {
            return true;
        }
        return false;
    }

    public static final void b() {
    }
}
