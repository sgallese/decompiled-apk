package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzehh implements zzfxl {
    private final zzfge zza;
    private final zzcwk zzb;
    private final zzfig zzc;
    private final zzfik zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcsh zzg;
    private final zzehc zzh;
    private final zzeds zzi;
    private final Context zzj;
    private final zzfhr zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzehh(Context context, zzfge zzfgeVar, zzehc zzehcVar, zzcwk zzcwkVar, zzfig zzfigVar, zzfik zzfikVar, zzcsh zzcshVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzeds zzedsVar, zzfhr zzfhrVar) {
        this.zzj = context;
        this.zza = zzfgeVar;
        this.zzh = zzehcVar;
        this.zzb = zzcwkVar;
        this.zzc = zzfigVar;
        this.zzd = zzfikVar;
        this.zzg = zzcshVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedsVar;
        this.zzk = zzfhrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzfo)).booleanValue() == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    @Override // com.google.android.gms.internal.ads.zzfxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.common.util.concurrent.a zza(java.lang.Object r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzehh.zza(java.lang.Object):com.google.common.util.concurrent.a");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzb(zzfbe zzfbeVar, zzfbr zzfbrVar, zzedn zzednVar, Throwable th) throws Exception {
        zzfhg zza = zzfhf.zza(this.zzj, 12);
        zza.zzd(zzfbeVar.zzF);
        zza.zzh();
        zzehc zzehcVar = this.zzh;
        com.google.common.util.concurrent.a zzo = zzfye.zzo(zzednVar.zza(zzfbrVar, zzfbeVar), zzfbeVar.zzS, TimeUnit.MILLISECONDS, this.zzf);
        zzehcVar.zze(zzfbrVar, zzfbeVar, zzo, this.zzc);
        zzfhq.zza(zzo, this.zzk, zza);
        return zzo;
    }
}
