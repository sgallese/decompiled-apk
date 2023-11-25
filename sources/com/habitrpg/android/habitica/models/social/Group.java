package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.user.SubscriptionPlan;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import fa.c;
import io.realm.b5;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.x0;
import qc.h;
import qc.q;

/* compiled from: Group.kt */
/* loaded from: classes4.dex */
public class Group extends d1 implements BaseMainObject, b5 {
    public static final String TAVERN_ID = "00000000-0000-4000-A000-000000000000";
    private double balance;
    private x0<GroupCategory> categories;
    private int challengeCount;
    private String description;
    @c("_id")

    /* renamed from: id  reason: collision with root package name */
    private String f12520id;
    private String leaderID;
    private String leaderMessage;
    private String leaderName;
    private boolean leaderOnlyChallenges;
    private boolean leaderOnlyGetGems;
    private String logo;
    private x0<String> managers;
    private int memberCount;
    private String name;
    private String privacy;
    private SubscriptionPlan purchased;
    private Quest quest;
    private String summary;
    private TasksOrder tasksOrder;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Group.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Group() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$id("");
    }

    public final boolean canManageManagers(String str) {
        q.i(str, "userID");
        return isLeader(str);
    }

    public boolean equals(Object obj) {
        Group group;
        if (this == obj) {
            return true;
        }
        String str = null;
        if (obj instanceof Group) {
            group = (Group) obj;
        } else {
            group = null;
        }
        String realmGet$id = realmGet$id();
        if (group != null) {
            str = group.realmGet$id();
        }
        return q.d(realmGet$id, str);
    }

    public final double getBalance() {
        return realmGet$balance();
    }

    public final x0<GroupCategory> getCategories() {
        return realmGet$categories();
    }

    public final int getChallengeCount() {
        return realmGet$challengeCount();
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final int getGemCount() {
        return (int) (realmGet$balance() * 4.0d);
    }

    public final boolean getHasActiveQuest() {
        Quest realmGet$quest = realmGet$quest();
        if (realmGet$quest != null) {
            return realmGet$quest.getActive();
        }
        return false;
    }

    public final String getId() {
        return realmGet$id();
    }

    public final String getLeaderID() {
        return realmGet$leaderID();
    }

    public final String getLeaderMessage() {
        return realmGet$leaderMessage();
    }

    public final String getLeaderName() {
        return realmGet$leaderName();
    }

    public final boolean getLeaderOnlyChallenges() {
        return realmGet$leaderOnlyChallenges();
    }

    public final boolean getLeaderOnlyGetGems() {
        return realmGet$leaderOnlyGetGems();
    }

    public final String getLogo() {
        return realmGet$logo();
    }

    public final x0<String> getManagers() {
        return realmGet$managers();
    }

    public final int getMemberCount() {
        return realmGet$memberCount();
    }

    public final String getName() {
        return realmGet$name();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    public final String getPrivacy() {
        return realmGet$privacy();
    }

    public final SubscriptionPlan getPurchased() {
        return realmGet$purchased();
    }

    public final Quest getQuest() {
        return realmGet$quest();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<Group> getRealmClass() {
        return Group.class;
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final TasksOrder getTasksOrder() {
        return this.tasksOrder;
    }

    public final String getType() {
        return realmGet$type();
    }

    public final boolean hasTaskEditPrivileges(String str) {
        q.i(str, "userID");
        if (isLeader(str)) {
            return true;
        }
        return isManager(str);
    }

    public int hashCode() {
        return realmGet$id().hashCode();
    }

    public final boolean isGroupPlan() {
        SubscriptionPlan realmGet$purchased = realmGet$purchased();
        if (realmGet$purchased == null || !realmGet$purchased.isActive()) {
            return false;
        }
        return true;
    }

    public final boolean isLeader(String str) {
        q.i(str, "userID");
        return q.d(realmGet$leaderID(), str);
    }

    public final boolean isManager(String str) {
        q.i(str, "userID");
        x0 realmGet$managers = realmGet$managers();
        if (realmGet$managers == null || !realmGet$managers.contains(str)) {
            return false;
        }
        return true;
    }

    @Override // io.realm.b5
    public double realmGet$balance() {
        return this.balance;
    }

    @Override // io.realm.b5
    public x0 realmGet$categories() {
        return this.categories;
    }

    @Override // io.realm.b5
    public int realmGet$challengeCount() {
        return this.challengeCount;
    }

    @Override // io.realm.b5
    public String realmGet$description() {
        return this.description;
    }

    @Override // io.realm.b5
    public String realmGet$id() {
        return this.f12520id;
    }

    @Override // io.realm.b5
    public String realmGet$leaderID() {
        return this.leaderID;
    }

    @Override // io.realm.b5
    public String realmGet$leaderMessage() {
        return this.leaderMessage;
    }

    @Override // io.realm.b5
    public String realmGet$leaderName() {
        return this.leaderName;
    }

    @Override // io.realm.b5
    public boolean realmGet$leaderOnlyChallenges() {
        return this.leaderOnlyChallenges;
    }

    @Override // io.realm.b5
    public boolean realmGet$leaderOnlyGetGems() {
        return this.leaderOnlyGetGems;
    }

    @Override // io.realm.b5
    public String realmGet$logo() {
        return this.logo;
    }

    @Override // io.realm.b5
    public x0 realmGet$managers() {
        return this.managers;
    }

    @Override // io.realm.b5
    public int realmGet$memberCount() {
        return this.memberCount;
    }

    @Override // io.realm.b5
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.b5
    public String realmGet$privacy() {
        return this.privacy;
    }

    @Override // io.realm.b5
    public SubscriptionPlan realmGet$purchased() {
        return this.purchased;
    }

    @Override // io.realm.b5
    public Quest realmGet$quest() {
        return this.quest;
    }

    @Override // io.realm.b5
    public String realmGet$summary() {
        return this.summary;
    }

    @Override // io.realm.b5
    public String realmGet$type() {
        return this.type;
    }

    @Override // io.realm.b5
    public void realmSet$balance(double d10) {
        this.balance = d10;
    }

    @Override // io.realm.b5
    public void realmSet$categories(x0 x0Var) {
        this.categories = x0Var;
    }

    @Override // io.realm.b5
    public void realmSet$challengeCount(int i10) {
        this.challengeCount = i10;
    }

    @Override // io.realm.b5
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // io.realm.b5
    public void realmSet$id(String str) {
        this.f12520id = str;
    }

    @Override // io.realm.b5
    public void realmSet$leaderID(String str) {
        this.leaderID = str;
    }

    @Override // io.realm.b5
    public void realmSet$leaderMessage(String str) {
        this.leaderMessage = str;
    }

    @Override // io.realm.b5
    public void realmSet$leaderName(String str) {
        this.leaderName = str;
    }

    @Override // io.realm.b5
    public void realmSet$leaderOnlyChallenges(boolean z10) {
        this.leaderOnlyChallenges = z10;
    }

    @Override // io.realm.b5
    public void realmSet$leaderOnlyGetGems(boolean z10) {
        this.leaderOnlyGetGems = z10;
    }

    @Override // io.realm.b5
    public void realmSet$logo(String str) {
        this.logo = str;
    }

    @Override // io.realm.b5
    public void realmSet$managers(x0 x0Var) {
        this.managers = x0Var;
    }

    @Override // io.realm.b5
    public void realmSet$memberCount(int i10) {
        this.memberCount = i10;
    }

    @Override // io.realm.b5
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.b5
    public void realmSet$privacy(String str) {
        this.privacy = str;
    }

    @Override // io.realm.b5
    public void realmSet$purchased(SubscriptionPlan subscriptionPlan) {
        this.purchased = subscriptionPlan;
    }

    @Override // io.realm.b5
    public void realmSet$quest(Quest quest) {
        this.quest = quest;
    }

    @Override // io.realm.b5
    public void realmSet$summary(String str) {
        this.summary = str;
    }

    @Override // io.realm.b5
    public void realmSet$type(String str) {
        this.type = str;
    }

    public final void setBalance(double d10) {
        realmSet$balance(d10);
    }

    public final void setCategories(x0<GroupCategory> x0Var) {
        realmSet$categories(x0Var);
    }

    public final void setChallengeCount(int i10) {
        realmSet$challengeCount(i10);
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final void setId(String str) {
        q.i(str, "<set-?>");
        realmSet$id(str);
    }

    public final void setLeaderID(String str) {
        realmSet$leaderID(str);
    }

    public final void setLeaderMessage(String str) {
        realmSet$leaderMessage(str);
    }

    public final void setLeaderName(String str) {
        realmSet$leaderName(str);
    }

    public final void setLeaderOnlyChallenges(boolean z10) {
        realmSet$leaderOnlyChallenges(z10);
    }

    public final void setLeaderOnlyGetGems(boolean z10) {
        realmSet$leaderOnlyGetGems(z10);
    }

    public final void setLogo(String str) {
        realmSet$logo(str);
    }

    public final void setManagers(x0<String> x0Var) {
        realmSet$managers(x0Var);
    }

    public final void setMemberCount(int i10) {
        realmSet$memberCount(i10);
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final void setPrivacy(String str) {
        realmSet$privacy(str);
    }

    public final void setPurchased(SubscriptionPlan subscriptionPlan) {
        realmSet$purchased(subscriptionPlan);
    }

    public final void setQuest(Quest quest) {
        realmSet$quest(quest);
    }

    public final void setSummary(String str) {
        realmSet$summary(str);
    }

    public final void setTasksOrder(TasksOrder tasksOrder) {
        this.tasksOrder = tasksOrder;
    }

    public final void setType(String str) {
        realmSet$type(str);
    }
}
