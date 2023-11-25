package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzghc implements zzghh {
    private final String zza;
    private final zzgpo zzb;
    private final zzgqi zzc;
    private final zzgmp zzd;
    private final zzgnw zze;
    private final Integer zzf;

    private zzghc(String str, zzgqi zzgqiVar, zzgmp zzgmpVar, zzgnw zzgnwVar, Integer num) {
        this.zza = str;
        this.zzb = zzghq.zza(str);
        this.zzc = zzgqiVar;
        this.zzd = zzgmpVar;
        this.zze = zzgnwVar;
        this.zzf = num;
    }

    public static zzghc zza(String str, zzgqi zzgqiVar, zzgmp zzgmpVar, zzgnw zzgnwVar, Integer num) throws GeneralSecurityException {
        if (zzgnwVar == zzgnw.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzghc(str, zzgqiVar, zzgmpVar, zzgnwVar, num);
    }

    public final zzgmp zzb() {
        return this.zzd;
    }

    public final zzgnw zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzghh
    public final zzgpo zzd() {
        return this.zzb;
    }

    public final zzgqi zze() {
        return this.zzc;
    }

    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
