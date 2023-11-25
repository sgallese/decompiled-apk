package ed;

import ad.k0;
import ad.l0;
import ad.x1;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import qc.f0;

/* compiled from: Merge.kt */
/* loaded from: classes4.dex */
public final class h<T, R> extends f<T, R> {

    /* renamed from: r  reason: collision with root package name */
    private final pc.q<dd.h<? super R>, T, Continuation<? super dc.w>, Object> f14227r;

    /* compiled from: Merge.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f14228f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f14229m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ h<T, R> f14230p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ dd.h<R> f14231q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        /* renamed from: ed.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0338a<T> implements dd.h {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ f0<x1> f14232f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ k0 f14233m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ h<T, R> f14234p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ dd.h<R> f14235q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: ed.h$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0339a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

                /* renamed from: f  reason: collision with root package name */
                int f14236f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ h<T, R> f14237m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ dd.h<R> f14238p;

                /* renamed from: q  reason: collision with root package name */
                final /* synthetic */ T f14239q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0339a(h<T, R> hVar, dd.h<? super R> hVar2, T t10, Continuation<? super C0339a> continuation) {
                    super(2, continuation);
                    this.f14237m = hVar;
                    this.f14238p = hVar2;
                    this.f14239q = t10;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                    return new C0339a(this.f14237m, this.f14238p, this.f14239q, continuation);
                }

                @Override // pc.p
                public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
                    return ((C0339a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d10;
                    d10 = ic.d.d();
                    int i10 = this.f14236f;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            dc.n.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        dc.n.b(obj);
                        pc.q qVar = ((h) this.f14237m).f14227r;
                        dd.h<R> hVar = this.f14238p;
                        T t10 = this.f14239q;
                        this.f14236f = 1;
                        if (qVar.invoke(hVar, t10, this) == d10) {
                            return d10;
                        }
                    }
                    return dc.w.f13270a;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: ed.h$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: f  reason: collision with root package name */
                Object f14240f;

                /* renamed from: m  reason: collision with root package name */
                Object f14241m;

                /* renamed from: p  reason: collision with root package name */
                Object f14242p;

                /* renamed from: q  reason: collision with root package name */
                /* synthetic */ Object f14243q;

                /* renamed from: r  reason: collision with root package name */
                final /* synthetic */ C0338a<T> f14244r;

                /* renamed from: s  reason: collision with root package name */
                int f14245s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0338a<? super T> c0338a, Continuation<? super b> continuation) {
                    super(continuation);
                    this.f14244r = c0338a;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f14243q = obj;
                    this.f14245s |= RecyclerView.UNDEFINED_DURATION;
                    return this.f14244r.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0338a(f0<x1> f0Var, k0 k0Var, h<T, R> hVar, dd.h<? super R> hVar2) {
                this.f14232f = f0Var;
                this.f14233m = k0Var;
                this.f14234p = hVar;
                this.f14235q = hVar2;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // dd.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof ed.h.a.C0338a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    ed.h$a$a$b r0 = (ed.h.a.C0338a.b) r0
                    int r1 = r0.f14245s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f14245s = r1
                    goto L18
                L13:
                    ed.h$a$a$b r0 = new ed.h$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f14243q
                    java.lang.Object r1 = ic.b.d()
                    int r2 = r0.f14245s
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f14242p
                    ad.x1 r8 = (ad.x1) r8
                    java.lang.Object r8 = r0.f14241m
                    java.lang.Object r0 = r0.f14240f
                    ed.h$a$a r0 = (ed.h.a.C0338a) r0
                    dc.n.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    dc.n.b(r9)
                    qc.f0<ad.x1> r9 = r7.f14232f
                    T r9 = r9.f21676f
                    ad.x1 r9 = (ad.x1) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.c(r2)
                    r0.f14240f = r7
                    r0.f14241m = r8
                    r0.f14242p = r9
                    r0.f14245s = r3
                    java.lang.Object r9 = r9.z(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    qc.f0<ad.x1> r9 = r0.f14232f
                    ad.k0 r1 = r0.f14233m
                    r2 = 0
                    ad.m0 r3 = ad.m0.UNDISPATCHED
                    ed.h$a$a$a r4 = new ed.h$a$a$a
                    ed.h<T, R> r5 = r0.f14234p
                    dd.h<R> r0 = r0.f14235q
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    ad.x1 r8 = ad.g.d(r1, r2, r3, r4, r5, r6)
                    r9.f21676f = r8
                    dc.w r8 = dc.w.f13270a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: ed.h.a.C0338a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h<T, R> hVar, dd.h<? super R> hVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14230p = hVar;
            this.f14231q = hVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14230p, this.f14231q, continuation);
            aVar.f14229m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f14228f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f14229m;
                f0 f0Var = new f0();
                h<T, R> hVar = this.f14230p;
                dd.g<S> gVar = hVar.f14223q;
                C0338a c0338a = new C0338a(f0Var, k0Var, hVar, this.f14231q);
                this.f14228f = 1;
                if (gVar.collect(c0338a, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    public /* synthetic */ h(pc.q qVar, dd.g gVar, hc.f fVar, int i10, cd.a aVar, int i11, qc.h hVar) {
        this(qVar, gVar, (i11 & 4) != 0 ? hc.g.f16601f : fVar, (i11 & 8) != 0 ? -2 : i10, (i11 & 16) != 0 ? cd.a.SUSPEND : aVar);
    }

    @Override // ed.d
    protected d<R> j(hc.f fVar, int i10, cd.a aVar) {
        return new h(this.f14227r, this.f14223q, fVar, i10, aVar);
    }

    @Override // ed.f
    protected Object r(dd.h<? super R> hVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object e10 = l0.e(new a(this, hVar, null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return dc.w.f13270a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(pc.q<? super dd.h<? super R>, ? super T, ? super Continuation<? super dc.w>, ? extends Object> qVar, dd.g<? extends T> gVar, hc.f fVar, int i10, cd.a aVar) {
        super(gVar, fVar, i10, aVar);
        this.f14227r = qVar;
    }
}
