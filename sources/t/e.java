package t;

import a1.e1;
import a1.e4;
import a1.i4;
import a1.q4;
import a1.r4;
import a1.u0;
import androidx.compose.foundation.BorderModifierNodeElement;

/* compiled from: Border.kt */
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Border.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<c1.c, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23149f = new a();

        a() {
            super(1);
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
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
        final /* synthetic */ e1 f23150f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ long f23151m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ long f23152p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c1.g f23153q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(e1 e1Var, long j10, long j11, c1.g gVar) {
            super(1);
            this.f23150f = e1Var;
            this.f23151m = j10;
            this.f23152p = j11;
            this.f23153q = gVar;
        }

        public final void a(c1.c cVar) {
            qc.q.i(cVar, "$this$onDrawWithContent");
            cVar.d1();
            c1.e.l(cVar, this.f23150f, this.f23151m, this.f23152p, 0.0f, this.f23153q, null, 0, 104, null);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(c1.c cVar) {
            a(cVar);
            return dc.w.f13270a;
        }
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, g gVar, q4 q4Var) {
        qc.q.i(eVar, "<this>");
        qc.q.i(gVar, "border");
        qc.q.i(q4Var, "shape");
        return g(eVar, gVar.b(), gVar.a(), q4Var);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f10, long j10, q4 q4Var) {
        qc.q.i(eVar, "$this$border");
        qc.q.i(q4Var, "shape");
        return g(eVar, f10, new r4(j10, null), q4Var);
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f10, e1 e1Var, q4 q4Var) {
        qc.q.i(eVar, "$this$border");
        qc.q.i(e1Var, "brush");
        qc.q.i(q4Var, "shape");
        return eVar.a(new BorderModifierNodeElement(f10, e1Var, q4Var, null));
    }

    private static final z0.j h(float f10, z0.j jVar) {
        return new z0.j(f10, f10, jVar.j() - f10, jVar.d() - f10, l(jVar.h(), f10), l(jVar.i(), f10), l(jVar.c(), f10), l(jVar.b(), f10), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e4 i(e4 e4Var, z0.j jVar, float f10, boolean z10) {
        e4Var.s();
        e4Var.i(jVar);
        if (!z10) {
            e4 a10 = u0.a();
            a10.i(h(f10, jVar));
            e4Var.k(e4Var, a10, i4.f108a.a());
        }
        return e4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0.i j(x0.d dVar) {
        return dVar.f(a.f23149f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0.i k(x0.d dVar, e1 e1Var, long j10, long j11, boolean z10, float f10) {
        long j12;
        long j13;
        c1.g lVar;
        if (z10) {
            j12 = z0.f.f26354b.c();
        } else {
            j12 = j10;
        }
        if (z10) {
            j13 = dVar.b();
        } else {
            j13 = j11;
        }
        if (z10) {
            lVar = c1.k.f8683a;
        } else {
            lVar = new c1.l(f10, 0.0f, 0, 0, null, 30, null);
        }
        return dVar.f(new b(e1Var, j12, j13, lVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j10, float f10) {
        return z0.b.a(Math.max(0.0f, z0.a.d(j10) - f10), Math.max(0.0f, z0.a.e(j10) - f10));
    }
}
