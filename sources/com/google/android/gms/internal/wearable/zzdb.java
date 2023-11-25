package com.google.android.gms.internal.wearable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public abstract class zzdb {
    private static final zzdb zza;
    private static final zzdb zzb;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.wearable.zzcy, com.google.android.gms.internal.wearable.zzcw] */
    static {
        ?? r12 = 0;
        zza = new zzcx(r12);
        zzb = new zzcz(r12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdb(zzda zzdaVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdb zzc() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzdb zzd() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(Object obj, long j10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, Object obj2, long j10);
}
