package w;

import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Spacer.kt */
/* loaded from: classes.dex */
public final class e0 implements i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f25168a = new e0();

    /* compiled from: Spacer.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25169f = new a();

        a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }
    }

    private e0() {
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
        return h0.a(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
        return h0.b(this, nVar, list, i10);
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
        int i10;
        int i11;
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        if (j2.b.l(j10)) {
            i10 = j2.b.n(j10);
        } else {
            i10 = 0;
        }
        if (j2.b.k(j10)) {
            i11 = j2.b.m(j10);
        } else {
            i11 = 0;
        }
        return k0.b(l0Var, i10, i11, null, a.f25169f, 4, null);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
        return h0.c(this, nVar, list, i10);
    }

    @Override // n1.i0
    public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
        return h0.d(this, nVar, list, i10);
    }
}
