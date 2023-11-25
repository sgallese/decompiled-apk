package okhttp3.internal.connection;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import okhttp3.Address;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import qc.q;

/* compiled from: ExchangeFinder.kt */
/* loaded from: classes4.dex */
public final class ExchangeFinder {
    private final Address address;
    private final RealCall call;
    private final RealConnectionPool connectionPool;
    private int connectionShutdownCount;
    private final EventListener eventListener;
    private Route nextRouteToTry;
    private int otherFailureCount;
    private int refusedStreamCount;
    private RouteSelector.Selection routeSelection;
    private RouteSelector routeSelector;

    public ExchangeFinder(RealConnectionPool realConnectionPool, Address address, RealCall realCall, EventListener eventListener) {
        q.i(realConnectionPool, "connectionPool");
        q.i(address, "address");
        q.i(realCall, "call");
        q.i(eventListener, "eventListener");
        this.connectionPool = realConnectionPool;
        this.address = address;
        this.call = realCall;
        this.eventListener = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final okhttp3.internal.connection.RealConnection findConnection(int r15, int r16, int r17, int r18, boolean r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ExchangeFinder.findConnection(int, int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    private final RealConnection findHealthyConnection(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws IOException {
        boolean hasNext;
        while (true) {
            RealConnection findConnection = findConnection(i10, i11, i12, i13, z10);
            if (findConnection.isHealthy(z11)) {
                return findConnection;
            }
            findConnection.noNewExchanges$okhttp();
            if (this.nextRouteToTry == null) {
                RouteSelector.Selection selection = this.routeSelection;
                boolean z12 = true;
                if (selection == null) {
                    hasNext = true;
                } else {
                    hasNext = selection.hasNext();
                }
                if (hasNext) {
                    continue;
                } else {
                    RouteSelector routeSelector = this.routeSelector;
                    if (routeSelector != null) {
                        z12 = routeSelector.hasNext();
                    }
                    if (!z12) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    private final Route retryRoute() {
        RealConnection connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount$okhttp() != 0) {
                return null;
            }
            if (!Util.canReuseConnectionFor(connection.route().address().url(), getAddress$okhttp().url())) {
                return null;
            }
            return connection.route();
        }
    }

    public final ExchangeCodec find(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain) {
        boolean z10;
        q.i(okHttpClient, "client");
        q.i(realInterceptorChain, "chain");
        try {
            int connectTimeoutMillis$okhttp = realInterceptorChain.getConnectTimeoutMillis$okhttp();
            int readTimeoutMillis$okhttp = realInterceptorChain.getReadTimeoutMillis$okhttp();
            int writeTimeoutMillis$okhttp = realInterceptorChain.getWriteTimeoutMillis$okhttp();
            int pingIntervalMillis = okHttpClient.pingIntervalMillis();
            boolean retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure();
            if (!q.d(realInterceptorChain.getRequest$okhttp().method(), "GET")) {
                z10 = true;
            } else {
                z10 = false;
            }
            return findHealthyConnection(connectTimeoutMillis$okhttp, readTimeoutMillis$okhttp, writeTimeoutMillis$okhttp, pingIntervalMillis, retryOnConnectionFailure, z10).newCodec$okhttp(okHttpClient, realInterceptorChain);
        } catch (IOException e10) {
            trackFailure(e10);
            throw new RouteException(e10);
        } catch (RouteException e11) {
            trackFailure(e11.getLastConnectException());
            throw e11;
        }
    }

    public final Address getAddress$okhttp() {
        return this.address;
    }

    public final boolean retryAfterFailure() {
        RouteSelector routeSelector;
        boolean z10 = false;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        Route retryRoute = retryRoute();
        if (retryRoute != null) {
            this.nextRouteToTry = retryRoute;
            return true;
        }
        RouteSelector.Selection selection = this.routeSelection;
        if (selection != null && selection.hasNext()) {
            z10 = true;
        }
        if (z10 || (routeSelector = this.routeSelector) == null) {
            return true;
        }
        return routeSelector.hasNext();
    }

    public final boolean sameHostAndPort(HttpUrl httpUrl) {
        q.i(httpUrl, ImagesContract.URL);
        HttpUrl url = this.address.url();
        if (httpUrl.port() == url.port() && q.d(httpUrl.host(), url.host())) {
            return true;
        }
        return false;
    }

    public final void trackFailure(IOException iOException) {
        q.i(iOException, "e");
        this.nextRouteToTry = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
