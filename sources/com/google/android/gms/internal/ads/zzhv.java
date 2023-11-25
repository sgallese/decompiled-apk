package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzhv extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzhx zza;
    private final zzhw zzb;
    private final Handler zzc;

    public zzhv(zzhx zzhxVar, Handler handler, zzhw zzhwVar) {
        this.zza = zzhxVar;
        this.zzc = handler;
        this.zzb = zzhwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
