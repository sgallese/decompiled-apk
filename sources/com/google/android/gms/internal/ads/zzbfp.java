package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbfp extends zzatw implements zzbfq {
    public zzbfp() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbfq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzbfq) {
            return (zzbfq) queryLocalInterface;
        }
        return new zzbfo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                zzatx.zzc(parcel);
                String zzj = zzj(readString);
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzatx.zzc(parcel);
                zzbew zzg = zzg(readString2);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzg);
                return true;
            case 3:
                List<String> zzk = zzk();
                parcel2.writeNoException();
                parcel2.writeStringList(zzk);
                return true;
            case 4:
                String zzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzatx.zzc(parcel);
                zzn(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                zzo();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zze = zze();
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zze);
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzh = zzh();
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzh);
                return true;
            case 10:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                boolean zzs = zzs(asInterface);
                parcel2.writeNoException();
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzatx.zzf(parcel2, null);
                return true;
            case 12:
                boolean zzq = zzq();
                parcel2.writeNoException();
                int i12 = zzatx.zza;
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 13:
                boolean zzt = zzt();
                parcel2.writeNoException();
                int i13 = zzatx.zza;
                parcel2.writeInt(zzt ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzp(asInterface2);
                parcel2.writeNoException();
                return true;
            case 15:
                zzm();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbet zzf = zzf();
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzf);
                return true;
            case 17:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                boolean zzr = zzr(asInterface3);
                parcel2.writeNoException();
                parcel2.writeInt(zzr ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
