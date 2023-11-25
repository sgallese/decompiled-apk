package i1;

import android.view.KeyEvent;
import qc.q;

/* compiled from: KeyEvent.android.kt */
/* loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$key");
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return c.f16951a.c();
            }
            return c.f16951a.b();
        }
        return c.f16951a.a();
    }

    public static final int c(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$utf16CodePoint");
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$isAltPressed");
        return keyEvent.isAltPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }

    public static final boolean f(KeyEvent keyEvent) {
        q.i(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
