package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzer extends zzep {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* synthetic */ int zza(Object obj) {
        return ((zzeq) obj).zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzeq) obj).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzeq zzeqVar = zzcgVar.zzc;
        if (zzeqVar == zzeq.zzc()) {
            zzeq zzf = zzeq.zzf();
            zzcgVar.zzc = zzf;
            return zzf;
        }
        return zzeqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzcg) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzeq.zzc().equals(obj2)) {
            if (zzeq.zzc().equals(obj)) {
                return zzeq.zze((zzeq) obj, (zzeq) obj2);
            }
            ((zzeq) obj).zzd((zzeq) obj2);
            return obj;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, long j10) {
        ((zzeq) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final void zzg(Object obj) {
        ((zzcg) obj).zzc.zzh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzcg) obj).zzc = (zzeq) obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.wearable.zzep
    public final /* synthetic */ void zzi(Object obj, zzfh zzfhVar) throws IOException {
        ((zzeq) obj).zzk(zzfhVar);
    }
}
