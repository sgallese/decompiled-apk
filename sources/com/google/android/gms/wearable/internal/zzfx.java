package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.wearable.WearableStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzfx {
    private final Map zza = new HashMap();

    public final void zza(zzjj zzjjVar, BaseImplementation.ResultHolder resultHolder, Object obj, zzjq zzjqVar) throws RemoteException {
        synchronized (this.zza) {
            if (this.zza.get(obj) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "duplicate listener: " + String.valueOf(obj));
                }
                resultHolder.setResult(new Status(WearableStatusCodes.DUPLICATE_LISTENER));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                Log.v("WearableClient", "new listener: " + String.valueOf(obj));
            }
            this.zza.put(obj, zzjqVar);
            try {
                ((zzft) zzjjVar.getService()).zzd(new zzfv(this.zza, obj, resultHolder), new zzf(zzjqVar));
            } catch (RemoteException e10) {
                if (Log.isLoggable("WearableClient", 3)) {
                    Log.d("WearableClient", "addListener failed, removing listener: " + String.valueOf(obj));
                }
                this.zza.remove(obj);
                throw e10;
            }
        }
    }

    public final void zzb(IBinder iBinder) {
        zzft zzftVar;
        synchronized (this.zza) {
            if (iBinder == null) {
                zzftVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                if (queryLocalInterface instanceof zzft) {
                    zzftVar = (zzft) queryLocalInterface;
                } else {
                    zzftVar = new zzft(iBinder);
                }
            }
            zzix zzixVar = new zzix();
            for (Map.Entry entry : this.zza.entrySet()) {
                zzjq zzjqVar = (zzjq) entry.getValue();
                try {
                    zzftVar.zzd(zzixVar, new zzf(zzjqVar));
                    if (Log.isLoggable("WearableClient", 3)) {
                        Log.d("WearableClient", "onPostInitHandler: added: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(zzjqVar));
                    }
                } catch (RemoteException unused) {
                    Log.w("WearableClient", "onPostInitHandler: Didn't add: " + String.valueOf(entry.getKey()) + "/" + String.valueOf(zzjqVar));
                }
            }
        }
    }

    public final void zzc(zzjj zzjjVar, BaseImplementation.ResultHolder resultHolder, Object obj) throws RemoteException {
        synchronized (this.zza) {
            zzjq zzjqVar = (zzjq) this.zza.remove(obj);
            if (zzjqVar == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    Log.v("WearableClient", "remove Listener unknown: " + String.valueOf(obj));
                }
                resultHolder.setResult(new Status(WearableStatusCodes.UNKNOWN_LISTENER));
                return;
            }
            zzjqVar.zzt();
            if (Log.isLoggable("WearableClient", 2)) {
                Log.v("WearableClient", "service.removeListener: " + String.valueOf(obj));
            }
            ((zzft) zzjjVar.getService()).zzx(new zzfw(this.zza, obj, resultHolder), new zzhq(zzjqVar));
        }
    }
}
