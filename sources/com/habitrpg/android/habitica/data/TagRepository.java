package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.Tag;
import dd.g;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: TagRepository.kt */
/* loaded from: classes4.dex */
public interface TagRepository extends BaseRepository {
    Object createTag(Tag tag, Continuation<? super Tag> continuation);

    Object createTags(Collection<? extends Tag> collection, Continuation<? super List<? extends Tag>> continuation);

    Object deleteTag(String str, Continuation<? super Void> continuation);

    Object deleteTags(Collection<String> collection, Continuation<? super List<Void>> continuation);

    g<List<Tag>> getTags();

    g<List<Tag>> getTags(String str);

    Object updateTag(Tag tag, Continuation<? super Tag> continuation);

    Object updateTags(Collection<? extends Tag> collection, Continuation<? super List<? extends Tag>> continuation);
}
