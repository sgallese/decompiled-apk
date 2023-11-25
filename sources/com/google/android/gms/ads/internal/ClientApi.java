package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzew;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzae;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzdiw;
import com.google.android.gms.internal.ads.zzdiy;
import com.google.android.gms.internal.ads.zzdsp;
import com.google.android.gms.internal.ads.zzeka;
import com.google.android.gms.internal.ads.zzewe;
import com.google.android.gms.internal.ads.zzewf;
import com.google.android.gms.internal.ads.zzexs;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfax;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes.dex */
public class ClientApi extends zzcd {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzeka(zzchd.zzb(context, zzbofVar, i10), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewe zzs = zzchd.zzb(context, zzbofVar, i10).zzs();
        zzs.zza(str);
        zzs.zzb(context);
        zzewf zzc = zzs.zzc();
        if (i10 >= ((Integer) zzba.zzc().zzb(zzbbr.zzfc)).intValue()) {
            return zzc.zza();
        }
        return new zzew();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzexs zzt = zzchd.zzb(context, zzbofVar, i10).zzt();
        zzt.zzc(context);
        zzt.zza(zzqVar);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezj zzu = zzchd.zzb(context, zzbofVar, i10).zzu();
        zzu.zzc(context);
        zzu.zza(zzqVar);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, int i10) {
        return new zzs((Context) ObjectWrapper.unwrap(iObjectWrapper), zzqVar, str, new zzcag(233012000, i10, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i10).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i10).zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdiy((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 233012000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdiw((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10, zzbjp zzbjpVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdsp zzj = zzchd.zzb(context, zzbofVar, i10).zzj();
        zzj.zzb(context);
        zzj.zza(zzbjpVar);
        return zzj.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i10).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
        }
        int i10 = zza.zzk;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return new com.google.android.gms.ads.internal.overlay.zzt(activity);
                        }
                        return new zzac(activity);
                    }
                    return new zzy(activity, zza);
                }
                return new zzaf(activity);
            }
            return new zzae(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzs(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfax zzv = zzchd.zzb(context, zzbofVar, i10).zzv();
        zzv.zzb(context);
        return zzv.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i10) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfax zzv = zzchd.zzb(context, zzbofVar, i10).zzv();
        zzv.zzb(context);
        zzv.zza(str);
        return zzv.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) {
        return zzchd.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbofVar, i10).zzp();
    }
}
