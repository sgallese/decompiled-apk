package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpw;
import com.google.android.gms.internal.measurement.zzqr;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
final class zzgq implements Callable {
    final /* synthetic */ zzaw zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgv zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgq(zzgv zzgvVar, zzaw zzawVar, String str) {
        this.zzc = zzgvVar;
        this.zza = zzawVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzlf zzlfVar;
        zzlf zzlfVar2;
        zzlk zzlkVar;
        zzh zzhVar;
        com.google.android.gms.internal.measurement.zzga zzgaVar;
        String str;
        Bundle bundle;
        com.google.android.gms.internal.measurement.zzgc zzgcVar;
        String str2;
        zzas zzc;
        long j10;
        byte[] bArr;
        zzlf zzlfVar3;
        zzlfVar = this.zzc.zza;
        zzlfVar.zzA();
        zzlfVar2 = this.zzc.zza;
        zzin zzr = zzlfVar2.zzr();
        zzaw zzawVar = this.zza;
        String str3 = this.zzb;
        zzr.zzg();
        zzgd.zzO();
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str3);
        if (!zzr.zzt.zzf().zzs(str3, zzeg.zzU)) {
            zzr.zzt.zzaA().zzc().zzb("Generating ScionPayload disabled. packageName", str3);
            return new byte[0];
        } else if (!"_iap".equals(zzawVar.zza) && !"_iapx".equals(zzawVar.zza)) {
            zzr.zzt.zzaA().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str3, zzawVar.zza);
            return null;
        } else {
            com.google.android.gms.internal.measurement.zzga zza = com.google.android.gms.internal.measurement.zzgb.zza();
            zzr.zzf.zzi().zzw();
            try {
                zzh zzj = zzr.zzf.zzi().zzj(str3);
                if (zzj == null) {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle not available. package_name", str3);
                    bArr = new byte[0];
                    zzlfVar3 = zzr.zzf;
                } else if (!zzj.zzal()) {
                    zzr.zzt.zzaA().zzc().zzb("Log and bundle disabled. package_name", str3);
                    bArr = new byte[0];
                    zzlfVar3 = zzr.zzf;
                } else {
                    com.google.android.gms.internal.measurement.zzgc zzu = com.google.android.gms.internal.measurement.zzgd.zzu();
                    zzu.zzad(1);
                    zzu.zzZ("android");
                    if (!TextUtils.isEmpty(zzj.zzu())) {
                        zzu.zzD(zzj.zzu());
                    }
                    if (!TextUtils.isEmpty(zzj.zzw())) {
                        zzu.zzF((String) Preconditions.checkNotNull(zzj.zzw()));
                    }
                    if (!TextUtils.isEmpty(zzj.zzx())) {
                        zzu.zzG((String) Preconditions.checkNotNull(zzj.zzx()));
                    }
                    if (zzj.zzb() != -2147483648L) {
                        zzu.zzH((int) zzj.zzb());
                    }
                    zzu.zzV(zzj.zzm());
                    zzu.zzP(zzj.zzk());
                    String zzz = zzj.zzz();
                    String zzs = zzj.zzs();
                    if (!TextUtils.isEmpty(zzz)) {
                        zzu.zzU(zzz);
                    } else if (!TextUtils.isEmpty(zzs)) {
                        zzu.zzC(zzs);
                    }
                    zzpw.zzc();
                    if (zzr.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        zzu.zzaj(zzj.zzq());
                    }
                    zzai zzh = zzr.zzf.zzh(str3);
                    zzu.zzM(zzj.zzj());
                    if (zzr.zzt.zzJ() && zzr.zzt.zzf().zzt(zzu.zzaq()) && zzh.zzi(zzah.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzu.zzO(null);
                    }
                    zzu.zzL(zzh.zzh());
                    if (zzh.zzi(zzah.AD_STORAGE) && zzj.zzak()) {
                        Pair zzd = zzr.zzf.zzs().zzd(zzj.zzu(), zzh);
                        if (zzj.zzak() && !TextUtils.isEmpty((CharSequence) zzd.first)) {
                            try {
                                zzu.zzae(zzin.zza((String) zzd.first, Long.toString(zzawVar.zzd)));
                                Object obj = zzd.second;
                                if (obj != null) {
                                    zzu.zzX(((Boolean) obj).booleanValue());
                                }
                            } catch (SecurityException e10) {
                                zzr.zzt.zzaA().zzc().zzb("Resettable device id encryption failed", e10.getMessage());
                                bArr = new byte[0];
                                zzlfVar3 = zzr.zzf;
                            }
                        }
                    }
                    zzr.zzt.zzg().zzv();
                    zzu.zzN(Build.MODEL);
                    zzr.zzt.zzg().zzv();
                    zzu.zzY(Build.VERSION.RELEASE);
                    zzu.zzak((int) zzr.zzt.zzg().zzb());
                    zzu.zzao(zzr.zzt.zzg().zzc());
                    try {
                        if (zzh.zzi(zzah.ANALYTICS_STORAGE) && zzj.zzv() != null) {
                            zzu.zzE(zzin.zza((String) Preconditions.checkNotNull(zzj.zzv()), Long.toString(zzawVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzj.zzy())) {
                            zzu.zzT((String) Preconditions.checkNotNull(zzj.zzy()));
                        }
                        String zzu2 = zzj.zzu();
                        List zzu3 = zzr.zzf.zzi().zzu(zzu2);
                        Iterator it = zzu3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                zzlkVar = (zzlk) it.next();
                                if ("_lte".equals(zzlkVar.zzc)) {
                                    break;
                                }
                            } else {
                                zzlkVar = null;
                                break;
                            }
                        }
                        if (zzlkVar == null || zzlkVar.zze == null) {
                            zzlk zzlkVar2 = new zzlk(zzu2, "auto", "_lte", zzr.zzt.zzax().currentTimeMillis(), 0L);
                            zzu3.add(zzlkVar2);
                            zzr.zzf.zzi().zzL(zzlkVar2);
                        }
                        zzlh zzu4 = zzr.zzf.zzu();
                        zzu4.zzt.zzaA().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzu4.zzt.zzg().zze()) {
                            String zzu5 = zzj.zzu();
                            Preconditions.checkNotNull(zzu5);
                            if (zzj.zzak() && zzu4.zzf.zzo().zzn(zzu5)) {
                                zzu4.zzt.zzaA().zzc().zza("Turning off ad personalization due to account type");
                                Iterator it2 = zzu3.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    } else if ("_npa".equals(((zzlk) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                zzu3.add(new zzlk(zzu5, "auto", "_npa", zzu4.zzt.zzax().currentTimeMillis(), 1L));
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgm[] zzgmVarArr = new com.google.android.gms.internal.measurement.zzgm[zzu3.size()];
                        for (int i10 = 0; i10 < zzu3.size(); i10++) {
                            com.google.android.gms.internal.measurement.zzgl zzd2 = com.google.android.gms.internal.measurement.zzgm.zzd();
                            zzd2.zzf(((zzlk) zzu3.get(i10)).zzc);
                            zzd2.zzg(((zzlk) zzu3.get(i10)).zzd);
                            zzr.zzf.zzu().zzu(zzd2, ((zzlk) zzu3.get(i10)).zze);
                            zzgmVarArr[i10] = (com.google.android.gms.internal.measurement.zzgm) zzd2.zzaD();
                        }
                        zzu.zzj(Arrays.asList(zzgmVarArr));
                        zzeu zzb = zzeu.zzb(zzawVar);
                        zzr.zzt.zzv().zzL(zzb.zzd, zzr.zzf.zzi().zzi(str3));
                        zzr.zzt.zzv().zzN(zzb, zzr.zzt.zzf().zzd(str3));
                        Bundle bundle2 = zzb.zzd;
                        bundle2.putLong("_c", 1L);
                        zzr.zzt.zzaA().zzc().zza("Marking in-app purchase as real-time");
                        bundle2.putLong("_r", 1L);
                        bundle2.putString("_o", zzawVar.zzc);
                        if (zzr.zzt.zzv().zzaf(zzu.zzaq())) {
                            zzr.zzt.zzv().zzP(bundle2, "_dbg", 1L);
                            zzr.zzt.zzv().zzP(bundle2, "_r", 1L);
                        }
                        zzas zzn = zzr.zzf.zzi().zzn(str3, zzawVar.zza);
                        if (zzn == null) {
                            zzgcVar = zzu;
                            zzhVar = zzj;
                            zzgaVar = zza;
                            str = str3;
                            bundle = bundle2;
                            str2 = null;
                            zzc = new zzas(str3, zzawVar.zza, 0L, 0L, 0L, zzawVar.zzd, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            zzhVar = zzj;
                            zzgaVar = zza;
                            str = str3;
                            bundle = bundle2;
                            zzgcVar = zzu;
                            str2 = null;
                            long j11 = zzn.zzf;
                            zzc = zzn.zzc(zzawVar.zzd);
                            j10 = j11;
                        }
                        zzr.zzf.zzi().zzE(zzc);
                        zzar zzarVar = new zzar(zzr.zzt, zzawVar.zzc, str, zzawVar.zza, zzawVar.zzd, j10, bundle);
                        com.google.android.gms.internal.measurement.zzfs zze = com.google.android.gms.internal.measurement.zzft.zze();
                        zze.zzm(zzarVar.zzd);
                        zze.zzi(zzarVar.zzb);
                        zze.zzl(zzarVar.zze);
                        zzat zzatVar = new zzat(zzarVar.zzf);
                        while (zzatVar.hasNext()) {
                            String next = zzatVar.next();
                            com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
                            zze2.zzj(next);
                            Object zzf = zzarVar.zzf.zzf(next);
                            if (zzf != null) {
                                zzr.zzf.zzu().zzt(zze2, zzf);
                                zze.zze(zze2);
                            }
                        }
                        com.google.android.gms.internal.measurement.zzgc zzgcVar2 = zzgcVar;
                        zzgcVar2.zzk(zze);
                        com.google.android.gms.internal.measurement.zzge zza2 = com.google.android.gms.internal.measurement.zzgg.zza();
                        com.google.android.gms.internal.measurement.zzfu zza3 = com.google.android.gms.internal.measurement.zzfv.zza();
                        zza3.zza(zzc.zzc);
                        zza3.zzb(zzawVar.zza);
                        zza2.zza(zza3);
                        zzgcVar2.zzaa(zza2);
                        zzgcVar2.zzf(zzr.zzf.zzf().zza(zzhVar.zzu(), Collections.emptyList(), zzgcVar2.zzau(), Long.valueOf(zze.zzc()), Long.valueOf(zze.zzc())));
                        if (zze.zzq()) {
                            zzgcVar2.zzai(zze.zzc());
                            zzgcVar2.zzQ(zze.zzc());
                        }
                        long zzn2 = zzhVar.zzn();
                        if (zzn2 != 0) {
                            zzgcVar2.zzab(zzn2);
                        }
                        long zzp = zzhVar.zzp();
                        if (zzp != 0) {
                            zzgcVar2.zzac(zzp);
                        } else if (zzn2 != 0) {
                            zzgcVar2.zzac(zzn2);
                        }
                        String zzC = zzhVar.zzC();
                        zzqr.zzc();
                        String str4 = str;
                        if (zzr.zzt.zzf().zzs(str4, zzeg.zzao) && zzC != null) {
                            zzgcVar2.zzah(zzC);
                        }
                        zzhVar.zzF();
                        zzgcVar2.zzI((int) zzhVar.zzo());
                        zzr.zzt.zzf().zzh();
                        zzgcVar2.zzam(76003L);
                        zzgcVar2.zzal(zzr.zzt.zzax().currentTimeMillis());
                        zzgcVar2.zzag(true);
                        if (zzr.zzt.zzf().zzs(str2, zzeg.zzas)) {
                            zzr.zzf.zzC(zzgcVar2.zzaq(), zzgcVar2);
                        }
                        com.google.android.gms.internal.measurement.zzga zzgaVar2 = zzgaVar;
                        zzgaVar2.zza(zzgcVar2);
                        zzh zzhVar2 = zzhVar;
                        zzhVar2.zzac(zzgcVar2.zzd());
                        zzhVar2.zzaa(zzgcVar2.zzc());
                        zzr.zzf.zzi().zzD(zzhVar2);
                        zzr.zzf.zzi().zzC();
                        zzr.zzf.zzi().zzx();
                        try {
                            return zzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzgb) zzgaVar2.zzaD()).zzbx());
                        } catch (IOException e11) {
                            zzr.zzt.zzaA().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzet.zzn(str4), e11);
                            return str2;
                        }
                    } catch (SecurityException e12) {
                        zzr.zzt.zzaA().zzc().zzb("app instance id encryption failed", e12.getMessage());
                        byte[] bArr2 = new byte[0];
                        zzr.zzf.zzi().zzx();
                        return bArr2;
                    }
                }
                zzlfVar3.zzi().zzx();
                return bArr;
            } catch (Throwable th) {
                zzr.zzf.zzi().zzx();
                throw th;
            }
        }
    }
}
