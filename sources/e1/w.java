package e1;

import a1.a1;
import a1.e1;
import a1.p1;
import a1.q1;
import androidx.compose.ui.platform.z0;
import e1.y;
import ec.n0;
import j0.g2;
import j0.z1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: VectorPainter.kt */
/* loaded from: classes.dex */
public final class w {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ u f13973f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Map<String, r> f13974m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u uVar, Map<String, ? extends r> map) {
            super(2);
            this.f13973f = uVar;
            this.f13974m = map;
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
                j0.n.V(1450046638, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup.<anonymous> (VectorPainter.kt:413)");
            }
            w.a((s) this.f13973f, this.f13974m, lVar, 64, 0);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ s f13975f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Map<String, r> f13976m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f13977p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ int f13978q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(s sVar, Map<String, ? extends r> map, int i10, int i11) {
            super(2);
            this.f13975f = sVar;
            this.f13976m = map;
            this.f13977p = i10;
            this.f13978q = i11;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            w.a(this.f13975f, this.f13976m, lVar, z1.a(this.f13977p | 1), this.f13978q);
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class c implements r {
        c() {
        }

        @Override // e1.r
        public /* synthetic */ Object a(y yVar, Object obj) {
            return q.a(this, yVar, obj);
        }
    }

    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class d implements r {
        d() {
        }

        @Override // e1.r
        public /* synthetic */ Object a(y yVar, Object obj) {
            return q.a(this, yVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.r<Float, Float, j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f13979f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(4);
            this.f13979f = fVar;
        }

        public final void a(float f10, float f11, j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(1873274766, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous> (VectorPainter.kt:167)");
            }
            w.a(this.f13979f.e(), null, lVar, 0, 2);
            if (j0.n.K()) {
                j0.n.U();
            }
        }

        @Override // pc.r
        public /* bridge */ /* synthetic */ dc.w invoke(Float f10, Float f11, j0.l lVar, Integer num) {
            a(f10.floatValue(), f11.floatValue(), lVar, num.intValue());
            return dc.w.f13270a;
        }
    }

    public static final void a(s sVar, Map<String, ? extends r> map, j0.l lVar, int i10, int i11) {
        int i12;
        int i13;
        Map<String, ? extends r> map2;
        Map<String, ? extends r> map3;
        j0.l lVar2;
        Map<String, ? extends r> map4;
        Map<String, ? extends r> h10;
        qc.q.i(sVar, "group");
        j0.l q10 = lVar.q(-446179233);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (q10.Q(sVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 16;
        }
        if (i14 == 2 && (i12 & 91) == 18 && q10.t()) {
            q10.z();
            map3 = map;
            lVar2 = q10;
        } else {
            if (i14 != 0) {
                h10 = n0.h();
                map2 = h10;
            } else {
                map2 = map;
            }
            if (j0.n.K()) {
                j0.n.V(-446179233, i10, -1, "androidx.compose.ui.graphics.vector.RenderVectorGroup (VectorPainter.kt:327)");
            }
            Iterator<u> it = sVar.iterator();
            while (it.hasNext()) {
                u next = it.next();
                if (next instanceof x) {
                    q10.e(-326285735);
                    x xVar = (x) next;
                    r rVar = map2.get(xVar.f());
                    if (rVar == null) {
                        rVar = new c();
                    }
                    r rVar2 = rVar;
                    j0.l lVar3 = q10;
                    p.b((List) rVar2.a(y.c.f13995a, xVar.h()), xVar.i(), xVar.f(), (e1) rVar2.a(y.a.f13993a, xVar.a()), ((Number) rVar2.a(y.b.f13994a, Float.valueOf(xVar.e()))).floatValue(), (e1) rVar2.a(y.i.f14001a, xVar.j()), ((Number) rVar2.a(y.j.f14002a, Float.valueOf(xVar.k()))).floatValue(), ((Number) rVar2.a(y.k.f14003a, Float.valueOf(xVar.o()))).floatValue(), xVar.l(), xVar.m(), xVar.n(), ((Number) rVar2.a(y.p.f14008a, Float.valueOf(xVar.s()))).floatValue(), ((Number) rVar2.a(y.n.f14006a, Float.valueOf(xVar.p()))).floatValue(), ((Number) rVar2.a(y.o.f14007a, Float.valueOf(xVar.r()))).floatValue(), lVar3, 8, 0, 0);
                    lVar3.N();
                    it = it;
                    map2 = map2;
                    q10 = lVar3;
                } else {
                    Iterator<u> it2 = it;
                    Map<String, ? extends r> map5 = map2;
                    j0.l lVar4 = q10;
                    if (next instanceof s) {
                        lVar4.e(-326283877);
                        s sVar2 = (s) next;
                        map4 = map5;
                        r rVar3 = map4.get(sVar2.f());
                        if (rVar3 == null) {
                            rVar3 = new d();
                        }
                        p.a(sVar2.f(), ((Number) rVar3.a(y.f.f13998a, Float.valueOf(sVar2.j()))).floatValue(), ((Number) rVar3.a(y.d.f13996a, Float.valueOf(sVar2.h()))).floatValue(), ((Number) rVar3.a(y.e.f13997a, Float.valueOf(sVar2.i()))).floatValue(), ((Number) rVar3.a(y.g.f13999a, Float.valueOf(sVar2.k()))).floatValue(), ((Number) rVar3.a(y.h.f14000a, Float.valueOf(sVar2.l()))).floatValue(), ((Number) rVar3.a(y.l.f14004a, Float.valueOf(sVar2.m()))).floatValue(), ((Number) rVar3.a(y.m.f14005a, Float.valueOf(sVar2.n()))).floatValue(), (List) rVar3.a(y.c.f13995a, sVar2.e()), q0.c.b(lVar4, 1450046638, true, new a(next, map4)), lVar4, 939524096, 0);
                        lVar4.N();
                    } else {
                        map4 = map5;
                        lVar4.e(-326282407);
                        lVar4.N();
                    }
                    q10 = lVar4;
                    map2 = map4;
                    it = it2;
                }
            }
            map3 = map2;
            lVar2 = q10;
            if (j0.n.K()) {
                j0.n.U();
            }
        }
        g2 w10 = lVar2.w();
        if (w10 != null) {
            w10.a(new b(sVar, map3, i10, i11));
        }
    }

    public static final v b(f fVar, j0.l lVar, int i10) {
        qc.q.i(fVar, "image");
        lVar.e(1413834416);
        if (j0.n.K()) {
            j0.n.V(1413834416, i10, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:157)");
        }
        v c10 = c(fVar.c(), fVar.b(), fVar.i(), fVar.h(), fVar.d(), fVar.g(), fVar.f(), fVar.a(), q0.c.b(lVar, 1873274766, true, new e(fVar)), lVar, 100663296, 0);
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return c10;
    }

    public static final v c(float f10, float f11, float f12, float f13, String str, long j10, int i10, boolean z10, pc.r<? super Float, ? super Float, ? super j0.l, ? super Integer, dc.w> rVar, j0.l lVar, int i11, int i12) {
        float f14;
        String str2;
        long j11;
        int i13;
        boolean z11;
        q1 q1Var;
        qc.q.i(rVar, "content");
        lVar.e(1068590786);
        float f15 = Float.NaN;
        if ((i12 & 4) != 0) {
            f14 = Float.NaN;
        } else {
            f14 = f12;
        }
        if ((i12 & 8) == 0) {
            f15 = f13;
        }
        if ((i12 & 16) != 0) {
            str2 = "VectorRootGroup";
        } else {
            str2 = str;
        }
        if ((i12 & 32) != 0) {
            j11 = p1.f146b.e();
        } else {
            j11 = j10;
        }
        if ((i12 & 64) != 0) {
            i13 = a1.f62b.z();
        } else {
            i13 = i10;
        }
        if ((i12 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (j0.n.K()) {
            j0.n.V(1068590786, i11, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter (VectorPainter.kt:115)");
        }
        j2.e eVar = (j2.e) lVar.C(z0.e());
        float v02 = eVar.v0(f10);
        float v03 = eVar.v0(f11);
        if (Float.isNaN(f14)) {
            f14 = v02;
        }
        if (Float.isNaN(f15)) {
            f15 = v03;
        }
        p1 g10 = p1.g(j11);
        a1 D = a1.D(i13);
        int i14 = i11 >> 15;
        lVar.e(511388516);
        boolean Q = lVar.Q(g10) | lVar.Q(D);
        Object f16 = lVar.f();
        if (Q || f16 == j0.l.f18688a.a()) {
            if (!p1.q(j11, p1.f146b.e())) {
                q1Var = q1.f163b.a(j11, i13);
            } else {
                q1Var = null;
            }
            f16 = q1Var;
            lVar.J(f16);
        }
        lVar.N();
        q1 q1Var2 = (q1) f16;
        lVar.e(-492369756);
        Object f17 = lVar.f();
        if (f17 == j0.l.f18688a.a()) {
            f17 = new v();
            lVar.J(f17);
        }
        lVar.N();
        v vVar = (v) f17;
        vVar.x(z0.m.a(v02, v03));
        vVar.u(z11);
        vVar.w(q1Var2);
        vVar.n(str2, f14, f15, rVar, lVar, ((i11 >> 12) & 14) | 32768 | (i14 & 7168));
        if (j0.n.K()) {
            j0.n.U();
        }
        lVar.N();
        return vVar;
    }
}
