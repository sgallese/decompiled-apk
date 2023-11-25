package io.realm;

import com.habitrpg.android.habitica.models.social.Group;
import com.habitrpg.android.habitica.models.user.User;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_social_ChallengeRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface r4 {
    Date realmGet$createdAt();

    String realmGet$dailyList();

    String realmGet$description();

    Group realmGet$group();

    String realmGet$groupId();

    String realmGet$groupName();

    String realmGet$habitList();

    String realmGet$id();

    User realmGet$leader();

    String realmGet$leaderId();

    String realmGet$leaderName();

    int realmGet$memberCount();

    String realmGet$name();

    boolean realmGet$official();

    int realmGet$prize();

    String realmGet$rewardList();

    String realmGet$shortName();

    String realmGet$summary();

    String realmGet$todoList();

    Date realmGet$updatedAt();

    void realmSet$createdAt(Date date);

    void realmSet$dailyList(String str);

    void realmSet$description(String str);

    void realmSet$group(Group group);

    void realmSet$groupId(String str);

    void realmSet$groupName(String str);

    void realmSet$habitList(String str);

    void realmSet$id(String str);

    void realmSet$leader(User user);

    void realmSet$leaderId(String str);

    void realmSet$leaderName(String str);

    void realmSet$memberCount(int i10);

    void realmSet$name(String str);

    void realmSet$official(boolean z10);

    void realmSet$prize(int i10);

    void realmSet$rewardList(String str);

    void realmSet$shortName(String str);

    void realmSet$summary(String str);

    void realmSet$todoList(String str);

    void realmSet$updatedAt(Date date);
}
