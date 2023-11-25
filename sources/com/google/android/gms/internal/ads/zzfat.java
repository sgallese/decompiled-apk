package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfat implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzdd zza;
    final /* synthetic */ zzfav zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfat(zzfav zzfavVar, com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzb = zzfavVar;
        this.zza = zzddVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdnq zzdnqVar;
        zzdnqVar = this.zzb.zzi;
        if (zzdnqVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
