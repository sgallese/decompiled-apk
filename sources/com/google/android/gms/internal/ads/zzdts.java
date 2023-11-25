package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdts implements zzcwl, zzczd, zzcya {
    private final zzdue zza;
    private final String zzb;
    private final String zzc;
    private zzcwb zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private boolean zzl;
    private boolean zzm;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdtr zze = zzdtr.AD_REQUESTED;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdts(zzdue zzdueVar, zzfca zzfcaVar, String str) {
        this.zza = zzdueVar;
        this.zzc = str;
        this.zzb = zzfcaVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        if (zzeVar2 == null) {
            zzh = null;
        } else {
            zzh = zzh(zzeVar2);
        }
        jSONObject.put("underlyingError", zzh);
        return jSONObject;
    }

    private final JSONObject zzi(zzcwb zzcwbVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcwbVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcwbVar.zzc());
        jSONObject.put("responseId", zzcwbVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziQ)).booleanValue()) {
            String zzd = zzcwbVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                zzcaa.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzcwbVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziR)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zzb().zzh(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            if (zzeVar == null) {
                zzh = null;
            } else {
                zzh = zzh(zzeVar);
            }
            jSONObject2.put("error", zzh);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zza(zzcse zzcseVar) {
        if (!this.zza.zzp()) {
            return;
        }
        this.zzf = zzcseVar.zzl();
        this.zze = zzdtr.AD_LOADED;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (!this.zza.zzp()) {
            return;
        }
        this.zze = zzdtr.AD_LOAD_FAILED;
        this.zzg = zzeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue() && this.zza.zzp()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
        if (!this.zza.zzp()) {
            return;
        }
        int i10 = 0;
        if (!zzfbrVar.zzb.zza.isEmpty()) {
            this.zzd = ((zzfbe) zzfbrVar.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzfbrVar.zzb.zzb.zzk)) {
            this.zzh = zzfbrVar.zzb.zzb.zzk;
        }
        if (!TextUtils.isEmpty(zzfbrVar.zzb.zzb.zzl)) {
            this.zzi = zzfbrVar.zzb.zzb.zzl;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziT)).booleanValue() && this.zza.zzr()) {
            if (!TextUtils.isEmpty(zzfbrVar.zzb.zzb.zzm)) {
                this.zzj = zzfbrVar.zzb.zzb.zzm;
            }
            if (zzfbrVar.zzb.zzb.zzn.length() > 0) {
                this.zzk = zzfbrVar.zzb.zzb.zzn;
            }
            zzdue zzdueVar = this.zza;
            JSONObject jSONObject = this.zzk;
            if (jSONObject != null) {
                i10 = jSONObject.toString().length();
            }
            if (!TextUtils.isEmpty(this.zzj)) {
                i10 += this.zzj.length();
            }
            zzdueVar.zzj(i10);
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfbe.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzl);
            if (this.zzl) {
                jSONObject2.put("shown", this.zzm);
            }
        }
        zzcwb zzcwbVar = this.zzf;
        if (zzcwbVar != null) {
            jSONObject = zzi(zzcwbVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcwb zzcwbVar2 = (zzcwb) iBinder;
                jSONObject3 = zzi(zzcwbVar2);
                if (zzcwbVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    public final void zze() {
        this.zzl = true;
    }

    public final void zzf() {
        this.zzm = true;
    }

    public final boolean zzg() {
        if (this.zze != zzdtr.AD_REQUESTED) {
            return true;
        }
        return false;
    }
}
