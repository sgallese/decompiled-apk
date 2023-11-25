package com.google.protobuf;

/* compiled from: ExtensionSchemas.java */
/* loaded from: classes3.dex */
final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final p<?> f12422a = new q();

    /* renamed from: b  reason: collision with root package name */
    private static final p<?> f12423b = c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> a() {
        p<?> pVar = f12423b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p<?> b() {
        return f12422a;
    }

    private static p<?> c() {
        try {
            return (p) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
