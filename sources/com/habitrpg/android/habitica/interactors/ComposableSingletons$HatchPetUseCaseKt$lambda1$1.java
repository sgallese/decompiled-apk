package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.ui.theme.HabiticaTheme;
import com.habitrpg.android.habitica.ui.views.BackgroundSceneKt;
import dc.w;
import j0.l;
import j0.n;
import pc.p;
import qc.r;
import x0.e;

/* compiled from: HatchPetUseCase.kt */
/* renamed from: com.habitrpg.android.habitica.interactors.ComposableSingletons$HatchPetUseCaseKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$HatchPetUseCaseKt$lambda1$1 extends r implements p<l, Integer, w> {
    public static final ComposableSingletons$HatchPetUseCaseKt$lambda1$1 INSTANCE = new ComposableSingletons$HatchPetUseCaseKt$lambda1$1();

    ComposableSingletons$HatchPetUseCaseKt$lambda1$1() {
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
            n.V(-1458811516, i10, -1, "com.habitrpg.android.habitica.interactors.ComposableSingletons$HatchPetUseCaseKt.lambda-1.<anonymous> (HatchPetUseCase.kt:41)");
        }
        BackgroundSceneKt.BackgroundScene(e.a(androidx.compose.ui.e.f2335a, HabiticaTheme.INSTANCE.getShapes(lVar, HabiticaTheme.$stable).a()), lVar, 0, 0);
        if (n.K()) {
            n.U();
        }
    }
}
