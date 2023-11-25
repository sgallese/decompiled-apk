package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.1 */
/* loaded from: classes3.dex */
public interface zzej extends IInterface {
    String zzd(zzq zzqVar) throws RemoteException;

    List zze(zzq zzqVar, boolean z10) throws RemoteException;

    List zzf(String str, String str2, zzq zzqVar) throws RemoteException;

    List zzg(String str, String str2, String str3) throws RemoteException;

    List zzh(String str, String str2, boolean z10, zzq zzqVar) throws RemoteException;

    List zzi(String str, String str2, String str3, boolean z10) throws RemoteException;

    void zzj(zzq zzqVar) throws RemoteException;

    void zzk(zzaw zzawVar, zzq zzqVar) throws RemoteException;

    void zzl(zzaw zzawVar, String str, String str2) throws RemoteException;

    void zzm(zzq zzqVar) throws RemoteException;

    void zzn(zzac zzacVar, zzq zzqVar) throws RemoteException;

    void zzo(zzac zzacVar) throws RemoteException;

    void zzp(zzq zzqVar) throws RemoteException;

    void zzq(long j10, String str, String str2, String str3) throws RemoteException;

    void zzr(Bundle bundle, zzq zzqVar) throws RemoteException;

    void zzs(zzq zzqVar) throws RemoteException;

    void zzt(zzli zzliVar, zzq zzqVar) throws RemoteException;

    byte[] zzu(zzaw zzawVar, String str) throws RemoteException;
}
