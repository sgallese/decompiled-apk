package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtensionRegistryFactory.java */
/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f12381a = c();

    public static o a() {
        o b10 = b("getEmptyRegistry");
        if (b10 == null) {
            return o.f12386d;
        }
        return b10;
    }

    private static final o b(String str) {
        Class<?> cls = f12381a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
