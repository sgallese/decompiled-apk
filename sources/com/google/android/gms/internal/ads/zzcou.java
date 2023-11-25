package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcou implements zzbnb {
    private final Context zza;
    private final zzaub zzb;
    private final PowerManager zzc;

    public zzcou(Context context, zzaub zzaubVar) {
        this.zza = context;
        this.zzb = zzaubVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnb
    /* renamed from: zza  reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcox zzcoxVar) throws JSONException {
        JSONObject jSONObject;
        Integer valueOf;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzaue zzaueVar = zzcoxVar.zzf;
        if (zzaueVar == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z10 = zzaueVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcoxVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcoxVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzr().zze()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzr().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfA)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
                if (audioManager == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(audioManager.getMode());
                }
                if (valueOf != null) {
                    jSONObject3.put("audioMode", valueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzaueVar.zzb).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", zzaueVar.zzc.top).put("bottom", zzaueVar.zzc.bottom).put("left", zzaueVar.zzc.left).put("right", zzaueVar.zzc.right)).put("adBox", new JSONObject().put("top", zzaueVar.zzd.top).put("bottom", zzaueVar.zzd.bottom).put("left", zzaueVar.zzd.left).put("right", zzaueVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzaueVar.zze.top).put("bottom", zzaueVar.zze.bottom).put("left", zzaueVar.zze.left).put("right", zzaueVar.zze.right)).put("globalVisibleBoxVisible", zzaueVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzaueVar.zzg.top).put("bottom", zzaueVar.zzg.bottom).put("left", zzaueVar.zzg.left).put("right", zzaueVar.zzg.right)).put("localVisibleBoxVisible", zzaueVar.zzh).put("hitBox", new JSONObject().put("top", zzaueVar.zzi.top).put("bottom", zzaueVar.zzi.bottom).put("left", zzaueVar.zzi.left).put("right", zzaueVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcoxVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbm)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzaueVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcoxVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
