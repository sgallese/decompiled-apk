package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import ec.t;
import ec.u0;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import nc.b;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Source;
import okio.c;
import okio.d;
import okio.e;
import okio.f;
import okio.l;
import okio.l0;
import okio.m;
import okio.y0;
import qc.h;
import qc.j0;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: Cache.kt */
/* loaded from: classes4.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Cache.kt */
    /* loaded from: classes4.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final e bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            q.i(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = l0.d(new m(this) { // from class: okhttp3.Cache.CacheResponseBody.1
                final /* synthetic */ CacheResponseBody this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(Source.this);
                    this.this$0 = this;
                }

                @Override // okio.m, okio.Source, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public e source() {
            return this.bodySource;
        }
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes4.dex */
    private final class RealCacheRequest implements CacheRequest {
        private final y0 body;
        private final y0 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(final Cache cache, DiskLruCache.Editor editor) {
            q.i(cache, "this$0");
            q.i(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            y0 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new l(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.l, okio.y0, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (getDone()) {
                    return;
                }
                setDone(true);
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public y0 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z10) {
            this.done = z10;
        }
    }

    public Cache(File file, long j10, FileSystem fileSystem) {
        q.i(file, "directory");
        q.i(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j10, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory  reason: not valid java name */
    public final File m243deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        q.i(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        q.i(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        } else if (!q.d(method, "GET")) {
            return null;
        } else {
            Companion companion = Companion;
            if (companion.hasVaryAll(response)) {
                return null;
            }
            Entry entry = new Entry(response);
            try {
                editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
                if (editor == null) {
                    return null;
                }
                try {
                    entry.writeTo(editor);
                    return new RealCacheRequest(this, editor);
                } catch (IOException unused2) {
                    abortQuietly(editor);
                    return null;
                }
            } catch (IOException unused3) {
                editor = null;
            }
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        q.i(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i10) {
        this.writeAbortCount = i10;
    }

    public final void setWriteSuccessCount$okhttp(int i10) {
        this.writeSuccessCount = i10;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        q.i(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editor;
        q.i(response, "cached");
        q.i(response2, "network");
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                editor = ((CacheResponseBody) body).getSnapshot().edit();
                if (editor == null) {
                    return;
                }
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            } catch (IOException unused2) {
                editor = null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            Set<String> b10;
            boolean r10;
            List w02;
            CharSequence T0;
            Comparator t10;
            int size = headers.size();
            TreeSet treeSet = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                r10 = v.r("Vary", headers.name(i10), true);
                if (r10) {
                    String value = headers.value(i10);
                    if (treeSet == null) {
                        t10 = v.t(j0.f21683a);
                        treeSet = new TreeSet(t10);
                    }
                    w02 = w.w0(value, new char[]{','}, false, 0, 6, null);
                    Iterator it = w02.iterator();
                    while (it.hasNext()) {
                        T0 = w.T0((String) it.next());
                        treeSet.add(T0.toString());
                    }
                }
                i10 = i11;
            }
            if (treeSet == null) {
                b10 = u0.b();
                return b10;
            }
            return treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            q.i(response, "<this>");
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            q.i(httpUrl, ImagesContract.URL);
            return f.f20621q.d(httpUrl.toString()).w().n();
        }

        public final int readInt$okhttp(e eVar) throws IOException {
            boolean z10;
            q.i(eVar, "source");
            try {
                long K = eVar.K();
                String t02 = eVar.t0();
                if (K >= 0 && K <= 2147483647L) {
                    if (t02.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        return (int) K;
                    }
                }
                throw new IOException("expected an int but was \"" + K + t02 + '\"');
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            q.i(response, "<this>");
            Response networkResponse = response.networkResponse();
            q.f(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            q.i(response, "cachedResponse");
            q.i(headers, "cachedRequest");
            q.i(request, "newRequest");
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if ((!q.d(headers.values(str), request.headers(str))) != false) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                String name = headers.name(i10);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i10));
                }
                i10 = i11;
            }
            return builder.build();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(File file, long j10) {
        this(file, j10, FileSystem.SYSTEM);
        q.i(file, "directory");
    }

    /* compiled from: Cache.kt */
    /* loaded from: classes4.dex */
    private static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* compiled from: Cache.kt */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = q.q(companion.get().getPrefix(), "-Sent-Millis");
            RECEIVED_MILLIS = q.q(companion.get().getPrefix(), "-Received-Millis");
        }

        public Entry(Source source) throws IOException {
            TlsVersion tlsVersion;
            q.i(source, "rawSource");
            try {
                e d10 = l0.d(source);
                String t02 = d10.t0();
                HttpUrl parse = HttpUrl.Companion.parse(t02);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = d10.t0();
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(d10);
                    int i10 = 0;
                    while (i10 < readInt$okhttp) {
                        i10++;
                        builder.addLenient$okhttp(d10.t0());
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(d10.t0());
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(d10);
                    int i11 = 0;
                    while (i11 < readInt$okhttp2) {
                        i11++;
                        builder2.addLenient$okhttp(d10.t0());
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    long j10 = 0;
                    this.sentRequestMillis = str2 == null ? 0L : Long.parseLong(str2);
                    if (str4 != null) {
                        j10 = Long.parseLong(str4);
                    }
                    this.receivedResponseMillis = j10;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String t03 = d10.t0();
                        if (!(t03.length() > 0)) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(d10.t0());
                            List<Certificate> readCertificateList = readCertificateList(d10);
                            List<Certificate> readCertificateList2 = readCertificateList(d10);
                            if (!d10.C()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(d10.t0());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + t03 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    dc.w wVar = dc.w.f13270a;
                    b.a(source, null);
                    return;
                }
                IOException iOException = new IOException(q.q("Cache corruption for ", t02));
                Platform.Companion.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    b.a(source, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return q.d(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(e eVar) throws IOException {
            List<Certificate> i10;
            int readInt$okhttp = Cache.Companion.readInt$okhttp(eVar);
            if (readInt$okhttp == -1) {
                i10 = t.i();
                return i10;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i11 = 0;
                while (i11 < readInt$okhttp) {
                    i11++;
                    String t02 = eVar.t0();
                    c cVar = new c();
                    f a10 = f.f20621q.a(t02);
                    q.f(a10);
                    cVar.B0(a10);
                    arrayList.add(certificateFactory.generateCertificate(cVar.U0()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void writeCertList(d dVar, List<? extends Certificate> list) throws IOException {
            try {
                dVar.P0(list.size()).D(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] encoded = it.next().getEncoded();
                    f.a aVar = f.f20621q;
                    q.h(encoded, "bytes");
                    dVar.W(f.a.f(aVar, encoded, 0, 0, 3, null).b()).D(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            q.i(request, "request");
            q.i(response, "response");
            if (q.d(this.url, request.url()) && q.d(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            q.i(snapshot, "snapshot");
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            q.i(editor, "editor");
            d c10 = l0.c(editor.newSink(0));
            try {
                c10.W(this.url.toString()).D(10);
                c10.W(this.requestMethod).D(10);
                c10.P0(this.varyHeaders.size()).D(10);
                int size = this.varyHeaders.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    c10.W(this.varyHeaders.name(i10)).W(": ").W(this.varyHeaders.value(i10)).D(10);
                    i10 = i11;
                }
                c10.W(new StatusLine(this.protocol, this.code, this.message).toString()).D(10);
                c10.P0(this.responseHeaders.size() + 2).D(10);
                int size2 = this.responseHeaders.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    c10.W(this.responseHeaders.name(i12)).W(": ").W(this.responseHeaders.value(i12)).D(10);
                }
                c10.W(SENT_MILLIS).W(": ").P0(this.sentRequestMillis).D(10);
                c10.W(RECEIVED_MILLIS).W(": ").P0(this.receivedResponseMillis).D(10);
                if (isHttps()) {
                    c10.D(10);
                    Handshake handshake = this.handshake;
                    q.f(handshake);
                    c10.W(handshake.cipherSuite().javaName()).D(10);
                    writeCertList(c10, this.handshake.peerCertificates());
                    writeCertList(c10, this.handshake.localCertificates());
                    c10.W(this.handshake.tlsVersion().javaName()).D(10);
                }
                dc.w wVar = dc.w.f13270a;
                b.a(c10, null);
            } finally {
            }
        }

        public Entry(Response response) {
            q.i(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
