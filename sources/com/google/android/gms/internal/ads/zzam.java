package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzam {
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    private int zzan;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbz zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzad zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzs zzy;
    public final int zzz;
    private static final zzam zzG = new zzam(new zzak());
    private static final String zzH = Integer.toString(0, 36);
    private static final String zzI = Integer.toString(1, 36);
    private static final String zzJ = Integer.toString(2, 36);
    private static final String zzK = Integer.toString(3, 36);
    private static final String zzL = Integer.toString(4, 36);
    private static final String zzM = Integer.toString(5, 36);
    private static final String zzN = Integer.toString(6, 36);
    private static final String zzO = Integer.toString(7, 36);
    private static final String zzP = Integer.toString(8, 36);
    private static final String zzQ = Integer.toString(9, 36);
    private static final String zzR = Integer.toString(10, 36);
    private static final String zzS = Integer.toString(11, 36);
    private static final String zzT = Integer.toString(12, 36);
    private static final String zzU = Integer.toString(13, 36);
    private static final String zzV = Integer.toString(14, 36);
    private static final String zzW = Integer.toString(15, 36);
    private static final String zzX = Integer.toString(16, 36);
    private static final String zzY = Integer.toString(17, 36);
    private static final String zzZ = Integer.toString(18, 36);
    private static final String zzaa = Integer.toString(19, 36);
    private static final String zzab = Integer.toString(20, 36);
    private static final String zzac = Integer.toString(21, 36);
    private static final String zzad = Integer.toString(22, 36);
    private static final String zzae = Integer.toString(23, 36);
    private static final String zzaf = Integer.toString(24, 36);
    private static final String zzag = Integer.toString(25, 36);
    private static final String zzah = Integer.toString(26, 36);
    private static final String zzai = Integer.toString(27, 36);
    private static final String zzaj = Integer.toString(28, 36);
    private static final String zzak = Integer.toString(29, 36);
    private static final String zzal = Integer.toString(30, 36);
    private static final String zzam = Integer.toString(31, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzai
    };

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzam.class == obj.getClass()) {
            zzam zzamVar = (zzam) obj;
            int i11 = this.zzan;
            if ((i11 == 0 || (i10 = zzamVar.zzan) == 0 || i11 == i10) && this.zze == zzamVar.zze && this.zzg == zzamVar.zzg && this.zzh == zzamVar.zzh && this.zzn == zzamVar.zzn && this.zzq == zzamVar.zzq && this.zzr == zzamVar.zzr && this.zzs == zzamVar.zzs && this.zzu == zzamVar.zzu && this.zzx == zzamVar.zzx && this.zzz == zzamVar.zzz && this.zzA == zzamVar.zzA && this.zzB == zzamVar.zzB && this.zzC == zzamVar.zzC && this.zzD == zzamVar.zzD && this.zzE == zzamVar.zzE && this.zzF == zzamVar.zzF && Float.compare(this.zzt, zzamVar.zzt) == 0 && Float.compare(this.zzv, zzamVar.zzv) == 0 && zzfk.zzD(this.zzb, zzamVar.zzb) && zzfk.zzD(this.zzc, zzamVar.zzc) && zzfk.zzD(this.zzj, zzamVar.zzj) && zzfk.zzD(this.zzl, zzamVar.zzl) && zzfk.zzD(this.zzm, zzamVar.zzm) && zzfk.zzD(this.zzd, zzamVar.zzd) && Arrays.equals(this.zzw, zzamVar.zzw) && zzfk.zzD(this.zzk, zzamVar.zzk) && zzfk.zzD(this.zzy, zzamVar.zzy) && zzfk.zzD(this.zzp, zzamVar.zzp) && zzd(zzamVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i11 = this.zzan;
        if (i11 == 0) {
            String str = this.zzb;
            int i12 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            String str2 = this.zzc;
            if (str2 != null) {
                i10 = str2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = hashCode + 527;
            String str3 = this.zzd;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i14 = (((((((((i13 * 31) + i10) * 31) + hashCode2) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh;
            String str4 = this.zzj;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i15 = ((i14 * 31) + hashCode3) * 31;
            zzbz zzbzVar = this.zzk;
            if (zzbzVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = zzbzVar.hashCode();
            }
            int i16 = (i15 + hashCode4) * 31;
            String str5 = this.zzl;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            String str6 = this.zzm;
            if (str6 != null) {
                i12 = str6.hashCode();
            }
            int floatToIntBits = ((((((((((((((((((((((((((((((((((i17 + i12) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31) + Float.floatToIntBits(this.zzt)) * 31) + this.zzu) * 31) + Float.floatToIntBits(this.zzv)) * 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) - 1) * 31) - 1) * 31) + this.zzF;
            this.zzan = floatToIntBits;
            return floatToIntBits;
        }
        return i11;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + ", " + String.valueOf(this.zzy) + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i10;
        int i11 = this.zzr;
        if (i11 == -1 || (i10 = this.zzs) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final zzak zzb() {
        return new zzak(this, null);
    }

    public final zzam zzc(int i10) {
        zzak zzakVar = new zzak(this, null);
        zzakVar.zzA(i10);
        return new zzam(zzakVar);
    }

    public final boolean zzd(zzam zzamVar) {
        if (this.zzo.size() != zzamVar.zzo.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.zzo.size(); i10++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i10), (byte[]) zzamVar.zzo.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzam(zzak zzakVar) {
        this.zzb = zzak.zzac(zzakVar);
        this.zzc = zzak.zzad(zzakVar);
        this.zzd = zzfk.zzA(zzak.zzae(zzakVar));
        this.zze = zzak.zzo(zzakVar);
        this.zzf = 0;
        int zzd = zzak.zzd(zzakVar);
        this.zzg = zzd;
        int zzl = zzak.zzl(zzakVar);
        this.zzh = zzl;
        this.zzi = zzl != -1 ? zzl : zzd;
        this.zzj = zzak.zzaa(zzakVar);
        this.zzk = zzak.zzZ(zzakVar);
        this.zzl = zzak.zzab(zzakVar);
        this.zzm = zzak.zzaf(zzakVar);
        this.zzn = zzak.zzj(zzakVar);
        this.zzo = zzak.zzag(zzakVar) == null ? Collections.emptyList() : zzak.zzag(zzakVar);
        zzad zzt = zzak.zzt(zzakVar);
        this.zzp = zzt;
        this.zzq = zzak.zzr(zzakVar);
        this.zzr = zzak.zzq(zzakVar);
        this.zzs = zzak.zzi(zzakVar);
        this.zzt = zzak.zza(zzakVar);
        this.zzu = zzak.zzm(zzakVar) == -1 ? 0 : zzak.zzm(zzakVar);
        this.zzv = zzak.zzb(zzakVar) == -1.0f ? 1.0f : zzak.zzb(zzakVar);
        this.zzw = zzak.zzah(zzakVar);
        this.zzx = zzak.zzp(zzakVar);
        this.zzy = zzak.zzs(zzakVar);
        this.zzz = zzak.zze(zzakVar);
        this.zzA = zzak.zzn(zzakVar);
        this.zzB = zzak.zzk(zzakVar);
        this.zzC = zzak.zzg(zzakVar) == -1 ? 0 : zzak.zzg(zzakVar);
        this.zzD = zzak.zzh(zzakVar) != -1 ? zzak.zzh(zzakVar) : 0;
        this.zzE = zzak.zzc(zzakVar);
        this.zzF = (zzak.zzf(zzakVar) != 0 || zzt == null) ? zzak.zzf(zzakVar) : 1;
    }
}
