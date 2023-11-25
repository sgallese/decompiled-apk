package x7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public class g0 implements IInterface {

    /* renamed from: f  reason: collision with root package name */
    private final IBinder f25840f;

    /* renamed from: m  reason: collision with root package name */
    private final String f25841m;

    /* JADX INFO: Access modifiers changed from: protected */
    public g0(IBinder iBinder, String str) {
        this.f25840f = iBinder;
        this.f25841m = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Parcel J() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25841m);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K(int i10, Parcel parcel) throws RemoteException {
        try {
            this.f25840f.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25840f;
    }
}
