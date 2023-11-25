package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcs extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcs() {
        super(zzgll.class, new zzgcq(zzfzi.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgfu zzg(int i10, int i11) {
        zzgln zzd = zzglo.zzd();
        zzd.zza(i10);
        return new zzgfu((zzglo) zzd.zzal(), i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgcr(this, zzglo.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgll.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgll zzgllVar = (zzgll) zzgtaVar;
        zzgpm.zzb(zzgllVar.zza(), 0);
        zzgpm.zza(zzgllVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }
}
