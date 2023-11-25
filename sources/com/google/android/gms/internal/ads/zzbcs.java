package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbcs {
    private androidx.browser.customtabs.f zza;
    private androidx.browser.customtabs.c zzb;
    private androidx.browser.customtabs.e zzc;
    private zzbcq zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgzh.zza(context));
                }
            }
        }
        return false;
    }

    public final androidx.browser.customtabs.f zza() {
        androidx.browser.customtabs.c cVar = this.zzb;
        if (cVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = cVar.c(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb != null || (zza = zzgzh.zza(activity)) == null) {
            return;
        }
        zzgzi zzgziVar = new zzgzi(this);
        this.zzc = zzgziVar;
        androidx.browser.customtabs.c.a(activity, zza, zzgziVar);
    }

    public final void zzc(androidx.browser.customtabs.c cVar) {
        this.zzb = cVar;
        cVar.e(0L);
        zzbcq zzbcqVar = this.zzd;
        if (zzbcqVar != null) {
            zzbcqVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbcq zzbcqVar) {
        this.zzd = zzbcqVar;
    }

    public final void zzf(Activity activity) {
        androidx.browser.customtabs.e eVar = this.zzc;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
