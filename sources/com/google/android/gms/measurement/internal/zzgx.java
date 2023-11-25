package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public abstract class zzgx extends zzgw {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzt.zzD();
    }

    protected abstract boolean zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv() {
        if (zzy()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzw() {
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

    public final void zzx() {
        if (!this.zza) {
            zzaC();
            this.zzt.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzy() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    protected void zzaC() {
    }
}
