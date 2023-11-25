package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdxx {
    private final zzfyo zza;
    private final zzfyo zzb;
    private final zzdys zzc;
    private final zzgyn zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdxx(zzfyo zzfyoVar, zzfyo zzfyoVar2, zzdys zzdysVar, zzgyn zzgynVar) {
        this.zza = zzfyoVar;
        this.zzb = zzfyoVar2;
        this.zzc = zzdysVar;
        this.zzd = zzgynVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(zzbtv zzbtvVar) throws Exception {
        return this.zzc.zza(zzbtvVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkp)).longValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(zzbtv zzbtvVar, int i10, zzdxh zzdxhVar) throws Exception {
        return ((zzdzy) this.zzd.zzb()).zzb(zzbtvVar, i10);
    }

    public final com.google.common.util.concurrent.a zzc(final zzbtv zzbtvVar) {
        com.google.common.util.concurrent.a zzf;
        String str = zzbtvVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzz(str)) {
            zzf = zzfye.zzg(new zzdxh(1, "Ads service proxy force local"));
        } else {
            zzf = zzfye.zzf(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzdxu
                @Override // com.google.android.gms.internal.ads.zzfxk
                public final com.google.common.util.concurrent.a zza() {
                    return zzdxx.this.zza(zzbtvVar);
                }
            }, this.zza), ExecutionException.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxv
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final com.google.common.util.concurrent.a zza(Object obj) {
                    Throwable th = (ExecutionException) obj;
                    if (th.getCause() != null) {
                        th = th.getCause();
                    }
                    return zzfye.zzg(th);
                }
            }, this.zzb);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfye.zzf(zzf, zzdxh.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdxw
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdxx.this.zzb(zzbtvVar, callingUid, (zzdxh) obj);
            }
        }, this.zzb);
    }
}
