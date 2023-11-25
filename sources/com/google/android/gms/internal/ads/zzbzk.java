package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbzk {
    final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzk;
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    private final Object zzj = new Object();
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;

    public zzbzk(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzk = zzgVar;
    }

    private final void zzi() {
        if (((Boolean) zzbdq.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzj) {
            i10 = this.zzi;
        }
        return i10;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            bundle = new Bundle();
            if (!this.zzk.zzQ()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzbvb.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z10 = false;
            if (identifier == 0) {
                zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z10 = true;
                    } else {
                        zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcaa.zzj("Fail to fetch AdActivity theme");
                    zzcaa.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z10);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, long j10) {
        Bundle bundle;
        synchronized (this.zzj) {
            long zzd = this.zzk.zzd();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzd > ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaR)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzk.zzc();
                }
                this.zzb = j10;
                this.zza = j10;
            } else {
                this.zza = j10;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdp)).booleanValue() && (bundle = zzlVar.zzc) != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i10 = this.zzd + 1;
            this.zzd = i10;
            if (i10 == 0) {
                this.zze = 0L;
                this.zzk.zzD(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzk.zze();
            }
        }
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
