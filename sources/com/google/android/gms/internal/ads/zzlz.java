package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzlz {
    private final zzah zza;
    private final SparseArray zzb;

    public zzlz(zzah zzahVar, SparseArray sparseArray) {
        this.zza = zzahVar;
        SparseArray sparseArray2 = new SparseArray(zzahVar.zzb());
        for (int i10 = 0; i10 < zzahVar.zzb(); i10++) {
            int zza = zzahVar.zza(i10);
            zzly zzlyVar = (zzly) sparseArray.get(zza);
            zzlyVar.getClass();
            sparseArray2.append(zza, zzlyVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzly zzc(int i10) {
        zzly zzlyVar = (zzly) this.zzb.get(i10);
        zzlyVar.getClass();
        return zzlyVar;
    }

    public final boolean zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
