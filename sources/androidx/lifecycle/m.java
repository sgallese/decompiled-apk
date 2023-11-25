package androidx.lifecycle;

import ad.i2;
import ad.p1;
import androidx.lifecycle.m;
import kotlin.coroutines.Continuation;

/* compiled from: FlowLiveData.kt */
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FlowLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {110, 114}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<cd.p<? super T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        Object f4999f;

        /* renamed from: m */
        int f5000m;

        /* renamed from: p */
        private /* synthetic */ Object f5001p;

        /* renamed from: q */
        final /* synthetic */ LiveData<T> f5002q;

        /* compiled from: FlowLiveData.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.m$a$a */
        /* loaded from: classes.dex */
        public static final class C0097a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

            /* renamed from: f */
            int f5003f;

            /* renamed from: m */
            final /* synthetic */ LiveData<T> f5004m;

            /* renamed from: p */
            final /* synthetic */ g0<T> f5005p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0097a(LiveData<T> liveData, g0<T> g0Var, Continuation<? super C0097a> continuation) {
                super(2, continuation);
                this.f5004m = liveData;
                this.f5005p = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                return new C0097a(this.f5004m, this.f5005p, continuation);
            }

            @Override // pc.p
            public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                return ((C0097a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                ic.d.d();
                if (this.f5003f == 0) {
                    dc.n.b(obj);
                    this.f5004m.k(this.f5005p);
                    return dc.w.f13270a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: FlowLiveData.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.a<dc.w> {

            /* renamed from: f */
            final /* synthetic */ LiveData<T> f5006f;

            /* renamed from: m */
            final /* synthetic */ g0<T> f5007m;

            /* compiled from: FlowLiveData.kt */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.lifecycle.m$a$b$a */
            /* loaded from: classes.dex */
            public static final class C0098a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f */
                int f5008f;

                /* renamed from: m */
                final /* synthetic */ LiveData<T> f5009m;

                /* renamed from: p */
                final /* synthetic */ g0<T> f5010p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0098a(LiveData<T> liveData, g0<T> g0Var, Continuation<? super C0098a> continuation) {
                    super(2, continuation);
                    this.f5009m = liveData;
                    this.f5010p = g0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0098a(this.f5009m, this.f5010p, continuation);
                }

                @Override // pc.p
                public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0098a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    ic.d.d();
                    if (this.f5008f == 0) {
                        dc.n.b(obj);
                        this.f5009m.o(this.f5010p);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData<T> liveData, g0<T> g0Var) {
                super(0);
                this.f5006f = liveData;
                this.f5007m = g0Var;
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                ad.i.d(p1.f548f, ad.a1.c().N0(), null, new C0098a(this.f5006f, this.f5007m, null), 2, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5002q = liveData;
        }

        public static final void i(cd.p pVar, Object obj) {
            pVar.p(obj);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f5002q, continuation);
            aVar.f5001p = obj;
            return aVar;
        }

        @Override // pc.p
        /* renamed from: h */
        public final Object invoke(cd.p<? super T> pVar, Continuation<? super dc.w> continuation) {
            return ((a) create(pVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            g0 g0Var;
            cd.p pVar;
            d10 = ic.d.d();
            int i10 = this.f5000m;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) this.f4999f;
                pVar = (cd.p) this.f5001p;
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                final cd.p pVar2 = (cd.p) this.f5001p;
                g0Var = new g0() { // from class: androidx.lifecycle.l
                    @Override // androidx.lifecycle.g0
                    public final void onChanged(Object obj2) {
                        m.a.i(cd.p.this, obj2);
                    }
                };
                i2 N0 = ad.a1.c().N0();
                C0097a c0097a = new C0097a(this.f5002q, g0Var, null);
                this.f5001p = pVar2;
                this.f4999f = g0Var;
                this.f5000m = 1;
                if (ad.g.g(N0, c0097a, this) == d10) {
                    return d10;
                }
                pVar = pVar2;
            }
            b bVar = new b(this.f5002q, g0Var);
            this.f5001p = null;
            this.f4999f = null;
            this.f5000m = 2;
            if (cd.n.a(pVar, bVar, this) == d10) {
                return d10;
            }
            return dc.w.f13270a;
        }
    }

    /* compiled from: FlowLiveData.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {80}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b<T> extends kotlin.coroutines.jvm.internal.l implements pc.p<b0<T>, Continuation<? super dc.w>, Object> {

        /* renamed from: f */
        int f5011f;

        /* renamed from: m */
        private /* synthetic */ Object f5012m;

        /* renamed from: p */
        final /* synthetic */ dd.g<T> f5013p;

        /* compiled from: FlowLiveData.kt */
        /* loaded from: classes.dex */
        public static final class a<T> implements dd.h {

            /* renamed from: f */
            final /* synthetic */ b0<T> f5014f;

            a(b0<T> b0Var) {
                this.f5014f = b0Var;
            }

            @Override // dd.h
            public final Object emit(T t10, Continuation<? super dc.w> continuation) {
                Object d10;
                Object emit = this.f5014f.emit(t10, continuation);
                d10 = ic.d.d();
                if (emit == d10) {
                    return emit;
                }
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(dd.g<? extends T> gVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5013p = gVar;
        }

        @Override // pc.p
        /* renamed from: a */
        public final Object invoke(b0<T> b0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(b0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f5013p, continuation);
            bVar.f5012m = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f5011f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                b0 b0Var = (b0) this.f5012m;
                dd.g<T> gVar = this.f5013p;
                a aVar = new a(b0Var);
                this.f5011f = 1;
                if (gVar.collect(aVar, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> dd.g<T> a(LiveData<T> liveData) {
        qc.q.i(liveData, "<this>");
        return dd.i.h(dd.i.e(new a(liveData, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> b(dd.g<? extends T> gVar, hc.f fVar, long j10) {
        qc.q.i(gVar, "<this>");
        qc.q.i(fVar, "context");
        LiveData<T> liveData = (LiveData<T>) g.a(fVar, j10, new b(gVar, null));
        if (gVar instanceof dd.l0) {
            if (l.c.g().b()) {
                liveData.p(((dd.l0) gVar).getValue());
            } else {
                liveData.n(((dd.l0) gVar).getValue());
            }
        }
        return liveData;
    }

    public static /* synthetic */ LiveData c(dd.g gVar, hc.f fVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return b(gVar, fVar, j10);
    }
}
