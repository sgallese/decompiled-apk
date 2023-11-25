package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzgc implements zzgi {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgn zzd;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgc(boolean z10) {
        this.zza = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzgi
    public final void zzf(zzhk zzhkVar) {
        zzhkVar.getClass();
        if (!this.zzb.contains(zzhkVar)) {
            this.zzb.add(zzhkVar);
            this.zzc++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg(int i10) {
        zzgn zzgnVar = this.zzd;
        int i11 = zzfk.zza;
        for (int i12 = 0; i12 < this.zzc; i12++) {
            ((zzhk) this.zzb.get(i12)).zza(this, zzgnVar, this.zza, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzh() {
        zzgn zzgnVar = this.zzd;
        int i10 = zzfk.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhk) this.zzb.get(i11)).zzb(this, zzgnVar, this.zza);
        }
        this.zzd = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzi(zzgn zzgnVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhk) this.zzb.get(i10)).zzc(this, zzgnVar, this.zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzj(zzgn zzgnVar) {
        this.zzd = zzgnVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhk) this.zzb.get(i10)).zzd(this, zzgnVar, this.zza);
        }
    }
}
