package com.google.protobuf;

import java.io.IOException;

/* compiled from: UnknownFieldSetLiteSchema.java */
/* loaded from: classes3.dex */
class n1 extends l1<m1, m1> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: A  reason: merged with bridge method [inline-methods] */
    public m1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: B  reason: merged with bridge method [inline-methods] */
    public int h(m1 m1Var) {
        return m1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: C  reason: merged with bridge method [inline-methods] */
    public int i(m1 m1Var) {
        return m1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: D  reason: merged with bridge method [inline-methods] */
    public m1 k(m1 m1Var, m1 m1Var2) {
        if (!m1Var2.equals(m1.c())) {
            return m1.i(m1Var, m1Var2);
        }
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: E  reason: merged with bridge method [inline-methods] */
    public m1 n() {
        return m1.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: F  reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m1 m1Var) {
        p(obj, m1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: G  reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m1 m1Var) {
        ((x) obj).unknownFields = m1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: H  reason: merged with bridge method [inline-methods] */
    public m1 r(m1 m1Var) {
        m1Var.h();
        return m1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: I  reason: merged with bridge method [inline-methods] */
    public void s(m1 m1Var, s1 s1Var) throws IOException {
        m1Var.o(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: J  reason: merged with bridge method [inline-methods] */
    public void t(m1 m1Var, s1 s1Var) throws IOException {
        m1Var.q(s1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    public boolean q(e1 e1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: u  reason: merged with bridge method [inline-methods] */
    public void a(m1 m1Var, int i10, int i11) {
        m1Var.m(r1.c(i10, 5), Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: v  reason: merged with bridge method [inline-methods] */
    public void b(m1 m1Var, int i10, long j10) {
        m1Var.m(r1.c(i10, 1), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: w  reason: merged with bridge method [inline-methods] */
    public void c(m1 m1Var, int i10, m1 m1Var2) {
        m1Var.m(r1.c(i10, 3), m1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: x  reason: merged with bridge method [inline-methods] */
    public void d(m1 m1Var, int i10, h hVar) {
        m1Var.m(r1.c(i10, 2), hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: y  reason: merged with bridge method [inline-methods] */
    public void e(m1 m1Var, int i10, long j10) {
        m1Var.m(r1.c(i10, 0), Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.l1
    /* renamed from: z  reason: merged with bridge method [inline-methods] */
    public m1 f(Object obj) {
        m1 g10 = g(obj);
        if (g10 == m1.c()) {
            m1 j10 = m1.j();
            p(obj, j10);
            return j10;
        }
        return g10;
    }
}
