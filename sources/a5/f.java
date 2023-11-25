package a5;

import a5.d;
import android.annotation.SuppressLint;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import qc.q;

/* compiled from: NetworkObserver.kt */
@SuppressLint({"MissingPermission"})
/* loaded from: classes.dex */
final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f390a;

    /* renamed from: b  reason: collision with root package name */
    private final d.a f391b;

    /* renamed from: c  reason: collision with root package name */
    private final a f392c;

    /* compiled from: NetworkObserver.kt */
    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            f.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            f.this.d(network, false);
        }
    }

    public f(ConnectivityManager connectivityManager, d.a aVar) {
        this.f390a = connectivityManager;
        this.f391b = aVar;
        a aVar2 = new a();
        this.f392c = aVar2;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar2);
    }

    private final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f390a.getNetworkCapabilities(network);
        if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Network network, boolean z10) {
        boolean c10;
        Network[] allNetworks = this.f390a.getAllNetworks();
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network network2 = allNetworks[i10];
            if (q.d(network2, network)) {
                c10 = z10;
            } else {
                c10 = c(network2);
            }
            if (c10) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f391b.a(z11);
    }

    @Override // a5.d
    public boolean a() {
        for (Network network : this.f390a.getAllNetworks()) {
            if (c(network)) {
                return true;
            }
        }
        return false;
    }

    @Override // a5.d
    public void shutdown() {
        this.f390a.unregisterNetworkCallback(this.f392c);
    }
}
