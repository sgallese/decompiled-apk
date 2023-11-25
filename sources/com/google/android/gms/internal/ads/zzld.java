package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzld implements zzku {
    public final zztn zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzld(zztu zztuVar, boolean z10) {
        this.zza = new zztn(zztuVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final zzcw zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzku
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i10) {
        this.zzd = i10;
        this.zze = false;
        this.zzc.clear();
    }
}
