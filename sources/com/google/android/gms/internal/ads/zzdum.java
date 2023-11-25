package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdum implements com.google.android.gms.ads.internal.overlay.zzo, zzcgt {
    private final Context zza;
    private final zzcag zzb;
    private zzdue zzc;
    private zzcfi zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzda zzh;
    private boolean zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdum(Context context, zzcag zzcagVar) {
        this.zza = context;
        this.zzb = zzcagVar;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzda zzdaVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
            zzcaa.zzj("Ad inspector had an internal error.");
            try {
                zzdaVar.zze(zzfdb.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        } else if (this.zzc == null) {
            zzcaa.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdaVar.zze(zzfdb.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        } else {
            if (!this.zze && !this.zzf) {
                if (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() >= this.zzg + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziC)).intValue()) {
                    return true;
                }
            }
            zzcaa.zzj("Ad inspector cannot be opened because it is already open.");
            try {
                zzdaVar.zze(zzfdb.zzd(19, null, null));
            } catch (RemoteException unused3) {
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgt
    public final synchronized void zza(boolean z10, int i10, String str, String str2) {
        if (z10) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        zzcaa.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(new Exception("Failed to load UI. Error code: " + i10 + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                zzdaVar.zze(zzfdb.zzd(17, null, null));
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbv() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzby(int i10) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzda zzdaVar = this.zzh;
            if (zzdaVar != null) {
                try {
                    zzdaVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    public final Activity zzg() {
        zzcfi zzcfiVar = this.zzd;
        if (zzcfiVar != null && !zzcfiVar.zzaz()) {
            return this.zzd.zzi();
        }
        return null;
    }

    public final void zzh(zzdue zzdueVar) {
        this.zzc = zzdueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(String str) {
        JSONObject zze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                zze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", zze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzda zzdaVar, zzbjk zzbjkVar, zzbjd zzbjdVar) {
        if (!zzl(zzdaVar)) {
            return;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzz();
            zzcfi zza = zzcfu.zza(this.zza, zzcgx.zza(), "", false, false, null, null, this.zzb, null, null, null, zzaxe.zza(), null, null, null);
            this.zzd = zza;
            zzcgv zzN = zza.zzN();
            if (zzN == null) {
                zzcaa.zzj("Failed to obtain a web view for the ad inspector");
                try {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                    zzdaVar.zze(zzfdb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                    return;
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "InspectorUi.openInspector 3");
                    return;
                }
            }
            this.zzh = zzdaVar;
            zzN.zzM(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbjkVar, null, new zzbjj(this.zza), zzbjdVar, null);
            zzN.zzA(this);
            this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziA));
            com.google.android.gms.ads.internal.zzt.zzi();
            com.google.android.gms.ads.internal.overlay.zzm.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true);
            this.zzg = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        } catch (zzcft e11) {
            zzcaa.zzk("Failed to obtain a web view for the ad inspector", e11);
            try {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e11, "InspectorUi.openInspector 0");
                zzdaVar.zze(zzfdb.zzd(17, "Failed to obtain a web view for the ad inspector", null));
            } catch (RemoteException e12) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e12, "InspectorUi.openInspector 1");
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdul
                @Override // java.lang.Runnable
                public final void run() {
                    zzdum.this.zzi(str);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
