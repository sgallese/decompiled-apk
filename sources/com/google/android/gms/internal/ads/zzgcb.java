package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgcb extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcb() {
        super(zzglc.class, new zzgbz(zzfzi.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgfu zzg(int i10, int i11, int i12) {
        zzgle zzc = zzglf.zzc();
        zzc.zza(i10);
        zzglh zzc2 = zzgli.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgli) zzc2.zzal());
        return new zzgfu((zzglf) zzc.zzal(), i12);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgca(this, zzglf.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzglc.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzglc zzglcVar = (zzglc) zzgtaVar;
        zzgpm.zzb(zzglcVar.zza(), 0);
        zzgpm.zza(zzglcVar.zzg().zzd());
        if (zzglcVar.zzf().zza() != 12 && zzglcVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
