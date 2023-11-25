package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgjq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                int i10;
                zzgnw zzgnwVar;
                zzgjc zzgjcVar = (zzgjc) zzgahVar;
                int i11 = zzgjq.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
                zzgmh zzd2 = zzgmi.zzd();
                zzgmk zzc2 = zzgml.zzc();
                zzc2.zza(zzgjcVar.zza());
                zzgiz zze2 = zzgjcVar.zze();
                if (zzgiz.zza.equals(zze2)) {
                    i10 = 3;
                } else if (zzgiz.zzb.equals(zze2)) {
                    i10 = 7;
                } else if (zzgiz.zzc.equals(zze2)) {
                    i10 = 5;
                } else if (zzgiz.zzd.equals(zze2)) {
                    i10 = 4;
                } else if (zzgiz.zze.equals(zze2)) {
                    i10 = 6;
                } else {
                    throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zze2)));
                }
                zzc2.zzb(i10);
                zzd2.zzb((zzgml) zzc2.zzal());
                zzd2.zza(zzgjcVar.zzb());
                zza3.zzc(((zzgmi) zzd2.zzal()).zzau());
                zzgja zzf2 = zzgjcVar.zzf();
                if (zzgja.zza.equals(zzf2)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgja.zzb.equals(zzf2)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgja.zzd.equals(zzf2)) {
                    zzgnwVar = zzgnw.RAW;
                } else if (zzgja.zzc.equals(zzf2)) {
                    zzgnwVar = zzgnw.LEGACY;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzf2)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgjc.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgjq.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgjo
        }, zzgir.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgjq.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    public static /* synthetic */ zzgir zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgmf zzf2 = zzgmf.zzf(zzghcVar.zze(), zzgrc.zza());
                if (zzf2.zza() == 0) {
                    zzgiy zzd2 = zzgjc.zzd();
                    zzd2.zzb(zzf2.zzh().zzd());
                    zzd2.zzc(zzf2.zzg().zza());
                    zzd2.zza(zze(zzf2.zzg().zzg()));
                    zzd2.zzd(zzd(zzghcVar.zzc()));
                    zzgjc zze2 = zzd2.zze();
                    zzgip zza2 = zzgir.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgpp.zzb(zzf2.zzh().zzA(), zzgasVar));
                    zza2.zza(zzghcVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgjc zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgmi zzg = zzgmi.zzg(zzghdVar.zzc().zzg(), zzgrc.zza());
                if (zzg.zzc() == 0) {
                    zzgiy zzd2 = zzgjc.zzd();
                    zzd2.zzb(zzg.zza());
                    zzd2.zzc(zzg.zzh().zza());
                    zzd2.zza(zze(zzg.zzh().zzg()));
                    zzd2.zzd(zzd(zzghdVar.zzc().zzf()));
                    return zzd2.zze();
                }
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzg.zzc());
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgja zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgja.zzb;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                }
                return zzgja.zzd;
            }
            return zzgja.zzc;
        }
        return zzgja.zza;
    }

    private static zzgiz zze(int i10) throws GeneralSecurityException {
        zzgnw zzgnwVar = zzgnw.UNKNOWN_PREFIX;
        int i11 = i10 - 2;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return zzgiz.zzb;
                        }
                        throw new GeneralSecurityException("Unable to parse HashType: " + zzgmc.zza(i10));
                    }
                    return zzgiz.zze;
                }
                return zzgiz.zzc;
            }
            return zzgiz.zzd;
        }
        return zzgiz.zza;
    }
}
