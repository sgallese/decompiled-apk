package c0;

import java.util.List;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class j implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j f8446a = new j();

    /* renamed from: b  reason: collision with root package name */
    private static final pc.l<y0.a, dc.w> f8447b = a.f8448f;

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8448f = new a();

        a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$null");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }
    }

    private j() {
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
        return n1.h0.a(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
        return n1.h0.b(this, nVar, list, i10);
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        return n1.k0.b(l0Var, j2.b.n(j10), j2.b.m(j10), null, f8447b, 4, null);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
        return n1.h0.c(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
        return n1.h0.d(this, nVar, list, i10);
    }
}
