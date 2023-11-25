package com.habitrpg.android.habitica.models.tasks;

import com.habitrpg.android.habitica.models.BaseObject;
import fa.c;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.o5;
import io.realm.x0;
import java.util.Date;
import java.util.Iterator;
import qc.q;

/* compiled from: TaskGroupPlan.kt */
/* loaded from: classes4.dex */
public class TaskGroupPlan extends d1 implements BaseObject, o5 {
    public static final int $stable = 8;
    private Boolean approvalApproved;
    private Boolean approvalRequested;
    private Boolean approvalRequired;
    private Date assignedDate;
    private x0<String> assignedUsers;
    private x0<GroupAssignedDetails> assignedUsersDetail;
    private String assigningUsername;
    @c("id")
    private String groupID;
    private String managerNotes;
    private String sharedCompletion;

    public TaskGroupPlan() {
        if (this instanceof o) {
            ((o) this).a();
        }
        realmSet$assignedUsers(new x0());
        realmSet$assignedUsersDetail(new x0());
        Boolean bool = Boolean.FALSE;
        realmSet$approvalRequested(bool);
        realmSet$approvalApproved(bool);
        realmSet$approvalRequired(bool);
    }

    public final GroupAssignedDetails assignedDetailsFor(String str) {
        Object obj;
        q.i(str, "userID");
        Iterator<E> it = realmGet$assignedUsersDetail().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (q.d(((GroupAssignedDetails) obj).getAssignedUserID(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (GroupAssignedDetails) obj;
    }

    public final Boolean getApprovalApproved() {
        return realmGet$approvalApproved();
    }

    public final Boolean getApprovalRequested() {
        return realmGet$approvalRequested();
    }

    public final Boolean getApprovalRequired() {
        return realmGet$approvalRequired();
    }

    public final Date getAssignedDate() {
        return realmGet$assignedDate();
    }

    public final x0<String> getAssignedUsers() {
        return realmGet$assignedUsers();
    }

    public final x0<GroupAssignedDetails> getAssignedUsersDetail() {
        return realmGet$assignedUsersDetail();
    }

    public final String getAssigningUsername() {
        return realmGet$assigningUsername();
    }

    public final String getGroupID() {
        return realmGet$groupID();
    }

    public final String getManagerNotes() {
        return realmGet$managerNotes();
    }

    public final String getSharedCompletion() {
        return realmGet$sharedCompletion();
    }

    @Override // io.realm.o5
    public Boolean realmGet$approvalApproved() {
        return this.approvalApproved;
    }

    @Override // io.realm.o5
    public Boolean realmGet$approvalRequested() {
        return this.approvalRequested;
    }

    @Override // io.realm.o5
    public Boolean realmGet$approvalRequired() {
        return this.approvalRequired;
    }

    @Override // io.realm.o5
    public Date realmGet$assignedDate() {
        return this.assignedDate;
    }

    @Override // io.realm.o5
    public x0 realmGet$assignedUsers() {
        return this.assignedUsers;
    }

    @Override // io.realm.o5
    public x0 realmGet$assignedUsersDetail() {
        return this.assignedUsersDetail;
    }

    @Override // io.realm.o5
    public String realmGet$assigningUsername() {
        return this.assigningUsername;
    }

    @Override // io.realm.o5
    public String realmGet$groupID() {
        return this.groupID;
    }

    @Override // io.realm.o5
    public String realmGet$managerNotes() {
        return this.managerNotes;
    }

    @Override // io.realm.o5
    public String realmGet$sharedCompletion() {
        return this.sharedCompletion;
    }

    @Override // io.realm.o5
    public void realmSet$approvalApproved(Boolean bool) {
        this.approvalApproved = bool;
    }

    @Override // io.realm.o5
    public void realmSet$approvalRequested(Boolean bool) {
        this.approvalRequested = bool;
    }

    @Override // io.realm.o5
    public void realmSet$approvalRequired(Boolean bool) {
        this.approvalRequired = bool;
    }

    @Override // io.realm.o5
    public void realmSet$assignedDate(Date date) {
        this.assignedDate = date;
    }

    @Override // io.realm.o5
    public void realmSet$assignedUsers(x0 x0Var) {
        this.assignedUsers = x0Var;
    }

    @Override // io.realm.o5
    public void realmSet$assignedUsersDetail(x0 x0Var) {
        this.assignedUsersDetail = x0Var;
    }

    @Override // io.realm.o5
    public void realmSet$assigningUsername(String str) {
        this.assigningUsername = str;
    }

    @Override // io.realm.o5
    public void realmSet$groupID(String str) {
        this.groupID = str;
    }

    @Override // io.realm.o5
    public void realmSet$managerNotes(String str) {
        this.managerNotes = str;
    }

    @Override // io.realm.o5
    public void realmSet$sharedCompletion(String str) {
        this.sharedCompletion = str;
    }

    public final void setApprovalApproved(Boolean bool) {
        realmSet$approvalApproved(bool);
    }

    public final void setApprovalRequested(Boolean bool) {
        realmSet$approvalRequested(bool);
    }

    public final void setApprovalRequired(Boolean bool) {
        realmSet$approvalRequired(bool);
    }

    public final void setAssignedDate(Date date) {
        realmSet$assignedDate(date);
    }

    public final void setAssignedUsers(x0<String> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$assignedUsers(x0Var);
    }

    public final void setAssignedUsersDetail(x0<GroupAssignedDetails> x0Var) {
        q.i(x0Var, "<set-?>");
        realmSet$assignedUsersDetail(x0Var);
    }

    public final void setAssigningUsername(String str) {
        realmSet$assigningUsername(str);
    }

    public final void setGroupID(String str) {
        realmSet$groupID(str);
    }

    public final void setManagerNotes(String str) {
        realmSet$managerNotes(str);
    }

    public final void setSharedCompletion(String str) {
        realmSet$sharedCompletion(str);
    }
}
