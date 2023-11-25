package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfxr extends zzfxd {
    private zzfxq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfxr(zzfty zzftyVar, boolean z10, Executor executor, Callable callable) {
        super(zzftyVar, z10, false);
        this.zza = new zzfxp(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzfws
    protected final void zzq() {
        zzfxq zzfxqVar = this.zza;
        if (zzfxqVar != null) {
            zzfxqVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzu() {
        zzfxq zzfxqVar = this.zza;
        if (zzfxqVar != null) {
            zzfxqVar.zzf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfxd
    public final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    final void zzf(int i10, Object obj) {
    }
}
