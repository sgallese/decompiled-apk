package n3;

import ad.k0;
import androidx.paging.q0;
import androidx.paging.s0;
import androidx.paging.s1;
import dc.n;
import dc.w;
import hc.g;
import ic.d;
import j0.h0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;
import qc.q;

/* compiled from: LazyPagingItems.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final q0.c f20147a;

    /* renamed from: b  reason: collision with root package name */
    private static final s0 f20148b;

    /* compiled from: LazyPagingItems.kt */
    @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1", f = "LazyPagingItems.kt", l = {273, 275}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f20149f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ hc.f f20150m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n3.a<T> f20151p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyPagingItems.kt */
        @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {276}, m = "invokeSuspend")
        /* renamed from: n3.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0455a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f20152f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ n3.a<T> f20153m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0455a(n3.a<T> aVar, Continuation<? super C0455a> continuation) {
                super(2, continuation);
                this.f20153m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0455a(this.f20153m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C0455a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = d.d();
                int i10 = this.f20152f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    n3.a<T> aVar = this.f20153m;
                    this.f20152f = 1;
                    if (aVar.e(this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(hc.f fVar, n3.a<T> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f20150m = fVar;
            this.f20151p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f20150m, this.f20151p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.f20149f;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            } else {
                n.b(obj);
                if (q.d(this.f20150m, g.f16601f)) {
                    n3.a<T> aVar = this.f20151p;
                    this.f20149f = 1;
                    if (aVar.e(this) == d10) {
                        return d10;
                    }
                } else {
                    hc.f fVar = this.f20150m;
                    C0455a c0455a = new C0455a(this.f20151p, null);
                    this.f20149f = 2;
                    if (ad.g.g(fVar, c0455a, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: LazyPagingItems.kt */
    @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2", f = "LazyPagingItems.kt", l = {283, 285}, m = "invokeSuspend")
    /* renamed from: n3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0456b extends l implements p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f20154f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ hc.f f20155m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ n3.a<T> f20156p;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyPagingItems.kt */
        @f(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$2$1", f = "LazyPagingItems.kt", l = {286}, m = "invokeSuspend")
        /* renamed from: n3.b$b$a */
        /* loaded from: classes.dex */
        public static final class a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f20157f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ n3.a<T> f20158m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n3.a<T> aVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f20158m = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new a(this.f20158m, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = d.d();
                int i10 = this.f20157f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    n.b(obj);
                    n3.a<T> aVar = this.f20158m;
                    this.f20157f = 1;
                    if (aVar.d(this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0456b(hc.f fVar, n3.a<T> aVar, Continuation<? super C0456b> continuation) {
            super(2, continuation);
            this.f20155m = fVar;
            this.f20156p = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new C0456b(this.f20155m, this.f20156p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((C0456b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = d.d();
            int i10 = this.f20154f;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            } else {
                n.b(obj);
                if (q.d(this.f20155m, g.f16601f)) {
                    n3.a<T> aVar = this.f20156p;
                    this.f20154f = 1;
                    if (aVar.d(this) == d10) {
                        return d10;
                    }
                } else {
                    hc.f fVar = this.f20155m;
                    a aVar2 = new a(this.f20156p, null);
                    this.f20154f = 2;
                    if (ad.g.g(fVar, aVar2, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
    }

    static {
        q0.c cVar = new q0.c(false);
        f20147a = cVar;
        f20148b = new s0(q0.b.f6000b, cVar, cVar);
    }

    public static final <T> n3.a<T> b(dd.g<s1<T>> gVar, hc.f fVar, j0.l lVar, int i10, int i11) {
        q.i(gVar, "<this>");
        lVar.e(388053246);
        if ((i11 & 1) != 0) {
            fVar = g.f16601f;
        }
        if (j0.n.K()) {
            j0.n.V(388053246, i10, -1, "androidx.paging.compose.collectAsLazyPagingItems (LazyPagingItems.kt:264)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(gVar);
        Object f10 = lVar.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            f10 = new n3.a(gVar);
            lVar.J(f10);
        }
        lVar.N();
        n3.a<T> aVar = (n3.a) f10;
        h0.d(aVar, new a(fVar, aVar, null), lVar, 72);
        h0.d(aVar, new C0456b(fVar, aVar, null), lVar, 72);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return aVar;
    }
}
