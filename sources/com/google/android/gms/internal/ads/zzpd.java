package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzpd extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzpd(int i10, zzam zzamVar, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzamVar;
    }
}
