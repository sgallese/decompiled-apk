package androidx.lifecycle;

import androidx.lifecycle.p;
import cd.s;
import kotlin.coroutines.Continuation;

/* compiled from: FlowExt.kt */
/* loaded from: classes.dex */
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FlowExt.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f4987f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f4988m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p f4989p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ p.b f4990q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ dd.g<T> f4991r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FlowExt.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0095a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f4992f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ dd.g<T> f4993m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ cd.p<T> f4994p;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FlowExt.kt */
            /* renamed from: androidx.lifecycle.k$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0096a<T> implements dd.h {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ cd.p<T> f4995f;

                /* JADX WARN: Multi-variable type inference failed */
                C0096a(cd.p<? super T> pVar) {
                    this.f4995f = pVar;
                }

                @Override // dd.h
                public final Object emit(T t10, Continuation<? super dc.w> continuation) {
                    Object d10;
                    Object r10 = this.f4995f.r(t10, continuation);
                    d10 = ic.d.d();
                    if (r10 == d10) {
                        return r10;
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0095a(dd.g<? extends T> gVar, cd.p<? super T> pVar, Continuation<? super C0095a> continuation) {
                super(2, continuation);
                this.f4993m = gVar;
                this.f4994p = pVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0095a(this.f4993m, this.f4994p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0095a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f4992f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    dd.g<T> gVar = this.f4993m;
                    C0096a c0096a = new C0096a(this.f4994p);
                    this.f4992f = 1;
                    if (gVar.collect(c0096a, this) == d10) {
                        return d10;
                    }
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p pVar, p.b bVar, dd.g<? extends T> gVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4989p = pVar;
            this.f4990q = bVar;
            this.f4991r = gVar;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
            return ((a) create(pVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f4989p, this.f4990q, this.f4991r, continuation);
            aVar.f4988m = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            cd.p pVar;
            d10 = ic.d.d();
            int i10 = this.f4987f;
            if (i10 != 0) {
                if (i10 == 1) {
                    pVar = (cd.p) this.f4988m;
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                cd.p pVar2 = (cd.p) this.f4988m;
                p pVar3 = this.f4989p;
                p.b bVar = this.f4990q;
                C0095a c0095a = new C0095a(this.f4991r, pVar2, null);
                this.f4988m = pVar2;
                this.f4987f = 1;
                if (RepeatOnLifecycleKt.a(pVar3, bVar, c0095a, this) == d10) {
                    return d10;
                }
                pVar = pVar2;
            }
            s.a.a(pVar, null, 1, null);
            return dc.w.f13270a;
        }
    }

    public static final <T> dd.g<T> a(dd.g<? extends T> gVar, p pVar, p.b bVar) {
        qc.q.i(gVar, "<this>");
        qc.q.i(pVar, "lifecycle");
        qc.q.i(bVar, "minActiveState");
        return dd.i.e(new a(pVar, bVar, gVar, null));
    }
}
