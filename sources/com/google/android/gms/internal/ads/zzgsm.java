package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgsm extends zzgso {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzgsm(zzgsl zzgslVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final List zza(Object obj, long j10) {
        int i10;
        zzgrz zzgrzVar = (zzgrz) zzguu.zzh(obj, j10);
        if (!zzgrzVar.zzc()) {
            int size = zzgrzVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzgrz zzd = zzgrzVar.zzd(i10);
            zzguu.zzv(obj, j10, zzd);
            return zzd;
        }
        return zzgrzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final void zzb(Object obj, long j10) {
        ((zzgrz) zzguu.zzh(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgso
    public final void zzc(Object obj, Object obj2, long j10) {
        zzgrz zzgrzVar = (zzgrz) zzguu.zzh(obj, j10);
        zzgrz zzgrzVar2 = (zzgrz) zzguu.zzh(obj2, j10);
        int size = zzgrzVar.size();
        int size2 = zzgrzVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgrzVar.zzc()) {
                zzgrzVar = zzgrzVar.zzd(size2 + size);
            }
            zzgrzVar.addAll(zzgrzVar2);
        }
        if (size > 0) {
            zzgrzVar2 = zzgrzVar;
        }
        zzguu.zzv(obj, j10, zzgrzVar2);
    }

    private zzgsm() {
        super(null);
    }
}
