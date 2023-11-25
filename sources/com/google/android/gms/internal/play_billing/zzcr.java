package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzcr extends zzct {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcr(zzcq zzcqVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zza(Object obj, long j10) {
        ((zzcf) zzeq.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.zzct
    public final void zzb(Object obj, Object obj2, long j10) {
        zzcf zzcfVar = (zzcf) zzeq.zzf(obj, j10);
        zzcf zzcfVar2 = (zzcf) zzeq.zzf(obj2, j10);
        int size = zzcfVar.size();
        int size2 = zzcfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzcfVar.zzc()) {
                zzcfVar = zzcfVar.zzd(size2 + size);
            }
            zzcfVar.addAll(zzcfVar2);
        }
        if (size > 0) {
            zzcfVar2 = zzcfVar;
        }
        zzeq.zzs(obj, j10, zzcfVar2);
    }

    private zzcr() {
        super(null);
    }
}
