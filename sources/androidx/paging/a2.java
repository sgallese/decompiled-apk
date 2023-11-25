package androidx.paging;

import androidx.paging.o;
import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: PositionalDataSource.kt */
/* loaded from: classes.dex */
public abstract class a2<T> extends o<Integer, T> {
    public static final a Companion = new a(null);
    private final boolean isContiguous;

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final int a(c cVar, int i10) {
            qc.q.i(cVar, "params");
            int i11 = cVar.f5395a;
            int i12 = cVar.f5396b;
            int i13 = cVar.f5397c;
            return Math.max(0, Math.min(((((i10 - i12) + i13) - 1) / i13) * i13, (i11 / i13) * i13));
        }

        public final int b(c cVar, int i10, int i11) {
            qc.q.i(cVar, "params");
            return Math.min(i11 - i10, cVar.f5396b);
        }
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class b<T> {
        public abstract void a(List<? extends T> list, int i10);
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f5395a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5396b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5397c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f5398d;

        public c(int i10, int i11, int i12, boolean z10) {
            boolean z11;
            boolean z12;
            this.f5395a = i10;
            this.f5396b = i11;
            this.f5397c = i12;
            this.f5398d = z10;
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 >= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (i12 >= 0) {
                        return;
                    }
                    throw new IllegalStateException(("invalid page size: " + i12).toString());
                }
                throw new IllegalStateException(("invalid load size: " + i11).toString());
            }
            throw new IllegalStateException(("invalid start position: " + i10).toString());
        }
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class d<T> {
        public abstract void a(List<? extends T> list);
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f5399a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5400b;

        public e(int i10, int i11) {
            this.f5399a = i10;
            this.f5400b = i11;
        }
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static final class f extends b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a2<T> f5401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<T>> f5402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f5403c;

        /* JADX WARN: Multi-variable type inference failed */
        f(a2<T> a2Var, ad.m<? super o.a<T>> mVar, c cVar) {
            this.f5401a = a2Var;
            this.f5402b = mVar;
            this.f5403c = cVar;
        }

        private final void b(c cVar, o.a<T> aVar) {
            if (cVar.f5398d) {
                aVar.e(cVar.f5397c);
            }
            this.f5402b.resumeWith(dc.m.a(aVar));
        }

        @Override // androidx.paging.a2.b
        public void a(List<? extends T> list, int i10) {
            Integer valueOf;
            qc.q.i(list, "data");
            if (this.f5401a.isInvalid()) {
                ad.m<o.a<T>> mVar = this.f5402b;
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(o.a.f5949f.b()));
                return;
            }
            c cVar = this.f5403c;
            if (i10 == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(i10);
            }
            b(cVar, new o.a<>(list, valueOf, Integer.valueOf(list.size() + i10), i10, RecyclerView.UNDEFINED_DURATION));
        }
    }

    /* compiled from: PositionalDataSource.kt */
    /* loaded from: classes.dex */
    public static final class g extends d<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f5404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a2<T> f5405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<T>> f5406c;

        /* JADX WARN: Multi-variable type inference failed */
        g(e eVar, a2<T> a2Var, ad.m<? super o.a<T>> mVar) {
            this.f5404a = eVar;
            this.f5405b = a2Var;
            this.f5406c = mVar;
        }

        @Override // androidx.paging.a2.d
        public void a(List<? extends T> list) {
            Integer valueOf;
            qc.q.i(list, "data");
            int i10 = this.f5404a.f5399a;
            if (i10 == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(i10);
            }
            Integer num = valueOf;
            if (this.f5405b.isInvalid()) {
                ad.m<o.a<T>> mVar = this.f5406c;
                m.a aVar = dc.m.f13253f;
                mVar.resumeWith(dc.m.a(o.a.f5949f.b()));
                return;
            }
            ad.m<o.a<T>> mVar2 = this.f5406c;
            m.a aVar2 = dc.m.f13253f;
            mVar2.resumeWith(dc.m.a(new o.a(list, num, Integer.valueOf(this.f5404a.f5399a + list.size()), 0, 0, 24, null)));
        }
    }

    public a2() {
        super(o.e.POSITIONAL);
    }

    public static final int computeInitialLoadPosition(c cVar, int i10) {
        return Companion.a(cVar, i10);
    }

    public static final int computeInitialLoadSize(c cVar, int i10, int i11) {
        return Companion.b(cVar, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadRange(e eVar, Continuation<? super o.a<T>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        loadRange(eVar, new g(eVar, this, nVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$4(n.a aVar, List list) {
        int s10;
        qc.q.i(aVar, "$function");
        qc.q.h(list, "list");
        List list2 = list;
        s10 = ec.u.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$5(pc.l lVar, List list) {
        int s10;
        qc.q.i(lVar, "$function");
        qc.q.h(list, "list");
        List list2 = list;
        s10 = ec.u.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$2(pc.l lVar, List list) {
        qc.q.i(lVar, "$function");
        qc.q.h(list, "it");
        return (List) lVar.invoke(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.o
    public /* bridge */ /* synthetic */ Integer getKeyInternal$paging_common(Object obj) {
        return getKeyInternal$paging_common((a2<T>) obj);
    }

    @Override // androidx.paging.o
    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    @Override // androidx.paging.o
    public final Object load$paging_common(o.f<Integer> fVar, Continuation<? super o.a<T>> continuation) {
        if (fVar.e() == t0.REFRESH) {
            int a10 = fVar.a();
            int i10 = 0;
            if (fVar.b() != null) {
                int intValue = fVar.b().intValue();
                if (fVar.d()) {
                    a10 = Math.max(a10 / fVar.c(), 2) * fVar.c();
                    i10 = Math.max(0, ((intValue - (a10 / 2)) / fVar.c()) * fVar.c());
                } else {
                    i10 = Math.max(0, intValue - (a10 / 2));
                }
            }
            return loadInitial$paging_common(new c(i10, a10, fVar.c(), fVar.d()), continuation);
        }
        Integer b10 = fVar.b();
        qc.q.f(b10);
        int intValue2 = b10.intValue();
        int c10 = fVar.c();
        if (fVar.e() == t0.PREPEND) {
            c10 = Math.min(c10, intValue2);
            intValue2 -= c10;
        }
        return loadRange(new e(intValue2, c10), continuation);
    }

    public abstract void loadInitial(c cVar, b<T> bVar);

    public final Object loadInitial$paging_common(c cVar, Continuation<? super o.a<T>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        loadInitial(cVar, new f(this, nVar, cVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public abstract void loadRange(e eVar, d<T> dVar);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.o
    public final Integer getKeyInternal$paging_common(T t10) {
        qc.q.i(t10, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.o
    public final <V> a2<V> map(final n.a<T, V> aVar) {
        qc.q.i(aVar, "function");
        return mapByPage((n.a) new n.a() { // from class: androidx.paging.z1
            @Override // n.a
            public final Object apply(Object obj) {
                List map$lambda$4;
                map$lambda$4 = a2.map$lambda$4(n.a.this, (List) obj);
                return map$lambda$4;
            }
        });
    }

    @Override // androidx.paging.o
    public final <V> a2<V> mapByPage(n.a<List<T>, List<V>> aVar) {
        qc.q.i(aVar, "function");
        return new s2(this, aVar);
    }

    @Override // androidx.paging.o
    public final <V> a2<V> map(final pc.l<? super T, ? extends V> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage((n.a) new n.a() { // from class: androidx.paging.y1
            @Override // n.a
            public final Object apply(Object obj) {
                List map$lambda$5;
                map$lambda$5 = a2.map$lambda$5(pc.l.this, (List) obj);
                return map$lambda$5;
            }
        });
    }

    @Override // androidx.paging.o
    public final <V> a2<V> mapByPage(final pc.l<? super List<? extends T>, ? extends List<? extends V>> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage((n.a) new n.a() { // from class: androidx.paging.x1
            @Override // n.a
            public final Object apply(Object obj) {
                List mapByPage$lambda$2;
                mapByPage$lambda$2 = a2.mapByPage$lambda$2(pc.l.this, (List) obj);
                return mapByPage$lambda$2;
            }
        });
    }

    public static /* synthetic */ void isContiguous$paging_common$annotations() {
    }
}
