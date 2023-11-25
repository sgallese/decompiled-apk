package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawl implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzawm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawl(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzawp zzawpVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzawm zzawmVar = this.zza;
            zzawpVar = zzawmVar.zzd;
            if (zzawpVar != null) {
                zzawmVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
