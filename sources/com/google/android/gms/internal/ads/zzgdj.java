package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgdj extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdj() {
        super(zzglr.class, new zzgdh(zzfzi.class));
    }

    public static void zzg(boolean z10) throws GeneralSecurityException {
        if (zzm()) {
            zzgar.zze(new zzgdj(), true);
            int i10 = zzgdt.zza;
            zzgdt.zzc(zzggi.zzc());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgfu zzh(int i10, int i11) {
        zzglt zzd = zzglu.zzd();
        zzd.zza(i10);
        return new zzgfu((zzglu) zzd.zzal(), i11);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgdi(this, zzglu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzglr.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglr zzglrVar = (zzglr) zzgtaVar;
        zzgpm.zzb(zzglrVar.zza(), 0);
        zzgpm.zza(zzglrVar.zzf().zzd());
    }
}
