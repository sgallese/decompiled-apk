package androidx.compose.ui.platform;

import android.os.Looper;

/* compiled from: AndroidUiDispatcher.android.kt */
/* loaded from: classes.dex */
public final class n0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
