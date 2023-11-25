package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzaa {
    private String zza;
    private final long zzb;
    private final Map zzc;

    public zzaa(String str, long j10, Map map) {
        this.zza = str;
        this.zzb = j10;
        HashMap hashMap = new HashMap();
        this.zzc = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.zzb != zzaaVar.zzb || !this.zza.equals(zzaaVar.zza)) {
            return false;
        }
        return this.zzc.equals(zzaaVar.zzc);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        long j10 = this.zzb;
        return ((hashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.zzc.hashCode();
    }

    public final String toString() {
        return "Event{name='" + this.zza + "', timestamp=" + this.zzb + ", params=" + this.zzc.toString() + "}";
    }

    public final long zza() {
        return this.zzb;
    }

    /* renamed from: zzb  reason: merged with bridge method [inline-methods] */
    public final zzaa clone() {
        return new zzaa(this.zza, this.zzb, new HashMap(this.zzc));
    }

    public final Object zzc(String str) {
        if (this.zzc.containsKey(str)) {
            return this.zzc.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.zza;
    }

    public final Map zze() {
        return this.zzc;
    }

    public final void zzf(String str) {
        this.zza = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.zzc.remove(str);
        } else {
            this.zzc.put(str, obj);
        }
    }
}
