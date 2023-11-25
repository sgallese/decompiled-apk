package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.1 */
/* loaded from: classes3.dex */
public abstract class zzlw {
    private static final zzlw zza;
    private static final zzlw zzb;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlr] */
    static {
        ?? r12 = 0;
        zza = new zzls(r12);
        zzb = new zzlu(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzlw(zzlv zzlvVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlw zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlw zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, Object obj2, long j10);
}
