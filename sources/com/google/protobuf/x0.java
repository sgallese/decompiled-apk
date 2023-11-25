package com.google.protobuf;

/* compiled from: NewInstanceSchemas.java */
/* loaded from: classes3.dex */
final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final v0 f12475a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final v0 f12476b = new w0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 a() {
        return f12475a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static v0 b() {
        return f12476b;
    }

    private static v0 c() {
        try {
            return (v0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
