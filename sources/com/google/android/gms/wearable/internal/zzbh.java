package com.google.android.gms.wearable.internal;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzbh extends ChannelClient {
    public static final /* synthetic */ int zza = 0;
    private final zzay zzb;

    public zzbh(Activity activity, GoogleApi.Settings settings) {
        super(activity, settings);
        this.zzb = new zzay();
    }

    public static /* bridge */ /* synthetic */ zzbu zzb(Channel channel) {
        return zzd(channel);
    }

    private static zzbu zzc(ChannelClient.Channel channel) {
        Preconditions.checkNotNull(channel, "channel must not be null");
        return (zzbu) channel;
    }

    public static zzbu zzd(Channel channel) {
        Preconditions.checkNotNull(channel, "channel must not be null");
        return (zzbu) channel;
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(ChannelClient.Channel channel) {
        zzbu zzc = zzc(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzbl(zzc, asGoogleApiClient)));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<InputStream> getInputStream(ChannelClient.Channel channel) {
        zzbu zzc = zzc(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzbn(zzc, asGoogleApiClient)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzba
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return ((Channel.GetInputStreamResult) result).getInputStream();
            }
        });
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<OutputStream> getOutputStream(ChannelClient.Channel channel) {
        zzbu zzc = zzc(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzbo(zzc, asGoogleApiClient)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzbf
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                return ((Channel.GetOutputStreamResult) result).getOutputStream();
            }
        });
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<ChannelClient.Channel> openChannel(String str, String str2) {
        zzay zzayVar = this.zzb;
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Preconditions.checkNotNull(asGoogleApiClient, "client is null");
        Preconditions.checkNotNull(str, "nodeId is null");
        Preconditions.checkNotNull(str2, "path is null");
        return PendingResultUtil.toTask(asGoogleApiClient.enqueue(new zzau(zzayVar, asGoogleApiClient, str, str2)), new PendingResultUtil.ResultConverter() { // from class: com.google.android.gms.wearable.internal.zzaz
            @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
            public final Object convert(Result result) {
                ChannelClient.Channel zzd;
                zzd = zzbh.zzd(((ChannelApi.OpenChannelResult) result).getChannel());
                return zzd;
            }
        });
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> receiveFile(ChannelClient.Channel channel, Uri uri, boolean z10) {
        zzbu zzc = zzc(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        Preconditions.checkNotNull(asGoogleApiClient, "client is null");
        Preconditions.checkNotNull(uri, "uri is null");
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzbp(zzc, asGoogleApiClient, uri, z10)));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(ChannelClient.Channel channel, ChannelClient.ChannelCallback channelCallback) {
        final String zzb = ((zzbu) channel).zzb();
        Preconditions.checkNotNull(channelCallback, "listener is null");
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener:".concat(String.valueOf(zzb)));
        final IntentFilter[] intentFilterArr = {zzih.zza("com.google.android.gms.wearable.CHANNEL_EVENT")};
        final zzbg zzbgVar = new zzbg(channelCallback);
        final ListenerHolder createListenerHolder2 = ListenerHolders.createListenerHolder(zzbgVar, getLooper(), "ChannelListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbd
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzq(new zzif((TaskCompletionSource) obj2), zzbg.this, createListenerHolder2, zzb, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbe
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzy(new zzie((TaskCompletionSource) obj2), zzbg.this, zzb);
            }
        }).setMethodKey(24014).build());
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(ChannelClient.Channel channel, Uri uri) {
        return PendingResultUtil.toVoidTask(zzc(channel).sendFile(asGoogleApiClient(), uri, 0L, -1L));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(ChannelClient.Channel channel, ChannelClient.ChannelCallback channelCallback) {
        return doUnregisterEventListener((ListenerHolder.ListenerKey) Preconditions.checkNotNull(ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener:".concat(String.valueOf(zzc(channel).zzb()))).getListenerKey(), "Key must not be null"), 24004);
    }

    public zzbh(Context context, GoogleApi.Settings settings) {
        super(context, settings);
        this.zzb = new zzay();
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> close(ChannelClient.Channel channel, int i10) {
        zzbu zzc = zzc(channel);
        GoogleApiClient asGoogleApiClient = asGoogleApiClient();
        return PendingResultUtil.toVoidTask(asGoogleApiClient.enqueue(new zzbm(zzc, asGoogleApiClient, i10)));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> sendFile(ChannelClient.Channel channel, Uri uri, long j10, long j11) {
        return PendingResultUtil.toVoidTask(zzc(channel).sendFile(asGoogleApiClient(), uri, j10, j11));
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Boolean> unregisterChannelCallback(ChannelClient.ChannelCallback channelCallback) {
        return doUnregisterEventListener((ListenerHolder.ListenerKey) Preconditions.checkNotNull(ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener").getListenerKey(), "Key must not be null"), 24004);
    }

    @Override // com.google.android.gms.wearable.ChannelClient
    public final Task<Void> registerChannelCallback(ChannelClient.ChannelCallback channelCallback) {
        Preconditions.checkNotNull(channelCallback, "listener is null");
        ListenerHolder createListenerHolder = ListenerHolders.createListenerHolder(channelCallback, getLooper(), "ChannelListener");
        final IntentFilter[] intentFilterArr = {zzih.zza("com.google.android.gms.wearable.CHANNEL_EVENT")};
        final zzbg zzbgVar = new zzbg(channelCallback);
        final ListenerHolder createListenerHolder2 = ListenerHolders.createListenerHolder(zzbgVar, getLooper(), "ChannelListener");
        return doRegisterEventListener(RegistrationMethods.builder().withHolder(createListenerHolder).register(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbb
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzq(new zzif((TaskCompletionSource) obj2), zzbg.this, createListenerHolder2, null, intentFilterArr);
            }
        }).unregister(new RemoteCall() { // from class: com.google.android.gms.wearable.internal.zzbc
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((zzjj) obj).zzy(new zzie((TaskCompletionSource) obj2), zzbg.this, null);
            }
        }).setMethodKey(24014).build());
    }
}
