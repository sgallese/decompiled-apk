package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {
    private final String zza;
    private final zzcw zzb;

    public zzcx(zzcw zzcwVar) {
        String str;
        this.zzb = zzcwVar;
        try {
            str = zzcwVar.zze();
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
            str = null;
        }
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.zza;
    }

    public final String toString() {
        return this.zza;
    }

    public final zzcw zza() {
        return this.zzb;
    }
}
