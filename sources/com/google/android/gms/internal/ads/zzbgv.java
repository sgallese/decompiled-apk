package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbgv extends RemoteCreator {
    public zzbgv() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof zzbfd) {
            return (zzbfd) queryLocalInterface;
        }
        return new zzbfb(iBinder);
    }

    public final zzbfa zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        zzbfa zzbeyVar;
        try {
            IBinder zze = ((zzbfd) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(frameLayout), ObjectWrapper.wrap(frameLayout2), 233012000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            if (queryLocalInterface instanceof zzbfa) {
                zzbeyVar = (zzbfa) queryLocalInterface;
            } else {
                zzbeyVar = new zzbey(zze);
            }
            return zzbeyVar;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e10) {
            zzcaa.zzk("Could not create remote NativeAdViewDelegate.", e10);
            return null;
        }
    }
}
