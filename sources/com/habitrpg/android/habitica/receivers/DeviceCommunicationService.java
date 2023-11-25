package com.habitrpg.android.habitica.receivers;

import android.content.Intent;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.MessageEvent;
import com.habitrpg.android.habitica.ui.activities.LoginActivity;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.common.habitica.api.HostConfig;
import com.habitrpg.common.habitica.helpers.DeviceCommunication;
import dc.f;
import dc.h;
import qc.q;
import yc.d;

/* compiled from: DeviceCommunicationService.kt */
/* loaded from: classes4.dex */
public final class DeviceCommunicationService extends Hilt_DeviceCommunicationService {
    public static final int $stable = 8;
    public HostConfig hostConfig;
    private final f messageClient$delegate;

    public DeviceCommunicationService() {
        f b10;
        b10 = h.b(new DeviceCommunicationService$messageClient$2(this));
        this.messageClient$delegate = b10;
    }

    private final MessageClient getMessageClient() {
        return (MessageClient) this.messageClient$delegate.getValue();
    }

    private final void openActivity(MessageEvent messageEvent, Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.setFlags(268435456);
        startActivity(intent);
        getMessageClient().sendMessage(messageEvent.getSourceNodeId(), "/action_completed", null);
    }

    private final void openTaskForm(MessageEvent messageEvent) {
        byte[] data = messageEvent.getData();
        q.h(data, "getData(...)");
        String str = new String(data, d.f26303b);
        Intent intent = new Intent(this, TaskFormActivity.class);
        intent.putExtra(TaskFormActivity.TASK_ID_KEY, str);
        intent.setFlags(268435456);
        startActivity(intent);
        getMessageClient().sendMessage(messageEvent.getSourceNodeId(), "/action_completed", null);
    }

    private final void processAuthRequest(MessageEvent messageEvent) {
        MessageClient messageClient = getMessageClient();
        String sourceNodeId = messageEvent.getSourceNodeId();
        byte[] bytes = (getHostConfig().getUserID() + ":" + getHostConfig().getApiKey()).getBytes(d.f26303b);
        q.h(bytes, "this as java.lang.String).getBytes(charset)");
        messageClient.sendMessage(sourceNodeId, "/auth", bytes);
    }

    public final HostConfig getHostConfig() {
        HostConfig hostConfig = this.hostConfig;
        if (hostConfig != null) {
            return hostConfig;
        }
        q.z("hostConfig");
        return null;
    }

    @Override // com.google.android.gms.wearable.WearableListenerService, com.google.android.gms.wearable.MessageApi.MessageListener
    public void onMessageReceived(MessageEvent messageEvent) {
        q.i(messageEvent, "event");
        super.onMessageReceived(messageEvent);
        String path = messageEvent.getPath();
        switch (path.hashCode()) {
            case -1030283942:
                if (path.equals(DeviceCommunication.SHOW_TASK_EDIT)) {
                    openTaskForm(messageEvent);
                    return;
                }
                return;
            case -377961050:
                if (path.equals(DeviceCommunication.SHOW_REGISTER)) {
                    openActivity(messageEvent, LoginActivity.class);
                    return;
                }
                return;
            case 353349335:
                if (path.equals(DeviceCommunication.REQUEST_AUTH)) {
                    processAuthRequest(messageEvent);
                    return;
                }
                return;
            case 609062423:
                if (path.equals(DeviceCommunication.SHOW_RYA)) {
                    openActivity(messageEvent, MainActivity.class);
                    return;
                }
                return;
            case 1187606342:
                if (path.equals(DeviceCommunication.SHOW_LOGIN)) {
                    openActivity(messageEvent, LoginActivity.class);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void setHostConfig(HostConfig hostConfig) {
        q.i(hostConfig, "<set-?>");
        this.hostConfig = hostConfig;
    }
}
