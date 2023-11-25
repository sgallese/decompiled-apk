package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzxe {
    public final zzcy zza;
    public final int[] zzb;

    public zzxe(zzcy zzcyVar, int[] iArr, int i10) {
        if (iArr.length == 0) {
            zzes.zzd("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzcyVar;
        this.zzb = iArr;
    }
}
