package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgar {
    public static final /* synthetic */ int zza = 0;
    private static final Logger zzb = Logger.getLogger(zzgar.class.getName());
    private static final AtomicReference zzc = new AtomicReference(new zzfzt());
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzgar() {
    }

    public static synchronized zzgmq zza(zzgmv zzgmvVar) throws GeneralSecurityException {
        zzgmq zza2;
        synchronized (zzgar.class) {
            zzfzq zzb2 = ((zzfzt) zzc.get()).zzb(zzgmvVar.zzh());
            if (((Boolean) zze.get(zzgmvVar.zzh())).booleanValue()) {
                zza2 = zzb2.zza(zzgmvVar.zzg());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzgmvVar.zzh())));
            }
        }
        return zza2;
    }

    public static Class zzb(Class cls) {
        try {
            return zzggg.zza().zzb(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object zzc(String str, zzgqi zzgqiVar, Class cls) throws GeneralSecurityException {
        return ((zzfzt) zzc.get()).zza(str, cls).zzb(zzgqiVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized Map zzd() {
        Map unmodifiableMap;
        synchronized (zzgar.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [com.google.android.gms.internal.ads.zzgta, java.lang.Object] */
    public static synchronized void zze(zzgfw zzgfwVar, boolean z10) throws GeneralSecurityException {
        synchronized (zzgar.class) {
            AtomicReference atomicReference = zzc;
            zzfzt zzfztVar = new zzfzt((zzfzt) atomicReference.get());
            zzfztVar.zzc(zzgfwVar);
            Map zzc2 = zzgfwVar.zza().zzc();
            String zzd2 = zzgfwVar.zzd();
            zzg(zzd2, zzc2, true);
            if (!((zzfzt) atomicReference.get()).zzd(zzd2)) {
                zzd.put(zzd2, new zzgaq(zzgfwVar));
                for (Map.Entry entry : zzgfwVar.zza().zzc().entrySet()) {
                    zzg.put((String) entry.getKey(), zzfzv.zzc(zzd2, ((zzgfu) entry.getValue()).zza.zzax(), ((zzgfu) entry.getValue()).zzb));
                }
            }
            zze.put(zzd2, Boolean.TRUE);
            zzc.set(zzfztVar);
        }
    }

    public static synchronized void zzf(zzgap zzgapVar) throws GeneralSecurityException {
        synchronized (zzgar.class) {
            zzggg.zza().zzf(zzgapVar);
        }
    }

    private static synchronized void zzg(String str, Map map, boolean z10) throws GeneralSecurityException {
        synchronized (zzgar.class) {
            ConcurrentMap concurrentMap = zze;
            if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            if (((zzfzt) zzc.get()).zzd(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!zzg.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (zzg.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                    }
                }
            }
        }
    }
}
