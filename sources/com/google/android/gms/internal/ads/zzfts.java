package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfts {
    private static final zzfts zza = new zzftp();
    private static final zzfts zzb = new zzftq(-1);
    private static final zzfts zzc = new zzftq(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfts(zzftr zzftrVar) {
    }

    public static zzfts zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfts zzb(int i10, int i11);

    public abstract zzfts zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfts zzd(boolean z10, boolean z11);

    public abstract zzfts zze(boolean z10, boolean z11);
}
