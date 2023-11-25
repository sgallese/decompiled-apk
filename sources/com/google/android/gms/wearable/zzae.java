package com.google.android.gms.wearable;

import com.google.android.gms.wearable.internal.zzbg;
import com.google.android.gms.wearable.internal.zzbj;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
final class zzae implements Runnable {
    final /* synthetic */ zzbj zza;
    final /* synthetic */ zzag zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzae(zzag zzagVar, zzbj zzbjVar) {
        this.zzb = zzagVar;
        this.zza = zzbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbg zzbgVar;
        this.zza.zza(this.zzb.zza);
        zzbj zzbjVar = this.zza;
        zzbgVar = this.zzb.zza.zzh;
        zzbjVar.zza(zzbgVar);
    }
}
