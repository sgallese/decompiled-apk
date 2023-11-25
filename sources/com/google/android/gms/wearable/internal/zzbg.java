package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;
import com.google.android.gms.wearable.ChannelClient;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzbg implements ChannelApi.ChannelListener {
    private final ChannelClient.ChannelCallback zza;

    public zzbg(ChannelClient.ChannelCallback channelCallback) {
        this.zza = channelCallback;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbg.class == obj.getClass()) {
            return this.zza.equals(((zzbg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelClosed(Channel channel, int i10, int i11) {
        this.zza.onChannelClosed(zzbh.zzb(channel), i10, i11);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onChannelOpened(Channel channel) {
        this.zza.onChannelOpened(zzbh.zzb(channel));
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onInputClosed(Channel channel, int i10, int i11) {
        this.zza.onInputClosed(zzbh.zzb(channel), i10, i11);
    }

    @Override // com.google.android.gms.wearable.ChannelApi.ChannelListener
    public final void onOutputClosed(Channel channel, int i10, int i11) {
        this.zza.onOutputClosed(zzbh.zzb(channel), i10, i11);
    }
}
