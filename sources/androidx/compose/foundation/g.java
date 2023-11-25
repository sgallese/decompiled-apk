package androidx.compose.foundation;

import androidx.compose.foundation.a;
import dc.w;
import k1.l0;
import kotlin.coroutines.Continuation;
import u.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class g extends androidx.compose.foundation.b {

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.ClickablePointerInputNode$pointerInput$2", f = "Clickable.kt", l = {892}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements pc.q<u.q, z0.f, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1892f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f1893m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ long f1894p;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object a(u.q qVar, long j10, Continuation<? super w> continuation) {
            a aVar = new a(continuation);
            aVar.f1893m = qVar;
            aVar.f1894p = j10;
            return aVar.invokeSuspend(w.f13270a);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ Object invoke(u.q qVar, z0.f fVar, Continuation<? super w> continuation) {
            return a(qVar, fVar.x(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1892f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                u.q qVar = (u.q) this.f1893m;
                long j10 = this.f1894p;
                if (g.this.N1()) {
                    g gVar = g.this;
                    this.f1892f = 1;
                    if (gVar.Q1(qVar, j10, this) == d10) {
                        return d10;
                    }
                }
            }
            return w.f13270a;
        }
    }

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<z0.f, w> {
        b() {
            super(1);
        }

        public final void a(long j10) {
            if (g.this.N1()) {
                g.this.P1().invoke();
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(z0.f fVar) {
            a(fVar.x());
            return w.f13270a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z10, v.m mVar, pc.a<w> aVar, a.C0018a c0018a) {
        super(z10, mVar, aVar, c0018a, null);
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        qc.q.i(c0018a, "interactionData");
    }

    @Override // androidx.compose.foundation.b
    protected Object R1(l0 l0Var, Continuation<? super w> continuation) {
        Object d10;
        a.C0018a O1 = O1();
        long b10 = j2.q.b(l0Var.a());
        O1.d(z0.g.a(j2.l.j(b10), j2.l.k(b10)));
        Object h10 = z.h(l0Var, new a(null), new b(), continuation);
        d10 = ic.d.d();
        if (h10 == d10) {
            return h10;
        }
        return w.f13270a;
    }

    public final void V1(boolean z10, v.m mVar, pc.a<w> aVar) {
        qc.q.i(mVar, "interactionSource");
        qc.q.i(aVar, "onClick");
        S1(z10);
        U1(aVar);
        T1(mVar);
    }
}
