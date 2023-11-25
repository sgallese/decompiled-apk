package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzedf implements zzedg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfip zzc(String str, String str2, String str3, zzedh zzedhVar, String str4, WebView webView, String str5, String str6, zzedi zzediVar) {
        zzfiz zza = zzfiz.zza("Google", str2);
        zzfiy zzm = zzm("javascript");
        zzfiu zzk = zzk(zzedhVar.toString());
        zzfiy zzfiyVar = zzfiy.NONE;
        if (zzm == zzfiyVar) {
            zzcaa.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            zzcaa.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzedhVar)));
            return null;
        } else {
            zzfiy zzm2 = zzm(str4);
            if (zzk == zzfiu.VIDEO && zzm2 == zzfiyVar) {
                zzcaa.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
                return null;
            }
            return zzfip.zza(zzfiq.zza(zzk, zzl(zzediVar.toString()), zzm, zzm2, true), zzfir.zzb(zza, webView, str5, ""));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzfip zzd(String str, String str2, String str3, String str4, zzedh zzedhVar, WebView webView, String str5, String str6, zzedi zzediVar) {
        zzfiz zza = zzfiz.zza(str, str2);
        zzfiy zzm = zzm("javascript");
        zzfiy zzm2 = zzm(str4);
        zzfiu zzk = zzk(zzedhVar.toString());
        zzfiy zzfiyVar = zzfiy.NONE;
        if (zzm == zzfiyVar) {
            zzcaa.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        } else if (zzk == null) {
            zzcaa.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzedhVar)));
            return null;
        } else if (zzk == zzfiu.VIDEO && zzm2 == zzfiyVar) {
            zzcaa.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        } else {
            return zzfip.zza(zzfiq.zza(zzk, zzl(zzediVar.toString()), zzm, zzm2, true), zzfir.zzc(zza, webView, str5, ""));
        }
    }

    private static zzfiu zzk(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != -382745961) {
            if (hashCode != 112202875) {
                if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else {
                if (str.equals("video")) {
                    c10 = 2;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return null;
                }
                return zzfiu.VIDEO;
            }
            return zzfiu.NATIVE_DISPLAY;
        }
        return zzfiu.HTML_DISPLAY;
    }

    private static zzfix zzl(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != -1104128070) {
            if (hashCode != 1318088141) {
                if (hashCode == 1988248512 && str.equals("onePixel")) {
                    c10 = 2;
                }
                c10 = 65535;
            } else {
                if (str.equals("definedByJavascript")) {
                    c10 = 1;
                }
                c10 = 65535;
            }
        } else {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return zzfix.UNSPECIFIED;
                }
                return zzfix.ONE_PIXEL;
            }
            return zzfix.DEFINED_BY_JAVASCRIPT;
        }
        return zzfix.BEGIN_TO_RENDER;
    }

    private static zzfiy zzm(String str) {
        if ("native".equals(str)) {
            return zzfiy.NATIVE;
        }
        if ("javascript".equals(str)) {
            return zzfiy.JAVASCRIPT;
        }
        return zzfiy.NONE;
    }

    private static final Object zzn(zzede zzedeVar) {
        try {
            return zzedeVar.zza();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "omid exception");
            return null;
        }
    }

    private static final void zzo(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzfip zza(final String str, final WebView webView, String str2, String str3, final String str4, final zzedi zzediVar, final zzedh zzedhVar, final String str5) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
            final String str6 = "";
            final String str7 = "javascript";
            final String str8 = "Google";
            return (zzfip) zzn(new zzede(str8, str, str7, zzedhVar, str4, webView, str5, str6, zzediVar) { // from class: com.google.android.gms.internal.ads.zzedb
                public final /* synthetic */ String zzb;
                public final /* synthetic */ zzedh zzd;
                public final /* synthetic */ String zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzedi zzi;
                public final /* synthetic */ String zza = "Google";
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzb = str;
                    this.zzd = zzedhVar;
                    this.zze = str4;
                    this.zzf = webView;
                    this.zzg = str5;
                    this.zzi = zzediVar;
                }

                @Override // com.google.android.gms.internal.ads.zzede
                public final Object zza() {
                    return zzedf.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final zzfip zzb(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final zzedi zzediVar, final zzedh zzedhVar, final String str6) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
            final String str7 = "";
            final String str8 = "javascript";
            return (zzfip) zzn(new zzede(str5, str, str8, str4, zzedhVar, webView, str6, str7, zzediVar) { // from class: com.google.android.gms.internal.ads.zzedc
                public final /* synthetic */ String zza;
                public final /* synthetic */ String zzb;
                public final /* synthetic */ String zzd;
                public final /* synthetic */ zzedh zze;
                public final /* synthetic */ WebView zzf;
                public final /* synthetic */ String zzg;
                public final /* synthetic */ zzedi zzi;
                public final /* synthetic */ String zzc = "javascript";
                public final /* synthetic */ String zzh = "";

                {
                    this.zzd = str4;
                    this.zze = zzedhVar;
                    this.zzf = webView;
                    this.zzg = str6;
                    this.zzi = zzediVar;
                }

                @Override // com.google.android.gms.internal.ads.zzede
                public final Object zza() {
                    return zzedf.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final String zze(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            return null;
        }
        return (String) zzn(new zzede() { // from class: com.google.android.gms.internal.ads.zzecy
            @Override // com.google.android.gms.internal.ads.zzede
            public final Object zza() {
                return "a.1.4.6-google_20230720";
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzf(final zzfip zzfipVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecx
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfip.this;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzb(view2, zzfiw.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzg(final zzfip zzfipVar) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeda
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfip.this;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzh(final zzfip zzfipVar, final View view) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecw
            @Override // java.lang.Runnable
            public final void run() {
                zzfip zzfipVar2 = zzfip.this;
                View view2 = view;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
                    zzfipVar2.zzd(view2);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final void zzi(final zzfip zzfipVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue() && zzfin.zzb()) {
            zzfipVar.getClass();
            zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecz
                @Override // java.lang.Runnable
                public final void run() {
                    zzfip.this.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedg
    public final boolean zzj(final Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzeR)).booleanValue()) {
            zzcaa.zzj("Omid flag is disabled");
            return false;
        }
        Boolean bool = (Boolean) zzn(new zzede() { // from class: com.google.android.gms.internal.ads.zzedd
            @Override // com.google.android.gms.internal.ads.zzede
            public final Object zza() {
                Context context2 = context;
                if (zzfin.zzb()) {
                    return Boolean.TRUE;
                }
                zzfin.zza(context2);
                return Boolean.valueOf(zzfin.zzb());
            }
        });
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
