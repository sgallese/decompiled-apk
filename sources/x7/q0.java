package x7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class q0 extends g0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    public final void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel J = J();
        i0.b(J, bundle);
        i0.b(J, bundle2);
        K(2, J);
    }

    public final void o(Bundle bundle) throws RemoteException {
        Parcel J = J();
        i0.b(J, bundle);
        K(4, J);
    }

    public final void zzd(Bundle bundle) throws RemoteException {
        Parcel J = J();
        i0.b(J, bundle);
        K(3, J);
    }
}
