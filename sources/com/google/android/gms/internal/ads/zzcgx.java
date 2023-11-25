package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcgx {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgx(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcgx zza() {
        return new zzcgx(0, 0, 0);
    }

    public static zzcgx zzb(int i10, int i11) {
        return new zzcgx(1, i10, i11);
    }

    public static zzcgx zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzcgx(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzcgx(2, 0, 0);
        }
        if (zzqVar.zzh) {
            return zza();
        }
        return zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcgx zzd() {
        return new zzcgx(5, 0, 0);
    }

    public static zzcgx zze() {
        return new zzcgx(4, 0, 0);
    }

    public final boolean zzf() {
        if (this.zzc == 0) {
            return true;
        }
        return false;
    }

    public final boolean zzg() {
        if (this.zzc == 2) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (this.zzc == 5) {
            return true;
        }
        return false;
    }

    public final boolean zzi() {
        if (this.zzc == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzj() {
        if (this.zzc == 4) {
            return true;
        }
        return false;
    }
}
