package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.ChannelApi;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzaw implements ChannelApi.OpenChannelResult {
    private final Status zza;
    private final Channel zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(Status status, Channel channel) {
        this.zza = (Status) Preconditions.checkNotNull(status);
        this.zzb = channel;
    }

    @Override // com.google.android.gms.wearable.ChannelApi.OpenChannelResult
    public final Channel getChannel() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zza;
    }
}
