package androidx.paging;

import androidx.paging.o;
import dc.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: PageKeyedDataSource.kt */
/* loaded from: classes.dex */
public abstract class l1<Key, Value> extends o<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5859a;

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class a<Key, Value> {
        public abstract void a(List<? extends Value> list, Key key);
    }

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class b<Key, Value> {
        public abstract void a(List<? extends Value> list, int i10, int i11, Key key, Key key2);
    }

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static class c<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final int f5860a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5861b;

        public c(int i10, boolean z10) {
            this.f5860a = i10;
            this.f5861b = z10;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static class d<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f5862a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5863b;

        public d(Key key, int i10) {
            qc.q.i(key, "key");
            this.f5862a = key;
            this.f5863b = i10;
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class e extends a<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<Value>> f5864a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f5865b;

        /* JADX WARN: Multi-variable type inference failed */
        e(ad.m<? super o.a<Value>> mVar, boolean z10) {
            this.f5864a = mVar;
            this.f5865b = z10;
        }

        @Override // androidx.paging.l1.a
        public void a(List<? extends Value> list, Key key) {
            Key key2;
            Key key3;
            qc.q.i(list, "data");
            ad.m<o.a<Value>> mVar = this.f5864a;
            m.a aVar = dc.m.f13253f;
            boolean z10 = this.f5865b;
            if (z10) {
                key2 = null;
            } else {
                key2 = key;
            }
            if (z10) {
                key3 = key;
            } else {
                key3 = null;
            }
            mVar.resumeWith(dc.m.a(new o.a(list, key2, key3, 0, 0, 24, null)));
        }
    }

    /* compiled from: PageKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class f extends b<Key, Value> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<Value>> f5866a;

        /* JADX WARN: Multi-variable type inference failed */
        f(ad.m<? super o.a<Value>> mVar) {
            this.f5866a = mVar;
        }

        @Override // androidx.paging.l1.b
        public void a(List<? extends Value> list, int i10, int i11, Key key, Key key2) {
            qc.q.i(list, "data");
            ad.m<o.a<Value>> mVar = this.f5866a;
            m.a aVar = dc.m.f13253f;
            mVar.resumeWith(dc.m.a(new o.a(list, key, key2, i10, (i11 - list.size()) - i10)));
        }
    }

    public l1() {
        super(o.e.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a<Key, Value> g(ad.m<? super o.a<Value>> mVar, boolean z10) {
        return new e(mVar, z10);
    }

    private final Object h(d<Key> dVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        i(dVar, g(nVar, true));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    private final Object j(d<Key> dVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        k(dVar, g(nVar, false));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    private final Object l(c<Key> cVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        m(cVar, new f(nVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(n.a aVar, List list) {
        int s10;
        qc.q.i(aVar, "$function");
        qc.q.h(list, "list");
        List list2 = list;
        s10 = ec.u.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(pc.l lVar, List list) {
        int s10;
        qc.q.i(lVar, "$function");
        qc.q.h(list, "list");
        List list2 = list;
        s10 = ec.u.s(list2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(pc.l lVar, List list) {
        qc.q.i(lVar, "$function");
        qc.q.h(list, "it");
        return (List) lVar.invoke(list);
    }

    @Override // androidx.paging.o
    public Key getKeyInternal$paging_common(Value value) {
        qc.q.i(value, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.o
    public boolean getSupportsPageDropping$paging_common() {
        return this.f5859a;
    }

    public abstract void i(d<Key> dVar, a<Key, Value> aVar);

    public abstract void k(d<Key> dVar, a<Key, Value> aVar);

    @Override // androidx.paging.o
    public final Object load$paging_common(o.f<Key> fVar, Continuation<? super o.a<Value>> continuation) {
        if (fVar.e() == t0.REFRESH) {
            return l(new c<>(fVar.a(), fVar.d()), continuation);
        }
        if (fVar.b() == null) {
            return o.a.f5949f.b();
        }
        if (fVar.e() == t0.PREPEND) {
            return j(new d<>(fVar.b(), fVar.c()), continuation);
        }
        if (fVar.e() == t0.APPEND) {
            return h(new d<>(fVar.b(), fVar.c()), continuation);
        }
        throw new IllegalArgumentException("Unsupported type " + fVar.e());
    }

    public abstract void m(c<Key> cVar, b<Key, Value> bVar);

    @Override // androidx.paging.o
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public final <ToValue> l1<Key, ToValue> map(final n.a<Value, ToValue> aVar) {
        qc.q.i(aVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.k1
            @Override // n.a
            public final Object apply(Object obj) {
                List p10;
                p10 = l1.p(n.a.this, (List) obj);
                return p10;
            }
        });
    }

    @Override // androidx.paging.o
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public final <ToValue> l1<Key, ToValue> map(final pc.l<? super Value, ? extends ToValue> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.j1
            @Override // n.a
            public final Object apply(Object obj) {
                List q10;
                q10 = l1.q(pc.l.this, (List) obj);
                return q10;
            }
        });
    }

    @Override // androidx.paging.o
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public final <ToValue> l1<Key, ToValue> mapByPage(n.a<List<Value>, List<ToValue>> aVar) {
        qc.q.i(aVar, "function");
        return new r2(this, aVar);
    }

    @Override // androidx.paging.o
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public final <ToValue> l1<Key, ToValue> mapByPage(final pc.l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.i1
            @Override // n.a
            public final Object apply(Object obj) {
                List t10;
                t10 = l1.t(pc.l.this, (List) obj);
                return t10;
            }
        });
    }
}
