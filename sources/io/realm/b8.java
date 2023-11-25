package io.realm;

import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.ABTest;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Flags;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Permissions;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Purchases;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.UserAchievement;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_user_UserRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface b8 {
    x0<ABTest> realmGet$abTests();

    x0<UserAchievement> realmGet$achievements();

    Authentication realmGet$authentication();

    Backer realmGet$backer();

    double realmGet$balance();

    x0<String> realmGet$challengeAchievements();

    x0<ChallengeMembership> realmGet$challenges();

    ContributorInfo realmGet$contributor();

    Flags realmGet$flags();

    String realmGet$id();

    Inbox realmGet$inbox();

    Invitations realmGet$invitations();

    Items realmGet$items();

    Date realmGet$lastCron();

    int realmGet$loginIncentives();

    boolean realmGet$needsCron();

    UserParty realmGet$party();

    Permissions realmGet$permissions();

    Preferences realmGet$preferences();

    Profile realmGet$profile();

    Purchases realmGet$purchased();

    x0<QuestAchievement> realmGet$questAchievements();

    Stats realmGet$stats();

    int realmGet$streakCount();

    x0<Tag> realmGet$tags();

    int realmGet$versionNumber();

    void realmSet$abTests(x0<ABTest> x0Var);

    void realmSet$achievements(x0<UserAchievement> x0Var);

    void realmSet$authentication(Authentication authentication);

    void realmSet$backer(Backer backer);

    void realmSet$balance(double d10);

    void realmSet$challengeAchievements(x0<String> x0Var);

    void realmSet$challenges(x0<ChallengeMembership> x0Var);

    void realmSet$contributor(ContributorInfo contributorInfo);

    void realmSet$flags(Flags flags);

    void realmSet$id(String str);

    void realmSet$inbox(Inbox inbox);

    void realmSet$invitations(Invitations invitations);

    void realmSet$items(Items items);

    void realmSet$lastCron(Date date);

    void realmSet$loginIncentives(int i10);

    void realmSet$needsCron(boolean z10);

    void realmSet$party(UserParty userParty);

    void realmSet$permissions(Permissions permissions);

    void realmSet$preferences(Preferences preferences);

    void realmSet$profile(Profile profile);

    void realmSet$purchased(Purchases purchases);

    void realmSet$questAchievements(x0<QuestAchievement> x0Var);

    void realmSet$stats(Stats stats);

    void realmSet$streakCount(int i10);

    void realmSet$tags(x0<Tag> x0Var);

    void realmSet$versionNumber(int i10);
}
