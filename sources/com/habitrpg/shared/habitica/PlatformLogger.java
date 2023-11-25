package com.habitrpg.shared.habitica;

import android.util.Log;
import qc.q;

/* compiled from: PlatformLogger.kt */
/* loaded from: classes4.dex */
public final class PlatformLogger {
    public final boolean getEnabled() {
        return true;
    }

    public final void logDebug(String str, String str2) {
        q.i(str, "tag");
        q.i(str2, "message");
        Log.d(str, str2);
    }

    public final void logError(String str, String str2) {
        q.i(str, "tag");
        q.i(str2, "message");
        Log.e(str, str2);
    }

    public final void logInfo(String str, String str2) {
        q.i(str, "tag");
        q.i(str2, "message");
        Log.i(str, str2);
    }

    public final void logWarning(String str, String str2) {
        q.i(str, "tag");
        q.i(str2, "message");
        Log.w(str, str2);
    }

    public final void logError(String str, String str2, Throwable th) {
        q.i(str, "tag");
        q.i(str2, "message");
        q.i(th, "exception");
        Log.e(str, str2, th);
    }
}
