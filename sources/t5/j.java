package t5;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final p5.b f23691a;

    /* compiled from: HttpClient.kt */
    /* loaded from: classes.dex */
    public static final class a extends c {

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ HttpURLConnection f23693v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ OutputStream f23694w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HttpURLConnection httpURLConnection, OutputStream outputStream) {
            super(httpURLConnection, null, outputStream);
            this.f23693v = httpURLConnection;
            this.f23694w = outputStream;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r2 == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            r2.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        
            if (r2 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
        
            return;
         */
        /* JADX WARN: Not initialized variable reg: 2, insn: 0x0088: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:137), block:B:36:0x0088 */
        /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {all -> 0x0090, blocks: (B:2:0x0000, B:6:0x001f, B:18:0x005e, B:39:0x008c, B:40:0x008f, B:5:0x001c), top: B:48:0x0000 }] */
        @Override // t5.c, java.io.Closeable, java.lang.AutoCloseable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void close() throws java.io.IOException {
            /*
                r6 = this;
                t5.j r0 = t5.j.this     // Catch: java.lang.Throwable -> L90
                java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L90
                r6.j(r0)     // Catch: java.lang.Throwable -> L90
                t5.j r0 = t5.j.this     // Catch: java.lang.Throwable -> L90
                java.lang.Integer r0 = r0.e()     // Catch: java.lang.Throwable -> L90
                r6.x(r0)     // Catch: java.lang.Throwable -> L90
                r6.m()     // Catch: java.lang.Throwable -> L90
                java.io.OutputStream r0 = r6.d()     // Catch: java.lang.Throwable -> L90
                if (r0 != 0) goto L1c
                goto L1f
            L1c:
                r0.close()     // Catch: java.lang.Throwable -> L90
            L1f:
                java.net.HttpURLConnection r0 = r6.f23693v     // Catch: java.lang.Throwable -> L90
                int r0 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L90
                r1 = 0
                t5.j r2 = t5.j.this     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
                java.net.HttpURLConnection r3 = r6.c()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
                java.io.InputStream r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
                java.nio.charset.Charset r3 = yc.d.f26303b     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                r4.<init>(r2, r3)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                boolean r3 = r4 instanceof java.io.BufferedReader     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                if (r3 == 0) goto L3e
                java.io.BufferedReader r4 = (java.io.BufferedReader) r4     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                goto L46
            L3e:
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                r5 = 8192(0x2000, float:1.14794E-41)
                r3.<init>(r4, r5)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                r4 = r3
            L46:
                java.lang.String r3 = nc.h.c(r4)     // Catch: java.lang.Throwable -> L62
                nc.b.a(r4, r1)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                t5.k r4 = t5.k.f23695a     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                r5.<init>(r3)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                t5.q r0 = r4.a(r0, r5)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                r6.z(r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                if (r2 != 0) goto L5e
                goto L79
            L5e:
                r2.close()     // Catch: java.lang.Throwable -> L90
                goto L79
            L62:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r3 = move-exception
                nc.b.a(r4, r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
                throw r3     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L87
            L69:
                r0 = move-exception
                goto L89
            L6b:
                r2 = r1
            L6c:
                t5.k r0 = t5.k.f23695a     // Catch: java.lang.Throwable -> L87
                r3 = 408(0x198, float:5.72E-43)
                t5.q r0 = r0.a(r3, r1)     // Catch: java.lang.Throwable -> L87
                r6.z(r0)     // Catch: java.lang.Throwable -> L87
                if (r2 != 0) goto L5e
            L79:
                super.close()
                java.io.OutputStream r0 = r6.d()
                if (r0 != 0) goto L83
                goto L86
            L83:
                r0.close()
            L86:
                return
            L87:
                r0 = move-exception
                r1 = r2
            L89:
                if (r1 != 0) goto L8c
                goto L8f
            L8c:
                r1.close()     // Catch: java.lang.Throwable -> L90
            L8f:
                throw r0     // Catch: java.lang.Throwable -> L90
            L90:
                r0 = move-exception
                super.close()
                java.io.OutputStream r1 = r6.d()
                if (r1 != 0) goto L9b
                goto L9e
            L9b:
                r1.close()
            L9e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: t5.j.a.close():void");
        }
    }

    public j(p5.b bVar) {
        qc.q.i(bVar, "configuration");
        this.f23691a = bVar;
    }

    private final String a() {
        boolean z10;
        String l10 = this.f23691a.l();
        if (l10 != null && l10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            String l11 = this.f23691a.l();
            qc.q.f(l11);
            return l11;
        } else if (this.f23691a.m() == p5.d.EU) {
            if (this.f23691a.o()) {
                return "https://api.eu.amplitude.com/batch";
            }
            return "https://api.eu.amplitude.com/2/httpapi";
        } else if (this.f23691a.o()) {
            return "https://api2.amplitude.com/batch";
        } else {
            return "https://api2.amplitude.com/2/httpapi";
        }
    }

    private final HttpURLConnection c(String str) {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpURLConnection.setRequestProperty("Accept", "application/json");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(201000);
                return httpURLConnection;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (MalformedURLException e10) {
            throw new IOException(qc.q.q("Attempted to use malformed url: ", str), e10);
        }
    }

    public final String b() {
        return this.f23691a.a();
    }

    public final InputStream d(HttpURLConnection httpURLConnection) {
        qc.q.i(httpURLConnection, "connection");
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            qc.q.h(inputStream, "{\n            connection.inputStream\n        }");
            return inputStream;
        } catch (IOException unused) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            qc.q.h(errorStream, "{\n            connection.errorStream\n        }");
            return errorStream;
        }
    }

    public final Integer e() {
        return this.f23691a.h();
    }

    public final c f() {
        HttpURLConnection c10 = c(a());
        OutputStream outputStream = c10.getOutputStream();
        qc.q.h(outputStream, "connection.outputStream");
        return new a(c10, outputStream);
    }
}
