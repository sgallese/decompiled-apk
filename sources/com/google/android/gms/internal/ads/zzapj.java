package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzapj extends zzaph {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzapj() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    @Override // com.google.android.gms.internal.ads.zzaph
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }

    public zzapj(String str) {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
        HashMap zza = zzaph.zza(str);
        if (zza != null) {
            this.zza = zza.get(0) == null ? "E" : (String) zza.get(0);
            this.zzb = zza.get(1) != null ? ((Long) zza.get(1)).longValue() : -1L;
            this.zzc = zza.get(2) == null ? "E" : (String) zza.get(2);
            this.zzd = zza.get(3) == null ? "E" : (String) zza.get(3);
            this.zze = zza.get(4) != null ? (String) zza.get(4) : "E";
        }
    }
}
