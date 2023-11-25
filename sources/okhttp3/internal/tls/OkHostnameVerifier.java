package okhttp3.internal.tls;

import ec.b0;
import ec.t;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.b1;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: OkHostnameVerifier.kt */
/* loaded from: classes4.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (isAscii(str)) {
            Locale locale = Locale.US;
            q.h(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            q.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i10) {
        List<String> i11;
        Object obj;
        List<String> i12;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                i12 = t.i();
                return i12;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && q.d(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            i11 = t.i();
            return i11;
        }
    }

    private final boolean isAscii(String str) {
        if (str.length() != ((int) b1.b(str, 0, 0, 3, null))) {
            return false;
        }
        return true;
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String asciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(asciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (q.d(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        List<String> r02;
        q.i(x509Certificate, "certificate");
        r02 = b0.r0(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
        return r02;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        q.i(str, "host");
        q.i(sSLSession, "session");
        if (isAscii(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            } catch (SSLException unused) {
                return false;
            }
        }
        return verify(str, (X509Certificate) certificate);
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        q.i(str, "host");
        q.i(x509Certificate, "certificate");
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        boolean F;
        boolean q10;
        boolean F2;
        boolean q11;
        boolean q12;
        boolean q13;
        boolean K;
        boolean F3;
        int W;
        boolean q14;
        int b02;
        if (!(str == null || str.length() == 0)) {
            F = v.F(str, ".", false, 2, null);
            if (!F) {
                q10 = v.q(str, "..", false, 2, null);
                if (!q10) {
                    if (!(str2 == null || str2.length() == 0)) {
                        F2 = v.F(str2, ".", false, 2, null);
                        if (!F2) {
                            q11 = v.q(str2, "..", false, 2, null);
                            if (!q11) {
                                q12 = v.q(str, ".", false, 2, null);
                                if (!q12) {
                                    str = q.q(str, ".");
                                }
                                String str3 = str;
                                q13 = v.q(str2, ".", false, 2, null);
                                if (!q13) {
                                    str2 = q.q(str2, ".");
                                }
                                String asciiToLowercase = asciiToLowercase(str2);
                                K = w.K(asciiToLowercase, "*", false, 2, null);
                                if (K) {
                                    F3 = v.F(asciiToLowercase, "*.", false, 2, null);
                                    if (F3) {
                                        W = w.W(asciiToLowercase, '*', 1, false, 4, null);
                                        if (W == -1 && str3.length() >= asciiToLowercase.length() && !q.d("*.", asciiToLowercase)) {
                                            String substring = asciiToLowercase.substring(1);
                                            q.h(substring, "this as java.lang.String).substring(startIndex)");
                                            q14 = v.q(str3, substring, false, 2, null);
                                            if (q14) {
                                                int length = str3.length() - substring.length();
                                                if (length > 0) {
                                                    b02 = w.b0(str3, '.', length - 1, false, 4, null);
                                                    if (b02 != -1) {
                                                        return false;
                                                    }
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                } else {
                                    return q.d(str3, asciiToLowercase);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
