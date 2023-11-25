package cd;

import ad.i0;
import cd.s;
import dc.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Produce.kt */
/* loaded from: classes4.dex */
public final class o<E> extends e<E> implements p<E> {
    public o(hc.f fVar, d<E> dVar) {
        super(fVar, dVar, true, true);
    }

    @Override // ad.a
    protected void U0(Throwable th, boolean z10) {
        if (!X0().l(th) && !z10) {
            i0.a(getContext(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ad.a
    /* renamed from: Y0  reason: merged with bridge method [inline-methods] */
    public void V0(w wVar) {
        s.a.a(X0(), null, 1, null);
    }

    @Override // ad.a, ad.e2, ad.x1
    public boolean b() {
        return super.b();
    }
}
