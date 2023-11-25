package j3;

import j3.a;
import qc.h;
import qc.q;

/* compiled from: CreationExtras.kt */
/* loaded from: classes.dex */
public final class d extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [qc.h, j3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.d.<init>():void");
    }

    @Override // j3.a
    public <T> T a(a.b<T> bVar) {
        q.i(bVar, "key");
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> bVar, T t10) {
        q.i(bVar, "key");
        b().put(bVar, t10);
    }

    public d(a aVar) {
        q.i(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ d(a aVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.C0424a.f19017b : aVar);
    }
}
