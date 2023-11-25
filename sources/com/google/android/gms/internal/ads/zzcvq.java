package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcvq {
    private Context zza;
    private zzfca zzb;
    private Bundle zzc;
    private zzfbs zzd;
    private zzcvk zze;
    private zzeds zzf;

    public final zzcvq zzd(zzeds zzedsVar) {
        this.zzf = zzedsVar;
        return this;
    }

    public final zzcvq zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcvq zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcvq zzg(zzcvk zzcvkVar) {
        this.zze = zzcvkVar;
        return this;
    }

    public final zzcvq zzh(zzfbs zzfbsVar) {
        this.zzd = zzfbsVar;
        return this;
    }

    public final zzcvq zzi(zzfca zzfcaVar) {
        this.zzb = zzfcaVar;
        return this;
    }

    public final zzcvs zzj() {
        return new zzcvs(this, null);
    }
}
