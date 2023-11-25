package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbed {
    private final Context zza;

    public zzbed(Context context) {
        this.zza = context;
    }

    public final void zza(zzbtm zzbtmVar) {
        try {
            ((zzbee) zzcae.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzcac() { // from class: com.google.android.gms.internal.ads.zzbec
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcac
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    if (queryLocalInterface instanceof zzbee) {
                        return (zzbee) queryLocalInterface;
                    }
                    return new zzbee(obj);
                }
            })).zze(zzbtmVar);
        } catch (RemoteException e10) {
            zzcaa.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e10.getMessage())));
        } catch (zzcad e11) {
            zzcaa.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e11.getMessage())));
        }
    }
}
