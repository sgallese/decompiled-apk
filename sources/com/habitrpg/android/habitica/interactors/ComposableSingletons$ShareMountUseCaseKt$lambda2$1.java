package com.habitrpg.android.habitica.interactors;

import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import dc.w;
import j0.l;
import j0.n;
import pc.p;
import qc.r;

/* compiled from: ShareMountUseCase.kt */
/* renamed from: com.habitrpg.android.habitica.interactors.ComposableSingletons$ShareMountUseCaseKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ShareMountUseCaseKt$lambda2$1 extends r implements p<l, Integer, w> {
    public static final ComposableSingletons$ShareMountUseCaseKt$lambda2$1 INSTANCE = new ComposableSingletons$ShareMountUseCaseKt$lambda2$1();

    ComposableSingletons$ShareMountUseCaseKt$lambda2$1() {
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
            n.V(1817714231, i10, -1, "com.habitrpg.android.habitica.interactors.ComposableSingletons$ShareMountUseCaseKt.lambda-2.<anonymous> (ShareMountUseCase.kt:42)");
        }
        HabiticaThemeKt.HabiticaTheme(ComposableSingletons$ShareMountUseCaseKt.INSTANCE.m11getLambda1$Habitica_2311256681_prodRelease(), lVar, 6);
        if (n.K()) {
            n.U();
        }
    }
}
