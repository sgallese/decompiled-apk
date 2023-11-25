package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import dc.l;
import ec.n0;
import ec.t;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import qc.q;
import yc.v;

/* compiled from: Request.kt */
/* loaded from: classes4.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* compiled from: Request.kt */
    /* loaded from: classes4.dex */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        public Builder addHeader(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            boolean z10;
            q.i(cacheControl, "cacheControl");
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            q.i(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            q.i(headers, "headers");
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            boolean z10;
            q.i(str, "method");
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (requestBody == null) {
                    if (!(true ^ HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
                }
                setMethod$okhttp(str);
                setBody$okhttp(requestBody);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public Builder patch(RequestBody requestBody) {
            q.i(requestBody, "body");
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            q.i(requestBody, "body");
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            q.i(requestBody, "body");
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            q.i(builder, "<set-?>");
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            q.i(str, "<set-?>");
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            q.i(map, "<set-?>");
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            q.i(httpUrl, ImagesContract.URL);
            setUrl$okhttp(httpUrl);
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> cls, T t10) {
            q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
            if (t10 == null) {
                getTags$okhttp().remove(cls);
            } else {
                if (getTags$okhttp().isEmpty()) {
                    setTags$okhttp(new LinkedHashMap());
                }
                Map<Class<?>, Object> tags$okhttp = getTags$okhttp();
                T cast = cls.cast(t10);
                q.f(cast);
                tags$okhttp.put(cls, cast);
            }
            return this;
        }

        public Builder url(String str) {
            boolean D;
            boolean D2;
            q.i(str, ImagesContract.URL);
            D = v.D(str, "ws:", true);
            if (!D) {
                D2 = v.D(str, "wss:", true);
                if (D2) {
                    String substring = str.substring(4);
                    q.h(substring, "this as java.lang.String).substring(startIndex)");
                    str = q.q("https:", substring);
                }
            } else {
                String substring2 = str.substring(3);
                q.h(substring2, "this as java.lang.String).substring(startIndex)");
                str = q.q("http:", substring2);
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            Map<Class<?>, Object> t10;
            q.i(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (!request.getTags$okhttp().isEmpty()) {
                t10 = n0.t(request.getTags$okhttp());
            } else {
                t10 = new LinkedHashMap<>();
            }
            this.tags = t10;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            q.i(url, ImagesContract.URL);
            HttpUrl.Companion companion = HttpUrl.Companion;
            String url2 = url.toString();
            q.h(url2, "url.toString()");
            return url(companion.get(url2));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        q.i(httpUrl, ImagesContract.URL);
        q.i(str, "method");
        q.i(headers, "headers");
        q.i(map, "tags");
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    /* renamed from: -deprecated_body  reason: not valid java name */
    public final RequestBody m344deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl  reason: not valid java name */
    public final CacheControl m345deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers  reason: not valid java name */
    public final Headers m346deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method  reason: not valid java name */
    public final String m347deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final HttpUrl m348deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(method());
        sb2.append(", url=");
        sb2.append(url());
        if (headers().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (l<? extends String, ? extends String> lVar : headers()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    t.r();
                }
                l<? extends String, ? extends String> lVar2 = lVar;
                String a10 = lVar2.a();
                String b10 = lVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                sb2.append(':');
                sb2.append(b10);
                i10 = i11;
            }
            sb2.append(']');
        }
        if ((!getTags$okhttp().isEmpty()) != false) {
            sb2.append(", tags=");
            sb2.append(getTags$okhttp());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        q.i(cls, TaskFormActivity.TASK_TYPE_KEY);
        return cls.cast(this.tags.get(cls));
    }
}
