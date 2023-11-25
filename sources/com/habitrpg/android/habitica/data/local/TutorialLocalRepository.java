package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.TutorialStep;
import dd.g;
import java.util.List;

/* compiled from: TutorialLocalRepository.kt */
/* loaded from: classes4.dex */
public interface TutorialLocalRepository extends BaseLocalRepository {
    g<TutorialStep> getTutorialStep(String str);

    g<List<TutorialStep>> getTutorialSteps(List<String> list);
}
