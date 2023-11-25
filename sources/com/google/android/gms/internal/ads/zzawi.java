package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzawi implements Runnable {
    final /* synthetic */ zzawm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawi(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawm.zzh(this.zza);
    }
}
