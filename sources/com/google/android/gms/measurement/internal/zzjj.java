package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public final class zzjj extends zzap {
    final /* synthetic */ zzjx zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjj(zzjx zzjxVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjxVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzap
    public final void zzc() {
        this.zza.zzt.zzaA().zzk().zza("Tasks have been queued for a long time");
    }
}
