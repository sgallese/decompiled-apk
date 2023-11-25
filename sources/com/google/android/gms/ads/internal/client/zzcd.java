package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatw;
import com.google.android.gms.internal.ads.zzatx;
import com.google.android.gms.internal.ads.zzbfa;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbjo;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzboe;
import com.google.android.gms.internal.ads.zzbof;
import com.google.android.gms.internal.ads.zzbrv;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzbvw;
import com.google.android.gms.internal.ads.zzbyr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.4.0 */
/* loaded from: classes.dex */
public abstract class zzcd extends zzatw implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String readString = parcel.readString();
                zzbof zzf = zzboe.zzf(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzd = zzd(asInterface, zzqVar, readString, zzf, readInt);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzd);
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String readString2 = parcel.readString();
                zzbof zzf2 = zzboe.zzf(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zze = zze(asInterface2, zzqVar2, readString2, zzf2, readInt2);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zze);
                return true;
            case 3:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString3 = parcel.readString();
                zzbof zzf3 = zzboe.zzf(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbq zzb = zzb(asInterface3, readString3, zzf3, readInt3);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbfa zzi = zzi(asInterface4, asInterface5);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzi);
                return true;
            case 6:
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzf4 = zzboe.zzf(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbvg zzn = zzn(asInterface6, zzf4, readInt4);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzn);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbsc zzm = zzm(asInterface7);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzm);
                return true;
            case 9:
                IObjectWrapper asInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int readInt5 = parcel.readInt();
                zzatx.zzc(parcel);
                zzco zzg = zzg(asInterface8, readInt5);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzg);
                return true;
            case 10:
                IObjectWrapper asInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String readString4 = parcel.readString();
                int readInt6 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzf5 = zzf(asInterface9, zzqVar3, readString4, readInt6);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzf5);
                return true;
            case 11:
                IObjectWrapper asInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper asInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbfg zzj = zzj(asInterface10, asInterface11, asInterface12);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzj);
                return true;
            case 12:
                IObjectWrapper asInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String readString5 = parcel.readString();
                zzbof zzf6 = zzboe.zzf(parcel.readStrongBinder());
                int readInt7 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbvw zzo = zzo(asInterface13, readString5, zzf6, readInt7);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzo);
                return true;
            case 13:
                IObjectWrapper asInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) zzatx.zza(parcel, zzq.CREATOR);
                String readString6 = parcel.readString();
                zzbof zzf7 = zzboe.zzf(parcel.readStrongBinder());
                int readInt8 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbu zzc = zzc(asInterface14, zzqVar4, readString6, zzf7, readInt8);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzc);
                return true;
            case 14:
                IObjectWrapper asInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzf8 = zzboe.zzf(parcel.readStrongBinder());
                int readInt9 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbyr zzp = zzp(asInterface15, zzf8, readInt9);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzp);
                return true;
            case 15:
                IObjectWrapper asInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzf9 = zzboe.zzf(parcel.readStrongBinder());
                int readInt10 = parcel.readInt();
                zzatx.zzc(parcel);
                zzbrv zzl = zzl(asInterface16, zzf9, readInt10);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzl);
                return true;
            case 16:
                IObjectWrapper asInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzf10 = zzboe.zzf(parcel.readStrongBinder());
                int readInt11 = parcel.readInt();
                zzbjp zzc2 = zzbjo.zzc(parcel.readStrongBinder());
                zzatx.zzc(parcel);
                zzbjs zzk = zzk(asInterface17, zzf10, readInt11, zzc2);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzk);
                return true;
            case 17:
                IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbof zzf11 = zzboe.zzf(parcel.readStrongBinder());
                int readInt12 = parcel.readInt();
                zzatx.zzc(parcel);
                zzdj zzh = zzh(asInterface18, zzf11, readInt12);
                parcel2.writeNoException();
                zzatx.zzf(parcel2, zzh);
                return true;
            default:
                return false;
        }
    }
}
