package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzfne {
    final zzfnh zza;
    final boolean zzb;

    private zzfne(zzfnh zzfnhVar) {
        boolean z10;
        this.zza = zzfnhVar;
        if (zzfnhVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.zzb = z10;
    }

    public static zzfne zzb(Context context, String str, String str2) {
        zzfnh zzfnfVar;
        try {
            try {
                try {
                    IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (instantiate == null) {
                        zzfnfVar = null;
                    } else {
                        IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        if (queryLocalInterface instanceof zzfnh) {
                            zzfnfVar = (zzfnh) queryLocalInterface;
                        } else {
                            zzfnfVar = new zzfnf(instantiate);
                        }
                    }
                    zzfnfVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfne(zzfnfVar);
                } catch (Exception e10) {
                    throw new zzfmg(e10);
                }
            } catch (RemoteException | zzfmg | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfne(new zzfni());
            }
        } catch (Exception e11) {
            throw new zzfmg(e11);
        }
    }

    public static zzfne zzc() {
        zzfni zzfniVar = new zzfni();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfne(zzfniVar);
    }

    public final zzfnd zza(byte[] bArr) {
        return new zzfnd(this, bArr, null);
    }
}
