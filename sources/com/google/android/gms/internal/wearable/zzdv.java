package com.google.android.gms.internal.wearable;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzdv {
    private static final zzdv zza = new zzdv();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzdz zzb = new zzdf();

    private zzdv() {
    }

    public static zzdv zza() {
        return zza;
    }

    public final zzdy zzb(Class cls) {
        zzco.zzc(cls, "messageType");
        zzdy zzdyVar = (zzdy) this.zzc.get(cls);
        if (zzdyVar == null) {
            zzdyVar = this.zzb.zza(cls);
            zzco.zzc(cls, "messageType");
            zzdy zzdyVar2 = (zzdy) this.zzc.putIfAbsent(cls, zzdyVar);
            if (zzdyVar2 != null) {
                return zzdyVar2;
            }
        }
        return zzdyVar;
    }
}
