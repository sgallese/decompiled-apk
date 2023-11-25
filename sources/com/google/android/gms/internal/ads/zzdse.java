package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdse implements AppEventListener, zzczd, com.google.android.gms.ads.internal.client.zza, zzcwi, zzcxc, zzcxd, zzcxw, zzcwl, zzfgf {
    private final List zza;
    private final zzdrs zzb;
    private long zzc;

    public zzdse(zzdrs zzdrsVar, zzchd zzchdVar) {
        this.zzb = zzdrsVar;
        this.zza = Collections.singletonList(zzchdVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza() {
        zzg(zzcwi.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzb() {
        zzg(zzcwi.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwl
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcwl.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbG(zzffy zzffyVar, String str) {
        zzg(zzffx.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbH(zzffy zzffyVar, String str, Throwable th) {
        zzg(zzffx.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzbI(zzffy zzffyVar, String str) {
        zzg(zzffx.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbn(Context context) {
        zzg(zzcxd.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbp(Context context) {
        zzg(zzcxd.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcxd
    public final void zzbq(Context context) {
        zzg(zzcxd.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbr(zzbun zzbunVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zzg(zzczd.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzbw(zzbvd zzbvdVar, String str, String str2) {
        zzg(zzcwi.class, "onRewarded", zzbvdVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzc() {
        zzg(zzcwi.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgf
    public final void zzd(zzffy zzffyVar, String str) {
        zzg(zzffx.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zze() {
        zzg(zzcwi.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zzf() {
        zzg(zzcwi.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq() {
        zzg(zzcxc.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zzg(zzcxw.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzczd
    public final void zzbs(zzfbr zzfbrVar) {
    }
}
