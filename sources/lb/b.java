package lb;

import android.net.Uri;
import io.noties.markwon.image.j;
import io.noties.markwon.image.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: OkHttpNetworkSchemeHandler.java */
/* loaded from: classes4.dex */
public class b extends r {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f19646a;

    b(Call.Factory factory) {
        this.f19646a = factory;
    }

    public static b c() {
        return e(new OkHttpClient());
    }

    public static b d(Call.Factory factory) {
        return new b(factory);
    }

    public static b e(OkHttpClient okHttpClient) {
        return d(okHttpClient);
    }

    @Override // io.noties.markwon.image.r
    public j a(String str, Uri uri) {
        InputStream inputStream;
        try {
            Response execute = this.f19646a.newCall(new Request.Builder().url(str).tag(str).build()).execute();
            if (execute != null) {
                ResponseBody body = execute.body();
                if (body != null) {
                    inputStream = body.byteStream();
                } else {
                    inputStream = null;
                }
                if (inputStream != null) {
                    return j.d(a.c(execute.header("Content-Type")), inputStream);
                }
                throw new IllegalStateException("Response does not contain body: " + str);
            }
            throw new IllegalStateException("Could not obtain network response: " + str);
        } catch (Throwable th) {
            throw new IllegalStateException("Exception obtaining network resource: " + str, th);
        }
    }

    @Override // io.noties.markwon.image.r
    public Collection<String> b() {
        return Arrays.asList("http", "https");
    }
}
