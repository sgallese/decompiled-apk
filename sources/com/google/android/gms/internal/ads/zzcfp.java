package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public class zzcfp extends WebViewClient implements zzcgv {
    public static final /* synthetic */ int zzb = 0;
    private boolean zzA;
    private int zzB;
    private boolean zzC;
    private final zzecs zzE;
    private View.OnAttachStateChangeListener zzF;
    protected zzbxb zza;
    private final zzcfi zzc;
    private final zzaxe zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzo zzh;
    private zzcgt zzi;
    private zzcgu zzj;
    private zzbhh zzk;
    private zzbhj zzl;
    private zzddw zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private com.google.android.gms.ads.internal.overlay.zzz zzv;
    private zzbre zzw;
    private com.google.android.gms.ads.internal.zzb zzx;
    private boolean zzz;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbqz zzy = null;
    private final HashSet zzD = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfw)).split(",")));

    public zzcfp(zzcfi zzcfiVar, zzaxe zzaxeVar, boolean z10, zzbre zzbreVar, zzbqz zzbqzVar, zzecs zzecsVar) {
        this.zzd = zzaxeVar;
        this.zzc = zzcfiVar;
        this.zzs = z10;
        this.zzw = zzbreVar;
        this.zzE = zzecsVar;
    }

    private static WebResourceResponse zzN() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaH)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse zzO(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection;
        String trim;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 <= 20) {
                    URLConnection openConnection = url.openConnection();
                    openConnection.setConnectTimeout(10000);
                    openConnection.setReadTimeout(10000);
                    for (Map.Entry entry : map.entrySet()) {
                        openConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        com.google.android.gms.ads.internal.zzt.zzp().zzf(this.zzc.getContext(), this.zzc.zzn().zza, false, httpURLConnection, false, 60000);
                        zzbzz zzbzzVar = new zzbzz(null);
                        zzbzzVar.zzc(httpURLConnection, null);
                        int responseCode = httpURLConnection.getResponseCode();
                        zzbzzVar.zze(httpURLConnection, responseCode);
                        if (responseCode < 300 || responseCode >= 400) {
                            break;
                        }
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField != null) {
                            if (headerField.startsWith("tel:")) {
                                return null;
                            }
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                zzcaa.zzj("Protocol is null");
                                return zzN();
                            } else if (!protocol.equals("http") && !protocol.equals("https")) {
                                zzcaa.zzj("Unsupported scheme: " + protocol);
                                return zzN();
                            } else {
                                zzcaa.zze("Redirecting to " + headerField);
                                httpURLConnection.disconnect();
                                url = url2;
                            }
                        } else {
                            throw new IOException("Missing Location header in redirect");
                        }
                    } else {
                        throw new IOException("Invalid protocol.");
                    }
                } else {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType = httpURLConnection.getContentType();
            String str2 = "";
            if (TextUtils.isEmpty(contentType)) {
                trim = "";
            } else {
                trim = contentType.split(";")[0].trim();
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            String contentType2 = httpURLConnection.getContentType();
            if (!TextUtils.isEmpty(contentType2)) {
                String[] split = contentType2.split(";");
                if (split.length != 1) {
                    int i11 = 1;
                    while (true) {
                        if (i11 >= split.length) {
                            break;
                        }
                        if (split[i11].trim().startsWith("charset")) {
                            String[] split2 = split[i11].trim().split("=");
                            if (split2.length > 1) {
                                str2 = split2[1].trim();
                                break;
                            }
                        }
                        i11++;
                    }
                }
            }
            String str3 = str2;
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap(headerFields.size());
            for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                    hashMap.put(entry2.getKey(), entry2.getValue().get(0));
                }
            }
            return com.google.android.gms.ads.internal.zzt.zzq().zzc(trim, str3, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                com.google.android.gms.ads.internal.util.zze.zza("  " + str2 + ": " + ((String) map.get(str2)));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbir) it.next()).zza(this.zzc, map);
        }
    }

    private final void zzQ() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzF;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zzc).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzR(final View view, final zzbxb zzbxbVar, final int i10) {
        if (zzbxbVar.zzi() && i10 > 0) {
            zzbxbVar.zzg(view);
            if (zzbxbVar.zzi()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcfp.this.zzo(view, zzbxbVar, i10);
                    }
                }, 100L);
            }
        }
    }

    private static final boolean zzS(zzcfi zzcfiVar) {
        if (zzcfiVar.zzD() != null) {
            return zzcfiVar.zzD().zzaj;
        }
        return false;
    }

    private static final boolean zzT(boolean z10, zzcfi zzcfiVar) {
        if (z10 && !zzcfiVar.zzO().zzi() && !zzcfiVar.zzS().equals("interstitial_mb")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            if (this.zzc.zzaz()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                this.zzc.zzU();
                return;
            }
            this.zzz = true;
            zzcgu zzcguVar = this.zzj;
            if (zzcguVar != null) {
                zzcguVar.zza();
                this.zzj = null;
            }
            zzg();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        int rendererPriorityAtExit;
        zzcfi zzcfiVar = this.zzc;
        didCrash = renderProcessGoneDetail.didCrash();
        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
        return zzcfiVar.zzay(didCrash, rendererPriorityAtExit);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzc(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            zzj(parse);
        } else {
            if (this.zzn && webView == this.zzc.zzG()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbxb zzbxbVar = this.zza;
                        if (zzbxbVar != null) {
                            zzbxbVar.zzh(str);
                        }
                        this.zzg = null;
                    }
                    zzddw zzddwVar = this.zzm;
                    if (zzddwVar != null) {
                        zzddwVar.zzbK();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.zzc.zzG().willNotDraw()) {
                try {
                    zzaqx zzI = this.zzc.zzI();
                    if (zzI != null && zzI.zzf(parse)) {
                        Context context = this.zzc.getContext();
                        zzcfi zzcfiVar = this.zzc;
                        parse = zzI.zza(parse, context, (View) zzcfiVar, zzcfiVar.zzi());
                    }
                } catch (zzaqy unused) {
                    zzcaa.zzj("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzx;
                if (zzbVar != null && !zzbVar.zzc()) {
                    this.zzx.zzb(str);
                } else {
                    zzt(new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                }
            } else {
                zzcaa.zzj("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzA(zzcgt zzcgtVar) {
        this.zzi = zzcgtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzB(int i10, int i11) {
        zzbqz zzbqzVar = this.zzy;
        if (zzbqzVar != null) {
            zzbqzVar.zzd(i10, i11);
        }
    }

    public final void zzC(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzD(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzE() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfk
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfp.this.zzn();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzF(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzG(zzcgu zzcguVar) {
        this.zzj = zzcguVar;
    }

    public final void zzH(String str, zzbir zzbirVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbirVar);
        }
    }

    public final void zzI(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzbir> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzbir zzbirVar : list) {
                if (predicate.apply(zzbirVar)) {
                    arrayList.add(zzbirVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean zzJ() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final boolean zzK() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzL() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzM(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhh zzbhhVar, com.google.android.gms.ads.internal.overlay.zzo zzoVar, zzbhj zzbhjVar, com.google.android.gms.ads.internal.overlay.zzz zzzVar, boolean z10, zzbit zzbitVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbrg zzbrgVar, zzbxb zzbxbVar, final zzech zzechVar, final zzfik zzfikVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzbjk zzbjkVar, final zzddw zzddwVar, zzbjj zzbjjVar, zzbjd zzbjdVar, final zzcob zzcobVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zzc.getContext(), zzbxbVar, null) : zzbVar;
        this.zzy = new zzbqz(this.zzc, zzbrgVar);
        this.zza = zzbxbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaP)).booleanValue()) {
            zzz("/adMetadata", new zzbhg(zzbhhVar));
        }
        if (zzbhjVar != null) {
            zzz("/appEvent", new zzbhi(zzbhjVar));
        }
        zzz("/backButton", zzbiq.zzj);
        zzz("/refresh", zzbiq.zzk);
        zzz("/canOpenApp", zzbiq.zzb);
        zzz("/canOpenURLs", zzbiq.zza);
        zzz("/canOpenIntents", zzbiq.zzc);
        zzz("/close", zzbiq.zzd);
        zzz("/customClose", zzbiq.zze);
        zzz("/instrument", zzbiq.zzn);
        zzz("/delayPageLoaded", zzbiq.zzp);
        zzz("/delayPageClosed", zzbiq.zzq);
        zzz("/getLocationInfo", zzbiq.zzr);
        zzz("/log", zzbiq.zzg);
        zzz("/mraid", new zzbix(zzbVar2, this.zzy, zzbrgVar));
        zzbre zzbreVar = this.zzw;
        if (zzbreVar != null) {
            zzz("/mraidLoaded", zzbreVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzz("/open", new zzbjc(zzbVar2, this.zzy, zzechVar, zzdrhVar, zzfgoVar, zzcobVar));
        zzz("/precache", new zzcdv());
        zzz("/touch", zzbiq.zzi);
        zzz("/video", zzbiq.zzl);
        zzz("/videoMeta", zzbiq.zzm);
        if (zzechVar != null && zzfikVar != null) {
            zzz("/click", new zzbir() { // from class: com.google.android.gms.internal.ads.zzfcg
                @Override // com.google.android.gms.internal.ads.zzbir
                public final void zza(Object obj, Map map) {
                    zzddw zzddwVar2 = zzddw.this;
                    zzcob zzcobVar2 = zzcobVar;
                    zzfik zzfikVar2 = zzfikVar;
                    zzech zzechVar2 = zzechVar;
                    zzcfi zzcfiVar = (zzcfi) obj;
                    zzbiq.zzc(map, zzddwVar2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcaa.zzj("URL missing from click GMSG.");
                    } else {
                        zzfye.zzr(zzbiq.zza(zzcfiVar, str), new zzfci(zzcfiVar, zzcobVar2, zzfikVar2, zzechVar2), zzcan.zza);
                    }
                }
            });
            zzz("/httpTrack", new zzbir() { // from class: com.google.android.gms.internal.ads.zzfch
                @Override // com.google.android.gms.internal.ads.zzbir
                public final void zza(Object obj, Map map) {
                    zzfik zzfikVar2 = zzfik.this;
                    zzech zzechVar2 = zzechVar;
                    zzcez zzcezVar = (zzcez) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        zzcaa.zzj("URL missing from httpTrack GMSG.");
                    } else if (!zzcezVar.zzD().zzaj) {
                        zzfikVar2.zzc(str, null);
                    } else {
                        zzechVar2.zzd(new zzecj(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), ((zzcgf) zzcezVar).zzP().zzb, str, 2));
                    }
                }
            });
        } else {
            zzz("/click", new zzbhr(zzddwVar, zzcobVar));
            zzz("/httpTrack", zzbiq.zzf);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(this.zzc.getContext())) {
            zzz("/logScionEvent", new zzbiw(this.zzc.getContext()));
        }
        if (zzbitVar != null) {
            zzz("/setInterstitialProperties", new zzbis(zzbitVar));
        }
        if (zzbjkVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziz)).booleanValue()) {
                zzz("/inspectorNetworkExtras", zzbjkVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziS)).booleanValue() && zzbjjVar != null) {
            zzz("/shareSheet", zzbjjVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zziX)).booleanValue() && zzbjdVar != null) {
            zzz("/inspectorOutOfContextTest", zzbjdVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkl)).booleanValue()) {
            zzz("/bindPlayStoreOverlay", zzbiq.zzu);
            zzz("/presentPlayStoreOverlay", zzbiq.zzv);
            zzz("/expandPlayStoreOverlay", zzbiq.zzw);
            zzz("/collapsePlayStoreOverlay", zzbiq.zzx);
            zzz("/closePlayStoreOverlay", zzbiq.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzcW)).booleanValue()) {
            zzz("/setPAIDPersonalizationEnabled", zzbiq.zzA);
            zzz("/resetPAID", zzbiq.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkC)).booleanValue()) {
            zzcfi zzcfiVar = this.zzc;
            if (zzcfiVar.zzD() != null && zzcfiVar.zzD().zzar) {
                zzz("/writeToLocalStorage", zzbiq.zzB);
                zzz("/clearLocalStorageKeys", zzbiq.zzC);
            }
        }
        this.zzg = zzaVar;
        this.zzh = zzoVar;
        this.zzk = zzbhhVar;
        this.zzl = zzbhjVar;
        this.zzv = zzzVar;
        this.zzx = zzbVar3;
        this.zzm = zzddwVar;
        this.zzn = z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zza() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzb() {
        synchronized (this.zzf) {
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzbK();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final WebResourceResponse zzc(String str, Map map) {
        zzawn zzb2;
        try {
            String zzc = zzbyh.zzc(str, this.zzc.getContext(), this.zzC);
            if (!zzc.equals(str)) {
                return zzO(zzc, map);
            }
            zzawq zza = zzawq.zza(Uri.parse(str));
            if (zza != null && (zzb2 = com.google.android.gms.ads.internal.zzt.zzc().zzb(zza)) != null && zzb2.zze()) {
                return new WebResourceResponse("", "", zzb2.zzc());
            }
            if (zzbzz.zzk() && ((Boolean) zzbdg.zzb.zze()).booleanValue()) {
                return zzO(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "AdWebViewClient.interceptRequest");
            return zzN();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final com.google.android.gms.ads.internal.zzb zzd() {
        return this.zzx;
    }

    public final void zzg() {
        if (this.zzi != null && ((this.zzz && this.zzB <= 0) || this.zzA || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && this.zzc.zzm() != null) {
                zzbcb.zza(this.zzc.zzm().zza(), this.zzc.zzk(), "awfllc");
            }
            zzcgt zzcgtVar = this.zzi;
            boolean z10 = false;
            if (!this.zzA && !this.zzo) {
                z10 = true;
            }
            zzcgtVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zzc.zzac();
    }

    public final void zzh() {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            zzbxbVar.zze();
            this.zza = null;
        }
        zzQ();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzv = null;
            this.zzx = null;
            this.zzw = null;
            zzbqz zzbqzVar = this.zzy;
            if (zzbqzVar != null) {
                zzbqzVar.zza(true);
                this.zzy = null;
            }
        }
    }

    public final void zzi(boolean z10) {
        this.zzC = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzj(Uri uri) {
        final String str;
        String path = uri.getPath();
        List list = (List) this.zze.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfv)).booleanValue() && this.zzD.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzfx)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzfye.zzr(com.google.android.gms.ads.internal.zzt.zzp().zzb(uri), new zzcfn(this, list, path, uri), zzcan.zze);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            zzP(com.google.android.gms.ads.internal.util.zzs.zzM(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzgE)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzf() != null) {
            if (path != null && path.length() >= 2) {
                str = path.substring(1);
            } else {
                str = "null";
            }
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfj
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    int i10 = zzcfp.zzb;
                    com.google.android.gms.ads.internal.zzt.zzo().zzf().zze(str2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzk() {
        zzaxe zzaxeVar = this.zzd;
        if (zzaxeVar != null) {
            zzaxeVar.zzc(10005);
        }
        this.zzA = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzg();
        this.zzc.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzl() {
        synchronized (this.zzf) {
        }
        this.zzB++;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzm() {
        this.zzB--;
        zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        this.zzc.zzaa();
        com.google.android.gms.ads.internal.overlay.zzl zzL = this.zzc.zzL();
        if (zzL != null) {
            zzL.zzz();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(View view, zzbxb zzbxbVar, int i10) {
        zzR(view, zzbxbVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzp(int i10, int i11, boolean z10) {
        zzbre zzbreVar = this.zzw;
        if (zzbreVar != null) {
            zzbreVar.zzb(i10, i11);
        }
        zzbqz zzbqzVar = this.zzy;
        if (zzbqzVar != null) {
            zzbqzVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zzq() {
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            WebView zzG = this.zzc.zzG();
            if (androidx.core.view.p0.X(zzG)) {
                zzR(zzG, zzbxbVar, 10);
                return;
            }
            zzQ();
            zzcfm zzcfmVar = new zzcfm(this, zzbxbVar);
            this.zzF = zzcfmVar;
            ((View) this.zzc).addOnAttachStateChangeListener(zzcfmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzddw zzddwVar = this.zzm;
        if (zzddwVar != null) {
            zzddwVar.zzs();
        }
    }

    public final void zzt(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        com.google.android.gms.ads.internal.overlay.zzo zzoVar;
        zzddw zzddwVar;
        boolean zzaA = this.zzc.zzaA();
        boolean zzT = zzT(zzaA, this.zzc);
        boolean z11 = true;
        if (!zzT && z10) {
            z11 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzoVar = null;
        } else {
            zzoVar = this.zzh;
        }
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcag zzn = this.zzc.zzn();
        zzcfi zzcfiVar = this.zzc;
        if (z11) {
            zzddwVar = null;
        } else {
            zzddwVar = this.zzm;
        }
        zzw(new AdOverlayInfoParcel(zzcVar, zzaVar, zzoVar, zzzVar, zzn, zzcfiVar, zzddwVar));
    }

    public final void zzu(String str, String str2, int i10) {
        zzcfi zzcfiVar = this.zzc;
        zzw(new AdOverlayInfoParcel(zzcfiVar, zzcfiVar.zzn(), str, str2, 14, this.zzE));
    }

    public final void zzv(boolean z10, int i10, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzddw zzddwVar;
        zzecs zzecsVar;
        boolean zzT = zzT(this.zzc.zzaA(), this.zzc);
        boolean z12 = true;
        if (!zzT && z11) {
            z12 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.zzh;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzcag zzn = zzcfiVar.zzn();
        if (z12) {
            zzddwVar = null;
        } else {
            zzddwVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzecsVar = this.zzE;
        } else {
            zzecsVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzoVar, zzzVar, zzcfiVar, z10, i10, zzn, zzddwVar, zzecsVar));
    }

    public final void zzw(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z10;
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbqz zzbqzVar = this.zzy;
        if (zzbqzVar != null) {
            z10 = zzbqzVar.zze();
        } else {
            z10 = false;
        }
        com.google.android.gms.ads.internal.zzt.zzi();
        com.google.android.gms.ads.internal.overlay.zzm.zza(this.zzc.getContext(), adOverlayInfoParcel, !z10);
        zzbxb zzbxbVar = this.zza;
        if (zzbxbVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbxbVar.zzh(str);
        }
    }

    public final void zzx(boolean z10, int i10, String str, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfo zzcfoVar;
        zzddw zzddwVar;
        zzecs zzecsVar;
        boolean zzaA = this.zzc.zzaA();
        boolean zzT = zzT(zzaA, this.zzc);
        boolean z12 = true;
        if (!zzT && z11) {
            z12 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzcfoVar = null;
        } else {
            zzcfoVar = new zzcfo(this.zzc, this.zzh);
        }
        zzbhh zzbhhVar = this.zzk;
        zzbhj zzbhjVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzcag zzn = zzcfiVar.zzn();
        if (z12) {
            zzddwVar = null;
        } else {
            zzddwVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzecsVar = this.zzE;
        } else {
            zzecsVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfoVar, zzbhhVar, zzbhjVar, zzzVar, zzcfiVar, z10, i10, str, zzn, zzddwVar, zzecsVar));
    }

    public final void zzy(boolean z10, int i10, String str, String str2, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzcfo zzcfoVar;
        zzddw zzddwVar;
        zzecs zzecsVar;
        boolean zzaA = this.zzc.zzaA();
        boolean zzT = zzT(zzaA, this.zzc);
        boolean z12 = true;
        if (!zzT && z11) {
            z12 = false;
        }
        if (zzT) {
            zzaVar = null;
        } else {
            zzaVar = this.zzg;
        }
        if (zzaA) {
            zzcfoVar = null;
        } else {
            zzcfoVar = new zzcfo(this.zzc, this.zzh);
        }
        zzbhh zzbhhVar = this.zzk;
        zzbhj zzbhjVar = this.zzl;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.zzv;
        zzcfi zzcfiVar = this.zzc;
        zzcag zzn = zzcfiVar.zzn();
        if (z12) {
            zzddwVar = null;
        } else {
            zzddwVar = this.zzm;
        }
        if (zzS(this.zzc)) {
            zzecsVar = this.zzE;
        } else {
            zzecsVar = null;
        }
        zzw(new AdOverlayInfoParcel(zzaVar, zzcfoVar, zzbhhVar, zzbhjVar, zzzVar, zzcfiVar, z10, i10, str, str2, zzn, zzddwVar, zzecsVar));
    }

    public final void zzz(String str, zzbir zzbirVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.zze.put(str, list);
            }
            list.add(zzbirVar);
        }
    }
}
