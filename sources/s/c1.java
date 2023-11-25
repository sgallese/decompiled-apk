package s;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* compiled from: SuspendAnimation.kt */
/* loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T, V] */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class a<T, V> extends qc.r implements pc.l<i<T, V>, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<T, T, dc.w> f22603f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ i1<T, V> f22604m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(pc.p<? super T, ? super T, dc.w> pVar, i1<T, V> i1Var) {
            super(1);
            this.f22603f = pVar;
            this.f22604m = i1Var;
        }

        public final void a(i<T, V> iVar) {
            qc.q.i(iVar, "$this$animate");
            this.f22603f.invoke(iVar.e(), this.f22604m.b().invoke(iVar.g()));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a((i) obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", l = {239, 278}, m = "animate")
    /* loaded from: classes.dex */
    public static final class b<T, V extends q> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f22605f;

        /* renamed from: m  reason: collision with root package name */
        Object f22606m;

        /* renamed from: p  reason: collision with root package name */
        Object f22607p;

        /* renamed from: q  reason: collision with root package name */
        Object f22608q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f22609r;

        /* renamed from: s  reason: collision with root package name */
        int f22610s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f22609r = obj;
            this.f22610s |= RecyclerView.UNDEFINED_DURATION;
            return c1.c(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l {

        /* renamed from: f  reason: collision with root package name */
        public static final c f22611f = new c();

        c() {
            super(1);
        }

        public final void a(i iVar) {
            qc.q.i(iVar, "$this$null");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Incorrect field signature: TV; */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<Long, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0<i<T, V>> f22612f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ T f22613m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s.e<T, V> f22614p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q f22615q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ l<T, V> f22616r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f22617s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ pc.l<i<T, V>, dc.w> f22618t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SuspendAnimation.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.a<dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ l<T, V> f22619f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l<T, V> lVar) {
                super(0);
                this.f22619f = lVar;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f22619f.u(false);
            }

            @Override // pc.a
            public /* bridge */ /* synthetic */ dc.w invoke() {
                invoke2();
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lqc/f0<Ls/i<TT;TV;>;>;TT;Ls/e<TT;TV;>;TV;Ls/l<TT;TV;>;FLpc/l<-Ls/i<TT;TV;>;Ldc/w;>;)V */
        /* JADX WARN: Multi-variable type inference failed */
        d(qc.f0 f0Var, Object obj, s.e eVar, q qVar, l lVar, float f10, pc.l lVar2) {
            super(1);
            this.f22612f = f0Var;
            this.f22613m = obj;
            this.f22614p = eVar;
            this.f22615q = qVar;
            this.f22616r = lVar;
            this.f22617s = f10;
            this.f22618t = lVar2;
        }

        /* JADX WARN: Type inference failed for: r12v0, types: [T, s.i] */
        public final void a(long j10) {
            qc.f0<i<T, V>> f0Var = this.f22612f;
            ?? iVar = new i(this.f22613m, this.f22614p.c(), this.f22615q, j10, this.f22614p.g(), j10, true, new a(this.f22616r));
            c1.k(iVar, j10, this.f22617s, this.f22614p, this.f22616r, this.f22618t);
            f0Var.f21676f = iVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
            a(l10.longValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.a<dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<T, V> f22620f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(l<T, V> lVar) {
            super(0);
            this.f22620f = lVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f22620f.u(false);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<Long, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.f0<i<T, V>> f22621f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f22622m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ s.e<T, V> f22623p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ l<T, V> f22624q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.l<i<T, V>, dc.w> f22625r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(qc.f0<i<T, V>> f0Var, float f10, s.e<T, V> eVar, l<T, V> lVar, pc.l<? super i<T, V>, dc.w> lVar2) {
            super(1);
            this.f22621f = f0Var;
            this.f22622m = f10;
            this.f22623p = eVar;
            this.f22624q = lVar;
            this.f22625r = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(long j10) {
            T t10 = this.f22621f.f21676f;
            qc.q.f(t10);
            c1.k((i) t10, j10, this.f22622m, this.f22623p, this.f22624q, this.f22625r);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
            a(l10.longValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class g extends qc.r implements pc.l {

        /* renamed from: f  reason: collision with root package name */
        public static final g f22626f = new g();

        g() {
            super(1);
        }

        public final void a(i iVar) {
            qc.q.i(iVar, "$this$null");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((i) obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: SuspendAnimation.kt */
    /* loaded from: classes.dex */
    public static final class h<R> extends qc.r implements pc.l<Long, R> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<Long, R> f22627f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(pc.l<? super Long, ? extends R> lVar) {
            super(1);
            this.f22627f = lVar;
        }

        public final R a(long j10) {
            return this.f22627f.invoke(Long.valueOf(j10 / 1));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ Object invoke(Long l10) {
            return a(l10.longValue());
        }
    }

    public static final Object b(float f10, float f11, float f12, j<Float> jVar, pc.p<? super Float, ? super Float, dc.w> pVar, Continuation<? super dc.w> continuation) {
        Object d10;
        Object d11 = d(k1.f(qc.j.f21682a), kotlin.coroutines.jvm.internal.b.c(f10), kotlin.coroutines.jvm.internal.b.c(f11), kotlin.coroutines.jvm.internal.b.c(f12), jVar, pVar, continuation);
        d10 = ic.d.d();
        if (d11 == d10) {
            return d11;
        }
        return dc.w.f13270a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ee A[Catch: CancellationException -> 0x0061, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0061, blocks: (B:16:0x005a, B:31:0x00e1, B:33:0x00ee), top: B:55:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, s.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends s.q> java.lang.Object c(s.l<T, V> r25, s.e<T, V> r26, long r27, pc.l<? super s.i<T, V>, dc.w> r29, kotlin.coroutines.Continuation<? super dc.w> r30) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.c1.c(s.l, s.e, long, pc.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T, V extends q> Object d(i1<T, V> i1Var, T t10, T t11, T t12, j<T> jVar, pc.p<? super T, ? super T, dc.w> pVar, Continuation<? super dc.w> continuation) {
        V d10;
        Object d11;
        if (t12 == null || (d10 = i1Var.a().invoke(t12)) == null) {
            d10 = r.d(i1Var.a().invoke(t10));
        }
        Object f10 = f(new l(i1Var, t10, d10, 0L, 0L, false, 56, null), new d1(jVar, i1Var, t10, t11, d10), 0L, new a(pVar, i1Var), continuation, 2, null);
        d11 = ic.d.d();
        if (f10 == d11) {
            return f10;
        }
        return dc.w.f13270a;
    }

    public static /* synthetic */ Object e(float f10, float f11, float f12, j jVar, pc.p pVar, Continuation continuation, int i10, Object obj) {
        float f13;
        if ((i10 & 4) != 0) {
            f13 = 0.0f;
        } else {
            f13 = f12;
        }
        if ((i10 & 8) != 0) {
            jVar = k.g(0.0f, 0.0f, null, 7, null);
        }
        return b(f10, f11, f13, jVar, pVar, continuation);
    }

    public static /* synthetic */ Object f(l lVar, s.e eVar, long j10, pc.l lVar2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            lVar2 = c.f22611f;
        }
        return c(lVar, eVar, j11, lVar2, continuation);
    }

    public static final <T, V extends q> Object g(l<T, V> lVar, y<T> yVar, boolean z10, pc.l<? super i<T, V>, dc.w> lVar2, Continuation<? super dc.w> continuation) {
        long j10;
        Object d10;
        x xVar = new x(yVar, lVar.j(), lVar.getValue(), lVar.m());
        if (z10) {
            j10 = lVar.f();
        } else {
            j10 = Long.MIN_VALUE;
        }
        Object c10 = c(lVar, xVar, j10, lVar2, continuation);
        d10 = ic.d.d();
        if (c10 == d10) {
            return c10;
        }
        return dc.w.f13270a;
    }

    public static /* synthetic */ Object h(l lVar, y yVar, boolean z10, pc.l lVar2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            lVar2 = g.f22626f;
        }
        return g(lVar, yVar, z10, lVar2, continuation);
    }

    private static final <R, T, V extends q> Object i(s.e<T, V> eVar, pc.l<? super Long, ? extends R> lVar, Continuation<? super R> continuation) {
        if (eVar.a()) {
            return k0.a(lVar, continuation);
        }
        return j0.z0.b(new h(lVar), continuation);
    }

    private static final <T, V extends q> void j(i<T, V> iVar, long j10, long j11, s.e<T, V> eVar, l<T, V> lVar, pc.l<? super i<T, V>, dc.w> lVar2) {
        iVar.j(j10);
        iVar.l(eVar.f(j11));
        iVar.m(eVar.d(j11));
        if (eVar.e(j11)) {
            iVar.i(iVar.c());
            iVar.k(false);
        }
        m(iVar, lVar);
        lVar2.invoke(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends q> void k(i<T, V> iVar, long j10, float f10, s.e<T, V> eVar, l<T, V> lVar, pc.l<? super i<T, V>, dc.w> lVar2) {
        boolean z10;
        long d10;
        if (f10 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            d10 = eVar.b();
        } else {
            d10 = ((float) (j10 - iVar.d())) / f10;
        }
        j(iVar, j10, d10, eVar, lVar, lVar2);
    }

    public static final float l(hc.f fVar) {
        float f10;
        boolean z10;
        qc.q.i(fVar, "<this>");
        v0.g gVar = (v0.g) fVar.get(v0.g.f24279o);
        if (gVar != null) {
            f10 = gVar.I();
        } else {
            f10 = 1.0f;
        }
        if (f10 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return f10;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final <T, V extends q> void m(i<T, V> iVar, l<T, V> lVar) {
        qc.q.i(iVar, "<this>");
        qc.q.i(lVar, "state");
        lVar.v(iVar.e());
        r.c(lVar.m(), iVar.g());
        lVar.s(iVar.b());
        lVar.t(iVar.c());
        lVar.u(iVar.h());
    }
}
