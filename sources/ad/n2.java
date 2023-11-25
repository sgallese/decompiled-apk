package ad;

import dc.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class n2<T> extends d2 {

    /* renamed from: r  reason: collision with root package name */
    private final n<T> f543r;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(n<? super T> nVar) {
        this.f543r = nVar;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        r(th);
        return dc.w.f13270a;
    }

    @Override // ad.c0
    public void r(Throwable th) {
        Object h02 = s().h0();
        if (h02 instanceof a0) {
            n<T> nVar = this.f543r;
            m.a aVar = dc.m.f13253f;
            nVar.resumeWith(dc.m.a(dc.n.a(((a0) h02).f462a)));
            return;
        }
        n<T> nVar2 = this.f543r;
        m.a aVar2 = dc.m.f13253f;
        nVar2.resumeWith(dc.m.a(f2.h(h02)));
    }
}
