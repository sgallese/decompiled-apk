package androidx.paging;

import androidx.paging.d1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedPageEventFlow.kt */
/* loaded from: classes.dex */
public final class v<T> {

    /* renamed from: a  reason: collision with root package name */
    private final w<T> f6111a = new w<>();

    /* renamed from: b  reason: collision with root package name */
    private final jd.a f6112b = jd.c.b(false, 1, null);

    /* renamed from: c  reason: collision with root package name */
    private int f6113c = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {288}, m = "getStateAsEvents")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f6114f;

        /* renamed from: m  reason: collision with root package name */
        Object f6115m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f6116p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v<T> f6117q;

        /* renamed from: r  reason: collision with root package name */
        int f6118r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v<T> vVar, Continuation<? super a> continuation) {
            super(continuation);
            this.f6117q = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6116p = obj;
            this.f6118r |= RecyclerView.UNDEFINED_DURATION;
            return this.f6117q.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPageEventFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {288}, m = "record")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f6119f;

        /* renamed from: m  reason: collision with root package name */
        Object f6120m;

        /* renamed from: p  reason: collision with root package name */
        Object f6121p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f6122q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v<T> f6123r;

        /* renamed from: s  reason: collision with root package name */
        int f6124s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(v<T> vVar, Continuation<? super b> continuation) {
            super(continuation);
            this.f6123r = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6122q = obj;
            this.f6124s |= RecyclerView.UNDEFINED_DURATION;
            return this.f6123r.c(null, this);
        }
    }

    public final d1.b<T> a() {
        Object c02;
        c02 = ec.b0.c0(this.f6111a.b());
        d1 d1Var = (d1) c02;
        if (d1Var == null || !(d1Var instanceof d1.b)) {
            return null;
        }
        d1.b<T> bVar = (d1.b) d1Var;
        if (bVar.d() != t0.REFRESH) {
            return null;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:18:0x004e, B:19:0x006e, B:21:0x0074, B:23:0x007c, B:24:0x007f), top: B:31:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation<? super java.util.List<? extends ec.g0<? extends androidx.paging.d1<T>>>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.paging.v.a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.paging.v$a r0 = (androidx.paging.v.a) r0
            int r1 = r0.f6118r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6118r = r1
            goto L18
        L13:
            androidx.paging.v$a r0 = new androidx.paging.v$a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f6116p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f6118r
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r1 = r0.f6115m
            jd.a r1 = (jd.a) r1
            java.lang.Object r0 = r0.f6114f
            androidx.paging.v r0 = (androidx.paging.v) r0
            dc.n.b(r9)
            goto L4e
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            dc.n.b(r9)
            jd.a r9 = r8.f6112b
            r0.f6114f = r8
            r0.f6115m = r9
            r0.f6118r = r4
            java.lang.Object r0 = r9.c(r3, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r8
            r1 = r9
        L4e:
            androidx.paging.w<T> r9 = r0.f6111a     // Catch: java.lang.Throwable -> L90
            java.util.List r9 = r9.b()     // Catch: java.lang.Throwable -> L90
            int r0 = r0.f6113c     // Catch: java.lang.Throwable -> L90
            int r2 = r9.size()     // Catch: java.lang.Throwable -> L90
            int r0 = r0 - r2
            int r0 = r0 + r4
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> L90
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L90
            r4 = 10
            int r4 = ec.r.s(r9, r4)     // Catch: java.lang.Throwable -> L90
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L90
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L90
            r4 = 0
        L6e:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> L90
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> L90
            int r6 = r4 + 1
            if (r4 >= 0) goto L7f
            ec.r.r()     // Catch: java.lang.Throwable -> L90
        L7f:
            androidx.paging.d1 r5 = (androidx.paging.d1) r5     // Catch: java.lang.Throwable -> L90
            ec.g0 r7 = new ec.g0     // Catch: java.lang.Throwable -> L90
            int r4 = r4 + r0
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L90
            r2.add(r7)     // Catch: java.lang.Throwable -> L90
            r4 = r6
            goto L6e
        L8c:
            r1.d(r3)
            return r2
        L90:
            r9 = move-exception
            r1.d(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.v.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ec.g0<? extends androidx.paging.d1<T>> r6, kotlin.coroutines.Continuation<? super dc.w> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.v.b
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.v$b r0 = (androidx.paging.v.b) r0
            int r1 = r0.f6124s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6124s = r1
            goto L18
        L13:
            androidx.paging.v$b r0 = new androidx.paging.v$b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6122q
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f6124s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.Object r6 = r0.f6121p
            jd.a r6 = (jd.a) r6
            java.lang.Object r1 = r0.f6120m
            ec.g0 r1 = (ec.g0) r1
            java.lang.Object r0 = r0.f6119f
            androidx.paging.v r0 = (androidx.paging.v) r0
            dc.n.b(r7)
            r7 = r6
            r6 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            dc.n.b(r7)
            jd.a r7 = r5.f6112b
            r0.f6119f = r5
            r0.f6120m = r6
            r0.f6121p = r7
            r0.f6124s = r4
            java.lang.Object r0 = r7.c(r3, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r5
        L55:
            int r1 = r6.a()     // Catch: java.lang.Throwable -> L6e
            r0.f6113c = r1     // Catch: java.lang.Throwable -> L6e
            androidx.paging.w<T> r0 = r0.f6111a     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Throwable -> L6e
            androidx.paging.d1 r6 = (androidx.paging.d1) r6     // Catch: java.lang.Throwable -> L6e
            r0.a(r6)     // Catch: java.lang.Throwable -> L6e
            dc.w r6 = dc.w.f13270a     // Catch: java.lang.Throwable -> L6e
            r7.d(r3)
            dc.w r6 = dc.w.f13270a
            return r6
        L6e:
            r6 = move-exception
            r7.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.v.c(ec.g0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
