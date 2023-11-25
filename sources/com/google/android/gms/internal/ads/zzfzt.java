package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfzt {
    private static final Logger zza = Logger.getLogger(zzfzt.class.getName());
    private final ConcurrentMap zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzt() {
        this.zzb = new ConcurrentHashMap();
    }

    private final synchronized zzfzs zze(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzfzs) this.zzb.get(str);
    }

    private final synchronized void zzf(zzfzs zzfzsVar, boolean z10) throws GeneralSecurityException {
        String zzc = zzfzsVar.zza().zzc();
        zzfzs zzfzsVar2 = (zzfzs) this.zzb.get(zzc);
        if (zzfzsVar2 != null && !zzfzsVar2.zza.getClass().equals(zzfzsVar.zza.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zzc));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzc, zzfzsVar2.zza.getClass().getName(), zzfzsVar.zza.getClass().getName()));
        }
        this.zzb.putIfAbsent(zzc, zzfzsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfzq zza(String str, Class cls) throws GeneralSecurityException {
        zzfzs zze = zze(str);
        if (zze.zza.zzl().contains(cls)) {
            try {
                return new zzfzr(zze.zza, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zze.zza.getClass());
        Set<Class> zzl = zze.zza.zzl();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class cls2 : zzl) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls2.getCanonicalName());
            z10 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfzq zzb(String str) throws GeneralSecurityException {
        return zze(str).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zzc(zzgfw zzgfwVar) throws GeneralSecurityException {
        if (zzgfj.zza(zzgfwVar.zzf())) {
            zzf(new zzfzs(zzgfwVar), false);
        } else {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(zzgfwVar.getClass()) + " as it is not FIPS compatible.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzd(String str) {
        return this.zzb.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfzt(zzfzt zzfztVar) {
        this.zzb = new ConcurrentHashMap(zzfztVar.zzb);
    }
}
