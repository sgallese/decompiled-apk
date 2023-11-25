package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbta;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcvq;
import com.google.android.gms.internal.ads.zzdbt;
import com.google.android.gms.internal.ads.zzdnb;
import com.google.android.gms.internal.ads.zzdrc;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzfby;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrx;
import com.google.android.gms.internal.ads.zzfxk;
import com.google.android.gms.internal.ads.zzfxl;
import com.google.android.gms.internal.ads.zzfxv;
import com.google.android.gms.internal.ads.zzfye;
import com.google.android.gms.internal.ads.zzfyo;
import com.google.common.util.concurrent.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public final class zzaa extends zzbyq {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final zzcag zzA;
    private String zzB;
    private final List zzD;
    private final List zzE;
    private final List zzF;
    private final List zzG;
    private final zzchd zzf;
    private Context zzg;
    private final zzaqx zzh;
    private final zzfcx zzi;
    private final zzfyo zzk;
    private final ScheduledExecutorService zzl;
    private zzbta zzm;
    private final zzc zzq;
    private final zzdrm zzr;
    private final zzfik zzs;
    private zzdrc zzj = null;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final Set zzp = Collections.newSetFromMap(new WeakHashMap());
    private final AtomicInteger zzz = new AtomicInteger(0);
    private final boolean zzt = ((Boolean) zzba.zzc().zzb(zzbbr.zzhe)).booleanValue();
    private final boolean zzu = ((Boolean) zzba.zzc().zzb(zzbbr.zzhd)).booleanValue();
    private final boolean zzv = ((Boolean) zzba.zzc().zzb(zzbbr.zzhf)).booleanValue();
    private final boolean zzw = ((Boolean) zzba.zzc().zzb(zzbbr.zzhh)).booleanValue();
    private final String zzx = (String) zzba.zzc().zzb(zzbbr.zzhg);
    private final String zzy = (String) zzba.zzc().zzb(zzbbr.zzhi);
    private final String zzC = (String) zzba.zzc().zzb(zzbbr.zzhj);

    public zzaa(zzchd zzchdVar, Context context, zzaqx zzaqxVar, zzfcx zzfcxVar, zzfyo zzfyoVar, ScheduledExecutorService scheduledExecutorService, zzdrm zzdrmVar, zzfik zzfikVar, zzcag zzcagVar) {
        List list;
        this.zzf = zzchdVar;
        this.zzg = context;
        this.zzh = zzaqxVar;
        this.zzi = zzfcxVar;
        this.zzk = zzfyoVar;
        this.zzl = scheduledExecutorService;
        this.zzq = zzchdVar.zzn();
        this.zzr = zzdrmVar;
        this.zzs = zzfikVar;
        this.zzA = zzcagVar;
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzhk)).booleanValue()) {
            this.zzD = zzX((String) zzba.zzc().zzb(zzbbr.zzhl));
            this.zzE = zzX((String) zzba.zzc().zzb(zzbbr.zzhm));
            this.zzF = zzX((String) zzba.zzc().zzb(zzbbr.zzhn));
            list = zzX((String) zzba.zzc().zzb(zzbbr.zzho));
        } else {
            this.zzD = zza;
            this.zzE = zzb;
            this.zzF = zzc;
            list = zzd;
        }
        this.zzG = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzF(zzaa zzaaVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzaaVar.zzN((Uri) it.next())) {
                zzaaVar.zzz.getAndIncrement();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzG(final zzaa zzaaVar, final String str, final String str2, final zzdrc zzdrcVar) {
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzgP)).booleanValue()) {
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzgV)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                @Override // java.lang.Runnable
                public final void run() {
                    zzaa.this.zzI(str, str2, zzdrcVar);
                }
            });
        } else {
            zzaaVar.zzq.zzd(str, str2, zzdrcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Uri zzP(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zzW(uri, "nas", str);
        }
        return uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final zzh zzQ(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzq zzqVar, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        char c10;
        zzfby zzfbyVar = new zzfby();
        if ("REWARDED".equals(str2)) {
            zzfbyVar.zzo().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfbyVar.zzo().zza(3);
        }
        zzg zzo = this.zzf.zzo();
        zzcvq zzcvqVar = new zzcvq();
        zzcvqVar.zze(context);
        if (str == null) {
            str = "adUnitId";
        }
        zzfbyVar.zzs(str);
        if (zzlVar == null) {
            zzlVar = new com.google.android.gms.ads.internal.client.zzm().zza();
        }
        zzfbyVar.zzE(zzlVar);
        if (zzqVar == null) {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 != 1 && c10 != 2) {
                    if (c10 != 3) {
                        if (c10 != 4) {
                            zzqVar = new com.google.android.gms.ads.internal.client.zzq();
                        } else {
                            zzqVar = com.google.android.gms.ads.internal.client.zzq.zzb();
                        }
                    } else {
                        zzqVar = com.google.android.gms.ads.internal.client.zzq.zzc();
                    }
                } else {
                    zzqVar = com.google.android.gms.ads.internal.client.zzq.zzd();
                }
            } else {
                zzqVar = new com.google.android.gms.ads.internal.client.zzq(context, AdSize.BANNER);
            }
        }
        zzfbyVar.zzr(zzqVar);
        zzfbyVar.zzx(true);
        zzcvqVar.zzi(zzfbyVar.zzG());
        zzo.zza(zzcvqVar.zzj());
        zzac zzacVar = new zzac();
        zzacVar.zza(str2);
        zzo.zzb(new zzae(zzacVar, null));
        new zzdbt();
        zzh zzc2 = zzo.zzc();
        this.zzj = zzc2.zza();
        return zzc2;
    }

    private final a zzR(final String str) {
        final zzdnb[] zzdnbVarArr = new zzdnb[1];
        a zzn = zzfye.zzn(this.zzi.zza(), new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzk
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final a zza(Object obj) {
                return zzaa.this.zzv(zzdnbVarArr, str, (zzdnb) obj);
            }
        }, this.zzk);
        zzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzl
            @Override // java.lang.Runnable
            public final void run() {
                zzaa.this.zzH(zzdnbVarArr);
            }
        }, this.zzk);
        return zzfye.zze(zzfye.zzm((zzfxv) zzfye.zzo(zzfxv.zzu(zzn), ((Integer) zzba.zzc().zzb(zzbbr.zzhu)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzv
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzj
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                int i10 = zzaa.zze;
                zzcaa.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbsr zzbsrVar, boolean z10) {
        a zzb2;
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            zzcaa.zzj("The updating URL feature is not enabled.");
            try {
                zzbsrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcaa.zzh("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (zzN((Uri) it.next())) {
                i10++;
            }
        }
        if (i10 > 1) {
            zzcaa.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (!zzN(uri)) {
                zzcaa.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                zzb2 = zzfye.zzh(uri);
            } else {
                zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzaa.this.zzm(uri, iObjectWrapper);
                    }
                });
                if (zzV()) {
                    zzb2 = zzfye.zzn(zzb2, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzr
                        @Override // com.google.android.gms.internal.ads.zzfxl
                        public final a zza(Object obj) {
                            a zzm;
                            zzm = zzfye.zzm(r0.zzR("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzm
                                @Override // com.google.android.gms.internal.ads.zzfqw
                                public final Object apply(Object obj2) {
                                    return zzaa.zzP(r2, (String) obj2);
                                }
                            }, zzaa.this.zzk);
                            return zzm;
                        }
                    }, this.zzk);
                } else {
                    zzcaa.zzi("Asset view map is empty.");
                }
            }
            arrayList.add(zzb2);
        }
        zzfye.zzr(zzfye.zzd(arrayList), new zzy(this, zzbsrVar, z10), this.zzf.zzB());
    }

    private final void zzT(final List list, final IObjectWrapper iObjectWrapper, zzbsr zzbsrVar, boolean z10) {
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            try {
                zzbsrVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                zzcaa.zzh("", e10);
                return;
            }
        }
        a zzb2 = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzaa.this.zzC(list, iObjectWrapper);
            }
        });
        if (zzV()) {
            zzb2 = zzfye.zzn(zzb2, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzt
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final a zza(Object obj) {
                    return zzaa.this.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            zzcaa.zzi("Asset view map is empty.");
        }
        zzfye.zzr(zzb2, new zzx(this, zzbsrVar, z10), this.zzf.zzB());
    }

    private static boolean zzU(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzV() {
        Map map;
        zzbta zzbtaVar = this.zzm;
        if (zzbtaVar != null && (map = zzbtaVar.zzb) != null && !map.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzW(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            return Uri.parse(uri2.substring(0, i10) + str + "=" + str2 + "&" + uri2.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    private static final List zzX(String str) {
        String[] split = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            if (!zzfrx.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfhr zzr(a aVar, zzbyv zzbyvVar) {
        String str;
        if (!zzfhu.zza() || !((Boolean) zzbdd.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhr zzb2 = ((zzh) zzfye.zzp(aVar)).zzb();
            zzb2.zzd(new ArrayList(Collections.singletonList(zzbyvVar.zzb)));
            com.google.android.gms.ads.internal.client.zzl zzlVar = zzbyvVar.zzd;
            if (zzlVar == null) {
                str = "";
            } else {
                str = zzlVar.zzp;
            }
            zzb2.zzb(str);
            return zzb2;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzO(uri) && !TextUtils.isEmpty(str)) {
                arrayList.add(zzW(uri, "nas", str));
            } else {
                arrayList.add(uri);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        this.zzh.zzc();
        String zzh = this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        if (!TextUtils.isEmpty(zzh)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Uri uri = (Uri) it.next();
                if (!zzO(uri)) {
                    zzcaa.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                    arrayList.add(uri);
                } else {
                    arrayList.add(zzW(uri, "ms", zzh));
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            throw new Exception("Empty impression URLs result.");
        }
        throw new Exception("Failed to get view signals.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzH(zzdnb[] zzdnbVarArr) {
        zzdnb zzdnbVar = zzdnbVarArr[0];
        if (zzdnbVar != null) {
            this.zzi.zzb(zzfye.zzh(zzdnbVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzI(String str, String str2, zzdrc zzdrcVar) {
        this.zzq.zzd(str, str2, zzdrcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzN(Uri uri) {
        return zzU(uri, this.zzD, this.zzE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzO(Uri uri) {
        return zzU(uri, this.zzF, this.zzG);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze(IObjectWrapper iObjectWrapper, final zzbyv zzbyvVar, zzbyo zzbyoVar) {
        a zzh;
        a zzc2;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfhg zza2 = zzfhf.zza(context, 22);
        zza2.zzh();
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjX)).booleanValue()) {
            zzfyo zzfyoVar = zzcan.zza;
            zzh = zzfyoVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzaa.this.zzq(zzbyvVar);
                }
            });
            zzc2 = zzfye.zzn(zzh, new zzfxl() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzp
                @Override // com.google.android.gms.internal.ads.zzfxl
                public final a zza(Object obj) {
                    return ((zzh) obj).zzc();
                }
            }, zzfyoVar);
        } else {
            zzh zzQ = zzQ(this.zzg, zzbyvVar.zza, zzbyvVar.zzb, zzbyvVar.zzc, zzbyvVar.zzd);
            zzh = zzfye.zzh(zzQ);
            zzc2 = zzQ.zzc();
        }
        zzfye.zzr(zzc2, new zzw(this, zzh, zzbyvVar, zzbyoVar, zza2, com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()), this.zzf.zzB());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf(zzbta zzbtaVar) {
        this.zzm = zzbtaVar;
        this.zzi.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzS(list, iObjectWrapper, zzbsrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzT(list, iObjectWrapper, zzbsrVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzi(IObjectWrapper iObjectWrapper) {
        a zzc2;
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzja)).booleanValue()) {
            return;
        }
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjb)).booleanValue()) {
            if (!((Boolean) zzba.zzc().zzb(zzbbr.zzje)).booleanValue()) {
                if (((Boolean) zzba.zzc().zzb(zzbbr.zzjX)).booleanValue()) {
                    zzc2 = zzfye.zzk(new zzfxk() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                        @Override // com.google.android.gms.internal.ads.zzfxk
                        public final a zza() {
                            return zzaa.this.zzu();
                        }
                    }, zzcan.zza);
                } else {
                    zzc2 = zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
                }
                zzfye.zzr(zzc2, new zzz(this), this.zzf.zzB());
            }
        }
        WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
        if (webView == null) {
            zzcaa.zzg("The webView cannot be null.");
        } else if (this.zzp.contains(webView)) {
            zzcaa.zzi("This webview has already been registered.");
        } else {
            this.zzp.add(webView);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzr, this.zzs), "gmaSdk");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj(IObjectWrapper iObjectWrapper) {
        View view;
        if (!((Boolean) zzba.zzc().zzb(zzbbr.zzht)).booleanValue()) {
            return;
        }
        MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
        zzbta zzbtaVar = this.zzm;
        if (zzbtaVar == null) {
            view = null;
        } else {
            view = zzbtaVar.zza;
        }
        this.zzn = zzbx.zza(motionEvent, view);
        if (motionEvent.getAction() == 0) {
            this.zzo = this.zzn;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzn;
        obtain.setLocation(point.x, point.y);
        this.zzh.zzd(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzS(list, iObjectWrapper, zzbsrVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsr zzbsrVar) {
        zzT(list, iObjectWrapper, zzbsrVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Uri zzm(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        try {
            uri = this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaqy e10) {
            zzcaa.zzk("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzh zzq(zzbyv zzbyvVar) throws Exception {
        return zzQ(this.zzg, zzbyvVar.zza, zzbyvVar.zzb, zzbyvVar.zzc, zzbyvVar.zzd);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ a zzu() throws Exception {
        return zzQ(this.zzg, null, AdFormat.BANNER.name(), null, null).zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ a zzv(zzdnb[] zzdnbVarArr, String str, zzdnb zzdnbVar) throws Exception {
        zzdnbVarArr[0] = zzdnbVar;
        Context context = this.zzg;
        zzbta zzbtaVar = this.zzm;
        Map map = zzbtaVar.zzb;
        JSONObject zzd2 = zzbx.zzd(context, map, map, zzbtaVar.zza, null);
        JSONObject zzg = zzbx.zzg(this.zzg, this.zzm.zza);
        JSONObject zzf = zzbx.zzf(this.zzm.zza);
        JSONObject zze2 = zzbx.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", zzd2);
        jSONObject.put("ad_view_signal", zzg);
        jSONObject.put("scroll_view_signal", zzf);
        jSONObject.put("lock_screen_signal", zze2);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbx.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnbVar.zzd(str, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ a zzw(final ArrayList arrayList) throws Exception {
        return zzfye.zzm(zzR("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfqw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // com.google.android.gms.internal.ads.zzfqw
            public final Object apply(Object obj) {
                return zzaa.this.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
