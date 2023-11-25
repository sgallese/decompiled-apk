package com.habitrpg.android.habitica.ui.views.stable;

import a1.s4;
import androidx.compose.foundation.layout.m;
import androidx.compose.ui.e;
import androidx.recyclerview.widget.m;
import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import dc.w;
import f0.d1;
import j0.g1;
import j0.g3;
import j0.l;
import j0.n;
import j2.h;
import pc.q;
import qc.r;
import r.j;
import s.c;
import s.d0;
import s.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PetBottomSheet.kt */
/* loaded from: classes4.dex */
public final class PetBottomSheetKt$PetBottomSheet$2$1$2 extends r implements q<j, l, Integer, w> {
    final /* synthetic */ g1 $feedValue$delegate;
    final /* synthetic */ g1 $oldFeedValue$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PetBottomSheetKt$PetBottomSheet$2$1$2(g1 g1Var, g1 g1Var2) {
        super(3);
        this.$feedValue$delegate = g1Var;
        this.$oldFeedValue$delegate = g1Var2;
    }

    @Override // pc.q
    public /* bridge */ /* synthetic */ w invoke(j jVar, l lVar, Integer num) {
        invoke(jVar, lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j jVar, l lVar, int i10) {
        int d10;
        int d11;
        qc.q.i(jVar, "$this$AnimatedVisibility");
        if (n.K()) {
            n.V(85699742, i10, -1, "com.habitrpg.android.habitica.ui.views.stable.PetBottomSheet.<anonymous>.<anonymous>.<anonymous> (PetBottomSheet.kt:174)");
        }
        d10 = this.$feedValue$delegate.d();
        g3<Float> d12 = c.d(d10 / 50.0f, k.i(400, 0, d0.b(), 2, null), 0.0f, null, null, lVar, 0, 28);
        float floatValue = d12.getValue().floatValue();
        d11 = this.$oldFeedValue$delegate.d();
        float sin = ((float) Math.sin((floatValue - d11) * 120)) * 0.02f;
        float floatValue2 = d12.getValue().floatValue();
        HabiticaTheme habiticaTheme = HabiticaTheme.INSTANCE;
        int i11 = HabiticaTheme.$stable;
        d1.f(floatValue2, androidx.compose.foundation.layout.j.i(androidx.compose.foundation.c.c(x0.l.a(m.s(e.f2335a, h.j((float) m.e.DEFAULT_DRAG_ANIMATION_DURATION)), sin + 1.0f), habiticaTheme.getColors(lVar, i11).m141getWindowBackground0d7_KjU(), habiticaTheme.getShapes(lVar, i11).b()), h.j(3)), habiticaTheme.getColors(lVar, i11).m132getSuccessColor0d7_KjU(), 0L, s4.f186b.b(), lVar, 0, 8);
        if (n.K()) {
            n.U();
        }
    }
}
