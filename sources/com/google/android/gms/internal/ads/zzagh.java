package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzagh extends zzagj {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzagh(int i10, long j10) {
        super(i10);
        this.zza = j10;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzagj
    public final String toString() {
        return zzagj.zzf(this.zzd) + " leaves: " + Arrays.toString(this.zzb.toArray()) + " containers: " + Arrays.toString(this.zzc.toArray());
    }

    public final zzagh zza(int i10) {
        int size = this.zzc.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagh zzaghVar = (zzagh) this.zzc.get(i11);
            if (zzaghVar.zzd == i10) {
                return zzaghVar;
            }
        }
        return null;
    }

    public final zzagi zzb(int i10) {
        int size = this.zzb.size();
        for (int i11 = 0; i11 < size; i11++) {
            zzagi zzagiVar = (zzagi) this.zzb.get(i11);
            if (zzagiVar.zzd == i10) {
                return zzagiVar;
            }
        }
        return null;
    }

    public final void zzc(zzagh zzaghVar) {
        this.zzc.add(zzaghVar);
    }

    public final void zzd(zzagi zzagiVar) {
        this.zzb.add(zzagiVar);
    }
}
