package t5;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;

/* compiled from: HttpClient.kt */
/* loaded from: classes.dex */
public abstract class c implements Closeable {

    /* renamed from: f  reason: collision with root package name */
    private final HttpURLConnection f23638f;

    /* renamed from: m  reason: collision with root package name */
    private final InputStream f23639m;

    /* renamed from: p  reason: collision with root package name */
    private final OutputStream f23640p;

    /* renamed from: q  reason: collision with root package name */
    private String f23641q;

    /* renamed from: r  reason: collision with root package name */
    private String f23642r;

    /* renamed from: s  reason: collision with root package name */
    private Integer f23643s;

    /* renamed from: t  reason: collision with root package name */
    public q f23644t;

    public c(HttpURLConnection httpURLConnection, InputStream inputStream, OutputStream outputStream) {
        qc.q.i(httpURLConnection, "connection");
        this.f23638f = httpURLConnection;
        this.f23639m = inputStream;
        this.f23640p = outputStream;
    }

    private final String b() {
        String str = null;
        if (this.f23643s == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"api_key\":\"");
            String str2 = this.f23641q;
            if (str2 == null) {
                qc.q.z("apiKey");
                str2 = null;
            }
            sb2.append(str2);
            sb2.append("\",\"events\":");
            String str3 = this.f23642r;
            if (str3 == null) {
                qc.q.z("events");
            } else {
                str = str3;
            }
            sb2.append(str);
            sb2.append('}');
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{\"api_key\":\"");
        String str4 = this.f23641q;
        if (str4 == null) {
            qc.q.z("apiKey");
            str4 = null;
        }
        sb3.append(str4);
        sb3.append("\",\"events\":");
        String str5 = this.f23642r;
        if (str5 == null) {
            qc.q.z("events");
        } else {
            str = str5;
        }
        sb3.append(str);
        sb3.append(",\"options\":{\"min_id_length\":");
        sb3.append(this.f23643s);
        sb3.append("}}");
        return sb3.toString();
    }

    public final HttpURLConnection c() {
        return this.f23638f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23638f.disconnect();
    }

    public final OutputStream d() {
        return this.f23640p;
    }

    public final q e() {
        q qVar = this.f23644t;
        if (qVar != null) {
            return qVar;
        }
        qc.q.z("response");
        return null;
    }

    public final void j(String str) {
        qc.q.i(str, "apiKey");
        this.f23641q = str;
    }

    public final void m() {
        if (this.f23640p != null) {
            String b10 = b();
            Charset charset = yc.d.f26303b;
            if (b10 != null) {
                byte[] bytes = b10.getBytes(charset);
                qc.q.h(bytes, "(this as java.lang.String).getBytes(charset)");
                d().write(bytes, 0, bytes.length);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final void q(String str) {
        qc.q.i(str, "events");
        this.f23642r = str;
    }

    public final void x(Integer num) {
        this.f23643s = num;
    }

    public final void z(q qVar) {
        qc.q.i(qVar, "<set-?>");
        this.f23644t = qVar;
    }
}
