package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdmj extends zzbfp {
    private final Context zza;
    private final zzdic zzb;
    private zzdjc zzc;
    private zzdhx zzd;

    public zzdmj(Context context, zzdic zzdicVar, zzdjc zzdjcVar, zzdhx zzdhxVar) {
        this.zza = context;
        this.zzb = zzdicVar;
        this.zzc = zzdjcVar;
        this.zzd = zzdhxVar;
    }

    private final zzbej zzd(String str) {
        return new zzdmi(this, "_videoMediaView");
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzbet zzf() throws RemoteException {
        try {
            return this.zzd.zzc().zza();
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final zzbew zzg(String str) {
        return (zzbew) this.zzb.zzh().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final String zzi() {
        return this.zzb.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final String zzj(String str) {
        return (String) this.zzb.zzi().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final List zzk() {
        try {
            androidx.collection.g zzh = this.zzb.zzh();
            androidx.collection.g zzi = this.zzb.zzi();
            String[] strArr = new String[zzh.size() + zzi.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < zzh.size(); i11++) {
                strArr[i10] = (String) zzh.j(i11);
                i10++;
            }
            for (int i12 = 0; i12 < zzi.size(); i12++) {
                strArr[i10] = (String) zzi.j(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzl() {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzm() {
        try {
            String zzC = this.zzb.zzC();
            if (zzC != "Google" && (zzC == null || !zzC.equals("Google"))) {
                if (TextUtils.isEmpty(zzC)) {
                    zzcaa.zzj("Not starting OMID session. OM partner name has not been configured.");
                    return;
                }
                zzdhx zzdhxVar = this.zzd;
                if (zzdhxVar != null) {
                    zzdhxVar.zzf(zzC, false);
                    return;
                }
                return;
            }
            zzcaa.zzj("Illegal argument specified for omid partner name.");
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzn(String str) {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzD(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzo() {
        zzdhx zzdhxVar = this.zzd;
        if (zzdhxVar != null) {
            zzdhxVar.zzG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final void zzp(IObjectWrapper iObjectWrapper) {
        zzdhx zzdhxVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if ((unwrap instanceof View) && this.zzb.zzu() != null && (zzdhxVar = this.zzd) != null) {
            zzdhxVar.zzH((View) unwrap);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzq() {
        zzdhx zzdhxVar = this.zzd;
        if ((zzdhxVar != null && !zzdhxVar.zzU()) || this.zzb.zzr() == null || this.zzb.zzs() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzr(IObjectWrapper iObjectWrapper) {
        zzdjc zzdjcVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjcVar = this.zzc) == null || !zzdjcVar.zzf((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzq().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzs(IObjectWrapper iObjectWrapper) {
        zzdjc zzdjcVar;
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof ViewGroup) || (zzdjcVar = this.zzc) == null || !zzdjcVar.zzg((ViewGroup) unwrap)) {
            return false;
        }
        this.zzb.zzs().zzao(zzd("_videoMediaView"));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbfq
    public final boolean zzt() {
        zzfip zzu = this.zzb.zzu();
        if (zzu != null) {
            com.google.android.gms.ads.internal.zzt.zzA().zzi(zzu);
            if (this.zzb.zzr() != null) {
                this.zzb.zzr().zzd("onSdkLoaded", new androidx.collection.a());
                return true;
            }
            return true;
        }
        zzcaa.zzj("Trying to start OMID session before creation.");
        return false;
    }
}
