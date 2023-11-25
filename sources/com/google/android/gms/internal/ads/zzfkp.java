package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfkp extends zzfkq {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfkp(zzfki zzfkiVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfkiVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
