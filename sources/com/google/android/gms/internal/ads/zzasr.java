package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasr implements Callable {
    private final zzary zza;
    private final zzanv zzb;

    public zzasr(zzary zzaryVar, zzanv zzanvVar) {
        this.zza = zzaryVar;
        this.zzb = zzanvVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaos zzc = this.zza.zzc();
        if (zzc != null) {
            try {
                synchronized (this.zzb) {
                    zzanv zzanvVar = this.zzb;
                    byte[] zzax = zzc.zzax();
                    zzanvVar.zzak(zzax, 0, zzax.length, zzgrc.zza());
                }
                return null;
            } catch (zzgsc | NullPointerException unused) {
                return null;
            }
        }
        return null;
    }
}
