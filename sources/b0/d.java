package b0;

import a1.e4;
import a1.u0;
import a1.z3;
import j2.r;
import qc.q;
import z0.l;
import z0.m;

/* compiled from: CutCornerShape.kt */
/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, b bVar2, b bVar3, b bVar4) {
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
        q.i(rVar, "layoutDirection");
        if (f10 + f11 + f13 + f12 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return new z3.b(m.c(j10));
        }
        e4 a10 = u0.a();
        r rVar2 = r.Ltr;
        if (rVar == rVar2) {
            f14 = f10;
        } else {
            f14 = f11;
        }
        a10.l(0.0f, f14);
        a10.r(f14, 0.0f);
        if (rVar == rVar2) {
            f10 = f11;
        }
        a10.r(l.i(j10) - f10, 0.0f);
        a10.r(l.i(j10), f10);
        if (rVar == rVar2) {
            f15 = f12;
        } else {
            f15 = f13;
        }
        a10.r(l.i(j10), l.g(j10) - f15);
        a10.r(l.i(j10) - f15, l.g(j10));
        if (rVar == rVar2) {
            f12 = f13;
        }
        a10.r(f12, l.g(j10));
        a10.r(0.0f, l.g(j10) - f12);
        a10.close();
        return new z3.a(a10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (q.d(i(), dVar.i()) && q.d(h(), dVar.h()) && q.d(f(), dVar.f()) && q.d(g(), dVar.g())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((i().hashCode() * 31) + h().hashCode()) * 31) + f().hashCode()) * 31) + g().hashCode();
    }

    @Override // b0.a
    /* renamed from: j  reason: merged with bridge method [inline-methods] */
    public d c(b bVar, b bVar2, b bVar3, b bVar4) {
        q.i(bVar, "topStart");
        q.i(bVar2, "topEnd");
        q.i(bVar3, "bottomEnd");
        q.i(bVar4, "bottomStart");
        return new d(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "CutCornerShape(topStart = " + i() + ", topEnd = " + h() + ", bottomEnd = " + f() + ", bottomStart = " + g() + ')';
    }
}
