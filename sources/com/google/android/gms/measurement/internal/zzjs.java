package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzjs implements Runnable {
    final /* synthetic */ ComponentName zza;
    final /* synthetic */ zzjw zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzjs(zzjw zzjwVar, ComponentName componentName) {
        this.zzb = zzjwVar;
        this.zza = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjx.zzo(this.zzb.zza, this.zza);
    }
}
