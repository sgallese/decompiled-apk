package com.habitrpg.android.habitica.ui.viewmodels;

import com.habitrpg.android.habitica.models.TutorialStep;
import dc.w;
import java.util.Date;
import pc.l;
import qc.q;
import qc.r;

/* compiled from: MainActivityViewModel.kt */
/* loaded from: classes4.dex */
final class MainActivityViewModel$onTutorialDeferred$1 extends r implements l<TutorialStep, w> {
    public static final MainActivityViewModel$onTutorialDeferred$1 INSTANCE = new MainActivityViewModel$onTutorialDeferred$1();

    MainActivityViewModel$onTutorialDeferred$1() {
        super(1);
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(TutorialStep tutorialStep) {
        invoke2(tutorialStep);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(TutorialStep tutorialStep) {
        q.i(tutorialStep, "it");
        tutorialStep.setDisplayedOn(new Date());
    }
}
