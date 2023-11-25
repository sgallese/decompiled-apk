package com.habitrpg.common.habitica.models.notifications;

/* compiled from: ItemReceivedData.kt */
/* loaded from: classes4.dex */
public class ItemReceivedData implements NotificationData {
    private String destination;
    private String icon;
    private String text;
    private String title;

    public final String getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDestination(String str) {
        this.destination = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
