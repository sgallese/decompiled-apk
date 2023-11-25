package okhttp3.logging;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import qc.h;
import qc.q;

/* compiled from: LoggingEventListener.kt */
/* loaded from: classes4.dex */
public final class LoggingEventListener extends EventListener {
    private final HttpLoggingInterceptor.Logger logger;
    private long startNs;

    /* compiled from: LoggingEventListener.kt */
    /* loaded from: classes4.dex */
    public static class Factory implements EventListener.Factory {
        private final HttpLoggingInterceptor.Logger logger;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.logging.HttpLoggingInterceptor$Logger, qc.h] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Factory() {
            /*
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.LoggingEventListener.Factory.<init>():void");
        }

        @Override // okhttp3.EventListener.Factory
        public EventListener create(Call call) {
            q.i(call, "call");
            return new LoggingEventListener(this.logger, null);
        }

        public Factory(HttpLoggingInterceptor.Logger logger) {
            q.i(logger, "logger");
            this.logger = logger;
        }

        public /* synthetic */ Factory(HttpLoggingInterceptor.Logger logger, int i10, h hVar) {
            this((i10 & 1) != 0 ? HttpLoggingInterceptor.Logger.DEFAULT : logger);
        }
    }

    public /* synthetic */ LoggingEventListener(HttpLoggingInterceptor.Logger logger, h hVar) {
        this(logger);
    }

    private final void logWithTime(String str) {
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.startNs);
        this.logger.log('[' + millis + " ms] " + str);
    }

    @Override // okhttp3.EventListener
    public void cacheConditionalHit(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "cachedResponse");
        logWithTime(q.q("cacheConditionalHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheHit(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
        logWithTime(q.q("cacheHit: ", response));
    }

    @Override // okhttp3.EventListener
    public void cacheMiss(Call call) {
        q.i(call, "call");
        logWithTime("cacheMiss");
    }

    @Override // okhttp3.EventListener
    public void callEnd(Call call) {
        q.i(call, "call");
        logWithTime("callEnd");
    }

    @Override // okhttp3.EventListener
    public void callFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
        logWithTime(q.q("callFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void callStart(Call call) {
        q.i(call, "call");
        this.startNs = System.nanoTime();
        logWithTime(q.q("callStart: ", call.request()));
    }

    @Override // okhttp3.EventListener
    public void canceled(Call call) {
        q.i(call, "call");
        logWithTime("canceled");
    }

    @Override // okhttp3.EventListener
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
        logWithTime(q.q("connectEnd: ", protocol));
    }

    @Override // okhttp3.EventListener
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
        q.i(iOException, "ioe");
        logWithTime("connectFailed: " + protocol + ' ' + iOException);
    }

    @Override // okhttp3.EventListener
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        q.i(call, "call");
        q.i(inetSocketAddress, "inetSocketAddress");
        q.i(proxy, "proxy");
        logWithTime("connectStart: " + inetSocketAddress + ' ' + proxy);
    }

    @Override // okhttp3.EventListener
    public void connectionAcquired(Call call, Connection connection) {
        q.i(call, "call");
        q.i(connection, "connection");
        logWithTime(q.q("connectionAcquired: ", connection));
    }

    @Override // okhttp3.EventListener
    public void connectionReleased(Call call, Connection connection) {
        q.i(call, "call");
        q.i(connection, "connection");
        logWithTime("connectionReleased");
    }

    @Override // okhttp3.EventListener
    public void dnsEnd(Call call, String str, List<? extends InetAddress> list) {
        q.i(call, "call");
        q.i(str, "domainName");
        q.i(list, "inetAddressList");
        logWithTime(q.q("dnsEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void dnsStart(Call call, String str) {
        q.i(call, "call");
        q.i(str, "domainName");
        logWithTime(q.q("dnsStart: ", str));
    }

    @Override // okhttp3.EventListener
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<? extends Proxy> list) {
        q.i(call, "call");
        q.i(httpUrl, ImagesContract.URL);
        q.i(list, "proxies");
        logWithTime(q.q("proxySelectEnd: ", list));
    }

    @Override // okhttp3.EventListener
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        q.i(call, "call");
        q.i(httpUrl, ImagesContract.URL);
        logWithTime(q.q("proxySelectStart: ", httpUrl));
    }

    @Override // okhttp3.EventListener
    public void requestBodyEnd(Call call, long j10) {
        q.i(call, "call");
        logWithTime(q.q("requestBodyEnd: byteCount=", Long.valueOf(j10)));
    }

    @Override // okhttp3.EventListener
    public void requestBodyStart(Call call) {
        q.i(call, "call");
        logWithTime("requestBodyStart");
    }

    @Override // okhttp3.EventListener
    public void requestFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
        logWithTime(q.q("requestFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void requestHeadersEnd(Call call, Request request) {
        q.i(call, "call");
        q.i(request, "request");
        logWithTime("requestHeadersEnd");
    }

    @Override // okhttp3.EventListener
    public void requestHeadersStart(Call call) {
        q.i(call, "call");
        logWithTime("requestHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void responseBodyEnd(Call call, long j10) {
        q.i(call, "call");
        logWithTime(q.q("responseBodyEnd: byteCount=", Long.valueOf(j10)));
    }

    @Override // okhttp3.EventListener
    public void responseBodyStart(Call call) {
        q.i(call, "call");
        logWithTime("responseBodyStart");
    }

    @Override // okhttp3.EventListener
    public void responseFailed(Call call, IOException iOException) {
        q.i(call, "call");
        q.i(iOException, "ioe");
        logWithTime(q.q("responseFailed: ", iOException));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersEnd(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
        logWithTime(q.q("responseHeadersEnd: ", response));
    }

    @Override // okhttp3.EventListener
    public void responseHeadersStart(Call call) {
        q.i(call, "call");
        logWithTime("responseHeadersStart");
    }

    @Override // okhttp3.EventListener
    public void satisfactionFailure(Call call, Response response) {
        q.i(call, "call");
        q.i(response, "response");
        logWithTime(q.q("satisfactionFailure: ", response));
    }

    @Override // okhttp3.EventListener
    public void secureConnectEnd(Call call, Handshake handshake) {
        q.i(call, "call");
        logWithTime(q.q("secureConnectEnd: ", handshake));
    }

    @Override // okhttp3.EventListener
    public void secureConnectStart(Call call) {
        q.i(call, "call");
        logWithTime("secureConnectStart");
    }

    private LoggingEventListener(HttpLoggingInterceptor.Logger logger) {
        this.logger = logger;
    }
}
