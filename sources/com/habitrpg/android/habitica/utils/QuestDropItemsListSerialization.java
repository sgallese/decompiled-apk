package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.habitrpg.android.habitica.models.inventory.QuestDropItem;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import qc.q;

/* compiled from: QuestDropItemsListSerialization.kt */
/* loaded from: classes4.dex */
public final class QuestDropItemsListSerialization implements k<x0<QuestDropItem>> {
    public static final int $stable = 0;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public x0<QuestDropItem> deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        q.i(lVar, "json");
        q.i(type, "typeOfT");
        q.i(jVar, "context");
        x0<QuestDropItem> x0Var = new x0<>();
        ArrayList arrayList = new ArrayList();
        Iterator<l> it = lVar.h().iterator();
        while (it.hasNext()) {
            QuestDropItem questDropItem = (QuestDropItem) jVar.a(it.next(), QuestDropItem.class);
            if (arrayList.contains(questDropItem.getKey())) {
                Iterator<QuestDropItem> it2 = x0Var.iterator();
                while (it2.hasNext()) {
                    QuestDropItem next = it2.next();
                    if (q.d(next.getKey(), questDropItem.getKey())) {
                        next.setCount(next.getCount() + 1);
                    }
                }
            } else {
                questDropItem.setCount(1);
                x0Var.add(questDropItem);
                arrayList.add(questDropItem.getKey());
            }
        }
        return x0Var;
    }
}
