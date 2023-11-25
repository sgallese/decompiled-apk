package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzvs {
    public final int zzc;
    private final zzfud zze;
    private int zzf;
    public static final zzvs zza = new zzvs(new zzcy[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzvr
    };

    public zzvs(zzcy... zzcyVarArr) {
        this.zze = zzfud.zzk(zzcyVarArr);
        this.zzc = zzcyVarArr.length;
        int i10 = 0;
        while (i10 < this.zze.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.zze.size(); i12++) {
                if (((zzcy) this.zze.get(i10)).equals(this.zze.get(i12))) {
                    zzes.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvs.class == obj.getClass()) {
            zzvs zzvsVar = (zzvs) obj;
            if (this.zzc == zzvsVar.zzc && this.zze.equals(zzvsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzf;
        if (i10 == 0) {
            int hashCode = this.zze.hashCode();
            this.zzf = hashCode;
            return hashCode;
        }
        return i10;
    }

    public final int zza(zzcy zzcyVar) {
        int indexOf = this.zze.indexOf(zzcyVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcy zzb(int i10) {
        return (zzcy) this.zze.get(i10);
    }
}
