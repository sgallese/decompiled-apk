package com.habitrpg.android.habitica.data;

import com.habitrpg.android.habitica.models.FAQArticle;
import dd.g;
import java.util.List;

/* compiled from: FAQRepository.kt */
/* loaded from: classes4.dex */
public interface FAQRepository extends BaseRepository {
    g<FAQArticle> getArticle(int i10);

    g<List<FAQArticle>> getArticles();
}
