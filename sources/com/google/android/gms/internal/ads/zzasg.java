package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzasg implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzash zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzasg(zzash zzashVar) {
        this.zza = zzashVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        long j10;
        long j11;
        long j12;
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        zzash zzashVar = this.zza;
        j10 = zzashVar.zzc;
        if (j10 > 0) {
            j11 = zzashVar.zzc;
            if (currentTimeMillis >= j11) {
                j12 = zzashVar.zzc;
                zzashVar.zzd = currentTimeMillis - j12;
            }
        }
        this.zza.zze = false;
    }
}
