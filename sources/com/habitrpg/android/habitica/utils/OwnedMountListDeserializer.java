package com.habitrpg.android.habitica.utils;

import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: OwnedMountListDeserializer.kt */
/* loaded from: classes4.dex */
public final class OwnedMountListDeserializer implements k<List<? extends OwnedMount>> {
    public static final int $stable = 0;

    @Override // com.google.gson.k
    public List<? extends OwnedMount> deserialize(l lVar, Type type, j jVar) {
        n i10;
        x0 x0Var = new x0();
        Set<Map.Entry<String, l>> w10 = (lVar == null || (i10 = lVar.i()) == null) ? null : i10.w();
        if (w10 != null) {
            for (Map.Entry<String, l> entry : w10) {
                OwnedMount ownedMount = new OwnedMount();
                ownedMount.setKey(entry.getKey());
                if (entry.getValue().n()) {
                    ownedMount.setOwned(false);
                } else {
                    ownedMount.setOwned(entry.getValue().a());
                }
                x0Var.add(ownedMount);
            }
        }
        return x0Var;
    }
}
