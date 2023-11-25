package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbrz;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbwi;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcaa;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbgv zzd;
    private final zzbwi zze;
    private final zzbrz zzf;
    private final zzbgw zzg;
    private zzbth zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbgv zzbgvVar, zzbwi zzbwiVar, zzbrz zzbrzVar, zzbgw zzbgwVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbgvVar;
        this.zze = zzbwiVar;
        this.zzf = zzbrzVar;
        this.zzg = zzbgwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbof zzbofVar) {
        return (zzbq) new zzao(this, context, str, zzbofVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbof zzbofVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzbofVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbof zzbofVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzbofVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbof zzbofVar) {
        return (zzdj) new zzac(this, context, zzbofVar).zzd(context, false);
    }

    public final zzbfa zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbfa) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfg zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbfg) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbjs zzl(Context context, zzbof zzbofVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbjs) new zzai(this, context, zzbofVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbrv zzm(Context context, zzbof zzbofVar) {
        return (zzbrv) new zzag(this, context, zzbofVar).zzd(context, false);
    }

    public final zzbsc zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z10 = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcaa.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z10 = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbsc) zzaaVar.zzd(activity, z10);
    }

    public final zzbvw zzq(Context context, String str, zzbof zzbofVar) {
        return (zzbvw) new zzav(this, context, str, zzbofVar).zzd(context, false);
    }

    public final zzbyr zzr(Context context, zzbof zzbofVar) {
        return (zzbyr) new zzae(this, context, zzbofVar).zzd(context, false);
    }
}
