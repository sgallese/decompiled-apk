package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzhu extends zzcw {
    private final int zzc;
    private final zzvm zzd;

    public zzhu(boolean z10, zzvm zzvmVar) {
        this.zzd = zzvmVar;
        this.zzc = zzvmVar.zzc();
    }

    private final int zzw(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zzd(i10);
        }
        if (i10 >= this.zzc - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int zzx(int i10, boolean z10) {
        if (z10) {
            return this.zzd.zze(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zza(Object obj) {
        int zza;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        if (zzp == -1 || (zza = zzu(zzp).zza(obj3)) == -1) {
            return -1;
        }
        return zzs(zzp) + zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzct zzd(int i10, zzct zzctVar, boolean z10) {
        int zzq = zzq(i10);
        int zzt = zzt(zzq);
        zzu(zzq).zzd(i10 - zzs(zzq), zzctVar, z10);
        zzctVar.zzd += zzt;
        if (z10) {
            Object zzv = zzv(zzq);
            Object obj = zzctVar.zzc;
            obj.getClass();
            zzctVar.zzc = Pair.create(zzv, obj);
        }
        return zzctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzcv zze(int i10, zzcv zzcvVar, long j10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzs = zzs(zzr);
        zzu(zzr).zze(i10 - zzt, zzcvVar, j10);
        Object zzv = zzv(zzr);
        if (!zzcv.zza.equals(zzcvVar.zzc)) {
            zzv = Pair.create(zzv, zzcvVar.zzc);
        }
        zzcvVar.zzc = zzv;
        zzcvVar.zzp += zzs;
        zzcvVar.zzq += zzs;
        return zzcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final Object zzf(int i10) {
        int zzq = zzq(i10);
        return Pair.create(zzv(zzq), zzu(zzq).zzf(i10 - zzs(zzq)));
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzg(boolean z10) {
        int i10;
        if (this.zzc == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.zzd.zza();
        } else {
            i10 = 0;
        }
        while (zzu(i10).zzo()) {
            i10 = zzw(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return zzt(i10) + zzu(i10).zzg(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzh(boolean z10) {
        int i10;
        int i11 = this.zzc;
        if (i11 == 0) {
            return -1;
        }
        if (z10) {
            i10 = this.zzd.zzb();
        } else {
            i10 = i11 - 1;
        }
        while (zzu(i10).zzo()) {
            i10 = zzx(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return zzt(i10) + zzu(i10).zzh(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzj(int i10, int i11, boolean z10) {
        int i12;
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        zzcw zzu = zzu(zzr);
        int i13 = i10 - zzt;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int zzj = zzu.zzj(i13, i12, z10);
        if (zzj != -1) {
            return zzt + zzj;
        }
        int zzw = zzw(zzr, z10);
        while (zzw != -1 && zzu(zzw).zzo()) {
            zzw = zzw(zzw, z10);
        }
        if (zzw != -1) {
            return zzt(zzw) + zzu(zzw).zzg(z10);
        }
        if (i11 != 2) {
            return -1;
        }
        return zzg(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final int zzk(int i10, int i11, boolean z10) {
        int zzr = zzr(i10);
        int zzt = zzt(zzr);
        int zzk = zzu(zzr).zzk(i10 - zzt, 0, false);
        if (zzk != -1) {
            return zzt + zzk;
        }
        int zzx = zzx(zzr, false);
        while (zzx != -1 && zzu(zzx).zzo()) {
            zzx = zzx(zzx, false);
        }
        if (zzx == -1) {
            return -1;
        }
        return zzt(zzx) + zzu(zzx).zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcw
    public final zzct zzn(Object obj, zzct zzctVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int zzp = zzp(obj2);
        int zzt = zzt(zzp);
        zzu(zzp).zzn(obj3, zzctVar);
        zzctVar.zzd += zzt;
        zzctVar.zzc = obj;
        return zzctVar;
    }

    protected abstract int zzp(Object obj);

    protected abstract int zzq(int i10);

    protected abstract int zzr(int i10);

    protected abstract int zzs(int i10);

    protected abstract int zzt(int i10);

    protected abstract zzcw zzu(int i10);

    protected abstract Object zzv(int i10);
}
