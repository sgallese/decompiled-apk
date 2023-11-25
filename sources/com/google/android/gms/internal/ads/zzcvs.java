package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvs {
    private final Context zza;
    private final zzfca zzb;
    private final Bundle zzc;
    private final zzfbs zzd;
    private final zzcvk zze;
    private final zzeds zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcvs(zzcvq zzcvqVar, zzcvr zzcvrVar) {
        this.zza = zzcvq.zza(zzcvqVar);
        this.zzb = zzcvq.zzm(zzcvqVar);
        this.zzc = zzcvq.zzb(zzcvqVar);
        this.zzd = zzcvq.zzl(zzcvqVar);
        this.zze = zzcvq.zzc(zzcvqVar);
        this.zzf = zzcvq.zzk(zzcvqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcvk zzc() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzcvq zzd() {
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(this.zza);
        zzcvqVar.zzi(this.zzb);
        zzcvqVar.zzf(this.zzc);
        zzcvqVar.zzg(this.zze);
        zzcvqVar.zzd(this.zzf);
        return zzcvqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzeds zze(String str) {
        zzeds zzedsVar = this.zzf;
        if (zzedsVar != null) {
            return zzedsVar;
        }
        return new zzeds(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfbs zzf() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfca zzg() {
        return this.zzb;
    }
}
