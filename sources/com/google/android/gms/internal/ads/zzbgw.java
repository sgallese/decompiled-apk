package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbgw extends RemoteCreator {
    public zzbgw() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof zzbfj) {
            return (zzbfj) queryLocalInterface;
        }
        return new zzbfh(iBinder);
    }

    public final zzbfg zza(View view, HashMap hashMap, HashMap hashMap2) {
        zzbfg zzbfeVar;
        try {
            IBinder zze = ((zzbfj) getRemoteCreatorInstance(view.getContext())).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(hashMap), ObjectWrapper.wrap(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            if (queryLocalInterface instanceof zzbfg) {
                zzbfeVar = (zzbfg) queryLocalInterface;
            } else {
                zzbfeVar = new zzbfe(zze);
            }
            return zzbfeVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcaa.zzk("Could not create remote NativeAdViewHolderDelegate.", e10);
            return null;
        }
    }
}
