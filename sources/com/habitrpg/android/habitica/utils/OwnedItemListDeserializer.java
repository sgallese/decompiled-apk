package com.habitrpg.android.habitica.utils;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: OwnedItemListDeserializer.kt */
/* loaded from: classes4.dex */
public final class OwnedItemListDeserializer implements k<List<? extends OwnedItem>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends OwnedItem> deserialize(l lVar, Type type, j jVar) {
        n i10;
        x0 x0Var = new x0();
        Set<Map.Entry<String, l>> w10 = (lVar == null || (i10 = lVar.i()) == null) ? null : i10.w();
        if (w10 != null) {
            for (Map.Entry<String, l> entry : w10) {
                if (entry.getValue().p()) {
                    OwnedItem ownedItem = new OwnedItem();
                    ownedItem.setKey(entry.getKey());
                    ownedItem.setNumberOwned(entry.getValue().g());
                    x0Var.add(ownedItem);
                }
            }
        }
        return x0Var;
    }
}
