package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzhx {
    private final Context zza;
    private final zzhv zzb;

    public zzhx(Context context, Handler handler, zzhw zzhwVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzhv(this, handler, zzhwVar);
    }
}
