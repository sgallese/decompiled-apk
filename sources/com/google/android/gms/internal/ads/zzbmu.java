package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbmu {
    private final Context zzb;
    private final String zzc;
    private final zzcag zzd;
    private final zzfhu zze;
    private final com.google.android.gms.ads.internal.util.zzbb zzf;
    private final com.google.android.gms.ads.internal.util.zzbb zzg;
    private zzbmt zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbmu(Context context, zzcag zzcagVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfhu zzfhuVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = zzcagVar;
        this.zze = zzfhuVar;
        this.zzf = zzbbVar;
        this.zzg = zzbbVar2;
    }

    public final zzbmo zzb(zzaqx zzaqxVar) {
        synchronized (this.zza) {
            synchronized (this.zza) {
                zzbmt zzbmtVar = this.zzh;
                if (zzbmtVar != null && this.zzi == 0) {
                    zzbmtVar.zzi(new zzcaw() { // from class: com.google.android.gms.internal.ads.zzblz
                        @Override // com.google.android.gms.internal.ads.zzcaw
                        public final void zza(Object obj) {
                            zzbmu.this.zzk((zzblp) obj);
                        }
                    }, new zzcau() { // from class: com.google.android.gms.internal.ads.zzbma
                        @Override // com.google.android.gms.internal.ads.zzcau
                        public final void zza() {
                        }
                    });
                }
            }
            zzbmt zzbmtVar2 = this.zzh;
            if (zzbmtVar2 != null && zzbmtVar2.zze() != -1) {
                int i10 = this.zzi;
                if (i10 == 0) {
                    return this.zzh.zza();
                } else if (i10 == 1) {
                    this.zzi = 2;
                    zzd(null);
                    return this.zzh.zza();
                } else {
                    return this.zzh.zza();
                }
            }
            this.zzi = 2;
            zzbmt zzd = zzd(null);
            this.zzh = zzd;
            return zzd.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzbmt zzd(zzaqx zzaqxVar) {
        zzfhg zza = zzfhf.zza(this.zzb, 6);
        zza.zzh();
        final zzbmt zzbmtVar = new zzbmt(this.zzg);
        final zzaqx zzaqxVar2 = null;
        zzcan.zze.execute(new Runnable(zzaqxVar2, zzbmtVar) { // from class: com.google.android.gms.internal.ads.zzbmd
            public final /* synthetic */ zzbmt zzb;

            {
                this.zzb = zzbmtVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbmu.this.zzj(null, this.zzb);
            }
        });
        zzbmtVar.zzi(new zzbmj(this, zzbmtVar, zza), new zzbmk(this, zzbmtVar, zza));
        return zzbmtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzbmt zzbmtVar, final zzblp zzblpVar, ArrayList arrayList, long j10) {
        synchronized (this.zza) {
            if (zzbmtVar.zze() != -1 && zzbmtVar.zze() != 1) {
                zzbmtVar.zzg();
                zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmb
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzblp.this.zzc();
                    }
                });
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzc)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbmtVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - j10) + " ms. Rejecting.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzaqx zzaqxVar, zzbmt zzbmtVar) {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            zzblx zzblxVar = new zzblx(this.zzb, this.zzd, null, null);
            zzblxVar.zzk(new zzbme(this, arrayList, currentTimeMillis, zzbmtVar, zzblxVar));
            zzblxVar.zzq("/jsLoaded", new zzbmf(this, currentTimeMillis, zzbmtVar, zzblxVar));
            com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
            zzbmg zzbmgVar = new zzbmg(this, null, zzblxVar, zzcaVar);
            zzcaVar.zzb(zzbmgVar);
            zzblxVar.zzq("/requestReload", zzbmgVar);
            if (this.zzc.endsWith(".js")) {
                zzblxVar.zzh(this.zzc);
            } else if (this.zzc.startsWith("<html>")) {
                zzblxVar.zzf(this.zzc);
            } else {
                zzblxVar.zzg(this.zzc);
            }
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbmi(this, zzbmtVar, zzblxVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzd)).intValue());
        } catch (Throwable th) {
            zzcaa.zzh("Error creating webview.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "SdkJavascriptFactory.loadJavascriptEngine");
            zzbmtVar.zzg();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzblp zzblpVar) {
        if (zzblpVar.zzi()) {
            this.zzi = 1;
        }
    }
}
