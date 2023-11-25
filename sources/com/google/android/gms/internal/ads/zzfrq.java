package com.google.android.gms.internal.ads;

import com.google.android.gms.wearable.WearableStatusCodes;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfrq extends zzfrt {
    final /* synthetic */ zzfrr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfrq(zzfrr zzfrrVar, zzfrv zzfrvVar, CharSequence charSequence) {
        super(zzfrvVar, charSequence);
        this.zza = zzfrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final int zzd(int i10) {
        int length = ((zzfrt) this).zzb.length();
        int i11 = i10 + WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
        if (i11 < length) {
            return i11;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final int zzc(int i10) {
        return i10;
    }
}
