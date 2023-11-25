package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.common.util.Predicate;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzcfx extends FrameLayout implements zzcfi {
    private final zzcfi zza;
    private final zzcby zzb;
    private final AtomicBoolean zzc;

    public zzcfx(zzcfi zzcfiVar) {
        super(zzcfiVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcfiVar;
        this.zzb = new zzcby(zzcfiVar.zzE(), this, this);
        addView((View) zzcfiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void destroy() {
        final zzfip zzQ = zzQ();
        if (zzQ != null) {
            zzfoe zzfoeVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfoeVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfv
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.ads.internal.zzt.zzA().zzg(zzfip.this);
                }
            });
            final zzcfi zzcfiVar = this.zza;
            zzcfiVar.getClass();
            zzfoeVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcfi.this.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeS)).intValue());
            return;
        }
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void onPause() {
        this.zzb.zzf();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfi
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcfi
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzA(int i10) {
        this.zza.zzA(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzB(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final void zzC(zzcge zzcgeVar) {
        this.zza.zzC(zzcgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcez
    public final zzfbe zzD() {
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final Context zzE() {
        return this.zza.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebView zzG() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final WebViewClient zzH() {
        return this.zza.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgq
    public final zzaqx zzI() {
        return this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final zzavs zzJ() {
        return this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final zzbej zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final com.google.android.gms.ads.internal.overlay.zzl zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final com.google.android.gms.ads.internal.overlay.zzl zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final zzcgv zzN() {
        return ((zzcgb) this.zza).zzaJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgp
    public final zzcgx zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgf
    public final zzfbi zzP() {
        return this.zza.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final zzfip zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final com.google.common.util.concurrent.a zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final String zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzT(zzfbe zzfbeVar, zzfbi zzfbiVar) {
        this.zza.zzT(zzfbeVar, zzfbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzU() {
        this.zzb.zze();
        this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzV() {
        this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzW(int i10) {
        this.zza.zzW(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzX() {
        this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzY() {
        zzcfi zzcfiVar = this.zza;
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zze()));
        hashMap.put("app_volume", String.valueOf(com.google.android.gms.ads.internal.zzt.zzr().zza()));
        zzcgb zzcgbVar = (zzcgb) zzcfiVar;
        hashMap.put("device_volume", String.valueOf(com.google.android.gms.ads.internal.util.zzab.zzb(zzcgbVar.getContext())));
        zzcgbVar.zzd("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzZ(boolean z10) {
        this.zza.zzZ(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zza(String str) {
        ((zzcgb) this.zza).zzaO(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaA() {
        return this.zza.zzaA();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaD(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10) {
        this.zza.zzaD(zzcVar, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaE(String str, String str2, int i10) {
        this.zza.zzaE(str, str2, 14);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaF(boolean z10, int i10, boolean z11) {
        this.zza.zzaF(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaG(boolean z10, int i10, String str, boolean z11) {
        this.zza.zzaG(z10, i10, str, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final void zzaH(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaH(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaa() {
        this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzab(String str, String str2, String str3) {
        this.zza.zzab(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzac() {
        this.zza.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzad(String str, zzbir zzbirVar) {
        this.zza.zzad(str, zzbirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzae() {
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzp();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzv());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaf(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzaf(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzag(zzcgx zzcgxVar) {
        this.zza.zzag(zzcgxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzah(zzavs zzavsVar) {
        this.zza.zzah(zzavsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzai(boolean z10) {
        this.zza.zzai(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaj() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzak(Context context) {
        this.zza.zzak(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzal(boolean z10) {
        this.zza.zzal(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzam(zzbeh zzbehVar) {
        this.zza.zzam(zzbehVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzan(boolean z10) {
        this.zza.zzan(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzao(zzbej zzbejVar) {
        this.zza.zzao(zzbejVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzap(zzfip zzfipVar) {
        this.zza.zzap(zzfipVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzaq(int i10) {
        this.zza.zzaq(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzar(com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        this.zza.zzar(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzas(boolean z10) {
        this.zza.zzas(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzat(boolean z10) {
        this.zza.zzat(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzau(String str, zzbir zzbirVar) {
        this.zza.zzau(str, zzbirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final void zzav(String str, Predicate predicate) {
        this.zza.zzav(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaw() {
        return this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzax() {
        return this.zza.zzax();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzay(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaJ)).booleanValue()) {
            return false;
        }
        if (this.zza.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.zza.getParent()).removeView((View) this.zza);
        }
        this.zza.zzay(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcfi
    public final boolean zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzb(String str, String str2) {
        this.zza.zzb("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzbK() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbj() {
        this.zza.zzbj();
    }

    @Override // com.google.android.gms.ads.internal.zzl
    public final void zzbk() {
        this.zza.zzbk();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zzbl() {
        return this.zza.zzbl();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final String zzbm() {
        return this.zza.zzbm();
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzbt(zzaue zzaueVar) {
        this.zza.zzbt(zzaueVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zzd(String str, Map map) {
        this.zza.zzd(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbll
    public final void zze(String str, JSONObject jSONObject) {
        this.zza.zze(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdG)).booleanValue()) {
            return this.zza.getMeasuredHeight();
        }
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final int zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzdG)).booleanValue()) {
            return this.zza.getMeasuredWidth();
        }
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgj, com.google.android.gms.internal.ads.zzccj
    public final Activity zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final com.google.android.gms.ads.internal.zza zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzbcg zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbly
    public final void zzl(String str, JSONObject jSONObject) {
        ((zzcgb) this.zza).zzb(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final zzbch zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgr, com.google.android.gms.internal.ads.zzccj
    public final zzcag zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcby zzo() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final zzcdu zzp(String str) {
        return this.zza.zzp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final zzcge zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzddw
    public final void zzs() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar != null) {
            zzcfiVar.zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzccj
    public final void zzt(String str, zzcdu zzcduVar) {
        this.zza.zzt(str, zzcduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzu() {
        this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzv(boolean z10, long j10) {
        this.zza.zzv(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzw() {
        this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzz(boolean z10) {
        this.zza.zzz(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcfi, com.google.android.gms.internal.ads.zzcgs
    public final View zzF() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzx(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzy(int i10) {
    }
}
