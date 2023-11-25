package androidx.paging;

import androidx.paging.l1;
import androidx.paging.o;
import java.util.List;

/* compiled from: WrapperPageKeyedDataSource.kt */
/* loaded from: classes.dex */
public final class r2<K, A, B> extends l1<K, B> {

    /* renamed from: b  reason: collision with root package name */
    private final l1<K, A> f6024b;

    /* renamed from: c  reason: collision with root package name */
    private final n.a<List<A>, List<B>> f6025c;

    /* compiled from: WrapperPageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a extends l1.a<K, A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l1.a<K, B> f6026a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r2<K, A, B> f6027b;

        a(l1.a<K, B> aVar, r2<K, A, B> r2Var) {
            this.f6026a = aVar;
            this.f6027b = r2Var;
        }

        @Override // androidx.paging.l1.a
        public void a(List<? extends A> list, K k10) {
            qc.q.i(list, "data");
            this.f6026a.a(o.Companion.a(((r2) this.f6027b).f6025c, list), k10);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class b extends l1.a<K, A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l1.a<K, B> f6028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r2<K, A, B> f6029b;

        b(l1.a<K, B> aVar, r2<K, A, B> r2Var) {
            this.f6028a = aVar;
            this.f6029b = r2Var;
        }

        @Override // androidx.paging.l1.a
        public void a(List<? extends A> list, K k10) {
            qc.q.i(list, "data");
            this.f6028a.a(o.Companion.a(((r2) this.f6029b).f6025c, list), k10);
        }
    }

    /* compiled from: WrapperPageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class c extends l1.b<K, A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r2<K, A, B> f6030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l1.b<K, B> f6031b;

        c(r2<K, A, B> r2Var, l1.b<K, B> bVar) {
            this.f6030a = r2Var;
            this.f6031b = bVar;
        }

        @Override // androidx.paging.l1.b
        public void a(List<? extends A> list, int i10, int i11, K k10, K k11) {
            qc.q.i(list, "data");
            this.f6031b.a(o.Companion.a(((r2) this.f6030a).f6025c, list), i10, i11, k10, k11);
        }
    }

    public r2(l1<K, A> l1Var, n.a<List<A>, List<B>> aVar) {
        qc.q.i(l1Var, "source");
        qc.q.i(aVar, "listFunction");
        this.f6024b = l1Var;
        this.f6025c = aVar;
    }

    @Override // androidx.paging.o
    public void addInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6024b.addInvalidatedCallback(dVar);
    }

    @Override // androidx.paging.l1
    public void i(l1.d<K> dVar, l1.a<K, B> aVar) {
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        this.f6024b.i(dVar, new a(aVar, this));
    }

    @Override // androidx.paging.o
    public void invalidate() {
        this.f6024b.invalidate();
    }

    @Override // androidx.paging.o
    public boolean isInvalid() {
        return this.f6024b.isInvalid();
    }

    @Override // androidx.paging.l1
    public void k(l1.d<K> dVar, l1.a<K, B> aVar) {
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        this.f6024b.k(dVar, new b(aVar, this));
    }

    @Override // androidx.paging.l1
    public void m(l1.c<K> cVar, l1.b<K, B> bVar) {
        qc.q.i(cVar, "params");
        qc.q.i(bVar, "callback");
        this.f6024b.m(cVar, new c(this, bVar));
    }

    @Override // androidx.paging.o
    public void removeInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6024b.removeInvalidatedCallback(dVar);
    }
}
