package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public interface zzcfi extends com.google.android.gms.ads.internal.client.zza, zzddw, zzcez, zzbll, zzcgf, zzcgj, zzbly, zzauf, zzcgn, com.google.android.gms.ads.internal.zzl, zzcgq, zzcgr, zzccj, zzcgs {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzccj
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzccj
    void zzC(zzcge zzcgeVar);

    @Override // com.google.android.gms.internal.ads.zzcez
    zzfbe zzD();

    Context zzE();

    @Override // com.google.android.gms.internal.ads.zzcgs
    View zzF();

    WebView zzG();

    WebViewClient zzH();

    @Override // com.google.android.gms.internal.ads.zzcgq
    zzaqx zzI();

    zzavs zzJ();

    zzbej zzK();

    com.google.android.gms.ads.internal.overlay.zzl zzL();

    com.google.android.gms.ads.internal.overlay.zzl zzM();

    zzcgv zzN();

    @Override // com.google.android.gms.internal.ads.zzcgp
    zzcgx zzO();

    @Override // com.google.android.gms.internal.ads.zzcgf
    zzfbi zzP();

    zzfip zzQ();

    com.google.common.util.concurrent.a zzR();

    String zzS();

    void zzT(zzfbe zzfbeVar, zzfbi zzfbiVar);

    void zzU();

    void zzV();

    void zzW(int i10);

    void zzX();

    void zzY();

    void zzZ(boolean z10);

    boolean zzaA();

    boolean zzaB();

    boolean zzaC();

    void zzaa();

    void zzab(String str, String str2, String str3);

    void zzac();

    void zzad(String str, zzbir zzbirVar);

    void zzae();

    void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzag(zzcgx zzcgxVar);

    void zzah(zzavs zzavsVar);

    void zzai(boolean z10);

    void zzaj();

    void zzak(Context context);

    void zzal(boolean z10);

    void zzam(zzbeh zzbehVar);

    void zzan(boolean z10);

    void zzao(zzbej zzbejVar);

    void zzap(zzfip zzfipVar);

    void zzaq(int i10);

    void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar);

    void zzas(boolean z10);

    void zzat(boolean z10);

    void zzau(String str, zzbir zzbirVar);

    void zzav(String str, Predicate predicate);

    boolean zzaw();

    boolean zzax();

    boolean zzay(boolean z10, int i10);

    boolean zzaz();

    @Override // com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    Activity zzi();

    @Override // com.google.android.gms.internal.ads.zzccj
    com.google.android.gms.ads.internal.zza zzj();

    @Override // com.google.android.gms.internal.ads.zzccj
    zzbch zzm();

    @Override // com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccj
    zzcag zzn();

    @Override // com.google.android.gms.internal.ads.zzccj
    zzcge zzq();

    @Override // com.google.android.gms.internal.ads.zzccj
    void zzt(String str, zzcdu zzcduVar);
}
