package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdc {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgcy
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                zzgnw zzgnwVar;
                zzgcx zzgcxVar = (zzgcx) zzgahVar;
                int i10 = zzgdc.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzgln zzd2 = zzglo.zzd();
                zzd2.zza(zzgcxVar.zza());
                zza3.zzc(((zzglo) zzd2.zzal()).zzau());
                zzgcv zzb2 = zzgcxVar.zzb();
                if (zzgcv.zza.equals(zzb2)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgcv.zzb.equals(zzb2)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgcv.zzc.equals(zzb2)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgcx.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgcz
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgdc.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgda
        }, zzgcp.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgdb
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgdc.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgcm, com.google.android.gms.internal.ads.zzgct] */
    public static /* synthetic */ zzgcp zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzgll zze2 = zzgll.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    ?? r22 = 0;
                    zzgcu zzgcuVar = new zzgcu(r22);
                    zzgcuVar.zzb(zze2.zzf().zzd());
                    zzgcuVar.zza(12);
                    zzgcuVar.zzc(16);
                    zzgcuVar.zzd(zzd(zzghcVar.zzc()));
                    zzgcx zze3 = zzgcuVar.zze();
                    zzgcn zzgcnVar = new zzgcn(r22);
                    zzgcnVar.zzc(zze3);
                    zzgcnVar.zzb(zzgpp.zzb(zze2.zzf().zzA(), zzgasVar));
                    zzgcnVar.zza(zzghcVar.zzf());
                    return zzgcnVar.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
    }

    public static /* synthetic */ zzgcx zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzglo zzf2 = zzglo.zzf(zzghdVar.zzc().zzg(), zzgrc.zza());
                if (zzf2.zzc() == 0) {
                    zzgcu zzgcuVar = new zzgcu(null);
                    zzgcuVar.zzb(zzf2.zza());
                    zzgcuVar.zza(12);
                    zzgcuVar.zzc(16);
                    zzgcuVar.zzd(zzd(zzghdVar.zzc().zzf()));
                    return zzgcuVar.zze();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgcv zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                    }
                } else {
                    return zzgcv.zzc;
                }
            }
            return zzgcv.zzb;
        }
        return zzgcv.zza;
    }
}
