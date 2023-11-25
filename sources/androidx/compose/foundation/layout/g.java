package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.m1;
import dc.w;
import qc.q;
import qc.r;

/* compiled from: Offset.kt */
/* loaded from: classes.dex */
public final class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f2086f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f2087m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11) {
            super(1);
            this.f2086f = f10;
            this.f2087m = f11;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("offset");
            m1Var.a().c("x", j2.h.f(this.f2086f));
            m1Var.a().c("y", j2.h.f(this.f2087m));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Offset.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.l<m1, w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<j2.e, j2.l> f2088f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pc.l<? super j2.e, j2.l> lVar) {
            super(1);
            this.f2088f = lVar;
        }

        public final void a(m1 m1Var) {
            q.i(m1Var, "$this$$receiver");
            m1Var.b("offset");
            m1Var.a().c("offset", this.f2088f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ w invoke(m1 m1Var) {
            a(m1Var);
            return w.f13270a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, pc.l<? super j2.e, j2.l> lVar) {
        q.i(eVar, "<this>");
        q.i(lVar, "offset");
        return eVar.a(new OffsetPxElement(lVar, true, new b(lVar)));
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, float f11) {
        q.i(eVar, "$this$offset");
        return eVar.a(new OffsetElement(f10, f11, true, new a(f10, f11), null));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = j2.h.j(0);
        }
        if ((i10 & 2) != 0) {
            f11 = j2.h.j(0);
        }
        return b(eVar, f10, f11);
    }
}
