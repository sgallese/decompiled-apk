package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.LocaleList;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzwl extends zzwz implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzwr zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;

    public zzwl(int i10, zzcy zzcyVar, int i11, zzwr zzwrVar, int i12, boolean z10, zzfrj zzfrjVar) {
        super(i10, zzcyVar, i11);
        int i13;
        int i14;
        boolean z11;
        String[] strArr;
        int i15;
        boolean z12;
        boolean z13;
        boolean z14;
        LocaleList locales;
        String languageTags;
        this.zzh = zzwrVar;
        this.zzg = zzxd.zzg(this.zzd.zzd);
        int i16 = 0;
        this.zzi = zzxd.zzn(i12, false);
        int i17 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i17 < zzwrVar.zzq.size()) {
                i14 = zzxd.zza(this.zzd, (String) zzwrVar.zzq.get(i17), false);
                if (i14 > 0) {
                    break;
                }
                i17++;
            } else {
                i17 = Integer.MAX_VALUE;
                i14 = 0;
                break;
            }
        }
        this.zzk = i17;
        this.zzj = i14;
        int i18 = this.zzd.zzf;
        this.zzl = Integer.bitCount(0);
        zzam zzamVar = this.zzd;
        int i19 = zzamVar.zzf;
        this.zzm = true;
        if (1 != (zzamVar.zze & 1)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.zzp = z11;
        this.zzq = zzamVar.zzz;
        this.zzr = zzamVar.zzA;
        this.zzs = zzamVar.zzi;
        this.zzf = zzfrjVar.zza(zzamVar);
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (zzfk.zza >= 24) {
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            strArr = languageTags.split(",", -1);
        } else {
            strArr = new String[]{zzfk.zzy(configuration.locale)};
        }
        for (int i20 = 0; i20 < strArr.length; i20++) {
            strArr[i20] = zzfk.zzA(strArr[i20]);
        }
        int i21 = 0;
        while (true) {
            if (i21 < strArr.length) {
                i15 = zzxd.zza(this.zzd, strArr[i21], false);
                if (i15 > 0) {
                    break;
                }
                i21++;
            } else {
                i21 = Integer.MAX_VALUE;
                i15 = 0;
                break;
            }
        }
        this.zzn = i21;
        this.zzo = i15;
        int i22 = 0;
        while (true) {
            if (i22 >= zzwrVar.zzu.size()) {
                break;
            }
            String str = this.zzd.zzm;
            if (str != null && str.equals(zzwrVar.zzu.get(i22))) {
                i13 = i22;
                break;
            }
            i22++;
        }
        this.zzt = i13;
        if ((i12 & 384) == 128) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.zzu = z12;
        if ((i12 & 64) == 64) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.zzv = z13;
        zzwr zzwrVar2 = this.zzh;
        if (zzxd.zzn(i12, zzwrVar2.zzR) && ((z14 = this.zzf) || zzwrVar2.zzL)) {
            i16 = (!zzxd.zzn(i12, false) || !z14 || this.zzd.zzi == -1 || (!zzwrVar2.zzT && z10)) ? 1 : 2;
        }
        this.zze = i16;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzwl zzwlVar) {
        zzfvm zzfvmVar;
        zzfvm zza;
        zzfvm zzfvmVar2;
        if (!this.zzf || !this.zzi) {
            zzfvmVar = zzxd.zzc;
            zza = zzfvmVar.zza();
        } else {
            zza = zzxd.zzc;
        }
        zzfts zzc = zzfts.zzj().zzd(this.zzi, zzwlVar.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzwlVar.zzk), zzfvm.zzc().zza()).zzb(this.zzj, zzwlVar.zzj).zzb(this.zzl, zzwlVar.zzl).zzd(this.zzp, zzwlVar.zzp).zzd(true, true).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzwlVar.zzn), zzfvm.zzc().zza()).zzb(this.zzo, zzwlVar.zzo).zzd(this.zzf, zzwlVar.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzwlVar.zzt), zzfvm.zzc().zza());
        Integer valueOf = Integer.valueOf(this.zzs);
        Integer valueOf2 = Integer.valueOf(zzwlVar.zzs);
        boolean z10 = this.zzh.zzA;
        zzfvmVar2 = zzxd.zzd;
        zzfts zzc2 = zzc.zzc(valueOf, valueOf2, zzfvmVar2).zzd(this.zzu, zzwlVar.zzu).zzd(this.zzv, zzwlVar.zzv).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzwlVar.zzq), zza).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzwlVar.zzr), zza);
        Integer valueOf3 = Integer.valueOf(this.zzs);
        Integer valueOf4 = Integer.valueOf(zzwlVar.zzs);
        if (!zzfk.zzD(this.zzg, zzwlVar.zzg)) {
            zza = zzxd.zzd;
        }
        return zzc2.zzc(valueOf3, valueOf4, zza).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final /* bridge */ /* synthetic */ boolean zzc(zzwz zzwzVar) {
        String str;
        zzwl zzwlVar = (zzwl) zzwzVar;
        boolean z10 = this.zzh.zzO;
        zzam zzamVar = this.zzd;
        int i10 = zzamVar.zzz;
        if (i10 != -1) {
            zzam zzamVar2 = zzwlVar.zzd;
            if (i10 == zzamVar2.zzz && (str = zzamVar.zzm) != null && TextUtils.equals(str, zzamVar2.zzm)) {
                boolean z11 = this.zzh.zzN;
                int i11 = this.zzd.zzA;
                if (i11 != -1 && i11 == zzwlVar.zzd.zzA && this.zzu == zzwlVar.zzu && this.zzv == zzwlVar.zzv) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
