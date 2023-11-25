package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-auth@@20.7.0 */
/* loaded from: classes3.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                String readString = parcel.readString();
                zbc.zbb(parcel);
                zbd(status, readString);
            } else {
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                zbc(status2);
            }
        } else {
            Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
            Credential credential = (Credential) zbc.zba(parcel, Credential.CREATOR);
            zbc.zbb(parcel);
            zbb(status3, credential);
        }
        parcel2.writeNoException();
        return true;
    }
}
