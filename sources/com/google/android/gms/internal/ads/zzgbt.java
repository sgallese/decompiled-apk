package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgbt extends zzgfv {
    final /* synthetic */ zzgbu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbt(zzgbu zzgbuVar, Class cls) {
        super(cls);
        this.zza = zzgbuVar;
    }

    public static final zzgkt zzf(zzgkw zzgkwVar) throws GeneralSecurityException {
        zzgks zzc = zzgkt.zzc();
        zzc.zzb(zzgkwVar.zzg());
        byte[] zzb = zzghf.zzb(zzgkwVar.zza());
        zzc.zza(zzgqi.zzv(zzb, 0, zzb.length));
        zzc.zzc(0);
        return (zzgkt) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* bridge */ /* synthetic */ zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException {
        return zzf((zzgkw) zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    public final /* synthetic */ zzgta zzb(zzgqi zzgqiVar) throws zzgsc {
        return zzgkw.zzf(zzgqiVar, zzgrc.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgfv
    /* renamed from: zze  reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgkw zzgkwVar) throws GeneralSecurityException {
        zzgpm.zza(zzgkwVar.zza());
        zzgbu zzgbuVar = this.zza;
        zzgbu.zzm(zzgkwVar.zzg());
    }
}
