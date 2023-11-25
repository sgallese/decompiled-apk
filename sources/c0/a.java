package c0;

import a1.p1;
import a1.q1;
import a1.t3;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j0.g2;
import j0.z1;

/* compiled from: AndroidCursorHandle.android.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final float f8155a;

    /* renamed from: b  reason: collision with root package name */
    private static final float f8156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCursorHandle.android.kt */
    /* renamed from: c0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0192a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f8157f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8158m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f8159p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0192a(pc.p<? super j0.l, ? super Integer, dc.w> pVar, androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f8157f = pVar;
            this.f8158m = eVar;
            this.f8159p = i10;
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
                j0.n.V(-1458480226, i10, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:46)");
            }
            if (this.f8157f == null) {
                lVar.e(1275643833);
                a.b(this.f8158m, lVar, (this.f8159p >> 3) & 14);
                lVar.N();
            } else {
                lVar.e(1275643903);
                this.f8157f.invoke(lVar, Integer.valueOf((this.f8159p >> 6) & 14));
                lVar.N();
            }
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCursorHandle.android.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f8160f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8161m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.p<j0.l, Integer, dc.w> f8162p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f8163q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(long j10, androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, int i10) {
            super(2);
            this.f8160f = j10;
            this.f8161m = eVar;
            this.f8162p = pVar;
            this.f8163q = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.a(this.f8160f, this.f8161m, this.f8162p, lVar, z1.a(this.f8163q | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCursorHandle.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f8164f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f8165m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(androidx.compose.ui.e eVar, int i10) {
            super(2);
            this.f8164f = eVar;
            this.f8165m = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            a.b(this.f8164f, lVar, z1.a(this.f8165m | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidCursorHandle.android.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.q<androidx.compose.ui.e, j0.l, Integer, androidx.compose.ui.e> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f8166f = new d();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidCursorHandle.android.kt */
        /* renamed from: c0.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0193a extends qc.r implements pc.l<x0.d, x0.i> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ long f8167f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: AndroidCursorHandle.android.kt */
            /* renamed from: c0.a$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0194a extends qc.r implements pc.l<c1.c, dc.w> {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ float f8168f;

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ t3 f8169m;

                /* renamed from: p  reason: collision with root package name */
                final /* synthetic */ q1 f8170p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0194a(float f10, t3 t3Var, q1 q1Var) {
                    super(1);
                    this.f8168f = f10;
                    this.f8169m = t3Var;
                    this.f8170p = q1Var;
                }

                public final void a(c1.c cVar) {
                    qc.q.i(cVar, "$this$onDrawWithContent");
                    cVar.d1();
                    float f10 = this.f8168f;
                    t3 t3Var = this.f8169m;
                    q1 q1Var = this.f8170p;
                    c1.d y02 = cVar.y0();
                    long b10 = y02.b();
                    y02.d().k();
                    c1.i a10 = y02.a();
                    c1.h.b(a10, f10, 0.0f, 2, null);
                    a10.g(45.0f, z0.f.f26354b.c());
                    c1.e.h(cVar, t3Var, 0L, 0.0f, null, q1Var, 0, 46, null);
                    y02.d().p();
                    y02.c(b10);
                }

                @Override // pc.l
                public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
                    a(cVar);
                    return dc.w.f13270a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0193a(long j10) {
                super(1);
                this.f8167f = j10;
            }

            @Override // pc.l
            /* renamed from: a  reason: merged with bridge method [inline-methods] */
            public final x0.i invoke(x0.d dVar) {
                qc.q.i(dVar, "$this$drawWithCache");
                float i10 = z0.l.i(dVar.b()) / 2.0f;
                return dVar.f(new C0194a(i10, e0.a.e(dVar, i10), q1.a.b(q1.f163b, this.f8167f, 0, 2, null)));
            }
        }

        d() {
            super(3);
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
            qc.q.i(eVar, "$this$composed");
            lVar.e(-2126899193);
            if (j0.n.K()) {
                j0.n.V(-2126899193, i10, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:61)");
            }
            long b10 = ((e0.z) lVar.C(e0.a0.b())).b();
            e.a aVar = androidx.compose.ui.e.f2335a;
            p1 g10 = p1.g(b10);
            lVar.e(1157296644);
            boolean Q = lVar.Q(g10);
            Object f10 = lVar.f();
            if (Q || f10 == j0.l.f18688a.a()) {
                f10 = new C0193a(b10);
                lVar.J(f10);
            }
            lVar.N();
            androidx.compose.ui.e a10 = eVar.a(androidx.compose.ui.draw.b.c(aVar, (pc.l) f10));
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a10;
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ androidx.compose.ui.e invoke(androidx.compose.ui.e eVar, j0.l lVar, Integer num) {
            return a(eVar, lVar, num.intValue());
        }
    }

    static {
        float j10 = j2.h.j(25);
        f8155a = j10;
        f8156b = j2.h.j(j2.h.j(j10 * 2.0f) / 2.4142137f);
    }

    public static final void a(long j10, androidx.compose.ui.e eVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        qc.q.i(eVar, "modifier");
        j0.l q10 = lVar.q(-5185995);
        if ((i10 & 14) == 0) {
            if (q10.j(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (q10.Q(eVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (q10.l(pVar)) {
                i12 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && q10.t()) {
            q10.z();
        } else {
            if (j0.n.K()) {
                j0.n.V(-5185995, i11, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:38)");
            }
            e0.a.b(j10, e0.f.TopMiddle, q0.c.b(q10, -1458480226, true, new C0192a(pVar, eVar, i11)), q10, (i11 & 14) | 432);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(j10, eVar, pVar, i10));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, j0.l lVar, int i10) {
        int i11;
        int i12;
        qc.q.i(eVar, "modifier");
        j0.l q10 = lVar.q(694251107);
        if ((i10 & 14) == 0) {
            if (q10.Q(eVar)) {
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
                j0.n.V(694251107, i10, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            w.d0.a(c(androidx.compose.foundation.layout.m.p(eVar, f8156b, f8155a)), q10, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new c(eVar, i10));
        }
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar) {
        qc.q.i(eVar, "<this>");
        return androidx.compose.ui.c.b(eVar, null, d.f8166f, 1, null);
    }
}
