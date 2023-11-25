package ic;

import dc.n;
import dc.w;
import hc.f;
import hc.g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import pc.l;
import pc.p;
import qc.k0;
import qc.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IntrinsicsJvm.kt */
/* loaded from: classes4.dex */
public class c {

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: classes4.dex */
    public static final class a extends j {

        /* renamed from: f  reason: collision with root package name */
        private int f17128f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f17129m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, l lVar) {
            super(continuation);
            this.f17129m = lVar;
            q.g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f17128f;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f17128f = 2;
                    n.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f17128f = 1;
            n.b(obj);
            q.g(this.f17129m, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((l) k0.e(this.f17129m, 1)).invoke(this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        private int f17130f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l f17131m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, f fVar, l lVar) {
            super(continuation, fVar);
            this.f17131m = lVar;
            q.g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f17130f;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f17130f = 2;
                    n.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f17130f = 1;
            n.b(obj);
            q.g(this.f17131m, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
            return ((l) k0.e(this.f17131m, 1)).invoke(this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* renamed from: ic.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0405c extends j {

        /* renamed from: f  reason: collision with root package name */
        private int f17132f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f17133m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f17134p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0405c(Continuation continuation, p pVar, Object obj) {
            super(continuation);
            this.f17133m = pVar;
            this.f17134p = obj;
            q.g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f17132f;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f17132f = 2;
                    n.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f17132f = 1;
            n.b(obj);
            q.g(this.f17133m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) k0.e(this.f17133m, 2)).invoke(this.f17134p, this);
        }
    }

    /* compiled from: IntrinsicsJvm.kt */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        private int f17135f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p f17136m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ Object f17137p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Continuation continuation, f fVar, p pVar, Object obj) {
            super(continuation, fVar);
            this.f17136m = pVar;
            this.f17137p = obj;
            q.g(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f17135f;
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f17135f = 2;
                    n.b(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f17135f = 1;
            n.b(obj);
            q.g(this.f17136m, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
            return ((p) k0.e(this.f17136m, 2)).invoke(this.f17137p, this);
        }
    }

    public static <T> Continuation<w> a(l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super T> continuation) {
        q.i(lVar, "<this>");
        q.i(continuation, "completion");
        Continuation<?> a10 = h.a(continuation);
        if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) lVar).create(a10);
        }
        f context = a10.getContext();
        if (context == g.f16601f) {
            return new a(a10, lVar);
        }
        return new b(a10, context, lVar);
    }

    public static <R, T> Continuation<w> b(p<? super R, ? super Continuation<? super T>, ? extends Object> pVar, R r10, Continuation<? super T> continuation) {
        q.i(pVar, "<this>");
        q.i(continuation, "completion");
        Continuation<?> a10 = h.a(continuation);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r10, a10);
        }
        f context = a10.getContext();
        if (context == g.f16601f) {
            return new C0405c(a10, pVar, r10);
        }
        return new d(a10, context, pVar, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Continuation<T> c(Continuation<? super T> continuation) {
        kotlin.coroutines.jvm.internal.d dVar;
        Continuation<T> continuation2;
        q.i(continuation, "<this>");
        if (continuation instanceof kotlin.coroutines.jvm.internal.d) {
            dVar = (kotlin.coroutines.jvm.internal.d) continuation;
        } else {
            dVar = null;
        }
        if (dVar != null && (continuation2 = (Continuation<T>) dVar.intercepted()) != null) {
            return continuation2;
        }
        return continuation;
    }
}
