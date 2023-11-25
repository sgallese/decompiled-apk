package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzgyr implements zzgyt {
    private zzgzg zza;

    public static void zza(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        zzgyr zzgyrVar = (zzgyr) zzgzgVar;
        if (zzgyrVar.zza == null) {
            zzgyrVar.zza = zzgzgVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final Object zzb() {
        zzgzg zzgzgVar = this.zza;
        if (zzgzgVar != null) {
            return zzgzgVar.zzb();
        }
        throw new IllegalStateException();
    }
}
