package com.habitrpg.android.habitica.data.implementation;

import com.habitrpg.android.habitica.models.inventory.Quest;
import com.habitrpg.android.habitica.models.inventory.QuestProgress;
import com.habitrpg.android.habitica.models.social.UserParty;
import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.tasks.TaskGroupPlan;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionData;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionDataDrop;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionDataQuest;
import com.habitrpg.shared.habitica.models.responses.TaskDirectionDataTemp;
import com.habitrpg.shared.habitica.models.tasks.TaskType;
import dc.w;
import io.realm.o0;
import io.realm.x0;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import pc.l;
import qc.q;
import qc.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TaskRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class TaskRepositoryImpl$handleTaskResponse$1 extends r implements l<o0, w> {
    final /* synthetic */ float $localDelta;
    final /* synthetic */ TaskDirectionData $res;
    final /* synthetic */ Task $task;
    final /* synthetic */ boolean $up;
    final /* synthetic */ User $user;
    final /* synthetic */ TaskRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskRepositoryImpl$handleTaskResponse$1(TaskRepositoryImpl taskRepositoryImpl, Task task, User user, float f10, TaskDirectionData taskDirectionData, boolean z10) {
        super(1);
        this.this$0 = taskRepositoryImpl;
        this.$task = task;
        this.$user = user;
        this.$localDelta = f10;
        this.$res = taskDirectionData;
        this.$up = z10;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(o0 o0Var) {
        invoke2(o0Var);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(o0 o0Var) {
        User user;
        TaskDirectionDataQuest quest;
        Quest quest2;
        QuestProgress progress;
        Quest quest3;
        TaskDirectionDataDrop drop;
        String key;
        String str;
        String str2;
        TaskDirectionDataDrop drop2;
        String type;
        Items items;
        x0<OwnedItem> hatchingPotions;
        Items items2;
        x0<OwnedItem> quests;
        Items items3;
        x0<OwnedItem> eggs;
        Items items4;
        x0<OwnedItem> food;
        TaskDirectionDataDrop drop3;
        String type2;
        GroupAssignedDetails groupAssignedDetails;
        x0<GroupAssignedDetails> assignedUsersDetail;
        GroupAssignedDetails groupAssignedDetails2;
        q.i(o0Var, "it");
        Task task = (Task) this.this$0.getLocalRepository().getLiveObject(this.$task);
        if (task == null || (user = (User) this.this$0.getLocalRepository().getLiveObject(this.$user)) == null) {
            return;
        }
        QuestProgress questProgress = null;
        if (task.getType() != TaskType.REWARD) {
            if (!((task.getValue() - ((double) this.$localDelta)) + ((double) this.$res.getDelta()) == task.getValue())) {
                task.setValue((task.getValue() - this.$localDelta) + this.$res.getDelta());
                TaskType taskType = TaskType.DAILY;
                if (taskType != task.getType() && TaskType.TODO != task.getType()) {
                    if (TaskType.HABIT == task.getType()) {
                        if (this.$up) {
                            Integer counterUp = task.getCounterUp();
                            task.setCounterUp(Integer.valueOf((counterUp != null ? counterUp.intValue() : 0) + 1));
                        } else {
                            Integer counterDown = task.getCounterDown();
                            task.setCounterDown(Integer.valueOf((counterDown != null ? counterDown.intValue() : 0) + 1));
                        }
                    }
                } else {
                    String currentUserID = this.this$0.getAuthenticationHandler().getCurrentUserID();
                    if (currentUserID == null) {
                        currentUserID = "";
                    }
                    task.completeForUser(currentUserID, this.$up);
                    if (taskType == task.getType()) {
                        if (this.$up) {
                            Integer streak = task.getStreak();
                            task.setStreak(Integer.valueOf((streak != null ? streak.intValue() : 0) + 1));
                        } else {
                            Integer streak2 = task.getStreak();
                            task.setStreak(Integer.valueOf((streak2 != null ? streak2.intValue() : 0) - 1));
                        }
                    }
                }
                if (task.isGroupTask()) {
                    TaskGroupPlan group = task.getGroup();
                    if (group == null || (assignedUsersDetail = group.getAssignedUsersDetail()) == null) {
                        groupAssignedDetails = null;
                    } else {
                        User user2 = this.$user;
                        Iterator<GroupAssignedDetails> it = assignedUsersDetail.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                groupAssignedDetails2 = null;
                                break;
                            }
                            groupAssignedDetails2 = it.next();
                            if (q.d(groupAssignedDetails2.getAssignedUserID(), user2.getId())) {
                                break;
                            }
                        }
                        groupAssignedDetails = groupAssignedDetails2;
                    }
                    if (groupAssignedDetails != null) {
                        groupAssignedDetails.setCompleted(this.$up);
                    }
                    if (this.$up) {
                        if (groupAssignedDetails != null) {
                            groupAssignedDetails.setCompletedDate(new Date());
                        }
                    } else if (groupAssignedDetails != null) {
                        groupAssignedDetails.setCompletedDate(null);
                    }
                }
            }
        }
        TaskDirectionDataTemp taskDirectionDataTemp = this.$res.get_tmp();
        if (taskDirectionDataTemp != null && (drop = taskDirectionDataTemp.getDrop()) != null && (key = drop.getKey()) != null) {
            TaskDirectionData taskDirectionData = this.$res;
            User user3 = this.$user;
            TaskDirectionDataTemp taskDirectionDataTemp2 = taskDirectionData.get_tmp();
            if (taskDirectionDataTemp2 == null || (drop3 = taskDirectionDataTemp2.getDrop()) == null || (type2 = drop3.getType()) == null) {
                str = null;
            } else {
                Locale locale = Locale.US;
                q.h(locale, "US");
                str = type2.toLowerCase(locale);
                q.h(str, "this as java.lang.String).toLowerCase(locale)");
            }
            if (q.d(str, "hatchingpotion")) {
                str2 = "hatchingPotions";
            } else if (q.d(str, "egg")) {
                str2 = "eggs";
            } else {
                TaskDirectionDataTemp taskDirectionDataTemp3 = taskDirectionData.get_tmp();
                if (taskDirectionDataTemp3 == null || (drop2 = taskDirectionDataTemp3.getDrop()) == null || (type = drop2.getType()) == null) {
                    str2 = null;
                } else {
                    Locale locale2 = Locale.US;
                    q.h(locale2, "US");
                    str2 = type.toLowerCase(locale2);
                    q.h(str2, "this as java.lang.String).toLowerCase(locale)");
                }
            }
            OwnedItem ownedItem = (OwnedItem) o0Var.k1(OwnedItem.class).n("itemType", str2).n("key", key).q();
            if (ownedItem == null) {
                ownedItem = new OwnedItem();
                ownedItem.setKey(key);
                ownedItem.setItemType(str2);
                ownedItem.setUserID(user3.getId());
                if (str2 != null) {
                    switch (str2.hashCode()) {
                        case -1623737538:
                            if (str2.equals("hatchingPotions") && (items = user.getItems()) != null && (hatchingPotions = items.getHatchingPotions()) != null) {
                                hatchingPotions.add(ownedItem);
                                break;
                            }
                            break;
                        case -948698159:
                            if (str2.equals("quests") && (items2 = user.getItems()) != null && (quests = items2.getQuests()) != null) {
                                quests.add(ownedItem);
                                break;
                            }
                            break;
                        case 3111182:
                            if (str2.equals("eggs") && (items3 = user.getItems()) != null && (eggs = items3.getEggs()) != null) {
                                eggs.add(ownedItem);
                                break;
                            }
                            break;
                        case 3148894:
                            if (str2.equals("food") && (items4 = user.getItems()) != null && (food = items4.getFood()) != null) {
                                food.add(ownedItem);
                                break;
                            }
                            break;
                    }
                }
            }
            ownedItem.setNumberOwned(ownedItem.getNumberOwned() + 1);
        }
        Stats stats = user.getStats();
        if (stats != null) {
            stats.setHp(Double.valueOf(this.$res.getHp()));
        }
        Stats stats2 = user.getStats();
        if (stats2 != null) {
            stats2.setExp(Double.valueOf(this.$res.getExp()));
        }
        Stats stats3 = user.getStats();
        if (stats3 != null) {
            stats3.setMp(Double.valueOf(this.$res.getMp()));
        }
        Stats stats4 = user.getStats();
        if (stats4 != null) {
            stats4.setGp(Double.valueOf(this.$res.getGp()));
        }
        Stats stats5 = user.getStats();
        if (stats5 != null) {
            stats5.setLvl(Integer.valueOf(this.$res.getLvl()));
        }
        UserParty party = user.getParty();
        if (party != null && (quest3 = party.getQuest()) != null) {
            questProgress = quest3.getProgress();
        }
        if (questProgress == null) {
            return;
        }
        UserParty party2 = user.getParty();
        float f10 = 0.0f;
        float up = (party2 == null || (quest2 = party2.getQuest()) == null || (progress = quest2.getProgress()) == null) ? 0.0f : progress.getUp();
        TaskDirectionDataTemp taskDirectionDataTemp4 = this.$res.get_tmp();
        if (taskDirectionDataTemp4 != null && (quest = taskDirectionDataTemp4.getQuest()) != null) {
            f10 = (float) quest.getProgressDelta();
        }
        questProgress.setUp(up + f10);
    }
}
