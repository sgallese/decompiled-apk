package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgek extends zzgfv {
    final /* synthetic */ zzgel zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgek(zzgel zzgelVar, Class cls) {
        super(cls);
        this.zza = zzgelVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgnq zzc = zzgnr.zzc();
        zzc.zza((zzgnu) zzgtaVar);
        zzc.zzb(0);
        return (zzgnr) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgnu.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ void zzd(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgnu zzgnuVar = (zzgnu) zzgtaVar;
        if (zzgei.zzb(zzgnuVar.zza().zzh())) {
            if (!zzgnuVar.zzf().isEmpty() && zzgnuVar.zzg()) {
                return;
            }
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + zzgnuVar.zza().zzh() + ". Only Tink AEAD key types are supported.");
    }
}
