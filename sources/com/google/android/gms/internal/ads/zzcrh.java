package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcrh implements zzgyt {
    private final zzgzg zza;

    public zzcrh(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzcvz) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfs)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
