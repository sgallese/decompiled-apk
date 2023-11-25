package com.habitrpg.android.habitica.models.tasks;

import com.habitrpg.android.habitica.models.BaseObject;
import io.realm.d1;
import io.realm.internal.o;
import io.realm.l5;
import java.util.Date;

/* compiled from: TaskGroupPlan.kt */
/* loaded from: classes4.dex */
public class GroupAssignedDetails extends d1 implements BaseObject, l5 {
    public static final int $stable = 8;
    private Date assignedDate;
    private String assignedUserID;
    private String assignedUsername;
    private String assigningUsername;
    private boolean completed;
    private Date completedDate;

    public GroupAssignedDetails() {
        if (this instanceof o) {
            ((o) this).a();
        }
    }

    public final Date getAssignedDate() {
        return realmGet$assignedDate();
    }

    public final String getAssignedUserID() {
        return realmGet$assignedUserID();
    }

    public final String getAssignedUsername() {
        return realmGet$assignedUsername();
    }

    public final String getAssigningUsername() {
        return realmGet$assigningUsername();
    }

    public final boolean getCompleted() {
        return realmGet$completed();
    }

    public final Date getCompletedDate() {
        return realmGet$completedDate();
    }

    @Override // io.realm.l5
    public Date realmGet$assignedDate() {
        return this.assignedDate;
    }

    @Override // io.realm.l5
    public String realmGet$assignedUserID() {
        return this.assignedUserID;
    }

    @Override // io.realm.l5
    public String realmGet$assignedUsername() {
        return this.assignedUsername;
    }

    @Override // io.realm.l5
    public String realmGet$assigningUsername() {
        return this.assigningUsername;
    }

    @Override // io.realm.l5
    public boolean realmGet$completed() {
        return this.completed;
    }

    @Override // io.realm.l5
    public Date realmGet$completedDate() {
        return this.completedDate;
    }

    @Override // io.realm.l5
    public void realmSet$assignedDate(Date date) {
        this.assignedDate = date;
    }

    @Override // io.realm.l5
    public void realmSet$assignedUserID(String str) {
        this.assignedUserID = str;
    }

    @Override // io.realm.l5
    public void realmSet$assignedUsername(String str) {
        this.assignedUsername = str;
    }

    @Override // io.realm.l5
    public void realmSet$assigningUsername(String str) {
        this.assigningUsername = str;
    }

    @Override // io.realm.l5
    public void realmSet$completed(boolean z10) {
        this.completed = z10;
    }

    @Override // io.realm.l5
    public void realmSet$completedDate(Date date) {
        this.completedDate = date;
    }

    public final void setAssignedDate(Date date) {
        realmSet$assignedDate(date);
    }

    public final void setAssignedUserID(String str) {
        realmSet$assignedUserID(str);
    }

    public final void setAssignedUsername(String str) {
        realmSet$assignedUsername(str);
    }

    public final void setAssigningUsername(String str) {
        realmSet$assigningUsername(str);
    }

    public final void setCompleted(boolean z10) {
        realmSet$completed(z10);
    }

    public final void setCompletedDate(Date date) {
        realmSet$completedDate(date);
    }
}
