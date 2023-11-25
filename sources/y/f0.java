package y;

import ec.n0;
import j0.g2;
import j0.w1;
import j0.z1;
import java.util.Map;

/* compiled from: LazySaveableStateHolder.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e0 f26071f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.q<s0.c, j0.l, Integer, dc.w> f26072m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f26073p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(e0 e0Var, pc.q<? super s0.c, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
            super(2);
            this.f26071f = e0Var;
            this.f26072m = qVar;
            this.f26073p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:48)");
            }
            this.f26071f.i(s0.e.a(lVar, 0));
            this.f26072m.invoke(this.f26071f, lVar, Integer.valueOf(((this.f26073p << 3) & 112) | 8));
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.q<s0.c, j0.l, Integer, dc.w> f26074f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f26075m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.q<? super s0.c, ? super j0.l, ? super Integer, dc.w> qVar, int i10) {
            super(2);
            this.f26074f = qVar;
            this.f26075m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            f0.a(this.f26074f, lVar, z1.a(this.f26075m | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazySaveableStateHolder.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.a<e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s0.f f26076f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s0.f fVar) {
            super(0);
            this.f26076f = fVar;
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final e0 invoke() {
            Map h10;
            s0.f fVar = this.f26076f;
            h10 = n0.h();
            return new e0(fVar, h10);
        }
    }

    public static final void a(pc.q<? super s0.c, ? super j0.l, ? super Integer, dc.w> qVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        qc.q.i(qVar, "content");
        j0.l q10 = lVar.q(674185128);
        if ((i10 & 14) == 0) {
            if (q10.l(qVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            s0.f fVar = (s0.f) q10.C(s0.h.b());
            e0 e0Var = (e0) s0.b.b(new Object[]{fVar}, e0.f26055d.a(fVar), null, new c(fVar), q10, 72, 4);
            j0.u.a(new w1[]{s0.h.b().c(e0Var)}, q0.c.b(q10, 1863926504, true, new a(e0Var, qVar, i11)), q10, 56);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(qVar, i10));
        }
    }
}
