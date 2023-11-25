package t;

import a1.e1;
import a1.e4;
import a1.o1;
import a1.q1;
import a1.q4;
import a1.t3;
import a1.z3;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class f extends p1.l {
    private t.d C;
    private float D;
    private e1 E;
    private q4 F;
    private final x0.c G;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z3.a f23156f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1 f23157m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z3.a aVar, e1 e1Var) {
            super(1);
            this.f23156f = aVar;
            this.f23157m = e1Var;
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
            c1.e.k(cVar, this.f23156f.a(), this.f23157m, 0.0f, null, null, 0, 60, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ z0.h f23158f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ qc.f0<t3> f23159m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f23160p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ q1 f23161q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(z0.h hVar, qc.f0<t3> f0Var, long j10, q1 q1Var) {
            super(1);
            this.f23158f = hVar;
            this.f23159m = f0Var;
            this.f23160p = j10;
            this.f23161q = q1Var;
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
            float i10 = this.f23158f.i();
            float l10 = this.f23158f.l();
            qc.f0<t3> f0Var = this.f23159m;
            long j10 = this.f23160p;
            q1 q1Var = this.f23161q;
            cVar.y0().a().b(i10, l10);
            c1.e.g(cVar, f0Var.f21676f, 0L, j10, 0L, 0L, 0.0f, null, q1Var, 0, 0, 890, null);
            cVar.y0().a().b(-i10, -l10);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f23162f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1 f23163m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f23164p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ float f23165q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ float f23166r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ long f23167s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ long f23168t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ c1.l f23169u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, e1 e1Var, long j10, float f10, float f11, long j11, long j12, c1.l lVar) {
            super(1);
            this.f23162f = z10;
            this.f23163m = e1Var;
            this.f23164p = j10;
            this.f23165q = f10;
            this.f23166r = f11;
            this.f23167s = j11;
            this.f23168t = j12;
            this.f23169u = lVar;
        }

        public final void a(c1.c cVar) {
            long l10;
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
            if (this.f23162f) {
                c1.e.n(cVar, this.f23163m, 0L, 0L, this.f23164p, 0.0f, null, null, 0, 246, null);
                return;
            }
            float d10 = z0.a.d(this.f23164p);
            float f10 = this.f23165q;
            if (d10 < f10) {
                float f11 = this.f23166r;
                float i10 = z0.l.i(cVar.b()) - this.f23166r;
                float g10 = z0.l.g(cVar.b()) - this.f23166r;
                int a10 = o1.f133a.a();
                e1 e1Var = this.f23163m;
                long j10 = this.f23164p;
                c1.d y02 = cVar.y0();
                long b10 = y02.b();
                y02.d().k();
                y02.a().a(f11, f11, i10, g10, a10);
                c1.e.n(cVar, e1Var, 0L, 0L, j10, 0.0f, null, null, 0, 246, null);
                y02.d().p();
                y02.c(b10);
                return;
            }
            e1 e1Var2 = this.f23163m;
            long j11 = this.f23167s;
            long j12 = this.f23168t;
            l10 = t.e.l(this.f23164p, f10);
            c1.e.n(cVar, e1Var2, j11, j12, l10, 0.0f, this.f23169u, null, 0, 208, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e4 f23170f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e1 f23171m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(e4 e4Var, e1 e1Var) {
            super(1);
            this.f23170f = e4Var;
            this.f23171m = e1Var;
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
            c1.e.k(cVar, this.f23170f, this.f23171m, 0.0f, null, null, 0, 60, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.l<x0.d, x0.i> {
        e() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final x0.i invoke(x0.d dVar) {
            boolean z10;
            float ceil;
            boolean z11;
            x0.i k10;
            x0.i j10;
            qc.q.i(dVar, "$this$CacheDrawModifierNode");
            if (dVar.v0(f.this.T1()) >= 0.0f && z0.l.h(dVar.b()) > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                j10 = t.e.j(dVar);
                return j10;
            }
            if (j2.h.l(f.this.T1(), j2.h.f18979m.a())) {
                ceil = 1.0f;
            } else {
                ceil = (float) Math.ceil(dVar.v0(f.this.T1()));
            }
            float f10 = 2;
            float min = Math.min(ceil, (float) Math.ceil(z0.l.h(dVar.b()) / f10));
            float f11 = min / f10;
            long a10 = z0.g.a(f11, f11);
            long a11 = z0.m.a(z0.l.i(dVar.b()) - min, z0.l.g(dVar.b()) - min);
            if (f10 * min > z0.l.h(dVar.b())) {
                z11 = true;
            } else {
                z11 = false;
            }
            z3 a12 = f.this.S1().a(dVar.b(), dVar.getLayoutDirection(), dVar);
            if (a12 instanceof z3.a) {
                f fVar = f.this;
                return fVar.P1(dVar, fVar.R1(), (z3.a) a12, z11, min);
            } else if (a12 instanceof z3.c) {
                f fVar2 = f.this;
                return fVar2.Q1(dVar, fVar2.R1(), (z3.c) a12, a10, a11, z11, min);
            } else if (a12 instanceof z3.b) {
                k10 = t.e.k(dVar, f.this.R1(), a10, a11, z11, min);
                return k10;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public /* synthetic */ f(float f10, e1 e1Var, q4 q4Var, qc.h hVar) {
        this(f10, e1Var, q4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d8, code lost:
    
        if (a1.u3.h(r14, r4) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [a1.t3, T] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x0.i P1(x0.d r46, a1.e1 r47, a1.z3.a r48, boolean r49, float r50) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.f.P1(x0.d, a1.e1, a1.z3$a, boolean, float):x0.i");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0.i Q1(x0.d dVar, e1 e1Var, z3.c cVar, long j10, long j11, boolean z10, float f10) {
        e4 i10;
        if (z0.k.d(cVar.a())) {
            return dVar.f(new c(z10, e1Var, cVar.a().h(), f10 / 2, f10, j10, j11, new c1.l(f10, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.C == null) {
            this.C = new t.d(null, null, null, null, 15, null);
        }
        t.d dVar2 = this.C;
        qc.q.f(dVar2);
        i10 = t.e.i(dVar2.g(), cVar.a(), f10, z10);
        return dVar.f(new d(i10, e1Var));
    }

    public final e1 R1() {
        return this.E;
    }

    public final q4 S1() {
        return this.F;
    }

    public final float T1() {
        return this.D;
    }

    public final void U1(e1 e1Var) {
        qc.q.i(e1Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!qc.q.d(this.E, e1Var)) {
            this.E = e1Var;
            this.G.I();
        }
    }

    public final void V1(float f10) {
        if (!j2.h.l(this.D, f10)) {
            this.D = f10;
            this.G.I();
        }
    }

    public final void z0(q4 q4Var) {
        qc.q.i(q4Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!qc.q.d(this.F, q4Var)) {
            this.F = q4Var;
            this.G.I();
        }
    }

    private f(float f10, e1 e1Var, q4 q4Var) {
        qc.q.i(e1Var, "brushParameter");
        qc.q.i(q4Var, "shapeParameter");
        this.D = f10;
        this.E = e1Var;
        this.F = q4Var;
        this.G = (x0.c) I1(androidx.compose.ui.draw.b.a(new e()));
    }
}
