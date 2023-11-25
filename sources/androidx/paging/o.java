package androidx.paging;

import androidx.paging.o;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: DataSource.kt */
/* loaded from: classes.dex */
public abstract class o<Key, Value> {
    public static final b Companion = new b(null);
    private final e0<d> invalidateCallbackTracker;
    private final boolean isContiguous;
    private final boolean supportsPageDropping;
    private final e type;

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <A, B> List<B> a(n.a<List<A>, List<B>> aVar, List<? extends A> list) {
            qc.q.i(aVar, "function");
            qc.q.i(list, "source");
            List<B> apply = aVar.apply(list);
            if (apply.size() == list.size()) {
                qc.q.h(apply, "dest");
                return apply;
            }
            throw new IllegalStateException("Invalid Function " + aVar + " changed return size. This is not supported.");
        }
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public static abstract class c<Key, Value> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataSource.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<u1<Key, Value>> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ad.g0 f5955f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f5956m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ad.g0 g0Var, c<Key, Value> cVar) {
                super(0);
                this.f5955f = g0Var;
                this.f5956m = cVar;
            }

            @Override // pc.a
            public final u1<Key, Value> invoke() {
                return new l0(this.f5955f, this.f5956m.create());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        /* compiled from: DataSource.kt */
        /* loaded from: classes.dex */
        public static final class b<ToValue> extends c<Key, ToValue> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f5957a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n.a<List<Value>, List<ToValue>> f5958b;

            b(c<Key, Value> cVar, n.a<List<Value>, List<ToValue>> aVar) {
                this.f5957a = cVar;
                this.f5958b = aVar;
            }

            @Override // androidx.paging.o.c
            public o<Key, ToValue> create() {
                return this.f5957a.create().mapByPage(this.f5958b);
            }
        }

        public static /* synthetic */ pc.a asPagingSourceFactory$default(c cVar, ad.g0 g0Var, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    g0Var = ad.a1.b();
                }
                return cVar.asPagingSourceFactory(g0Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List map$lambda$1(n.a aVar, List list) {
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
        public static final List map$lambda$2(pc.l lVar, List list) {
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
        public static final List mapByPage$lambda$3(pc.l lVar, List list) {
            qc.q.i(lVar, "$function");
            qc.q.h(list, "it");
            return (List) lVar.invoke(list);
        }

        public final pc.a<u1<Key, Value>> asPagingSourceFactory() {
            return asPagingSourceFactory$default(this, null, 1, null);
        }

        public abstract o<Key, Value> create();

        public <ToValue> c<Key, ToValue> map(final n.a<Value, ToValue> aVar) {
            qc.q.i(aVar, "function");
            return mapByPage(new n.a() { // from class: androidx.paging.r
                @Override // n.a
                public final Object apply(Object obj) {
                    List map$lambda$1;
                    map$lambda$1 = o.c.map$lambda$1(n.a.this, (List) obj);
                    return map$lambda$1;
                }
            });
        }

        public <ToValue> c<Key, ToValue> mapByPage(n.a<List<Value>, List<ToValue>> aVar) {
            qc.q.i(aVar, "function");
            return new b(this, aVar);
        }

        public final pc.a<u1<Key, Value>> asPagingSourceFactory(ad.g0 g0Var) {
            qc.q.i(g0Var, "fetchDispatcher");
            return new k2(g0Var, new a(g0Var, this));
        }

        public /* synthetic */ c map(final pc.l lVar) {
            qc.q.i(lVar, "function");
            return mapByPage(new n.a() { // from class: androidx.paging.q
                @Override // n.a
                public final Object apply(Object obj) {
                    List map$lambda$2;
                    map$lambda$2 = o.c.map$lambda$2(pc.l.this, (List) obj);
                    return map$lambda$2;
                }
            });
        }

        public /* synthetic */ c mapByPage(final pc.l lVar) {
            qc.q.i(lVar, "function");
            return mapByPage(new n.a() { // from class: androidx.paging.p
                @Override // n.a
                public final Object apply(Object obj) {
                    List mapByPage$lambda$3;
                    mapByPage$lambda$3 = o.c.mapByPage$lambda$3(pc.l.this, (List) obj);
                    return mapByPage$lambda$3;
                }
            });
        }
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public interface d {
        void a();
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public enum e {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public static final class f<K> {

        /* renamed from: a  reason: collision with root package name */
        private final t0 f5959a;

        /* renamed from: b  reason: collision with root package name */
        private final K f5960b;

        /* renamed from: c  reason: collision with root package name */
        private final int f5961c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f5962d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5963e;

        public f(t0 t0Var, K k10, int i10, boolean z10, int i11) {
            qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
            this.f5959a = t0Var;
            this.f5960b = k10;
            this.f5961c = i10;
            this.f5962d = z10;
            this.f5963e = i11;
            if (t0Var != t0.REFRESH && k10 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int a() {
            return this.f5961c;
        }

        public final K b() {
            return this.f5960b;
        }

        public final int c() {
            return this.f5963e;
        }

        public final boolean d() {
            return this.f5962d;
        }

        public final t0 e() {
            return this.f5959a;
        }
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.l<d, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final g f5964f = new g();

        g() {
            super(1);
        }

        public final void a(d dVar) {
            qc.q.i(dVar, "it");
            dVar.a();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(d dVar) {
            a(dVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    static final class h extends qc.r implements pc.a<Boolean> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ o<Key, Value> f5965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(o<Key, Value> oVar) {
            super(0);
            this.f5965f = oVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f5965f.isInvalid());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public static final class i<ToValue> extends qc.r implements pc.l<List<? extends Value>, List<? extends ToValue>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ n.a<Value, ToValue> f5966f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n.a<Value, ToValue> aVar) {
            super(1);
            this.f5966f = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final List<ToValue> invoke(List<? extends Value> list) {
            int s10;
            qc.q.i(list, "list");
            List<? extends Value> list2 = list;
            n.a<Value, ToValue> aVar = this.f5966f;
            s10 = ec.u.s(list2, 10);
            ArrayList arrayList = new ArrayList(s10);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply(it.next()));
            }
            return arrayList;
        }
    }

    public o(e eVar) {
        qc.q.i(eVar, TaskFormActivity.TASK_TYPE_KEY);
        this.type = eVar;
        this.invalidateCallbackTracker = new e0<>(g.f5964f, new h(this));
        this.isContiguous = true;
        this.supportsPageDropping = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object map$lambda$1(pc.l lVar, Object obj) {
        qc.q.i(lVar, "$function");
        qc.q.h(obj, "it");
        return lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$0(pc.l lVar, List list) {
        qc.q.i(lVar, "$function");
        qc.q.h(list, "it");
        return (List) lVar.invoke(list);
    }

    public void addInvalidatedCallback(d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(dVar);
    }

    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.a();
    }

    public abstract Key getKeyInternal$paging_common(Value value);

    public boolean getSupportsPageDropping$paging_common() {
        return this.supportsPageDropping;
    }

    public final e getType$paging_common() {
        return this.type;
    }

    public void invalidate() {
        this.invalidateCallbackTracker.c();
    }

    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    public boolean isInvalid() {
        return this.invalidateCallbackTracker.b();
    }

    public abstract Object load$paging_common(f<Key> fVar, Continuation<? super a<Value>> continuation);

    public <ToValue> o<Key, ToValue> map(n.a<Value, ToValue> aVar) {
        qc.q.i(aVar, "function");
        return mapByPage(new i(aVar));
    }

    public <ToValue> o<Key, ToValue> mapByPage(n.a<List<Value>, List<ToValue>> aVar) {
        qc.q.i(aVar, "function");
        return new p2(this, aVar);
    }

    public void removeInvalidatedCallback(d dVar) {
        qc.q.i(dVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(dVar);
    }

    public /* synthetic */ o map(final pc.l lVar) {
        qc.q.i(lVar, "function");
        return map(new n.a() { // from class: androidx.paging.n
            @Override // n.a
            public final Object apply(Object obj) {
                Object map$lambda$1;
                map$lambda$1 = o.map$lambda$1(pc.l.this, obj);
                return map$lambda$1;
            }
        });
    }

    public /* synthetic */ o mapByPage(final pc.l lVar) {
        qc.q.i(lVar, "function");
        return mapByPage(new n.a() { // from class: androidx.paging.m
            @Override // n.a
            public final Object apply(Object obj) {
                List mapByPage$lambda$0;
                mapByPage$lambda$0 = o.mapByPage$lambda$0(pc.l.this, (List) obj);
                return mapByPage$lambda$0;
            }
        });
    }

    /* compiled from: DataSource.kt */
    /* loaded from: classes.dex */
    public static final class a<Value> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0141a f5949f = new C0141a(null);

        /* renamed from: a  reason: collision with root package name */
        public final List<Value> f5950a;

        /* renamed from: b  reason: collision with root package name */
        private final Object f5951b;

        /* renamed from: c  reason: collision with root package name */
        private final Object f5952c;

        /* renamed from: d  reason: collision with root package name */
        private final int f5953d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5954e;

        /* compiled from: DataSource.kt */
        /* renamed from: androidx.paging.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0141a {
            private C0141a() {
            }

            public /* synthetic */ C0141a(qc.h hVar) {
                this();
            }

            public final <ToValue, Value> a<Value> a(a<ToValue> aVar, n.a<List<ToValue>, List<Value>> aVar2) {
                qc.q.i(aVar, "result");
                qc.q.i(aVar2, "function");
                return new a<>(o.Companion.a(aVar2, aVar.f5950a), aVar.d(), aVar.c(), aVar.b(), aVar.a());
            }

            public final <T> a<T> b() {
                List i10;
                i10 = ec.t.i();
                return new a<>(i10, null, null, 0, 0);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends Value> list, Object obj, Object obj2, int i10, int i11) {
            qc.q.i(list, "data");
            this.f5950a = list;
            this.f5951b = obj;
            this.f5952c = obj2;
            this.f5953d = i10;
            this.f5954e = i11;
            if (i10 < 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (list.isEmpty() && (i10 > 0 || i11 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i11 < 0 && i11 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final int a() {
            return this.f5954e;
        }

        public final int b() {
            return this.f5953d;
        }

        public final Object c() {
            return this.f5952c;
        }

        public final Object d() {
            return this.f5951b;
        }

        public final void e(int i10) {
            int i11;
            if (this.f5953d != Integer.MIN_VALUE && (i11 = this.f5954e) != Integer.MIN_VALUE) {
                if (i11 > 0 && this.f5950a.size() % i10 != 0) {
                    throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.f5950a.size() + ", position " + this.f5953d + ", totalCount " + (this.f5953d + this.f5950a.size() + this.f5954e) + ", pageSize " + i10);
                } else if (this.f5953d % i10 == 0) {
                    return;
                } else {
                    throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.f5953d + ", pageSize = " + i10);
                }
            }
            throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!qc.q.d(this.f5950a, aVar.f5950a) || !qc.q.d(this.f5951b, aVar.f5951b) || !qc.q.d(this.f5952c, aVar.f5952c) || this.f5953d != aVar.f5953d || this.f5954e != aVar.f5954e) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i10, int i11, int i12, qc.h hVar) {
            this(list, obj, obj2, (i12 & 8) != 0 ? RecyclerView.UNDEFINED_DURATION : i10, (i12 & 16) != 0 ? RecyclerView.UNDEFINED_DURATION : i11);
        }
    }
}
