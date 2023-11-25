package com.habitrpg.common.habitica.models.notifications;

/* compiled from: GroupTaskNeedsWorkData.kt */
/* loaded from: classes4.dex */
public class GroupTaskNeedsWorkData implements NotificationData {
    private NotificationGroup group;
    private String message;

    public final NotificationGroup getGroup() {
        return this.group;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setGroup(NotificationGroup notificationGroup) {
        this.group = notificationGroup;
    }

    public final void setMessage(String str) {
        this.message = str;
    }
}
