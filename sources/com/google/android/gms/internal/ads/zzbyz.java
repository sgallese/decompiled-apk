package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbyz implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcas zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbyz(zzbza zzbzaVar, Context context, zzcas zzcasVar) {
        this.zza = context;
        this.zzb = zzcasVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            this.zzb.zzd(e10);
            zzcaa.zzh("Exception while getting advertising Id info", e10);
        }
    }
}
