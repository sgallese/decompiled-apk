package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzeqy implements zzesj {
    private final Context zza;
    private final zzfyo zzb;
    private final zzfca zzc;
    private final zzcag zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqy(Context context, zzfyo zzfyoVar, zzfca zzfcaVar, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = zzfyoVar;
        this.zzc = zzfcaVar;
        this.zzd = zzcagVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzesj
    public final com.google.common.util.concurrent.a zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqy.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcI)).booleanValue() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        r1 = com.google.android.gms.internal.ads.zzfoi.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcU)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzQ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bb, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcH)).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcJ)).booleanValue() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
    
        r0 = com.google.android.gms.internal.ads.zzfoj.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e9, code lost:
    
        if (r8.zzd.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcQ)).intValue()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        r2 = r0.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcV)).longValue(), com.google.android.gms.ads.internal.zzt.zzo().zzh().zzQ());
        r3 = r0.zzo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010f, code lost:
    
        r6 = r0.zzp();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0040, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbr.zzcG)).booleanValue() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeqz zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeqy.zzc():com.google.android.gms.internal.ads.zzeqz");
    }
}
