package s5;

import qc.q;
import r5.f;

/* compiled from: IdentityEventSender.kt */
/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: f  reason: collision with root package name */
    private final f.b f23032f = f.b.Before;

    /* renamed from: m  reason: collision with root package name */
    public p5.a f23033m;

    /* renamed from: p  reason: collision with root package name */
    private u5.b f23034p;

    @Override // r5.f
    public q5.a a(q5.a aVar) {
        q.i(aVar, "event");
        if (aVar.G0() != null) {
            u5.b bVar = this.f23034p;
            if (bVar == null) {
                q.z("eventBridge");
                bVar = null;
            }
            bVar.a(u5.f.IDENTIFY, d.a(aVar));
        }
        return aVar;
    }

    @Override // r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        f.a.b(this, aVar);
        this.f23034p = u5.d.f24161b.a(aVar.h().f()).c();
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f23033m = aVar;
    }

    @Override // r5.f
    public f.b getType() {
        return this.f23032f;
    }
}
