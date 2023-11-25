package com.google.protobuf;

/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes3.dex */
class w implements p0 {

    /* renamed from: a  reason: collision with root package name */
    private static final w f12463a = new w();

    private w() {
    }

    public static w c() {
        return f12463a;
    }

    @Override // com.google.protobuf.p0
    public o0 a(Class<?> cls) {
        if (x.class.isAssignableFrom(cls)) {
            try {
                return (o0) x.E(cls.asSubclass(x.class)).w();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // com.google.protobuf.p0
    public boolean b(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }
}
