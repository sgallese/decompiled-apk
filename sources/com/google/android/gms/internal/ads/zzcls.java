package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcls extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final zzcag zzb;
    private final zzdpc zzc;
    private final zzedp zzd;
    private final zzejt zze;
    private final zzdtj zzf;
    private final zzbyf zzg;
    private final zzdph zzh;
    private final zzdue zzi;
    private final zzbed zzj;
    private final zzfhu zzk;
    private final zzfcu zzl;
    private final zzbbs zzm;
    private boolean zzn = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcls(Context context, zzcag zzcagVar, zzdpc zzdpcVar, zzedp zzedpVar, zzejt zzejtVar, zzdtj zzdtjVar, zzbyf zzbyfVar, zzdph zzdphVar, zzdue zzdueVar, zzbed zzbedVar, zzfhu zzfhuVar, zzfcu zzfcuVar, zzbbs zzbbsVar) {
        this.zza = context;
        this.zzb = zzcagVar;
        this.zzc = zzdpcVar;
        this.zzd = zzedpVar;
        this.zze = zzejtVar;
        this.zzf = zzdtjVar;
        this.zzg = zzbyfVar;
        this.zzh = zzdphVar;
        this.zzi = zzdueVar;
        this.zzj = zzbedVar;
        this.zzk = zzfhuVar;
        this.zzl = zzfcuVar;
        this.zzm = zzbbsVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzP()) {
            if (!com.google.android.gms.ads.internal.zzt.zzs().zzj(this.zza, com.google.android.gms.ads.internal.zzt.zzo().zzh().zzl(), this.zzb.zza)) {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzB(false);
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzA("");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzcaa.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (!this.zzc.zzd()) {
            return;
        }
        HashMap hashMap = new HashMap();
        Iterator it = zze.values().iterator();
        while (it.hasNext()) {
            for (zzbnz zzbnzVar : ((zzboa) it.next()).zza) {
                String str = zzbnzVar.zzk;
                for (String str2 : zzbnzVar.zzc) {
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, new ArrayList());
                    }
                    if (str != null) {
                        ((List) hashMap.get(str2)).add(str);
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            try {
                zzedq zza = this.zzd.zza(str3, jSONObject);
                if (zza != null) {
                    zzfcw zzfcwVar = (zzfcw) zza.zzb;
                    if (!zzfcwVar.zzC() && zzfcwVar.zzB()) {
                        zzfcwVar.zzj(this.zza, (zzefk) zza.zzc, (List) entry.getValue());
                        zzcaa.zze("Initialized rewarded video mediation adapter " + str3);
                    }
                }
            } catch (zzfcf e10) {
                zzcaa.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        zzfde.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z10) throws RemoteException {
        try {
            zzfoj.zzi(this.zza).zzn(z10);
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzn) {
            zzcaa.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbbr.zza(this.zza);
        this.zzm.zza();
        com.google.android.gms.ads.internal.zzt.zzo().zzs(this.zza, this.zzb);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.zza);
        this.zzn = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdO)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziO)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclo
                @Override // java.lang.Runnable
                public final void run() {
                    zzcls.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjQ)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcln
                @Override // java.lang.Runnable
                public final void run() {
                    zzcls.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcC)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcls.this.zzd();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        String str3;
        Runnable runnable;
        zzbbr.zza(this.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            str2 = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
        } else {
            str2 = "";
        }
        boolean z10 = true;
        if (true == TextUtils.isEmpty(str2)) {
            str3 = str;
        } else {
            str3 = str2;
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdM)).booleanValue();
        zzbbj zzbbjVar = zzbbr.zzaO;
        boolean booleanValue2 = booleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbjVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzclq
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcls zzclsVar = zzcls.this;
                    final Runnable runnable3 = runnable2;
                    zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclr
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcls.this.zzc(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z10 = booleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z10) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str3, runnable3, this.zzk);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdud.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcaa.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            zzcaa.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.zzb.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbof zzbofVar) throws RemoteException {
        this.zzl.zzf(zzbofVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzt.zzr().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbbr.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdM)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.zza, this.zzb, str, null, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbkv zzbkvVar) throws RemoteException {
        this.zzf.zzs(zzbkvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzq(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzt.zzr().zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbtk());
    }
}
