package com.habitrpg.android.habitica.helpers;

import android.content.Context;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.common.habitica.models.Notification;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: NotificationsManager.kt */
/* loaded from: classes4.dex */
public interface NotificationsManager {
    void dismissTaskNotification(Context context, Task task);

    WeakReference<ApiClient> getApiClient();

    dd.g<Notification> getDisplayNotificationEvents();

    Notification getNotification(String str);

    dd.g<List<Notification>> getNotifications();

    void setApiClient(WeakReference<ApiClient> weakReference);

    void setNotifications(List<Notification> list);
}
