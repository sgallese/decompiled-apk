package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzejp {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdpc zzb;

    public zzejp(zzdpc zzdpcVar) {
        this.zzb = zzdpcVar;
    }

    public final zzbqc zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbqc) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            zzcaa.zzh("Couldn't create RTB adapter : ", e10);
        }
    }
}
