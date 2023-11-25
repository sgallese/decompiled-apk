package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@TargetApi(21)
/* loaded from: classes3.dex */
public final class zzcgm extends zzcgl {
    public zzcgm(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z10, zzecs zzecsVar) {
        super(zzcfiVar, zzaxeVar, z10, zzecsVar);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
            return zzN(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        return null;
    }
}
