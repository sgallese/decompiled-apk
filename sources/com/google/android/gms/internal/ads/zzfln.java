package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzfln {
    private final Context zza;
    private final Looper zzb;

    public zzfln(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfmb zza = zzfmd.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfly zza2 = zzflz.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzflo(this.zza, this.zzb, (zzfmd) zza.zzal()).zza();
    }
}
