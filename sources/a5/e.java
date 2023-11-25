package a5;

import a5.d;
import android.content.Context;
import android.net.ConnectivityManager;
import g5.j;
import g5.u;

/* compiled from: NetworkObserver.kt */
/* loaded from: classes.dex */
public final class e {
    public static final d a(Context context, d.a aVar, u uVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.a.i(context, ConnectivityManager.class);
        if (connectivityManager != null && g5.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new f(connectivityManager, aVar);
            } catch (Exception e10) {
                if (uVar != null) {
                    j.a(uVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e10));
                }
                return new c();
            }
        }
        if (uVar != null && uVar.a() <= 5) {
            uVar.b("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new c();
    }
}
