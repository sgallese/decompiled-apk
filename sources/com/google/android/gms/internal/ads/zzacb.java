package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzacb {
    public static final zzacb zza = new zzacb(0, 0);
    public final long zzb;
    public final long zzc;

    public zzacb(long j10, long j11) {
        this.zzb = j10;
        this.zzc = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacb.class == obj.getClass()) {
            zzacb zzacbVar = (zzacb) obj;
            if (this.zzb == zzacbVar.zzb && this.zzc == zzacbVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        return "[timeUs=" + this.zzb + ", position=" + this.zzc + "]";
    }
}
