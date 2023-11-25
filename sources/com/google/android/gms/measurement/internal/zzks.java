package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.1 */
/* loaded from: classes3.dex */
public abstract class zzks extends zzkr {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzks(zzlf zzlfVar) {
        super(zzlfVar);
        this.zzf.zzM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzW() {
        if (zzY()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void zzX() {
        if (!this.zza) {
            zzb();
            this.zzf.zzH();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzY() {
        if (this.zza) {
            return true;
        }
        return false;
    }

    protected abstract boolean zzb();
}
