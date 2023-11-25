package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzejw extends zzbqe {
    private final String zza;
    private final zzbqc zzb;
    private final zzcas zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejw(String str, zzbqc zzbqcVar, zzcas zzcasVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcasVar;
        this.zza = str;
        this.zzb = zzbqcVar;
        this.zze = j10;
        try {
            jSONObject.put("adapter_version", zzbqcVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqcVar.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcas zzcasVar) {
        synchronized (zzejw.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcasVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    private final synchronized void zzh(String str, int i10) {
        if (this.zzf) {
            return;
        }
        try {
            this.zzd.put("signal_error", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzby)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                this.zzd.put("signal_error_code", i10);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzby)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbx)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
