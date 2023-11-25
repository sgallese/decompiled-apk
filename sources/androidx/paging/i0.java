package androidx.paging;

import androidx.paging.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: ItemKeyedDataSource.kt */
/* loaded from: classes.dex */
public abstract class i0<Key, Value> extends o<Key, Value> {

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class a<Value> {
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class b<Value> extends a<Value> {
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static class c<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f5755a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5756b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f5757c;

        public c(Key key, int i10, boolean z10) {
            this.f5755a = key;
            this.f5756b = i10;
            this.f5757c = z10;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static class d<Key> {

        /* renamed from: a  reason: collision with root package name */
        public final Key f5758a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5759b;

        public d(Key key, int i10) {
            qc.q.i(key, "key");
            this.f5758a = key;
            this.f5759b = i10;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5760a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5760a = iArr;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class f extends a<Value> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<Value>> f5761a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i0<Key, Value> f5762b;

        /* JADX WARN: Multi-variable type inference failed */
        f(ad.m<? super o.a<Value>> mVar, i0<Key, Value> i0Var) {
            this.f5761a = mVar;
            this.f5762b = i0Var;
        }
    }

    /* compiled from: ItemKeyedDataSource.kt */
    /* loaded from: classes.dex */
    public static final class g extends b<Value> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad.m<o.a<Value>> f5763a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i0<Key, Value> f5764b;

        /* JADX WARN: Multi-variable type inference failed */
        g(ad.m<? super o.a<Value>> mVar, i0<Key, Value> i0Var) {
            this.f5763a = mVar;
            this.f5764b = i0Var;
        }
    }

    public i0() {
        super(o.e.ITEM_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f g(ad.m mVar) {
        return new f(mVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(n.a aVar, List list) {
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
    public static final List r(pc.l lVar, List list) {
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
    public static final List u(pc.l lVar, List list) {
        qc.q.i(lVar, "$function");
        qc.q.h(list, "it");
        return (List) lVar.invoke(list);
    }

    @Override // androidx.paging.o
    public Key getKeyInternal$paging_common(Value value) {
        qc.q.i(value, "item");
        return h(value);
    }

    public abstract Key h(Value value);

    public abstract void i(d<Key> dVar, a<Value> aVar);

    public final Object j(d<Key> dVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        i(dVar, g(nVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    public abstract void k(d<Key> dVar, a<Value> aVar);

    public final Object l(d<Key> dVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        k(dVar, g(nVar));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    @Override // androidx.paging.o
    public final Object load$paging_common(o.f<Key> fVar, Continuation<? super o.a<Value>> continuation) {
        int i10 = e.f5760a[fVar.e().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    Key b10 = fVar.b();
                    qc.q.f(b10);
                    return j(new d<>(b10, fVar.c()), continuation);
                }
                throw new NoWhenBranchMatchedException();
            }
            Key b11 = fVar.b();
            qc.q.f(b11);
            return l(new d<>(b11, fVar.c()), continuation);
        }
        return n(new c<>(fVar.b(), fVar.a(), fVar.d()), continuation);
    }

    public abstract void m(c<Key> cVar, b<Value> bVar);

    public final Object n(c<Key> cVar, Continuation<? super o.a<Value>> continuation) {
        Continuation c10;
        Object d10;
        c10 = ic.c.c(continuation);
        ad.n nVar = new ad.n(c10, 1);
        nVar.A();
        m(cVar, new g(nVar, this));
        Object x10 = nVar.x();
        d10 = ic.d.d();
        if (x10 == d10) {
            kotlin.coroutines.jvm.internal.h.c(continuation);
        }
        return x10;
    }

    @Override // androidx.paging.o
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public final <ToValue> i0<Key, ToValue> map(final n.a<Value, ToValue> aVar) {
        qc.q.i(aVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.g0
            @Override // n.a
            public final Object apply(Object obj) {
                List q10;
                q10 = i0.q(n.a.this, (List) obj);
                return q10;
            }
        });
    }

    @Override // androidx.paging.o
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public final <ToValue> i0<Key, ToValue> map(final pc.l<? super Value, ? extends ToValue> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.h0
            @Override // n.a
            public final Object apply(Object obj) {
                List r10;
                r10 = i0.r(pc.l.this, (List) obj);
                return r10;
            }
        });
    }

    @Override // androidx.paging.o
    /* renamed from: s  reason: merged with bridge method [inline-methods] */
    public final <ToValue> i0<Key, ToValue> mapByPage(n.a<List<Value>, List<ToValue>> aVar) {
        qc.q.i(aVar, "function");
        return new q2(this, aVar);
    }

    @Override // androidx.paging.o
    /* renamed from: t  reason: merged with bridge method [inline-methods] */
    public final <ToValue> i0<Key, ToValue> mapByPage(final pc.l<? super List<? extends Value>, ? extends List<? extends ToValue>> lVar) {
        qc.q.i(lVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.f0
            @Override // n.a
            public final Object apply(Object obj) {
                List u10;
                u10 = i0.u(pc.l.this, (List) obj);
                return u10;
            }
        });
    }
}
