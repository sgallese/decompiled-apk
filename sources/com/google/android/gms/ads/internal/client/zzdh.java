package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzdh extends zzatv implements zzdj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdj
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, iObjectWrapper2);
        zzbh(1, zza);
    }
}
