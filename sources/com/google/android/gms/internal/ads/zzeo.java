package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeo {
    public final Object zza;
    private zzaf zzb = new zzaf();
    private boolean zzc;
    private boolean zzd;

    public zzeo(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzeo.class == obj.getClass()) {
            return this.zza.equals(((zzeo) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i10, zzem zzemVar) {
        if (!this.zzd) {
            if (i10 != -1) {
                this.zzb.zza(i10);
            }
            this.zzc = true;
            zzemVar.zza(this.zza);
        }
    }

    public final void zzb(zzen zzenVar) {
        if (!this.zzd && this.zzc) {
            zzah zzb = this.zzb.zzb();
            this.zzb = new zzaf();
            this.zzc = false;
            zzenVar.zza(this.zza, zzb);
        }
    }

    public final void zzc(zzen zzenVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzc = false;
            zzenVar.zza(this.zza, this.zzb.zzb());
        }
    }
}
