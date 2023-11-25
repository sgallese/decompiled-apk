package com.google.protobuf;

/* compiled from: Android.java */
/* loaded from: classes3.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12264a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f12265b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f12266c;

    static {
        boolean z10;
        if (!f12264a && a("org.robolectric.Robolectric") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f12266c = z10;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return f12265b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c() {
        if (!f12264a && (f12265b == null || f12266c)) {
            return false;
        }
        return true;
    }
}
