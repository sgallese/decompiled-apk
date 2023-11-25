package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfyx implements Runnable {
    zzfza zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfyx(zzfza zzfzaVar) {
        this.zza = zzfzaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
    
        r1 = r0.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfza r0 = r10.zza
            if (r0 != 0) goto L5
            return
        L5:
            com.google.common.util.concurrent.a r1 = com.google.android.gms.internal.ads.zzfza.zze(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r10.zza = r2
            boolean r3 = r1.isDone()
            if (r3 == 0) goto L19
            r0.zzs(r1)
            return
        L19:
            r3 = 1
            java.util.concurrent.ScheduledFuture r4 = com.google.android.gms.internal.ads.zzfza.zzv(r0)     // Catch: java.lang.Throwable -> L7f
            com.google.android.gms.internal.ads.zzfza.zzw(r0, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "Timed out"
            if (r4 == 0) goto L52
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L50
            long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L50
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L50
            r8 = 10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = " (timeout delayed by "
            r4.append(r8)     // Catch: java.lang.Throwable -> L50
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = " ms after scheduled time)"
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L50
            r5 = r4
            goto L52
        L50:
            r4 = move-exception
            goto L76
        L52:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r6.<init>()     // Catch: java.lang.Throwable -> L50
            r6.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            r6.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L50
            com.google.android.gms.internal.ads.zzfyz r5 = new com.google.android.gms.internal.ads.zzfyz     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L7f
            r0.zzd(r5)     // Catch: java.lang.Throwable -> L7f
            r1.cancel(r3)
            return
        L76:
            com.google.android.gms.internal.ads.zzfyz r6 = new com.google.android.gms.internal.ads.zzfyz     // Catch: java.lang.Throwable -> L7f
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L7f
            r0.zzd(r6)     // Catch: java.lang.Throwable -> L7f
            throw r4     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r1.cancel(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyx.run():void");
    }
}
