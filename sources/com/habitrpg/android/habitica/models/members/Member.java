package com.habitrpg.android.habitica.models.members;

import com.habitrpg.android.habitica.models.Assignable;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.user.Authentication;
import com.habitrpg.android.habitica.models.user.Backer;
import com.habitrpg.android.habitica.models.user.ContributorInfo;
import com.habitrpg.android.habitica.models.user.Inbox;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.OwnedMount;
import com.habitrpg.android.habitica.models.user.OwnedPet;
import com.habitrpg.android.habitica.models.user.Profile;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.shared.habitica.models.Avatar;
import fa.c;
import io.realm.a1;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.j4;
import io.realm.x0;
import qc.q;

/* compiled from: Member.kt */
/* loaded from: classes4.dex */
public class Member extends d1 implements Avatar, BaseMainObject, Assignable, j4 {
    public static final int $stable = 8;
    private Authentication authentication;
    private Backer backer;
    private double balance;
    private ContributorInfo contributor;
    private Outfit costume;
    private String currentMount;
    private String currentPet;
    private Outfit equipped;
    private MemberFlags flags;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12515id;
    private Inbox inbox;
    private Items items;
    private int loginIncentives;
    private Boolean participatesInQuest;
    private UserParty party;
    private MemberPreferences preferences;
    private Profile profile;
    private Stats stats;

    public Member() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
    }

    public final Backer getBacker() {
        return realmGet$backer();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public double getBalance() {
        return realmGet$balance();
    }

    public final ContributorInfo getContributor() {
        return realmGet$contributor();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentMount() {
        return realmGet$currentMount();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentPet() {
        return realmGet$currentPet();
    }

    public final String getDisplayName() {
        String name;
        Profile realmGet$profile = realmGet$profile();
        if (realmGet$profile == null || (name = realmGet$profile.getName()) == null) {
            return "";
        }
        return name;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getFormattedUsername() {
        return Avatar.DefaultImpls.getFormattedUsername(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getGemCount() {
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getHasClass() {
        return Avatar.DefaultImpls.getHasClass(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getHourglassCount() {
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar, com.habitrpg.android.habitica.models.Assignable
    public String getId() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.Assignable
    public String getIdentifiableName() {
        String username = getUsername();
        if (username == null) {
            return "";
        }
        return username;
    }

    public final Inbox getInbox() {
        return realmGet$inbox();
    }

    public final int getLoginIncentives() {
        return realmGet$loginIncentives();
    }

    public final int getMountsTamedCount() {
        x0<OwnedMount> mounts;
        Items items = getItems();
        if (items != null && (mounts = items.getMounts()) != null) {
            return mounts.size();
        }
        return 0;
    }

    public final Boolean getParticipatesInQuest() {
        return realmGet$participatesInQuest();
    }

    public final UserParty getParty() {
        return realmGet$party();
    }

    public final int getPetsFoundCount() {
        x0<OwnedPet> pets;
        Items items = getItems();
        if (items != null && (pets = items.getPets()) != null) {
            return pets.size();
        }
        return 0;
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return getId();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    public final Profile getProfile() {
        return realmGet$profile();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return Member.class;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getSleep() {
        return Avatar.DefaultImpls.getSleep(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getUsername() {
        return Avatar.DefaultImpls.getUsername(this);
    }

    @Override // io.realm.j4
    public Authentication realmGet$authentication() {
        return this.authentication;
    }

    @Override // io.realm.j4
    public Backer realmGet$backer() {
        return this.backer;
    }

    @Override // io.realm.j4
    public double realmGet$balance() {
        return this.balance;
    }

    @Override // io.realm.j4
    public ContributorInfo realmGet$contributor() {
        return this.contributor;
    }

    @Override // io.realm.j4
    public Outfit realmGet$costume() {
        return this.costume;
    }

    @Override // io.realm.j4
    public String realmGet$currentMount() {
        return this.currentMount;
    }

    @Override // io.realm.j4
    public String realmGet$currentPet() {
        return this.currentPet;
    }

    @Override // io.realm.j4
    public Outfit realmGet$equipped() {
        return this.equipped;
    }

    @Override // io.realm.j4
    public MemberFlags realmGet$flags() {
        return this.flags;
    }

    @Override // io.realm.j4
    public String realmGet$id() {
        return this.f12515id;
    }

    @Override // io.realm.j4
    public Inbox realmGet$inbox() {
        return this.inbox;
    }

    @Override // io.realm.j4
    public Items realmGet$items() {
        return this.items;
    }

    @Override // io.realm.j4
    public int realmGet$loginIncentives() {
        return this.loginIncentives;
    }

    @Override // io.realm.j4
    public Boolean realmGet$participatesInQuest() {
        return this.participatesInQuest;
    }

    @Override // io.realm.j4
    public UserParty realmGet$party() {
        return this.party;
    }

    @Override // io.realm.j4
    public MemberPreferences realmGet$preferences() {
        return this.preferences;
    }

    @Override // io.realm.j4
    public Profile realmGet$profile() {
        return this.profile;
    }

    @Override // io.realm.j4
    public Stats realmGet$stats() {
        return this.stats;
    }

    @Override // io.realm.j4
    public void realmSet$authentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override // io.realm.j4
    public void realmSet$backer(Backer backer) {
        this.backer = backer;
    }

    @Override // io.realm.j4
    public void realmSet$balance(double d10) {
        this.balance = d10;
    }

    @Override // io.realm.j4
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        this.contributor = contributorInfo;
    }

    @Override // io.realm.j4
    public void realmSet$costume(Outfit outfit) {
        this.costume = outfit;
    }

    @Override // io.realm.j4
    public void realmSet$currentMount(String str) {
        this.currentMount = str;
    }

    @Override // io.realm.j4
    public void realmSet$currentPet(String str) {
        this.currentPet = str;
    }

    @Override // io.realm.j4
    public void realmSet$equipped(Outfit outfit) {
        this.equipped = outfit;
    }

    @Override // io.realm.j4
    public void realmSet$flags(MemberFlags memberFlags) {
        this.flags = memberFlags;
    }

    @Override // io.realm.j4
    public void realmSet$id(String str) {
        this.f12515id = str;
    }

    @Override // io.realm.j4
    public void realmSet$inbox(Inbox inbox) {
        this.inbox = inbox;
    }

    @Override // io.realm.j4
    public void realmSet$items(Items items) {
        this.items = items;
    }

    @Override // io.realm.j4
    public void realmSet$loginIncentives(int i10) {
        this.loginIncentives = i10;
    }

    @Override // io.realm.j4
    public void realmSet$participatesInQuest(Boolean bool) {
        this.participatesInQuest = bool;
    }

    @Override // io.realm.j4
    public void realmSet$party(UserParty userParty) {
        this.party = userParty;
    }

    @Override // io.realm.j4
    public void realmSet$preferences(MemberPreferences memberPreferences) {
        this.preferences = memberPreferences;
    }

    @Override // io.realm.j4
    public void realmSet$profile(Profile profile) {
        this.profile = profile;
    }

    @Override // io.realm.j4
    public void realmSet$stats(Stats stats) {
        this.stats = stats;
    }

    public void setAuthentication(Authentication authentication) {
        realmSet$authentication(authentication);
    }

    public final void setBacker(Backer backer) {
        realmSet$backer(backer);
    }

    public void setBalance(double d10) {
        realmSet$balance(d10);
    }

    public final void setContributor(ContributorInfo contributorInfo) {
        realmSet$contributor(contributorInfo);
    }

    public void setCostume(Outfit outfit) {
        realmSet$costume(outfit);
    }

    public void setCurrentMount(String str) {
        realmSet$currentMount(str);
    }

    public void setCurrentPet(String str) {
        realmSet$currentPet(str);
    }

    public void setEquipped(Outfit outfit) {
        realmSet$equipped(outfit);
    }

    public void setFlags(MemberFlags memberFlags) {
        realmSet$flags(memberFlags);
    }

    public void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setInbox(Inbox inbox) {
        realmSet$inbox(inbox);
    }

    public void setItems(Items items) {
        realmSet$items(items);
    }

    public final void setLoginIncentives(int i10) {
        realmSet$loginIncentives(i10);
    }

    public final void setParticipatesInQuest(Boolean bool) {
        realmSet$participatesInQuest(bool);
    }

    public final void setParty(UserParty userParty) {
        realmSet$party(userParty);
    }

    public void setPreferences(MemberPreferences memberPreferences) {
        realmSet$preferences(memberPreferences);
    }

    public final void setProfile(Profile profile) {
        realmSet$profile(profile);
    }

    public void setStats(Stats stats) {
        realmSet$stats(stats);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Authentication getAuthentication() {
        return realmGet$authentication();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Outfit getCostume() {
        return realmGet$costume();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Outfit getEquipped() {
        return realmGet$equipped();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public MemberFlags getFlags() {
        return realmGet$flags();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Items getItems() {
        return realmGet$items();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public MemberPreferences getPreferences() {
        return realmGet$preferences();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Stats getStats() {
        return realmGet$stats();
    }

    @Override // com.habitrpg.android.habitica.models.Assignable
    public Avatar getAvatar() {
        return this;
    }
}
