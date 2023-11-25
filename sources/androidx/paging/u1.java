package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: PagingSource.kt */
/* loaded from: classes.dex */
public abstract class u1<Key, Value> {
    private final e0<pc.a<dc.w>> invalidateCallbackTracker;

    /* compiled from: PagingSource.kt */
    /* loaded from: classes.dex */
    public static abstract class a<Key> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6095c = new b(null);

        /* renamed from: a  reason: collision with root package name */
        private final int f6096a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f6097b;

        /* compiled from: PagingSource.kt */
        /* renamed from: androidx.paging.u1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0143a<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f6098d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143a(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                qc.q.i(key, "key");
                this.f6098d = key;
            }

            @Override // androidx.paging.u1.a
            public Key a() {
                return this.f6098d;
            }
        }

        /* compiled from: PagingSource.kt */
        /* loaded from: classes.dex */
        public static final class b {

            /* compiled from: PagingSource.kt */
            /* renamed from: androidx.paging.u1$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0144a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f6099a;

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
                    f6099a = iArr;
                }
            }

            private b() {
            }

            public /* synthetic */ b(qc.h hVar) {
                this();
            }

            public final <Key> a<Key> a(t0 t0Var, Key key, int i10, boolean z10) {
                qc.q.i(t0Var, "loadType");
                int i11 = C0144a.f6099a[t0Var.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (key != null) {
                                return new C0143a(key, i10, z10);
                            }
                            throw new IllegalArgumentException("key cannot be null for append".toString());
                        }
                        throw new NoWhenBranchMatchedException();
                    } else if (key != null) {
                        return new c(key, i10, z10);
                    } else {
                        throw new IllegalArgumentException("key cannot be null for prepend".toString());
                    }
                }
                return new d(key, i10, z10);
            }
        }

        /* compiled from: PagingSource.kt */
        /* loaded from: classes.dex */
        public static final class c<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f6100d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                qc.q.i(key, "key");
                this.f6100d = key;
            }

            @Override // androidx.paging.u1.a
            public Key a() {
                return this.f6100d;
            }
        }

        /* compiled from: PagingSource.kt */
        /* loaded from: classes.dex */
        public static final class d<Key> extends a<Key> {

            /* renamed from: d  reason: collision with root package name */
            private final Key f6101d;

            public d(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                this.f6101d = key;
            }

            @Override // androidx.paging.u1.a
            public Key a() {
                return this.f6101d;
            }
        }

        public /* synthetic */ a(int i10, boolean z10, qc.h hVar) {
            this(i10, z10);
        }

        public abstract Key a();

        public final int b() {
            return this.f6096a;
        }

        public final boolean c() {
            return this.f6097b;
        }

        private a(int i10, boolean z10) {
            this.f6096a = i10;
            this.f6097b = z10;
        }
    }

    /* compiled from: PagingSource.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<pc.a<? extends dc.w>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f6110f = new c();

        c() {
            super(1);
        }

        public final void a(pc.a<dc.w> aVar) {
            qc.q.i(aVar, "it");
            aVar.invoke();
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(pc.a<? extends dc.w> aVar) {
            a(aVar);
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [pc.a, qc.h] */
    public u1() {
        ?? r22 = 0;
        this.invalidateCallbackTracker = new e0<>(c.f6110f, r22, 2, r22);
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.b();
    }

    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.a();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(w1<Key, Value> w1Var);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.c()) {
            u0 a10 = v0.a();
            boolean z10 = false;
            if (a10 != null && a10.a(3)) {
                z10 = true;
            }
            if (z10) {
                a10.b(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object load(a<Key> aVar, Continuation<? super b<Key, Value>> continuation);

    public final void registerInvalidatedCallback(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(aVar);
    }

    public final void unregisterInvalidatedCallback(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(aVar);
    }

    /* compiled from: PagingSource.kt */
    /* loaded from: classes.dex */
    public static abstract class b<Key, Value> {

        /* compiled from: PagingSource.kt */
        /* loaded from: classes.dex */
        public static final class a<Key, Value> extends b<Key, Value> {

            /* renamed from: f  reason: collision with root package name */
            private final Throwable f6102f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(null);
                qc.q.i(th, "throwable");
                this.f6102f = th;
            }

            public final Throwable a() {
                return this.f6102f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && qc.q.d(this.f6102f, ((a) obj).f6102f)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6102f.hashCode();
            }

            public String toString() {
                String h10;
                h10 = yc.o.h("LoadResult.Error(\n                    |   throwable: " + this.f6102f + "\n                    |) ", null, 1, null);
                return h10;
            }
        }

        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        /* compiled from: PagingSource.kt */
        /* renamed from: androidx.paging.u1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0145b<Key, Value> extends b<Key, Value> implements Iterable<Value>, rc.a {

            /* renamed from: s  reason: collision with root package name */
            public static final a f6103s = new a(null);

            /* renamed from: t  reason: collision with root package name */
            private static final C0145b f6104t;

            /* renamed from: f  reason: collision with root package name */
            private final List<Value> f6105f;

            /* renamed from: m  reason: collision with root package name */
            private final Key f6106m;

            /* renamed from: p  reason: collision with root package name */
            private final Key f6107p;

            /* renamed from: q  reason: collision with root package name */
            private final int f6108q;

            /* renamed from: r  reason: collision with root package name */
            private final int f6109r;

            /* compiled from: PagingSource.kt */
            /* renamed from: androidx.paging.u1$b$b$a */
            /* loaded from: classes.dex */
            public static final class a {
                private a() {
                }

                public /* synthetic */ a(qc.h hVar) {
                    this();
                }

                public final <Key, Value> C0145b<Key, Value> a() {
                    C0145b<Key, Value> b10 = b();
                    qc.q.g(b10, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return b10;
                }

                public final C0145b b() {
                    return C0145b.f6104t;
                }
            }

            static {
                List i10;
                i10 = ec.t.i();
                f6104t = new C0145b(i10, null, null, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0145b(List<? extends Value> list, Key key, Key key2, int i10, int i11) {
                super(null);
                qc.q.i(list, "data");
                this.f6105f = list;
                this.f6106m = key;
                this.f6107p = key2;
                this.f6108q = i10;
                this.f6109r = i11;
                if (!(i10 == Integer.MIN_VALUE || i10 >= 0)) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
                }
                if (!(i11 == Integer.MIN_VALUE || i11 >= 0)) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            public final List<Value> e() {
                return this.f6105f;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0145b)) {
                    return false;
                }
                C0145b c0145b = (C0145b) obj;
                if (qc.q.d(this.f6105f, c0145b.f6105f) && qc.q.d(this.f6106m, c0145b.f6106m) && qc.q.d(this.f6107p, c0145b.f6107p) && this.f6108q == c0145b.f6108q && this.f6109r == c0145b.f6109r) {
                    return true;
                }
                return false;
            }

            public final int f() {
                return this.f6109r;
            }

            public final int h() {
                return this.f6108q;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2 = this.f6105f.hashCode() * 31;
                Key key = this.f6106m;
                int i10 = 0;
                if (key == null) {
                    hashCode = 0;
                } else {
                    hashCode = key.hashCode();
                }
                int i11 = (hashCode2 + hashCode) * 31;
                Key key2 = this.f6107p;
                if (key2 != null) {
                    i10 = key2.hashCode();
                }
                return ((((i11 + i10) * 31) + this.f6108q) * 31) + this.f6109r;
            }

            public final Key i() {
                return this.f6107p;
            }

            @Override // java.lang.Iterable
            public Iterator<Value> iterator() {
                return this.f6105f.listIterator();
            }

            public final Key j() {
                return this.f6106m;
            }

            public String toString() {
                Object c02;
                Object n02;
                String h10;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("LoadResult.Page(\n                    |   data size: ");
                sb2.append(this.f6105f.size());
                sb2.append("\n                    |   first Item: ");
                c02 = ec.b0.c0(this.f6105f);
                sb2.append(c02);
                sb2.append("\n                    |   last Item: ");
                n02 = ec.b0.n0(this.f6105f);
                sb2.append(n02);
                sb2.append("\n                    |   nextKey: ");
                sb2.append(this.f6107p);
                sb2.append("\n                    |   prevKey: ");
                sb2.append(this.f6106m);
                sb2.append("\n                    |   itemsBefore: ");
                sb2.append(this.f6108q);
                sb2.append("\n                    |   itemsAfter: ");
                sb2.append(this.f6109r);
                sb2.append("\n                    |) ");
                h10 = yc.o.h(sb2.toString(), null, 1, null);
                return h10;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public C0145b(List<? extends Value> list, Key key, Key key2) {
                this(list, key, key2, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
                qc.q.i(list, "data");
            }
        }
    }
}
