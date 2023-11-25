package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import androidx.core.util.i;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.MessageClient;
import com.google.android.gms.wearable.MessageOptions;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzgo extends MessageClient {
    public static final /* synthetic */ int zzb = 0;
    final zzgd zza;

    public zzgo(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zza = new zzgd();
    }

    private final Task zza(final MessageClient.OnMessageReceivedListener onMessageReceivedListener, final IntentFilter[] intentFilterArr) {
        final ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzgi
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzs(new zzif((TaskCompletionSource) obj2), MessageClient.OnMessageReceivedListener.this, createListenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzgj
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzA(new zzie((TaskCompletionSource) obj2), MessageClient.OnMessageReceivedListener.this);
            }
        }).setMethodKey(24016).build());
    }

    private final Task zzb(final MessageClient.RpcService rpcService, final IntentFilter[] intentFilterArr) {
        final ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(rpcService, getLooper(), "RequestListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzgf
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzt(new zzif((TaskCompletionSource) obj2), MessageClient.RpcService.this, createListenerHolder, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzgg
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzB(new zzie((TaskCompletionSource) obj2), MessageClient.RpcService.this);
            }
        }).setMethodKey(24017).build());
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return zza(onMessageReceivedListener, new IntentFilter[]{zzih.zza("com.google.android.gms.wearable.MESSAGE_RECEIVED")});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addRpcService(MessageClient.RpcService rpcService, String str) {
        i.h(str, "pathPrefix must not be null");
        return zzb(rpcService, new IntentFilter[]{zzih.zzb(MessageClient.ACTION_REQUEST_RECEIVED, new Uri.Builder().scheme(PutDataRequest.WEAR_URI_SCHEME).authority("*").path(str).build(), 1)});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Boolean> removeListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener) {
        return doUnregisterEventListener((ListenerHolder.ListenerKey) i.h(ListenerHolders.createListenerHolder(onMessageReceivedListener, getLooper(), "MessageListener").getListenerKey(), "Key must not be null"), 24007);
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Boolean> removeRpcService(MessageClient.RpcService rpcService) {
        return doUnregisterEventListener((ListenerHolder.ListenerKey) i.h(ListenerHolders.createListenerHolder(rpcService, getLooper(), "RequestListener").getListenerKey(), "Key must not be null"), 24008);
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Integer> sendMessage(String str, String str2, byte[] bArr) {
        zzgd zzgdVar = this.zza;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzfy(zzgdVar, asGoogleApiClient, str, str2, bArr)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzgh
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return Integer.valueOf(((MessageApi.SendMessageResult) result).getRequestId());
            }
        });
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<byte[]> sendRequest(final String str, final String str2, final byte[] bArr) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzge
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzgo zzgoVar = zzgo.this;
                ((zzft) ((zzjj) obj).getService()).zzB(new zzjd(new zzgm(zzgoVar, (TaskCompletionSource) obj2)), str, str2, bArr);
            }
        }).setMethodKey(24006).build());
    }

    public zzgo(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zza = new zzgd();
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addListener(MessageClient.OnMessageReceivedListener onMessageReceivedListener, Uri uri, int i10) {
        boolean z10;
        i.h(uri, "uri must not be null");
        if (i10 != 0) {
            if (i10 != 1) {
                z10 = false;
                Preconditions.checkArgument(z10, "invalid filter type");
                return zza(onMessageReceivedListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i10)});
            }
            i10 = 1;
        }
        z10 = true;
        Preconditions.checkArgument(z10, "invalid filter type");
        return zza(onMessageReceivedListener, new IntentFilter[]{zzih.zzb("com.google.android.gms.wearable.MESSAGE_RECEIVED", uri, i10)});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Void> addRpcService(MessageClient.RpcService rpcService, String str, String str2) {
        i.h(str, "pathPrefix must not be null");
        return zzb(rpcService, new IntentFilter[]{zzih.zzb(MessageClient.ACTION_REQUEST_RECEIVED, new Uri.Builder().scheme(PutDataRequest.WEAR_URI_SCHEME).authority(str2).path(str).build(), 1)});
    }

    @Override // com.google.android.gms.wearable.MessageClient
    public final Task<Integer> sendMessage(final String str, final String str2, final byte[] bArr, final MessageOptions messageOptions) {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzgk
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzgo zzgoVar = zzgo.this;
                ((zzft) ((zzjj) obj).getService()).zzA(new zzjc(new zzgl(zzgoVar, (TaskCompletionSource) obj2)), str, str2, bArr, messageOptions);
            }
        }).setMethodKey(24020).setFeatures(com.google.android.gms.wearable.zzj.zzs).build());
    }
}
