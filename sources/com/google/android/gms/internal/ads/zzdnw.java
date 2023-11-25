package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdnw implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;
    private final zzgzg zzc;

    public zzdnw(zzgzg zzgzgVar, zzgzg zzgzgVar2, zzgzg zzgzgVar3) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
        this.zzc = zzgzgVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* synthetic */ Object zzb() {
        zzgzg zzgzgVar = this.zza;
        zzgzg zzgzgVar2 = this.zzb;
        int i10 = ((zzcvz) this.zzc).zza().zzo.zza;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 != 0) {
                return ((zzeit) zzgzgVar2).zzb();
            }
            return ((zzeit) zzgzgVar).zzb();
        }
        throw null;
    }
}
