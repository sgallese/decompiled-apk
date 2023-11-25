package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgee {
    public static final /* synthetic */ int zza = 0;
    private static final zzgpo zzb;
    private static final zzggq zzc;
    private static final zzggm zzd;
    private static final zzgft zze;
    private static final zzgfp zzf;

    static {
        zzgpo zza2 = zzghq.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzggq.zzb(new zzggo() { // from class: com.google.android.gms.internal.ads.zzgea
            @Override // com.google.android.gms.internal.ads.zzggo
            public final zzghh zza(zzgah zzgahVar) {
                zzgnw zzgnwVar;
                int i10 = zzgee.zza;
                zzgmu zza3 = zzgmv.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zza3.zzc(zzgma.zzc().zzau());
                zzgdy zza4 = ((zzgdz) zzgahVar).zza();
                if (zzgdy.zza.equals(zza4)) {
                    zzgnwVar = zzgnw.TINK;
                } else if (zzgdy.zzb.equals(zza4)) {
                    zzgnwVar = zzgnw.CRUNCHY;
                } else if (zzgdy.zzc.equals(zza4)) {
                    zzgnwVar = zzgnw.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(zza4.toString()));
                }
                zza3.zza(zzgnwVar);
                return zzghd.zzb((zzgmv) zza3.zzal());
            }
        }, zzgdz.class, zzghd.class);
        zzd = zzggm.zzb(new zzggk() { // from class: com.google.android.gms.internal.ads.zzgeb
            @Override // com.google.android.gms.internal.ads.zzggk
            public final zzgah zza(zzghh zzghhVar) {
                return zzgee.zzb((zzghd) zzghhVar);
            }
        }, zza2, zzghd.class);
        zze = zzgft.zza(new zzgfr() { // from class: com.google.android.gms.internal.ads.zzgec
        }, zzgdu.class, zzghc.class);
        zzf = zzgfp.zzb(new zzgfn() { // from class: com.google.android.gms.internal.ads.zzged
            @Override // com.google.android.gms.internal.ads.zzgfn
            public final zzfzp zza(zzghh zzghhVar, zzgas zzgasVar) {
                return zzgee.zza((zzghc) zzghhVar, zzgasVar);
            }
        }, zza2, zzghc.class);
    }

    public static /* synthetic */ zzgdu zza(zzghc zzghcVar, zzgas zzgasVar) {
        if (zzghcVar.zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzglx zze2 = zzglx.zze(zzghcVar.zze(), zzgrc.zza());
                if (zze2.zza() == 0) {
                    return zzgdu.zza(zzd(zzghcVar.zzc()), zzgpp.zzb(zze2.zzf().zzA(), zzgasVar), zzghcVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgsc unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
    }

    public static /* synthetic */ zzgdz zzb(zzghd zzghdVar) {
        if (zzghdVar.zzc().zzh().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzgma.zzd(zzghdVar.zzc().zzg(), zzgrc.zza());
                return zzgdz.zzb(zzd(zzghdVar.zzc().zzf()));
            } catch (zzgsc e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters: ".concat(String.valueOf(zzghdVar.zzc().zzh())));
    }

    public static void zzc(zzggi zzggiVar) throws GeneralSecurityException {
        zzggiVar.zzh(zzc);
        zzggiVar.zzg(zzd);
        zzggiVar.zzf(zze);
        zzggiVar.zze(zzf);
    }

    private static zzgdy zzd(zzgnw zzgnwVar) throws GeneralSecurityException {
        zzgnw zzgnwVar2 = zzgnw.UNKNOWN_PREFIX;
        int ordinal = zzgnwVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgnwVar.zza());
                    }
                } else {
                    return zzgdy.zzc;
                }
            }
            return zzgdy.zzb;
        }
        return zzgdy.zza;
    }
}
