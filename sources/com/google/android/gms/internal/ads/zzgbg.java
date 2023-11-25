package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgbg extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgbg() {
        super(zzgkn.class, new zzgbe(zzfzi.class));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzgfu zzg(int i10, int i11, int i12, int i13, int i14, int i15) {
        zzgkv zzc = zzgkw.zzc();
        zzgky zzc2 = zzgkz.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgkz) zzc2.zzal());
        zzc.zza(i10);
        zzgkw zzgkwVar = (zzgkw) zzc.zzal();
        zzgmh zzd = zzgmi.zzd();
        zzgmk zzc3 = zzgml.zzc();
        zzc3.zzb(5);
        zzc3.zza(i13);
        zzd.zzb((zzgml) zzc3.zzal());
        zzd.zza(32);
        zzgmi zzgmiVar = (zzgmi) zzd.zzal();
        zzgkp zza = zzgkq.zza();
        zza.zza(zzgkwVar);
        zza.zzb(zzgmiVar);
        return new zzgfu((zzgkq) zza.zzal(), i15);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgbf(this, zzgkq.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgkn.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgkn zzgknVar = (zzgkn) zzgtaVar;
        zzgpm.zzb(zzgknVar.zza(), 0);
        new zzgbu();
        zzgbu.zzh(zzgknVar.zzf());
        new zzgiw();
        zzgiw.zzm(zzgknVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final int zzf() {
        return 2;
    }
}
