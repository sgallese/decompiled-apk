package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgfv {
    private final Class zza;

    public zzgfv(Class cls) {
        this.zza = cls;
    }

    public abstract zzgta zza(zzgta zzgtaVar) throws GeneralSecurityException;

    public abstract zzgta zzb(zzgqi zzgqiVar) throws zzgsc;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgta zzgtaVar) throws GeneralSecurityException;
}
