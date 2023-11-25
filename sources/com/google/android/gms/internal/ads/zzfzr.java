package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfzr implements zzfzq {
    private final zzgfw zza;
    private final Class zzb;

    public zzfzr(zzgfw zzgfwVar, Class cls) {
        if (!zzgfwVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgfwVar.toString(), cls.getName()));
        }
        this.zza = zzgfwVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final zzgmq zza(zzgqi zzgqiVar) throws GeneralSecurityException {
        try {
            zzgfv zza = this.zza.zza();
            zzgta zzb = zza.zzb(zzgqiVar);
            zza.zzd(zzb);
            zzgta zza2 = zza.zza(zzb);
            zzgmn zza3 = zzgmq.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzau());
            zza3.zza(this.zza.zzb());
            return (zzgmq) zza3.zzal();
        } catch (zzgsc e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final Object zzb(zzgqi zzgqiVar) throws GeneralSecurityException {
        try {
            zzgta zzc = this.zza.zzc(zzgqiVar);
            if (!Void.class.equals(this.zzb)) {
                this.zza.zze(zzc);
                return this.zza.zzk(zzc, this.zzb);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzgsc e10) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzq
    public final String zzc() {
        return this.zza.zzd();
    }
}
