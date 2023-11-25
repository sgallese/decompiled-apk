package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdnb {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcfu zzc;
    private final Context zzd;
    private final zzdrh zze;
    private final zzfgo zzf;
    private final Executor zzg;
    private final zzaqx zzh;
    private final zzcag zzi;
    private final zzech zzk;
    private final zzfik zzl;
    private final zzecs zzm;
    private com.google.common.util.concurrent.a zzn;
    private final zzdmo zza = new zzdmo();
    private final zzbjg zzj = new zzbjg();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdnb(zzdmy zzdmyVar) {
        this.zzd = zzdmy.zza(zzdmyVar);
        this.zzg = zzdmy.zzk(zzdmyVar);
        this.zzh = zzdmy.zzb(zzdmyVar);
        this.zzi = zzdmy.zzd(zzdmyVar);
        this.zzb = zzdmy.zzc(zzdmyVar);
        this.zzc = zzdmy.zze(zzdmyVar);
        this.zzk = zzdmy.zzg(zzdmyVar);
        this.zzl = zzdmy.zzj(zzdmyVar);
        this.zze = zzdmy.zzf(zzdmyVar);
        this.zzf = zzdmy.zzi(zzdmyVar);
        this.zzm = zzdmy.zzh(zzdmyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzcfi zza(zzcfi zzcfiVar) {
        zzcfiVar.zzad("/result", this.zzj);
        zzcgv zzN = zzcfiVar.zzN();
        zzdmo zzdmoVar = this.zza;
        zzN.zzM(null, zzdmoVar, zzdmoVar, zzdmoVar, zzdmoVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null, null);
        return zzcfiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ com.google.common.util.concurrent.a zzc(String str, JSONObject jSONObject, zzcfi zzcfiVar) throws Exception {
        return this.zzj.zzb(zzcfiVar, str, jSONObject);
    }

    public final synchronized com.google.common.util.concurrent.a zzd(final String str, final JSONObject jSONObject) {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return zzfye.zzh(null);
        }
        return zzfye.zzn(aVar, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzdmp
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                return zzdnb.this.zzc(str, jSONObject, (zzcfi) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzfbe zzfbeVar, zzfbi zzfbiVar) {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return;
        }
        zzfye.zzr(aVar, new zzdmv(this, zzfbeVar, zzfbiVar), this.zzg);
    }

    public final synchronized void zzf() {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return;
        }
        zzfye.zzr(aVar, new zzdmr(this), this.zzg);
        this.zzn = null;
    }

    public final synchronized void zzg(String str, Map map) {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return;
        }
        zzfye.zzr(aVar, new zzdmu(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzcag zzcagVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdz);
        final zzaqx zzaqxVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzecs zzecsVar = this.zzm;
        com.google.common.util.concurrent.a zzm = zzfye.zzm(zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // com.google.android.gms.internal.ads.zzfxk
            public final com.google.common.util.concurrent.a zza() {
                Context context2 = context;
                zzaqx zzaqxVar2 = zzaqxVar;
                zzcag zzcagVar2 = zzcagVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzecs zzecsVar2 = zzecsVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcfi zza = zzcfu.zza(context2, zzcgx.zza(), "", false, false, zzaqxVar2, null, zzcagVar2, null, null, zzaVar2, zzaxe.zza(), null, null, zzecsVar2);
                final zzcar zza2 = zzcar.zza(zza);
                zza.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzcfs
                    @Override // com.google.android.gms.internal.ads.zzcgt
                    public final void zza(boolean z10, int i10, String str3, String str4) {
                        zzcar.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzcan.zze), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                zzcfi zzcfiVar = (zzcfi) obj;
                zzdnb.this.zza(zzcfiVar);
                return zzcfiVar;
            }
        }, this.zzg);
        this.zzn = zzm;
        zzcaq.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbir zzbirVar) {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return;
        }
        zzfye.zzr(aVar, new zzdms(this, str, zzbirVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbir zzbirVar) {
        zzi(str, new zzdna(this, weakReference, str, zzbirVar, null));
    }

    public final synchronized void zzk(String str, zzbir zzbirVar) {
        com.google.common.util.concurrent.a aVar = this.zzn;
        if (aVar == null) {
            return;
        }
        zzfye.zzr(aVar, new zzdmt(this, str, zzbirVar), this.zzg);
    }
}
