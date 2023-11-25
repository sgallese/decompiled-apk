package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgij {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                zzgnw zzgnwVar;
                zzgie zzgieVar = (zzgie) zzgahVar;
                int i10 = zzgij.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzgkg zzc2 = zzgkh.zzc();
                zzgkj zzc3 = zzgkk.zzc();
                zzc3.zza(zzgieVar.zza());
                zzc2.zzb((zzgkk) zzc3.zzal());
                zzc2.zza(zzgieVar.zzb());
                zza3.zzc(((zzgkh) zzc2.zzal()).zzau());
                zzgic zzd2 = zzgieVar.zzd();
                if (zzgic.zza.equals(zzd2)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgic.zzb.equals(zzd2)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgic.zzd.equals(zzd2)) {
                    zzgnwVar = zzgnw.RAW;
                } else if (zzgic.zzc.equals(zzd2)) {
                    zzgnwVar = zzgnw.LEGACY;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzd2)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgie.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgij.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgih
        }, zzghu.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgij.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzghr, com.google.android.gms.internal.ads.zzgia] */
    public static /* synthetic */ zzghu zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgke zze2 = zzgke.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    ?? r22 = 0;
                    zzgib zzgibVar = new zzgib(r22);
                    zzgibVar.zza(zze2.zzg().zzd());
                    zzgibVar.zzb(zze2.zzf().zza());
                    zzgibVar.zzc(zzd(zzghcVar.zzc()));
                    zzgie zzd2 = zzgibVar.zzd();
                    zzghs zzghsVar = new zzghs(r22);
                    zzghsVar.zzc(zzd2);
                    zzghsVar.zza(zzgpp.zzb(zze2.zzg().zzA(), zzgasVar));
                    zzghsVar.zzb(zzghcVar.zzf());
                    return zzghsVar.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
    }

    public static /* synthetic */ zzgie zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgkh zze2 = zzgkh.zze(zzghdVar.zzc().zzg(), zzgrc.zza());
                zzgib zzgibVar = new zzgib(null);
                zzgibVar.zza(zze2.zza());
                zzgibVar.zzb(zze2.zzf().zza());
                zzgibVar.zzc(zzd(zzghdVar.zzc().zzf()));
                return zzgibVar.zzd();
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgic zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgic.zzb;
                    }
                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                }
                return zzgic.zzd;
            }
            return zzgic.zzc;
        }
        return zzgic.zza;
    }
}
