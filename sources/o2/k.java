package o2;

import o2.e;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f20466a = new boolean[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(f fVar, n2.d dVar, e eVar) {
        eVar.f20397j = -1;
        eVar.f20399k = -1;
        e.b bVar = fVar.M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.M[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.B.f20374e;
            int P = fVar.P() - eVar.D.f20374e;
            d dVar2 = eVar.B;
            dVar2.f20376g = dVar.q(dVar2);
            d dVar3 = eVar.D;
            dVar3.f20376g = dVar.q(dVar3);
            dVar.f(eVar.B.f20376g, i10);
            dVar.f(eVar.D.f20376g, P);
            eVar.f20397j = 2;
            eVar.k0(i10, P);
        }
        if (fVar.M[1] != bVar2 && eVar.M[1] == e.b.MATCH_PARENT) {
            int i11 = eVar.C.f20374e;
            int v10 = fVar.v() - eVar.E.f20374e;
            d dVar4 = eVar.C;
            dVar4.f20376g = dVar.q(dVar4);
            d dVar5 = eVar.E;
            dVar5.f20376g = dVar.q(dVar5);
            dVar.f(eVar.C.f20376g, i11);
            dVar.f(eVar.E.f20376g, v10);
            if (eVar.Y > 0 || eVar.O() == 8) {
                d dVar6 = eVar.F;
                dVar6.f20376g = dVar.q(dVar6);
                dVar.f(eVar.F.f20376g, eVar.Y + i11);
            }
            eVar.f20399k = 2;
            eVar.z0(i11, v10);
        }
    }

    public static final boolean b(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }
}
