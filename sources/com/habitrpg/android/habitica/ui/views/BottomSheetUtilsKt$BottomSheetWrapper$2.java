package com.habitrpg.android.habitica.ui.views;

import ad.k0;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.y0;
import j0.i2;
import j0.l3;
import j0.n;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import v0.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BottomSheetUtils.kt */
/* loaded from: classes4.dex */
public final class BottomSheetUtilsKt$BottomSheetWrapper$2 extends r implements q<w.j, j0.l, Integer, w> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ q<pc.a<w>, j0.l, Integer, w> $content;
    final /* synthetic */ k0 $coroutineScope;
    final /* synthetic */ y0 $modalBottomSheetState;
    final /* synthetic */ float $radius;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetUtilsKt$BottomSheetWrapper$2(float f10, q<? super pc.a<w>, ? super j0.l, ? super Integer, w> qVar, int i10, k0 k0Var, y0 y0Var) {
        super(3);
        this.$radius = f10;
        this.$content = qVar;
        this.$$dirty = i10;
        this.$coroutineScope = k0Var;
        this.$modalBottomSheetState = y0Var;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(w.j jVar, j0.l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(w.j jVar, j0.l lVar, int i10) {
        qc.q.i(jVar, "$this$ModalBottomSheetLayout");
        if ((i10 & 81) == 16 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-803540824, i10, -1, "com.habitrpg.android.habitica.ui.views.BottomSheetWrapper.<anonymous> (BottomSheetUtils.kt:91)");
        }
        b.InterfaceC0571b f10 = v0.b.f24258a.f();
        e.a aVar = androidx.compose.ui.e.f2335a;
        androidx.compose.ui.e k10 = androidx.compose.foundation.layout.j.k(aVar, j2.h.j(4), 0.0f, 2, null);
        long m141getWindowBackground0d7_KjU = HabiticaTheme.INSTANCE.getColors(lVar, 6).m141getWindowBackground0d7_KjU();
        float f11 = this.$radius;
        androidx.compose.ui.e k11 = androidx.compose.foundation.layout.j.k(androidx.compose.foundation.c.c(k10, m141getWindowBackground0d7_KjU, b0.i.f(f11, f11, 0.0f, 0.0f, 12, null)), 0.0f, j2.h.j(8), 1, null);
        q<pc.a<w>, j0.l, Integer, w> qVar = this.$content;
        int i11 = this.$$dirty;
        k0 k0Var = this.$coroutineScope;
        y0 y0Var = this.$modalBottomSheetState;
        lVar.e(-483455358);
        i0 a10 = w.h.a(w.a.f25135a.f(), f10, lVar, 48);
        lVar.e(-1323940314);
        int a11 = j0.j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = p1.g.f20790l;
        pc.a<p1.g> a12 = aVar2.a();
        q<i2<p1.g>, j0.l, Integer, w> a13 = x.a(k11);
        if (!(lVar.u() instanceof j0.f)) {
            j0.j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        j0.l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        p<p1.g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        w.k kVar = w.k.f25176a;
        androidx.compose.foundation.layout.d.a(androidx.compose.foundation.layout.m.p(androidx.compose.foundation.c.d(androidx.compose.foundation.layout.j.m(aVar, 0.0f, 0.0f, 0.0f, j2.h.j(16), 7, null), s1.c.a(R.color.content_background_offset, lVar, 6), null, 2, null), j2.h.j(24), j2.h.j(3)), lVar, 0);
        qVar.invoke(new BottomSheetUtilsKt$BottomSheetWrapper$2$1$1(k0Var, y0Var), lVar, Integer.valueOf((i11 >> 3) & 112));
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
