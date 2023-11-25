package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzbl extends zzatv implements zzbn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzlVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzd(zza, zzlVar);
        zza.writeInt(i10);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        boolean zzg = zzatx.zzg(zzbg);
        zzbg.recycle();
        return zzg;
    }
}
