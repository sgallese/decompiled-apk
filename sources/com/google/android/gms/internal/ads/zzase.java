package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzase extends BroadcastReceiver {
    final /* synthetic */ zzasf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzase(zzasf zzasfVar) {
        this.zza = zzasfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
