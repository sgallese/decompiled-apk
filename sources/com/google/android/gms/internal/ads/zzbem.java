package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public final class zzbem extends zzatv implements zzbeo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbem(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final String zzg() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbeo
    public final List zzh() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzatx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }
}
