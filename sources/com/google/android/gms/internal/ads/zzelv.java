package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzelv implements zzesj {
    private final Context zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelv(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcF)).booleanValue()) {
            if (androidx.core.content.a.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            return zzfye.zzh(new zzelw(z10));
        }
        return zzfye.zzh(null);
    }
}
