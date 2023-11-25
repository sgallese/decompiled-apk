package androidx.compose.foundation.relocation;

import dc.w;
import j2.q;
import kotlin.coroutines.Continuation;
import n1.s;
import qc.r;
import z0.h;
import z0.m;

/* compiled from: BringIntoViewRequester.kt */
/* loaded from: classes.dex */
public final class d extends androidx.compose.foundation.relocation.a {
    private z.d C;

    /* compiled from: BringIntoViewRequester.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<h> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ h f2204f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f2205m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h hVar, d dVar) {
            super(0);
            this.f2204f = hVar;
            this.f2205m = dVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = this.f2204f;
            if (hVar == null) {
                s I1 = this.f2205m.I1();
                if (I1 != null) {
                    return m.c(q.c(I1.a()));
                }
                return null;
            }
            return hVar;
        }
    }

    public d(z.d dVar) {
        qc.q.i(dVar, "requester");
        this.C = dVar;
    }

    private final void M1() {
        z.d dVar = this.C;
        if (dVar instanceof b) {
            qc.q.g(dVar, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) dVar).b().v(this);
        }
    }

    public final Object L1(h hVar, Continuation<? super w> continuation) {
        Object d10;
        z.b K1 = K1();
        s I1 = I1();
        if (I1 == null) {
            return w.f13270a;
        }
        Object R = K1.R(I1, new a(hVar, this), continuation);
        d10 = ic.d.d();
        if (R == d10) {
            return R;
        }
        return w.f13270a;
    }

    public final void N1(z.d dVar) {
        qc.q.i(dVar, "requester");
        M1();
        if (dVar instanceof b) {
            ((b) dVar).b().d(this);
        }
        this.C = dVar;
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        N1(this.C);
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        M1();
    }
}
