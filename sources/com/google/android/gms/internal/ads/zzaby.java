package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaby {
    public final zzacb zza;
    public final zzacb zzb;

    public zzaby(zzacb zzacbVar, zzacb zzacbVar2) {
        this.zza = zzacbVar;
        this.zzb = zzacbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaby.class == obj.getClass()) {
            zzaby zzabyVar = (zzaby) obj;
            if (this.zza.equals(zzabyVar.zza) && this.zzb.equals(zzabyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String concat;
        String obj = this.zza.toString();
        if (this.zza.equals(this.zzb)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return "[" + obj + concat + "]";
    }
}
