package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzle {
    final String zza;
    long zzb;

    private zzle(zzlf zzlfVar, String str) {
        this.zza = str;
        this.zzb = zzlfVar.zzax().elapsedRealtime();
    }
}
