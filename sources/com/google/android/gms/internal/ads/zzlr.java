package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlr {
    public static final zzlr zza;
    public static final zzlr zzb;
    public static final zzlr zzc;
    public static final zzlr zzd;
    public static final zzlr zze;
    public final long zzf;
    public final long zzg;

    static {
        zzlr zzlrVar = new zzlr(0L, 0L);
        zza = zzlrVar;
        zzb = new zzlr(Long.MAX_VALUE, Long.MAX_VALUE);
        zzc = new zzlr(Long.MAX_VALUE, 0L);
        zzd = new zzlr(0L, Long.MAX_VALUE);
        zze = zzlrVar;
    }

    public zzlr(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdy.zzd(z10);
        zzdy.zzd(j11 >= 0);
        this.zzf = j10;
        this.zzg = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlr.class == obj.getClass()) {
            zzlr zzlrVar = (zzlr) obj;
            if (this.zzf == zzlrVar.zzf && this.zzg == zzlrVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
