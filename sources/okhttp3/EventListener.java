package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import qc.h;
import qc.q;

/* compiled from: EventListener.kt */
/* loaded from: classes4.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* compiled from: EventListener.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    /* loaded from: classes4.dex */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheConditionalHit(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "cachedResponse");
    }

    public void cacheHit(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
    }

    public void cacheMiss(Call call) {
        q.i(call, "call");
    }

    public void callEnd(Call call) {
        q.i(call, "call");
    }

    public void callFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
    }

    public void callStart(Call call) {
        q.i(call, "call");
    }

    public void canceled(Call call) {
        q.i(call, "call");
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
        q.i(iOException, "ioe");
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
    }

    public void connectionAcquired(Call call, Connection connection) {
        q.i(call, "call");
        q.i(connection, "connection");
    }

    public void connectionReleased(Call call, Connection connection) {
        q.i(call, "call");
        q.i(connection, "connection");
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        q.i(call, "call");
        q.i(str, "domainName");
        q.i(list, "inetAddressList");
    }

    public void dnsStart(Call call, String str) {
        q.i(call, "call");
        q.i(str, "domainName");
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        q.i(call, "call");
        q.i(httpUrl, ImagesContract.URL);
        q.i(list, "proxies");
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        q.i(call, "call");
        q.i(httpUrl, ImagesContract.URL);
    }

    public void requestBodyEnd(Call call, long j10) {
        q.i(call, "call");
    }

    public void requestBodyStart(Call call) {
        q.i(call, "call");
    }

    public void requestFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
    }

    public void requestHeadersEnd(Call call, Request request) {
        q.i(call, "call");
        q.i(request, "request");
    }

    public void requestHeadersStart(Call call) {
        q.i(call, "call");
    }

    public void responseBodyEnd(Call call, long j10) {
        q.i(call, "call");
    }

    public void responseBodyStart(Call call) {
        q.i(call, "call");
    }

    public void responseFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
    }

    public void responseHeadersEnd(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
    }

    public void responseHeadersStart(Call call) {
        q.i(call, "call");
    }

    public void satisfactionFailure(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
        q.i(call, "call");
    }

    public void secureConnectStart(Call call) {
        q.i(call, "call");
    }
}
