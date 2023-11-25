package com.google.android.gms.wearable;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzs extends com.google.android.gms.internal.wearable.zzi {
    final /* synthetic */ WearableListenerService zza;
    private boolean zzb;
    private final zzr zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(WearableListenerService wearableListenerService, Looper looper) {
        super(looper);
        this.zza = wearableListenerService;
        this.zzc = new zzr(wearableListenerService, null);
    }

    private final synchronized void zzc() {
        Intent intent;
        ComponentName componentName;
        if (this.zzb) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.zza.zza;
            Log.v("WearableLS", "bindService: ".concat(String.valueOf(componentName)));
        }
        WearableListenerService wearableListenerService = this.zza;
        intent = wearableListenerService.zzd;
        wearableListenerService.bindService(intent, this.zzc, 1);
        this.zzb = true;
    }

    private final synchronized void zzd(String str) {
        ComponentName componentName;
        if (!this.zzb) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            componentName = this.zza.zza;
            Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(componentName));
        }
        try {
            this.zza.unbindService(this.zzc);
        } catch (RuntimeException e10) {
            Log.e("WearableLS", "Exception when unbinding from local service", e10);
        }
        this.zzb = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.wearable.zzi
    public final void zza(Message message) {
        zzc();
        try {
            super.zza(message);
            if (!hasMessages(0)) {
                zzd("dispatch");
            }
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                zzd("dispatch");
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        getLooper().quit();
        zzd("quit");
    }
}
