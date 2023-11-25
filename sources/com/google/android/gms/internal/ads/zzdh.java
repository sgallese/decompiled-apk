package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdh {
    private final zzfud zzd;
    public static final zzdh zza = new zzdh(zzfud.zzl());
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzde
    };

    public zzdh(List list) {
        this.zzd = zzfud.zzj(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdh.class == obj.getClass()) {
            return this.zzd.equals(((zzdh) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfud zza() {
        return this.zzd;
    }

    public final boolean zzb(int i10) {
        for (int i11 = 0; i11 < this.zzd.size(); i11++) {
            zzdg zzdgVar = (zzdg) this.zzd.get(i11);
            if (zzdgVar.zzc() && zzdgVar.zza() == i10) {
                return true;
            }
        }
        return false;
    }
}
