package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.TutorialStep;
import dd.g;
import java.util.List;

/* compiled from: TutorialRepository.kt */
/* loaded from: classes4.dex */
public interface TutorialRepository extends BaseRepository {
    g<TutorialStep> getTutorialStep(String str);

    g<List<TutorialStep>> getTutorialSteps(List<String> list);
}
