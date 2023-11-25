package k5;

import qc.q;
import r5.e;

/* compiled from: AnalyticsConnectorIdentityPlugin.kt */
/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: m  reason: collision with root package name */
    public p5.a f19342m;

    /* renamed from: p  reason: collision with root package name */
    private h5.a f19343p;

    @Override // r5.e, r5.f
    public void b(p5.a aVar) {
        q.i(aVar, "amplitude");
        super.b(aVar);
        h5.a a10 = h5.a.f16464c.a(aVar.h().f());
        this.f19343p = a10;
        if (a10 == null) {
            q.z("connector");
            a10 = null;
        }
        a10.d().b(new h5.e(aVar.o().d(), aVar.o().b(), null, 4, null));
    }

    @Override // r5.f
    public void c(p5.a aVar) {
        q.i(aVar, "<set-?>");
        this.f19342m = aVar;
    }

    @Override // r5.e
    public void h(String str) {
        h5.a aVar = this.f19343p;
        if (aVar == null) {
            q.z("connector");
            aVar = null;
        }
        aVar.d().a().b(str).c();
    }

    @Override // r5.e
    public void i(String str) {
        h5.a aVar = this.f19343p;
        if (aVar == null) {
            q.z("connector");
            aVar = null;
        }
        aVar.d().a().a(str).c();
    }
}
