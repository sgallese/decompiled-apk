package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzgsr implements zzgsy {
    private final zzgsy[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgsr(zzgsy... zzgsyVarArr) {
        this.zza = zzgsyVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final zzgsx zzb(Class cls) {
        zzgsy[] zzgsyVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzgsy zzgsyVar = zzgsyVarArr[i10];
            if (zzgsyVar.zzc(cls)) {
                return zzgsyVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgsy
    public final boolean zzc(Class cls) {
        zzgsy[] zzgsyVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzgsyVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
