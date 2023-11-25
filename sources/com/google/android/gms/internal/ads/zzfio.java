package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfio {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfke.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfjo.zzb().zzd(context);
            zzfjg.zza().zzd(context);
            zzfjy.zzb(context);
            zzfjz.zzd(context);
            zzfkc.zza(context);
            zzfjl.zzb().zzc(context);
            zzfjf.zza().zzd(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
