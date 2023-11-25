package x7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class j0 extends g0 implements l0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    @Override // x7.l0
    public final void a(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.b(J, bundle2);
        i0.c(J, n0Var);
        K(7, J);
    }

    @Override // x7.l0
    public final void e(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.b(J, bundle2);
        i0.c(J, n0Var);
        K(6, J);
    }

    @Override // x7.l0
    public final void i(String str, List list, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        J.writeTypedList(list);
        i0.b(J, bundle);
        i0.c(J, n0Var);
        K(14, J);
    }

    @Override // x7.l0
    public final void n(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.b(J, bundle2);
        i0.c(J, n0Var);
        K(11, J);
    }

    @Override // x7.l0
    public final void p(String str, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.c(J, n0Var);
        K(5, J);
    }

    @Override // x7.l0
    public final void y(String str, Bundle bundle, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.c(J, n0Var);
        K(10, J);
    }

    @Override // x7.l0
    public final void z(String str, Bundle bundle, Bundle bundle2, n0 n0Var) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.b(J, bundle2);
        i0.c(J, n0Var);
        K(9, J);
    }
}
