package okhttp3.internal.http;

import qc.q;

/* compiled from: HttpMethod.kt */
/* loaded from: classes4.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        q.i(str, "method");
        if (!q.d(str, "GET") && !q.d(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String str) {
        q.i(str, "method");
        if (!q.d(str, "POST") && !q.d(str, "PUT") && !q.d(str, "PATCH") && !q.d(str, "PROPPATCH") && !q.d(str, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(String str) {
        q.i(str, "method");
        if (!q.d(str, "POST") && !q.d(str, "PATCH") && !q.d(str, "PUT") && !q.d(str, "DELETE") && !q.d(str, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String str) {
        q.i(str, "method");
        return !q.d(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        q.i(str, "method");
        return q.d(str, "PROPFIND");
    }
}
