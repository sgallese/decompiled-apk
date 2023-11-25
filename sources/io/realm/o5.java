package io.realm;

import com.habitrpg.android.habitica.models.tasks.GroupAssignedDetails;
import java.util.Date;

/* compiled from: com_habitrpg_android_habitica_models_tasks_TaskGroupPlanRealmProxyInterface.java */
/* loaded from: classes4.dex */
public interface o5 {
    Boolean realmGet$approvalApproved();

    Boolean realmGet$approvalRequested();

    Boolean realmGet$approvalRequired();

    Date realmGet$assignedDate();

    x0<String> realmGet$assignedUsers();

    x0<GroupAssignedDetails> realmGet$assignedUsersDetail();

    String realmGet$assigningUsername();

    String realmGet$groupID();

    String realmGet$managerNotes();

    String realmGet$sharedCompletion();

    void realmSet$approvalApproved(Boolean bool);

    void realmSet$approvalRequested(Boolean bool);

    void realmSet$approvalRequired(Boolean bool);

    void realmSet$assignedDate(Date date);

    void realmSet$assignedUsers(x0<String> x0Var);

    void realmSet$assignedUsersDetail(x0<GroupAssignedDetails> x0Var);

    void realmSet$assigningUsername(String str);

    void realmSet$groupID(String str);

    void realmSet$managerNotes(String str);

    void realmSet$sharedCompletion(String str);
}
