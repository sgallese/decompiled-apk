package c0;

import java.util.ArrayList;
import java.util.List;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BasicText.kt */
/* loaded from: classes.dex */
public final class x0 implements n1.i0 {

    /* renamed from: a  reason: collision with root package name */
    private final pc.a<List<z0.h>> f8616a;

    /* compiled from: BasicText.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<dc.l<n1.y0, j2.l>> f8617f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends dc.l<? extends n1.y0, j2.l>> list) {
            super(1);
            this.f8617f = list;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            List<dc.l<n1.y0, j2.l>> list = this.f8617f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    dc.l<n1.y0, j2.l> lVar = list.get(i10);
                    y0.a.p(aVar, lVar.a(), lVar.b().n(), 0.0f, 2, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x0(pc.a<? extends List<z0.h>> aVar) {
        qc.q.i(aVar, "placements");
        this.f8616a = aVar;
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
        dc.l lVar;
        int d10;
        int d11;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        List<z0.h> invoke = this.f8616a.invoke();
        ArrayList arrayList = null;
        if (invoke != null) {
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size = invoke.size();
            for (int i10 = 0; i10 < size; i10++) {
                z0.h hVar = invoke.get(i10);
                if (hVar != null) {
                    n1.y0 w10 = list.get(i10).w(j2.c.b(0, (int) Math.floor(hVar.n()), 0, (int) Math.floor(hVar.h()), 5, null));
                    d10 = sc.c.d(hVar.i());
                    d11 = sc.c.d(hVar.l());
                    lVar = new dc.l(w10, j2.l.b(j2.m.a(d10, d11)));
                } else {
                    lVar = null;
                }
                if (lVar != null) {
                    arrayList2.add(lVar);
                }
            }
            arrayList = arrayList2;
        }
        return n1.k0.b(l0Var, j2.b.n(j10), j2.b.m(j10), null, new a(arrayList), 4, null);
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
