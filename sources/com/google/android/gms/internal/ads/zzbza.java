package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbza {
    public final com.google.common.util.concurrent.a zza(Context context, int i10) {
        zzcas zzcasVar = new zzcas();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzt.zzt(context)) {
            zzcan.zza.execute(new zzbyz(this, context, zzcasVar));
        }
        return zzcasVar;
    }
}
