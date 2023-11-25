package x7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class b extends h0 implements c {
    public static c K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface instanceof c) {
            return (c) queryLocalInterface;
        }
        return new a(iBinder);
    }
}
