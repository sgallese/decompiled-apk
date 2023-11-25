package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbbr;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzcac;
import com.google.android.gms.internal.ads.zzcad;
import com.google.android.gms.internal.ads.zzcae;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzk extends RemoteCreator {
    private zzbth zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof zzbv) {
            return (zzbv) queryLocalInterface;
        }
        return new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, zzbof zzbofVar, int i10) {
        zzbu zzbsVar;
        zzbu zzbsVar2;
        zzbbr.zza(context);
        if (((Boolean) zzba.zzc().zzb(zzbbr.zzjH)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) zzcae.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcac() { // from class: com.google.android.gms.ads.internal.client.zzj
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.internal.ads.zzcac
                    public final Object zza(Object obj) {
                        if (obj == 0) {
                            return null;
                        }
                        IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                        if (queryLocalInterface instanceof zzbv) {
                            return (zzbv) queryLocalInterface;
                        }
                        return new zzbv(obj);
                    }
                })).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbofVar, 233012000, i10);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (queryLocalInterface instanceof zzbu) {
                    zzbsVar = (zzbu) queryLocalInterface;
                } else {
                    zzbsVar = new zzbs(zze);
                }
                return zzbsVar;
            } catch (RemoteException | zzcad | NullPointerException e10) {
                zzbth zza = zzbtf.zza(context);
                this.zza = zza;
                zza.zzf(e10, "AdManagerCreator.newAdManagerByDynamiteLoader");
                zzcaa.zzl("#007 Could not call remote method.", e10);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzqVar, str, zzbofVar, 233012000, i10);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface2 instanceof zzbu) {
                zzbsVar2 = (zzbu) queryLocalInterface2;
            } else {
                zzbsVar2 = new zzbs(zze2);
            }
            return zzbsVar2;
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e11) {
            zzcaa.zzf("Could not create remote AdManager.", e11);
            return null;
        }
    }
}
