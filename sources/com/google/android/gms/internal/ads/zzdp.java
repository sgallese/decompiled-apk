package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdp {
    public static final zzdp zza = new zzdp(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdp(int i10, int i11, int i12) {
        int i13;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        if (zzfk.zzE(i12)) {
            i13 = zzfk.zzl(i12, i11);
        } else {
            i13 = -1;
        }
        this.zze = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdp)) {
            return false;
        }
        zzdp zzdpVar = (zzdp) obj;
        if (this.zzb == zzdpVar.zzb && this.zzc == zzdpVar.zzc && this.zzd == zzdpVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.zzb + ", channelCount=" + this.zzc + ", encoding=" + this.zzd + "]";
    }
}
