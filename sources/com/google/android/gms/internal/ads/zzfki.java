package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfki {
    private JSONObject zza;
    private final zzfkr zzb;

    public zzfki(zzfkr zzfkrVar) {
        this.zzb = zzfkrVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfks(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfkt(this, hashSet, jSONObject, j10));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfku(this, hashSet, jSONObject, j10));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
