package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdjw {
    private final zzdom zza;
    private final zzdnb zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdjw(zzdom zzdomVar, zzdnb zzdnbVar) {
        this.zza = zzdomVar;
        this.zzb = zzdnbVar;
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        return zzbzt.zzx(context, i10);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzcft {
        zzcfi zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        View view2 = (View) zza;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        zza.zzad("/sendMessageToSdk", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjs
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjw.this.zzb((zzcfi) obj, map);
            }
        });
        zza.zzad("/hideValidatorOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjt
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjw.this.zzc(windowManager, view, (zzcfi) obj, map);
            }
        });
        zza.zzad("/open", new zzbjc(null, null, null, null, null, null));
        this.zzb.zzj(new WeakReference(zza), "/loadNativeAdPolicyViolations", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdju
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjw.this.zze(view, windowManager, (zzcfi) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showValidatorOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzcaa.zze("Show native ad policy validator overlay.");
                ((zzcfi) obj).zzF().setVisibility(0);
            }
        });
        return (View) zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcfi zzcfiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcfi zzcfiVar, Map map) {
        zzcaa.zze("Hide native ad policy validator overlay.");
        zzcfiVar.zzF().setVisibility(8);
        if (zzcfiVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcfiVar.zzF());
        }
        zzcfiVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnScrollChangedListener(this.zzc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(final View view, final WindowManager windowManager, final zzcfi zzcfiVar, final Map map) {
        int i10;
        zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdjq
            @Override // com.google.android.gms.internal.ads.zzcgt
            public final void zza(boolean z10, int i11, String str, String str2) {
                zzdjw.this.zzd(map, z10, i11, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int zzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhK)).intValue());
        int zzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhL)).intValue());
        int zzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int zzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcfiVar.zzag(zzcgx.zzb(zzf, zzf2));
        try {
            zzcfiVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhM)).booleanValue());
            zzcfiVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhN)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = com.google.android.gms.ads.internal.util.zzbx.zzb();
        zzb.x = zzf3;
        zzb.y = zzf4;
        windowManager.updateViewLayout(zzcfiVar.zzF(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            if (!"1".equals(str) && !"2".equals(str)) {
                i10 = rect.top;
            } else {
                i10 = rect.bottom;
            }
            final int i11 = i10 - zzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdjr
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    zzcfi zzcfiVar2 = zzcfiVar;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i12 = i11;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (view2.getGlobalVisibleRect(rect2) && zzcfiVar2.zzF().getWindowToken() != null) {
                        if (!"1".equals(str2) && !"2".equals(str2)) {
                            layoutParams.y = rect2.top - i12;
                        } else {
                            layoutParams.y = rect2.bottom - i12;
                        }
                        windowManager2.updateViewLayout(zzcfiVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (!TextUtils.isEmpty(str2)) {
            zzcfiVar.loadUrl(str2);
        }
    }
}
