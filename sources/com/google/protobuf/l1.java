package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes3.dex */
abstract class l1<T, B> {
    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(B b10, int i10, h hVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e(B b10, int i10, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B f(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int h(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int i(T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void j(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T k(T t10, T t11);

    final void l(B b10, e1 e1Var) throws IOException {
        while (e1Var.B() != Integer.MAX_VALUE && m(b10, e1Var)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(B b10, e1 e1Var) throws IOException {
        int u10 = e1Var.u();
        int a10 = r1.a(u10);
        int b11 = r1.b(u10);
        if (b11 != 0) {
            if (b11 != 1) {
                if (b11 != 2) {
                    if (b11 != 3) {
                        if (b11 != 4) {
                            if (b11 == 5) {
                                a(b10, a10, e1Var.i());
                                return true;
                            }
                            throw InvalidProtocolBufferException.e();
                        }
                        return false;
                    }
                    B n10 = n();
                    int c10 = r1.c(a10, 4);
                    l(n10, e1Var);
                    if (c10 == e1Var.u()) {
                        c(b10, a10, r(n10));
                        return true;
                    }
                    throw InvalidProtocolBufferException.b();
                }
                d(b10, a10, e1Var.G());
                return true;
            }
            b(b10, a10, e1Var.c());
            return true;
        }
        e(b10, a10, e1Var.N());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B n();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void o(Object obj, B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void p(Object obj, T t10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean q(e1 e1Var);

    abstract T r(B b10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void s(T t10, s1 s1Var) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void t(T t10, s1 s1Var) throws IOException;
}
