package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.4.0 */
/* loaded from: classes3.dex */
public abstract class zzbty extends zzatw implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    protected final boolean zzbJ(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbuj zzbujVar = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 7) {
                                return false;
                            }
                            String readString = parcel.readString();
                            IBinder readStrongBinder = parcel.readStrongBinder();
                            if (readStrongBinder != null) {
                                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface instanceof zzbuj) {
                                    zzbujVar = (zzbuj) queryLocalInterface;
                                } else {
                                    zzbujVar = new zzbuh(readStrongBinder);
                                }
                            }
                            zzatx.zzc(parcel);
                            zzh(readString, zzbujVar);
                            parcel2.writeNoException();
                        } else {
                            zzbun zzbunVar = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                            if (readStrongBinder2 != null) {
                                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                                if (queryLocalInterface2 instanceof zzbuj) {
                                    zzbujVar = (zzbuj) queryLocalInterface2;
                                } else {
                                    zzbujVar = new zzbuh(readStrongBinder2);
                                }
                            }
                            zzatx.zzc(parcel);
                            zze(zzbunVar, zzbujVar);
                            parcel2.writeNoException();
                        }
                    } else {
                        zzbun zzbunVar2 = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                            if (queryLocalInterface3 instanceof zzbuj) {
                                zzbujVar = (zzbuj) queryLocalInterface3;
                            } else {
                                zzbujVar = new zzbuh(readStrongBinder3);
                            }
                        }
                        zzatx.zzc(parcel);
                        zzf(zzbunVar2, zzbujVar);
                        parcel2.writeNoException();
                    }
                } else {
                    zzbun zzbunVar3 = (zzbun) zzatx.zza(parcel, zzbun.CREATOR);
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                        if (queryLocalInterface4 instanceof zzbuj) {
                            zzbujVar = (zzbuj) queryLocalInterface4;
                        } else {
                            zzbujVar = new zzbuh(readStrongBinder4);
                        }
                    }
                    zzatx.zzc(parcel);
                    zzg(zzbunVar3, zzbujVar);
                    parcel2.writeNoException();
                }
            } else {
                zzbto zzbtoVar = (zzbto) zzatx.zza(parcel, zzbto.CREATOR);
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface5 instanceof zzbua) {
                        zzbua zzbuaVar = (zzbua) queryLocalInterface5;
                    }
                }
                zzatx.zzc(parcel);
                parcel2.writeNoException();
            }
        } else {
            zzbto zzbtoVar2 = (zzbto) zzatx.zza(parcel, zzbto.CREATOR);
            zzatx.zzc(parcel);
            parcel2.writeNoException();
            zzatx.zze(parcel2, null);
        }
        return true;
    }
}
