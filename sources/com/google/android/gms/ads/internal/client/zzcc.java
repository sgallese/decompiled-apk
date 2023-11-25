package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbez;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsb;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvv;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public final class zzcc extends zzatv implements zzce {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i10) throws RemoteException {
        zzbq zzboVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(3, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof zzbq) {
                zzboVar = (zzbq) queryLocalInterface;
            } else {
                zzboVar = new zzbo(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(13, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbof zzbofVar, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, int i10) throws RemoteException {
        zzbu zzbsVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzd(zza, zzqVar);
        zza.writeString(str);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(10, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof zzbu) {
                zzbsVar = (zzbu) queryLocalInterface;
            } else {
                zzbsVar = new zzbs(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(IObjectWrapper iObjectWrapper, int i10) throws RemoteException {
        zzco zzcmVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(9, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            if (queryLocalInterface instanceof zzco) {
                zzcmVar = (zzco) queryLocalInterface;
            } else {
                zzcmVar = new zzcm(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        zzdj zzdhVar;
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(17, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            if (queryLocalInterface instanceof zzdj) {
                zzdhVar = (zzdj) queryLocalInterface;
            } else {
                zzdhVar = new zzdh(readStrongBinder);
            }
        }
        zzbg.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfa zzi(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, iObjectWrapper2);
        Parcel zzbg = zzbg(5, zza);
        zzbfa zzbE = zzbez.zzbE(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbE;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbfg zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, iObjectWrapper2);
        zzatx.zzf(zza, iObjectWrapper3);
        Parcel zzbg = zzbg(11, zza);
        zzbfg zze = zzbff.zze(zzbg.readStrongBinder());
        zzbg.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbjs zzk(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10, zzbjp zzbjpVar) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        zzatx.zzf(zza, zzbjpVar);
        Parcel zzbg = zzbg(16, zza);
        zzbjs zzb = zzbjr.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbrv zzl(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(15, zza);
        zzbrv zzb = zzbru.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbsc zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        Parcel zzbg = zzbg(8, zza);
        zzbsc zzH = zzbsb.zzH(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzH;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvg zzn(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbvw zzo(IObjectWrapper iObjectWrapper, String str, zzbof zzbofVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(12, zza);
        zzbvw zzq = zzbvv.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbyr zzp(IObjectWrapper iObjectWrapper, zzbof zzbofVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzatx.zzf(zza, iObjectWrapper);
        zzatx.zzf(zza, zzbofVar);
        zza.writeInt(233012000);
        Parcel zzbg = zzbg(14, zza);
        zzbyr zzb = zzbyq.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }
}
