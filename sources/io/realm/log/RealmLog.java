package io.realm.log;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class RealmLog {

    /* renamed from: a  reason: collision with root package name */
    private static String f17944a = "REALM_JAVA";

    public static void a(String str, Object... objArr) {
        b(null, str, objArr);
    }

    public static void b(Throwable th, String str, Object... objArr) {
        f(6, th, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d(null, str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        f(7, th, str, objArr);
    }

    public static int e() {
        return nativeGetLogLevel();
    }

    private static void f(int i10, Throwable th, String str, Object... objArr) {
        if (i10 < e()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null && objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        if (th != null) {
            sb2.append(Log.getStackTraceString(th));
        }
        if (str != null) {
            if (th != null) {
                sb2.append("\n");
            }
            sb2.append(str);
        }
        nativeLog(i10, f17944a, th, sb2.toString());
    }

    public static void g(String str, Object... objArr) {
        h(null, str, objArr);
    }

    public static void h(Throwable th, String str, Object... objArr) {
        f(5, th, str, objArr);
    }

    private static native void nativeAddLogger(RealmLogger realmLogger);

    private static native void nativeClearLoggers();

    static native void nativeCloseCoreLoggerBridge(long j10);

    static native long nativeCreateCoreLoggerBridge(String str);

    private static native int nativeGetLogLevel();

    private static native void nativeLog(int i10, String str, Throwable th, String str2);

    static native void nativeLogToCoreLoggerBridge(long j10, int i10, String str);

    private static native void nativeRegisterDefaultLogger();

    private static native void nativeRemoveLogger(RealmLogger realmLogger);

    private static native void nativeSetLogLevel(int i10);
}
