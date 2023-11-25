package com.habitrpg.android.habitica.models.social;

import com.habitrpg.android.habitica.models.BaseMainObject;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.tasks.TasksOrder;
import io.realm.a1;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.r4;
import java.util.Date;
import qc.h;
import qc.q;

/* compiled from: Challenge.kt */
/* loaded from: classes4.dex */
public class Challenge extends d1 implements BaseMainObject, r4 {
    public static final String TASK_ORDER_DAILYS = "dailys";
    public static final String TASK_ORDER_HABITS = "habits";
    public static final String TASK_ORDER_REWARDS = "rewards";
    public static final String TASK_ORDER_TODOS = "todos";
    private Date createdAt;
    private String dailyList;
    private String description;
    private Group group;
    private String groupId;
    private String groupName;
    private String habitList;

    /* renamed from: id  reason: collision with root package name */
    private String f12516id;
    private User leader;
    private String leaderId;
    private String leaderName;
    private int memberCount;
    private String name;
    private boolean official;
    private int prize;
    private String rewardList;
    private String shortName;
    private String summary;
    private TasksOrder tasksOrder;
    private String todoList;
    private Date updatedAt;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Challenge.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public Challenge() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (q.d(cls, Challenge.class) && realmGet$id() != null) {
            String realmGet$id = realmGet$id();
            q.g(obj, "null cannot be cast to non-null type com.habitrpg.android.habitica.models.social.Challenge");
            return q.d(realmGet$id, ((Challenge) obj).realmGet$id());
        }
        return super.equals(obj);
    }

    public final Date getCreatedAt() {
        return realmGet$createdAt();
    }

    public final String getDailyList() {
        return realmGet$dailyList();
    }

    public final String getDescription() {
        return realmGet$description();
    }

    public final Group getGroup() {
        return realmGet$group();
    }

    public final String getGroupId() {
        return realmGet$groupId();
    }

    public final String getGroupName() {
        return realmGet$groupName();
    }

    public final String getHabitList() {
        return realmGet$habitList();
    }

    public final String getId() {
        return realmGet$id();
    }

    public final User getLeader() {
        return realmGet$leader();
    }

    public final String getLeaderId() {
        return realmGet$leaderId();
    }

    public final String getLeaderName() {
        return realmGet$leaderName();
    }

    public final int getMemberCount() {
        return realmGet$memberCount();
    }

    public final String getName() {
        return realmGet$name();
    }

    public final boolean getOfficial() {
        return realmGet$official();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifier() {
        return realmGet$id();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public String getPrimaryIdentifierName() {
        return "id";
    }

    public final int getPrize() {
        return realmGet$prize();
    }

    @Override // com.habitrpg.android.habitica.models.BaseMainObject
    public Class<? extends a1> getRealmClass() {
        return Challenge.class;
    }

    public final String getRewardList() {
        return realmGet$rewardList();
    }

    public final String getShortName() {
        return realmGet$shortName();
    }

    public final String getSummary() {
        return realmGet$summary();
    }

    public final TasksOrder getTasksOrder() {
        return this.tasksOrder;
    }

    public final String getTodoList() {
        return realmGet$todoList();
    }

    public final Date getUpdatedAt() {
        return realmGet$updatedAt();
    }

    public int hashCode() {
        String realmGet$id = realmGet$id();
        if (realmGet$id != null) {
            return realmGet$id.hashCode();
        }
        return 0;
    }

    @Override // io.realm.r4
    public Date realmGet$createdAt() {
        return this.createdAt;
    }

    @Override // io.realm.r4
    public String realmGet$dailyList() {
        return this.dailyList;
    }

    @Override // io.realm.r4
    public String realmGet$description() {
        return this.description;
    }

    @Override // io.realm.r4
    public Group realmGet$group() {
        return this.group;
    }

    @Override // io.realm.r4
    public String realmGet$groupId() {
        return this.groupId;
    }

    @Override // io.realm.r4
    public String realmGet$groupName() {
        return this.groupName;
    }

    @Override // io.realm.r4
    public String realmGet$habitList() {
        return this.habitList;
    }

    @Override // io.realm.r4
    public String realmGet$id() {
        return this.f12516id;
    }

    @Override // io.realm.r4
    public User realmGet$leader() {
        return this.leader;
    }

    @Override // io.realm.r4
    public String realmGet$leaderId() {
        return this.leaderId;
    }

    @Override // io.realm.r4
    public String realmGet$leaderName() {
        return this.leaderName;
    }

    @Override // io.realm.r4
    public int realmGet$memberCount() {
        return this.memberCount;
    }

    @Override // io.realm.r4
    public String realmGet$name() {
        return this.name;
    }

    @Override // io.realm.r4
    public boolean realmGet$official() {
        return this.official;
    }

    @Override // io.realm.r4
    public int realmGet$prize() {
        return this.prize;
    }

    @Override // io.realm.r4
    public String realmGet$rewardList() {
        return this.rewardList;
    }

    @Override // io.realm.r4
    public String realmGet$shortName() {
        return this.shortName;
    }

    @Override // io.realm.r4
    public String realmGet$summary() {
        return this.summary;
    }

    @Override // io.realm.r4
    public String realmGet$todoList() {
        return this.todoList;
    }

    @Override // io.realm.r4
    public Date realmGet$updatedAt() {
        return this.updatedAt;
    }

    @Override // io.realm.r4
    public void realmSet$createdAt(Date date) {
        this.createdAt = date;
    }

    @Override // io.realm.r4
    public void realmSet$dailyList(String str) {
        this.dailyList = str;
    }

    @Override // io.realm.r4
    public void realmSet$description(String str) {
        this.description = str;
    }

    @Override // io.realm.r4
    public void realmSet$group(Group group) {
        this.group = group;
    }

    @Override // io.realm.r4
    public void realmSet$groupId(String str) {
        this.groupId = str;
    }

    @Override // io.realm.r4
    public void realmSet$groupName(String str) {
        this.groupName = str;
    }

    @Override // io.realm.r4
    public void realmSet$habitList(String str) {
        this.habitList = str;
    }

    @Override // io.realm.r4
    public void realmSet$id(String str) {
        this.f12516id = str;
    }

    @Override // io.realm.r4
    public void realmSet$leader(User user) {
        this.leader = user;
    }

    @Override // io.realm.r4
    public void realmSet$leaderId(String str) {
        this.leaderId = str;
    }

    @Override // io.realm.r4
    public void realmSet$leaderName(String str) {
        this.leaderName = str;
    }

    @Override // io.realm.r4
    public void realmSet$memberCount(int i10) {
        this.memberCount = i10;
    }

    @Override // io.realm.r4
    public void realmSet$name(String str) {
        this.name = str;
    }

    @Override // io.realm.r4
    public void realmSet$official(boolean z10) {
        this.official = z10;
    }

    @Override // io.realm.r4
    public void realmSet$prize(int i10) {
        this.prize = i10;
    }

    @Override // io.realm.r4
    public void realmSet$rewardList(String str) {
        this.rewardList = str;
    }

    @Override // io.realm.r4
    public void realmSet$shortName(String str) {
        this.shortName = str;
    }

    @Override // io.realm.r4
    public void realmSet$summary(String str) {
        this.summary = str;
    }

    @Override // io.realm.r4
    public void realmSet$todoList(String str) {
        this.todoList = str;
    }

    @Override // io.realm.r4
    public void realmSet$updatedAt(Date date) {
        this.updatedAt = date;
    }

    public final void setCreatedAt(Date date) {
        realmSet$createdAt(date);
    }

    public final void setDailyList(String str) {
        realmSet$dailyList(str);
    }

    public final void setDescription(String str) {
        realmSet$description(str);
    }

    public final void setGroup(Group group) {
        realmSet$group(group);
    }

    public final void setGroupId(String str) {
        realmSet$groupId(str);
    }

    public final void setGroupName(String str) {
        realmSet$groupName(str);
    }

    public final void setHabitList(String str) {
        realmSet$habitList(str);
    }

    public final void setId(String str) {
        realmSet$id(str);
    }

    public final void setLeader(User user) {
        realmSet$leader(user);
    }

    public final void setLeaderId(String str) {
        realmSet$leaderId(str);
    }

    public final void setLeaderName(String str) {
        realmSet$leaderName(str);
    }

    public final void setMemberCount(int i10) {
        realmSet$memberCount(i10);
    }

    public final void setName(String str) {
        realmSet$name(str);
    }

    public final void setOfficial(boolean z10) {
        realmSet$official(z10);
    }

    public final void setPrize(int i10) {
        realmSet$prize(i10);
    }

    public final void setRewardList(String str) {
        realmSet$rewardList(str);
    }

    public final void setShortName(String str) {
        realmSet$shortName(str);
    }

    public final void setSummary(String str) {
        realmSet$summary(str);
    }

    public final void setTasksOrder(TasksOrder tasksOrder) {
        this.tasksOrder = tasksOrder;
    }

    public final void setTodoList(String str) {
        realmSet$todoList(str);
    }

    public final void setUpdatedAt(Date date) {
        realmSet$updatedAt(date);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0165  */
    /* renamed from: getTasksOrder  reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String[]> m15getTasksOrder() {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.models.social.Challenge.m15getTasksOrder():java.util.HashMap");
    }
}
