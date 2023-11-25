package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdvw implements zzgyt {
    private final zzgzg zza;

    public zzdvw(zzgzg zzgzgVar) {
        this.zza = zzgzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzchj) this.zza).zza().getPackageName();
        zzgzb.zzb(packageName);
        return packageName;
    }
}
