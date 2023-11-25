package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfu;
import com.google.android.gms.internal.ads.zzcgt;
import com.google.android.gms.internal.ads.zzcgv;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzect;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzfip;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.Collections;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public class zzl extends zzbsb implements zzad {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;
    AdOverlayInfoParcel zzc;
    zzcfi zzd;
    zzh zze;
    zzr zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzg zzl;
    private Runnable zzp;
    private boolean zzq;
    private boolean zzr;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private boolean zzs = false;
    private boolean zzt = false;
    private boolean zzu = true;

    public zzl(Activity activity) {
        this.zzb = activity;
    }

    private final void zzI(Configuration configuration) {
        boolean z10;
        com.google.android.gms.ads.internal.zzj zzjVar;
        int i10;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        boolean z11 = true;
        boolean z12 = false;
        if (adOverlayInfoParcel != null && (zzjVar2 = adOverlayInfoParcel.zzo) != null && zzjVar2.zzb) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zze = com.google.android.gms.ads.internal.zzt.zzq().zze(this.zzb, configuration);
        if ((!this.zzk || z10) && !zze) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzjVar = adOverlayInfoParcel2.zzo) != null && zzjVar.zzg) {
                z12 = true;
            }
        } else {
            z11 = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzbc)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z11) {
                if (z12) {
                    i10 = 5894;
                } else {
                    i10 = 5380;
                }
            } else {
                i10 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            decorView.setSystemUiVisibility(i10);
        } else if (z11) {
            window.addFlags(UserVerificationMethods.USER_VERIFY_ALL);
            window.clearFlags(RecyclerView.m.FLAG_MOVED);
            if (z12) {
                window.getDecorView().setSystemUiVisibility(4098);
            }
        } else {
            window.addFlags(RecyclerView.m.FLAG_MOVED);
            window.clearFlags(UserVerificationMethods.USER_VERIFY_ALL);
        }
    }

    private static final void zzJ(zzfip zzfipVar, View view) {
        if (zzfipVar != null && view != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzh(zzfipVar, view);
        }
    }

    public final void zzA(int i10) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zzb(zzbbr.zzfQ)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zzb(zzbbr.zzfR)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzba.zzc().zzb(zzbbr.zzfS)).intValue()) {
                    if (i11 <= ((Integer) zzba.zzc().zzb(zzbbr.zzfT)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i10);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(-16777216);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzr = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    protected final void zzD(boolean z10) throws zzf {
        zzcgv zzcgvVar;
        boolean z11;
        zzcgx zzcgxVar;
        String str;
        com.google.android.gms.ads.internal.zza zzaVar;
        if (!this.zzr) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window != null) {
            zzcfi zzcfiVar = this.zzc.zzd;
            com.google.android.gms.ads.internal.zzb zzbVar = null;
            if (zzcfiVar != null) {
                zzcgvVar = zzcfiVar.zzN();
            } else {
                zzcgvVar = null;
            }
            boolean z12 = false;
            if (zzcgvVar != null && zzcgvVar.zzK()) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.zzm = false;
            if (z11) {
                int i10 = this.zzc.zzj;
                if (i10 == 6) {
                    if (this.zzb.getResources().getConfiguration().orientation == 1) {
                        z12 = true;
                    }
                    this.zzm = z12;
                } else if (i10 == 7) {
                    if (this.zzb.getResources().getConfiguration().orientation == 2) {
                        z12 = true;
                    }
                    this.zzm = z12;
                }
            }
            zzcaa.zze("Delay onShow to next orientation change: " + z12);
            zzA(this.zzc.zzj);
            window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
            zzcaa.zze("Hardware acceleration on the AdActivity window enabled.");
            if (!this.zzk) {
                this.zzl.setBackgroundColor(-16777216);
            } else {
                this.zzl.setBackgroundColor(zza);
            }
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            if (z10) {
                try {
                    com.google.android.gms.ads.internal.zzt.zzz();
                    Activity activity = this.zzb;
                    zzcfi zzcfiVar2 = this.zzc.zzd;
                    if (zzcfiVar2 != null) {
                        zzcgxVar = zzcfiVar2.zzO();
                    } else {
                        zzcgxVar = null;
                    }
                    zzcfi zzcfiVar3 = this.zzc.zzd;
                    if (zzcfiVar3 != null) {
                        str = zzcfiVar3.zzS();
                    } else {
                        str = null;
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                    zzcag zzcagVar = adOverlayInfoParcel.zzm;
                    zzcfi zzcfiVar4 = adOverlayInfoParcel.zzd;
                    if (zzcfiVar4 != null) {
                        zzaVar = zzcfiVar4.zzj();
                    } else {
                        zzaVar = null;
                    }
                    zzcfi zza2 = zzcfu.zza(activity, zzcgxVar, str, true, z11, null, null, zzcagVar, null, null, zzaVar, zzaxe.zza(), null, null, null);
                    this.zzd = zza2;
                    zzcgv zzN = zza2.zzN();
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                    zzbhh zzbhhVar = adOverlayInfoParcel2.zzp;
                    zzbhj zzbhjVar = adOverlayInfoParcel2.zze;
                    zzz zzzVar = adOverlayInfoParcel2.zzi;
                    zzcfi zzcfiVar5 = adOverlayInfoParcel2.zzd;
                    if (zzcfiVar5 != null) {
                        zzbVar = zzcfiVar5.zzN().zzd();
                    }
                    zzN.zzM(null, zzbhhVar, null, zzbhjVar, zzzVar, true, null, zzbVar, null, null, null, null, null, null, null, null, null, null, null);
                    this.zzd.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                        @Override // com.google.android.gms.internal.ads.zzcgt
                        public final void zza(boolean z13, int i11, String str2, String str3) {
                            zzcfi zzcfiVar6 = zzl.this.zzd;
                            if (zzcfiVar6 != null) {
                                zzcfiVar6.zzX();
                            }
                        }
                    });
                    AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                    String str2 = adOverlayInfoParcel3.zzl;
                    if (str2 != null) {
                        this.zzd.loadUrl(str2);
                    } else {
                        String str3 = adOverlayInfoParcel3.zzh;
                        if (str3 != null) {
                            this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str3, "text/html", "UTF-8", null);
                        } else {
                            throw new zzf("No URL or HTML to display in ad overlay.");
                        }
                    }
                    zzcfi zzcfiVar6 = this.zzc.zzd;
                    if (zzcfiVar6 != null) {
                        zzcfiVar6.zzar(this);
                    }
                } catch (Exception e10) {
                    zzcaa.zzh("Error obtaining webview.", e10);
                    throw new zzf("Could not obtain webview for the overlay.", e10);
                }
            } else {
                zzcfi zzcfiVar7 = this.zzc.zzd;
                this.zzd = zzcfiVar7;
                zzcfiVar7.zzak(this.zzb);
            }
            this.zzd.zzaf(this);
            zzcfi zzcfiVar8 = this.zzc.zzd;
            if (zzcfiVar8 != null) {
                zzJ(zzcfiVar8.zzQ(), this.zzl);
            }
            if (this.zzc.zzk != 5) {
                ViewParent parent = this.zzd.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    ((ViewGroup) parent).removeView(this.zzd.zzF());
                }
                if (this.zzk) {
                    this.zzd.zzaj();
                }
                this.zzl.addView(this.zzd.zzF(), -1, -1);
            }
            if (!z10 && !this.zzm) {
                zze();
            }
            if (this.zzc.zzk != 5) {
                zzw(z11);
                if (this.zzd.zzaw()) {
                    zzy(z11, true);
                    return;
                }
                return;
            }
            zzect zze = zzecu.zze();
            zze.zza(this.zzb);
            zze.zzb(this);
            zze.zzc(this.zzc.zzq);
            zze.zzd(this.zzc.zzr);
            try {
                zzf(zze.zze());
                return;
            } catch (RemoteException | zzf e11) {
                throw new zzf(e11.getMessage(), e11);
            }
        }
        throw new zzf("Invalid activity, no window available.");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzq = true;
            Runnable runnable = this.zzp;
            if (runnable != null) {
                zzfoe zzfoeVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfoeVar.removeCallbacks(runnable);
                zzfoeVar.post(this.zzp);
            }
        }
    }

    protected final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzo zzoVar;
        if (this.zzb.isFinishing() && !this.zzs) {
            this.zzs = true;
            zzcfi zzcfiVar = this.zzd;
            if (zzcfiVar != null) {
                zzcfiVar.zzW(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzq && this.zzd.zzax()) {
                        if (((Boolean) zzba.zzc().zzb(zzbbr.zzeF)).booleanValue() && !this.zzt && (adOverlayInfoParcel = this.zzc) != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
                            zzoVar.zzbu();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zze
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzl.this.zzc();
                            }
                        };
                        this.zzp = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzba.zzc().zzb(zzbbr.zzaV)).longValue());
                        return;
                    }
                }
            }
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final boolean zzG() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zziz)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaC = this.zzd.zzaC();
        if (!zzaC) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaC;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc() {
        zzcfi zzcfiVar;
        zzo zzoVar;
        if (this.zzt) {
            return;
        }
        this.zzt = true;
        zzcfi zzcfiVar2 = this.zzd;
        if (zzcfiVar2 != null) {
            this.zzl.removeView(zzcfiVar2.zzF());
            zzh zzhVar = this.zze;
            if (zzhVar != null) {
                this.zzd.zzak(zzhVar.zzd);
                this.zzd.zzan(false);
                ViewGroup viewGroup = this.zze.zzc;
                View zzF = this.zzd.zzF();
                zzh zzhVar2 = this.zze;
                viewGroup.addView(zzF, zzhVar2.zza, zzhVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzak(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzby(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 != null && (zzcfiVar = adOverlayInfoParcel2.zzd) != null) {
            zzJ(zzcfiVar.zzQ(), this.zzc.zzd.zzF());
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    protected final void zze() {
        this.zzd.zzX();
    }

    public final void zzf(zzecu zzecuVar) throws zzf, RemoteException {
        zzbrv zzbrvVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzbrvVar = adOverlayInfoParcel.zzv) != null) {
            zzbrvVar.zzg(ObjectWrapper.wrap(zzecuVar));
            return;
        }
        throw new zzf("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzr = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzI((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0075 A[Catch: zzf -> 0x00f9, TryCatch #0 {zzf -> 0x00f9, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x0032, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:22:0x0051, B:28:0x005e, B:30:0x0062, B:32:0x0067, B:35:0x0075, B:37:0x0079, B:39:0x007f, B:40:0x0082, B:42:0x0088, B:43:0x008b, B:45:0x0091, B:47:0x0095, B:48:0x0098, B:50:0x009e, B:51:0x00a1, B:58:0x00d0, B:60:0x00d4, B:61:0x00db, B:62:0x00dc, B:64:0x00e0, B:66:0x00ed, B:25:0x0058, B:27:0x005c, B:33:0x0071, B:68:0x00f1, B:69:0x00f8), top: B:73:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed A[Catch: zzf -> 0x00f9, TryCatch #0 {zzf -> 0x00f9, blocks: (B:12:0x001b, B:14:0x0029, B:16:0x0032, B:17:0x0034, B:19:0x003c, B:20:0x004a, B:22:0x0051, B:28:0x005e, B:30:0x0062, B:32:0x0067, B:35:0x0075, B:37:0x0079, B:39:0x007f, B:40:0x0082, B:42:0x0088, B:43:0x008b, B:45:0x0091, B:47:0x0095, B:48:0x0098, B:50:0x009e, B:51:0x00a1, B:58:0x00d0, B:60:0x00d4, B:61:0x00db, B:62:0x00dc, B:64:0x00e0, B:66:0x00ed, B:25:0x0058, B:27:0x005c, B:33:0x0071, B:68:0x00f1, B:69:0x00f8), top: B:73:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbsc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzl.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzm() {
        zzcfi zzcfiVar = this.zzd;
        if (zzcfiVar != null) {
            try {
                this.zzl.removeView(zzcfiVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzo() {
        zzo zzoVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbo();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzeH)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        zzl zzlVar;
        if (i10 == 12345) {
            zzect zze = zzecu.zze();
            zze.zza(this.zzb);
            if (this.zzc.zzk == 5) {
                zzlVar = this;
            } else {
                zzlVar = null;
            }
            zze.zzb(zzlVar);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzr() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbL();
        }
        zzI(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzeH)).booleanValue()) {
            zzcfi zzcfiVar = this.zzd;
            if (zzcfiVar != null && !zzcfiVar.zzaz()) {
                this.zzd.onResume();
            } else {
                zzcaa.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzt() {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzeH)).booleanValue()) {
            zzcfi zzcfiVar = this.zzd;
            if (zzcfiVar != null && !zzcfiVar.zzaz()) {
                this.zzd.onResume();
            } else {
                zzcaa.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzu() {
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzeH)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzv() {
        zzo zzoVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzoVar = adOverlayInfoParcel.zzc) != null) {
            zzoVar.zzbx();
        }
    }

    public final void zzw(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        int intValue = ((Integer) zzba.zzc().zzb(zzbbr.zzeK)).intValue();
        int i12 = 0;
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzaY)).booleanValue() && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        zzq zzqVar = new zzq();
        zzqVar.zzd = 50;
        if (true != z11) {
            i10 = 0;
        } else {
            i10 = intValue;
        }
        zzqVar.zza = i10;
        if (true != z11) {
            i12 = intValue;
        }
        zzqVar.zzb = i12;
        zzqVar.zzc = intValue;
        this.zzf = new zzr(this.zzb, zzqVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z11) {
            i11 = 9;
        } else {
            i11 = 11;
        }
        layoutParams.addRule(i11);
        zzy(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzx() {
        this.zzr = true;
    }

    public final void zzy(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzj zzjVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzj zzjVar2;
        boolean z14 = true;
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzaW)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzjVar2 = adOverlayInfoParcel2.zzo) != null && zzjVar2.zzh) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzaX)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzjVar = adOverlayInfoParcel.zzo) != null && zzjVar.zzi) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z10 && z11 && z12 && !z13) {
            new zzbrf(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzr zzrVar = this.zzf;
        if (zzrVar != null) {
            if (!z13 && (!z11 || z12)) {
                z14 = false;
            }
            zzrVar.zzb(z14);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbsc
    public final void zzh(int i10, int i11, Intent intent) {
    }
}
