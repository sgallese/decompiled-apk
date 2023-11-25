package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbiq {
    public static final zzbir zza = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhs
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            String str;
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str2 = (String) map.get("urls");
            if (TextUtils.isEmpty(str2)) {
                zzcaa.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str2.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgjVar.getContext().getPackageManager();
            for (String str3 : split) {
                String[] split2 = str3.split(";", 2);
                String trim = split2[0].trim();
                boolean z10 = true;
                if (split2.length > 1) {
                    str = split2[1].trim();
                } else {
                    str = "android.intent.action.VIEW";
                }
                if (packageManager.resolveActivity(new Intent(str, Uri.parse(trim)), 65536) == null) {
                    z10 = false;
                }
                Boolean valueOf = Boolean.valueOf(z10);
                hashMap.put(str3, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str3 + ";" + valueOf);
            }
            ((zzbll) zzcgjVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbir zzb = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhu
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            boolean z10;
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
                zzcaa.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                zzcaa.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            if (zzcgjVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbll) zzcgjVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbir zzc = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhl
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzbiq.zzb((zzcgj) obj, map);
        }
    };
    public static final zzbir zzd = new zzbii();
    public static final zzbir zze = new zzbij();
    public static final zzbir zzf = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhq
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgj zzcgjVar = (zzcgj) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str = (String) map.get("u");
            if (str == null) {
                zzcaa.zzj("URL missing from httpTrack GMSG.");
            } else {
                new com.google.android.gms.ads.internal.util.zzby(zzcgjVar.getContext(), ((zzcgr) zzcgjVar).zzn().zza, str).zzb();
            }
        }
    };
    public static final zzbir zzg = new zzbik();
    public static final zzbir zzh = new zzbil();
    public static final zzbir zzi = new zzbir() { // from class: com.google.android.gms.internal.ads.zzbhp
        @Override // com.google.android.gms.internal.ads.zzbir
        public final void zza(Object obj, Map map) {
            zzcgq zzcgqVar = (zzcgq) obj;
            zzbir zzbirVar = zzbiq.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzaqx zzI = zzcgqVar.zzI();
                if (zzI != null) {
                    zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException unused) {
                zzcaa.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbir zzj = new zzbim();
    public static final zzbir zzk = new zzbin();
    public static final zzbir zzl = new zzcdi();
    public static final zzbir zzm = new zzcdj();
    public static final zzbir zzn = new zzbhk();
    public static final zzbjg zzo = new zzbjg();
    public static final zzbir zzp = new zzbio();
    public static final zzbir zzq = new zzbip();
    public static final zzbir zzr = new zzbhv();
    public static final zzbir zzs = new zzbhw();
    public static final zzbir zzt = new zzbhx();
    public static final zzbir zzu = new zzbhy();
    public static final zzbir zzv = new zzbhz();
    public static final zzbir zzw = new zzbia();
    public static final zzbir zzx = new zzbib();
    public static final zzbir zzy = new zzbic();
    public static final zzbir zzz = new zzbid();
    public static final zzbir zzA = new zzbie();
    public static final zzbir zzB = new zzbig();
    public static final zzbir zzC = new zzbih();

    public static com.google.common.util.concurrent.a zza(zzcfi zzcfiVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzaqx zzI = zzcfiVar.zzI();
            if (zzI != null && zzI.zzf(parse)) {
                parse = zzI.zza(parse, zzcfiVar.getContext(), zzcfiVar.zzF(), zzcfiVar.zzi());
            }
        } catch (zzaqy unused) {
            zzcaa.zzj("Unable to append parameter to URL: ".concat(str));
        }
        final String zzb2 = zzbyh.zzb(parse, zzcfiVar.getContext());
        long longValue = ((Long) zzbdj.zze.zze()).longValue();
        if (longValue > 0 && longValue <= 233012802) {
            zzfxv zzu2 = zzfxv.zzu(zzcfiVar.zzR());
            zzbhm zzbhmVar = new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbhm
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    zzbir zzbirVar = zzbiq.zza;
                    if (((Boolean) zzbdj.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation1");
                        return "failure_click_attok";
                    }
                    return "failure_click_attok";
                }
            };
            zzfyo zzfyoVar = zzcan.zzf;
            return zzfye.zze(zzfye.zzm(zzfye.zze(zzu2, Throwable.class, zzbhmVar, zzfyoVar), new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbhn
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    String str3 = (String) obj;
                    zzbir zzbirVar = zzbiq.zza;
                    if (str3 != null) {
                        if (((Boolean) zzbdj.zzf.zze()).booleanValue()) {
                            String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                            String host = Uri.parse(str2).getHost();
                            for (int i10 = 0; i10 < 3; i10++) {
                                if (!host.endsWith(strArr[i10])) {
                                }
                            }
                        }
                        String str4 = (String) zzbdj.zza.zze();
                        String str5 = (String) zzbdj.zzb.zze();
                        if (!TextUtils.isEmpty(str4)) {
                            str2 = str2.replace(str4, str3);
                        }
                        if (!TextUtils.isEmpty(str5)) {
                            Uri parse2 = Uri.parse(str2);
                            if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                                return parse2.buildUpon().appendQueryParameter(str5, str3).toString();
                            }
                        }
                    }
                    return str2;
                }
            }, zzfyoVar), Throwable.class, new zzfqw() { // from class: com.google.android.gms.internal.ads.zzbho
                @Override // com.google.android.gms.internal.ads.zzfqw
                public final Object apply(Object obj) {
                    String str2 = zzb2;
                    Throwable th = (Throwable) obj;
                    zzbir zzbirVar = zzbiq.zza;
                    if (((Boolean) zzbdj.zzk.zze()).booleanValue()) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "prepareClickUrl.attestation2");
                    }
                    return str2;
                }
            }, zzfyoVar);
        }
        return zzfye.zzh(zzb2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(16:10|11|12|(12:50|51|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|35|36|(1:38)|39|40|42|43)|14|15|(0)|34|35|36|(0)|39|40|42|43|8) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().zzu(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
    
        com.google.android.gms.internal.ads.zzcaa.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgj r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbiq.zzb(com.google.android.gms.internal.ads.zzcgj, java.util.Map):void");
    }

    public static void zzc(Map map, zzddw zzddwVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjK)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddwVar != null) {
            zzddwVar.zzbK();
        }
    }
}
