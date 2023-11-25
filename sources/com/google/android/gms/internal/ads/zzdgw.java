package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzdgw implements zzbir {
    private final WeakReference zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdgw(zzdgz zzdgzVar, zzdgv zzdgvVar) {
        this.zza = new WeakReference(zzdgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbir
    public final void zza(Object obj, Map map) {
        zzcwg zzcwgVar;
        zzddu zzdduVar;
        zzddu zzdduVar2;
        zzdgz zzdgzVar = (zzdgz) this.zza.get();
        if (zzdgzVar != null) {
            zzcwgVar = zzdgzVar.zzh;
            zzcwgVar.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbr.zzjL)).booleanValue()) {
                zzdduVar = zzdgzVar.zzi;
                zzdduVar.zzbK();
                if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    zzdduVar2 = zzdgzVar.zzi;
                    zzdduVar2.zzs();
                }
            }
        }
    }
}
