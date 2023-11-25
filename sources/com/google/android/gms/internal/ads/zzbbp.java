package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbbp implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();

    private final void zzf() {
        if (this.zze == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbbw.zza(new zzfry() { // from class: com.google.android.gms.internal.ads.zzbbn
                @Override // com.google.android.gms.internal.ads.zzfry
                public final Object zza() {
                    return zzbbp.this.zzd();
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzf();
        }
    }

    public final Object zzb(final zzbbj zzbbjVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null) {
                }
                return zzbbjVar.zzm();
            }
        }
        if (zzbbjVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbbjVar.zzm();
            }
            return zzbbjVar.zzb(bundle);
        } else if (zzbbjVar.zze() == 1 && this.zzh.has(zzbbjVar.zzn())) {
            return zzbbjVar.zza(this.zzh);
        } else {
            return zzbbw.zza(new zzfry() { // from class: com.google.android.gms.internal.ads.zzbbm
                @Override // com.google.android.gms.internal.ads.zzfry
                public final Object zza() {
                    return zzbbp.this.zzc(zzbbjVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzbbj zzbbjVar) {
        return zzbbjVar.zzc(this.zze);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzd() {
        return this.zze.getString("flag_configuration", "{}");
    }

    public final void zze(Context context) {
        Context applicationContext;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            if (this.zzd) {
                return;
            }
            if (!this.zza) {
                this.zza = true;
            }
            if (context.getApplicationContext() == null) {
                applicationContext = context;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.zzg = applicationContext;
            try {
                this.zzf = Wrappers.packageManager(applicationContext).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            }
            try {
                Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
                if (remoteContext != null || (remoteContext = context.getApplicationContext()) != null) {
                    context = remoteContext;
                }
                if (context == null) {
                    return;
                }
                com.google.android.gms.ads.internal.client.zzba.zzb();
                SharedPreferences zza = zzbbl.zza(context);
                this.zze = zza;
                if (zza != null) {
                    zza.registerOnSharedPreferenceChangeListener(this);
                }
                zzbeb.zzc(new zzbbo(this));
                zzf();
                this.zzd = true;
            } finally {
                this.zza = false;
                this.zzc.open();
            }
        }
    }
}
