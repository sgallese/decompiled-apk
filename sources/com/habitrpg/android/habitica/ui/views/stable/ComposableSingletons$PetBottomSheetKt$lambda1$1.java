package com.habitrpg.android.habitica.ui.views.stable;

import a1.t3;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.views.PixelArtViewKt;
import dc.w;
import f0.f2;
import j0.f;
import j0.i2;
import j0.j;
import j0.l;
import j0.l3;
import j0.n;
import j0.v;
import n1.i0;
import n1.x;
import p1.g;
import pc.p;
import pc.q;
import qc.r;
import s1.d;
import v0.b;
import w.a;
import w.h;
import w.k;

/* compiled from: PetBottomSheet.kt */
/* renamed from: com.habitrpg.android.habitica.ui.views.stable.ComposableSingletons$PetBottomSheetKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PetBottomSheetKt$lambda1$1 extends r implements p<l, Integer, w> {
    public static final ComposableSingletons$PetBottomSheetKt$lambda1$1 INSTANCE = new ComposableSingletons$PetBottomSheetKt$lambda1$1();

    ComposableSingletons$PetBottomSheetKt$lambda1$1() {
        super(2);
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1923481668, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.ComposableSingletons$PetBottomSheetKt.lambda-1.<anonymous> (PetBottomSheet.kt:275)");
        }
        b.InterfaceC0571b f10 = b.f24258a.f();
        lVar.e(-483455358);
        e.a aVar = e.f2335a;
        i0 a10 = h.a(a.f25135a.f(), f10, lVar, 48);
        lVar.e(-1323940314);
        int a11 = j.a(lVar, 0);
        v F = lVar.F();
        g.a aVar2 = g.f20790l;
        pc.a<g> a12 = aVar2.a();
        q<i2<g>, l, Integer, w> a13 = x.a(aVar);
        if (!(lVar.u() instanceof f)) {
            j.c();
        }
        lVar.s();
        if (lVar.n()) {
            lVar.B(a12);
        } else {
            lVar.H();
        }
        l a14 = l3.a(lVar);
        l3.b(a14, a10, aVar2.e());
        l3.b(a14, F, aVar2.g());
        p<g, Integer, w> b10 = aVar2.b();
        if (a14.n() || !qc.q.d(a14.f(), Integer.valueOf(a11))) {
            a14.J(Integer.valueOf(a11));
            a14.I(Integer.valueOf(a11), b10);
        }
        a13.invoke(i2.a(i2.b(lVar)), lVar, 0);
        lVar.e(2058660585);
        k kVar = k.f25176a;
        PixelArtViewKt.PixelArtView(d.a(t3.f191a, R.drawable.feed_saddle, lVar, 56), m.p(aVar, j2.h.j(64), j2.h.j(50)), lVar, 56, 0);
        f2.b(s1.h.a(R.string.use_saddle, lVar, 6), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131070);
        lVar.N();
        lVar.O();
        lVar.N();
        lVar.N();
        if (n.K()) {
            n.U();
        }
    }
}
