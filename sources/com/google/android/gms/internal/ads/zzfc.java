package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfc {
    public static final zzfc zza = new zzfc(-1, -1);
    public static final zzfc zzb = new zzfc(0, 0);
    private final int zzc;
    private final int zzd;

    public zzfc(int i10, int i11) {
        boolean z10 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z10 = true;
        }
        zzdy.zzd(z10);
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfc) {
            zzfc zzfcVar = (zzfc) obj;
            if (this.zzc == zzfcVar.zzc && this.zzd == zzfcVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzd;
        int i11 = this.zzc;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public final String toString() {
        return this.zzc + "x" + this.zzd;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
