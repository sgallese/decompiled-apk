package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzhg;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzy implements Runnable {
    final /* synthetic */ zzhg zza;
    final /* synthetic */ zzag zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzy(zzag zzagVar, zzhg zzhgVar) {
        this.zzb = zzagVar;
        this.zza = zzhgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.onPeerConnected(this.zza);
    }
}
