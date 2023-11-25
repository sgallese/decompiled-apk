package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvt;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwd;
import com.google.android.gms.internal.ads.zzbwe;
import com.google.android.gms.internal.ads.zzbwk;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzcaa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzfc extends zzbvv {
    private static void zzr(final zzbwd zzbwdVar) {
        zzcaa.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbzt.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbwd zzbwdVar2 = zzbwd.this;
                if (zzbwdVar2 != null) {
                    try {
                        zzbwdVar2.zze(1);
                    } catch (RemoteException e10) {
                        zzcaa.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final zzbvt zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        zzr(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg(zzl zzlVar, zzbwd zzbwdVar) throws RemoteException {
        zzr(zzbwdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzh(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzk(zzbvz zzbvzVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzl(zzbwk zzbwkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzp(zzbwe zzbweVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z10) {
    }
}
