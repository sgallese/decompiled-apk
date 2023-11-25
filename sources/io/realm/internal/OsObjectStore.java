package io.realm.internal;

import io.realm.v0;

/* loaded from: classes4.dex */
public class OsObjectStore {
    public static boolean a(v0 v0Var, Runnable runnable) {
        return nativeCallWithLock(v0Var.l(), runnable);
    }

    public static String b(OsSharedRealm osSharedRealm, String str) {
        return nativeGetPrimaryKeyForObject(osSharedRealm.getNativePtr(), Util.e() + str);
    }

    public static long c(OsSharedRealm osSharedRealm) {
        return nativeGetSchemaVersion(osSharedRealm.getNativePtr());
    }

    public static void d(OsSharedRealm osSharedRealm, long j10) {
        nativeSetSchemaVersion(osSharedRealm.getNativePtr(), j10);
    }

    private static native boolean nativeCallWithLock(String str, Runnable runnable);

    private static native boolean nativeDeleteTableForObject(long j10, String str);

    private static native String nativeGetPrimaryKeyForObject(long j10, String str);

    private static native long nativeGetSchemaVersion(long j10);

    private static native void nativeSetPrimaryKeyForObject(long j10, String str, String str2);

    private static native void nativeSetSchemaVersion(long j10, long j11);
}
