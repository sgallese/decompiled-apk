package okhttp3;

import ec.b0;
import ec.p;
import ec.t;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.f;
import pc.a;
import qc.h;
import qc.k0;
import qc.q;
import yc.v;
import yc.w;

/* compiled from: CertificatePinner.kt */
/* loaded from: classes4.dex */
public final class CertificatePinner {
    public static final Companion Companion = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes4.dex */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            q.i(str, "pattern");
            q.i(strArr, "pins");
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                i10++;
                getPins().add(new Pin(str, str2));
            }
            return this;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [okhttp3.internal.tls.CertificateChainCleaner, qc.h] */
        public final CertificatePinner build() {
            Set H0;
            H0 = b0.H0(this.pins);
            ?? r22 = 0;
            return new CertificatePinner(H0, r22, 2, r22);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final String pin(Certificate certificate) {
            q.i(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return q.q("sha256/", sha256Hash((X509Certificate) certificate).b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final f sha1Hash(X509Certificate x509Certificate) {
            q.i(x509Certificate, "<this>");
            f.a aVar = f.f20621q;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            q.h(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).B();
        }

        public final f sha256Hash(X509Certificate x509Certificate) {
            q.i(x509Certificate, "<this>");
            f.a aVar = f.f20621q;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            q.h(encoded, "publicKey.encoded");
            return f.a.f(aVar, encoded, 0, 0, 3, null).C();
        }
    }

    /* compiled from: CertificatePinner.kt */
    /* loaded from: classes4.dex */
    public static final class Pin {
        private final f hash;
        private final String hashAlgorithm;
        private final String pattern;

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
        
            if (r0 != (-1)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
        
            if (r0 != (-1)) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(java.lang.String r12, java.lang.String r13) {
            /*
                r11 = this;
                java.lang.String r0 = "pattern"
                qc.q.i(r12, r0)
                java.lang.String r0 = "pin"
                qc.q.i(r13, r0)
                r11.<init>()
                java.lang.String r0 = "*."
                r1 = 0
                r2 = 2
                r3 = 0
                boolean r0 = yc.m.F(r12, r0, r1, r2, r3)
                r4 = -1
                if (r0 == 0) goto L26
                java.lang.String r6 = "*"
                r7 = 1
                r8 = 0
                r9 = 4
                r10 = 0
                r5 = r12
                int r0 = yc.m.X(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L26:
                java.lang.String r0 = "**."
                boolean r0 = yc.m.F(r12, r0, r1, r2, r3)
                if (r0 == 0) goto L3b
                java.lang.String r6 = "*"
                r7 = 2
                r8 = 0
                r9 = 4
                r10 = 0
                r5 = r12
                int r0 = yc.m.X(r5, r6, r7, r8, r9, r10)
                if (r0 == r4) goto L48
            L3b:
                java.lang.String r6 = "*"
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r12
                int r0 = yc.m.X(r5, r6, r7, r8, r9, r10)
                if (r0 != r4) goto L4a
            L48:
                r0 = 1
                goto L4b
            L4a:
                r0 = 0
            L4b:
                if (r0 == 0) goto Lc3
                java.lang.String r0 = okhttp3.internal.HostnamesKt.toCanonicalHost(r12)
                if (r0 == 0) goto Lb7
                r11.pattern = r0
                java.lang.String r12 = "sha1/"
                boolean r12 = yc.m.F(r13, r12, r1, r2, r3)
                java.lang.String r0 = "Invalid pin hash: "
                java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
                if (r12 == 0) goto L82
                java.lang.String r12 = "sha1"
                r11.hashAlgorithm = r12
                okio.f$a r12 = okio.f.f20621q
                r1 = 5
                java.lang.String r1 = r13.substring(r1)
                qc.q.h(r1, r4)
                okio.f r12 = r12.a(r1)
                if (r12 == 0) goto L78
                r11.hash = r12
                goto La0
            L78:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = qc.q.q(r0, r13)
                r12.<init>(r13)
                throw r12
            L82:
                java.lang.String r12 = "sha256/"
                boolean r12 = yc.m.F(r13, r12, r1, r2, r3)
                if (r12 == 0) goto Lab
                java.lang.String r12 = "sha256"
                r11.hashAlgorithm = r12
                okio.f$a r12 = okio.f.f20621q
                r1 = 7
                java.lang.String r1 = r13.substring(r1)
                qc.q.h(r1, r4)
                okio.f r12 = r12.a(r1)
                if (r12 == 0) goto La1
                r11.hash = r12
            La0:
                return
            La1:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r13 = qc.q.q(r0, r13)
                r12.<init>(r13)
                throw r12
            Lab:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "pins must start with 'sha256/' or 'sha1/': "
                java.lang.String r13 = qc.q.q(r0, r13)
                r12.<init>(r13)
                throw r12
            Lb7:
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid pattern: "
                java.lang.String r12 = qc.q.q(r0, r12)
                r13.<init>(r12)
                throw r13
            Lc3:
                java.lang.String r13 = "Unexpected pattern: "
                java.lang.String r12 = qc.q.q(r13, r12)
                java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
                java.lang.String r12 = r12.toString()
                r13.<init>(r12)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (q.d(this.pattern, pin.pattern) && q.d(this.hashAlgorithm, pin.hashAlgorithm) && q.d(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        public final f getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(X509Certificate x509Certificate) {
            q.i(x509Certificate, "certificate");
            String str = this.hashAlgorithm;
            if (q.d(str, "sha256")) {
                return q.d(this.hash, CertificatePinner.Companion.sha256Hash(x509Certificate));
            }
            if (q.d(str, "sha1")) {
                return q.d(this.hash, CertificatePinner.Companion.sha1Hash(x509Certificate));
            }
            return false;
        }

        public final boolean matchesHostname(String str) {
            boolean F;
            boolean F2;
            boolean w10;
            int b02;
            boolean w11;
            q.i(str, "hostname");
            F = v.F(this.pattern, "**.", false, 2, null);
            if (!F) {
                F2 = v.F(this.pattern, "*.", false, 2, null);
                if (F2) {
                    int length = this.pattern.length() - 1;
                    int length2 = str.length() - length;
                    w10 = v.w(str, str.length() - length, this.pattern, 1, length, false, 16, null);
                    if (w10) {
                        b02 = w.b0(str, '.', length2 - 1, false, 4, null);
                        if (b02 != -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return q.d(str, this.pattern);
                }
            } else {
                int length3 = this.pattern.length() - 3;
                int length4 = str.length() - length3;
                w11 = v.w(str, str.length() - length3, this.pattern, 3, length3, false, 16, null);
                if (!w11) {
                    return false;
                }
                if (length4 != 0 && str.charAt(length4 - 1) != '.') {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return this.hashAlgorithm + '/' + this.hash.b();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner) {
        q.i(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public static final f sha1Hash(X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    public static final f sha256Hash(X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        q.i(str, "hostname");
        q.i(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, a<? extends List<? extends X509Certificate>> aVar) {
        q.i(str, "hostname");
        q.i(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(str);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = aVar.invoke();
        for (X509Certificate x509Certificate : invoke) {
            f fVar = null;
            f fVar2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (q.d(hashAlgorithm, "sha256")) {
                    if (fVar == null) {
                        fVar = Companion.sha256Hash(x509Certificate);
                    }
                    if (q.d(pin.getHash(), fVar)) {
                        return;
                    }
                } else if (q.d(hashAlgorithm, "sha1")) {
                    if (fVar2 == null) {
                        fVar2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (q.d(pin.getHash(), fVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError(q.q("unsupported hashAlgorithm: ", pin.getHashAlgorithm()));
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(Companion.pin(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb2.append("\n    ");
            sb2.append(pin2);
        }
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (q.d(certificatePinner.pins, this.pins) && q.d(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    public final List<Pin> findMatchingPins(String str) {
        List<Pin> i10;
        q.i(str, "hostname");
        Set<Pin> set = this.pins;
        i10 = t.i();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(str)) {
                if (i10.isEmpty()) {
                    i10 = new ArrayList<>();
                }
                k0.c(i10).add(obj);
            }
        }
        return i10;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i10;
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i10 = certificateChainCleaner.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        q.i(certificateChainCleaner, "certificateChainCleaner");
        if (q.d(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        List<? extends Certificate> b02;
        q.i(str, "hostname");
        q.i(certificateArr, "peerCertificates");
        b02 = p.b0(certificateArr);
        check(str, b02);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i10, h hVar) {
        this(set, (i10 & 2) != 0 ? null : certificateChainCleaner);
    }
}
