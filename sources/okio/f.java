package okio;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: ByteString.kt */
/* loaded from: classes4.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: q */
    public static final a f20621q = new a(null);

    /* renamed from: r */
    public static final f f20622r = new f(new byte[0]);

    /* renamed from: f */
    private final byte[] f20623f;

    /* renamed from: m */
    private transient int f20624m;

    /* renamed from: p */
    private transient String f20625p;

    /* compiled from: ByteString.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ f f(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = f1.c();
            }
            return aVar.e(bArr, i10, i11);
        }

        public final f a(String str) {
            qc.q.i(str, "<this>");
            byte[] a10 = d1.a(str);
            if (a10 != null) {
                return new f(a10);
            }
            return null;
        }

        public final f b(String str) {
            boolean z10;
            int e10;
            int e11;
            qc.q.i(str, "<this>");
            if (str.length() % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    e10 = ld.g.e(str.charAt(i11));
                    e11 = ld.g.e(str.charAt(i11 + 1));
                    bArr[i10] = (byte) ((e10 << 4) + e11);
                }
                return new f(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }

        public final f c(String str, Charset charset) {
            qc.q.i(str, "<this>");
            qc.q.i(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            qc.q.h(bytes, "this as java.lang.String).getBytes(charset)");
            return new f(bytes);
        }

        public final f d(String str) {
            qc.q.i(str, "<this>");
            f fVar = new f(e1.a(str));
            fVar.A(str);
            return fVar;
        }

        public final f e(byte[] bArr, int i10, int i11) {
            byte[] n10;
            qc.q.i(bArr, "<this>");
            int f10 = f1.f(bArr, i11);
            f1.b(bArr.length, i10, f10);
            n10 = ec.o.n(bArr, i10, f10 + i10);
            return new f(n10);
        }
    }

    public f(byte[] bArr) {
        qc.q.i(bArr, "data");
        this.f20623f = bArr;
    }

    public static /* synthetic */ f G(f fVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = f1.c();
            }
            return fVar.F(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
    }

    public static /* synthetic */ int q(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return fVar.o(fVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
    }

    public static /* synthetic */ int v(f fVar, f fVar2, int i10, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                i10 = f1.c();
            }
            return fVar.t(fVar2, i10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
    }

    public final void A(String str) {
        this.f20625p = str;
    }

    public final f B() {
        return f("SHA-1");
    }

    public final f C() {
        return f("SHA-256");
    }

    public final int D() {
        return l();
    }

    public final boolean E(f fVar) {
        qc.q.i(fVar, "prefix");
        return x(0, fVar, 0, fVar.D());
    }

    public f F(int i10, int i11) {
        boolean z10;
        boolean z11;
        byte[] n10;
        int e10 = f1.e(this, i11);
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (e10 <= j().length) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (e10 - i10 < 0) {
                    z12 = false;
                }
                if (z12) {
                    if (i10 != 0 || e10 != j().length) {
                        n10 = ec.o.n(j(), i10, e10);
                        return new f(n10);
                    }
                    return this;
                }
                throw new IllegalArgumentException("endIndex < beginIndex".toString());
            }
            throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0".toString());
    }

    public f H() {
        for (int i10 = 0; i10 < j().length; i10++) {
            byte b10 = j()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] j10 = j();
                byte[] copyOf = Arrays.copyOf(j10, j10.length);
                qc.q.h(copyOf, "copyOf(this, size)");
                copyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b11 = copyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        copyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new f(copyOf);
            }
        }
        return this;
    }

    public String I() {
        String m10 = m();
        if (m10 == null) {
            String c10 = e1.c(r());
            A(c10);
            return c10;
        }
        return m10;
    }

    public void J(c cVar, int i10, int i11) {
        qc.q.i(cVar, "buffer");
        ld.g.d(this, cVar, i10, i11);
    }

    public String b() {
        return d1.c(j(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compareTo(okio.f r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            qc.q.i(r10, r0)
            int r0 = r9.D()
            int r1 = r10.D()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.i(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.f.compareTo(okio.f):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.D() == j().length && fVar.y(0, j(), 0, j().length)) {
                return true;
            }
        }
        return false;
    }

    public f f(String str) {
        qc.q.i(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f20623f, 0, D());
        byte[] digest = messageDigest.digest();
        qc.q.h(digest, "digestBytes");
        return new f(digest);
    }

    public final boolean g(f fVar) {
        qc.q.i(fVar, "suffix");
        return x(D() - fVar.D(), fVar, 0, fVar.D());
    }

    public int hashCode() {
        int k10 = k();
        if (k10 == 0) {
            int hashCode = Arrays.hashCode(j());
            z(hashCode);
            return hashCode;
        }
        return k10;
    }

    public final byte i(int i10) {
        return s(i10);
    }

    public final byte[] j() {
        return this.f20623f;
    }

    public final int k() {
        return this.f20624m;
    }

    public int l() {
        return j().length;
    }

    public final String m() {
        return this.f20625p;
    }

    public String n() {
        String n10;
        char[] cArr = new char[j().length * 2];
        int i10 = 0;
        for (byte b10 : j()) {
            int i11 = i10 + 1;
            cArr[i10] = ld.g.f()[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = ld.g.f()[b10 & 15];
        }
        n10 = yc.v.n(cArr);
        return n10;
    }

    public final int o(f fVar, int i10) {
        qc.q.i(fVar, TaskSetupFragment.TYPE_OTHER);
        return p(fVar.r(), i10);
    }

    public int p(byte[] bArr, int i10) {
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        int length = j().length - bArr.length;
        int max = Math.max(i10, 0);
        if (max <= length) {
            while (!f1.a(j(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public byte[] r() {
        return j();
    }

    public byte s(int i10) {
        return j()[i10];
    }

    public final int t(f fVar, int i10) {
        qc.q.i(fVar, TaskSetupFragment.TYPE_OTHER);
        return u(fVar.r(), i10);
    }

    public String toString() {
        boolean z10;
        int c10;
        String B;
        String B2;
        String B3;
        boolean z11;
        f fVar;
        byte[] n10;
        String str;
        boolean z12 = true;
        if (j().length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            c10 = ld.g.c(j(), 64);
            if (c10 == -1) {
                if (j().length <= 64) {
                    str = "[hex=" + n() + ']';
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[size=");
                    sb2.append(j().length);
                    sb2.append(" hex=");
                    int e10 = f1.e(this, 64);
                    if (e10 <= j().length) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (e10 + 0 < 0) {
                            z12 = false;
                        }
                        if (z12) {
                            if (e10 != j().length) {
                                n10 = ec.o.n(j(), 0, e10);
                                fVar = new f(n10);
                            } else {
                                fVar = this;
                            }
                            sb2.append(fVar.n());
                            sb2.append("…]");
                            return sb2.toString();
                        }
                        throw new IllegalArgumentException("endIndex < beginIndex".toString());
                    }
                    throw new IllegalArgumentException(("endIndex > length(" + j().length + ')').toString());
                }
            } else {
                String I = I();
                String substring = I.substring(0, c10);
                qc.q.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                B = yc.v.B(substring, "\\", "\\\\", false, 4, null);
                B2 = yc.v.B(B, "\n", "\\n", false, 4, null);
                B3 = yc.v.B(B2, "\r", "\\r", false, 4, null);
                if (c10 < I.length()) {
                    return "[size=" + j().length + " text=" + B3 + "…]";
                }
                return "[text=" + B3 + ']';
            }
        } else {
            str = "[size=0]";
        }
        return str;
    }

    public int u(byte[] bArr, int i10) {
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        for (int min = Math.min(f1.e(this, i10), j().length - bArr.length); -1 < min; min--) {
            if (f1.a(j(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public final f w() {
        return f("MD5");
    }

    public boolean x(int i10, f fVar, int i11, int i12) {
        qc.q.i(fVar, TaskSetupFragment.TYPE_OTHER);
        return fVar.y(i11, j(), i10, i12);
    }

    public boolean y(int i10, byte[] bArr, int i11, int i12) {
        qc.q.i(bArr, TaskSetupFragment.TYPE_OTHER);
        if (i10 >= 0 && i10 <= j().length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && f1.a(j(), i10, bArr, i11, i12)) {
            return true;
        }
        return false;
    }

    public final void z(int i10) {
        this.f20624m = i10;
    }
}
