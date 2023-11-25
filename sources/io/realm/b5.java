package io.realm;

import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.social.GroupCategory;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;

/* compiled from: com_habitrpg_android_habitica_models_social_GroupRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface b5 {
    double realmGet$balance();

    x0<GroupCategory> realmGet$categories();

    int realmGet$challengeCount();

    String realmGet$description();

    String realmGet$id();

    String realmGet$leaderID();

    String realmGet$leaderMessage();

    String realmGet$leaderName();

    boolean realmGet$leaderOnlyChallenges();

    boolean realmGet$leaderOnlyGetGems();

    String realmGet$logo();

    x0<String> realmGet$managers();

    int realmGet$memberCount();

    String realmGet$name();

    String realmGet$privacy();

    SubscriptionPlan realmGet$purchased();

    Quest realmGet$quest();

    String realmGet$summary();

    String realmGet$type();

    void realmSet$balance(double d10);

    void realmSet$categories(x0<GroupCategory> x0Var);

    void realmSet$challengeCount(int i10);

    void realmSet$description(String str);

    void realmSet$id(String str);

    void realmSet$leaderID(String str);

    void realmSet$leaderMessage(String str);

    void realmSet$leaderName(String str);

    void realmSet$leaderOnlyChallenges(boolean z10);

    void realmSet$leaderOnlyGetGems(boolean z10);

    void realmSet$logo(String str);

    void realmSet$managers(x0<String> x0Var);

    void realmSet$memberCount(int i10);

    void realmSet$name(String str);

    void realmSet$privacy(String str);

    void realmSet$purchased(SubscriptionPlan subscriptionPlan);

    void realmSet$quest(Quest quest);

    void realmSet$summary(String str);

    void realmSet$type(String str);
}
