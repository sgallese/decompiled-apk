package com.google.android.gms.wearable;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.Wearable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class MessageClient extends GoogleApi<Wearable.WearableOptions> {
    public static final String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
    public static final String ACTION_REQUEST_RECEIVED = "com.google.android.gms.wearable.REQUEST_RECEIVED";
    public static final int FILTER_LITERAL = 0;
    public static final int FILTER_PREFIX = 1;

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface FilterType {
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    /* loaded from: classes3.dex */
    public interface OnMessageReceivedListener extends MessageApi.MessageListener {
        @Override // com.google.android.gms.wearable.MessageApi.MessageListener
        void onMessageReceived(MessageEvent messageEvent);
    }

    /* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
    /* loaded from: classes3.dex */
    public interface RpcService {
        Task<byte[]> onRequest(String str, String str2, byte[] bArr);
    }

    public MessageClient(Activity activity, GoogleApi.Settings settings) {
        super(activity, Wearable.API, Wearable.WearableOptions.zza, settings);
    }

    public abstract Task<Void> addListener(OnMessageReceivedListener onMessageReceivedListener);

    public abstract Task<Void> addListener(OnMessageReceivedListener onMessageReceivedListener, Uri uri, int i10);

    public abstract Task<Void> addRpcService(RpcService rpcService, String str);

    public abstract Task<Void> addRpcService(RpcService rpcService, String str, String str2);

    public abstract Task<Boolean> removeListener(OnMessageReceivedListener onMessageReceivedListener);

    public abstract Task<Boolean> removeRpcService(RpcService rpcService);

    public abstract Task<Integer> sendMessage(String str, String str2, byte[] bArr);

    public abstract Task<Integer> sendMessage(String str, String str2, byte[] bArr, MessageOptions messageOptions);

    public abstract Task<byte[]> sendRequest(String str, String str2, byte[] bArr);

    public MessageClient(Context context, GoogleApi.Settings settings) {
        super(context, Wearable.API, Wearable.WearableOptions.zza, settings);
    }
}
