package lb;

import android.net.Uri;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.noties.markwon.image.j;
import io.noties.markwon.image.r;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: NetworkSchemeHandler.java */
/* loaded from: classes4.dex */
public class a extends r {
    a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(59);
        if (indexOf > -1) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static a d() {
        return new a();
    }

    @Override // io.noties.markwon.image.r
    public j a(String str, Uri uri) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 300) {
                return j.d(c(httpURLConnection.getHeaderField("Content-Type")), new BufferedInputStream(httpURLConnection.getInputStream()));
            }
            throw new IOException("Bad response code: " + responseCode + ", url: " + str);
        } catch (IOException e10) {
            throw new IllegalStateException("Exception obtaining network resource: " + str, e10);
        }
    }

    @Override // io.noties.markwon.image.r
    public Collection<String> b() {
        return Arrays.asList("http", "https");
    }
}
