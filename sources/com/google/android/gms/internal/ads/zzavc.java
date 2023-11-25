package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzavc implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzauu zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzave zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavc(zzave zzaveVar, final zzauu zzauuVar, final WebView webView, final boolean z10) {
        this.zze = zzaveVar;
        this.zzb = zzauuVar;
        this.zzc = webView;
        this.zzd = z10;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzavb
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                zzavc zzavcVar = zzavc.this;
                zzauu zzauuVar2 = zzauuVar;
                WebView webView2 = webView;
                boolean z11 = z10;
                zzavcVar.zze.zzd(zzauuVar2, webView2, (String) obj, z11);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzc.getSettings().getJavaScriptEnabled()) {
            try {
                this.zzc.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
