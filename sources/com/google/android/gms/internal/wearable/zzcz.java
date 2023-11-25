package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzcz extends zzdb {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcz(zzcy zzcyVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzdb
    public final void zza(Object obj, long j10) {
        ((zzcn) zzez.zzf(obj, j10)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzdb
    public final void zzb(Object obj, Object obj2, long j10) {
        zzcn zzcnVar = (zzcn) zzez.zzf(obj, j10);
        zzcn zzcnVar2 = (zzcn) zzez.zzf(obj2, j10);
        int size = zzcnVar.size();
        int size2 = zzcnVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzcnVar.zzc()) {
                zzcnVar = zzcnVar.zzd(size2 + size);
            }
            zzcnVar.addAll(zzcnVar2);
        }
        if (size > 0) {
            zzcnVar2 = zzcnVar;
        }
        zzez.zzs(obj, j10, zzcnVar2);
    }

    private zzcz() {
        super(null);
    }
}
