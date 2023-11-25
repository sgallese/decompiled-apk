package com.google.android.gms.internal.ads;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgti {
    private static final zzgti zza = new zzgti();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgtu zzb = new zzgss();

    private zzgti() {
    }

    public static zzgti zza() {
        return zza;
    }

    public final zzgtt zzb(Class cls) {
        zzgsa.zzc(cls, "messageType");
        zzgtt zzgttVar = (zzgtt) this.zzc.get(cls);
        if (zzgttVar == null) {
            zzgttVar = this.zzb.zza(cls);
            zzgsa.zzc(cls, "messageType");
            zzgtt zzgttVar2 = (zzgtt) this.zzc.putIfAbsent(cls, zzgttVar);
            if (zzgttVar2 != null) {
                return zzgttVar2;
            }
        }
        return zzgttVar;
    }
}
