package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzatk implements Runnable {
    final /* synthetic */ zzatl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzatk(zzatl zzatlVar) {
        this.zza = zzatlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzatl.zzb(this.zza);
    }
}
