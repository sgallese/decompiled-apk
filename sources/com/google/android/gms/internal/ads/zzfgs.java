package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfgs {
    public final String zza;
    public final String zzb;

    public zzfgs(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfgs)) {
            return false;
        }
        zzfgs zzfgsVar = (zzfgs) obj;
        if (this.zza.equals(zzfgsVar.zza) && this.zzb.equals(zzfgsVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
