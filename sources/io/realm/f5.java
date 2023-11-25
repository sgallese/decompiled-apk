package io.realm;

import com.habitrpg.android.habitica.models.inventory.Quest;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_social_UserPartyRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface f5 {
    String realmGet$id();

    String realmGet$orderAscending();

    String realmGet$partyOrder();

    Quest realmGet$quest();

    Date realmGet$seeking();

    void realmSet$id(String str);

    void realmSet$orderAscending(String str);

    void realmSet$partyOrder(String str);

    void realmSet$quest(Quest quest);

    void realmSet$seeking(Date date);
}
