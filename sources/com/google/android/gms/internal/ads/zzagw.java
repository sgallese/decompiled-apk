package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagw {
    public final zzace zza;
    public zzahj zzd;
    public zzags zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private boolean zzl;
    public final zzahi zzb = new zzahi();
    public final zzfb zzc = new zzfb();
    private final zzfb zzj = new zzfb(1);
    private final zzfb zzk = new zzfb();

    public zzagw(zzace zzaceVar, zzahj zzahjVar, zzags zzagsVar) {
        this.zza = zzaceVar;
        this.zzd = zzahjVar;
        this.zze = zzagsVar;
        zzh(zzahjVar, zzagsVar);
    }

    public final int zza() {
        int i10;
        if (!this.zzl) {
            i10 = this.zzd.zzg[this.zzf];
        } else if (this.zzb.zzj[this.zzf]) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (zzf() != null) {
            return i10 | 1073741824;
        }
        return i10;
    }

    public final int zzb() {
        if (!this.zzl) {
            return this.zzd.zzd[this.zzf];
        }
        return this.zzb.zzh[this.zzf];
    }

    public final int zzc(int i10, int i11) {
        zzfb zzfbVar;
        boolean z10;
        int i12;
        zzahh zzf = zzf();
        if (zzf == null) {
            return 0;
        }
        int i13 = zzf.zzd;
        if (i13 != 0) {
            zzfbVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzf.zze;
            int i14 = zzfk.zza;
            zzfb zzfbVar2 = this.zzk;
            int length = bArr.length;
            zzfbVar2.zzE(bArr, length);
            zzfbVar = this.zzk;
            i13 = length;
        }
        boolean zzb = this.zzb.zzb(this.zzf);
        if (!zzb && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        zzfb zzfbVar3 = this.zzj;
        byte[] zzI = zzfbVar3.zzI();
        if (true != z10) {
            i12 = 0;
        } else {
            i12 = 128;
        }
        zzI[0] = (byte) (i12 | i13);
        zzfbVar3.zzG(0);
        this.zza.zzr(this.zzj, 1, 1);
        this.zza.zzr(zzfbVar, i13, 1);
        if (!z10) {
            return i13 + 1;
        }
        if (!zzb) {
            this.zzc.zzD(8);
            zzfb zzfbVar4 = this.zzc;
            byte[] zzI2 = zzfbVar4.zzI();
            zzI2[0] = 0;
            zzI2[1] = 1;
            zzI2[2] = 0;
            zzI2[3] = (byte) i11;
            zzI2[4] = (byte) ((i10 >> 24) & 255);
            zzI2[5] = (byte) ((i10 >> 16) & 255);
            zzI2[6] = (byte) ((i10 >> 8) & 255);
            zzI2[7] = (byte) (i10 & 255);
            this.zza.zzr(zzfbVar4, 8, 1);
            return i13 + 9;
        }
        zzfb zzfbVar5 = this.zzb.zzn;
        int zzp = zzfbVar5.zzp();
        zzfbVar5.zzH(-2);
        int i15 = (zzp * 6) + 2;
        if (i11 != 0) {
            this.zzc.zzD(i15);
            byte[] zzI3 = this.zzc.zzI();
            zzfbVar5.zzC(zzI3, 0, i15);
            int i16 = (((zzI3[2] & 255) << 8) | (zzI3[3] & 255)) + i11;
            zzI3[2] = (byte) ((i16 >> 8) & 255);
            zzI3[3] = (byte) (i16 & 255);
            zzfbVar5 = this.zzc;
        }
        this.zza.zzr(zzfbVar5, i15, 1);
        return i13 + 1 + i15;
    }

    public final long zzd() {
        if (!this.zzl) {
            return this.zzd.zzc[this.zzf];
        }
        return this.zzb.zzf[this.zzh];
    }

    public final long zze() {
        if (!this.zzl) {
            return this.zzd.zzf[this.zzf];
        }
        zzahi zzahiVar = this.zzb;
        return zzahiVar.zzi[this.zzf];
    }

    public final zzahh zzf() {
        if (!this.zzl) {
            return null;
        }
        zzahi zzahiVar = this.zzb;
        zzags zzagsVar = zzahiVar.zza;
        int i10 = zzfk.zza;
        int i11 = zzagsVar.zza;
        zzahh zzahhVar = zzahiVar.zzm;
        if (zzahhVar == null) {
            zzahhVar = this.zzd.zza.zza(i11);
        }
        if (zzahhVar == null || !zzahhVar.zza) {
            return null;
        }
        return zzahhVar;
    }

    public final void zzh(zzahj zzahjVar, zzags zzagsVar) {
        this.zzd = zzahjVar;
        this.zze = zzagsVar;
        this.zza.zzk(zzahjVar.zza.zzf);
        zzi();
    }

    public final void zzi() {
        zzahi zzahiVar = this.zzb;
        zzahiVar.zzd = 0;
        zzahiVar.zzp = 0L;
        zzahiVar.zzq = false;
        zzahiVar.zzk = false;
        zzahiVar.zzo = false;
        zzahiVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzl = false;
    }

    public final boolean zzk() {
        this.zzf++;
        if (!this.zzl) {
            return false;
        }
        int i10 = this.zzg + 1;
        this.zzg = i10;
        int[] iArr = this.zzb.zzg;
        int i11 = this.zzh;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.zzh = i11 + 1;
        this.zzg = 0;
        return false;
    }
}
