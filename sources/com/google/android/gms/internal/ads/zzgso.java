package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgso {
    private static final zzgso zza;
    private static final zzgso zzb;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzgsl, com.google.android.gms.internal.ads.zzgsj] */
    static {
        ?? r12 = 0;
        zza = new zzgsk(r12);
        zzb = new zzgsm(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgso(zzgsn zzgsnVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgso zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgso zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List zza(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(Object obj, Object obj2, long j10);
}
