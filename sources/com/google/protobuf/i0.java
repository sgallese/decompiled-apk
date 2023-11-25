package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes3.dex */
public final class i0 implements g1 {

    /* renamed from: b  reason: collision with root package name */
    private static final p0 f12326b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final p0 f12327a;

    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes3.dex */
    static class a implements p0 {
        a() {
        }

        @Override // com.google.protobuf.p0
        public o0 a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.p0
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ManifestSchemaFactory.java */
    /* loaded from: classes3.dex */
    public static class b implements p0 {

        /* renamed from: a  reason: collision with root package name */
        private p0[] f12328a;

        b(p0... p0VarArr) {
            this.f12328a = p0VarArr;
        }

        @Override // com.google.protobuf.p0
        public o0 a(Class<?> cls) {
            for (p0 p0Var : this.f12328a) {
                if (p0Var.b(cls)) {
                    return p0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.p0
        public boolean b(Class<?> cls) {
            for (p0 p0Var : this.f12328a) {
                if (p0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public i0() {
        this(b());
    }

    private static p0 b() {
        return new b(w.c(), c());
    }

    private static p0 c() {
        try {
            return (p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f12326b;
        }
    }

    private static boolean d(o0 o0Var) {
        if (o0Var.c() == a1.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> f1<T> e(Class<T> cls, o0 o0Var) {
        if (x.class.isAssignableFrom(cls)) {
            if (d(o0Var)) {
                return t0.N(cls, o0Var, x0.b(), g0.b(), h1.M(), r.b(), n0.b());
            }
            return t0.N(cls, o0Var, x0.b(), g0.b(), h1.M(), null, n0.b());
        } else if (d(o0Var)) {
            return t0.N(cls, o0Var, x0.a(), g0.a(), h1.H(), r.a(), n0.a());
        } else {
            return t0.N(cls, o0Var, x0.a(), g0.a(), h1.I(), null, n0.a());
        }
    }

    @Override // com.google.protobuf.g1
    public <T> f1<T> a(Class<T> cls) {
        h1.J(cls);
        o0 a10 = this.f12327a.a(cls);
        if (a10.a()) {
            if (x.class.isAssignableFrom(cls)) {
                return u0.l(h1.M(), r.b(), a10.b());
            }
            return u0.l(h1.H(), r.a(), a10.b());
        }
        return e(cls, a10);
    }

    private i0(p0 p0Var) {
        this.f12327a = (p0) z.b(p0Var, "messageInfoFactory");
    }
}
