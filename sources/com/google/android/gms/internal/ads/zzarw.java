package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzarw implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzary zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzarw(zzary zzaryVar, int i10, boolean z10) {
        this.zzb = zzaryVar;
        this.zza = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaos zzaosVar;
        zzary zzaryVar = this.zzb;
        if (this.zza > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzaryVar.zza.getPackageManager().getPackageInfo(zzaryVar.zza.getPackageName(), 0);
            Context context = zzaryVar.zza;
            zzaosVar = zzflk.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaosVar = null;
        }
        this.zzb.zzm = zzaosVar;
        if (this.zza < 4) {
            if (zzaosVar == null || !zzaosVar.zzaj() || zzaosVar.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") || !zzaosVar.zzak() || !zzaosVar.zzf().zze() || zzaosVar.zzf().zza() == -2) {
                this.zzb.zzo(this.zza + 1, true);
            }
        }
    }
}
