package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdjc {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfca zzc;
    private final zzdih zzd;
    private final zzdic zze;
    private final zzdjo zzf;
    private final zzdjw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbek zzj;
    private final zzdhz zzk;

    public zzdjc(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfca zzfcaVar, zzdih zzdihVar, zzdic zzdicVar, zzdjo zzdjoVar, zzdjw zzdjwVar, Executor executor, Executor executor2, zzdhz zzdhzVar) {
        this.zzb = zzgVar;
        this.zzc = zzfcaVar;
        this.zzj = zzfcaVar.zzi;
        this.zzd = zzdihVar;
        this.zze = zzdicVar;
        this.zzf = zzdjoVar;
        this.zzg = zzdjwVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdhzVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                }
                layoutParams.addRule(12);
                layoutParams.addRule(9);
                return;
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdF)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z10;
        zzdic zzdicVar = this.zze;
        if (zzdicVar.zzf() != null) {
            if (viewGroup != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zzdicVar.zzc() != 2 && zzdicVar.zzc() != 1) {
                if (zzdicVar.zzc() == 6) {
                    this.zzb.zzJ(this.zzc.zzf, "2", z10);
                    this.zzb.zzJ(this.zzc.zzf, "1", z10);
                    return;
                }
                return;
            }
            this.zzb.zzJ(this.zzc.zzf, String.valueOf(zzdicVar.zzc()), z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzdjy zzdjyVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbet zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View zzg = zzdjyVar.zzg(strArr[i10]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = zzdjyVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdic zzdicVar = this.zze;
        if (zzdicVar.zze() != null) {
            view = zzdicVar.zze();
            zzbek zzbekVar = this.zzj;
            if (zzbekVar != null && viewGroup == null) {
                zzh(layoutParams, zzbekVar.zze);
                view.setLayoutParams(layoutParams);
            }
        } else if (!(zzdicVar.zzl() instanceof zzbef)) {
            view = null;
        } else {
            zzbef zzbefVar = (zzbef) zzdicVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbefVar.zzc());
            }
            View zzbegVar = new zzbeg(context2, zzbefVar, layoutParams);
            zzbegVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdD));
            view = zzbegVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdjyVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdjyVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdjyVar.zzq(zzdjyVar.zzk(), view, true);
        }
        zzfud zzfudVar = zzdiy.zza;
        int size = zzfudVar.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                View zzg2 = zzdjyVar.zzg((String) zzfudVar.get(i11));
                i11++;
                if (zzg2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) zzg2;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdiz
            @Override // java.lang.Runnable
            public final void run() {
                zzdjc.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdic zzdicVar2 = this.zze;
                if (zzdicVar2.zzs() != null) {
                    zzdicVar2.zzs().zzao(new zzdjb(zzdjyVar, viewGroup2));
                }
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjn)).booleanValue() && zzi(viewGroup2, false)) {
                zzdic zzdicVar3 = this.zze;
                if (zzdicVar3.zzq() != null) {
                    zzdicVar3.zzq().zzao(new zzdjb(zzdjyVar, viewGroup2));
                }
            } else {
                viewGroup2.removeAllViews();
                View zzf = zzdjyVar.zzf();
                if (zzf != null) {
                    context = zzf.getContext();
                }
                if (context != null && (zza2 = this.zzk.zza()) != null) {
                    try {
                        IObjectWrapper zzi = zza2.zzi();
                        if (zzi != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) != null) {
                            ImageView imageView = new ImageView(context);
                            imageView.setImageDrawable(drawable);
                            IObjectWrapper zzj = zzdjyVar.zzj();
                            if (zzj != null) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzga)).booleanValue()) {
                                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup2.addView(imageView);
                                }
                            }
                            imageView.setScaleType(zza);
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                            viewGroup2.addView(imageView);
                        }
                    } catch (RemoteException unused) {
                        zzcaa.zzj("Could not get main image drawable");
                    }
                }
            }
        }
    }

    public final void zzc(zzdjy zzdjyVar) {
        if (zzdjyVar == null || this.zzf == null || zzdjyVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdjyVar.zzh().addView(this.zzf.zza());
        } catch (zzcft e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
        }
    }

    public final void zzd(zzdjy zzdjyVar) {
        if (zzdjyVar == null) {
            return;
        }
        Context context = zzdjyVar.zzf().getContext();
        if (!com.google.android.gms.ads.internal.util.zzbx.zzh(context, this.zzd.zza)) {
            return;
        }
        if (!(context instanceof Activity)) {
            zzcaa.zze("Activity context is needed for policy validator.");
        } else if (this.zzg != null && zzdjyVar.zzh() != null) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdjyVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbx.zzb());
            } catch (zzcft e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final void zze(final zzdjy zzdjyVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdja
            @Override // java.lang.Runnable
            public final void run() {
                zzdjc.this.zzb(zzdjyVar);
            }
        });
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
