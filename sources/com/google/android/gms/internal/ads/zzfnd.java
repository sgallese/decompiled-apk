package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfnd {
    final /* synthetic */ zzfne zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfnd(zzfne zzfneVar, byte[] bArr, zzfnc zzfncVar) {
        this.zza = zzfneVar;
        this.zzb = bArr;
    }

    public final zzfnd zza(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzfnd zzb(int i10) {
        this.zzc = i10;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfne zzfneVar = this.zza;
            if (zzfneVar.zzb) {
                zzfneVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e10) {
            Log.d("GASS", "Clearcut log failed", e10);
        }
    }
}
