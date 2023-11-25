package androidx.compose.foundation;

import androidx.compose.foundation.a;
import dc.w;
import k1.l0;
import k1.u0;
import k1.v0;
import kotlin.coroutines.Continuation;
import p1.n1;
import p1.o1;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public abstract class b extends p1.l implements o1.i, p1.h, o1 {
    private boolean C;
    private v.m D;
    private pc.a<w> E;
    private final a.C0018a F;
    private final pc.a<Boolean> G;
    private final v0 H;

    /* compiled from: Clickable.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(((Boolean) b.this.o(androidx.compose.foundation.gestures.d.g())).booleanValue() || t.l.c(b.this));
        }
    }

    /* compiled from: Clickable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.AbstractClickablePointerInputNode$pointerInputNode$1", f = "Clickable.kt", l = {846}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0019b extends kotlin.coroutines.jvm.internal.l implements pc.p<l0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1856f;

        /* renamed from: m  reason: collision with root package name */
        private /* synthetic */ Object f1857m;

        C0019b(Continuation<? super C0019b> continuation) {
            super(2, continuation);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, Continuation<? super w> continuation) {
            return ((C0019b) create(l0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            C0019b c0019b = new C0019b(continuation);
            c0019b.f1857m = obj;
            return c0019b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1856f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                l0 l0Var = (l0) this.f1857m;
                b bVar = b.this;
                this.f1856f = 1;
                if (bVar.R1(l0Var, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public /* synthetic */ b(boolean z10, v.m mVar, pc.a aVar, a.C0018a c0018a, qc.h hVar) {
        this(z10, mVar, aVar, c0018a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean N1() {
        return this.C;
    }

    @Override // p1.o1
    public void O(k1.r rVar, k1.t tVar, long j10) {
        qc.q.i(rVar, "pointerEvent");
        qc.q.i(tVar, "pass");
        this.H.O(rVar, tVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a.C0018a O1() {
        return this.F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final pc.a<w> P1() {
        return this.E;
    }

    @Override // p1.o1
    public /* synthetic */ boolean Q0() {
        return n1.d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object Q1(u.q qVar, long j10, Continuation<? super w> continuation) {
        Object d10;
        v.m mVar = this.D;
        if (mVar != null) {
            Object a10 = e.a(qVar, j10, mVar, this.F, this.G, continuation);
            d10 = ic.d.d();
            if (a10 == d10) {
                return a10;
            }
        }
        return w.f13270a;
    }

    protected abstract Object R1(l0 l0Var, Continuation<? super w> continuation);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void S1(boolean z10) {
        this.C = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void T1(v.m mVar) {
        this.D = mVar;
    }

    @Override // p1.o1
    public /* synthetic */ void U0() {
        n1.c(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U1(pc.a<w> aVar) {
        qc.q.i(aVar, "<set-?>");
        this.E = aVar;
    }

    @Override // p1.o1
    public void a0() {
        this.H.a0();
    }

    @Override // p1.o1
    public /* synthetic */ boolean g0() {
        return n1.a(this);
    }

    @Override // o1.i
    public /* synthetic */ o1.g l0() {
        return o1.h.b(this);
    }

    @Override // p1.o1
    public /* synthetic */ void m0() {
        n1.b(this);
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return o1.h.a(this, cVar);
    }

    private b(boolean z10, v.m mVar, pc.a<w> aVar, a.C0018a c0018a) {
        this.C = z10;
        this.D = mVar;
        this.E = aVar;
        this.F = c0018a;
        this.G = new a();
        this.H = (v0) I1(u0.a(new C0019b(null)));
    }
}
