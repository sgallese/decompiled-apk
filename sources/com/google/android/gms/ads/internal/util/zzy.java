package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbbr;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@TargetApi(30)
/* loaded from: classes.dex */
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzn(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzig)).booleanValue()) {
            return 0;
        }
        return super.zzn(context);
    }
}
