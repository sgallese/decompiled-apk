package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzftp extends zzfts {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftp() {
        super(null);
    }

    static final zzfts zzf(int i10) {
        zzfts zzftsVar;
        zzfts zzftsVar2;
        zzfts zzftsVar3;
        if (i10 < 0) {
            zzftsVar3 = zzfts.zzb;
            return zzftsVar3;
        } else if (i10 > 0) {
            zzftsVar2 = zzfts.zzc;
            return zzftsVar2;
        } else {
            zzftsVar = zzfts.zza;
            return zzftsVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzb(int i10, int i11) {
        int i12;
        if (i10 < i11) {
            i12 = -1;
        } else if (i10 > i11) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return zzf(i12);
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zzd(boolean z10, boolean z11) {
        return zzf(zzfwk.zza(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final zzfts zze(boolean z10, boolean z11) {
        return zzf(zzfwk.zza(false, false));
    }
}
