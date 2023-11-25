package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdil {
    zzbfx zza;
    zzbfu zzb;
    zzbgk zzc;
    zzbgh zzd;
    zzblj zze;
    final androidx.collection.g zzf = new androidx.collection.g();
    final androidx.collection.g zzg = new androidx.collection.g();

    public final zzdil zza(zzbfu zzbfuVar) {
        this.zzb = zzbfuVar;
        return this;
    }

    public final zzdil zzb(zzbfx zzbfxVar) {
        this.zza = zzbfxVar;
        return this;
    }

    public final zzdil zzc(String str, zzbgd zzbgdVar, zzbga zzbgaVar) {
        this.zzf.put(str, zzbgdVar);
        if (zzbgaVar != null) {
            this.zzg.put(str, zzbgaVar);
        }
        return this;
    }

    public final zzdil zzd(zzblj zzbljVar) {
        this.zze = zzbljVar;
        return this;
    }

    public final zzdil zze(zzbgh zzbghVar) {
        this.zzd = zzbghVar;
        return this;
    }

    public final zzdil zzf(zzbgk zzbgkVar) {
        this.zzc = zzbgkVar;
        return this;
    }

    public final zzdin zzg() {
        return new zzdin(this);
    }
}
