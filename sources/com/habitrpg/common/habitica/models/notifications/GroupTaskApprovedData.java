package com.habitrpg.common.habitica.models.notifications;

import qc.q;

/* compiled from: GroupTaskApprovedData.kt */
/* loaded from: classes4.dex */
public class GroupTaskApprovedData implements NotificationData {
    private String groupId = "";
    private String message;

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setGroupId(String str) {
        q.i(str, "<set-?>");
        this.groupId = str;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
