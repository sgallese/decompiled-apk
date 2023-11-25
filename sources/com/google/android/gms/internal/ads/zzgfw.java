package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgfw {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzgfw(Class cls, zzggv... zzggvVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            zzggv zzggvVar = zzggvVarArr[i10];
            if (!hashMap.containsKey(zzggvVar.zzb())) {
                hashMap.put(zzggvVar.zzb(), zzggvVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzggvVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzggvVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgfv zza() {
        throw null;
    }

    public abstract zzgmp zzb();

    public abstract zzgta zzc(zzgqi zzgqiVar) throws zzgsc;

    public abstract String zzd();

    public abstract void zze(zzgta zzgtaVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgta zzgtaVar, Class cls) throws GeneralSecurityException {
        zzggv zzggvVar = (zzggv) this.zzb.get(cls);
        if (zzggvVar != null) {
            return zzggvVar.zza(zzgtaVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
