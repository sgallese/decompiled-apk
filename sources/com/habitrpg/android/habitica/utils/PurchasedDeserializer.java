package com.habitrpg.android.habitica.utils;

import com.google.gson.JsonParseException;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.habitrpg.android.habitica.models.user.OwnedCustomization;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import io.realm.x0;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public class PurchasedDeserializer implements k<Purchases> {
    private OwnedCustomization parseCustomization(String str, String str2, String str3, boolean z10) {
        OwnedCustomization ownedCustomization = new OwnedCustomization();
        ownedCustomization.setKey(str3);
        ownedCustomization.setType(str);
        if (str2 != null) {
            ownedCustomization.setCategory(str2);
        }
        ownedCustomization.setPurchased(z10);
        return ownedCustomization;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public Purchases deserialize(l lVar, Type type, j jVar) throws JsonParseException {
        n i10 = lVar.i();
        x0 x0Var = new x0();
        Purchases purchases = new Purchases();
        for (String str : Arrays.asList("background", "shirt", "skin")) {
            if (i10.D(str)) {
                for (Map.Entry<String, l> entry : i10.x(str).i().w()) {
                    x0Var.add(parseCustomization(str, null, entry.getKey(), entry.getValue().a()));
                }
            }
        }
        if (i10.D("hair")) {
            for (Map.Entry<String, l> entry2 : i10.x("hair").i().w()) {
                for (Map.Entry<String, l> entry3 : entry2.getValue().i().w()) {
                    x0Var.add(parseCustomization("hair", entry2.getKey(), entry3.getKey(), entry3.getValue().a()));
                }
            }
        }
        purchases.realmSet$customizations(x0Var);
        purchases.setPlan((SubscriptionPlan) jVar.a(i10.x("plan"), SubscriptionPlan.class));
        return purchases;
    }
}
