package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzom {
    public static final zzom zza = new zzok().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzom(zzok zzokVar, zzol zzolVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        z10 = zzokVar.zza;
        this.zzb = z10;
        z11 = zzokVar.zzb;
        this.zzc = z11;
        z12 = zzokVar.zzc;
        this.zzd = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzom.class == obj.getClass()) {
            zzom zzomVar = (zzom) obj;
            if (this.zzb == zzomVar.zzb && this.zzc == zzomVar.zzc && this.zzd == zzomVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzb ? 1 : 0) << 2;
        boolean z10 = this.zzc;
        return i10 + (z10 ? 1 : 0) + (z10 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
