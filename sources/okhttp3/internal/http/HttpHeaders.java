package okhttp3.internal.http;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.c;
import okio.f;
import qc.q;
import yc.v;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes4.dex */
public final class HttpHeaders {
    private static final f QUOTED_STRING_DELIMITERS;
    private static final f TOKEN_DELIMITERS;

    static {
        f.a aVar = f.f20621q;
        QUOTED_STRING_DELIMITERS = aVar.d("\"\\");
        TOKEN_DELIMITERS = aVar.d("\t ,=");
    }

    public static final boolean hasBody(Response response) {
        q.i(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        boolean r10;
        q.i(headers, "<this>");
        q.i(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            r10 = v.r(str, headers.name(i10), true);
            if (r10) {
                try {
                    readChallengeHeader(new c().W(headers.value(i10)), arrayList);
                } catch (EOFException e10) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e10);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        boolean r10;
        q.i(response, "<this>");
        if (q.d(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1) {
            r10 = v.r("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
            if (!r10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void readChallengeHeader(okio.c r7, java.util.List<okhttp3.Challenge> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            skipCommasAndWhitespace(r7)
            java.lang.String r1 = readToken(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = skipCommasAndWhitespace(r7)
            java.lang.String r3 = readToken(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.C()
            if (r7 != 0) goto L1f
            return
        L1f:
            okhttp3.Challenge r7 = new okhttp3.Challenge
            java.util.Map r0 = ec.k0.h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r2 != 0) goto L5c
            if (r6 != 0) goto L40
            boolean r2 = r7.C()
            if (r2 == 0) goto L5c
        L40:
            okhttp3.Challenge r2 = new okhttp3.Challenge
            java.lang.String r4 = "="
            java.lang.String r4 = yc.m.x(r4, r5)
            java.lang.String r3 = qc.q.q(r3, r4)
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            qc.q.h(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L5c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = okhttp3.internal.Util.skipAll(r7, r4)
            int r5 = r5 + r6
        L66:
            if (r3 != 0) goto L77
            java.lang.String r3 = readToken(r7)
            boolean r5 = skipCommasAndWhitespace(r7)
            if (r5 == 0) goto L73
            goto L79
        L73:
            int r5 = okhttp3.internal.Util.skipAll(r7, r4)
        L77:
            if (r5 != 0) goto L84
        L79:
            okhttp3.Challenge r4 = new okhttp3.Challenge
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L84:
            r6 = 1
            if (r5 <= r6) goto L88
            return
        L88:
            boolean r6 = skipCommasAndWhitespace(r7)
            if (r6 == 0) goto L8f
            return
        L8f:
            r6 = 34
            boolean r6 = startsWith(r7, r6)
            if (r6 == 0) goto L9c
            java.lang.String r6 = readQuotedString(r7)
            goto La0
        L9c:
            java.lang.String r6 = readToken(r7)
        La0:
            if (r6 != 0) goto La3
            return
        La3:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lac
            return
        Lac:
            boolean r3 = skipCommasAndWhitespace(r7)
            if (r3 != 0) goto Lb9
            boolean r3 = r7.C()
            if (r3 != 0) goto Lb9
            return
        Lb9:
            r3 = r0
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(okio.c, java.util.List):void");
    }

    private static final String readQuotedString(c cVar) throws EOFException {
        boolean z10;
        if (cVar.readByte() == 34) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c cVar2 = new c();
            while (true) {
                long R = cVar.R(QUOTED_STRING_DELIMITERS);
                if (R == -1) {
                    return null;
                }
                if (cVar.B(R) == 34) {
                    cVar2.write(cVar, R);
                    cVar.readByte();
                    return cVar2.l0();
                } else if (cVar.s0() == R + 1) {
                    return null;
                } else {
                    cVar2.write(cVar, R);
                    cVar.readByte();
                    cVar2.write(cVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(c cVar) {
        long R = cVar.R(TOKEN_DELIMITERS);
        if (R == -1) {
            R = cVar.s0();
        }
        if (R != 0) {
            return cVar.h(R);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        q.i(cookieJar, "<this>");
        q.i(httpUrl, ImagesContract.URL);
        q.i(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(c cVar) {
        boolean z10 = false;
        while (!cVar.C()) {
            byte B = cVar.B(0L);
            boolean z11 = true;
            if (B == 44) {
                cVar.readByte();
                z10 = true;
            } else {
                if (B != 32 && B != 9) {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
                cVar.readByte();
            }
        }
        return z10;
    }

    private static final boolean startsWith(c cVar, byte b10) {
        if (!cVar.C() && cVar.B(0L) == b10) {
            return true;
        }
        return false;
    }
}
