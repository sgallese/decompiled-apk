package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzyf implements Runnable {
    private final zzye zza;

    public zzyf(zzye zzyeVar) {
        this.zza = zzyeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzK();
    }
}
