package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdvo implements zzgyt {
    private final zzgzg zza;
    private final zzgzg zzb;

    public zzdvo(zzgzg zzgzgVar, zzgzg zzgzgVar2) {
        this.zza = zzgzgVar;
        this.zzb = zzgzgVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzg
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfge zzfgeVar = (zzfge) this.zza.zzb();
        final CookieManager zzb = com.google.android.gms.ads.internal.zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffv zzi = zzffo.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = zzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzaL));
            }
        }, zzffy.WEBVIEW_COOKIE, zzfgeVar).zzi(1L, TimeUnit.SECONDS);
        final zzdvm zzdvmVar = new zzffh() { // from class: com.google.android.gms.internal.ads.zzdvm
            @Override // com.google.android.gms.internal.ads.zzffh
            public final Object zza(Object obj) {
                Exception exc = (Exception) obj;
                return "";
            }
        };
        return zzi.zzc(Exception.class, new zzfxl() { // from class: com.google.android.gms.internal.ads.zzffr
            @Override // com.google.android.gms.internal.ads.zzfxl
            public final com.google.common.util.concurrent.a zza(Object obj) {
                Exception exc = (Exception) ((Throwable) obj);
                return zzfye.zzh("");
            }
        }).zza();
    }
}
