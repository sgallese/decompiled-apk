package okhttp3.internal.connection;

import ec.s;
import ec.t;
import ec.y;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import qc.h;
import qc.q;

/* compiled from: RouteSelector.kt */
/* loaded from: classes4.dex */
public final class RouteSelector {
    public static final Companion Companion = new Companion(null);
    private final Address address;
    private final Call call;
    private final EventListener eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<Route> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String getSocketHost(InetSocketAddress inetSocketAddress) {
            q.i(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                q.h(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            q.h(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    /* compiled from: RouteSelector.kt */
    /* loaded from: classes4.dex */
    public static final class Selection {
        private int nextRouteIndex;
        private final List<Route> routes;

        public Selection(List<Route> list) {
            q.i(list, "routes");
            this.routes = list;
        }

        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            if (this.nextRouteIndex < this.routes.size()) {
                return true;
            }
            return false;
        }

        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i10 = this.nextRouteIndex;
                this.nextRouteIndex = i10 + 1;
                return list.get(i10);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<? extends Proxy> i10;
        List<? extends InetSocketAddress> i11;
        q.i(address, "address");
        q.i(routeDatabase, "routeDatabase");
        q.i(call, "call");
        q.i(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        i10 = t.i();
        this.proxies = i10;
        i11 = t.i();
        this.inetSocketAddresses = i11;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        if (this.nextProxyIndex < this.proxies.size()) {
            return true;
        }
        return false;
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i10 = this.nextProxyIndex;
            this.nextProxyIndex = i10 + 1;
            Proxy proxy = list.get(i10);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String host;
        int port;
        List<InetAddress> lookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                Companion companion = Companion;
                q.h(address, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                host = companion.getSocketHost(inetSocketAddress);
                port = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(q.q("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
            }
        } else {
            host = this.address.url().host();
            port = this.address.url().port();
        }
        boolean z10 = false;
        if (1 <= port && port < 65536) {
            z10 = true;
        }
        if (z10) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(host, port));
                return;
            }
            if (Util.canParseAsIpAddress(host)) {
                lookup = s.d(InetAddress.getByName(host));
            } else {
                this.eventListener.dnsStart(this.call, host);
                lookup = this.address.dns().lookup(host);
                if (!lookup.isEmpty()) {
                    this.eventListener.dnsEnd(this.call, host, lookup);
                } else {
                    throw new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
                }
            }
            Iterator<InetAddress> it = lookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new InetSocketAddress(it.next(), port));
            }
            return;
        }
        throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, resetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        boolean z10;
        List<Proxy> d10;
        if (proxy != null) {
            d10 = s.d(proxy);
            return d10;
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> select = routeSelector.address.proxySelector().select(uri);
        List<Proxy> list = select;
        if (list != null && !list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        q.h(select, "proxiesOrNull");
        return Util.toImmutableList(select);
    }

    public final boolean hasNext() {
        if (hasNextProxy() || (!this.postponedRoutes.isEmpty()) != false) {
            return true;
        }
        return false;
    }

    public final Selection next() throws IOException {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
                while (it.hasNext()) {
                    Route route = new Route(this.address, nextProxy, it.next());
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if ((!arrayList.isEmpty()) != false) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                y.w(arrayList, this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
