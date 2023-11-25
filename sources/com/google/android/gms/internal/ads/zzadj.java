package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzadj {
    protected final zzace zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzadj(zzace zzaceVar) {
        this.zza = zzaceVar;
    }

    protected abstract boolean zza(zzfb zzfbVar) throws zzcd;

    protected abstract boolean zzb(zzfb zzfbVar, long j10) throws zzcd;

    public final boolean zzf(zzfb zzfbVar, long j10) throws zzcd {
        if (zza(zzfbVar) && zzb(zzfbVar, j10)) {
            return true;
        }
        return false;
    }
}
