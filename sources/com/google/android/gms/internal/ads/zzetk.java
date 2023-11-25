package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzetk implements zzesj {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzbza zzd;

    public zzetk(zzbza zzbzaVar, Executor executor, String str, PackageInfo packageInfo, int i10) {
        this.zzd = zzbzaVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return zzfye.zzf(zzfye.zzm(zzfye.zzh(this.zzb), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return new zzetl((String) obj);
            }
        }, this.zza), Throwable.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzetj
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzetk.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(Throwable th) throws Exception {
        return zzfye.zzh(new zzetl(this.zzb));
    }
}
