package x0;

import a1.k4;
import a1.p1;
import a1.q4;
import a1.s3;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: Shadow.kt */
/* loaded from: classes.dex */
public final class m {

    /* compiled from: Shadow.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<androidx.compose.ui.graphics.d, w> {

        /* renamed from: f */
        final /* synthetic */ float f25689f;

        /* renamed from: m */
        final /* synthetic */ q4 f25690m;

        /* renamed from: p */
        final /* synthetic */ boolean f25691p;

        /* renamed from: q */
        final /* synthetic */ long f25692q;

        /* renamed from: r */
        final /* synthetic */ long f25693r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, q4 q4Var, boolean z10, long j10, long j11) {
            super(1);
            this.f25689f = f10;
            this.f25690m = q4Var;
            this.f25691p = z10;
            this.f25692q = j10;
            this.f25693r = j11;
        }

        public final void a(androidx.compose.ui.graphics.d dVar) {
            q.i(dVar, "$this$graphicsLayer");
            dVar.C(dVar.v0(this.f25689f));
            dVar.z0(this.f25690m);
            dVar.G0(this.f25691p);
            dVar.x0(this.f25692q);
            dVar.N0(this.f25693r);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(androidx.compose.ui.graphics.d dVar) {
            a(dVar);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f25694f;

        /* renamed from: m */
        final /* synthetic */ q4 f25695m;

        /* renamed from: p */
        final /* synthetic */ boolean f25696p;

        /* renamed from: q */
        final /* synthetic */ long f25697q;

        /* renamed from: r */
        final /* synthetic */ long f25698r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, q4 q4Var, boolean z10, long j10, long j11) {
            super(1);
            this.f25694f = f10;
            this.f25695m = q4Var;
            this.f25696p = z10;
            this.f25697q = j10;
            this.f25698r = j11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$null");
            m1Var.b("shadow");
            m1Var.a().c("elevation", j2.h.f(this.f25694f));
            m1Var.a().c("shape", this.f25695m);
            m1Var.a().c("clip", Boolean.valueOf(this.f25696p));
            m1Var.a().c("ambientColor", p1.g(this.f25697q));
            m1Var.a().c("spotColor", p1.g(this.f25698r));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f10, q4 q4Var, boolean z10, long j10, long j11) {
        pc.l a10;
        q.i(eVar, "$this$shadow");
        q.i(q4Var, "shape");
        if (j2.h.i(f10, j2.h.j(0)) <= 0 && !z10) {
            return eVar;
        }
        if (k1.c()) {
            a10 = new b(f10, q4Var, z10, j10, j11);
        } else {
            a10 = k1.a();
        }
        return k1.b(eVar, a10, androidx.compose.ui.graphics.c.a(androidx.compose.ui.e.f2335a, new a(f10, q4Var, z10, j10, j11)));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, q4 q4Var, boolean z10, long j10, long j11, int i10, Object obj) {
        q4 q4Var2;
        boolean z11;
        long j12;
        long j13;
        if ((i10 & 2) != 0) {
            q4Var2 = k4.a();
        } else {
            q4Var2 = q4Var;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
            if (j2.h.i(f10, j2.h.j(0)) > 0) {
                z11 = true;
            }
        } else {
            z11 = z10;
        }
        if ((i10 & 8) != 0) {
            j12 = s3.a();
        } else {
            j12 = j10;
        }
        if ((i10 & 16) != 0) {
            j13 = s3.a();
        } else {
            j13 = j11;
        }
        return a(eVar, f10, q4Var2, z11, j12, j13);
    }
}
