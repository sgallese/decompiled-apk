package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbu extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbu() {
        super(zzgkt.class, new zzgbs(zzgpg.class));
    }

    public static final void zzh(zzgkt zzgktVar) throws GeneralSecurityException {
        zzgpm.zzb(zzgktVar.zza(), 0);
        zzgpm.zza(zzgktVar.zzh().zzd());
        zzm(zzgktVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgkz zzgkzVar) throws GeneralSecurityException {
        if (zzgkzVar.zza() >= 12 && zzgkzVar.zza() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgbt(this, zzgkw.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgkt.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzh((zzgkt) zzgtaVar);
    }
}
