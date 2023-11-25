package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public abstract class zzf extends zze {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzf(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        if (zze()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzb() {
        if (!this.zza) {
            if (!zzf()) {
                this.zzt.zzB();
                this.zza = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzc() {
        if (!this.zza) {
            zzd();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zze() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    protected abstract boolean zzf();

    protected void zzd() {
    }
}
