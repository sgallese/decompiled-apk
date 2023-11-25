package androidx.compose.foundation.relocation;

import ad.i;
import ad.k0;
import ad.l0;
import ad.x1;
import dc.w;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.l;
import n1.s;
import o1.g;
import o1.j;
import pc.p;
import qc.n;
import qc.q;
import qc.r;
import z0.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BringIntoViewResponder.kt */
/* loaded from: classes.dex */
public final class f extends androidx.compose.foundation.relocation.a implements z.b {
    private z.e C;
    private final g D;

    /* compiled from: BringIntoViewResponder.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends l implements p<k0, Continuation<? super x1>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f2206f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f2207m;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ s f2209q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.a<h> f2210r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.a<h> f2211s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {170}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.relocation.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0029a extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f2212f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ f f2213m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ s f2214p;

            /* renamed from: q  reason: collision with root package name */
            final /* synthetic */ pc.a<h> f2215q;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: BringIntoViewResponder.kt */
            /* renamed from: androidx.compose.foundation.relocation.f$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0030a extends n implements pc.a<h> {

                /* renamed from: w  reason: collision with root package name */
                final /* synthetic */ f f2216w;

                /* renamed from: x  reason: collision with root package name */
                final /* synthetic */ s f2217x;

                /* renamed from: y  reason: collision with root package name */
                final /* synthetic */ pc.a<h> f2218y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0030a(f fVar, s sVar, pc.a<h> aVar) {
                    super(0, q.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.f2216w = fVar;
                    this.f2217x = sVar;
                    this.f2218y = aVar;
                }

                @Override // pc.a
                /* renamed from: h  reason: merged with bridge method [inline-methods] */
                public final h invoke() {
                    return f.M1(this.f2216w, this.f2217x, this.f2218y);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0029a(f fVar, s sVar, pc.a<h> aVar, Continuation<? super C0029a> continuation) {
                super(2, continuation);
                this.f2213m = fVar;
                this.f2214p = sVar;
                this.f2215q = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new C0029a(this.f2213m, this.f2214p, this.f2215q, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((C0029a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f2212f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    z.e N1 = this.f2213m.N1();
                    C0030a c0030a = new C0030a(this.f2213m, this.f2214p, this.f2215q);
                    this.f2212f = 1;
                    if (N1.e(c0030a, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BringIntoViewResponder.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {179}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends l implements p<k0, Continuation<? super w>, Object> {

            /* renamed from: f  reason: collision with root package name */
            int f2219f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ f f2220m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ pc.a<h> f2221p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(f fVar, pc.a<h> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f2220m = fVar;
                this.f2221p = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation<w> create(Object obj, Continuation<?> continuation) {
                return new b(this.f2220m, this.f2221p, continuation);
            }

            @Override // pc.p
            public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
                return ((b) create(k0Var, continuation)).invokeSuspend(w.f13270a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object d10;
                d10 = ic.d.d();
                int i10 = this.f2219f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        dc.n.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    dc.n.b(obj);
                    z.b K1 = this.f2220m.K1();
                    s I1 = this.f2220m.I1();
                    if (I1 == null) {
                        return w.f13270a;
                    }
                    pc.a<h> aVar = this.f2221p;
                    this.f2219f = 1;
                    if (K1.R(I1, aVar, this) == d10) {
                        return d10;
                    }
                }
                return w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, pc.a<h> aVar, pc.a<h> aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2209q = sVar;
            this.f2210r = aVar;
            this.f2211s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f2209q, this.f2210r, this.f2211s, continuation);
            aVar.f2207m = obj;
            return aVar;
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super x1> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x1 d10;
            ic.d.d();
            if (this.f2206f == 0) {
                dc.n.b(obj);
                k0 k0Var = (k0) this.f2207m;
                i.d(k0Var, null, null, new C0029a(f.this, this.f2209q, this.f2210r, null), 3, null);
                d10 = i.d(k0Var, null, null, new b(f.this, this.f2211s, null), 3, null);
                return d10;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: BringIntoViewResponder.kt */
    /* loaded from: classes.dex */
    static final class b extends r implements pc.a<h> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ s f2223m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.a<h> f2224p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar, pc.a<h> aVar) {
            super(0);
            this.f2223m = sVar;
            this.f2224p = aVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h M1 = f.M1(f.this, this.f2223m, this.f2224p);
            if (M1 != null) {
                return f.this.N1().m(M1);
            }
            return null;
        }
    }

    public f(z.e eVar) {
        q.i(eVar, "responder");
        this.C = eVar;
        this.D = j.b(dc.r.a(z.a.a(), this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h M1(f fVar, s sVar, pc.a<h> aVar) {
        h invoke;
        s I1 = fVar.I1();
        if (I1 == null) {
            return null;
        }
        if (!sVar.r()) {
            sVar = null;
        }
        if (sVar == null || (invoke = aVar.invoke()) == null) {
            return null;
        }
        return e.a(I1, sVar, invoke);
    }

    public final z.e N1() {
        return this.C;
    }

    public final void O1(z.e eVar) {
        q.i(eVar, "<set-?>");
        this.C = eVar;
    }

    @Override // z.b
    public Object R(s sVar, pc.a<h> aVar, Continuation<? super w> continuation) {
        Object d10;
        Object e10 = l0.e(new a(sVar, aVar, new b(sVar, aVar), null), continuation);
        d10 = ic.d.d();
        if (e10 == d10) {
            return e10;
        }
        return w.f13270a;
    }

    @Override // androidx.compose.foundation.relocation.a, o1.i
    public g l0() {
        return this.D;
    }
}
