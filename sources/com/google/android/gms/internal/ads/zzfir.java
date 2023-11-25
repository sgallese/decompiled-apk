package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfir {
    private final zzfiz zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze = "";
    private final String zzf;
    private final zzfis zzg;

    private zzfir(zzfiz zzfizVar, WebView webView, String str, List list, String str2, String str3, zzfis zzfisVar) {
        this.zza = zzfizVar;
        this.zzb = webView;
        this.zzg = zzfisVar;
        this.zzf = str2;
    }

    public static zzfir zzb(zzfiz zzfizVar, WebView webView, String str, String str2) {
        return new zzfir(zzfizVar, webView, null, null, str, "", zzfis.HTML);
    }

    public static zzfir zzc(zzfiz zzfizVar, WebView webView, String str, String str2) {
        return new zzfir(zzfizVar, webView, null, null, str, "", zzfis.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfis zzd() {
        return this.zzg;
    }

    public final zzfiz zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
