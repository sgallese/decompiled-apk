package t;

import j0.g2;
import j0.z1;

/* compiled from: Canvas.kt */
/* loaded from: classes.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Canvas.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23180f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<c1.f, dc.w> f23181m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f23182p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.e eVar, pc.l<? super c1.f, dc.w> lVar, int i10) {
            super(2);
            this.f23180f = eVar;
            this.f23181m = lVar;
            this.f23182p = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            i.a(this.f23180f, this.f23181m, lVar, z1.a(this.f23182p | 1));
        }
    }

    public static final void a(androidx.compose.ui.e eVar, pc.l<? super c1.f, dc.w> lVar, j0.l lVar2, int i10) {
        int i11;
        int i12;
        int i13;
        qc.q.i(eVar, "modifier");
        qc.q.i(lVar, "onDraw");
        j0.l q10 = lVar2.q(-932836462);
        if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.l(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-932836462, i10, -1, "androidx.compose.foundation.Canvas (Canvas.kt:41)");
            }
            w.d0.a(androidx.compose.ui.draw.b.b(eVar, lVar), q10, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new a(eVar, lVar, i10));
        }
    }
}
