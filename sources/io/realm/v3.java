package io.realm;

import com.habitrpg.android.habitica.models.inventory.QuestMember;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.inventory.QuestRageStrike;
import com.habitrpg.android.habitica.models.members.Member;

/* compiled from: com_habitrpg_android_habitica_models_inventory_QuestRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface v3 {
    boolean realmGet$RSVPNeeded();

    boolean realmGet$active();

    String realmGet$completed();

    String realmGet$id();

    String realmGet$key();

    String realmGet$leader();

    x0<QuestMember> realmGet$members();

    x0<Member> realmGet$participants();

    QuestProgress realmGet$progress();

    x0<QuestRageStrike> realmGet$rageStrikes();

    void realmSet$RSVPNeeded(boolean z10);

    void realmSet$active(boolean z10);

    void realmSet$completed(String str);

    void realmSet$id(String str);

    void realmSet$key(String str);

    void realmSet$leader(String str);

    void realmSet$members(x0<QuestMember> x0Var);

    void realmSet$participants(x0<Member> x0Var);

    void realmSet$progress(QuestProgress questProgress);

    void realmSet$rageStrikes(x0<QuestRageStrike> x0Var);
}
