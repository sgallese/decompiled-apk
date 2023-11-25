package androidx.paging;

import androidx.paging.d1;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CachedPagingData.kt */
/* loaded from: classes.dex */
public final class w0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ad.k0 f6133a;

    /* renamed from: b  reason: collision with root package name */
    private final s1<T> f6134b;

    /* renamed from: c  reason: collision with root package name */
    private final e<T> f6135c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {51}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super d1<T>>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6136f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w0<T> f6137m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w0<T> w0Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6137m = w0Var;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super d1<T>> hVar, Continuation<? super dc.w> continuation) {
            return ((a) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f6137m, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            int i10 = this.f6136f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                this.f6137m.d();
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.q<dd.h<? super d1<T>>, Throwable, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f6138f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ w0<T> f6139m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w0<T> w0Var, Continuation<? super b> continuation) {
            super(3, continuation);
            this.f6139m = w0Var;
        }

        @Override // pc.q
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super d1<T>> hVar, Throwable th, Continuation<? super dc.w> continuation) {
            return new b(this.f6139m, continuation).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            int i10 = this.f6138f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                this.f6139m.d();
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CachedPagingData.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<d1.b<T>> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w0<T> f6140f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(w0<T> w0Var) {
            super(0);
            this.f6140f = w0Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final d1.b<T> invoke() {
            return ((w0) this.f6140f).f6135c.f();
        }
    }

    public w0(ad.k0 k0Var, s1<T> s1Var, androidx.paging.a aVar) {
        qc.q.i(k0Var, "scope");
        qc.q.i(s1Var, "parent");
        this.f6133a = k0Var;
        this.f6134b = s1Var;
        this.f6135c = new e<>(s1Var.b(), k0Var);
    }

    public final s1<T> b() {
        return new s1<>(dd.i.I(dd.i.K(this.f6135c.g(), new a(this, null)), new b(this, null)), this.f6134b.d(), this.f6134b.c(), new c(this));
    }

    public final Object c(Continuation<? super dc.w> continuation) {
        this.f6135c.e();
        return dc.w.f13270a;
    }

    public final androidx.paging.a d() {
        return null;
    }
}
