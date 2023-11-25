package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzawm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawk(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzawp zzawpVar;
        zzawp zzawpVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzawm zzawmVar = this.zza;
                zzawpVar = zzawmVar.zzd;
                if (zzawpVar != null) {
                    zzawpVar2 = zzawmVar.zzd;
                    zzawmVar.zzf = zzawpVar2.zzq();
                }
            } catch (DeadObjectException e10) {
                zzcaa.zzh("Unable to obtain a cache service instance.", e10);
                zzawm.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
