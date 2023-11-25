package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbsx extends zzbsq {
    final /* synthetic */ List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbsx(zzbsz zzbszVar, List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zze(String str) {
        zzcaa.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(List list) {
        zzcaa.zzi("Recorded click: ".concat(this.zza.toString()));
    }
}
