package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzaju implements zzajn {
    final /* synthetic */ zzajw zza;
    private final zzfa zzb = new zzfa(new byte[4], 4);

    public zzaju(zzajw zzajwVar) {
        this.zza = zzajwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zza(zzfb zzfbVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (zzfbVar.zzl() != 0 || (zzfbVar.zzl() & 128) == 0) {
            return;
        }
        zzfbVar.zzH(6);
        int zza = zzfbVar.zza() / 4;
        for (int i11 = 0; i11 < zza; i11++) {
            zzfbVar.zzB(this.zzb, 4);
            int zzd = this.zzb.zzd(16);
            this.zzb.zzl(3);
            if (zzd == 0) {
                this.zzb.zzl(13);
            } else {
                int zzd2 = this.zzb.zzd(13);
                sparseArray2 = this.zza.zzf;
                if (sparseArray2.get(zzd2) == null) {
                    zzajw zzajwVar = this.zza;
                    sparseArray3 = zzajwVar.zzf;
                    sparseArray3.put(zzd2, new zzajo(new zzajv(zzajwVar, zzd2)));
                    zzajw zzajwVar2 = this.zza;
                    i10 = zzajwVar2.zzl;
                    zzajwVar2.zzl = i10 + 1;
                }
            }
        }
        sparseArray = this.zza.zzf;
        sparseArray.remove(0);
    }

    @Override // com.google.android.gms.internal.ads.zzajn
    public final void zzb(zzfi zzfiVar, zzabe zzabeVar, zzaka zzakaVar) {
    }
}
