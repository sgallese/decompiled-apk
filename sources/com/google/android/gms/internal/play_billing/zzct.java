package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public abstract class zzct {
    private static final zzct zza;
    private static final zzct zzb;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.play_billing.zzcq, com.google.android.gms.internal.play_billing.zzco] */
    static {
        ?? r12 = 0;
        zza = new zzcp(r12);
        zzb = new zzcr(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzct(zzcs zzcsVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzct zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzct zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, Object obj2, long j10);
}
