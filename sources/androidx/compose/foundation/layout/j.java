package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import qc.q;
import qc.r;
import w.s;
import w.t;

/* compiled from: Padding.kt */
/* loaded from: classes.dex */
public final class j {

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2095f;

        /* renamed from: m */
        final /* synthetic */ float f2096m;

        /* renamed from: p */
        final /* synthetic */ float f2097p;

        /* renamed from: q */
        final /* synthetic */ float f2098q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f2095f = f10;
            this.f2096m = f11;
            this.f2097p = f12;
            this.f2098q = f13;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("padding");
            m1Var.a().c("start", j2.h.f(this.f2095f));
            m1Var.a().c("top", j2.h.f(this.f2096m));
            m1Var.a().c("end", j2.h.f(this.f2097p));
            m1Var.a().c("bottom", j2.h.f(this.f2098q));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2099f;

        /* renamed from: m */
        final /* synthetic */ float f2100m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f2099f = f10;
            this.f2100m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("padding");
            m1Var.a().c("horizontal", j2.h.f(this.f2099f));
            m1Var.a().c("vertical", j2.h.f(this.f2100m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class c extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ float f2101f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f2101f = f10;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("padding");
            m1Var.c(j2.h.f(this.f2101f));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Padding.kt */
    /* loaded from: classes.dex */
    public static final class d extends r implements pc.l<m1, w> {

        /* renamed from: f */
        final /* synthetic */ s f2102f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s sVar) {
            super(1);
            this.f2102f = sVar;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("padding");
            m1Var.a().c("paddingValues", this.f2102f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    public static final s a(float f10) {
        return new t(f10, f10, f10, f10, null);
    }

    public static final s b(float f10, float f11) {
        return new t(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ s c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.j(0);
        }
        return b(f10, f11);
    }

    public static final s d(float f10, float f11, float f12, float f13) {
        return new t(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ s e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = j2.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = j2.h.j(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(s sVar, j2.r rVar) {
        q.i(sVar, "<this>");
        q.i(rVar, "layoutDirection");
        if (rVar == j2.r.Ltr) {
            return sVar.b(rVar);
        }
        return sVar.c(rVar);
    }

    public static final float g(s sVar, j2.r rVar) {
        q.i(sVar, "<this>");
        q.i(rVar, "layoutDirection");
        if (rVar == j2.r.Ltr) {
            return sVar.c(rVar);
        }
        return sVar.b(rVar);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, s sVar) {
        q.i(eVar, "<this>");
        q.i(sVar, "paddingValues");
        return eVar.a(new PaddingValuesElement(sVar, new d(sVar)));
    }

    public static final androidx.compose.ui.e i(androidx.compose.ui.e eVar, float f10) {
        q.i(eVar, "$this$padding");
        return eVar.a(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final androidx.compose.ui.e j(androidx.compose.ui.e eVar, float f10, float f11) {
        q.i(eVar, "$this$padding");
        return eVar.a(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e k(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.j(0);
        }
        return j(eVar, f10, f11);
    }

    public static final androidx.compose.ui.e l(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13) {
        q.i(eVar, "$this$padding");
        return eVar.a(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ androidx.compose.ui.e m(androidx.compose.ui.e eVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.j(0);
        }
        if ((i10 & 4) != 0) {
            f12 = j2.h.j(0);
        }
        if ((i10 & 8) != 0) {
            f13 = j2.h.j(0);
        }
        return l(eVar, f10, f11, f12, f13);
    }
}
