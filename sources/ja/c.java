package ja;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter.java */
/* loaded from: classes3.dex */
public class c implements Closeable, Flushable {

    /* renamed from: w  reason: collision with root package name */
    private static final String[] f19075w = new String[128];

    /* renamed from: x  reason: collision with root package name */
    private static final String[] f19076x;

    /* renamed from: f  reason: collision with root package name */
    private final Writer f19077f;

    /* renamed from: m  reason: collision with root package name */
    private int[] f19078m = new int[32];

    /* renamed from: p  reason: collision with root package name */
    private int f19079p = 0;

    /* renamed from: q  reason: collision with root package name */
    private String f19080q;

    /* renamed from: r  reason: collision with root package name */
    private String f19081r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f19082s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f19083t;

    /* renamed from: u  reason: collision with root package name */
    private String f19084u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f19085v;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f19075w[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f19075w;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f19076x = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        T(6);
        this.f19081r = ":";
        this.f19085v = true;
        if (writer != null) {
            this.f19077f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void I() throws IOException {
        if (this.f19080q == null) {
            return;
        }
        this.f19077f.write("\n");
        int i10 = this.f19079p;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f19077f.write(this.f19080q);
        }
    }

    private c Q(int i10, String str) throws IOException {
        c();
        T(i10);
        this.f19077f.write(str);
        return this;
    }

    private int R() {
        int i10 = this.f19079p;
        if (i10 != 0) {
            return this.f19078m[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void T(int i10) {
        int i11 = this.f19079p;
        int[] iArr = this.f19078m;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19078m = iArr2;
        }
        int[] iArr3 = this.f19078m;
        int i12 = this.f19079p;
        this.f19079p = i12 + 1;
        iArr3[i12] = i10;
    }

    private void V(int i10) {
        this.f19078m[this.f19079p - 1] = i10;
    }

    private void b() throws IOException {
        int R = R();
        if (R == 5) {
            this.f19077f.write(44);
        } else if (R != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        I();
        V(4);
    }

    private void c() throws IOException {
        int R = R();
        if (R != 1) {
            if (R != 2) {
                if (R != 4) {
                    if (R != 6) {
                        if (R == 7) {
                            if (!this.f19082s) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    V(7);
                    return;
                }
                this.f19077f.append((CharSequence) this.f19081r);
                V(5);
                return;
            }
            this.f19077f.append(',');
            I();
            return;
        }
        V(2);
        I();
    }

    private c j(int i10, int i11, String str) throws IOException {
        int R = R();
        if (R != i11 && R != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f19084u == null) {
            this.f19079p--;
            if (R == i11) {
                I();
            }
            this.f19077f.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f19084u);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f19083t
            if (r0 == 0) goto L7
            java.lang.String[] r0 = ja.c.f19076x
            goto L9
        L7:
            java.lang.String[] r0 = ja.c.f19075w
        L9:
            java.io.Writer r1 = r8.f19077f
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f19077f
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f19077f
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f19077f
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f19077f
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.c.k0(java.lang.String):void");
    }

    private void z0() throws IOException {
        if (this.f19084u != null) {
            b();
            k0(this.f19084u);
            this.f19084u = null;
        }
    }

    public boolean B() {
        return this.f19082s;
    }

    public c E(String str) throws IOException {
        if (str != null) {
            if (this.f19084u == null) {
                if (this.f19079p != 0) {
                    this.f19084u = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c L() throws IOException {
        if (this.f19084u != null) {
            if (this.f19085v) {
                z0();
            } else {
                this.f19084u = null;
                return this;
            }
        }
        c();
        this.f19077f.write("null");
        return this;
    }

    public final void Y(boolean z10) {
        this.f19083t = z10;
    }

    public final void c0(String str) {
        if (str.length() == 0) {
            this.f19080q = null;
            this.f19081r = ":";
            return;
        }
        this.f19080q = str;
        this.f19081r = ": ";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19077f.close();
        int i10 = this.f19079p;
        if (i10 <= 1 && (i10 != 1 || this.f19078m[i10 - 1] == 7)) {
            this.f19079p = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() throws IOException {
        z0();
        return Q(1, "[");
    }

    public c e() throws IOException {
        z0();
        return Q(3, "{");
    }

    public final void f0(boolean z10) {
        this.f19082s = z10;
    }

    public void flush() throws IOException {
        if (this.f19079p != 0) {
            this.f19077f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void i0(boolean z10) {
        this.f19085v = z10;
    }

    public c l0(long j10) throws IOException {
        z0();
        c();
        this.f19077f.write(Long.toString(j10));
        return this;
    }

    public c m() throws IOException {
        return j(1, 2, "]");
    }

    public c p0(Boolean bool) throws IOException {
        String str;
        if (bool == null) {
            return L();
        }
        z0();
        c();
        Writer writer = this.f19077f;
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public c q() throws IOException {
        return j(3, 5, "}");
    }

    public c q0(Number number) throws IOException {
        if (number == null) {
            return L();
        }
        z0();
        String obj = number.toString();
        if (!this.f19082s && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        c();
        this.f19077f.append((CharSequence) obj);
        return this;
    }

    public c s0(String str) throws IOException {
        if (str == null) {
            return L();
        }
        z0();
        c();
        k0(str);
        return this;
    }

    public final boolean x() {
        return this.f19085v;
    }

    public c x0(boolean z10) throws IOException {
        String str;
        z0();
        c();
        Writer writer = this.f19077f;
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        writer.write(str);
        return this;
    }

    public final boolean z() {
        return this.f19083t;
    }
}
