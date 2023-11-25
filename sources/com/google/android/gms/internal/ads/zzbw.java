package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzbw {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbw(zzbw zzbwVar) {
        this.zza = zzbwVar.zza;
        this.zzb = zzbwVar.zzb;
        this.zzc = zzbwVar.zzc;
        this.zzd = zzbwVar.zzd;
        this.zze = zzbwVar.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbw)) {
            return false;
        }
        zzbw zzbwVar = (zzbw) obj;
        if (this.zza.equals(zzbwVar.zza) && this.zzb == zzbwVar.zzb && this.zzc == zzbwVar.zzc && this.zzd == zzbwVar.zzd && this.zze == zzbwVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbw zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzbw(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        if (this.zzb != -1) {
            return true;
        }
        return false;
    }

    private zzbw(Object obj, int i10, int i11, long j10, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = i12;
    }

    public zzbw(Object obj, int i10, int i11, long j10) {
        this(obj, i10, i11, j10, -1);
    }

    public zzbw(Object obj, long j10) {
        this(obj, -1, -1, j10, -1);
    }

    public zzbw(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
