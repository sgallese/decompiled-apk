package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbre extends zzbrf implements zzbir {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcfi zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbb zzk;
    private float zzl;
    private int zzm;

    public zzbre(zzcfi zzcfiVar, Context context, zzbbb zzbbbVar) {
        super(zzcfiVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcfiVar;
        this.zzi = context;
        this.zzk = zzbbbVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        JSONObject jSONObject;
        zzcfi zzcfiVar = (zzcfi) obj;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzbzt.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzbzt.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzbzt.zzv(this.zza, zzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = zzbzt.zzv(this.zza, zzN[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrd zzbrdVar = new zzbrd();
        zzbbb zzbbbVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrdVar.zze(zzbbbVar.zza(intent));
        zzbbb zzbbbVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrdVar.zzc(zzbbbVar2.zza(intent2));
        zzbrdVar.zza(this.zzk.zzb());
        zzbrdVar.zzd(this.zzk.zzc());
        zzbrdVar.zzb(true);
        z10 = zzbrdVar.zza;
        z11 = zzbrdVar.zzb;
        z12 = zzbrdVar.zzc;
        z13 = zzbrdVar.zzd;
        z14 = zzbrdVar.zze;
        zzcfi zzcfiVar2 = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z10).put("tel", z11).put("calendar", z12).put("storePicture", z13).put("inlineVideo", z14);
        } catch (JSONException e10) {
            zzcaa.zzh("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObject = null;
        }
        zzcfiVar2.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zzcaa.zzm(2)) {
            zzcaa.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i10, int i11) {
        int i12;
        int i13 = 0;
        if (this.zzi instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i12 = com.google.android.gms.ads.internal.util.zzs.zzO((Activity) this.zzi)[0];
        } else {
            i12 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            int width = this.zzh.getWidth();
            int height = this.zzh.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzS)).booleanValue()) {
                if (width == 0) {
                    if (this.zzh.zzO() != null) {
                        width = this.zzh.zzO().zzb;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i13 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i13);
                }
            }
            i13 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i13);
        }
        zzf(i10, i11 - i12, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i10, i11);
    }
}
