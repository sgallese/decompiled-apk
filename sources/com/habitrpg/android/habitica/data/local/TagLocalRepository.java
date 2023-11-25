package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.Tag;
import dd.g;
import java.util.List;

/* compiled from: TagLocalRepository.kt */
/* loaded from: classes4.dex */
public interface TagLocalRepository extends BaseLocalRepository {
    void deleteTag(String str);

    g<List<Tag>> getTags(String str);
}
