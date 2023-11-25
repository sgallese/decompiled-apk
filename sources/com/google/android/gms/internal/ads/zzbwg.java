package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbwg implements RewardItem {
    private final zzbvt zza;

    public zzbwg(zzbvt zzbvtVar) {
        this.zza = zzbvtVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbvt zzbvtVar = this.zza;
        if (zzbvtVar != null) {
            try {
                return zzbvtVar.zze();
            } catch (RemoteException e10) {
                zzcaa.zzk("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbvt zzbvtVar = this.zza;
        if (zzbvtVar != null) {
            try {
                return zzbvtVar.zzf();
            } catch (RemoteException e10) {
                zzcaa.zzk("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}
