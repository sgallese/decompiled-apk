package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
final class zzfjm implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfjn zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjm(zzfjn zzfjnVar, WebView webView, String str) {
        this.zzc = zzfjnVar;
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfjn.zzi(this.zza, this.zzb);
    }
}
