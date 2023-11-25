package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbr {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgbn
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                int i10;
                zzgnw zzgnwVar;
                zzgbm zzgbmVar = (zzgbm) zzgahVar;
                int i11 = zzgbr.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzgkp zza4 = zzgkq.zza();
                zzgkv zzc2 = zzgkw.zzc();
                zzgky zzc3 = zzgkz.zzc();
                zzc3.zza(zzgbmVar.zzc());
                zzc2.zzb((zzgkz) zzc3.zzal());
                zzc2.zza(zzgbmVar.zza());
                zza4.zza((zzgkw) zzc2.zzal());
                zzgmh zzd2 = zzgmi.zzd();
                zzgmk zzc4 = zzgml.zzc();
                zzc4.zza(zzgbmVar.zzd());
                zzgbj zze2 = zzgbmVar.zze();
                if (zzgbj.zza.equals(zze2)) {
                    i10 = 3;
                } else if (zzgbj.zzb.equals(zze2)) {
                    i10 = 7;
                } else if (zzgbj.zzc.equals(zze2)) {
                    i10 = 5;
                } else if (zzgbj.zzd.equals(zze2)) {
                    i10 = 4;
                } else if (zzgbj.zze.equals(zze2)) {
                    i10 = 6;
                } else {
                    throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zze2)));
                }
                zzc4.zzb(i10);
                zzd2.zzb((zzgml) zzc4.zzal());
                zzd2.zza(zzgbmVar.zzb());
                zza4.zzb((zzgmi) zzd2.zzal());
                zza3.zzc(((zzgkq) zza4.zzal()).zzau());
                zzgbk zzf2 = zzgbmVar.zzf();
                if (zzgbk.zza.equals(zzf2)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgbk.zzb.equals(zzf2)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgbk.zzc.equals(zzf2)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzf2)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgbm.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgbo
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgbr.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgbp
        }, zzgbd.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgbq
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgbr.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgba, com.google.android.gms.internal.ads.zzgbh] */
    public static /* synthetic */ zzgbd zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgkn zze2 = zzgkn.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    if (zze2.zzf().zza() == 0) {
                        if (zze2.zzg().zza() == 0) {
                            ?? r22 = 0;
                            zzgbi zzgbiVar = new zzgbi(r22);
                            zzgbiVar.zza(zze2.zzf().zzh().zzd());
                            zzgbiVar.zzc(zze2.zzg().zzh().zzd());
                            zzgbiVar.zzd(zze2.zzf().zzg().zza());
                            zzgbiVar.zze(zze2.zzg().zzg().zza());
                            zzgbiVar.zzb(zze(zze2.zzg().zzg().zzg()));
                            zzgbiVar.zzf(zzd(zzghcVar.zzc()));
                            zzgbm zzg = zzgbiVar.zzg();
                            zzgbb zzgbbVar = new zzgbb(r22);
                            zzgbbVar.zzd(zzg);
                            zzgbbVar.zza(zzgpp.zzb(zze2.zzf().zzh().zzA(), zzgasVar));
                            zzgbbVar.zzb(zzgpp.zzb(zze2.zzg().zzh().zzA(), zzgasVar));
                            zzgbbVar.zzc(zzghcVar.zzf());
                            return zzgbbVar.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgbm zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgkq zzd2 = zzgkq.zzd(zzghdVar.zzc().zzg(), zzgrc.zza());
                if (zzd2.zzf().zzc() == 0) {
                    zzgbi zzgbiVar = new zzgbi(null);
                    zzgbiVar.zza(zzd2.zze().zza());
                    zzgbiVar.zzc(zzd2.zzf().zza());
                    zzgbiVar.zzd(zzd2.zze().zzg().zza());
                    zzgbiVar.zze(zzd2.zzf().zzh().zza());
                    zzgbiVar.zzb(zze(zzd2.zzf().zzh().zzg()));
                    zzgbiVar.zzf(zzd(zzghdVar.zzc().zzf()));
                    return zzgbiVar.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgbk zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                    }
                } else {
                    return zzgbk.zzc;
                }
            }
            return zzgbk.zzb;
        }
        return zzgbk.zza;
    }

    private static zzgbj zze(int i10) throws GeneralSecurityException {
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return zzgbj.zzb;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(i10));
                    }
                    return zzgbj.zze;
                }
                return zzgbj.zzc;
            }
            return zzgbj.zzd;
        }
        return zzgbj.zza;
    }
}
