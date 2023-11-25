package l4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import androidx.work.l;

/* compiled from: NetworkStateTracker.java */
/* loaded from: classes.dex */
public class g extends d<j4.b> {

    /* renamed from: j  reason: collision with root package name */
    static final String f19538j = l.f("NetworkStateTracker");

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f19539g;

    /* renamed from: h  reason: collision with root package name */
    private b f19540h;

    /* renamed from: i  reason: collision with root package name */
    private a f19541i;

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    private class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                l.c().a(g.f19538j, "Network broadcast received", new Throwable[0]);
                g gVar = g.this;
                gVar.d(gVar.g());
            }
        }
    }

    /* compiled from: NetworkStateTracker.java */
    /* loaded from: classes.dex */
    private class b extends ConnectivityManager.NetworkCallback {
        b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            l.c().a(g.f19538j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            l.c().a(g.f19538j, "Network connection lost", new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }
    }

    public g(Context context, p4.a aVar) {
        super(context, aVar);
        this.f19539g = (ConnectivityManager) this.f19532b.getSystemService("connectivity");
        if (j()) {
            this.f19540h = new b();
        } else {
            this.f19541i = new a();
        }
    }

    private static boolean j() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    @Override // l4.d
    public void e() {
        if (j()) {
            try {
                l.c().a(f19538j, "Registering network callback", new Throwable[0]);
                this.f19539g.registerDefaultNetworkCallback(this.f19540h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                l.c().b(f19538j, "Received exception while registering network callback", e10);
                return;
            }
        }
        l.c().a(f19538j, "Registering broadcast receiver", new Throwable[0]);
        this.f19532b.registerReceiver(this.f19541i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // l4.d
    public void f() {
        if (j()) {
            try {
                l.c().a(f19538j, "Unregistering network callback", new Throwable[0]);
                this.f19539g.unregisterNetworkCallback(this.f19540h);
                return;
            } catch (IllegalArgumentException | SecurityException e10) {
                l.c().b(f19538j, "Received exception while unregistering network callback", e10);
                return;
            }
        }
        l.c().a(f19538j, "Unregistering broadcast receiver", new Throwable[0]);
        this.f19532b.unregisterReceiver(this.f19541i);
    }

    j4.b g() {
        boolean z10;
        NetworkInfo activeNetworkInfo = this.f19539g.getActiveNetworkInfo();
        boolean z11 = true;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean i10 = i();
        boolean a10 = androidx.core.net.a.a(this.f19539g);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z11 = false;
        }
        return new j4.b(z10, i10, a10, z11);
    }

    @Override // l4.d
    /* renamed from: h  reason: merged with bridge method [inline-methods] */
    public j4.b b() {
        return g();
    }

    boolean i() {
        Network activeNetwork;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                activeNetwork = this.f19539g.getActiveNetwork();
                NetworkCapabilities networkCapabilities = this.f19539g.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    return false;
                }
                if (!networkCapabilities.hasCapability(16)) {
                    return false;
                }
                return true;
            } catch (SecurityException e10) {
                l.c().b(f19538j, "Unable to validate active network", e10);
                return false;
            }
        }
        return false;
    }
}
