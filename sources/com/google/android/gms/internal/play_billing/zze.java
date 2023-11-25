package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
public interface zze extends IInterface {
    int zza(int i10, String str, String str2) throws RemoteException;

    int zzc(int i10, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzd(int i10, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zze(int i10, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzf(int i10, String str, String str2, String str3, String str4) throws RemoteException;

    Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException;

    Bundle zzh(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    Bundle zzi(int i10, String str, String str2, String str3) throws RemoteException;

    Bundle zzj(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException;

    Bundle zzk(int i10, String str, String str2, Bundle bundle) throws RemoteException;

    Bundle zzl(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException;

    void zzm(int i10, String str, Bundle bundle, zzg zzgVar) throws RemoteException;

    int zzq(int i10, String str, String str2) throws RemoteException;
}
