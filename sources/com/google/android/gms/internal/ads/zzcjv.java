package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcjv {
    private zzchg zza;
    private zzcli zzb;
    private zzfgi zzc;
    private zzclu zzd;
    private zzfdc zze;

    private zzcjv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcjv(zzcju zzcjuVar) {
    }

    public final zzchd zza() {
        zzgzb.zzc(this.zza, zzchg.class);
        zzgzb.zzc(this.zzb, zzcli.class);
        if (this.zzc == null) {
            this.zzc = new zzfgi();
        }
        if (this.zzd == null) {
            this.zzd = new zzclu();
        }
        if (this.zze == null) {
            this.zze = new zzfdc();
        }
        return new zzciz(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcjv zzb(zzchg zzchgVar) {
        this.zza = zzchgVar;
        return this;
    }

    public final zzcjv zzc(zzcli zzcliVar) {
        this.zzb = zzcliVar;
        return this;
    }
}
