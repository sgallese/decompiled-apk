package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbkj implements zzfxl {
    final /* synthetic */ zzbkb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbkj(zzbkn zzbknVar, zzbkb zzbkbVar) {
        this.zza = zzbkbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) throws Exception {
        zzcas zzcasVar = new zzcas();
        ((zzbkh) obj).zze(this.zza, new zzbki(this, zzcasVar));
        return zzcasVar;
    }
}
