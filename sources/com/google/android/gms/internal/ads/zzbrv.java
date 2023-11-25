package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public interface zzbrv extends IInterface {
    void zze(Intent intent) throws RemoteException;

    void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzg(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzh() throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException;
}
