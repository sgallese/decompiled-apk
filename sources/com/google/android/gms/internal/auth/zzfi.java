package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes3.dex */
final class zzfi extends zzfk {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfi(zzfh zzfhVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zza(Object obj, long j10) {
        ((zzey) zzhi.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.auth.zzfk
    public final void zzb(Object obj, Object obj2, long j10) {
        zzey zzeyVar = (zzey) zzhi.zzf(obj, j10);
        zzey zzeyVar2 = (zzey) zzhi.zzf(obj2, j10);
        int size = zzeyVar.size();
        int size2 = zzeyVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzeyVar.zzc()) {
                zzeyVar = zzeyVar.zzd(size2 + size);
            }
            zzeyVar.addAll(zzeyVar2);
        }
        if (size > 0) {
            zzeyVar2 = zzeyVar;
        }
        zzhi.zzp(obj, j10, zzeyVar2);
    }

    private zzfi() {
        super(null);
    }
}
