package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmi implements Runnable {
    final /* synthetic */ zzbmt zza;
    final /* synthetic */ zzblp zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbmu zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmi(zzbmu zzbmuVar, zzbmt zzbmtVar, zzblp zzblpVar, ArrayList arrayList, long j10) {
        this.zze = zzbmuVar;
        this.zza = zzbmtVar;
        this.zzb = zzblpVar;
        this.zzc = arrayList;
        this.zzd = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i10;
        String str;
        obj = this.zze.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzfyo zzfyoVar = zzcan.zze;
                final zzblp zzblpVar = this.zzb;
                zzfyoVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblp.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzd));
                int zze = this.zza.zze();
                i10 = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    str = ". Still waiting for the engine to be loaded";
                } else {
                    str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.zzc.get(0));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i10 + str + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
            }
        }
    }
}
