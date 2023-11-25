package androidx.compose.foundation;

import ad.k0;
import androidx.compose.ui.e;
import dc.w;
import kotlin.coroutines.Continuation;

/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
final class j extends e.c {
    private v.m A;
    private v.d B;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Focusable.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.FocusableInteractionNode$emitWithFallback$1", f = "Focusable.kt", l = {310}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<k0, Continuation<? super w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        int f1998f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ v.m f1999m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ v.j f2000p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v.m mVar, v.j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1999m = mVar;
            this.f2000p = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new a(this.f1999m, this.f2000p, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((a) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            d10 = ic.d.d();
            int i10 = this.f1998f;
            if (i10 != 0) {
                if (i10 == 1) {
                    dc.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                dc.n.b(obj);
                v.m mVar = this.f1999m;
                v.j jVar = this.f2000p;
                this.f1998f = 1;
                if (mVar.c(jVar, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    public j(v.m mVar) {
        this.A = mVar;
    }

    private final void I1() {
        v.d dVar;
        v.m mVar = this.A;
        if (mVar != null && (dVar = this.B) != null) {
            mVar.a(new v.e(dVar));
        }
        this.B = null;
    }

    private final void J1(v.m mVar, v.j jVar) {
        if (p1()) {
            ad.i.d(i1(), null, null, new a(mVar, jVar, null), 3, null);
        } else {
            mVar.a(jVar);
        }
    }

    public final void K1(boolean z10) {
        v.m mVar = this.A;
        if (mVar != null) {
            if (z10) {
                v.d dVar = this.B;
                if (dVar != null) {
                    J1(mVar, new v.e(dVar));
                    this.B = null;
                }
                v.d dVar2 = new v.d();
                J1(mVar, dVar2);
                this.B = dVar2;
                return;
            }
            v.d dVar3 = this.B;
            if (dVar3 != null) {
                J1(mVar, new v.e(dVar3));
                this.B = null;
            }
        }
    }

    public final void L1(v.m mVar) {
        if (!qc.q.d(this.A, mVar)) {
            I1();
            this.A = mVar;
        }
    }
}
