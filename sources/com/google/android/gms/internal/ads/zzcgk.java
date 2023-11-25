package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcgk extends zzcgl {
    public zzcgk(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z10, zzecs zzecsVar) {
        super(zzcfiVar, zzaxeVar, z10, zzecsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfp, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
