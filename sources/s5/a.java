package s5;

import q5.e;
import q5.i;
import qc.q;

/* compiled from: AmplitudeDestination.kt */
/* loaded from: classes.dex */
public final class a extends r5.a {

    /* renamed from: r  reason: collision with root package name */
    private r5.b f23028r;

    private final void k(q5.a aVar) {
        if (aVar != null) {
            if (aVar.H0()) {
                r5.b bVar = this.f23028r;
                if (bVar == null) {
                    q.z("pipeline");
                    bVar = null;
                }
                bVar.s(aVar);
                return;
            }
            i().j().d(q.q("Event is invalid for missing information like userId and deviceId. Dropping event: ", aVar.D0()));
        }
    }

    @Override // r5.a, r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        super.b(aVar);
        r5.b bVar = new r5.b(aVar);
        this.f23028r = bVar;
        bVar.v();
        h(new c());
    }

    @Override // r5.a, r5.c
    public q5.c d(q5.c cVar) {
        q.i(cVar, "payload");
        k(cVar);
        return cVar;
    }

    @Override // r5.a, r5.c
    public i e(i iVar) {
        q.i(iVar, "payload");
        k(iVar);
        return iVar;
    }

    @Override // r5.a, r5.c
    public q5.a f(q5.a aVar) {
        q.i(aVar, "payload");
        k(aVar);
        return aVar;
    }

    @Override // r5.a, r5.c
    public void flush() {
        r5.b bVar = this.f23028r;
        if (bVar == null) {
            q.z("pipeline");
            bVar = null;
        }
        bVar.l();
    }

    @Override // r5.a, r5.c
    public e g(e eVar) {
        q.i(eVar, "payload");
        k(eVar);
        return eVar;
    }
}
