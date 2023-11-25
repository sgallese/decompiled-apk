package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzbwv implements zzfya {
    final /* synthetic */ com.google.common.util.concurrent.a zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwv(zzbww zzbwwVar, com.google.common.util.concurrent.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final void zza(Throwable th) {
        List list;
        list = zzbww.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r22 = (Void) obj;
        list = zzbww.zzc;
        list.remove(this.zza);
    }
}
