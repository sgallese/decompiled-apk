package x;

import j0.g3;
import j0.y2;
import y.h0;

/* compiled from: LazyListItemProvider.kt */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.a<k> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<pc.l<x, dc.w>> f25592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(g3<? extends pc.l<? super x, dc.w>> g3Var) {
            super(0);
            this.f25592f = g3Var;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return new k(this.f25592f.getValue());
        }
    }

    /* compiled from: LazyListItemProvider.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.a<o> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g3<k> f25593f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ a0 f25594m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.b f25595p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g3<k> g3Var, a0 a0Var, androidx.compose.foundation.lazy.b bVar) {
            super(0);
            this.f25593f = g3Var;
            this.f25594m = a0Var;
            this.f25595p = bVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            k value = this.f25593f.getValue();
            return new o(this.f25594m, value, this.f25595p, new h0(this.f25594m.p(), value));
        }
    }

    public static final pc.a<n> a(a0 a0Var, pc.l<? super x, dc.w> lVar, j0.l lVar2, int i10) {
        qc.q.i(a0Var, "state");
        qc.q.i(lVar, "content");
        lVar2.e(-343736148);
        if (j0.n.K()) {
            j0.n.V(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:40)");
        }
        g3 m10 = y2.m(lVar, lVar2, (i10 >> 3) & 14);
        lVar2.e(1157296644);
        boolean Q = lVar2.Q(a0Var);
        Object f10 = lVar2.f();
        if (Q || f10 == j0.l.f18688a.a()) {
            androidx.compose.foundation.lazy.b bVar = new androidx.compose.foundation.lazy.b();
            f10 = new qc.x(y2.c(y2.l(), new c(y2.c(y2.l(), new b(m10)), a0Var, bVar))) { // from class: x.p.a
                @Override // wc.f
                public Object get() {
                    return ((g3) this.f21661m).getValue();
                }
            };
            lVar2.J(f10);
        }
        lVar2.N();
        wc.f fVar = (wc.f) f10;
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar2.N();
        return fVar;
    }
}
