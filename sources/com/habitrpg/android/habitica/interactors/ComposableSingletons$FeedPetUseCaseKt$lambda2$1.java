package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import dc.w;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: FeedPetUseCase.kt */
/* renamed from: com.habitrpg.android.habitica.interactors.ComposableSingletons$FeedPetUseCaseKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$FeedPetUseCaseKt$lambda2$1 extends r implements p<l, Integer, w> {
    public static final ComposableSingletons$FeedPetUseCaseKt$lambda2$1 INSTANCE = new ComposableSingletons$FeedPetUseCaseKt$lambda2$1();

    ComposableSingletons$FeedPetUseCaseKt$lambda2$1() {
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
            n.V(-832989197, i10, -1, "com.habitrpg.android.habitica.interactors.ComposableSingletons$FeedPetUseCaseKt.lambda-2.<anonymous> (FeedPetUseCase.kt:43)");
        }
        HabiticaThemeKt.HabiticaTheme(ComposableSingletons$FeedPetUseCaseKt.INSTANCE.m7getLambda1$Habitica_2311256681_prodRelease(), lVar, 6);
        if (n.K()) {
            n.U();
        }
    }
}
