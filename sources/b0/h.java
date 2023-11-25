package b0;

import a1.z3;
import j2.r;
import qc.q;
import z0.k;
import z0.m;

/* compiled from: RoundedCornerShape.kt */
/* loaded from: classes.dex */
public final class h extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
        q.i(bVar, "topStart");
        q.i(bVar2, "topEnd");
        q.i(bVar3, "bottomEnd");
        q.i(bVar4, "bottomStart");
    }

    @Override // b0.a
    public z3 e(long j10, float f10, float f11, float f12, float f13, r rVar) {
        boolean z10;
        float f14;
        float f15;
        float f16;
        float f17;
        q.i(rVar, "layoutDirection");
        if (f10 + f11 + f12 + f13 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new z3.b(m.c(j10));
        }
        z0.h c10 = m.c(j10);
        r rVar2 = r.Ltr;
        if (rVar == rVar2) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        long b10 = z0.b.b(f14, 0.0f, 2, null);
        if (rVar == rVar2) {
            f15 = f11;
        } else {
            f15 = f10;
        }
        long b11 = z0.b.b(f15, 0.0f, 2, null);
        if (rVar == rVar2) {
            f16 = f12;
        } else {
            f16 = f13;
        }
        long b12 = z0.b.b(f16, 0.0f, 2, null);
        if (rVar == rVar2) {
            f17 = f13;
        } else {
            f17 = f12;
        }
        return new z3.c(k.b(c10, b10, b11, b12, z0.b.b(f17, 0.0f, 2, null)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (q.d(i(), hVar.i()) && q.d(h(), hVar.h()) && q.d(f(), hVar.f()) && q.d(g(), hVar.g())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    @Override // b0.a
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public h c(b bVar, b bVar2, b bVar3, b bVar4) {
        q.i(bVar, "topStart");
        q.i(bVar2, "topEnd");
        q.i(bVar3, "bottomEnd");
        q.i(bVar4, "bottomStart");
        return new h(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
