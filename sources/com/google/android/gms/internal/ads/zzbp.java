package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbp {
    public final String zzc;
    public final zzbi zzd;
    @Deprecated
    public final zzbi zze;
    public final zzbf zzf;
    public final zzbv zzg;
    public final zzav zzh;
    @Deprecated
    public final zzax zzi;
    public final zzbl zzj;
    public static final zzbp zza = new zzar().zzc();
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzao
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbp(String str, zzax zzaxVar, zzbi zzbiVar, zzbf zzbfVar, zzbv zzbvVar, zzbl zzblVar, zzbo zzboVar) {
        this.zzc = str;
        this.zzd = zzbiVar;
        this.zze = zzbiVar;
        this.zzf = zzbfVar;
        this.zzg = zzbvVar;
        this.zzh = zzaxVar;
        this.zzi = zzaxVar;
        this.zzj = zzblVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbp)) {
            return false;
        }
        zzbp zzbpVar = (zzbp) obj;
        if (zzfk.zzD(this.zzc, zzbpVar.zzc) && this.zzh.equals(zzbpVar.zzh) && zzfk.zzD(this.zzd, zzbpVar.zzd) && zzfk.zzD(this.zzf, zzbpVar.zzf) && zzfk.zzD(this.zzg, zzbpVar.zzg) && zzfk.zzD(this.zzj, zzbpVar.zzj)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzc.hashCode() * 31;
        zzbi zzbiVar = this.zzd;
        if (zzbiVar != null) {
            i10 = zzbiVar.hashCode();
        } else {
            i10 = 0;
        }
        return (((((((hashCode + i10) * 31) + this.zzf.hashCode()) * 31) + this.zzh.hashCode()) * 31) + this.zzg.hashCode()) * 31;
    }
}
