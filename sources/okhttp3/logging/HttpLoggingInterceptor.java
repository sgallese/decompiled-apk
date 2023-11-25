package okhttp3.logging;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.u0;
import ec.y;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import nc.b;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.c;
import okio.e;
import okio.o;
import qc.h;
import qc.j0;
import qc.q;
import yc.v;

/* compiled from: HttpLoggingInterceptor.kt */
/* loaded from: classes4.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;
    private volatile Level level;
    private final Logger logger;

    /* compiled from: HttpLoggingInterceptor.kt */
    /* loaded from: classes4.dex */
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    /* loaded from: classes4.dex */
    public interface Logger {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        /* compiled from: HttpLoggingInterceptor.kt */
        /* loaded from: classes4.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            /* compiled from: HttpLoggingInterceptor.kt */
            /* loaded from: classes4.dex */
            private static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String str) {
                    q.i(str, "message");
                    Platform.log$default(Platform.Companion.get(), str, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.logging.HttpLoggingInterceptor$Logger, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HttpLoggingInterceptor() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            r2.<init>(r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.<init>():void");
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        boolean r10;
        boolean r11;
        String str = headers.get("Content-Encoding");
        if (str != null) {
            r10 = v.r(str, "identity", true);
            if (!r10) {
                r11 = v.r(str, "gzip", true);
                if (r11) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private final void logHeader(Headers headers, int i10) {
        String value;
        if (this.headersToRedact.contains(headers.name(i10))) {
            value = "██";
        } else {
            value = headers.value(i10);
        }
        this.logger.log(headers.name(i10) + ": " + value);
    }

    /* renamed from: -deprecated_level  reason: not valid java name */
    public final Level m368deprecated_level() {
        return this.level;
    }

    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        String str3;
        char c10;
        String sb2;
        String str4;
        boolean r10;
        Charset charset;
        Long l10;
        Charset charset2;
        Charset charset3;
        q.i(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        if (level == Level.BODY) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && level != Level.HEADERS) {
            z11 = false;
        } else {
            z11 = true;
        }
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--> ");
        sb3.append(request.method());
        sb3.append(' ');
        sb3.append(request.url());
        if (connection == null) {
            str = "";
        } else {
            str = q.q(" ", connection.protocol());
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        if (!z11 && body != 0) {
            sb4 = sb4 + " (" + body.contentLength() + "-byte body)";
        }
        this.logger.log(sb4);
        if (z11) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.contentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log(q.q("Content-Type: ", contentType));
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    this.logger.log(q.q("Content-Length: ", Long.valueOf(body.contentLength())));
                }
            }
            int size = headers.size();
            for (int i10 = 0; i10 < size; i10++) {
                logHeader(headers, i10);
            }
            if (z10 && body != null) {
                if (bodyHasUnknownEncoding(request.headers())) {
                    this.logger.log("--> END " + request.method() + " (encoded body omitted)");
                } else if (body.isDuplex()) {
                    this.logger.log("--> END " + request.method() + " (duplex request body omitted)");
                } else if (body.isOneShot()) {
                    this.logger.log("--> END " + request.method() + " (one-shot body omitted)");
                } else {
                    c cVar = new c();
                    body.writeTo(cVar);
                    MediaType contentType2 = body.contentType();
                    if (contentType2 == null) {
                        charset3 = null;
                    } else {
                        charset3 = contentType2.charset(StandardCharsets.UTF_8);
                    }
                    if (charset3 == null) {
                        charset3 = StandardCharsets.UTF_8;
                        q.h(charset3, "UTF_8");
                    }
                    this.logger.log("");
                    if (Utf8Kt.isProbablyUtf8(cVar)) {
                        this.logger.log(cVar.b0(charset3));
                        this.logger.log("--> END " + request.method() + " (" + body.contentLength() + "-byte body)");
                    } else {
                        this.logger.log("--> END " + request.method() + " (binary " + body.contentLength() + "-byte body omitted)");
                    }
                }
            } else {
                this.logger.log(q.q("--> END ", request.method()));
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            q.f(body2);
            long contentLength = body2.contentLength();
            if (contentLength != -1) {
                str2 = contentLength + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger = this.logger;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("<-- ");
            sb5.append(proceed.code());
            if (proceed.message().length() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                str3 = "-byte body omitted)";
                sb2 = "";
                c10 = ' ';
            } else {
                String message = proceed.message();
                StringBuilder sb6 = new StringBuilder();
                str3 = "-byte body omitted)";
                c10 = ' ';
                sb6.append(' ');
                sb6.append(message);
                sb2 = sb6.toString();
            }
            sb5.append(sb2);
            sb5.append(c10);
            sb5.append(proceed.request().url());
            sb5.append(" (");
            sb5.append(millis);
            sb5.append("ms");
            if (z11) {
                str4 = "";
            } else {
                str4 = ", " + str2 + " body";
            }
            sb5.append(str4);
            sb5.append(')');
            logger.log(sb5.toString());
            if (z11) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    logHeader(headers2, i11);
                }
                if (z10 && HttpHeaders.promisesBody(proceed)) {
                    if (bodyHasUnknownEncoding(proceed.headers())) {
                        this.logger.log("<-- END HTTP (encoded body omitted)");
                    } else {
                        e source = body2.source();
                        source.m0(Long.MAX_VALUE);
                        c a10 = source.a();
                        r10 = v.r("gzip", headers2.get("Content-Encoding"), true);
                        if (r10) {
                            l10 = Long.valueOf(a10.s0());
                            o oVar = new o(a10.clone());
                            try {
                                a10 = new c();
                                a10.g0(oVar);
                                charset = null;
                                b.a(oVar, null);
                            } finally {
                            }
                        } else {
                            charset = null;
                            l10 = null;
                        }
                        MediaType contentType3 = body2.contentType();
                        if (contentType3 == null) {
                            charset2 = charset;
                        } else {
                            charset2 = contentType3.charset(StandardCharsets.UTF_8);
                        }
                        if (charset2 == null) {
                            charset2 = StandardCharsets.UTF_8;
                            q.h(charset2, "UTF_8");
                        }
                        if (!Utf8Kt.isProbablyUtf8(a10)) {
                            this.logger.log("");
                            this.logger.log("<-- END HTTP (binary " + a10.s0() + str3);
                            return proceed;
                        }
                        if (contentLength != 0) {
                            this.logger.log("");
                            this.logger.log(a10.clone().b0(charset2));
                        }
                        if (l10 != null) {
                            this.logger.log("<-- END HTTP (" + a10.s0() + "-byte, " + l10 + "-gzipped-byte body)");
                        } else {
                            this.logger.log("<-- END HTTP (" + a10.s0() + "-byte body)");
                        }
                    }
                } else {
                    this.logger.log("<-- END HTTP");
                }
            }
            return proceed;
        } catch (Exception e10) {
            this.logger.log(q.q("<-- HTTP FAILED: ", e10));
            throw e10;
        }
    }

    public final void level(Level level) {
        q.i(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(String str) {
        Comparator t10;
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        t10 = v.t(j0.f21683a);
        TreeSet treeSet = new TreeSet(t10);
        y.w(treeSet, this.headersToRedact);
        treeSet.add(str);
        this.headersToRedact = treeSet;
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        q.i(level, "level");
        level(level);
        return this;
    }

    public HttpLoggingInterceptor(Logger logger) {
        Set<String> b10;
        q.i(logger, "logger");
        this.logger = logger;
        b10 = u0.b();
        this.headersToRedact = b10;
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i10, h hVar) {
        this((i10 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
