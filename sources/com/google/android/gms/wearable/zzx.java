package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzgp;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzx implements Runnable {
    final /* synthetic */ zzgp zza;
    final /* synthetic */ zzag zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzx(zzag zzagVar, zzgp zzgpVar) {
        this.zzb = zzagVar;
        this.zza = zzgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onMessageReceived(this.zza);
    }
}
