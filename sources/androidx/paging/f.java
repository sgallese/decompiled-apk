package androidx.paging;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: CachedPagingData.kt */
/* loaded from: classes.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements dd.g<s1<T>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dd.g f5574f;

        /* compiled from: Emitters.kt */
        /* renamed from: androidx.paging.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0128a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ dd.h f5575f;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
            /* renamed from: androidx.paging.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0129a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f5576f;

                /* renamed from: m  reason: collision with root package name */
                int f5577m;

                public C0129a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f5576f = obj;
                    this.f5577m |= RecyclerView.UNDEFINED_DURATION;
                    return C0128a.this.emit(null, this);
                }
            }

            public C0128a(dd.h hVar) {
                this.f5575f = hVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.paging.f.a.C0128a.C0129a
                    if (r0 == 0) goto L13
                    r0 = r6
                    androidx.paging.f$a$a$a r0 = (androidx.paging.f.a.C0128a.C0129a) r0
                    int r1 = r0.f5577m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f5577m = r1
                    goto L18
                L13:
                    androidx.paging.f$a$a$a r0 = new androidx.paging.f$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f5576f
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f5577m
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    dc.n.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    dc.n.b(r6)
                    dd.h r6 = r4.f5575f
                    androidx.paging.w0 r5 = (androidx.paging.w0) r5
                    androidx.paging.s1 r5 = r5.b()
                    r0.f5577m = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    dc.w r5 = dc.w.f13270a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.f.a.C0128a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(dd.g gVar) {
            this.f5574f = gVar;
        }

        @Override // dd.g
        public Object collect(dd.h hVar, Continuation continuation) {
            Object d10;
            Object collect = this.f5574f.collect(new C0128a(hVar), continuation);
            d10 = ic.d.d();
            if (collect == d10) {
                return collect;
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {106}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super w0<T>>, s1<T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5579f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f5580m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5581p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ad.k0 f5582q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, ad.k0 k0Var, androidx.paging.a aVar) {
            super(3, continuation);
            this.f5582q = k0Var;
        }

        public final Object invoke(dd.h<? super w0<T>> hVar, s1<T> s1Var, Continuation<? super dc.w> continuation) {
            b bVar = new b(continuation, this.f5582q, null);
            bVar.f5580m = hVar;
            bVar.f5581p = s1Var;
            return bVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5579f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                dd.h hVar = (dd.h) this.f5580m;
                w0 w0Var = new w0(this.f5582q, (s1) this.f5581p, null);
                this.f5579f = 1;
                if (hVar.emit(w0Var, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super dc.w> continuation) {
            return invoke((dd.h) ((dd.h) obj), obj2, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<w0<T>, w0<T>, Continuation<? super w0<T>>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5583f;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f5584m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f5585p;

        c(Continuation<? super c> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(w0<T> w0Var, w0<T> w0Var2, Continuation<? super w0<T>> continuation) {
            c cVar = new c(continuation);
            cVar.f5584m = w0Var;
            cVar.f5585p = w0Var2;
            return cVar.invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5583f;
            if (i10 != 0) {
                if (i10 == 1) {
                    w0 w0Var = (w0) this.f5584m;
                    dc.n.b(obj);
                    return w0Var;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dc.n.b(obj);
            w0 w0Var2 = (w0) this.f5584m;
            w0 w0Var3 = (w0) this.f5585p;
            this.f5584m = w0Var3;
            this.f5583f = 1;
            if (w0Var2.c(this) == d10) {
                return d10;
            }
            return w0Var3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super s1<T>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5586f;

        d(androidx.paging.a aVar, Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super s1<T>> hVar, Continuation<? super dc.w> continuation) {
            return ((d) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new d(null, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            int i10 = this.f5586f;
            if (i10 == 0 || i10 == 1) {
                dc.n.b(obj);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e<T> extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super s1<T>>, Throwable, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f5587f;

        e(androidx.paging.a aVar, Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super s1<T>> hVar, Throwable th, Continuation<? super dc.w> continuation) {
            return new e(null, continuation).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            int i10 = this.f5587f;
            if (i10 == 0 || i10 == 1) {
                dc.n.b(obj);
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> dd.g<s1<T>> a(dd.g<s1<T>> gVar, ad.k0 k0Var) {
        qc.q.i(gVar, "<this>");
        qc.q.i(k0Var, "scope");
        return b(gVar, k0Var, null);
    }

    public static final <T> dd.g<s1<T>> b(dd.g<s1<T>> gVar, ad.k0 k0Var, androidx.paging.a aVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(k0Var, "scope");
        return dd.i.N(dd.i.I(dd.i.K(new a(x.b(x.d(gVar, new b(null, k0Var, aVar)), new c(null))), new d(aVar, null)), new e(aVar, null)), k0Var, dd.h0.f13324a.d(), 1);
    }
}
