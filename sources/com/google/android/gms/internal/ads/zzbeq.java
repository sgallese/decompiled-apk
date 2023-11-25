package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbeq implements NativeCustomTemplateAd.DisplayOpenMeasurement {
    private final zzbfq zza;

    public zzbeq(zzbfq zzbfqVar) {
        this.zza = zzbfqVar;
        try {
            zzbfqVar.zzm();
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e10) {
            zzcaa.zzh("", e10);
            return false;
        }
    }
}
