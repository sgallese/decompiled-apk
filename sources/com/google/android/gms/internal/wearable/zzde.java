package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzde implements zzdl {
    private final zzdl[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzde(zzdl... zzdlVarArr) {
        this.zza = zzdlVarArr;
    }

    @Override // com.google.android.gms.internal.wearable.zzdl
    public final zzdk zzb(Class cls) {
        zzdl[] zzdlVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            zzdl zzdlVar = zzdlVarArr[i10];
            if (zzdlVar.zzc(cls)) {
                return zzdlVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.wearable.zzdl
    public final boolean zzc(Class cls) {
        zzdl[] zzdlVarArr = this.zza;
        for (int i10 = 0; i10 < 2; i10++) {
            if (zzdlVarArr[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
