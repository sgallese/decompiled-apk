package androidx.compose.foundation;

import dc.w;

/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
final class f extends a {
    private final h I;
    private final g J;

    public /* synthetic */ f(v.m mVar, boolean z10, String str, t1.i iVar, pc.a aVar, qc.h hVar) {
        this(mVar, z10, str, iVar, aVar);
    }

    @Override // androidx.compose.foundation.a
    /* renamed from: S1  reason: merged with bridge method [inline-methods] */
    public g P1() {
        return this.J;
    }

    public h T1() {
        return this.I;
    }

    public final void U1(v.m mVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        R1(mVar, z10, str, iVar, aVar);
        T1().K1(z10, str, iVar, aVar, null, null);
        P1().V1(z10, mVar, aVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private f(v.m mVar, boolean z10, String str, t1.i iVar, pc.a<w> aVar) {
        super(mVar, z10, str, iVar, aVar, null);
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        this.I = (h) I1(new h(z10, str, iVar, aVar, null, null, null));
        this.J = (g) I1(new g(z10, mVar, aVar, Q1()));
    }
}
