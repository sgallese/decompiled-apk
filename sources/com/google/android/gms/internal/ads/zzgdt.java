package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdt {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgdp
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                zzgnw zzgnwVar;
                zzgdo zzgdoVar = (zzgdo) zzgahVar;
                int i10 = zzgdt.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzglt zzd2 = zzglu.zzd();
                zzd2.zza(zzgdoVar.zza());
                zza3.zzc(((zzglu) zzd2.zzal()).zzau());
                zzgdm zzb2 = zzgdoVar.zzb();
                if (zzgdm.zza.equals(zzb2)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgdm.zzb.equals(zzb2)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgdm.zzc.equals(zzb2)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgdo.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgdq
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgdt.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgdr
        }, zzgdg.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgds
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgdt.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgdd, com.google.android.gms.internal.ads.zzgdk] */
    public static /* synthetic */ zzgdg zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzglr zze2 = zzglr.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    ?? r22 = 0;
                    zzgdl zzgdlVar = new zzgdl(r22);
                    zzgdlVar.zza(zze2.zzf().zzd());
                    zzgdlVar.zzb(zzd(zzghcVar.zzc()));
                    zzgdo zzc2 = zzgdlVar.zzc();
                    zzgde zzgdeVar = new zzgde(r22);
                    zzgdeVar.zzc(zzc2);
                    zzgdeVar.zzb(zzgpp.zzb(zze2.zzf().zzA(), zzgasVar));
                    zzgdeVar.zza(zzghcVar.zzf());
                    return zzgdeVar.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
    }

    public static /* synthetic */ zzgdo zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzglu zzf2 = zzglu.zzf(zzghdVar.zzc().zzg(), zzgrc.zza());
                if (zzf2.zzc() == 0) {
                    zzgdl zzgdlVar = new zzgdl(null);
                    zzgdlVar.zza(zzf2.zza());
                    zzgdlVar.zzb(zzd(zzghdVar.zzc().zzf()));
                    return zzgdlVar.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgdm zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                    }
                } else {
                    return zzgdm.zzc;
                }
            }
            return zzgdm.zzb;
        }
        return zzgdm.zza;
    }
}
