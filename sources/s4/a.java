package s4;

import a1.q1;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.g4;
import androidx.compose.ui.platform.z0;
import c5.c;
import c5.k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import j0.g2;
import j0.l;
import j0.l3;
import j0.z1;
import java.util.List;
import n1.g0;
import n1.h0;
import n1.i0;
import n1.j0;
import n1.k0;
import n1.l0;
import n1.n;
import n1.y0;
import p1.g;
import pc.p;
import qc.q;
import qc.r;
import s4.b;
import t1.o;
import t1.v;
import t1.x;

/* compiled from: AsyncImage.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImage.kt */
    /* renamed from: s4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0530a extends r implements p<l, Integer, w> {
        final /* synthetic */ int A;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f22946f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f22947m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ q4.g f22948p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f22949q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ pc.l<b.c, b.c> f22950r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ pc.l<b.c, w> f22951s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ v0.b f22952t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ n1.f f22953u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ float f22954v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ q1 f22955w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ int f22956x;

        /* renamed from: y  reason: collision with root package name */
        final /* synthetic */ int f22957y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ int f22958z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0530a(Object obj, String str, q4.g gVar, androidx.compose.ui.e eVar, pc.l<? super b.c, ? extends b.c> lVar, pc.l<? super b.c, w> lVar2, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10, int i11, int i12, int i13) {
            super(2);
            this.f22946f = obj;
            this.f22947m = str;
            this.f22948p = gVar;
            this.f22949q = eVar;
            this.f22950r = lVar;
            this.f22951s = lVar2;
            this.f22952t = bVar;
            this.f22953u = fVar;
            this.f22954v = f10;
            this.f22955w = q1Var;
            this.f22956x = i10;
            this.f22957y = i11;
            this.f22958z = i12;
            this.A = i13;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            a.a(this.f22946f, this.f22947m, this.f22948p, this.f22949q, this.f22950r, this.f22951s, this.f22952t, this.f22953u, this.f22954v, this.f22955w, this.f22956x, lVar, z1.a(this.f22957y | 1), z1.a(this.f22958z), this.A);
        }
    }

    /* compiled from: Composables.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.a<p1.g> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a f22959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pc.a aVar) {
            super(0);
            this.f22959f = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [p1.g, java.lang.Object] */
        @Override // pc.a
        public final p1.g invoke() {
            return this.f22959f.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImage.kt */
    /* loaded from: classes.dex */
    public static final class c implements i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22960a = new c();

        /* compiled from: AsyncImage.kt */
        /* renamed from: s4.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0531a extends r implements pc.l<y0.a, w> {

            /* renamed from: f  reason: collision with root package name */
            public static final C0531a f22961f = new C0531a();

            C0531a() {
                super(1);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(y0.a aVar) {
            }

            @Override // pc.l
            public /* bridge */ /* synthetic */ w invoke(y0.a aVar) {
                invoke2(aVar);
                return w.f13270a;
            }
        }

        c() {
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicHeight(n nVar, List list, int i10) {
            return h0.a(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int maxIntrinsicWidth(n nVar, List list, int i10) {
            return h0.b(this, nVar, list, i10);
        }

        @Override // n1.i0
        /* renamed from: measure-3p2s80s */
        public final j0 mo0measure3p2s80s(l0 l0Var, List<? extends g0> list, long j10) {
            return k0.b(l0Var, j2.b.p(j10), j2.b.o(j10), null, C0531a.f22961f, 4, null);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicHeight(n nVar, List list, int i10) {
            return h0.c(this, nVar, list, i10);
        }

        @Override // n1.i0
        public /* synthetic */ int minIntrinsicWidth(n nVar, List list, int i10) {
            return h0.d(this, nVar, list, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImage.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements p<l, Integer, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f22962f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d1.c f22963m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ String f22964p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ v0.b f22965q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ n1.f f22966r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ float f22967s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ q1 f22968t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f22969u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, d1.c cVar, String str, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10) {
            super(2);
            this.f22962f = eVar;
            this.f22963m = cVar;
            this.f22964p = str;
            this.f22965q = bVar;
            this.f22966r = fVar;
            this.f22967s = f10;
            this.f22968t = q1Var;
            this.f22969u = i10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(l lVar, int i10) {
            a.b(this.f22962f, this.f22963m, this.f22964p, this.f22965q, this.f22966r, this.f22967s, this.f22968t, lVar, z1.a(this.f22969u | 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncImage.kt */
    /* loaded from: classes.dex */
    public static final class e extends r implements pc.l<x, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f22970f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.f22970f = str;
        }

        public final void a(x xVar) {
            v.J(xVar, this.f22970f);
            v.R(xVar, t1.i.f23425b.d());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(x xVar) {
            a(xVar);
            return w.f13270a;
        }
    }

    public static final void a(Object obj, String str, q4.g gVar, androidx.compose.ui.e eVar, pc.l<? super b.c, ? extends b.c> lVar, pc.l<? super b.c, w> lVar2, v0.b bVar, n1.f fVar, float f10, q1 q1Var, int i10, l lVar3, int i11, int i12, int i13) {
        int i14;
        int i15;
        l q10 = lVar3.q(-2030202961);
        e.a aVar = (i13 & 8) != 0 ? androidx.compose.ui.e.f2335a : eVar;
        pc.l<b.c, b.c> a10 = (i13 & 16) != 0 ? s4.b.I.a() : lVar;
        pc.l<? super b.c, w> lVar4 = (i13 & 32) != 0 ? null : lVar2;
        v0.b d10 = (i13 & 64) != 0 ? v0.b.f24258a.d() : bVar;
        n1.f a11 = (i13 & 128) != 0 ? n1.f.f19964a.a() : fVar;
        float f11 = (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 1.0f : f10;
        q1 q1Var2 = (i13 & 512) != 0 ? null : q1Var;
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            i15 = i12 & (-15);
            i14 = c1.f.f8679g.b();
        } else {
            i14 = i10;
            i15 = i12;
        }
        if (j0.n.K()) {
            j0.n.V(-2030202961, i11, i15, "coil.compose.AsyncImage (AsyncImage.kt:118)");
        }
        b5.h f12 = f(j.d(obj, q10, 8), a11, q10, 8 | ((i11 >> 18) & 112));
        int i16 = i11 >> 6;
        int i17 = i11 >> 9;
        int i18 = i17 & 57344;
        pc.l<? super b.c, ? extends b.c> lVar5 = a10;
        pc.l<? super b.c, w> lVar6 = lVar4;
        n1.f fVar2 = a11;
        int i19 = i14;
        s4.b d11 = s4.c.d(f12, gVar, lVar5, lVar6, fVar2, i19, q10, ((i15 << 15) & 458752) | (i16 & 7168) | (i16 & 896) | 72 | i18, 0);
        c5.j K = f12.K();
        b(K instanceof s4.d ? aVar.a((androidx.compose.ui.e) K) : aVar, d11, str, d10, a11, f11, q1Var2, q10, (i17 & 7168) | ((i11 << 3) & 896) | i18 | (i17 & 458752) | (3670016 & i17));
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 == null) {
            return;
        }
        w10.a(new C0530a(obj, str, gVar, aVar, a10, lVar4, d10, a11, f11, q1Var2, i14, i11, i12, i13));
    }

    public static final void b(androidx.compose.ui.e eVar, d1.c cVar, String str, v0.b bVar, n1.f fVar, float f10, q1 q1Var, l lVar, int i10) {
        l q10 = lVar.q(10290533);
        if (j0.n.K()) {
            j0.n.V(10290533, i10, -1, "coil.compose.Content (AsyncImage.kt:156)");
        }
        androidx.compose.ui.e a10 = x0.e.b(d(eVar, str)).a(new s4.e(cVar, bVar, fVar, f10, q1Var));
        c cVar2 = c.f22960a;
        q10.e(544976794);
        j2.e eVar2 = (j2.e) q10.C(z0.e());
        j2.r rVar = (j2.r) q10.C(z0.j());
        g4 g4Var = (g4) q10.C(z0.n());
        androidx.compose.ui.e c10 = androidx.compose.ui.c.c(q10, a10);
        g.a aVar = p1.g.f20790l;
        pc.a<p1.g> a11 = aVar.a();
        q10.e(1405779621);
        if (!(q10.u() instanceof j0.f)) {
            j0.j.c();
        }
        q10.s();
        if (q10.n()) {
            q10.B(new b(a11));
        } else {
            q10.H();
        }
        l a12 = l3.a(q10);
        l3.b(a12, cVar2, aVar.e());
        l3.b(a12, eVar2, aVar.c());
        l3.b(a12, rVar, aVar.d());
        l3.b(a12, g4Var, aVar.h());
        l3.b(a12, c10, aVar.f());
        q10.O();
        q10.N();
        q10.N();
        if (j0.n.K()) {
            j0.n.U();
        }
        g2 w10 = q10.w();
        if (w10 != null) {
            w10.a(new d(eVar, cVar, str, bVar, fVar, f10, q1Var, i10));
        }
    }

    private static final androidx.compose.ui.e d(androidx.compose.ui.e eVar, String str) {
        if (str != null) {
            return o.c(eVar, false, new e(str), 1, null);
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5.i e(long j10) {
        c5.c cVar;
        c5.c cVar2;
        if (j2.b.r(j10)) {
            return null;
        }
        if (j2.b.j(j10)) {
            cVar = c5.a.a(j2.b.n(j10));
        } else {
            cVar = c.b.f8841a;
        }
        if (j2.b.i(j10)) {
            cVar2 = c5.a.a(j2.b.m(j10));
        } else {
            cVar2 = c.b.f8841a;
        }
        return new c5.i(cVar, cVar2);
    }

    public static final b5.h f(b5.h hVar, n1.f fVar, l lVar, int i10) {
        c5.j jVar;
        lVar.e(402368983);
        if (j0.n.K()) {
            j0.n.V(402368983, i10, -1, "coil.compose.updateRequest (AsyncImage.kt:183)");
        }
        if (hVar.q().m() == null) {
            if (q.d(fVar, n1.f.f19964a.c())) {
                jVar = k.a(c5.i.f8847d);
            } else {
                lVar.e(-492369756);
                Object f10 = lVar.f();
                if (f10 == l.f18688a.a()) {
                    f10 = new s4.d();
                    lVar.J(f10);
                }
                lVar.N();
                jVar = (c5.j) f10;
            }
            hVar = b5.h.R(hVar, null, 1, null).l(jVar).b();
        }
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return hVar;
    }
}
