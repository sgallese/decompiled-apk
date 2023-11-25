package n1;

import java.util.ArrayList;
import java.util.List;
import n1.y0;
import p1.j0;

/* compiled from: RootMeasurePolicy.kt */
/* loaded from: classes.dex */
public final class c1 extends j0.f {

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f19953b = new c1();

    /* compiled from: RootMeasurePolicy.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f19954f = new a();

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

    /* compiled from: RootMeasurePolicy.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y0 f19955f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y0 y0Var) {
            super(1);
            this.f19955f = y0Var;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            y0.a.t(aVar, this.f19955f, 0, 0, 0.0f, null, 12, null);
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<y0> f19956f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends y0> list) {
            super(1);
            this.f19956f = list;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$layout");
            List<y0> list = this.f19956f;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                y0.a.t(aVar, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    private c1() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // n1.i0
    /* renamed from: measure-3p2s80s */
    public j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
        qc.q.i(l0Var, "$this$measure");
        qc.q.i(list, "measurables");
        if (list.isEmpty()) {
            return k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, a.f19954f, 4, null);
        }
        if (list.size() == 1) {
            y0 w10 = list.get(0).w(j10);
            return k0.b(l0Var, j2.c.g(j10, w10.A0()), j2.c.f(j10, w10.l0()), null, new b(w10), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).w(j10));
        }
        int size2 = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size2; i13++) {
            y0 y0Var = (y0) arrayList.get(i13);
            i11 = Math.max(y0Var.A0(), i11);
            i12 = Math.max(y0Var.l0(), i12);
        }
        return k0.b(l0Var, j2.c.g(j10, i11), j2.c.f(j10, i12), null, new c(arrayList), 4, null);
    }
}
