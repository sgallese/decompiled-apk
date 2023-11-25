package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeoc implements zzesj {
    private final zzfyo zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeoc(zzfyo zzfyoVar, Context context) {
        this.zza = zzfyoVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    @SuppressLint({"UnprotectedReceiver"})
    public final com.google.common.util.concurrent.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeob
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeoc.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeod zzc() throws Exception {
        Intent registerReceiver;
        double d10;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjT)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = this.zzb.registerReceiver(null, intentFilter);
        }
        boolean z10 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
            d10 = intExtra2 / intExtra3;
        } else {
            d10 = -1.0d;
        }
        return new zzeod(d10, z10);
    }
}
