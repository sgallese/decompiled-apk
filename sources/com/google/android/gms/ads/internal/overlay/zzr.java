package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzad zzb;

    public zzr(Context context, zzq zzqVar, zzad zzadVar) {
        super(context);
        zzp zzpVar;
        this.zzb = zzadVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzay.zzb();
        int zzx = zzbzt.zzx(context, zzqVar.zza);
        zzay.zzb();
        int zzx2 = zzbzt.zzx(context, 0);
        zzay.zzb();
        int zzx3 = zzbzt.zzx(context, zzqVar.zzb);
        zzay.zzb();
        imageButton.setPadding(zzx, zzx2, zzx3, zzbzt.zzx(context, zzqVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzay.zzb();
        int zzx4 = zzbzt.zzx(context, zzqVar.zzd + zzqVar.zza + zzqVar.zzb);
        zzay.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzx4, zzbzt.zzx(context, zzqVar.zzd + zzqVar.zzc), 17));
        long longValue = ((Long) zzba.zzc().zzb(zzbbr.zzba)).longValue();
        if (longValue <= 0) {
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzbb)).booleanValue()) {
            zzpVar = new zzp(this);
        } else {
            zzpVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzpVar);
    }

    private final void zzc() {
        String str = (String) zzba.zzc().zzb(zzbbr.zzaZ);
        if (PlatformVersion.isAtLeastLollipop() && !TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources zzd = com.google.android.gms.ads.internal.zzt.zzo().zzd();
            if (zzd != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = zzd.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    zzcaa.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.zza.setImageResource(17301527);
                    return;
                }
                this.zza.setImageDrawable(drawable);
                this.zza.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            this.zza.setImageResource(17301527);
            return;
        }
        this.zza.setImageResource(17301527);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzad zzadVar = this.zzb;
        if (zzadVar != null) {
            zzadVar.zzj();
        }
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zza.setVisibility(8);
            if (((Long) zzba.zzc().zzb(zzbbr.zzba)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
