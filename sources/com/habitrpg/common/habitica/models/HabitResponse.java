package com.habitrpg.common.habitica.models;

import java.util.List;

/* compiled from: HabitResponse.kt */
/* loaded from: classes4.dex */
public final class HabitResponse<T> {
    private T data;
    private String message;
    private List<Notification> notifications;
    private Boolean success;

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<Notification> getNotifications() {
        return this.notifications;
    }

    public final Boolean getSuccess() {
        return this.success;
    }

    public final void setData(T t10) {
        this.data = t10;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setNotifications(List<Notification> list) {
        this.notifications = list;
    }

    public final void setSuccess(Boolean bool) {
        this.success = bool;
    }
}
