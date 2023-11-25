package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbsu extends zzbsq {
    final /* synthetic */ UpdateImpressionUrlsCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsu(zzbsz zzbszVar, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza = updateImpressionUrlsCallback;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zze(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(List list) {
        this.zza.onSuccess(list);
    }
}
