package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcrq extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcrq(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcrq zza(Context context, View view, zzfbe zzfbeVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcrq zzcrqVar = new zzcrq(context);
        if (!zzfbeVar.zzv.isEmpty() && (resources = zzcrqVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f10 = ((zzfbf) zzfbeVar.zzv.get(0)).zza;
            float f11 = displayMetrics.density;
            zzcrqVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (r1.zzb * f11)));
        }
        zzcrqVar.zzb = view;
        zzcrqVar.addView(view);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcba.zzb(zzcrqVar, zzcrqVar);
        com.google.android.gms.ads.internal.zzt.zzx();
        zzcba.zza(zzcrqVar, zzcrqVar);
        JSONObject jSONObject = zzfbeVar.zzai;
        RelativeLayout relativeLayout = new RelativeLayout(zzcrqVar.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcrqVar.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcrqVar.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcrqVar.addView(relativeLayout);
        return zzcrqVar;
    }

    private final int zzb(double d10) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzt.zzx(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i10) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb, 0, zzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i10);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.zzb.setY(-r0[1]);
    }
}
