package io.realm;

import com.habitrpg.android.habitica.models.members.MemberFlags;
import com.habitrpg.android.habitica.models.members.MemberPreferences;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;

/* compiled from: com_habitrpg_android_habitica_models_members_MemberRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface j4 {
    Authentication realmGet$authentication();

    Backer realmGet$backer();

    double realmGet$balance();

    ContributorInfo realmGet$contributor();

    Outfit realmGet$costume();

    String realmGet$currentMount();

    String realmGet$currentPet();

    Outfit realmGet$equipped();

    MemberFlags realmGet$flags();

    String realmGet$id();

    Inbox realmGet$inbox();

    Items realmGet$items();

    int realmGet$loginIncentives();

    Boolean realmGet$participatesInQuest();

    UserParty realmGet$party();

    MemberPreferences realmGet$preferences();

    Profile realmGet$profile();

    Stats realmGet$stats();

    void realmSet$authentication(Authentication authentication);

    void realmSet$backer(Backer backer);

    void realmSet$balance(double d10);

    void realmSet$contributor(ContributorInfo contributorInfo);

    void realmSet$costume(Outfit outfit);

    void realmSet$currentMount(String str);

    void realmSet$currentPet(String str);

    void realmSet$equipped(Outfit outfit);

    void realmSet$flags(MemberFlags memberFlags);

    void realmSet$id(String str);

    void realmSet$inbox(Inbox inbox);

    void realmSet$items(Items items);

    void realmSet$loginIncentives(int i10);

    void realmSet$participatesInQuest(Boolean bool);

    void realmSet$party(UserParty userParty);

    void realmSet$preferences(MemberPreferences memberPreferences);

    void realmSet$profile(Profile profile);

    void realmSet$stats(Stats stats);
}
