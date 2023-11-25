package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.r1;
import com.google.protobuf.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: MessageSetSchema.java */
/* loaded from: classes3.dex */
final class u0<T> implements f1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f12456a;

    /* renamed from: b  reason: collision with root package name */
    private final l1<?, ?> f12457b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f12458c;

    /* renamed from: d  reason: collision with root package name */
    private final p<?> f12459d;

    private u0(l1<?, ?> l1Var, p<?> pVar, q0 q0Var) {
        this.f12457b = l1Var;
        this.f12458c = pVar.e(q0Var);
        this.f12459d = pVar;
        this.f12456a = q0Var;
    }

    private <UT, UB> int j(l1<UT, UB> l1Var, T t10) {
        return l1Var.i(l1Var.g(t10));
    }

    private <UT, UB, ET extends t.b<ET>> void k(l1<UT, UB> l1Var, p<ET> pVar, T t10, e1 e1Var, o oVar) throws IOException {
        UB f10 = l1Var.f(t10);
        t<ET> d10 = pVar.d(t10);
        do {
            try {
                if (e1Var.B() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                l1Var.o(t10, f10);
            }
        } while (m(e1Var, oVar, pVar, d10, l1Var, f10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> u0<T> l(l1<?, ?> l1Var, p<?> pVar, q0 q0Var) {
        return new u0<>(l1Var, pVar, q0Var);
    }

    private <UT, UB, ET extends t.b<ET>> boolean m(e1 e1Var, o oVar, p<ET> pVar, t<ET> tVar, l1<UT, UB> l1Var, UB ub2) throws IOException {
        int u10 = e1Var.u();
        if (u10 != r1.f12424a) {
            if (r1.b(u10) == 2) {
                Object b10 = pVar.b(oVar, this.f12456a, r1.a(u10));
                if (b10 != null) {
                    pVar.h(e1Var, b10, oVar, tVar);
                    return true;
                }
                return l1Var.m(ub2, e1Var);
            }
            return e1Var.J();
        }
        Object obj = null;
        h hVar = null;
        int i10 = 0;
        while (e1Var.B() != Integer.MAX_VALUE) {
            int u11 = e1Var.u();
            if (u11 == r1.f12426c) {
                i10 = e1Var.o();
                obj = pVar.b(oVar, this.f12456a, i10);
            } else if (u11 == r1.f12427d) {
                if (obj != null) {
                    pVar.h(e1Var, obj, oVar, tVar);
                } else {
                    hVar = e1Var.G();
                }
            } else if (!e1Var.J()) {
                break;
            }
        }
        if (e1Var.u() == r1.f12425b) {
            if (hVar != null) {
                if (obj != null) {
                    pVar.i(hVar, obj, oVar, tVar);
                } else {
                    l1Var.d(ub2, i10, hVar);
                }
            }
            return true;
        }
        throw InvalidProtocolBufferException.b();
    }

    private <UT, UB> void n(l1<UT, UB> l1Var, T t10, s1 s1Var) throws IOException {
        l1Var.s(l1Var.g(t10), s1Var);
    }

    @Override // com.google.protobuf.f1
    public void a(T t10, T t11) {
        h1.G(this.f12457b, t10, t11);
        if (this.f12458c) {
            h1.E(this.f12459d, t10, t11);
        }
    }

    @Override // com.google.protobuf.f1
    public void b(T t10, s1 s1Var) throws IOException {
        Iterator<Map.Entry<?, Object>> s10 = this.f12459d.c(t10).s();
        while (s10.hasNext()) {
            Map.Entry<?, Object> next = s10.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.h() == r1.c.MESSAGE && !bVar.a() && !bVar.isPacked()) {
                if (next instanceof c0.b) {
                    s1Var.e(bVar.getNumber(), ((c0.b) next).a().e());
                } else {
                    s1Var.e(bVar.getNumber(), next.getValue());
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        n(this.f12457b, t10, s1Var);
    }

    @Override // com.google.protobuf.f1
    public void c(T t10) {
        this.f12457b.j(t10);
        this.f12459d.f(t10);
    }

    @Override // com.google.protobuf.f1
    public final boolean d(T t10) {
        return this.f12459d.c(t10).p();
    }

    @Override // com.google.protobuf.f1
    public void e(T t10, e1 e1Var, o oVar) throws IOException {
        k(this.f12457b, this.f12459d, t10, e1Var, oVar);
    }

    @Override // com.google.protobuf.f1
    public boolean f(T t10, T t11) {
        if (!this.f12457b.g(t10).equals(this.f12457b.g(t11))) {
            return false;
        }
        if (this.f12458c) {
            return this.f12459d.c(t10).equals(this.f12459d.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.f1
    public int g(T t10) {
        int j10 = j(this.f12457b, t10) + 0;
        if (this.f12458c) {
            return j10 + this.f12459d.c(t10).j();
        }
        return j10;
    }

    @Override // com.google.protobuf.f1
    public T h() {
        return (T) this.f12456a.n().x();
    }

    @Override // com.google.protobuf.f1
    public int i(T t10) {
        int hashCode = this.f12457b.g(t10).hashCode();
        if (this.f12458c) {
            return (hashCode * 53) + this.f12459d.c(t10).hashCode();
        }
        return hashCode;
    }
}
