package com.habitrpg.android.habitica.data.local;

import com.habitrpg.android.habitica.models.FAQArticle;
import dd.g;
import java.util.List;

/* compiled from: FAQLocalRepository.kt */
/* loaded from: classes4.dex */
public interface FAQLocalRepository extends ContentLocalRepository {
    g<FAQArticle> getArticle(int i10);

    g<List<FAQArticle>> getArticles();
}
