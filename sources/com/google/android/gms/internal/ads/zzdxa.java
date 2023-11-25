package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzdxa implements zzczd {
    private final Context zza;
    private final zzbyf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxa(Context context, zzbyf zzbyfVar) {
        this.zza = context;
        this.zzb = zzbyfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        if (!TextUtils.isEmpty(zzfbrVar.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfbrVar.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfbrVar.zzb.zzb.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
    }
}
