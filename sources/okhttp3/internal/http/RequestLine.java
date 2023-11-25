package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;
import qc.q;

/* compiled from: RequestLine.kt */
/* loaded from: classes4.dex */
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(Request request, Proxy.Type type) {
        if (!request.isHttps() && type == Proxy.Type.HTTP) {
            return true;
        }
        return false;
    }

    public final String get(Request request, Proxy.Type type) {
        q.i(request, "request");
        q.i(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.method());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, type)) {
            sb2.append(request.url());
        } else {
            sb2.append(requestLine.requestPath(request.url()));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String requestPath(HttpUrl httpUrl) {
        q.i(httpUrl, ImagesContract.URL);
        String encodedPath = httpUrl.encodedPath();
        String encodedQuery = httpUrl.encodedQuery();
        if (encodedQuery != null) {
            return encodedPath + '?' + ((Object) encodedQuery);
        }
        return encodedPath;
    }
}
