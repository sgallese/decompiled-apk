package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class zzcgb extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, zzcfi {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private boolean zzB;
    private zzbej zzC;
    private zzbeh zzD;
    private zzavs zzE;
    private int zzF;
    private int zzG;
    private zzbcg zzH;
    private final zzbcg zzI;
    private zzbcg zzJ;
    private final zzbch zzK;
    private int zzL;
    private com.google.android.gms.ads.internal.overlay.zzl zzM;
    private boolean zzN;
    private final com.google.android.gms.ads.internal.util.zzcm zzO;
    private int zzP;
    private int zzQ;
    private int zzR;
    private int zzS;
    private Map zzT;
    private final WindowManager zzU;
    private final zzaxe zzV;
    private final zzcgw zzb;
    private final zzaqx zzc;
    private final zzbct zzd;
    private final zzcag zze;
    private com.google.android.gms.ads.internal.zzl zzf;
    private final com.google.android.gms.ads.internal.zza zzg;
    private final DisplayMetrics zzh;
    private final float zzi;
    private zzfbe zzj;
    private zzfbi zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcfp zzn;
    private com.google.android.gms.ads.internal.overlay.zzl zzo;
    private zzfip zzp;
    private zzcgx zzq;
    private final String zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private Boolean zzw;
    private boolean zzx;
    private final String zzy;
    private zzcge zzz;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcgb(zzcgw zzcgwVar, zzcgx zzcgxVar, String str, boolean z10, boolean z11, zzaqx zzaqxVar, zzbct zzbctVar, zzcag zzcagVar, zzbcj zzbcjVar, com.google.android.gms.ads.internal.zzl zzlVar, com.google.android.gms.ads.internal.zza zzaVar, zzaxe zzaxeVar, zzfbe zzfbeVar, zzfbi zzfbiVar) {
        super(zzcgwVar);
        zzfbi zzfbiVar2;
        this.zzl = false;
        this.zzm = false;
        this.zzx = true;
        this.zzy = "";
        this.zzP = -1;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzS = -1;
        this.zzb = zzcgwVar;
        this.zzq = zzcgxVar;
        this.zzr = str;
        this.zzu = z10;
        this.zzc = zzaqxVar;
        this.zzd = zzbctVar;
        this.zze = zzcagVar;
        this.zzf = zzlVar;
        this.zzg = zzaVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.zzU = windowManager;
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzq = com.google.android.gms.ads.internal.util.zzs.zzq(windowManager);
        this.zzh = zzq;
        this.zzi = zzq.density;
        this.zzV = zzaxeVar;
        this.zzj = zzfbeVar;
        this.zzk = zzfbiVar;
        this.zzO = new com.google.android.gms.ads.internal.util.zzcm(zzcgwVar.zza(), this, this, null);
        setBackgroundColor(0);
        final WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            zzcaa.zzh("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzkr)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(com.google.android.gms.ads.internal.zzt.zzp().zzc(zzcgwVar, zzcagVar.zza));
        com.google.android.gms.ads.internal.zzt.zzp();
        final Context context = getContext();
        com.google.android.gms.ads.internal.util.zzcf.zza(context, new Callable() { // from class: com.google.android.gms.ads.internal.util.zzm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WebSettings webSettings = settings;
                Context context2 = context;
                zzfoe zzfoeVar = zzs.zza;
                webSettings.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaI)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        zzaS();
        addJavascriptInterface(new zzcgi(this, new zzcgh(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        zzba();
        zzbch zzbchVar = new zzbch(new zzbcj(true, "make_wv", this.zzr));
        this.zzK = zzbchVar;
        zzbchVar.zza().zzc(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzbN)).booleanValue() && (zzfbiVar2 = this.zzk) != null && zzfbiVar2.zzb != null) {
            zzbchVar.zza().zzd("gqi", this.zzk.zzb);
        }
        zzbchVar.zza();
        zzbcg zzf = zzbcj.zzf();
        this.zzI = zzf;
        zzbchVar.zzb("native:view_create", zzf);
        this.zzJ = null;
        this.zzH = null;
        com.google.android.gms.ads.internal.util.zzci.zza().zzb(zzcgwVar);
        com.google.android.gms.ads.internal.zzt.zzo().zzr();
    }

    private final synchronized void zzaS() {
        zzfbe zzfbeVar = this.zzj;
        if (zzfbeVar != null && zzfbeVar.zzan) {
            zzcaa.zze("Disabling hardware acceleration on an overlay.");
            zzaU();
            return;
        }
        if (!this.zzu && !this.zzq.zzi()) {
            zzcaa.zze("Enabling hardware acceleration on an AdView.");
            zzaW();
            return;
        }
        zzcaa.zze("Enabling hardware acceleration on an overlay.");
        zzaW();
    }

    private final synchronized void zzaT() {
        if (!this.zzN) {
            this.zzN = true;
            com.google.android.gms.ads.internal.zzt.zzo().zzq();
        }
    }

    private final synchronized void zzaU() {
        if (!this.zzv) {
            setLayerType(1, null);
        }
        this.zzv = true;
    }

    private final void zzaV(boolean z10) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        zzd("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void zzaW() {
        if (this.zzv) {
            setLayerType(0, null);
        }
        this.zzv = false;
    }

    private final synchronized void zzaX(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrlUnsafe");
            zzcaa.zzk("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void zzaY() {
        zzbcb.zza(this.zzK.zza(), this.zzI, "aeh2");
    }

    private final synchronized void zzaZ() {
        Map map = this.zzT;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzcdu) it.next()).release();
            }
        }
        this.zzT = null;
    }

    private final void zzba() {
        zzbch zzbchVar = this.zzK;
        if (zzbchVar == null) {
            return;
        }
        zzbcj zza2 = zzbchVar.zza();
        zzbbz zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf();
        if (zzf != null) {
            zzf.zzf(zza2);
        }
    }

    private final synchronized void zzbb() {
        Boolean zzk = com.google.android.gms.ads.internal.zzt.zzo().zzk();
        this.zzw = zzk;
        if (zzk == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                zzaQ(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                zzaQ(Boolean.FALSE);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void destroy() {
        zzba();
        this.zzO.zza();
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzb();
            this.zzo.zzm();
            this.zzo = null;
        }
        this.zzp = null;
        this.zzn.zzh();
        this.zzE = null;
        this.zzf = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.zzt) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
        zzaZ();
        this.zzt = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjM)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Initiating WebView self destruct sequence in 3...");
            com.google.android.gms.ads.internal.util.zze.zza("Loading blank page in WebView, 2...");
            zzaX("about:blank");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Destroying the WebView immediately...");
        zzU();
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (zzaz()) {
            zzcaa.zzl("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        super.evaluateJavascript(str, valueCallback);
    }

    protected final void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.zzt) {
                    this.zzn.zzh();
                    com.google.android.gms.ads.internal.zzt.zzy().zzd(this);
                    zzaZ();
                    zzaT();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!zzaz()) {
            super.loadData(str, str2, str3);
        } else {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!zzaz()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final synchronized void loadUrl(String str) {
        if (!zzaz()) {
            try {
                super.loadUrl(str);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "AdWebViewImpl.loadUrl");
                zzcaa.zzk("Could not call loadUrl. ", th);
                return;
            }
        }
        zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!zzaz()) {
            this.zzO.zzc();
        }
        boolean z10 = this.zzA;
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null && zzcfpVar.zzL()) {
            if (!this.zzB) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = true;
            }
            zzaR();
            z10 = true;
        }
        zzaV(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        zzcfp zzcfpVar;
        synchronized (this) {
            if (!zzaz()) {
                this.zzO.zzd();
            }
            super.onDetachedFromWindow();
            if (this.zzB && (zzcfpVar = this.zzn) != null && zzcfpVar.zzL() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.zzn.zza();
                this.zzn.zzb();
                this.zzB = false;
            }
        }
        zzaV(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzQ(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            zzcaa.zze("Couldn't find an Activity to view url/mimetype: " + str + " / " + str4);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (zzaz()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue <= 0.0f || canScrollVertically(-1)) {
                if (axisValue >= 0.0f || canScrollVertically(1)) {
                    if (axisValue2 <= 0.0f || canScrollHorizontally(-1)) {
                        if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean zzaR = zzaR();
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null && zzaR) {
            zzL.zzn();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf A[Catch: all -> 0x01e5, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:47:0x008c, B:41:0x007d, B:44:0x0082, B:50:0x0099, B:52:0x00a1, B:54:0x00b3, B:57:0x00b8, B:59:0x00d4, B:61:0x00dd, B:60:0x00d9, B:64:0x00e2, B:66:0x00ea, B:69:0x00f5, B:78:0x011b, B:80:0x0122, B:85:0x012a, B:87:0x013c, B:89:0x014a, B:93:0x0157, B:96:0x015c, B:98:0x01a7, B:99:0x01ab, B:101:0x01b2, B:106:0x01bf, B:108:0x01c5, B:109:0x01c8, B:111:0x01cc, B:112:0x01d5, B:115:0x01e0), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[Catch: all -> 0x01e5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:47:0x008c, B:41:0x007d, B:44:0x0082, B:50:0x0099, B:52:0x00a1, B:54:0x00b3, B:57:0x00b8, B:59:0x00d4, B:61:0x00dd, B:60:0x00d9, B:64:0x00e2, B:66:0x00ea, B:69:0x00f5, B:78:0x011b, B:80:0x0122, B:85:0x012a, B:87:0x013c, B:89:0x014a, B:93:0x0157, B:96:0x015c, B:98:0x01a7, B:99:0x01ab, B:101:0x01b2, B:106:0x01bf, B:108:0x01c5, B:109:0x01c8, B:111:0x01cc, B:112:0x01d5, B:115:0x01e0), top: B:121:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[Catch: all -> 0x01e5, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:15:0x0021, B:17:0x0029, B:20:0x002e, B:22:0x0036, B:24:0x0048, B:27:0x004d, B:29:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0075, B:47:0x008c, B:41:0x007d, B:44:0x0082, B:50:0x0099, B:52:0x00a1, B:54:0x00b3, B:57:0x00b8, B:59:0x00d4, B:61:0x00dd, B:60:0x00d9, B:64:0x00e2, B:66:0x00ea, B:69:0x00f5, B:78:0x011b, B:80:0x0122, B:85:0x012a, B:87:0x013c, B:89:0x014a, B:93:0x0157, B:96:0x015c, B:98:0x01a7, B:99:0x01ab, B:101:0x01b2, B:106:0x01bf, B:108:0x01c5, B:109:0x01c8, B:111:0x01cc, B:112:0x01d5, B:115:0x01e0), top: B:121:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final synchronized void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgb.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onPause() {
        if (zzaz()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            zzcaa.zzh("Could not pause webview.", e10);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void onResume() {
        if (zzaz()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            zzcaa.zzh("Could not resume webview.", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.zzn.zzL() && !this.zzn.zzJ()) {
            synchronized (this) {
                zzbej zzbejVar = this.zzC;
                if (zzbejVar != null) {
                    zzbejVar.zzd(motionEvent);
                }
            }
        } else {
            zzaqx zzaqxVar = this.zzc;
            if (zzaqxVar != null) {
                zzaqxVar.zzd(motionEvent);
            }
            zzbct zzbctVar = this.zzd;
            if (zzbctVar != null) {
                zzbctVar.zzb(motionEvent);
            }
        }
        if (zzaz()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.zzcfi
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof zzcfp) {
            this.zzn = (zzcfp) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (zzaz()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            zzcaa.zzh("Could not stop loading webview.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzA(int i10) {
        this.zzL = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzC(zzcge zzcgeVar) {
        if (this.zzz != null) {
            zzcaa.zzg("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.zzz = zzcgeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcez
    public final zzfbe zzD() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final Context zzE() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebViewClient zzH() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgq
    public final zzaqx zzI() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzavs zzJ() {
        return this.zzE;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzbej zzK() {
        return this.zzC;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zzM;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final /* synthetic */ zzcgv zzN() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgp
    public final synchronized zzcgx zzO() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgf
    public final zzfbi zzP() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized zzfip zzQ() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final com.google.common.util.concurrent.a zzR() {
        zzbct zzbctVar = this.zzd;
        if (zzbctVar == null) {
            return zzfye.zzh(null);
        }
        return zzbctVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized String zzS() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzT(zzfbe zzfbeVar, zzfbi zzfbiVar) {
        this.zzj = zzfbeVar;
        this.zzk = zzfbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzU() {
        com.google.android.gms.ads.internal.util.zze.zza("Destroying WebView!");
        zzaT();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcga(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzV() {
        zzaY();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzW(int i10) {
        if (i10 == 0) {
            zzbcb.zza(this.zzK.zza(), this.zzI, "aebb2");
        }
        zzaY();
        this.zzK.zza();
        this.zzK.zza().zzd("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.zze.zza);
        zzd("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzX() {
        if (this.zzH == null) {
            zzbcb.zza(this.zzK.zza(), this.zzI, "aes2");
            this.zzK.zza();
            zzbcg zzf = zzbcj.zzf();
            this.zzH = zzf;
            this.zzK.zzb("native:view_show", zzf);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.zze.zza);
        zzd("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzY() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzZ(boolean z10) {
        this.zzn.zzi(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza(String str) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaA() {
        return this.zzu;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaC() {
        return this.zzx;
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        this.zzn.zzt(zzcVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaE(String str, String str2, int i10) {
        this.zzn.zzu(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zzn.zzv(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaG(boolean z10, int i10, String str, boolean z11) {
        this.zzn.zzx(z10, i10, str, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaH(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zzn.zzy(z10, i10, str, str2, z11);
    }

    public final zzcfp zzaJ() {
        return this.zzn;
    }

    final synchronized Boolean zzaK() {
        return this.zzw;
    }

    protected final synchronized void zzaN(String str, ValueCallback valueCallback) {
        if (!zzaz()) {
            evaluateJavascript(str, null);
        } else {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaO(String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            if (zzaK() == null) {
                zzbb();
            }
            if (zzaK().booleanValue()) {
                zzaN(str, null);
                return;
            } else {
                zzaP("javascript:".concat(str));
                return;
            }
        }
        zzaP("javascript:".concat(str));
    }

    protected final synchronized void zzaP(String str) {
        if (!zzaz()) {
            loadUrl(str);
        } else {
            zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
        }
    }

    final void zzaQ(Boolean bool) {
        synchronized (this) {
            this.zzw = bool;
        }
        com.google.android.gms.ads.internal.zzt.zzo().zzv(bool);
    }

    public final boolean zzaR() {
        int i10;
        int i11;
        boolean z10 = false;
        if (!this.zzn.zzK() && !this.zzn.zzL()) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zzh;
        int zzv = zzbzt.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zzh;
        int zzv2 = zzbzt.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zza2 = this.zzb.zza();
        if (zza2 != null && zza2.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzN = com.google.android.gms.ads.internal.util.zzs.zzN(zza2);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            int zzv3 = zzbzt.zzv(this.zzh, zzN[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            i11 = zzbzt.zzv(this.zzh, zzN[1]);
            i10 = zzv3;
        } else {
            i10 = zzv;
            i11 = zzv2;
        }
        int i12 = this.zzQ;
        if (i12 == zzv && this.zzP == zzv2 && this.zzR == i10 && this.zzS == i11) {
            return false;
        }
        if (i12 != zzv || this.zzP != zzv2) {
            z10 = true;
        }
        this.zzQ = zzv;
        this.zzP = zzv2;
        this.zzR = i10;
        this.zzS = i11;
        new zzbrf(this, "").zzi(zzv, zzv2, i10, i11, this.zzh.density, this.zzU.getDefaultDisplay().getRotation());
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaa() {
        this.zzO.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzab(String str, String str2, String str3) {
        String str4;
        if (!zzaz()) {
            String[] strArr = new String[1];
            String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzQ);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("version", str5);
                jSONObject.put("sdk", "Google Mobile Ads");
                jSONObject.put("sdkVersion", "12.4.51-000");
                str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e10) {
                zzcaa.zzk("Unable to build MRAID_ENV", e10);
                str4 = null;
            }
            strArr[0] = str4;
            super.loadDataWithBaseURL(str, zzcgo.zza(str2, strArr), "text/html", "UTF-8", null);
            return;
        }
        zzcaa.zzj("#004 The webview is destroyed. Ignoring action.");
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzac() {
        if (this.zzJ == null) {
            this.zzK.zza();
            zzbcg zzf = zzbcj.zzf();
            this.zzJ = zzf;
            this.zzK.zzb("native:view_load", zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzad(String str, zzbir zzbirVar) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzz(str, zzbirVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzae() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzo = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzag(zzcgx zzcgxVar) {
        this.zzq = zzcgxVar;
        requestLayout();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzah(zzavs zzavsVar) {
        this.zzE = zzavsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzai(boolean z10) {
        this.zzx = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaj() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzak(Context context) {
        this.zzb.setBaseContext(context);
        this.zzO.zze(this.zzb.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzal(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzy(this.zzn.zzK(), z10);
        } else {
            this.zzs = z10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzam(zzbeh zzbehVar) {
        this.zzD = zzbehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzan(boolean z10) {
        String str;
        boolean z11 = this.zzu;
        this.zzu = z10;
        zzaS();
        if (z10 != z11) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzR)).booleanValue() || !this.zzq.zzi()) {
                zzbrf zzbrfVar = new zzbrf(this, "");
                if (true != z10) {
                    str = "default";
                } else {
                    str = "expanded";
                }
                zzbrfVar.zzk(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzao(zzbej zzbejVar) {
        this.zzC = zzbejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzap(zzfip zzfipVar) {
        this.zzp = zzfipVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzaq(int i10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzA(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zzM = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzas(boolean z10) {
        com.google.android.gms.ads.internal.overlay.zzl zzlVar;
        int i10 = this.zzF;
        int i11 = 1;
        if (true != z10) {
            i11 = -1;
        }
        int i12 = i10 + i11;
        this.zzF = i12;
        if (i12 <= 0 && (zzlVar = this.zzo) != null) {
            zzlVar.zzE();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized void zzat(boolean z10) {
        if (z10) {
            setBackgroundColor(0);
        }
        com.google.android.gms.ads.internal.overlay.zzl zzlVar = this.zzo;
        if (zzlVar != null) {
            zzlVar.zzB(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzau(String str, zzbir zzbirVar) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzH(str, zzbirVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzav(String str, Predicate predicate) {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzI(str, predicate);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaw() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzax() {
        if (this.zzF > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzay(final boolean z10, final int i10) {
        destroy();
        this.zzV.zzb(new zzaxd() { // from class: com.google.android.gms.internal.ads.zzcfy
            @Override // com.google.android.gms.internal.ads.zzaxd
            public final void zza(zzayt zzaytVar) {
                boolean z11 = z10;
                int i11 = i10;
                int i12 = zzcgb.zza;
                zzbay zza2 = zzbaz.zza();
                if (zza2.zzc() != z11) {
                    zza2.zza(z11);
                }
                zza2.zzb(i11);
                zzaytVar.zzj((zzbaz) zza2.zzal());
            }
        });
        this.zzV.zzc(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final synchronized boolean zzaz() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String str, String str2) {
        zzaO(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbj() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbj();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final synchronized void zzbk() {
        com.google.android.gms.ads.internal.zzl zzlVar = this.zzf;
        if (zzlVar != null) {
            zzlVar.zzbk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzbl() {
        zzfbi zzfbiVar = this.zzk;
        if (zzfbiVar != null) {
            return zzfbiVar.zzb;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized String zzbm() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        boolean z10;
        synchronized (this) {
            z10 = zzaueVar.zzj;
            this.zzA = z10;
        }
        zzaV(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String str, Map map) {
        try {
            zze(str, com.google.android.gms.ads.internal.client.zzay.zzb().zzi(map));
        } catch (JSONException unused) {
            zzcaa.zzj("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zze(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb2.append(str);
        sb2.append("',");
        sb2.append(jSONObject2);
        sb2.append(");");
        zzcaa.zze("Dispatching AFMA event: ".concat(sb2.toString()));
        zzaO(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized int zzf() {
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    public final Activity zzi() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzbcg zzk() {
        return this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String str, JSONObject jSONObject) {
        zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final zzbch zzm() {
        return this.zzK;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccj
    public final zzcag zzn() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcdu zzp(String str) {
        Map map = this.zzT;
        if (map == null) {
            return null;
        }
        return (zzcdu) map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized zzcge zzq() {
        return this.zzz;
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzcfp zzcfpVar = this.zzn;
        if (zzcfpVar != null) {
            zzcfpVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzt(String str, zzcdu zzcduVar) {
        if (this.zzT == null) {
            this.zzT = new HashMap();
        }
        this.zzT.put(str, zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzL();
        if (zzL != null) {
            zzL.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z10, long j10) {
        String str;
        HashMap hashMap = new HashMap(2);
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("success", str);
        hashMap.put("duration", Long.toString(j10));
        zzd("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final synchronized void zzw() {
        zzbeh zzbehVar = this.zzD;
        if (zzbehVar != null) {
            final zzdmc zzdmcVar = (zzdmc) zzbehVar;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdma
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdmc.this.zzd();
                    } catch (RemoteException e10) {
                        zzcaa.zzl("#007 Could not call remote method.", e10);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z10) {
        this.zzn.zzC(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebView zzG() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int i10) {
    }
}
