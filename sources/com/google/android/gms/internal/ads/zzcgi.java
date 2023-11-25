package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcgi {
    private final zzcgj zza;
    private final zzcgh zzb;

    public zzcgi(zzcgj zzcgjVar, zzcgh zzcghVar) {
        this.zzb = zzcghVar;
        this.zza = zzcgjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzcgq] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r02 = this.zza;
        zzaqx zzI = r02.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaqt zzc = zzI.zzc();
        if (r02.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcgj zzcgjVar = this.zza;
        return zzc.zzf(context, str, (View) zzcgjVar, zzcgjVar.zzi());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzcgq] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r02 = this.zza;
        zzaqx zzI = r02.zzI();
        if (zzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzaqt zzc = zzI.zzc();
        if (r02.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        Context context = this.zza.getContext();
        zzcgj zzcgjVar = this.zza;
        return zzc.zzh(context, (View) zzcgjVar, zzcgjVar.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            zzcaa.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgg
                @Override // java.lang.Runnable
                public final void run() {
                    zzcgi.this.zza(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        zzcgh zzcghVar = this.zzb;
        Uri parse = Uri.parse(str);
        zzcfp zzaJ = ((zzcgb) zzcghVar.zza).zzaJ();
        if (zzaJ == null) {
            zzcaa.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzaJ.zzj(parse);
        }
    }
}
