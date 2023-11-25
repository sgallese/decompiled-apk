package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfba implements OnAdMetadataChangedListener {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzby zza;
    final /* synthetic */ zzfbb zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfba(zzfbb zzfbbVar, com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        this.zzb = zzfbbVar;
        this.zza = zzbyVar;
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzdnq zzdnqVar;
        zzdnqVar = this.zzb.zzd;
        if (zzdnqVar != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e10) {
                zzcaa.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
