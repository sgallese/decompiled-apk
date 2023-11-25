package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfjx extends zzfju {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfjx(Map map, String str) {
        this.zzc = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final void zzc() {
        long convert;
        super.zzc();
        if (this.zzb == null) {
            convert = 4000;
        } else {
            convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfjw(this), Math.max(4000 - convert, 2000L));
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final void zzg(zzfit zzfitVar, zzfir zzfirVar) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfirVar.zzi();
        Iterator it = zzi.keySet().iterator();
        if (!it.hasNext()) {
            zzh(zzfitVar, zzfirVar, jSONObject);
        } else {
            zzfja zzfjaVar = (zzfja) zzi.get((String) it.next());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfju
    public final void zzk() {
        WebView webView = new WebView(zzfjl.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        zzj(this.zza);
        zzfjn.zzi(this.zza, null);
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfja zzfjaVar = (zzfja) this.zzc.get((String) it.next());
        throw null;
    }
}
