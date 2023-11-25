package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcl {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgch
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                zzgnw zzgnwVar;
                zzgcg zzgcgVar = (zzgcg) zzgahVar;
                int i10 = zzgcl.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzgle zzc2 = zzglf.zzc();
                zzglh zzc3 = zzgli.zzc();
                zzc3.zza(zzgcgVar.zza());
                zzc2.zzb((zzgli) zzc3.zzal());
                zzc2.zza(zzgcgVar.zzb());
                zza3.zzc(((zzglf) zzc2.zzal()).zzau());
                zzgce zzc4 = zzgcgVar.zzc();
                if (zzgce.zza.equals(zzc4)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgce.zzb.equals(zzc4)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgce.zzc.equals(zzc4)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzc4)));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgcg.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgci
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgcl.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgcj
        }, zzgby.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzgck
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgcl.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.internal.ads.zzgcc, com.google.android.gms.internal.ads.zzgbv] */
    public static /* synthetic */ zzgby zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzglc zze2 = zzglc.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    ?? r22 = 0;
                    zzgcd zzgcdVar = new zzgcd(r22);
                    zzgcdVar.zzb(zze2.zzg().zzd());
                    zzgcdVar.zza(zze2.zzf().zza());
                    zzgcdVar.zzc(16);
                    zzgcdVar.zzd(zzd(zzghcVar.zzc()));
                    zzgcg zze3 = zzgcdVar.zze();
                    zzgbw zzgbwVar = new zzgbw(r22);
                    zzgbwVar.zzc(zze3);
                    zzgbwVar.zzb(zzgpp.zzb(zze2.zzg().zzA(), zzgasVar));
                    zzgbwVar.zza(zzghcVar.zzf());
                    return zzgbwVar.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
    }

    public static /* synthetic */ zzgcg zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzglf zze2 = zzglf.zze(zzghdVar.zzc().zzg(), zzgrc.zza());
                zzgcd zzgcdVar = new zzgcd(null);
                zzgcdVar.zzb(zze2.zza());
                zzgcdVar.zza(zze2.zzf().zza());
                zzgcdVar.zzc(16);
                zzgcdVar.zzd(zzd(zzghdVar.zzc().zzf()));
                return zzgcdVar.zze();
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgce zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                    }
                } else {
                    return zzgce.zzc;
                }
            }
            return zzgce.zzb;
        }
        return zzgce.zza;
    }
}
