package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
public class zzke {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzke(zzkd zzkdVar) {
    }

    public static int zzb(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static long zzc(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }
}
