package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.ContentResult;
import com.habitrpg.android.habitica.models.WorldState;
import dd.g;

/* compiled from: ContentLocalRepository.kt */
/* loaded from: classes4.dex */
public interface ContentLocalRepository extends BaseLocalRepository {
    g<WorldState> getWorldState();

    void saveContent(ContentResult contentResult);

    void saveWorldState(WorldState worldState);
}
