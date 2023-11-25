package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzkk extends zzap {
    final /* synthetic */ zzkl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkk(zzkl zzklVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzklVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        zzkl zzklVar = this.zza;
        zzklVar.zzc.zzg();
        zzklVar.zzd(false, false, zzklVar.zzc.zzt.zzax().elapsedRealtime());
        zzklVar.zzc.zzt.zzd().zzf(zzklVar.zzc.zzt.zzax().elapsedRealtime());
    }
}
