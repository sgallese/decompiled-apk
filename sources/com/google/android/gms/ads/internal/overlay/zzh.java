package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcfi zzcfiVar) throws zzf {
        this.zzb = zzcfiVar.getLayoutParams();
        ViewParent parent = zzcfiVar.getParent();
        this.zzd = zzcfiVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcfiVar.zzF());
            viewGroup.removeView(zzcfiVar.zzF());
            zzcfiVar.zzan(true);
            return;
        }
        throw new zzf("Could not get the parent of the WebView for an overlay.");
    }
}
