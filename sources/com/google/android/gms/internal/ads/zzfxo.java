package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
abstract class zzfxo extends zzfxd {
    private List zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxo(zzfty zzftyVar, boolean z10) {
        super(zzftyVar, z10, true);
        List zza;
        if (zzftyVar.isEmpty()) {
            zza = Collections.emptyList();
        } else {
            zza = zzfur.zza(zzftyVar.size());
        }
        for (int i10 = 0; i10 < zzftyVar.size(); i10++) {
            zza.add(null);
        }
        this.zza = zza;
    }

    abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzfxn(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxd
    public final void zzy(int i10) {
        super.zzy(i10);
        this.zza = null;
    }
}
