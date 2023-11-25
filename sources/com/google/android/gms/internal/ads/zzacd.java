package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacd {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzacd(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacd.class == obj.getClass()) {
            zzacd zzacdVar = (zzacd) obj;
            if (this.zza == zzacdVar.zza && this.zzc == zzacdVar.zzc && this.zzd == zzacdVar.zzd && Arrays.equals(this.zzb, zzacdVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
