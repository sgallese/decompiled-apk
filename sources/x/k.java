package x;

import java.util.List;
import y.g0;

/* compiled from: LazyListIntervalContent.kt */
/* loaded from: classes.dex */
public final class k extends y.l<j> implements x {

    /* renamed from: a  reason: collision with root package name */
    private final g0<j> f25565a;

    /* renamed from: b  reason: collision with root package name */
    private List<Integer> f25566b;

    /* compiled from: LazyListIntervalContent.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<Integer, Object> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f25567f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f25567f = obj;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i10) {
            return this.f25567f;
        }
    }

    /* compiled from: LazyListIntervalContent.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<Integer, Object> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f25568f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f25568f = obj;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i10) {
            return this.f25568f;
        }
    }

    /* compiled from: LazyListIntervalContent.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.r<d, Integer, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<d, j0.l, Integer, dc.w> f25569f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.q<? super d, ? super j0.l, ? super Integer, dc.w> qVar) {
            super(4);
            this.f25569f = qVar;
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ dc.w invoke(d dVar, Integer num, j0.l lVar, Integer num2) {
            invoke(dVar, num.intValue(), lVar, num2.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(d dVar, int i10, j0.l lVar, int i11) {
            qc.q.i(dVar, "$this$$receiver");
            if ((i11 & 14) == 0) {
                i11 |= lVar.Q(dVar) ? 4 : 2;
            }
            if ((i11 & 651) == 130 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
            }
            this.f25569f.invoke(dVar, lVar, Integer.valueOf(i11 & 14));
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    public k(pc.l<? super x, dc.w> lVar) {
        qc.q.i(lVar, "content");
        this.f25565a = new g0<>();
        lVar.invoke(this);
    }

    @Override // x.x
    public void a(Object obj, Object obj2, pc.q<? super d, ? super j0.l, ? super Integer, dc.w> qVar) {
        a aVar;
        qc.q.i(qVar, "content");
        g0<j> d10 = d();
        if (obj != null) {
            aVar = new a(obj);
        } else {
            aVar = null;
        }
        d10.b(1, new j(aVar, new b(obj2), q0.c.c(-1010194746, true, new c(qVar))));
    }

    @Override // x.x
    public void b(int i10, pc.l<? super Integer, ? extends Object> lVar, pc.l<? super Integer, ? extends Object> lVar2, pc.r<? super d, ? super Integer, ? super j0.l, ? super Integer, dc.w> rVar) {
        qc.q.i(lVar2, "contentType");
        qc.q.i(rVar, "itemContent");
        d().b(i10, new j(lVar, lVar2, rVar));
    }

    public final List<Integer> g() {
        List<Integer> i10;
        List<Integer> list = this.f25566b;
        if (list == null) {
            i10 = ec.t.i();
            return i10;
        }
        return list;
    }

    @Override // y.l
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public g0<j> d() {
        return this.f25565a;
    }
}
