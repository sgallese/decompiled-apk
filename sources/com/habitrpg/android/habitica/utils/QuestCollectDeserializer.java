package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.inventory.QuestCollect;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Map;
import qc.q;

/* compiled from: QuestCollectDeserializer.kt */
/* loaded from: classes4.dex */
public final class QuestCollectDeserializer implements k<x0<QuestCollect>> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public x0<QuestCollect> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0<QuestCollect> x0Var = new x0<>();
        for (Map.Entry<String, l> entry : lVar.i().w()) {
            q.f(entry);
            String key = entry.getKey();
            l value = entry.getValue();
            QuestCollect questCollect = new QuestCollect();
            questCollect.setKey(key);
            n i10 = value.i();
            questCollect.setCount(i10.x("count").g());
            questCollect.setText(i10.x("text").l());
            x0Var.add(questCollect);
        }
        return x0Var;
    }
}
