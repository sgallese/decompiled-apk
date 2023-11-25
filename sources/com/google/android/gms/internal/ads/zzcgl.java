package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzcgl extends zzcfp {
    public zzcgl(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z10, zzecs zzecsVar) {
        super(zzcfiVar, zzaxeVar, z10, new zzbre(zzcfiVar, zzcfiVar.zzE(), new zzbbb(zzcfiVar.getContext())), null, zzecsVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzN(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzcfi)) {
            zzcaa.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzcfi zzcfiVar = (zzcfi) webView;
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            zzbxbVar.zzd(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzc(str, map);
        }
        if (zzcfiVar.zzN() != null) {
            zzcfiVar.zzN().zzE();
        }
        if (zzcfiVar.zzO().zzi()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzP);
        } else if (zzcfiVar.zzaA()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzO);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzN);
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzs.zzu(zzcfiVar.getContext(), zzcfiVar.zzn().zza, str2);
    }
}
