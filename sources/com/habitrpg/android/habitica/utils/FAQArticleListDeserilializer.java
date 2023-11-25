package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.FAQArticle;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import qc.q;

/* compiled from: FAQArticleListDeserilializer.kt */
/* loaded from: classes4.dex */
public final class FAQArticleListDeserilializer implements k<List<? extends FAQArticle>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends FAQArticle> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0 x0Var = new x0();
        Iterator<l> it = lVar.i().x("questions").h().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            n i12 = it.next().i();
            FAQArticle fAQArticle = new FAQArticle();
            fAQArticle.setPosition(Integer.valueOf(i10));
            fAQArticle.setQuestion(i12.x("question").l());
            if (i12.D("android")) {
                fAQArticle.setAnswer(i12.x("android").l());
            } else {
                fAQArticle.setAnswer(i12.x("web").l());
            }
            x0Var.add(fAQArticle);
            i10 = i11;
        }
        return x0Var;
    }
}
