package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbjc implements zzbir {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdrh zzb;
    private final zzfgo zzc;
    private final zzbqz zze;
    private final zzech zzf;
    private final zzcob zzg;
    private com.google.android.gms.ads.internal.overlay.zzx zzh = null;
    private final zzfyo zzi = zzcan.zzf;
    private final zzcaf zzd = new zzcaf(null);

    public zzbjc(com.google.android.gms.ads.internal.zzb zzbVar, zzbqz zzbqzVar, zzech zzechVar, zzdrh zzdrhVar, zzfgo zzfgoVar, zzcob zzcobVar) {
        this.zza = zzbVar;
        this.zze = zzbqzVar;
        this.zzf = zzechVar;
        this.zzb = zzdrhVar;
        this.zzc = zzfgoVar;
        this.zzg = zzcobVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if ("c".equalsIgnoreCase(str)) {
                return 14;
            }
            return -1;
        }
        return -1;
    }

    static Uri zzc(Context context, zzaqx zzaqxVar, Uri uri, View view, Activity activity) {
        if (zzaqxVar == null) {
            return uri;
        }
        try {
            if (zzaqxVar.zze(uri)) {
                return zzaqxVar.zza(uri, context, view, activity);
            }
            return uri;
        } catch (zzaqy unused) {
            return uri;
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            zzcaa.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e10);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z10;
        boolean z11;
        boolean z12;
        HashMap hashMap;
        String str4;
        zzcfi zzcfiVar = (zzcfi) zzaVar;
        zzfbe zzD = zzcfiVar.zzD();
        zzfbi zzP = zzcfiVar.zzP();
        boolean z13 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z10 = false;
        } else {
            z10 = zzD.zzaj;
            str3 = zzP.zzb;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjJ)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcfiVar.zzaA()) {
                zzcaa.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            zzk(false);
            ((zzcgn) zzaVar).zzaF(zzf(map), zzb(map), z11);
        } else if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (str != null) {
                ((zzcgn) zzaVar).zzaG(zzf(map), zzb(map), str, z11);
            } else {
                ((zzcgn) zzaVar).zzaH(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z11);
            }
        } else if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcfiVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzer)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzex)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzev)).booleanValue()) {
                        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzew);
                        if (!str5.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzfrv.zzc(zzfqt.zzc(';')).zzd(str5).iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equals(packageName)) {
                                }
                            }
                        }
                    }
                    z13 = true;
                    break;
                }
            }
            boolean zzg = zzbcs.zzg(zzcfiVar.getContext());
            if (z13) {
                if (!zzg) {
                    zzm(4);
                } else {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcaa.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), Uri.parse(str), zzcfiVar.zzF(), zzcfiVar.zzi()));
                    if (z10 && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbiz(this);
                    ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z11);
                    return;
                }
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z10, str3, z11);
        } else if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z10, str3, z11);
        } else if ("open_app".equalsIgnoreCase(str2)) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhS)).booleanValue()) {
                return;
            }
            zzk(true);
            String str6 = (String) map.get("p");
            if (str6 == null) {
                zzcaa.zzj("Package name missing from open app action.");
            } else if (z10 && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), str6, str3)) {
            } else {
                PackageManager packageManager = zzcfiVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcaa.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                if (launchIntentForPackage != null) {
                    ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z11);
                }
            }
        } else {
            zzk(true);
            String str7 = (String) map.get("intent_url");
            Intent intent = null;
            if (!TextUtils.isEmpty(str7)) {
                try {
                    intent = Intent.parseUri(str7, 0);
                } catch (URISyntaxException e10) {
                    zzcaa.zzh("Error parsing the url: ".concat(String.valueOf(str7)), e10);
                }
            }
            Intent intent2 = intent;
            if (intent2 != null && intent2.getData() != null) {
                Uri data = intent2.getData();
                if (!Uri.EMPTY.equals(data)) {
                    Uri zzd2 = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), data, zzcfiVar.zzF(), zzcfiVar.zzi()));
                    if (!TextUtils.isEmpty(intent2.getType())) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzhT)).booleanValue()) {
                            intent2.setDataAndType(zzd2, intent2.getType());
                        }
                    }
                    intent2.setData(zzd2);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzih)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id")) {
                z12 = true;
            } else {
                z12 = false;
            }
            HashMap hashMap2 = new HashMap();
            if (z12) {
                hashMap = hashMap2;
                this.zzh = new zzbja(this, z11, zzaVar, hashMap2, map);
                z11 = false;
            } else {
                hashMap = hashMap2;
            }
            if (intent2 != null) {
                if (z10 && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), intent2.getData().toString(), str3)) {
                    if (z12) {
                        HashMap hashMap3 = hashMap;
                        hashMap3.put((String) map.get("event_id"), Boolean.TRUE);
                        ((zzbll) zzaVar).zzd("openIntentAsync", hashMap3);
                        return;
                    }
                    return;
                }
                ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzh), z11);
                return;
            }
            HashMap hashMap4 = hashMap;
            if (!TextUtils.isEmpty(str)) {
                str4 = zzd(zzc(zzcfiVar.getContext(), zzcfiVar.zzI(), Uri.parse(str), zzcfiVar.zzF(), zzcfiVar.zzi())).toString();
            } else {
                str4 = str;
            }
            if (z10 && this.zzf != null && zzl(zzaVar, zzcfiVar.getContext(), str4, str3)) {
                if (z12) {
                    hashMap4.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbll) zzaVar).zzd("openIntentAsync", hashMap4);
                    return;
                }
                return;
            }
            ((zzcgn) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), str4, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z11);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdrh zzdrhVar = this.zzb;
        if (zzdrhVar != null) {
            zzecs.zzc(context, zzdrhVar, this.zzc, this.zzf, str, "dialog_not_shown", zzfug.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
    
        if (com.google.android.gms.internal.ads.zzbjb.zzc(r11, r5, r6, r7) == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0122, code lost:
    
        r11 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza r18, java.util.Map r19, boolean r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjc.zzj(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    private final void zzk(boolean z10) {
        zzbqz zzbqzVar = this.zze;
        if (zzbqzVar != null) {
            zzbqzVar.zza(z10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008d, code lost:
    
        if (r2 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjc.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i10) {
        if (this.zzb == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzil)).booleanValue()) {
            zzfgo zzfgoVar = this.zzc;
            String zza = zzbcr.zza(i10);
            zzfgn zzb = zzfgn.zzb("cct_action");
            zzb.zza("cct_open_status", zza);
            zzfgoVar.zzb(zzb);
            return;
        }
        zzdrg zza2 = this.zzb.zza();
        zza2.zzb("action", "cct_action");
        zza2.zzb("cct_open_status", zzbcr.zza(i10));
        zza2.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.common.util.concurrent.a zzh;
        zzcob zzcobVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String zzc = zzbyh.zzc((String) map.get("u"), ((zzcfi) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcaa.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar != null && !zzbVar.zzc()) {
            this.zza.zzb(zzc);
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjo)).booleanValue() && (zzcobVar = this.zzg) != null) {
            zzh = zzcobVar.zzc(zzc, com.google.android.gms.ads.internal.client.zzay.zze());
        } else {
            zzh = zzfye.zzh(zzc);
        }
        zzfye.zzr(zzh, new zzbiy(this, zzaVar, map, str), this.zzi);
    }
}
