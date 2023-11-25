package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zztl extends zztg {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zztl(zzcw zzcwVar, Object obj, Object obj2) {
        super(zzcwVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zztl zzq(zzbp zzbpVar) {
        return new zztl(new zztm(zzbpVar), zzcv.zza, zzd);
    }

    public static zztl zzr(zzcw zzcwVar, Object obj, Object obj2) {
        return new zztl(zzcwVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        Object obj2;
        zzcw zzcwVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcwVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        this.zzc.zzd(i10, zzctVar, z10);
        if (zzfk.zzD(zzctVar.zzc, this.zzf) && z10) {
            zzctVar.zzc = zzd;
        }
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        this.zzc.zze(i10, zzcvVar, j10);
        if (zzfk.zzD(zzcvVar.zzc, this.zze)) {
            zzcvVar.zzc = zzcv.zza;
        }
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zztg, com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        Object zzf = this.zzc.zzf(i10);
        if (zzfk.zzD(zzf, this.zzf)) {
            return zzd;
        }
        return zzf;
    }

    public final zztl zzp(zzcw zzcwVar) {
        return new zztl(zzcwVar, this.zze, this.zzf);
    }
}
