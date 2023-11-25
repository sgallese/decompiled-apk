package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdpc {
    private final zzfcu zza;
    private final zzdoz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdpc(zzfcu zzfcuVar, zzdoz zzdozVar) {
        this.zza = zzfcuVar;
        this.zzb = zzdozVar;
    }

    final zzbof zza() throws RemoteException {
        zzbof zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcaa.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqc zzb(String str) throws RemoteException {
        zzbqc zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfcw zzc(String str, JSONObject jSONObject) throws zzfcf {
        zzboi zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpf(new zzbqu());
            } else {
                zzbof zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e10) {
                        zzcaa.zzh("Invalid custom event.", e10);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfcw zzfcwVar = new zzfcw(zzb);
            this.zzb.zzd(str, zzfcwVar);
            return zzfcwVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziW)).booleanValue()) {
                this.zzb.zzd(str, null);
            }
            throw new zzfcf(th);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzb() != null) {
            return true;
        }
        return false;
    }
}
