package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbva extends zzbvc {
    private final String zza;
    private final int zzb;

    public zzbva(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbva)) {
            zzbva zzbvaVar = (zzbva) obj;
            if (Objects.equal(this.zza, zzbvaVar.zza) && Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzbvaVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvd
    public final String zzc() {
        return this.zza;
    }
}
