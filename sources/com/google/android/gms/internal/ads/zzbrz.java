package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbrz extends RemoteCreator {
    public zzbrz() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof zzbsf) {
            return (zzbsf) queryLocalInterface;
        }
        return new zzbsd(iBinder);
    }

    public final zzbsc zza(Activity activity) {
        zzbsc zzbsaVar;
        try {
            IBinder zze = ((zzbsf) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof zzbsc) {
                zzbsaVar = (zzbsc) queryLocalInterface;
            } else {
                zzbsaVar = new zzbsa(zze);
            }
            return zzbsaVar;
        } catch (RemoteException e10) {
            zzcaa.zzk("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            zzcaa.zzk("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
