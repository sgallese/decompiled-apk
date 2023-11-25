package okhttp3.internal.publicsuffix;

import ec.b0;
import ec.s;
import ec.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import nc.b;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import okio.e;
import okio.l0;
import okio.o;
import qc.h;
import qc.q;
import xc.g;
import yc.w;

/* compiled from: PublicSuffixDatabase.kt */
/* loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final PublicSuffixDatabase instance;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* compiled from: PublicSuffixDatabase.kt */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int and;
            int and2;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        and = 46;
                        z10 = false;
                    } else {
                        z10 = z11;
                        and = Util.and(bArr2[i17][i18], 255);
                    }
                    and2 = and - Util.and(bArr[i14 + i19], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    } else if (bArr2[i17].length == i18) {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    } else {
                        z11 = z10;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                Charset charset = StandardCharsets.UTF_8;
                                q.h(charset, "UTF_8");
                                return new String(bArr, i14, i16, charset);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i14 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    static {
        List<String> d10;
        d10 = s.d("*");
        PREVAILING_RULE = d10;
        instance = new PublicSuffixDatabase();
    }

    private final List<String> findMatchingRule(List<String> list) {
        boolean z10;
        List<String> list2;
        String str;
        String str2;
        String str3;
        List<String> w02;
        List<String> w03;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                String str4 = list.get(i10);
                Charset charset = StandardCharsets.UTF_8;
                q.h(charset, "UTF_8");
                byte[] bytes = str4.getBytes(charset);
                q.h(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                list2 = null;
                if (i11 < size) {
                    int i12 = i11 + 1;
                    Companion companion = Companion;
                    byte[] bArr2 = this.publicSuffixListBytes;
                    if (bArr2 == null) {
                        q.z("publicSuffixListBytes");
                        bArr2 = null;
                    }
                    String binarySearch = companion.binarySearch(bArr2, bArr, i11);
                    if (binarySearch != null) {
                        str = binarySearch;
                        break;
                    }
                    i11 = i12;
                } else {
                    str = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13 + 1;
                    bArr3[i13] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        q.z("publicSuffixListBytes");
                        bArr4 = null;
                    }
                    String binarySearch2 = companion2.binarySearch(bArr4, bArr3, i13);
                    if (binarySearch2 != null) {
                        str2 = binarySearch2;
                        break;
                    }
                    i13 = i14;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i15 = size - 1;
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        q.z("publicSuffixExceptionListBytes");
                        bArr5 = null;
                    }
                    str3 = companion3.binarySearch(bArr5, bArr, i16);
                    if (str3 != null) {
                        break;
                    }
                    i16 = i17;
                }
            }
            str3 = null;
            if (str3 != null) {
                w03 = w.w0(q.q("!", str3), new char[]{'.'}, false, 0, 6, null);
                return w03;
            } else if (str == null && str2 == null) {
                return PREVAILING_RULE;
            } else {
                if (str != null) {
                    w02 = w.w0(str, new char[]{'.'}, false, 0, 6, null);
                } else {
                    w02 = null;
                }
                if (w02 == null) {
                    w02 = t.i();
                }
                if (str2 != null) {
                    list2 = w.w0(str2, new char[]{'.'}, false, 0, 6, null);
                }
                if (list2 == null) {
                    list2 = t.i();
                }
                if (w02.size() <= list2.size()) {
                    return list2;
                }
                return w02;
            }
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        e d10 = l0.d(new o(l0.k(resourceAsStream)));
        try {
            byte[] v02 = d10.v0(d10.readInt());
            byte[] v03 = d10.v0(d10.readInt());
            dc.w wVar = dc.w.f13270a;
            b.a(d10, null);
            synchronized (this) {
                q.f(v02);
                this.publicSuffixListBytes = v02;
                q.f(v03);
                this.publicSuffixExceptionListBytes = v03;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        List<String> w02;
        Object m02;
        List<String> W;
        w02 = w.w0(str, new char[]{'.'}, false, 0, 6, null);
        m02 = b0.m0(w02);
        if (q.d(m02, "")) {
            W = b0.W(w02, 1);
            return W;
        }
        return w02;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        g R;
        g j10;
        String t10;
        q.i(str, "domain");
        String unicode = IDN.toUnicode(str);
        q.h(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        R = b0.R(splitDomain(str));
        j10 = xc.o.j(R, size - size2);
        t10 = xc.o.t(j10, ".", null, null, 0, null, null, 62, null);
        return t10;
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        q.i(bArr, "publicSuffixListBytes");
        q.i(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
