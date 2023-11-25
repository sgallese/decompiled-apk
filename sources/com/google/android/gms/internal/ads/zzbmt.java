package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmt extends zzcaz {
    private final com.google.android.gms.ads.internal.util.zzbb zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbmt(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        this.zzb = zzbbVar;
    }

    public final zzbmo zza() {
        boolean z10;
        zzbmo zzbmoVar = new zzbmo(this);
        synchronized (this.zza) {
            zzi(new zzbmp(this, zzbmoVar), new zzbmq(this, zzbmoVar));
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            this.zzd++;
        }
        return zzbmoVar;
    }

    public final void zzb() {
        boolean z10;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzc();
        }
    }

    protected final void zzc() {
        boolean z10;
        synchronized (this.zza) {
            if (this.zzd >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            if (this.zzc && this.zzd == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zzi(new zzbms(this), new zzcav());
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd() {
        boolean z10;
        synchronized (this.zza) {
            if (this.zzd > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Preconditions.checkState(z10);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzc();
        }
    }
}
