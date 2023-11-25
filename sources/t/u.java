package t;

import a1.q1;
import a1.t3;
import androidx.compose.ui.e;
import j0.g2;
import j0.i2;
import j0.l3;
import j0.z1;
import java.util.List;
import n1.y0;
import p1.g;

/* compiled from: Image.kt */
/* loaded from: classes.dex */
public final class u {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class a implements n1.i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23206a = new a();

        /* compiled from: Image.kt */
        /* renamed from: t.u$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0545a extends qc.r implements pc.l<y0.a, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0545a f23207f = new C0545a();

            C0545a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
                qc.q.i(aVar, "$this$layout");
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
                invoke2(aVar);
                return dc.w.f13270a;
            }
        }

        a() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final n1.j0 mo0measure3p2s80s(n1.l0 l0Var, List<? extends n1.g0> list, long j10) {
            qc.q.i(l0Var, "$this$Layout");
            qc.q.i(list, "<anonymous parameter 0>");
            return n1.k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, C0545a.f23207f, 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n1.n nVar, List list, int i10) {
            return n1.h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n1.n nVar, List list, int i10) {
            return n1.h0.d(this, nVar, list, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d1.c f23208f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f23209m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f23210p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0.b f23211q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ n1.f f23212r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f23213s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ q1 f23214t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f23215u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ int f23216v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d1.c cVar, String str, androidx.compose.ui.e eVar, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10, int i11) {
            super(2);
            this.f23208f = cVar;
            this.f23209m = str;
            this.f23210p = eVar;
            this.f23211q = bVar;
            this.f23212r = fVar;
            this.f23213s = f10;
            this.f23214t = q1Var;
            this.f23215u = i10;
            this.f23216v = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            u.a(this.f23208f, this.f23209m, this.f23210p, this.f23211q, this.f23212r, this.f23213s, this.f23214t, lVar, z1.a(this.f23215u | 1), this.f23216v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Image.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<t1.x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f23217f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f23217f = str;
        }

        public final void a(t1.x xVar) {
            qc.q.i(xVar, "$this$semantics");
            t1.v.J(xVar, this.f23217f);
            t1.v.R(xVar, t1.i.f23425b.d());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(t1.x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    public static final void a(d1.c cVar, String str, androidx.compose.ui.e eVar, v0.b bVar, n1.f fVar, float f10, q1 q1Var, j0.l lVar, int i10, int i11) {
        e.a aVar;
        v0.b bVar2;
        n1.f fVar2;
        float f11;
        q1 q1Var2;
        androidx.compose.ui.e eVar2;
        qc.q.i(cVar, "painter");
        j0.l q10 = lVar.q(1142754848);
        if ((i11 & 4) != 0) {
            aVar = androidx.compose.ui.e.f2335a;
        } else {
            aVar = eVar;
        }
        if ((i11 & 8) != 0) {
            bVar2 = v0.b.f24258a.d();
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 16) != 0) {
            fVar2 = n1.f.f19964a.a();
        } else {
            fVar2 = fVar;
        }
        if ((i11 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 64) != 0) {
            q1Var2 = null;
        } else {
            q1Var2 = q1Var;
        }
        if (j0.n.K()) {
            j0.n.V(1142754848, i10, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        q10.e(-816794123);
        if (str != null) {
            e.a aVar2 = androidx.compose.ui.e.f2335a;
            q10.e(1157296644);
            boolean Q = q10.Q(str);
            Object f12 = q10.f();
            if (Q || f12 == j0.l.f18688a.a()) {
                f12 = new c(str);
                q10.J(f12);
            }
            q10.N();
            eVar2 = t1.o.c(aVar2, false, (pc.l) f12, 1, null);
        } else {
            eVar2 = androidx.compose.ui.e.f2335a;
        }
        q10.N();
        androidx.compose.ui.e b10 = androidx.compose.ui.draw.d.b(x0.e.b(aVar.a(eVar2)), cVar, false, bVar2, fVar2, f11, q1Var2, 2, null);
        a aVar3 = a.f23206a;
        q10.e(-1323940314);
        int a10 = j0.j.a(q10, 0);
        j0.v F = q10.F();
        g.a aVar4 = p1.g.f20790l;
        pc.a<p1.g> a11 = aVar4.a();
        pc.q<i2<p1.g>, j0.l, Integer, dc.w> a12 = n1.x.a(b10);
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(a11);
        } else {
            q10.H();
        }
        j0.l a13 = l3.a(q10);
        l3.b(a13, aVar3, aVar4.e());
        l3.b(a13, F, aVar4.g());
        pc.p<p1.g, Integer, dc.w> b11 = aVar4.b();
        if (a13.n() || !qc.q.d(a13.f(), Integer.valueOf(a10))) {
            a13.J(Integer.valueOf(a10));
            a13.I(Integer.valueOf(a10), b11);
        }
        a12.invoke(i2.a(i2.b(q10)), q10, 0);
        q10.e(2058660585);
        q10.N();
        q10.O();
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new b(cVar, str, aVar, bVar2, fVar2, f11, q1Var2, i10, i11));
        }
    }

    public static final void b(t3 t3Var, String str, androidx.compose.ui.e eVar, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10, j0.l lVar, int i11, int i12) {
        e.a aVar;
        v0.b bVar2;
        n1.f fVar2;
        float f11;
        q1 q1Var2;
        int i13;
        qc.q.i(t3Var, "bitmap");
        lVar.e(-1396260732);
        if ((i12 & 4) != 0) {
            aVar = androidx.compose.ui.e.f2335a;
        } else {
            aVar = eVar;
        }
        if ((i12 & 8) != 0) {
            bVar2 = v0.b.f24258a.d();
        } else {
            bVar2 = bVar;
        }
        if ((i12 & 16) != 0) {
            fVar2 = n1.f.f19964a.a();
        } else {
            fVar2 = fVar;
        }
        if ((i12 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i12 & 64) != 0) {
            q1Var2 = null;
        } else {
            q1Var2 = q1Var;
        }
        if ((i12 & 128) != 0) {
            i13 = c1.f.f8679g.b();
        } else {
            i13 = i10;
        }
        if (j0.n.K()) {
            j0.n.V(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        lVar.e(1157296644);
        boolean Q = lVar.Q(t3Var);
        Object f12 = lVar.f();
        if (Q || f12 == j0.l.f18688a.a()) {
            f12 = d1.b.b(t3Var, 0L, 0L, i13, 6, null);
            lVar.J(f12);
        }
        lVar.N();
        a((d1.a) f12, str, aVar, bVar2, fVar2, f11, q1Var2, lVar, (i11 & 112) | 8 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11), 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
    }
}
