package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbwi {
    public static final zzbvw zza(Context context, String str, zzbof zzbofVar) {
        zzbvw zzbvuVar;
        try {
            IBinder zze = ((zzbwa) zzcae.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new zzcac() { // from class: com.google.android.gms.internal.ads.zzbwh
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    if (queryLocalInterface instanceof zzbwa) {
                        return (zzbwa) queryLocalInterface;
                    }
                    return new zzbwa(obj);
                }
            })).zze(ObjectWrapper.wrap(context), str, zzbofVar, 233012000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            if (queryLocalInterface instanceof zzbvw) {
                zzbvuVar = (zzbvw) queryLocalInterface;
            } else {
                zzbvuVar = new zzbvu(zze);
            }
            return zzbvuVar;
        } catch (RemoteException | zzcad e10) {
            zzcaa.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }
}
