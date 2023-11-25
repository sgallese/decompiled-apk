package com.habitrpg.android.habitica.receivers;

import ad.i;
import ad.l0;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.widget.Toast;
import androidx.core.app.w;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.ApiClient;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import qc.q;

/* compiled from: LocalNotificationActionReceiver.kt */
/* loaded from: classes4.dex */
public final class LocalNotificationActionReceiver extends Hilt_LocalNotificationActionReceiver {
    public static final int $stable = 8;
    public ApiClient apiClient;
    private Context context;
    private Intent intent;
    public SocialRepository socialRepository;
    public TaskRepository taskRepository;
    private User user;
    public UserRepository userRepository;

    private final String getGroupID() {
        Bundle extras;
        Intent intent = this.intent;
        if (intent != null && (extras = intent.getExtras()) != null) {
            return extras.getString("groupID");
        }
        return null;
    }

    private final String getMessageText(String str) {
        Bundle j10;
        CharSequence charSequence;
        Intent intent = this.intent;
        if (intent == null || (j10 = w.j(intent)) == null || (charSequence = j10.getCharSequence(str)) == null) {
            return null;
        }
        return charSequence.toString();
    }

    private final String getSenderID() {
        Bundle extras;
        Intent intent = this.intent;
        if (intent != null && (extras = intent.getExtras()) != null) {
            return extras.getString("senderID");
        }
        return null;
    }

    private final String getTaskID() {
        Bundle extras;
        Intent intent = this.intent;
        if (intent != null && (extras = intent.getExtras()) != null) {
            return extras.getString("taskID");
        }
        return null;
    }

    private final void handleLocalNotificationAction(String str) {
        Object obj;
        NotificationManager notificationManager;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String taskID;
        String str11;
        String str12;
        int i10;
        Bundle extras;
        Context context = this.context;
        if (context != null) {
            obj = context.getSystemService("notification");
        } else {
            obj = null;
        }
        if (obj instanceof NotificationManager) {
            notificationManager = (NotificationManager) obj;
        } else {
            notificationManager = null;
        }
        if (notificationManager != null) {
            Intent intent = this.intent;
            if (intent != null && (extras = intent.getExtras()) != null) {
                i10 = extras.getInt("NOTIFICATION_ID");
            } else {
                i10 = -1;
            }
            notificationManager.cancel(i10);
        }
        Context context2 = this.context;
        if (context2 != null) {
            str2 = context2.getString(R.string.accept_party_invite);
        } else {
            str2 = null;
        }
        if (q.d(str, str2)) {
            String groupID = getGroupID();
            if (groupID != null) {
                i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$1$1(this, groupID, null), 2, null);
                return;
            }
            return;
        }
        Context context3 = this.context;
        if (context3 != null) {
            str3 = context3.getString(R.string.reject_party_invite);
        } else {
            str3 = null;
        }
        if (q.d(str, str3)) {
            String groupID2 = getGroupID();
            if (groupID2 != null) {
                ExceptionHandlerKt.launchCatching$default(l0.b(), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$2$1(this, groupID2, null), 1, null);
                return;
            }
            return;
        }
        Context context4 = this.context;
        if (context4 != null) {
            str4 = context4.getString(R.string.accept_quest_invite);
        } else {
            str4 = null;
        }
        if (q.d(str, str4)) {
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$3(this, null), 1, null);
            return;
        }
        Context context5 = this.context;
        if (context5 != null) {
            str5 = context5.getString(R.string.reject_quest_invite);
        } else {
            str5 = null;
        }
        if (q.d(str, str5)) {
            ExceptionHandlerKt.launchCatching$default(l0.b(), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$4(this, null), 1, null);
            return;
        }
        Context context6 = this.context;
        if (context6 != null) {
            str6 = context6.getString(R.string.accept_guild_invite);
        } else {
            str6 = null;
        }
        if (q.d(str, str6)) {
            String groupID3 = getGroupID();
            if (groupID3 != null) {
                i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$5$1(this, groupID3, null), 2, null);
                return;
            }
            return;
        }
        Context context7 = this.context;
        if (context7 != null) {
            str7 = context7.getString(R.string.reject_guild_invite);
        } else {
            str7 = null;
        }
        if (q.d(str, str7)) {
            String groupID4 = getGroupID();
            if (groupID4 != null) {
                ExceptionHandlerKt.launchCatching$default(l0.b(), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$6$1(this, groupID4, null), 1, null);
                return;
            }
            return;
        }
        Context context8 = this.context;
        if (context8 != null) {
            str8 = context8.getString(R.string.group_message_reply);
        } else {
            str8 = null;
        }
        if (q.d(str, str8)) {
            String groupID5 = getGroupID();
            if (groupID5 != null) {
                Context context9 = this.context;
                if (context9 != null) {
                    str12 = context9.getString(R.string.group_message_reply);
                } else {
                    str12 = null;
                }
                String messageText = getMessageText(str12);
                if (messageText != null) {
                    ExceptionHandlerKt.launchCatching$default(l0.b(), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$7$1$1(this, groupID5, messageText, null), 1, null);
                    return;
                }
                return;
            }
            return;
        }
        Context context10 = this.context;
        if (context10 != null) {
            str9 = context10.getString(R.string.inbox_message_reply);
        } else {
            str9 = null;
        }
        if (q.d(str, str9)) {
            String senderID = getSenderID();
            if (senderID != null) {
                Context context11 = this.context;
                if (context11 != null) {
                    str11 = context11.getString(R.string.inbox_message_reply);
                } else {
                    str11 = null;
                }
                String messageText2 = getMessageText(str11);
                if (messageText2 != null) {
                    i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$8$1$1(this, senderID, messageText2, null), 2, null);
                    return;
                }
                return;
            }
            return;
        }
        Context context12 = this.context;
        if (context12 != null) {
            str10 = context12.getString(R.string.complete_task_action);
        } else {
            str10 = null;
        }
        if (q.d(str, str10) && (taskID = getTaskID()) != null) {
            i.d(l0.b(), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new LocalNotificationActionReceiver$handleLocalNotificationAction$9$1(this, taskID, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showToast(Spannable spannable) {
        Toast.makeText(this.context, spannable, 1).show();
    }

    public final ApiClient getApiClient() {
        ApiClient apiClient = this.apiClient;
        if (apiClient != null) {
            return apiClient;
        }
        q.z("apiClient");
        return null;
    }

    public final SocialRepository getSocialRepository() {
        SocialRepository socialRepository = this.socialRepository;
        if (socialRepository != null) {
            return socialRepository;
        }
        q.z("socialRepository");
        return null;
    }

    public final TaskRepository getTaskRepository() {
        TaskRepository taskRepository = this.taskRepository;
        if (taskRepository != null) {
            return taskRepository;
        }
        q.z("taskRepository");
        return null;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    @Override // com.habitrpg.android.habitica.receivers.Hilt_LocalNotificationActionReceiver, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        q.i(context, "context");
        q.i(intent, "intent");
        this.intent = intent;
        this.context = context;
        handleLocalNotificationAction(intent.getAction());
    }

    public final void setApiClient(ApiClient apiClient) {
        q.i(apiClient, "<set-?>");
        this.apiClient = apiClient;
    }

    public final void setSocialRepository(SocialRepository socialRepository) {
        q.i(socialRepository, "<set-?>");
        this.socialRepository = socialRepository;
    }

    public final void setTaskRepository(TaskRepository taskRepository) {
        q.i(taskRepository, "<set-?>");
        this.taskRepository = taskRepository;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }
}
