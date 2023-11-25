package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgel extends zzgfw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgel() {
        super(zzgnr.class, new zzgej(zzfzi.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgfv zza() {
        return new zzgek(this, zzgnu.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final zzgmp zzb() {
        return zzgmp.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* synthetic */ zzgta zzc(zzgqi zzgqiVar) throws zzgsc {
        return zzgnr.zze(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgfw
    public final /* bridge */ /* synthetic */ void zze(zzgta zzgtaVar) throws GeneralSecurityException {
        zzgnr zzgnrVar = (zzgnr) zzgtaVar;
        zzgpm.zzb(zzgnrVar.zza(), 0);
        if (zzgei.zzb(zzgnrVar.zzf().zza().zzh())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + zzgnrVar.zzf().zza().zzh() + ". Only Tink AEAD key types are supported.");
    }
}
