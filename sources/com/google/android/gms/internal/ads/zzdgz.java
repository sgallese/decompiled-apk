package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdgz implements zzdik {
    private com.google.android.gms.ads.internal.client.zzcs zzA;
    private final Context zza;
    private final zzdin zzb;
    private final JSONObject zzc;
    private final zzdnb zzd;
    private final zzdic zze;
    private final zzaqx zzf;
    private final zzcxa zzg;
    private final zzcwg zzh;
    private final zzddu zzi;
    private final zzfbe zzj;
    private final zzcag zzk;
    private final zzfca zzl;
    private final zzcoy zzm;
    private final zzdjg zzn;
    private final Clock zzo;
    private final zzddq zzp;
    private final zzfik zzq;
    private final zzfhr zzr;
    private boolean zzt;
    private boolean zzs = false;
    private boolean zzu = false;
    private boolean zzv = false;
    private Point zzw = new Point();
    private Point zzx = new Point();
    private long zzy = 0;
    private long zzz = 0;

    public zzdgz(Context context, zzdin zzdinVar, JSONObject jSONObject, zzdnb zzdnbVar, zzdic zzdicVar, zzaqx zzaqxVar, zzcxa zzcxaVar, zzcwg zzcwgVar, zzddu zzdduVar, zzfbe zzfbeVar, zzcag zzcagVar, zzfca zzfcaVar, zzcoy zzcoyVar, zzdjg zzdjgVar, Clock clock, zzddq zzddqVar, zzfik zzfikVar, zzfhr zzfhrVar) {
        this.zza = context;
        this.zzb = zzdinVar;
        this.zzc = jSONObject;
        this.zzd = zzdnbVar;
        this.zze = zzdicVar;
        this.zzf = zzaqxVar;
        this.zzg = zzcxaVar;
        this.zzh = zzcwgVar;
        this.zzi = zzdduVar;
        this.zzj = zzfbeVar;
        this.zzk = zzcagVar;
        this.zzl = zzfcaVar;
        this.zzm = zzcoyVar;
        this.zzn = zzdjgVar;
        this.zzo = clock;
        this.zzp = zzddqVar;
        this.zzq = zzfikVar;
        this.zzr = zzfhrVar;
    }

    private final String zzD(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc = this.zze.zzc();
        if (zzc != 1) {
            if (zzc != 2) {
                if (zzc != 6) {
                    return null;
                }
                return "3099";
            }
            return "2099";
        }
        return "1099";
    }

    private final boolean zzE(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzF() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.android.gms.internal.ads.zzdgt, com.google.android.gms.internal.ads.zzdgx, com.google.android.gms.internal.ads.zzdgv] */
    private final boolean zzG(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzt.zzp();
            DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq((WindowManager) context.getSystemService("window"));
            ?? r82 = 0;
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzq.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzay.zzb().zzb(context, zzq.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzif)).booleanValue()) {
                this.zzd.zzi("/clickRecorded", new zzdgw(this, r82));
            } else {
                this.zzd.zzi("/logScionEvent", new zzdgu(this, r82));
            }
            this.zzd.zzi("/nativeImpression", new zzdgy(this, r82));
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (!this.zzs) {
                this.zzs = com.google.android.gms.ads.internal.zzt.zzs().zzn(this.zza, this.zzk.zza, this.zzj.zzD.toString(), this.zzl.zzf);
                return true;
            }
            return true;
        } catch (JSONException e10) {
            zzcaa.zzh("Unable to create impression JSON.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzA() {
        if (zza() != 0) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
                return this.zzl.zzi.zzj;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzB() {
        return zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final boolean zzC(Bundle bundle) {
        if (!zzE("impression_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return zzG(null, null, null, null, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final int zza() {
        if (this.zzl.zzi != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
                return this.zzl.zzi.zzi;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd);
            jSONObject.put("ad_view_signal", zzg);
            jSONObject.put("scroll_view_signal", zzf);
            jSONObject.put("lock_screen_signal", zze);
            return jSONObject;
        } catch (JSONException e10) {
            zzcaa.zzh("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzv && zzF()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze != null) {
                jSONObject.put("nas", zze);
            }
        } catch (JSONException e10) {
            zzcaa.zzh("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzg() {
        try {
            com.google.android.gms.ads.internal.client.zzcs zzcsVar = this.zzA;
            if (zzcsVar != null) {
                zzcsVar.zze();
            }
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzh() {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.zzn.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzi() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzj(com.google.android.gms.ads.internal.client.zzcw zzcwVar) {
        try {
            if (this.zzu) {
                return;
            }
            if (zzcwVar == null) {
                zzdic zzdicVar = this.zze;
                if (zzdicVar.zzk() != null) {
                    this.zzu = true;
                    this.zzq.zzc(zzdicVar.zzk().zzf(), this.zzr);
                    zzg();
                    return;
                }
            }
            this.zzu = true;
            this.zzq.zzc(zzcwVar.zzf(), this.zzr);
            zzg();
        } catch (RemoteException e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzk(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        View view3;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String zzD = zzD(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbx.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzds)).booleanValue()) {
            view3 = view2;
        } else {
            view3 = view;
        }
        zzn(view3, zzg, zzd, zzf, zze, zzD, zzc, null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzl(String str) {
        zzn(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzm(Bundle bundle) {
        String str;
        if (bundle == null) {
            zzcaa.zze("Click data is null. No click is reported.");
        } else if (!zzE("click_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            if (bundle2 != null) {
                str = bundle2.getString("asset_id");
            } else {
                str = null;
            }
            zzn(null, null, null, null, null, str, null, com.google.android.gms.ads.internal.client.zzay.zzb().zzj(bundle, null), false, false);
        }
    }

    protected final void zzn(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        String str2;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z15 = false;
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            jSONObject7.put("has_custom_click_handler", z12);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z10);
            zzbek zzbekVar = this.zzl.zzi;
            if (zzbekVar != null && zzbekVar.zzg) {
                z13 = true;
            } else {
                z13 = false;
            }
            jSONObject8.put("custom_mute_requested", z13);
            if (!this.zze.zzH().isEmpty() && this.zze.zzk() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            jSONObject8.put("custom_mute_enabled", z14);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzv && zzF()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z15 = true;
            }
            jSONObject8.put("has_custom_click_handler", z15);
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zze(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                zzcaa.zzh("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeu)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzij)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzik)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzy);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzz);
            jSONObject7.put("touch_signal", jSONObject9);
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            zzcaa.zzh("Unable to create click JSON.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzo(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        JSONObject jSONObject;
        boolean z11 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkm)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzv) {
                zzcaa.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzF()) {
                zzcaa.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view2);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view2);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view2);
        String zzD = zzD(view, map);
        JSONObject zzc = com.google.android.gms.ads.internal.util.zzbx.zzc(zzD, this.zza, this.zzx, this.zzw);
        if (z11) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzx;
                Point point2 = this.zzw;
                try {
                    jSONObject = new JSONObject();
                } catch (Exception e10) {
                    e = e10;
                    jSONObject = null;
                }
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    if (point != null) {
                        jSONObject3.put("x", point.x);
                        jSONObject3.put("y", point.y);
                    }
                    if (point2 != null) {
                        jSONObject4.put("x", point2.x);
                        jSONObject4.put("y", point2.y);
                    }
                    jSONObject.put("start_point", jSONObject3);
                    jSONObject.put("end_point", jSONObject4);
                    jSONObject.put("duration_ms", i10);
                } catch (Exception e11) {
                    e = e11;
                    zzcaa.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z10, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                zzcaa.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzn(view2, zzg, zzd, zzf, zze, zzD, zzc, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzp() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcaq.zza(this.zzd.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzq(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        String zzh;
        JSONObject zzd = com.google.android.gms.ads.internal.util.zzbx.zzd(this.zza, map, map2, view, scaleType);
        JSONObject zzg = com.google.android.gms.ads.internal.util.zzbx.zzg(this.zza, view);
        JSONObject zzf = com.google.android.gms.ads.internal.util.zzbx.zzf(view);
        JSONObject zze = com.google.android.gms.ads.internal.util.zzbx.zze(this.zza, view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdl)).booleanValue()) {
            try {
                zzh = this.zzf.zzc().zzh(this.zza, view, null);
            } catch (Exception unused) {
                zzcaa.zzg("Exception getting data.");
            }
            zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(this.zza, this.zzj));
        }
        zzh = null;
        zzG(zzg, zzd, zzf, zze, zzh, null, com.google.android.gms.ads.internal.util.zzbx.zzh(this.zza, this.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzr() {
        zzG(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzs(View view, MotionEvent motionEvent, View view2) {
        this.zzw = com.google.android.gms.ads.internal.util.zzbx.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzz = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzy = currentTimeMillis;
            this.zzx = this.zzw;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzw;
        obtain.setLocation(point.x, point.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzt(Bundle bundle) {
        if (bundle == null) {
            zzcaa.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzE("touch_reporting")) {
            zzcaa.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzu(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcaa.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjg zzdjgVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjgVar);
        view.setClickable(true);
        zzdjgVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzv() {
        this.zzv = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzw(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzA = zzcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzx(zzbgq zzbgqVar) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcaa.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbgqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzy(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (!this.zzt) {
            this.zzp.zza(view);
            this.zzt = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi = com.google.android.gms.ads.internal.util.zzbx.zzi(this.zzk.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdik
    public final void zzz(View view, Map map) {
        this.zzw = new Point();
        this.zzx = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzt = false;
    }
}
