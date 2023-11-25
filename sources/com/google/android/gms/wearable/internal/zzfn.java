package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.1.0 */
/* loaded from: classes3.dex */
public final class zzfn extends com.google.android.gms.internal.wearable.zza {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void zzd(boolean z10, byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        int i10 = com.google.android.gms.internal.wearable.zzc.zza;
        zza.writeInt(z10 ? 1 : 0);
        zza.writeByteArray(bArr);
        zzQ(1, zza);
    }
}
