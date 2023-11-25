package androidx.paging;

import androidx.paging.i0;
import androidx.paging.o;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: WrapperItemKeyedDataSource.kt */
/* loaded from: classes.dex */
public final class q2<K, A, B> extends i0<K, B> {

    /* renamed from: a  reason: collision with root package name */
    private final i0<K, A> f6007a;

    /* renamed from: b  reason: collision with root package name */
    private final n.a<List<A>, List<B>> f6008b;

    /* renamed from: c  reason: collision with root package name */
    private final IdentityHashMap<B, K> f6009c;

    /* compiled from: WrapperItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a extends i0.a<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i0.a<B> f6010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q2<K, A, B> f6011b;

        a(i0.a<B> aVar, q2<K, A, B> q2Var) {
            this.f6010a = aVar;
            this.f6011b = q2Var;
        }
    }

    /* compiled from: WrapperItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class b extends i0.a<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i0.a<B> f6012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q2<K, A, B> f6013b;

        b(i0.a<B> aVar, q2<K, A, B> q2Var) {
            this.f6012a = aVar;
            this.f6013b = q2Var;
        }
    }

    /* compiled from: WrapperItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class c extends i0.b<A> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i0.b<B> f6014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q2<K, A, B> f6015b;

        c(i0.b<B> bVar, q2<K, A, B> q2Var) {
            this.f6014a = bVar;
            this.f6015b = q2Var;
        }
    }

    public q2(i0<K, A> i0Var, n.a<List<A>, List<B>> aVar) {
        qc.q.i(i0Var, "source");
        qc.q.i(aVar, "listFunction");
        this.f6007a = i0Var;
        this.f6008b = aVar;
        this.f6009c = new IdentityHashMap<>();
    }

    @Override // androidx.paging.o
    public void addInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6007a.addInvalidatedCallback(dVar);
    }

    @Override // androidx.paging.i0
    public K h(B b10) {
        K k10;
        qc.q.i(b10, "item");
        synchronized (this.f6009c) {
            k10 = this.f6009c.get(b10);
            qc.q.f(k10);
        }
        return k10;
    }

    @Override // androidx.paging.i0
    public void i(i0.d<K> dVar, i0.a<B> aVar) {
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        this.f6007a.i(dVar, new a(aVar, this));
    }

    @Override // androidx.paging.o
    public void invalidate() {
        this.f6007a.invalidate();
    }

    @Override // androidx.paging.o
    public boolean isInvalid() {
        return this.f6007a.isInvalid();
    }

    @Override // androidx.paging.i0
    public void k(i0.d<K> dVar, i0.a<B> aVar) {
        qc.q.i(dVar, "params");
        qc.q.i(aVar, "callback");
        this.f6007a.k(dVar, new b(aVar, this));
    }

    @Override // androidx.paging.i0
    public void m(i0.c<K> cVar, i0.b<B> bVar) {
        qc.q.i(cVar, "params");
        qc.q.i(bVar, "callback");
        this.f6007a.m(cVar, new c(bVar, this));
    }

    @Override // androidx.paging.o
    public void removeInvalidatedCallback(o.d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.f6007a.removeInvalidatedCallback(dVar);
    }
}
