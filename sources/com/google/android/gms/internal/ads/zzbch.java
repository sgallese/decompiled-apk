package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzbch {
    private final Map zza = new HashMap();
    private final zzbcj zzb;

    public zzbch(zzbcj zzbcjVar) {
        this.zzb = zzbcjVar;
    }

    public final zzbcj zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbcg zzbcgVar) {
        this.zza.put(str, zzbcgVar);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbcj zzbcjVar = this.zzb;
        zzbcg zzbcgVar = (zzbcg) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbcgVar != null) {
            zzbcjVar.zze(zzbcgVar, j10, strArr);
        }
        this.zza.put(str, new zzbcg(j10, null, null));
    }
}
