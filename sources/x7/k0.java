package x7;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public abstract class k0 extends h0 implements l0 {
    public static l0 K(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        if (queryLocalInterface instanceof l0) {
            return (l0) queryLocalInterface;
        }
        return new j0(iBinder);
    }
}
