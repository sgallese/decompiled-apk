package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdss implements zzdsg {
    private final long zza;
    private final zzelf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdss(long j10, Context context, zzdsl zzdslVar, zzchd zzchdVar, String str) {
        this.zza = j10;
        zzezj zzu = zzchdVar.zzu();
        zzu.zzc(context);
        zzu.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzu.zzb(str);
        zzelf zza = zzu.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdsr(this, zzdslVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdsg
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
