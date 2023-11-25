package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgzf implements zzgzg {
    private static final Object zza = new Object();
    private volatile zzgzg zzb;
    private volatile Object zzc = zza;

    private zzgzf(zzgzg zzgzgVar) {
        this.zzb = zzgzgVar;
    }

    public static zzgzg zza(zzgzg zzgzgVar) {
        if (!(zzgzgVar instanceof zzgzf) && !(zzgzgVar instanceof zzgys)) {
            return new zzgzf(zzgzgVar);
        }
        return zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzgzg zzgzgVar = this.zzb;
            if (zzgzgVar == null) {
                return this.zzc;
            }
            Object zzb = zzgzgVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
