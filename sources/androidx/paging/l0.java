package androidx.paging;

import androidx.paging.o;
import androidx.paging.u1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* compiled from: LegacyPagingSource.kt */
/* loaded from: classes.dex */
public final class l0<Key, Value> extends u1<Key, Value> {

    /* renamed from: d  reason: collision with root package name */
    private static final c f5847d = new c(null);

    /* renamed from: a  reason: collision with root package name */
    private final hc.f f5848a;

    /* renamed from: b  reason: collision with root package name */
    private final o<Key, Value> f5849b;

    /* renamed from: c  reason: collision with root package name */
    private int f5850c;

    /* compiled from: LegacyPagingSource.kt */
    /* loaded from: classes.dex */
    /* synthetic */ class a implements o.d, qc.k {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l0<Key, Value> f5851f;

        a(l0<Key, Value> l0Var) {
            this.f5851f = l0Var;
        }

        @Override // androidx.paging.o.d
        public final void a() {
            this.f5851f.invalidate();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof o.d) || !(obj instanceof qc.k)) {
                return false;
            }
            return qc.q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
        }

        @Override // qc.k
        public final dc.c<?> getFunctionDelegate() {
            return new qc.n(0, this.f5851f, l0.class, "invalidate", "invalidate()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l0<Key, Value> f5852f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LegacyPagingSource.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class a implements o.d, qc.k {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ l0<Key, Value> f5853f;

            a(l0<Key, Value> l0Var) {
                this.f5853f = l0Var;
            }

            @Override // androidx.paging.o.d
            public final void a() {
                this.f5853f.invalidate();
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof o.d) || !(obj instanceof qc.k)) {
                    return false;
                }
                return qc.q.d(getFunctionDelegate(), ((qc.k) obj).getFunctionDelegate());
            }

            @Override // qc.k
            public final dc.c<?> getFunctionDelegate() {
                return new qc.n(0, this.f5853f, l0.class, "invalidate", "invalidate()V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0<Key, Value> l0Var) {
            super(0);
            this.f5852f = l0Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5852f.a().removeInvalidatedCallback(new a(this.f5852f));
            this.f5852f.a().invalidate();
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    /* loaded from: classes.dex */
    private static final class c {
        private c() {
        }

        public /* synthetic */ c(qc.h hVar) {
            this();
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5854a;

        static {
            int[] iArr = new int[o.e.values().length];
            try {
                iArr[o.e.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.e.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.e.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5854a = iArr;
        }
    }

    /* compiled from: LegacyPagingSource.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPagingSource$load$2", f = "LegacyPagingSource.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super u1.b.C0145b<Key, Value>>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5855f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l0<Key, Value> f5856m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ o.f<Key> f5857p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ u1.a<Key> f5858q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l0<Key, Value> l0Var, o.f<Key> fVar, u1.a<Key> aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f5856m = l0Var;
            this.f5857p = fVar;
            this.f5858q = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new e(this.f5856m, this.f5857p, this.f5858q, continuation);
        }

        public final Object invoke(ad.k0 k0Var, Continuation<? super u1.b.C0145b<Key, Value>> continuation) {
            return ((e) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            Object d11;
            Object c10;
            d10 = ic.d.d();
            int i10 = this.f5855f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                o<Key, Value> a10 = this.f5856m.a();
                o.f<Key> fVar = this.f5857p;
                this.f5855f = 1;
                obj = a10.load$paging_common(fVar, this);
                if (obj == d10) {
                    return d10;
                }
            }
            u1.a<Key> aVar = this.f5858q;
            o.a aVar2 = (o.a) obj;
            List<Value> list = aVar2.f5950a;
            if (list.isEmpty() && (aVar instanceof u1.a.c)) {
                d11 = null;
            } else {
                d11 = aVar2.d();
            }
            if (aVar2.f5950a.isEmpty() && (aVar instanceof u1.a.C0143a)) {
                c10 = null;
            } else {
                c10 = aVar2.c();
            }
            return new u1.b.C0145b(list, d11, c10, aVar2.b(), aVar2.a());
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ Object invoke(ad.k0 k0Var, Object obj) {
            return invoke(k0Var, (Continuation) ((Continuation) obj));
        }
    }

    public l0(hc.f fVar, o<Key, Value> oVar) {
        qc.q.i(fVar, "fetchContext");
        qc.q.i(oVar, "dataSource");
        this.f5848a = fVar;
        this.f5849b = oVar;
        this.f5850c = RecyclerView.UNDEFINED_DURATION;
        oVar.addInvalidatedCallback(new a(this));
        registerInvalidatedCallback(new b(this));
    }

    private final int b(u1.a<Key> aVar) {
        if ((aVar instanceof u1.a.d) && aVar.b() % 3 == 0) {
            return aVar.b() / 3;
        }
        return aVar.b();
    }

    public final o<Key, Value> a() {
        return this.f5849b;
    }

    public final void c(int i10) {
        boolean z10;
        int i11 = this.f5850c;
        if (i11 != Integer.MIN_VALUE && i10 != i11) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f5850c = i10;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.f5850c + '.').toString());
    }

    @Override // androidx.paging.u1
    public boolean getJumpingSupported() {
        if (this.f5849b.getType$paging_common() == o.e.POSITIONAL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:19:0x0054 */
    @Override // androidx.paging.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Key getRefreshKey(androidx.paging.w1<Key, Value> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "state"
            qc.q.i(r6, r0)
            androidx.paging.o<Key, Value> r0 = r5.f5849b
            androidx.paging.o$e r0 = r0.getType$paging_common()
            int[] r1 = androidx.paging.l0.d.f5854a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L3a
            r1 = 2
            if (r0 == r1) goto La0
            r1 = 3
            if (r0 != r1) goto L34
            java.lang.Integer r0 = r6.d()
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
            java.lang.Object r6 = r6.b(r0)
            if (r6 == 0) goto La0
            androidx.paging.o<Key, Value> r0 = r5.f5849b
            java.lang.Object r2 = r0.getKeyInternal$paging_common(r6)
            goto La0
        L34:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L3a:
            java.lang.Integer r0 = r6.d()
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
            int r1 = androidx.paging.w1.a(r6)
            int r1 = r0 - r1
            r2 = 0
            r3 = 0
        L4c:
            java.util.List r4 = r6.e()
            int r4 = ec.r.k(r4)
            if (r3 >= r4) goto L80
            java.util.List r4 = r6.e()
            java.lang.Object r4 = r4.get(r3)
            androidx.paging.u1$b$b r4 = (androidx.paging.u1.b.C0145b) r4
            java.util.List r4 = r4.e()
            int r4 = ec.r.k(r4)
            if (r1 <= r4) goto L80
            java.util.List r4 = r6.e()
            java.lang.Object r4 = r4.get(r3)
            androidx.paging.u1$b$b r4 = (androidx.paging.u1.b.C0145b) r4
            java.util.List r4 = r4.e()
            int r4 = r4.size()
            int r1 = r1 - r4
            int r3 = r3 + 1
            goto L4c
        L80:
            androidx.paging.u1$b$b r6 = r6.c(r0)
            if (r6 == 0) goto L8c
            java.lang.Object r6 = r6.j()
            if (r6 != 0) goto L90
        L8c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
        L90:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            qc.q.g(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = r6 + r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.l0.getRefreshKey(androidx.paging.w1):java.lang.Object");
    }

    @Override // androidx.paging.u1
    public Object load(u1.a<Key> aVar, Continuation<? super u1.b<Key, Value>> continuation) {
        t0 t0Var;
        if (aVar instanceof u1.a.d) {
            t0Var = t0.REFRESH;
        } else if (aVar instanceof u1.a.C0143a) {
            t0Var = t0.APPEND;
        } else if (aVar instanceof u1.a.c) {
            t0Var = t0.PREPEND;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        t0 t0Var2 = t0Var;
        if (this.f5850c == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.f5850c = b(aVar);
        }
        return ad.g.g(this.f5848a, new e(this, new o.f(t0Var2, aVar.a(), aVar.b(), aVar.c(), this.f5850c), aVar, null), continuation);
    }
}
