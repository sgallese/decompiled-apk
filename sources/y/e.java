package y;

import ad.k0;
import androidx.compose.ui.e;
import j0.d3;
import j0.j1;
import j2.l;
import kotlin.coroutines.Continuation;
import s.k1;
import s.z0;

/* compiled from: LazyLayoutAnimateItemModifierNode.kt */
/* loaded from: classes.dex */
public final class e extends e.c {
    public static final a F = new a(null);
    private static final long G = j2.m.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private s.e0<j2.l> A;
    private final j1 B;
    private long C;
    private final s.a<j2.l, s.o> D;
    private final j1 E;

    /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final long a() {
            return e.G;
        }
    }

    /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$animatePlacementDelta$1", f = "LazyLayoutAnimateItemModifierNode.kt", l = {97, 103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f26047f;

        /* renamed from: m  reason: collision with root package name */
        int f26048m;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ long f26050q;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.l<s.a<j2.l, s.o>, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ e f26051f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ long f26052m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, long j10) {
                super(1);
                this.f26051f = eVar;
                this.f26052m = j10;
            }

            public final void a(s.a<j2.l, s.o> aVar) {
                qc.q.i(aVar, "$this$animateTo");
                e eVar = this.f26051f;
                long n10 = aVar.n().n();
                long j10 = this.f26052m;
                eVar.U1(j2.m.a(j2.l.j(n10) - j2.l.j(j10), j2.l.k(n10) - j2.l.k(j10)));
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(s.a<j2.l, s.o> aVar) {
                a(aVar);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f26050q = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new b(this.f26050q, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            s.e0<j2.l> O1;
            s.e0<j2.l> e0Var;
            d10 = ic.d.d();
            int i10 = this.f26048m;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        e.this.S1(false);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e0Var = (s.e0) this.f26047f;
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                if (e.this.D.q()) {
                    if (e.this.O1() instanceof z0) {
                        O1 = e.this.O1();
                    } else {
                        O1 = f.a();
                    }
                } else {
                    O1 = e.this.O1();
                }
                e0Var = O1;
                if (!e.this.D.q()) {
                    s.a aVar = e.this.D;
                    j2.l b10 = j2.l.b(this.f26050q);
                    this.f26047f = e0Var;
                    this.f26048m = 1;
                    if (aVar.u(b10, this) == d10) {
                        return d10;
                    }
                }
            }
            s.e0<j2.l> e0Var2 = e0Var;
            long n10 = ((j2.l) e.this.D.n()).n();
            long j10 = this.f26050q;
            long a10 = j2.m.a(j2.l.j(n10) - j2.l.j(j10), j2.l.k(n10) - j2.l.k(j10));
            s.a aVar2 = e.this.D;
            j2.l b11 = j2.l.b(a10);
            a aVar3 = new a(e.this, a10);
            this.f26047f = null;
            this.f26048m = 2;
            if (s.a.f(aVar2, b11, e0Var2, null, aVar3, this, 4, null) == d10) {
                return d10;
            }
            e.this.S1(false);
            return dc.w.f13270a;
        }
    }

    /* compiled from: LazyLayoutAnimateItemModifierNode.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemModifierNode$cancelAnimation$1", f = "LazyLayoutAnimateItemModifierNode.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f26053f;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((c) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f26053f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                s.a aVar = e.this.D;
                j2.l b10 = j2.l.b(j2.l.f18992b.a());
                this.f26053f = 1;
                if (aVar.u(b10, this) == d10) {
                    return d10;
                }
            }
            e.this.U1(j2.l.f18992b.a());
            e.this.S1(false);
            return dc.w.f13270a;
        }
    }

    public e(s.e0<j2.l> e0Var) {
        j1 e10;
        j1 e11;
        qc.q.i(e0Var, "placementAnimationSpec");
        this.A = e0Var;
        e10 = d3.e(Boolean.FALSE, null, 2, null);
        this.B = e10;
        this.C = G;
        l.a aVar = j2.l.f18992b;
        this.D = new s.a<>(j2.l.b(aVar.a()), k1.d(aVar), null, null, 12, null);
        e11 = d3.e(j2.l.b(aVar.a()), null, 2, null);
        this.E = e11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S1(boolean z10) {
        this.B.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U1(long j10) {
        this.E.setValue(j2.l.b(j10));
    }

    public final void M1(long j10) {
        long P1 = P1();
        long a10 = j2.m.a(j2.l.j(P1) - j2.l.j(j10), j2.l.k(P1) - j2.l.k(j10));
        U1(a10);
        S1(true);
        ad.i.d(i1(), null, null, new b(a10, null), 3, null);
    }

    public final void N1() {
        if (R1()) {
            ad.i.d(i1(), null, null, new c(null), 3, null);
        }
    }

    public final s.e0<j2.l> O1() {
        return this.A;
    }

    public final long P1() {
        return ((j2.l) this.E.getValue()).n();
    }

    public final long Q1() {
        return this.C;
    }

    public final boolean R1() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final void T1(s.e0<j2.l> e0Var) {
        qc.q.i(e0Var, "<set-?>");
        this.A = e0Var;
    }

    public final void V1(long j10) {
        this.C = j10;
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        U1(j2.l.f18992b.a());
        S1(false);
        this.C = G;
    }
}
