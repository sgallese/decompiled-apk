package okhttp3;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ec.r;
import ec.s0;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kc.c;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import qc.h;
import qc.q;
import vc.d;
import yc.j;
import yc.v;
import yc.w;
import yc.y;

/* compiled from: HttpUrl.kt */
/* loaded from: classes4.dex */
public final class HttpUrl {
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;
    public static final Companion Companion = new Companion(null);
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String host;
        private String scheme;
        private String encodedUsername = "";
        private String encodedPassword = "";
        private int port = -1;

        /* compiled from: HttpUrl.kt */
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(h hVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int parsePort(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, "", false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z10 = true;
                    }
                    if (!z10) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int portColonOffset(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i10;
                        }
                        i10++;
                    }
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                        i10++;
                    } while (str.charAt(i10) != ']');
                    i10++;
                }
                return i11;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i10, int i11) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                boolean z14;
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((q.k(charAt, 97) < 0 || q.k(charAt, 122) > 0) && (q.k(charAt, 65) < 0 || q.k(charAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char charAt2 = str.charAt(i12);
                    boolean z15 = false;
                    if ('a' <= charAt2 && charAt2 < '{') {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 || ('A' <= charAt2 && charAt2 < '[')) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || ('0' <= charAt2 && charAt2 < ':')) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12 || charAt2 == '+') {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 || charAt2 == '-') {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14 || charAt2 == '.') {
                        z15 = true;
                    }
                    if (z15) {
                        i12 = i13;
                    } else if (charAt2 != ':') {
                        return -1;
                    } else {
                        return i12;
                    }
                }
                return -1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int slashCount(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add("");
        }

        private final int effectivePort() {
            int i10 = this.port;
            if (i10 == -1) {
                Companion companion = HttpUrl.Companion;
                String str = this.scheme;
                q.f(str);
                return companion.defaultPort(str);
            }
            return i10;
        }

        private final boolean isDot(String str) {
            boolean r10;
            if (!q.d(str, ".")) {
                r10 = v.r(str, "%2e", true);
                if (r10) {
                    return true;
                }
                return false;
            }
            return true;
        }

        private final boolean isDotDot(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            if (!q.d(str, "..")) {
                r10 = v.r(str, "%2e.", true);
                if (!r10) {
                    r11 = v.r(str, ".%2e", true);
                    if (!r11) {
                        r12 = v.r(str, "%2e%2e", true);
                        if (r12) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }

        private final void pop() {
            boolean z10;
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && (!this.encodedPathSegments.isEmpty()) != false) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, "");
                return;
            }
            this.encodedPathSegments.add("");
        }

        private final void push(String str, int i10, int i11, boolean z10, boolean z11) {
            boolean z12;
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i10, i11, HttpUrl.PATH_SEGMENT_ENCODE_SET, z11, false, false, false, null, 240, null);
            if (isDot(canonicalize$okhttp$default)) {
                return;
            }
            if (isDotDot(canonicalize$okhttp$default)) {
                pop();
                return;
            }
            List<String> list = this.encodedPathSegments;
            if (list.get(list.size() - 1).length() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                List<String> list2 = this.encodedPathSegments;
                list2.set(list2.size() - 1, canonicalize$okhttp$default);
            } else {
                this.encodedPathSegments.add(canonicalize$okhttp$default);
            }
            if (z10) {
                this.encodedPathSegments.add("");
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            q.f(list);
            int size = list.size() - 2;
            int c10 = c.c(size, 0, -2);
            if (c10 > size) {
                return;
            }
            while (true) {
                int i10 = size - 2;
                List<String> list2 = this.encodedQueryNamesAndValues;
                q.f(list2);
                if (q.d(str, list2.get(size))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    q.f(list3);
                    list3.remove(size + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    q.f(list4);
                    list4.remove(size);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    q.f(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (size != c10) {
                    size = i10;
                } else {
                    return;
                }
            }
        }

        private final void resolvePath(String str, int i10, int i11) {
            boolean z10;
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt != '/' && charAt != '\\') {
                List<String> list = this.encodedPathSegments;
                list.set(list.size() - 1, "");
            } else {
                this.encodedPathSegments.clear();
                this.encodedPathSegments.add("");
                i10++;
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = Util.delimiterOffset(str, "/\\", i12, i11);
                    if (i10 < i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    push(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final Builder addEncodedPathSegment(String str) {
            q.i(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            q.i(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            String canonicalize$okhttp$default;
            q.i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            q.f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            q.f(encodedQueryNamesAndValues$okhttp2);
            if (str2 == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(canonicalize$okhttp$default);
            return this;
        }

        public final Builder addPathSegment(String str) {
            q.i(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            q.i(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            String canonicalize$okhttp$default;
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                setEncodedQueryNamesAndValues$okhttp(new ArrayList());
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            q.f(encodedQueryNamesAndValues$okhttp);
            Companion companion = HttpUrl.Companion;
            encodedQueryNamesAndValues$okhttp.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            List<String> encodedQueryNamesAndValues$okhttp2 = getEncodedQueryNamesAndValues$okhttp();
            q.f(encodedQueryNamesAndValues$okhttp2);
            if (str2 == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null);
            }
            encodedQueryNamesAndValues$okhttp2.add(canonicalize$okhttp$default);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String percentDecode$okhttp$default;
            String percentDecode$okhttp$default2;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default3 = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, null);
                String percentDecode$okhttp$default4 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(r.s(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, (String) it.next(), 0, 0, false, 7, null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 == null) {
                        arrayList = null;
                    } else {
                        List<String> list3 = list2;
                        arrayList = new ArrayList(r.s(list3, 10));
                        for (String str3 : list3) {
                            if (str3 == null) {
                                percentDecode$okhttp$default = null;
                            } else {
                                percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, null);
                            }
                            arrayList.add(percentDecode$okhttp$default);
                        }
                    }
                    String str4 = this.encodedFragment;
                    if (str4 == null) {
                        percentDecode$okhttp$default2 = null;
                    } else {
                        percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(str, percentDecode$okhttp$default3, percentDecode$okhttp$default4, str2, effectivePort, arrayList2, arrayList, percentDecode$okhttp$default2, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            String canonicalize$okhttp$default;
            if (str == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", true, false, false, true, null, 179, null);
            }
            setEncodedFragment$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final Builder encodedPassword(String str) {
            q.i(str, "encodedPassword");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder encodedPath(String str) {
            boolean F;
            q.i(str, "encodedPath");
            F = v.F(str, "/", false, 2, null);
            if (F) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(q.q("unexpected encodedPath: ", str).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder encodedUsername(String str) {
            q.i(str, "encodedUsername");
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null));
            return this;
        }

        public final Builder fragment(String str) {
            String canonicalize$okhttp$default;
            if (str == null) {
                canonicalize$okhttp$default = null;
            } else {
                canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, "", false, false, false, true, null, 187, null);
            }
            setEncodedFragment$okhttp(canonicalize$okhttp$default);
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            q.i(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, null));
            if (canonicalHost != null) {
                setHost$okhttp(canonicalHost);
                return this;
            }
            throw new IllegalArgumentException(q.q("unexpected host: ", str));
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            String Z0;
            int delimiterOffset;
            char c10;
            int i10;
            int i11;
            String str2;
            boolean z10;
            boolean z11;
            int i12;
            String str3;
            int i13;
            boolean z12;
            boolean C;
            boolean C2;
            String str4 = str;
            q.i(str4, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, null);
            Companion companion = Companion;
            int schemeDelimiterOffset = companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "this as java.lang.String…ing(startIndex, endIndex)";
            char c11 = 65535;
            if (schemeDelimiterOffset != -1) {
                C = v.C(str4, "https:", indexOfFirstNonAsciiWhitespace$default, true);
                if (!C) {
                    C2 = v.C(str4, "http:", indexOfFirstNonAsciiWhitespace$default, true);
                    if (C2) {
                        this.scheme = "http";
                        indexOfFirstNonAsciiWhitespace$default += 5;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = str4.substring(0, schemeDelimiterOffset);
                        q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                if (str.length() > 6) {
                    Z0 = y.Z0(str4, 6);
                    str4 = q.q(Z0, "...");
                }
                throw new IllegalArgumentException(q.q("Expected URL scheme 'http' or 'https' but no scheme was found for ", str4));
            }
            int slashCount = companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c12 = '?';
            char c13 = '#';
            if (slashCount < 2 && httpUrl != null && q.d(httpUrl.scheme(), this.scheme)) {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i10 = indexOfLastNonAsciiWhitespace$default;
            } else {
                int i14 = indexOfFirstNonAsciiWhitespace$default + slashCount;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i14, indexOfLastNonAsciiWhitespace$default);
                    if (delimiterOffset != indexOfLastNonAsciiWhitespace$default) {
                        c10 = str4.charAt(delimiterOffset);
                    } else {
                        c10 = 65535;
                    }
                    if (c10 == c11 || c10 == c13 || c10 == '/' || c10 == '\\' || c10 == c12) {
                        break;
                    } else if (c10 == '@') {
                        if (!z13) {
                            int delimiterOffset2 = Util.delimiterOffset(str4, ':', i14, delimiterOffset);
                            Companion companion2 = HttpUrl.Companion;
                            i12 = indexOfLastNonAsciiWhitespace$default;
                            String str6 = str5;
                            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion2, str, i14, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                canonicalize$okhttp$default = this.encodedUsername + "%40" + canonicalize$okhttp$default;
                            }
                            this.encodedUsername = canonicalize$okhttp$default;
                            if (delimiterOffset2 != delimiterOffset) {
                                this.encodedPassword = Companion.canonicalize$okhttp$default(companion2, str, delimiterOffset2 + 1, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z12 = true;
                            } else {
                                z12 = z13;
                            }
                            z13 = z12;
                            str3 = str6;
                            z14 = true;
                            i13 = delimiterOffset;
                        } else {
                            i12 = indexOfLastNonAsciiWhitespace$default;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.encodedPassword);
                            sb3.append("%40");
                            str3 = str5;
                            i13 = delimiterOffset;
                            sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i14, delimiterOffset, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.encodedPassword = sb3.toString();
                        }
                        i14 = i13 + 1;
                        str5 = str3;
                        indexOfLastNonAsciiWhitespace$default = i12;
                        c13 = '#';
                        c12 = '?';
                        c11 = 65535;
                    }
                }
                String str7 = str5;
                i10 = indexOfLastNonAsciiWhitespace$default;
                Companion companion3 = Companion;
                int portColonOffset = companion3.portColonOffset(str4, i14, delimiterOffset);
                int i15 = portColonOffset + 1;
                if (i15 < delimiterOffset) {
                    i11 = i14;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i14, portColonOffset, false, 4, null));
                    int parsePort = companion3.parsePort(str4, i15, delimiterOffset);
                    this.port = parsePort;
                    if (parsePort != -1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        str2 = str7;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i15, delimiterOffset);
                        q.h(substring2, str7);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i11 = i14;
                    str2 = str7;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i11, portColonOffset, false, 4, null));
                    String str8 = this.scheme;
                    q.f(str8);
                    this.port = companion4.defaultPort(str8);
                }
                if (this.host != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    indexOfFirstNonAsciiWhitespace$default = delimiterOffset;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i11, portColonOffset);
                    q.h(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            }
            int i16 = i10;
            int delimiterOffset3 = Util.delimiterOffset(str4, "?#", indexOfFirstNonAsciiWhitespace$default, i16);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i16 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, '#', delimiterOffset3, i16);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i16 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final Builder password(String str) {
            q.i(str, "password");
            setEncodedPassword$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final Builder port(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (z10) {
                setPort$okhttp(i10);
                return this;
            }
            throw new IllegalArgumentException(q.q("unexpected port: ", Integer.valueOf(i10)).toString());
        }

        public final Builder query(String str) {
            List<String> list = null;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                }
            }
            setEncodedQueryNamesAndValues$okhttp(list);
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String g10;
            String canonicalize$okhttp$default;
            String host$okhttp = getHost$okhttp();
            String str = null;
            if (host$okhttp == null) {
                g10 = null;
            } else {
                g10 = new j("[\"<>^`{|}]").g(host$okhttp, "");
            }
            setHost$okhttp(g10);
            int size = getEncodedPathSegments$okhttp().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                getEncodedPathSegments$okhttp().set(i11, Companion.canonicalize$okhttp$default(HttpUrl.Companion, getEncodedPathSegments$okhttp().get(i11), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> encodedQueryNamesAndValues$okhttp = getEncodedQueryNamesAndValues$okhttp();
            if (encodedQueryNamesAndValues$okhttp != null) {
                int size2 = encodedQueryNamesAndValues$okhttp.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str2 = encodedQueryNamesAndValues$okhttp.get(i10);
                    if (str2 == null) {
                        canonicalize$okhttp$default = null;
                    } else {
                        canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null);
                    }
                    encodedQueryNamesAndValues$okhttp.set(i10, canonicalize$okhttp$default);
                    i10 = i12;
                }
            }
            String encodedFragment$okhttp = getEncodedFragment$okhttp();
            if (encodedFragment$okhttp != null) {
                str = Companion.canonicalize$okhttp$default(HttpUrl.Companion, encodedFragment$okhttp, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            setEncodedFragment$okhttp(str);
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            q.i(str, "encodedName");
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (getEncodedQueryNamesAndValues$okhttp() == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int i10) {
            getEncodedPathSegments$okhttp().remove(i10);
            if (getEncodedPathSegments$okhttp().isEmpty()) {
                getEncodedPathSegments$okhttp().add("");
            }
            return this;
        }

        public final Builder scheme(String str) {
            boolean r10;
            boolean r11;
            q.i(str, "scheme");
            r10 = v.r(str, "http", true);
            if (!r10) {
                r11 = v.r(str, "https", true);
                if (r11) {
                    setScheme$okhttp("https");
                } else {
                    throw new IllegalArgumentException(q.q("unexpected scheme: ", str));
                }
            } else {
                setScheme$okhttp("http");
            }
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            q.i(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i10, String str) {
            boolean z10;
            q.i(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            getEncodedPathSegments$okhttp().set(i10, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this;
            }
            throw new IllegalArgumentException(q.q("unexpected path segment: ", str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            q.i(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            q.i(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i10, String str) {
            boolean z10;
            q.i(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                getEncodedPathSegments$okhttp().set(i10, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(q.q("unexpected path segment: ", str).toString());
        }

        public final void setPort$okhttp(int i10) {
            this.port = i10;
        }

        public final Builder setQueryParameter(String str, String str2) {
            q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        
            if (r1 != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b5, code lost:
        
            if (r1 != r2.defaultPort(r3)) goto L38;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.getScheme$okhttp()
                if (r1 == 0) goto L18
                java.lang.String r1 = r6.getScheme$okhttp()
                r0.append(r1)
                java.lang.String r1 = "://"
                r0.append(r1)
                goto L1d
            L18:
                java.lang.String r1 = "//"
                r0.append(r1)
            L1d:
                java.lang.String r1 = r6.getEncodedUsername$okhttp()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L2b
                r1 = 1
                goto L2c
            L2b:
                r1 = 0
            L2c:
                r4 = 58
                if (r1 != 0) goto L3f
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L3c
                r1 = 1
                goto L3d
            L3c:
                r1 = 0
            L3d:
                if (r1 == 0) goto L63
            L3f:
                java.lang.String r1 = r6.getEncodedUsername$okhttp()
                r0.append(r1)
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                int r1 = r1.length()
                if (r1 <= 0) goto L51
                goto L52
            L51:
                r2 = 0
            L52:
                if (r2 == 0) goto L5e
                r0.append(r4)
                java.lang.String r1 = r6.getEncodedPassword$okhttp()
                r0.append(r1)
            L5e:
                r1 = 64
                r0.append(r1)
            L63:
                java.lang.String r1 = r6.getHost$okhttp()
                if (r1 == 0) goto L91
                java.lang.String r1 = r6.getHost$okhttp()
                qc.q.f(r1)
                r2 = 2
                r5 = 0
                boolean r1 = yc.m.J(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L8a
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.getHost$okhttp()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L91
            L8a:
                java.lang.String r1 = r6.getHost$okhttp()
                r0.append(r1)
            L91:
                int r1 = r6.getPort$okhttp()
                r2 = -1
                if (r1 != r2) goto L9e
                java.lang.String r1 = r6.getScheme$okhttp()
                if (r1 == 0) goto Lbd
            L9e:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.getScheme$okhttp()
                if (r2 == 0) goto Lb7
                okhttp3.HttpUrl$Companion r2 = okhttp3.HttpUrl.Companion
                java.lang.String r3 = r6.getScheme$okhttp()
                qc.q.f(r3)
                int r2 = r2.defaultPort(r3)
                if (r1 == r2) goto Lbd
            Lb7:
                r0.append(r4)
                r0.append(r1)
            Lbd:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List r2 = r6.getEncodedPathSegments$okhttp()
                r1.toPathString$okhttp(r2, r0)
                java.util.List r2 = r6.getEncodedQueryNamesAndValues$okhttp()
                if (r2 == 0) goto Ldb
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.getEncodedQueryNamesAndValues$okhttp()
                qc.q.f(r2)
                r1.toQueryString$okhttp(r2, r0)
            Ldb:
                java.lang.String r1 = r6.getEncodedFragment$okhttp()
                if (r1 == 0) goto Led
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.getEncodedFragment$okhttp()
                r0.append(r1)
            Led:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                qc.q.h(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            q.i(str, "username");
            setEncodedUsername$okhttp(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        private final Builder addPathSegments(String str, boolean z10) {
            int i10 = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i10, str.length());
                push(str, i10, delimiterOffset, delimiterOffset < str.length(), z10);
                i10 = delimiterOffset + 1;
            } while (i10 <= str.length());
            return this;
        }
    }

    /* compiled from: HttpUrl.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            int i13;
            int i14;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            Charset charset2;
            if ((i12 & 1) != 0) {
                i13 = 0;
            } else {
                i13 = i10;
            }
            if ((i12 & 2) != 0) {
                i14 = str.length();
            } else {
                i14 = i11;
            }
            if ((i12 & 8) != 0) {
                z14 = false;
            } else {
                z14 = z10;
            }
            if ((i12 & 16) != 0) {
                z15 = false;
            } else {
                z15 = z11;
            }
            if ((i12 & 32) != 0) {
                z16 = false;
            } else {
                z16 = z12;
            }
            if ((i12 & 64) != 0) {
                z17 = false;
            } else {
                z17 = z13;
            }
            if ((i12 & 128) != 0) {
                charset2 = null;
            } else {
                charset2 = charset;
            }
            return companion.canonicalize$okhttp(str, i13, i14, str2, z14, z15, z16, z17, charset2);
        }

        private final boolean isPercentEncoded(String str, int i10, int i11) {
            int i12 = i10 + 2;
            if (i12 < i11 && str.charAt(i10) == '%' && Util.parseHexDigit(str.charAt(i10 + 1)) != -1 && Util.parseHexDigit(str.charAt(i12)) != -1) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return companion.percentDecode$okhttp(str, i10, i11, z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
        
            if (isPercentEncoded(r16, r5, r18) == false) goto L41;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void writeCanonicalized(okio.c r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.W(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = yc.m.J(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.c1(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                okio.c r6 = new okio.c
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = qc.q.d(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.Y0(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.c1(r7)
            L8a:
                boolean r10 = r6.C()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.D(r9)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.D(r11)
                char[] r11 = okhttp3.HttpUrl.access$getHEX_DIGITS$cp()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.D(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(okio.c, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(okio.c cVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt == 37 && (i12 = i10 + 2) < i11) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i10 + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i12));
                    if (parseHexDigit != -1 && parseHexDigit2 != -1) {
                        cVar.D((parseHexDigit << 4) + parseHexDigit2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    cVar.c1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    if (codePointAt == 43 && z10) {
                        cVar.D(32);
                        i10++;
                    }
                    cVar.c1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m302deprecated_get(String str) {
            q.i(str, ImagesContract.URL);
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m305deprecated_parse(String str) {
            q.i(str, ImagesContract.URL);
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            boolean J;
            q.i(str, "<this>");
            q.i(str2, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                    J = w.J(str2, (char) codePointAt, false, 2, null);
                    if (!J) {
                        if (codePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!isPercentEncoded(str, i12, i11)) {
                                        okio.c cVar = new okio.c();
                                        cVar.b1(str, i10, i12);
                                        writeCanonicalized(cVar, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return cVar.l0();
                                    }
                                    if (codePointAt == 43 || !z12) {
                                        i12 += Character.charCount(codePointAt);
                                    } else {
                                        okio.c cVar2 = new okio.c();
                                        cVar2.b1(str, i10, i12);
                                        writeCanonicalized(cVar2, str, i12, i11, str2, z10, z11, z12, z13, charset);
                                        return cVar2.l0();
                                    }
                                }
                            }
                        }
                        if (codePointAt == 43) {
                        }
                        i12 += Character.charCount(codePointAt);
                    }
                }
                okio.c cVar22 = new okio.c();
                cVar22.b1(str, i10, i12);
                writeCanonicalized(cVar22, str, i12, i11, str2, z10, z11, z12, z13, charset);
                return cVar22.l0();
            }
            String substring = str.substring(i10, i11);
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String str) {
            q.i(str, "scheme");
            if (q.d(str, "http")) {
                return 80;
            }
            if (q.d(str, "https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            q.i(str, "<this>");
            return new Builder().parse$okhttp(null, str).build();
        }

        public final HttpUrl parse(String str) {
            q.i(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i10, int i11, boolean z10) {
            q.i(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char charAt = str.charAt(i12);
                if (charAt != '%' && (charAt != '+' || !z10)) {
                    i12 = i13;
                } else {
                    okio.c cVar = new okio.c();
                    cVar.b1(str, i10, i12);
                    writePercentDecoded(cVar, str, i12, i11, z10);
                    return cVar.l0();
                }
            }
            String substring = str.substring(i10, i11);
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb2) {
            q.i(list, "<this>");
            q.i(sb2, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append(list.get(i10));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            int W;
            int W2;
            q.i(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                W = w.W(str, '&', i10, false, 4, null);
                if (W == -1) {
                    W = str.length();
                }
                int i11 = W;
                W2 = w.W(str, '=', i10, false, 4, null);
                if (W2 != -1 && W2 <= i11) {
                    String substring = str.substring(i10, W2);
                    q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    String substring2 = str.substring(W2 + 1, i11);
                    q.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                } else {
                    String substring3 = str.substring(i10, i11);
                    q.h(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                    arrayList.add(null);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb2) {
            q.i(list, "<this>");
            q.i(sb2, "out");
            d r10 = vc.j.r(vc.j.s(0, list.size()), 2);
            int h10 = r10.h();
            int i10 = r10.i();
            int j10 = r10.j();
            if ((j10 <= 0 || h10 > i10) && (j10 >= 0 || i10 > h10)) {
                return;
            }
            while (true) {
                int i11 = h10 + j10;
                String str = list.get(h10);
                String str2 = list.get(h10 + 1);
                if (h10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (h10 != i10) {
                    h10 = i11;
                } else {
                    return;
                }
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m304deprecated_get(URL url) {
            q.i(url, ImagesContract.URL);
            return get(url);
        }

        public final HttpUrl get(URL url) {
            q.i(url, "<this>");
            String url2 = url.toString();
            q.h(url2, "toString()");
            return parse(url2);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m303deprecated_get(URI uri) {
            q.i(uri, "uri");
            return get(uri);
        }

        public final HttpUrl get(URI uri) {
            q.i(uri, "<this>");
            String uri2 = uri.toString();
            q.h(uri2, "toString()");
            return parse(uri2);
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i10, List<String> list, List<String> list2, String str5, String str6) {
        q.i(str, "scheme");
        q.i(str2, "username");
        q.i(str3, "password");
        q.i(str4, "host");
        q.i(list, "pathSegments");
        q.i(str6, ImagesContract.URL);
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i10;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = q.d(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m283deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m284deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m285deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m286deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m287deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m288deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m289deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m290deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m291deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m292deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m293deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m294deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m295deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m296deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m297deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m298deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m299deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m300deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m301deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        int W;
        if (this.fragment != null) {
            W = w.W(this.url, '#', 0, false, 6, null);
            String substring = this.url.substring(W + 1);
            q.h(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return null;
    }

    public final String encodedPassword() {
        boolean z10;
        int W;
        int W2;
        if (this.password.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            W = w.W(this.url, ':', this.scheme.length() + 3, false, 4, null);
            W2 = w.W(this.url, '@', 0, false, 6, null);
            String substring = this.url.substring(W + 1, W2);
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "";
    }

    public final String encodedPath() {
        int W;
        W = w.W(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        String substring = this.url.substring(W, Util.delimiterOffset(str, "?#", W, str.length()));
        q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int W;
        W = w.W(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", W, str.length());
        ArrayList arrayList = new ArrayList();
        while (W < delimiterOffset) {
            int i10 = W + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i10, delimiterOffset);
            String substring = this.url.substring(i10, delimiterOffset2);
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            W = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        int W;
        if (this.queryNamesAndValues != null) {
            W = w.W(this.url, '?', 0, false, 6, null);
            int i10 = W + 1;
            String str = this.url;
            String substring = this.url.substring(i10, Util.delimiterOffset(str, '#', i10, str.length()));
            q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return null;
    }

    public final String encodedUsername() {
        boolean z10;
        if (this.username.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return "";
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        String substring = this.url.substring(length, Util.delimiterOffset(str, ":@", length, str.length()));
        q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HttpUrl) && q.d(((HttpUrl) obj).url, this.url)) {
            return true;
        }
        return false;
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb2);
        return sb2.toString();
    }

    public final String queryParameter(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        d r10 = vc.j.r(vc.j.s(0, list.size()), 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                int i11 = h10 + j10;
                if (q.d(str, this.queryNamesAndValues.get(h10))) {
                    return this.queryNamesAndValues.get(h10 + 1);
                }
                if (h10 == i10) {
                    break;
                }
                h10 = i11;
            }
        }
        return null;
    }

    public final String queryParameterName(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i10 * 2);
            q.f(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return s0.b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        d r10 = vc.j.r(vc.j.s(0, this.queryNamesAndValues.size()), 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                int i11 = h10 + j10;
                String str = this.queryNamesAndValues.get(h10);
                q.f(str);
                linkedHashSet.add(str);
                if (h10 == i10) {
                    break;
                }
                h10 = i11;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        q.h(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i10) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i10 * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (this.queryNamesAndValues == null) {
            return r.i();
        }
        ArrayList arrayList = new ArrayList();
        d r10 = vc.j.r(vc.j.s(0, this.queryNamesAndValues.size()), 2);
        int h10 = r10.h();
        int i10 = r10.i();
        int j10 = r10.j();
        if ((j10 > 0 && h10 <= i10) || (j10 < 0 && i10 <= h10)) {
            while (true) {
                int i11 = h10 + j10;
                if (q.d(str, this.queryNamesAndValues.get(h10))) {
                    arrayList.add(this.queryNamesAndValues.get(h10 + 1));
                }
                if (h10 == i10) {
                    break;
                }
                h10 = i11;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        q.h(unmodifiableList, "unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        q.f(newBuilder);
        return newBuilder.username("").password("").build().toString();
    }

    public final HttpUrl resolve(String str) {
        q.i(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder == null) {
            return null;
        }
        return newBuilder.build();
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new j("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").g(builder, ""));
                q.h(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url) {
        return Companion.get(url);
    }

    public final Builder newBuilder(String str) {
        q.i(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
