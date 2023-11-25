package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgtm extends zzgqa {
    final zzgtq zza;
    zzgqc zzb = zzb();
    final /* synthetic */ zzgts zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgtm(zzgts zzgtsVar) {
        this.zzc = zzgtsVar;
        this.zza = new zzgtq(zzgtsVar, null);
    }

    private final zzgqc zzb() {
        zzgtq zzgtqVar = this.zza;
        if (zzgtqVar.hasNext()) {
            return zzgtqVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgqc
    public final byte zza() {
        zzgqc zzgqcVar = this.zzb;
        if (zzgqcVar != null) {
            byte zza = zzgqcVar.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
