package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
final class zzhw implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcf zza;
    final /* synthetic */ zzii zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhw(zzii zziiVar, com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        this.zzb = zziiVar;
        this.zza = zzcfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.zzii r0 = r7.zzb
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzkn r0 = r0.zzu()
            com.google.android.gms.internal.measurement.zzqo.zzc()
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzag r1 = r1.zzf()
            com.google.android.gms.measurement.internal.zzef r2 = com.google.android.gms.measurement.internal.zzeg.zzau
            r3 = 0
            boolean r1 = r1.zzs(r3, r2)
            if (r1 == 0) goto L76
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzai r1 = r1.zzc()
            com.google.android.gms.measurement.internal.zzah r2 = com.google.android.gms.measurement.internal.zzah.ANALYTICS_STORAGE
            boolean r1 = r1.zzi(r2)
            if (r1 != 0) goto L3c
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            r0.zza(r1)
            goto L85
        L3c:
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzgd r2 = r0.zzt
            com.google.android.gms.common.util.Clock r2 = r2.zzax()
            long r4 = r2.currentTimeMillis()
            boolean r1 = r1.zzk(r4)
            if (r1 != 0) goto L85
            com.google.android.gms.measurement.internal.zzgd r1 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r1 = r1.zzm()
            com.google.android.gms.measurement.internal.zzfe r1 = r1.zzk
            long r1 = r1.zza()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L65
            goto L85
        L65:
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzfi r0 = r0.zzm()
            com.google.android.gms.measurement.internal.zzfe r0 = r0.zzk
            long r0 = r0.zza()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L86
        L76:
            com.google.android.gms.measurement.internal.zzgd r0 = r0.zzt
            com.google.android.gms.measurement.internal.zzet r0 = r0.zzaA()
            com.google.android.gms.measurement.internal.zzer r0 = r0.zzl()
            java.lang.String r1 = "getSessionId has been disabled."
            r0.zza(r1)
        L85:
            r0 = r3
        L86:
            if (r0 == 0) goto L9a
            com.google.android.gms.measurement.internal.zzii r1 = r7.zzb
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt
            com.google.android.gms.measurement.internal.zzln r1 = r1.zzv()
            com.google.android.gms.internal.measurement.zzcf r2 = r7.zza
            long r3 = r0.longValue()
            r1.zzV(r2, r3)
            return
        L9a:
            com.google.android.gms.internal.measurement.zzcf r0 = r7.zza     // Catch: android.os.RemoteException -> La0
            r0.zze(r3)     // Catch: android.os.RemoteException -> La0
            return
        La0:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzii r1 = r7.zzb
            com.google.android.gms.measurement.internal.zzgd r1 = r1.zzt
            com.google.android.gms.measurement.internal.zzet r1 = r1.zzaA()
            com.google.android.gms.measurement.internal.zzer r1 = r1.zzd()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.zzb(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzhw.run():void");
    }
}
