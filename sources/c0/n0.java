package c0;

import android.view.KeyEvent;

/* compiled from: TextFieldKeyInput.android.kt */
/* loaded from: classes.dex */
public final class n0 {
    public static final boolean a(KeyEvent keyEvent) {
        qc.q.i(keyEvent, "$this$isTypedEvent");
        if (keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) {
            return true;
        }
        return false;
    }
}
