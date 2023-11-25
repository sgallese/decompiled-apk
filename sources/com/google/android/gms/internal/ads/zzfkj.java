package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfkj implements Runnable {
    final /* synthetic */ zzfko zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfkj(zzfko zzfkoVar) {
        this.zza = zzfkoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfki zzfkiVar;
        zzfkiVar = this.zza.zzl;
        zzfkiVar.zzb();
    }
}
