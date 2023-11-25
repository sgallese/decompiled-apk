package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxm {
    public final int zza;
    public final zzlq[] zzb;
    public final zzxf[] zzc;
    public final zzdh zzd;
    public final Object zze;

    public zzxm(zzlq[] zzlqVarArr, zzxf[] zzxfVarArr, zzdh zzdhVar, Object obj) {
        this.zzb = zzlqVarArr;
        this.zzc = (zzxf[]) zzxfVarArr.clone();
        this.zzd = zzdhVar;
        this.zze = obj;
        this.zza = zzlqVarArr.length;
    }

    public final boolean zza(zzxm zzxmVar, int i10) {
        if (zzxmVar == null || !zzfk.zzD(this.zzb[i10], zzxmVar.zzb[i10]) || !zzfk.zzD(this.zzc[i10], zzxmVar.zzc[i10])) {
            return false;
        }
        return true;
    }

    public final boolean zzb(int i10) {
        if (this.zzb[i10] != null) {
            return true;
        }
        return false;
    }
}
