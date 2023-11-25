package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzvp {
    private int zza;
    private final SparseArray zzb;
    private final zzec zzc;

    public zzvp() {
        zzvo zzvoVar = new zzec() { // from class: com.google.android.gms.internal.ads.zzvo
        };
        throw null;
    }

    public final Object zza(int i10) {
        if (this.zza == -1) {
            this.zza = 0;
        }
        while (true) {
            int i11 = this.zza;
            if (i11 > 0 && i10 < this.zzb.keyAt(i11)) {
                this.zza--;
            }
        }
        while (this.zza < this.zzb.size() - 1 && i10 >= this.zzb.keyAt(this.zza + 1)) {
            this.zza++;
        }
        return this.zzb.valueAt(this.zza);
    }

    public final Object zzb() {
        return this.zzb.valueAt(r0.size() - 1);
    }

    public final void zzc(int i10, Object obj) {
        boolean z10;
        boolean z11 = true;
        if (this.zza == -1) {
            if (this.zzb.size() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdy.zzf(z10);
            this.zza = 0;
        }
        if (this.zzb.size() > 0) {
            int keyAt = this.zzb.keyAt(r0.size() - 1);
            if (i10 < keyAt) {
                z11 = false;
            }
            zzdy.zzd(z11);
            if (keyAt == i10) {
                zzvi.zzl((zzvg) this.zzb.valueAt(r0.size() - 1));
            }
        }
        this.zzb.append(i10, obj);
    }

    public final void zzd() {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzvi.zzl((zzvg) this.zzb.valueAt(i10));
        }
        this.zza = -1;
        this.zzb.clear();
    }

    public final void zze(int i10) {
        int i11 = 0;
        while (i11 < this.zzb.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.zzb.keyAt(i12)) {
                zzvi.zzl((zzvg) this.zzb.valueAt(i11));
                this.zzb.removeAt(i11);
                int i13 = this.zza;
                if (i13 > 0) {
                    this.zza = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public final boolean zzf() {
        if (this.zzb.size() == 0) {
            return true;
        }
        return false;
    }

    public zzvp(zzec zzecVar) {
        this.zzb = new SparseArray();
        this.zzc = zzecVar;
        this.zza = -1;
    }
}
