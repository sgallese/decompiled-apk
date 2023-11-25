package com.habitrpg.android.habitica.models.user;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.PushDevice;
import com.habitrpg.android.habitica.models.QuestAchievement;
import com.habitrpg.android.habitica.models.Tag;
import com.habitrpg.android.habitica.models.VersionedObject;
import com.habitrpg.android.habitica.models.invitations.Invitations;
import com.habitrpg.android.habitica.models.social.ChallengeMembership;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.tasks.TaskList;
import com.habitrpg.shared.habitica.models.Avatar;
import com.habitrpg.shared.habitica.models.AvatarOutfit;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import ec.b0;
import ec.t;
import fa.c;
import io.realm.b8;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x0;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import qc.h;
import qc.q;
import yc.v;

/* compiled from: User.kt */
/* loaded from: classes4.dex */
public class User extends d1 implements BaseMainObject, Avatar, VersionedObject, b8 {
    private static final List<String> ONBOARDING_ACHIEVEMENT_KEYS;
    private x0<ABTest> abTests;
    private x0<UserAchievement> achievements;
    @c("auth")
    private Authentication authentication;
    private Backer backer;
    private double balance;
    private x0<String> challengeAchievements;
    private x0<ChallengeMembership> challenges;
    private ContributorInfo contributor;
    private Flags flags;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12531id;
    private Inbox inbox;
    private Invitations invitations;
    private Items items;
    private Date lastCron;
    private int loginIncentives;
    private boolean needsCron;
    private UserParty party;
    private Permissions permissions;
    private Preferences preferences;
    private Profile profile;
    private Purchases purchased;
    private List<PushDevice> pushDevices;
    private x0<QuestAchievement> questAchievements;
    private Stats stats;
    private int streakCount;
    private x0<Tag> tags;
    private TaskList tasks;
    private TasksOrder tasksOrder;
    @c("_v")
    private int versionNumber;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: User.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final List<String> getONBOARDING_ACHIEVEMENT_KEYS() {
            return User.ONBOARDING_ACHIEVEMENT_KEYS;
        }
    }

    /* compiled from: User.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Permission.values().length];
            try {
                iArr[Permission.MODERATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Permission.USER_SUPPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> l10;
        l10 = t.l("createdTask", "completedTask", "hatchedPet", "fedPet", "purchasedEquipment");
        ONBOARDING_ACHIEVEMENT_KEYS = l10;
    }

    public User() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$tags(new x0());
        realmSet$achievements(new x0());
        realmSet$questAchievements(new x0());
        realmSet$challengeAchievements(new x0());
    }

    public final x0<ABTest> getAbTests() {
        return realmGet$abTests();
    }

    public final x0<UserAchievement> getAchievements() {
        return realmGet$achievements();
    }

    public final Backer getBacker() {
        return realmGet$backer();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public double getBalance() {
        return realmGet$balance();
    }

    public final x0<String> getChallengeAchievements() {
        return realmGet$challengeAchievements();
    }

    public final x0<ChallengeMembership> getChallenges() {
        return realmGet$challenges();
    }

    public final ContributorInfo getContributor() {
        return realmGet$contributor();
    }

    public final int getContributorColor() {
        ContributorInfo realmGet$contributor = realmGet$contributor();
        if (realmGet$contributor != null) {
            return realmGet$contributor.getContributorColor();
        }
        return R.color.text_primary;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public AvatarOutfit getCostume() {
        return Avatar.DefaultImpls.getCostume(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentMount() {
        return Avatar.DefaultImpls.getCurrentMount(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getCurrentPet() {
        return Avatar.DefaultImpls.getCurrentPet(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public AvatarOutfit getEquipped() {
        return Avatar.DefaultImpls.getEquipped(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getFormattedUsername() {
        return Avatar.DefaultImpls.getFormattedUsername(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getGemCount() {
        return Avatar.DefaultImpls.getGemCount(this);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getHasClass() {
        return Avatar.DefaultImpls.getHasClass(this);
    }

    public final boolean getHasCompletedOnboarding() {
        int i10;
        List<UserAchievement> onboardingAchievements = getOnboardingAchievements();
        List<UserAchievement> list = onboardingAchievements;
        if ((list instanceof Collection) && list.isEmpty()) {
            i10 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (((UserAchievement) it.next()).getEarned() && (i10 = i10 + 1) < 0) {
                    t.q();
                }
            }
        }
        if (i10 != onboardingAchievements.size()) {
            return false;
        }
        return true;
    }

    public final boolean getHasParty() {
        String id2;
        boolean u10;
        UserParty realmGet$party = realmGet$party();
        if (realmGet$party != null && (id2 = realmGet$party.getId()) != null) {
            u10 = v.u(id2);
            if ((!u10) != true) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public int getHourglassCount() {
        SubscriptionPlan plan;
        SubscriptionPlanConsecutive consecutive;
        Purchases realmGet$purchased = realmGet$purchased();
        if (realmGet$purchased != null && (plan = realmGet$purchased.getPlan()) != null && (consecutive = plan.getConsecutive()) != null) {
            return consecutive.getTrinkets();
        }
        return 0;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar, com.habitrpg.android.habitica.models.Assignable
    public String getId() {
        return realmGet$id();
    }

    public final Inbox getInbox() {
        return realmGet$inbox();
    }

    public final Invitations getInvitations() {
        return realmGet$invitations();
    }

    public final Date getLastCron() {
        return realmGet$lastCron();
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

    public final boolean getNeedsCron() {
        return realmGet$needsCron();
    }

    public final List<UserAchievement> getOnboardingAchievements() {
        List<UserAchievement> C0;
        boolean T;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : ONBOARDING_ACHIEVEMENT_KEYS) {
            UserAchievement userAchievement = new UserAchievement();
            userAchievement.setKey(str);
            linkedHashMap.put(str, userAchievement);
        }
        Iterator it = realmGet$achievements().iterator();
        while (it.hasNext()) {
            UserAchievement userAchievement2 = (UserAchievement) it.next();
            T = b0.T(ONBOARDING_ACHIEVEMENT_KEYS, userAchievement2.getKey());
            if (T) {
                String key = userAchievement2.getKey();
                if (key == null) {
                    key = "";
                }
                q.f(userAchievement2);
                linkedHashMap.put(key, userAchievement2);
            }
        }
        C0 = b0.C0(linkedHashMap.values());
        return C0;
    }

    public final UserParty getParty() {
        return realmGet$party();
    }

    public final Permissions getPermissions$Habitica_2311256681_prodRelease() {
        return realmGet$permissions();
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

    public final Purchases getPurchased() {
        return realmGet$purchased();
    }

    public final List<PushDevice> getPushDevices() {
        return this.pushDevices;
    }

    public final x0<QuestAchievement> getQuestAchievements() {
        return realmGet$questAchievements();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<User> getRealmClass() {
        return User.class;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public boolean getSleep() {
        return Avatar.DefaultImpls.getSleep(this);
    }

    public final int getStreakCount() {
        return realmGet$streakCount();
    }

    public final x0<Tag> getTags() {
        return realmGet$tags();
    }

    public final TaskList getTasks() {
        return this.tasks;
    }

    public final TasksOrder getTasksOrder() {
        return this.tasksOrder;
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public String getUsername() {
        return Avatar.DefaultImpls.getUsername(this);
    }

    @Override // com.habitrpg.android.habitica.models.VersionedObject
    public int getVersionNumber() {
        return realmGet$versionNumber();
    }

    public final boolean hasPermission(Permission permission) {
        q.i(permission, "permission");
        Permissions realmGet$permissions = realmGet$permissions();
        boolean z10 = false;
        if (realmGet$permissions != null && realmGet$permissions.getFullAccess()) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[permission.ordinal()];
        Boolean bool = null;
        if (i10 != 1) {
            if (i10 == 2) {
                Permissions realmGet$permissions2 = realmGet$permissions();
                if (realmGet$permissions2 != null) {
                    bool = Boolean.valueOf(realmGet$permissions2.getUserSupport());
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            Permissions realmGet$permissions3 = realmGet$permissions();
            if (realmGet$permissions3 != null) {
                bool = Boolean.valueOf(realmGet$permissions3.getModerator());
            }
        }
        return q.d(bool, Boolean.TRUE);
    }

    public final boolean isSubscribed() {
        SubscriptionPlan plan;
        Purchases realmGet$purchased = realmGet$purchased();
        if (realmGet$purchased == null || (plan = realmGet$purchased.getPlan()) == null || !plan.isActive()) {
            return false;
        }
        return true;
    }

    @Override // io.realm.b8
    public x0 realmGet$abTests() {
        return this.abTests;
    }

    @Override // io.realm.b8
    public x0 realmGet$achievements() {
        return this.achievements;
    }

    @Override // io.realm.b8
    public Authentication realmGet$authentication() {
        return this.authentication;
    }

    @Override // io.realm.b8
    public Backer realmGet$backer() {
        return this.backer;
    }

    @Override // io.realm.b8
    public double realmGet$balance() {
        return this.balance;
    }

    @Override // io.realm.b8
    public x0 realmGet$challengeAchievements() {
        return this.challengeAchievements;
    }

    @Override // io.realm.b8
    public x0 realmGet$challenges() {
        return this.challenges;
    }

    @Override // io.realm.b8
    public ContributorInfo realmGet$contributor() {
        return this.contributor;
    }

    @Override // io.realm.b8
    public Flags realmGet$flags() {
        return this.flags;
    }

    @Override // io.realm.b8
    public String realmGet$id() {
        return this.f12531id;
    }

    @Override // io.realm.b8
    public Inbox realmGet$inbox() {
        return this.inbox;
    }

    @Override // io.realm.b8
    public Invitations realmGet$invitations() {
        return this.invitations;
    }

    @Override // io.realm.b8
    public Items realmGet$items() {
        return this.items;
    }

    @Override // io.realm.b8
    public Date realmGet$lastCron() {
        return this.lastCron;
    }

    @Override // io.realm.b8
    public int realmGet$loginIncentives() {
        return this.loginIncentives;
    }

    @Override // io.realm.b8
    public boolean realmGet$needsCron() {
        return this.needsCron;
    }

    @Override // io.realm.b8
    public UserParty realmGet$party() {
        return this.party;
    }

    @Override // io.realm.b8
    public Permissions realmGet$permissions() {
        return this.permissions;
    }

    @Override // io.realm.b8
    public Preferences realmGet$preferences() {
        return this.preferences;
    }

    @Override // io.realm.b8
    public Profile realmGet$profile() {
        return this.profile;
    }

    @Override // io.realm.b8
    public Purchases realmGet$purchased() {
        return this.purchased;
    }

    @Override // io.realm.b8
    public x0 realmGet$questAchievements() {
        return this.questAchievements;
    }

    @Override // io.realm.b8
    public Stats realmGet$stats() {
        return this.stats;
    }

    @Override // io.realm.b8
    public int realmGet$streakCount() {
        return this.streakCount;
    }

    @Override // io.realm.b8
    public x0 realmGet$tags() {
        return this.tags;
    }

    @Override // io.realm.b8
    public int realmGet$versionNumber() {
        return this.versionNumber;
    }

    @Override // io.realm.b8
    public void realmSet$abTests(x0 x0Var) {
        this.abTests = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$achievements(x0 x0Var) {
        this.achievements = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$authentication(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override // io.realm.b8
    public void realmSet$backer(Backer backer) {
        this.backer = backer;
    }

    @Override // io.realm.b8
    public void realmSet$balance(double d10) {
        this.balance = d10;
    }

    @Override // io.realm.b8
    public void realmSet$challengeAchievements(x0 x0Var) {
        this.challengeAchievements = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$challenges(x0 x0Var) {
        this.challenges = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$contributor(ContributorInfo contributorInfo) {
        this.contributor = contributorInfo;
    }

    @Override // io.realm.b8
    public void realmSet$flags(Flags flags) {
        this.flags = flags;
    }

    @Override // io.realm.b8
    public void realmSet$id(String str) {
        this.f12531id = str;
    }

    @Override // io.realm.b8
    public void realmSet$inbox(Inbox inbox) {
        this.inbox = inbox;
    }

    @Override // io.realm.b8
    public void realmSet$invitations(Invitations invitations) {
        this.invitations = invitations;
    }

    @Override // io.realm.b8
    public void realmSet$items(Items items) {
        this.items = items;
    }

    @Override // io.realm.b8
    public void realmSet$lastCron(Date date) {
        this.lastCron = date;
    }

    @Override // io.realm.b8
    public void realmSet$loginIncentives(int i10) {
        this.loginIncentives = i10;
    }

    @Override // io.realm.b8
    public void realmSet$needsCron(boolean z10) {
        this.needsCron = z10;
    }

    @Override // io.realm.b8
    public void realmSet$party(UserParty userParty) {
        this.party = userParty;
    }

    @Override // io.realm.b8
    public void realmSet$permissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @Override // io.realm.b8
    public void realmSet$preferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @Override // io.realm.b8
    public void realmSet$profile(Profile profile) {
        this.profile = profile;
    }

    @Override // io.realm.b8
    public void realmSet$purchased(Purchases purchases) {
        this.purchased = purchases;
    }

    @Override // io.realm.b8
    public void realmSet$questAchievements(x0 x0Var) {
        this.questAchievements = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$stats(Stats stats) {
        this.stats = stats;
    }

    @Override // io.realm.b8
    public void realmSet$streakCount(int i10) {
        this.streakCount = i10;
    }

    @Override // io.realm.b8
    public void realmSet$tags(x0 x0Var) {
        this.tags = x0Var;
    }

    @Override // io.realm.b8
    public void realmSet$versionNumber(int i10) {
        this.versionNumber = i10;
    }

    public final void setAbTests(x0<ABTest> x0Var) {
        realmSet$abTests(x0Var);
    }

    public final void setAchievements(x0<UserAchievement> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$achievements(x0Var);
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

    public final void setChallengeAchievements(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$challengeAchievements(x0Var);
    }

    public final void setChallenges(x0<ChallengeMembership> x0Var) {
        realmSet$challenges(x0Var);
    }

    public final void setContributor(ContributorInfo contributorInfo) {
        realmSet$contributor(contributorInfo);
    }

    public void setFlags(Flags flags) {
        realmSet$flags(flags);
    }

    public void setHourglassCount(int i10) {
        SubscriptionPlanConsecutive subscriptionPlanConsecutive;
        SubscriptionPlan plan;
        Purchases realmGet$purchased = realmGet$purchased();
        if (realmGet$purchased != null && (plan = realmGet$purchased.getPlan()) != null) {
            subscriptionPlanConsecutive = plan.getConsecutive();
        } else {
            subscriptionPlanConsecutive = null;
        }
        if (subscriptionPlanConsecutive != null) {
            subscriptionPlanConsecutive.setTrinkets(i10);
        }
    }

    public void setId(String str) {
        realmSet$id(str);
    }

    public final void setInbox(Inbox inbox) {
        realmSet$inbox(inbox);
    }

    public final void setInvitations(Invitations invitations) {
        realmSet$invitations(invitations);
    }

    public void setItems(Items items) {
        realmSet$items(items);
    }

    public final void setLastCron(Date date) {
        realmSet$lastCron(date);
    }

    public final void setLoginIncentives(int i10) {
        realmSet$loginIncentives(i10);
    }

    public final void setNeedsCron(boolean z10) {
        realmSet$needsCron(z10);
    }

    public final void setParty(UserParty userParty) {
        realmSet$party(userParty);
    }

    public final void setPermissions$Habitica_2311256681_prodRelease(Permissions permissions) {
        realmSet$permissions(permissions);
    }

    public void setPreferences(Preferences preferences) {
        realmSet$preferences(preferences);
    }

    public final void setProfile(Profile profile) {
        realmSet$profile(profile);
    }

    public final void setPurchased(Purchases purchases) {
        realmSet$purchased(purchases);
    }

    public final void setPushDevices(List<PushDevice> list) {
        this.pushDevices = list;
    }

    public final void setQuestAchievements(x0<QuestAchievement> x0Var) {
        q.i(x0Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        realmSet$questAchievements(x0Var);
        Iterator<E> it = realmGet$questAchievements().iterator();
        while (it.hasNext()) {
            ((QuestAchievement) it.next()).setUserID(getId());
        }
    }

    public void setStats(Stats stats) {
        realmSet$stats(stats);
    }

    public final void setStreakCount(int i10) {
        realmSet$streakCount(i10);
    }

    public final void setTags(x0<Tag> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$tags(x0Var);
    }

    public final void setTasks(TaskList taskList) {
        this.tasks = taskList;
    }

    public final void setTasksOrder(TasksOrder tasksOrder) {
        this.tasksOrder = tasksOrder;
    }

    @Override // com.habitrpg.android.habitica.models.VersionedObject
    public void setVersionNumber(int i10) {
        realmSet$versionNumber(i10);
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Authentication getAuthentication() {
        return realmGet$authentication();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Flags getFlags() {
        return realmGet$flags();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Items getItems() {
        return realmGet$items();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Preferences getPreferences() {
        return realmGet$preferences();
    }

    @Override // com.habitrpg.shared.habitica.models.Avatar
    public Stats getStats() {
        return realmGet$stats();
    }
}
