package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdjo {
    private final zzdom zza;
    private final zzdnb zzb;
    private final zzcpi zzc;
    private final zzdik zzd;

    public zzdjo(zzdom zzdomVar, zzdnb zzdnbVar, zzcpi zzcpiVar, zzdik zzdikVar) {
        this.zza = zzdomVar;
        this.zzb = zzdnbVar;
        this.zzc = zzcpiVar;
        this.zzd = zzdikVar;
    }

    public final View zza() throws zzcft {
        zzcfi zza = this.zza.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        ((View) zza).setVisibility(8);
        zza.zzad("/sendMessageToSdk", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdji
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjo.this.zzb((zzcfi) obj, map);
            }
        });
        zza.zzad("/adMuted", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjj
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjo.this.zzc((zzcfi) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/loadHtml", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, final Map map) {
                final zzdjo zzdjoVar = zzdjo.this;
                zzcfi zzcfiVar = (zzcfi) obj;
                zzcfiVar.zzN().zzA(new zzcgt() { // from class: com.google.android.gms.internal.ads.zzdjn
                    @Override // com.google.android.gms.internal.ads.zzcgt
                    public final void zza(boolean z10, int i10, String str, String str2) {
                        zzdjo.this.zzd(map, z10, i10, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcfiVar.loadData(str, "text/html", "UTF-8");
                } else {
                    zzcfiVar.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/showOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjl
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjo.this.zze((zzcfi) obj, map);
            }
        });
        this.zzb.zzj(new WeakReference(zza), "/hideOverlay", new zzbir() { // from class: com.google.android.gms.internal.ads.zzdjm
            @Override // com.google.android.gms.internal.ads.zzbir
            public final void zza(Object obj, Map map) {
                zzdjo.this.zzf((zzcfi) obj, map);
            }
        });
        return (View) zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcfi zzcfiVar, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcfi zzcfiVar, Map map) {
        this.zzd.zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z10, int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcfi zzcfiVar, Map map) {
        zzcaa.zzi("Showing native ads overlay.");
        zzcfiVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcfi zzcfiVar, Map map) {
        zzcaa.zzi("Hiding native ads overlay.");
        zzcfiVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
