package c0;

/* compiled from: TextLayoutResultProxy.kt */
/* loaded from: classes.dex */
public final class w0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j10, z0.h hVar) {
        float o10;
        float p10;
        if (z0.f.o(j10) < hVar.i()) {
            o10 = hVar.i();
        } else if (z0.f.o(j10) > hVar.j()) {
            o10 = hVar.j();
        } else {
            o10 = z0.f.o(j10);
        }
        if (z0.f.p(j10) < hVar.l()) {
            p10 = hVar.l();
        } else if (z0.f.p(j10) > hVar.e()) {
            p10 = hVar.e();
        } else {
            p10 = z0.f.p(j10);
        }
        return z0.g.a(o10, p10);
    }
}
