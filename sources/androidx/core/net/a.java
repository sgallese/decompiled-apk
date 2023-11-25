package androidx.core.net;

import android.net.ConnectivityManager;

/* compiled from: ConnectivityManagerCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ConnectivityManagerCompat.java */
    /* renamed from: androidx.core.net.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0071a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0071a.a(connectivityManager);
    }
}
