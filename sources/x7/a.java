package x7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class a extends g0 implements c {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // x7.c
    public final void q(String str, Bundle bundle, e eVar) throws RemoteException {
        Parcel J = J();
        J.writeString(str);
        i0.b(J, bundle);
        i0.c(J, eVar);
        K(2, J);
    }
}
