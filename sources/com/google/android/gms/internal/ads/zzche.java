package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzche {
    private zzcag zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzche zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzche zzd(zzcag zzcagVar) {
        this.zza = zzcagVar;
        return this;
    }
}
