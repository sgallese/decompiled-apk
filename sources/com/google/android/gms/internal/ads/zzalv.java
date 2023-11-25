package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzalv {
    public final Object zza;
    public final zzaky zzb;
    public final zzaly zzc;
    public boolean zzd;

    private zzalv(zzaly zzalyVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzalyVar;
    }

    public static zzalv zza(zzaly zzalyVar) {
        return new zzalv(zzalyVar);
    }

    public static zzalv zzb(Object obj, zzaky zzakyVar) {
        return new zzalv(obj, zzakyVar);
    }

    public final boolean zzc() {
        if (this.zzc == null) {
            return true;
        }
        return false;
    }

    private zzalv(Object obj, zzaky zzakyVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzakyVar;
        this.zzc = null;
    }
}
