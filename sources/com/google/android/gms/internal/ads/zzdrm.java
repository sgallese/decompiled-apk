package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzdrm extends zzdro {
    private final zzfgw zzf;

    public zzdrm(Executor executor, zzcaf zzcafVar, zzfgw zzfgwVar, zzfgy zzfgyVar) {
        super(executor, zzcafVar, zzfgyVar);
        this.zzf = zzfgwVar;
        zzfgwVar.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
