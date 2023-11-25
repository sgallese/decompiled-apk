package androidx.compose.foundation;

import a1.e1;
import a1.k4;
import a1.p1;
import a1.q4;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.platform.m1;
import dc.w;

/* compiled from: Background.kt */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f1859f;

        /* renamed from: m */
        final /* synthetic */ e1 f1860m;

        /* renamed from: p */
        final /* synthetic */ q4 f1861p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, e1 e1Var, q4 q4Var) {
            super(1);
            this.f1859f = f10;
            this.f1860m = e1Var;
            this.f1861p = q4Var;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("background");
            m1Var.a().c("alpha", Float.valueOf(this.f1859f));
            m1Var.a().c("brush", this.f1860m);
            m1Var.a().c("shape", this.f1861p);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ long f1862f;

        /* renamed from: m */
        final /* synthetic */ q4 f1863m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, q4 q4Var) {
            super(1);
            this.f1862f = j10;
            this.f1863m = q4Var;
        }

        public final void a(m1 m1Var) {
            qc.q.i(m1Var, "$this$null");
            m1Var.b("background");
            m1Var.c(p1.g(this.f1862f));
            m1Var.a().c("color", p1.g(this.f1862f));
            m1Var.a().c("shape", this.f1863m);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, e1 e1Var, q4 q4Var, float f10) {
        pc.l a10;
        qc.q.i(eVar, "<this>");
        qc.q.i(e1Var, "brush");
        qc.q.i(q4Var, "shape");
        long j10 = 0;
        if (k1.c()) {
            a10 = new a(f10, e1Var, q4Var);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new BackgroundElement(j10, e1Var, f10, q4Var, a10, 1, null));
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, e1 e1Var, q4 q4Var, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q4Var = k4.a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return a(eVar, e1Var, q4Var, f10);
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, long j10, q4 q4Var) {
        pc.l a10;
        qc.q.i(eVar, "$this$background");
        qc.q.i(q4Var, "shape");
        float f10 = 1.0f;
        if (k1.c()) {
            a10 = new b(j10, q4Var);
        } else {
            a10 = k1.a();
        }
        return eVar.a(new BackgroundElement(j10, null, f10, q4Var, a10, 2, null));
    }

    public static /* synthetic */ androidx.compose.ui.e d(androidx.compose.ui.e eVar, long j10, q4 q4Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            q4Var = k4.a();
        }
        return c(eVar, j10, q4Var);
    }
}
