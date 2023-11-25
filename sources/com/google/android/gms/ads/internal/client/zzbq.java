package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbek;
import com.google.android.gms.internal.ads.zzbfu;
import com.google.android.gms.internal.ads.zzbfx;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgh;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzblj;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbfu zzbfuVar) throws RemoteException;

    void zzg(zzbfx zzbfxVar) throws RemoteException;

    void zzh(String str, zzbgd zzbgdVar, zzbga zzbgaVar) throws RemoteException;

    void zzi(zzblj zzbljVar) throws RemoteException;

    void zzj(zzbgh zzbghVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbgk zzbgkVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbla zzblaVar) throws RemoteException;

    void zzo(zzbek zzbekVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
