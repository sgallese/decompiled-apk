package com.habitrpg.android.habitica.ui.views.stable;

import androidx.compose.foundation.c;
import androidx.compose.ui.e;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.f2;
import j0.j1;
import j0.l;
import j0.n;
import j2.h;
import j2.t;
import pc.q;
import qc.r;
import r.j;
import x0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PetBottomSheetKt$PetBottomSheet$2$1$1 extends r implements q<j, l, Integer, w> {
    final /* synthetic */ j1<String> $feedMessage$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetBottomSheetKt$PetBottomSheet$2$1$1(j1<String> j1Var) {
        super(3);
        this.$feedMessage$delegate = j1Var;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(j jVar, l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j jVar, l lVar, int i10) {
        String PetBottomSheet$lambda$7;
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(1764751669, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.PetBottomSheet.<anonymous>.<anonymous>.<anonymous> (PetBottomSheet.kt:151)");
        }
        PetBottomSheet$lambda$7 = PetBottomSheetKt.PetBottomSheet$lambda$7(this.$feedMessage$delegate);
        HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
        int i11 = HabiticaTheme.$stable;
        float f10 = 8;
        f2.b(PetBottomSheet$lambda$7, a.a(androidx.compose.foundation.layout.j.j(c.c(androidx.compose.foundation.layout.j.k(e.f2335a, h.j(f10), 0.0f, 2, null), habiticaTheme.getColors(lVar, i11).m141getWindowBackground0d7_KjU(), habiticaTheme.getShapes(lVar, i11).b()), h.j(f10), h.j(3)), 0.65f), habiticaTheme.getColors(lVar, i11).m134getTextPrimary0d7_KjU(), t.g(12), null, null, null, 0L, null, g2.j.g(g2.j.f16057b.a()), 0L, 0, false, 0, 0, null, null, lVar, 3072, 0, 130544);
        if (n.K()) {
            n.U();
        }
    }
}
