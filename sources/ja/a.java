package ja;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.stream.MalformedJsonException;
import ga.e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader.java */
/* loaded from: classes3.dex */
public class a implements Closeable {
    private static final char[] C = ")]}'\n".toCharArray();
    private String[] A;
    private int[] B;

    /* renamed from: f  reason: collision with root package name */
    private final Reader f19062f;

    /* renamed from: v  reason: collision with root package name */
    private long f19070v;

    /* renamed from: w  reason: collision with root package name */
    private int f19071w;

    /* renamed from: x  reason: collision with root package name */
    private String f19072x;

    /* renamed from: y  reason: collision with root package name */
    private int[] f19073y;

    /* renamed from: m  reason: collision with root package name */
    private boolean f19063m = false;

    /* renamed from: p  reason: collision with root package name */
    private final char[] f19064p = new char[UserVerificationMethods.USER_VERIFY_ALL];

    /* renamed from: q  reason: collision with root package name */
    private int f19065q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f19066r = 0;

    /* renamed from: s  reason: collision with root package name */
    private int f19067s = 0;

    /* renamed from: t  reason: collision with root package name */
    private int f19068t = 0;

    /* renamed from: u  reason: collision with root package name */
    int f19069u = 0;

    /* renamed from: z  reason: collision with root package name */
    private int f19074z = 0 + 1;

    /* compiled from: JsonReader.java */
    /* renamed from: ja.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0426a extends e {
        C0426a() {
        }

        @Override // ga.e
        public void a(a aVar) throws IOException {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                ((com.google.gson.internal.bind.a) aVar).V0();
                return;
            }
            int i10 = aVar.f19069u;
            if (i10 == 0) {
                i10 = aVar.j();
            }
            if (i10 == 13) {
                aVar.f19069u = 9;
            } else if (i10 == 12) {
                aVar.f19069u = 8;
            } else if (i10 == 14) {
                aVar.f19069u = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.l0() + aVar.I());
            }
        }
    }

    static {
        e.f16290a = new C0426a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f19073y = iArr;
        iArr[0] = 6;
        this.A = new String[32];
        this.B = new int[32];
        if (reader != null) {
            this.f19062f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void A0(char c10) throws IOException {
        char[] cArr = this.f19064p;
        do {
            int i10 = this.f19065q;
            int i11 = this.f19066r;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f19065q = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f19065q = i12;
                    x0();
                    i10 = this.f19065q;
                    i11 = this.f19066r;
                } else {
                    if (c11 == '\n') {
                        this.f19067s++;
                        this.f19068t = i12;
                    }
                    i10 = i12;
                }
            }
            this.f19065q = i10;
        } while (x(1));
        throw J0("Unterminated string");
    }

    private boolean C0(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.f19065q + length > this.f19066r && !x(length)) {
                return false;
            }
            char[] cArr = this.f19064p;
            int i10 = this.f19065q;
            if (cArr[i10] == '\n') {
                this.f19067s++;
                this.f19068t = i10 + 1;
            } else {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f19064p[this.f19065q + i11] != str.charAt(i11)) {
                        break;
                    }
                }
                return true;
            }
            this.f19065q++;
        }
    }

    private void D0() throws IOException {
        char c10;
        do {
            if (this.f19065q < this.f19066r || x(1)) {
                char[] cArr = this.f19064p;
                int i10 = this.f19065q;
                int i11 = i10 + 1;
                this.f19065q = i11;
                c10 = cArr[i10];
                if (c10 == '\n') {
                    this.f19067s++;
                    this.f19068t = i11;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    private boolean E(char c10) throws IOException {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            d();
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void F0() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f19065q
            int r2 = r1 + r0
            int r3 = r4.f19066r
            if (r2 >= r3) goto L51
            char[] r2 = r4.f19064p
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f19065q
            int r1 = r1 + r0
            r4.f19065q = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f19065q = r1
            r0 = 1
            boolean r0 = r4.x(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.a.F0():void");
    }

    private IOException J0(String str) throws IOException {
        throw new MalformedJsonException(str + I());
    }

    private int Y(boolean z10) throws IOException {
        char[] cArr = this.f19064p;
        int i10 = this.f19065q;
        int i11 = this.f19066r;
        while (true) {
            if (i10 == i11) {
                this.f19065q = i10;
                if (!x(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + I());
                }
                i10 = this.f19065q;
                i11 = this.f19066r;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f19067s++;
                this.f19068t = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f19065q = i12;
                    if (i12 == i11) {
                        this.f19065q = i12 - 1;
                        boolean x10 = x(2);
                        this.f19065q++;
                        if (!x10) {
                            return c10;
                        }
                    }
                    d();
                    int i13 = this.f19065q;
                    char c11 = cArr[i13];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f19065q = i13 + 1;
                        D0();
                        i10 = this.f19065q;
                        i11 = this.f19066r;
                    } else {
                        this.f19065q = i13 + 1;
                        if (C0("*/")) {
                            i10 = this.f19065q + 2;
                            i11 = this.f19066r;
                        } else {
                            throw J0("Unterminated comment");
                        }
                    }
                } else if (c10 == '#') {
                    this.f19065q = i12;
                    d();
                    D0();
                    i10 = this.f19065q;
                    i11 = this.f19066r;
                } else {
                    this.f19065q = i12;
                    return c10;
                }
            }
            i10 = i12;
        }
    }

    private void d() throws IOException {
        if (this.f19063m) {
            return;
        }
        throw J0("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void e() throws IOException {
        Y(true);
        int i10 = this.f19065q - 1;
        this.f19065q = i10;
        char[] cArr = C;
        if (i10 + cArr.length > this.f19066r && !x(cArr.length)) {
            return;
        }
        int i11 = 0;
        while (true) {
            char[] cArr2 = C;
            if (i11 < cArr2.length) {
                if (this.f19064p[this.f19065q + i11] != cArr2[i11]) {
                    return;
                }
                i11++;
            } else {
                this.f19065q += cArr2.length;
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.f19065q = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String f0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.f19064p
            r1 = 0
        L3:
            int r2 = r9.f19065q
            int r3 = r9.f19066r
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f19065q = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f19065q = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.x0()
            r1.append(r2)
            int r2 = r9.f19065q
            int r3 = r9.f19066r
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f19067s
            int r2 = r2 + r6
            r9.f19067s = r2
            r9.f19068t = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f19065q = r2
            boolean r2 = r9.x(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.J0(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.a.f0(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String k0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.f19065q
            int r4 = r3 + r2
            int r5 = r6.f19066r
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f19064p
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.d()
            goto L5c
        L4e:
            char[] r3 = r6.f19064p
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.x(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.f19064p
            int r4 = r6.f19065q
            r0.append(r3, r4, r2)
            int r3 = r6.f19065q
            int r3 = r3 + r2
            r6.f19065q = r3
            r2 = 1
            boolean r2 = r6.x(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f19064p
            int r3 = r6.f19065q
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.f19064p
            int r3 = r6.f19065q
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.f19065q
            int r2 = r2 + r1
            r6.f19065q = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.a.k0():java.lang.String");
    }

    private int p0() throws IOException {
        String str;
        String str2;
        int i10;
        char c10 = this.f19064p[this.f19065q];
        if (c10 != 't' && c10 != 'T') {
            if (c10 != 'f' && c10 != 'F') {
                if (c10 != 'n' && c10 != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i10 = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i10 = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        }
        int length = str.length();
        for (int i11 = 1; i11 < length; i11++) {
            if (this.f19065q + i11 >= this.f19066r && !x(i11 + 1)) {
                return 0;
            }
            char c11 = this.f19064p[this.f19065q + i11];
            if (c11 != str.charAt(i11) && c11 != str2.charAt(i11)) {
                return 0;
            }
        }
        if ((this.f19065q + length < this.f19066r || x(length + 1)) && E(this.f19064p[this.f19065q + length])) {
            return 0;
        }
        this.f19065q += length;
        this.f19069u = i10;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (E(r14) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r9 != 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r10 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r13 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r13 != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        r18.f19070v = r11;
        r18.f19065q += r8;
        r18.f19069u = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ba, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        if (r9 == 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00be, code lost:
    
        if (r9 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c1, code lost:
    
        if (r9 != 7) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c6, code lost:
    
        r18.f19071w = r8;
        r18.f19069u = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00cc, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cd, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int q0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.a.q0():int");
    }

    private void s0(int i10) {
        int i11 = this.f19074z;
        int[] iArr = this.f19073y;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[i11 * 2];
            int[] iArr3 = new int[i11 * 2];
            String[] strArr = new String[i11 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            System.arraycopy(this.B, 0, iArr3, 0, this.f19074z);
            System.arraycopy(this.A, 0, strArr, 0, this.f19074z);
            this.f19073y = iArr2;
            this.B = iArr3;
            this.A = strArr;
        }
        int[] iArr4 = this.f19073y;
        int i12 = this.f19074z;
        this.f19074z = i12 + 1;
        iArr4[i12] = i10;
    }

    private boolean x(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f19064p;
        int i13 = this.f19068t;
        int i14 = this.f19065q;
        this.f19068t = i13 - i14;
        int i15 = this.f19066r;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f19066r = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f19066r = 0;
        }
        this.f19065q = 0;
        do {
            Reader reader = this.f19062f;
            int i17 = this.f19066r;
            int read = reader.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.f19066r + read;
            this.f19066r = i11;
            if (this.f19067s == 0 && (i12 = this.f19068t) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f19065q++;
                this.f19068t = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    private char x0() throws IOException {
        int i10;
        int i11;
        if (this.f19065q == this.f19066r && !x(1)) {
            throw J0("Unterminated escape sequence");
        }
        char[] cArr = this.f19064p;
        int i12 = this.f19065q;
        int i13 = i12 + 1;
        this.f19065q = i13;
        char c10 = cArr[i12];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i13 + 4 > this.f19066r && !x(4)) {
                                        throw J0("Unterminated escape sequence");
                                    }
                                    int i14 = this.f19065q;
                                    int i15 = i14 + 4;
                                    char c11 = 0;
                                    while (i14 < i15) {
                                        char c12 = this.f19064p[i14];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i11 = c12 - '0';
                                        } else {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'a';
                                            } else if (c12 >= 'A' && c12 <= 'F') {
                                                i10 = c12 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u" + new String(this.f19064p, this.f19065q, 4));
                                            }
                                            i11 = i10 + 10;
                                        }
                                        c11 = (char) (c13 + i11);
                                        i14++;
                                    }
                                    this.f19065q += 4;
                                    return c11;
                                }
                                throw J0("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f19067s++;
            this.f19068t = i13;
        }
        return c10;
    }

    public final boolean B() {
        return this.f19063m;
    }

    String I() {
        return " at line " + (this.f19067s + 1) + " column " + ((this.f19065q - this.f19068t) + 1) + " path " + getPath();
    }

    public void I0() throws IOException {
        int i10 = 0;
        do {
            int i11 = this.f19069u;
            if (i11 == 0) {
                i11 = j();
            }
            if (i11 == 3) {
                s0(1);
            } else if (i11 == 1) {
                s0(3);
            } else {
                if (i11 == 4) {
                    this.f19074z--;
                } else if (i11 == 2) {
                    this.f19074z--;
                } else {
                    if (i11 != 14 && i11 != 10) {
                        if (i11 != 8 && i11 != 12) {
                            if (i11 != 9 && i11 != 13) {
                                if (i11 == 16) {
                                    this.f19065q += this.f19071w;
                                }
                            } else {
                                A0('\"');
                            }
                        } else {
                            A0('\'');
                        }
                    } else {
                        F0();
                    }
                    this.f19069u = 0;
                }
                i10--;
                this.f19069u = 0;
            }
            i10++;
            this.f19069u = 0;
        } while (i10 != 0);
        int[] iArr = this.B;
        int i12 = this.f19074z;
        int i13 = i12 - 1;
        iArr[i13] = iArr[i13] + 1;
        this.A[i12 - 1] = "null";
    }

    public boolean L() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 5) {
            this.f19069u = 0;
            int[] iArr = this.B;
            int i11 = this.f19074z - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.f19069u = 0;
            int[] iArr2 = this.B;
            int i12 = this.f19074z - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + l0() + I());
        }
    }

    public double Q() throws IOException {
        char c10;
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f19069u = 0;
            int[] iArr = this.B;
            int i11 = this.f19074z - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f19070v;
        }
        if (i10 == 16) {
            this.f19072x = new String(this.f19064p, this.f19065q, this.f19071w);
            this.f19065q += this.f19071w;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f19072x = k0();
            } else if (i10 != 11) {
                throw new IllegalStateException("Expected a double but was " + l0() + I());
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f19072x = f0(c10);
        }
        this.f19069u = 11;
        double parseDouble = Double.parseDouble(this.f19072x);
        if (!this.f19063m && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + I());
        }
        this.f19072x = null;
        this.f19069u = 0;
        int[] iArr2 = this.B;
        int i12 = this.f19074z - 1;
        iArr2[i12] = iArr2[i12] + 1;
        return parseDouble;
    }

    public int R() throws IOException {
        char c10;
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            long j10 = this.f19070v;
            int i11 = (int) j10;
            if (j10 == i11) {
                this.f19069u = 0;
                int[] iArr = this.B;
                int i12 = this.f19074z - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f19070v + I());
        }
        if (i10 == 16) {
            this.f19072x = new String(this.f19064p, this.f19065q, this.f19071w);
            this.f19065q += this.f19071w;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected an int but was " + l0() + I());
        } else {
            if (i10 == 10) {
                this.f19072x = k0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f19072x = f0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f19072x);
                this.f19069u = 0;
                int[] iArr2 = this.B;
                int i13 = this.f19074z - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19069u = 11;
        double parseDouble = Double.parseDouble(this.f19072x);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f19072x = null;
            this.f19069u = 0;
            int[] iArr3 = this.B;
            int i15 = this.f19074z - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f19072x + I());
    }

    public long T() throws IOException {
        char c10;
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 15) {
            this.f19069u = 0;
            int[] iArr = this.B;
            int i11 = this.f19074z - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f19070v;
        }
        if (i10 == 16) {
            this.f19072x = new String(this.f19064p, this.f19065q, this.f19071w);
            this.f19065q += this.f19071w;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw new IllegalStateException("Expected a long but was " + l0() + I());
        } else {
            if (i10 == 10) {
                this.f19072x = k0();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f19072x = f0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f19072x);
                this.f19069u = 0;
                int[] iArr2 = this.B;
                int i12 = this.f19074z - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f19069u = 11;
        double parseDouble = Double.parseDouble(this.f19072x);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.f19072x = null;
            this.f19069u = 0;
            int[] iArr3 = this.B;
            int i13 = this.f19074z - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.f19072x + I());
    }

    public String V() throws IOException {
        String f02;
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 14) {
            f02 = k0();
        } else if (i10 == 12) {
            f02 = f0('\'');
        } else if (i10 == 13) {
            f02 = f0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + l0() + I());
        }
        this.f19069u = 0;
        this.A[this.f19074z - 1] = f02;
        return f02;
    }

    public void b() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 3) {
            s0(1);
            this.B[this.f19074z - 1] = 0;
            this.f19069u = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + l0() + I());
    }

    public void c() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 1) {
            s0(3);
            this.f19069u = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + l0() + I());
    }

    public void c0() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 7) {
            this.f19069u = 0;
            int[] iArr = this.B;
            int i11 = this.f19074z - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + l0() + I());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19069u = 0;
        this.f19073y[0] = 8;
        this.f19074z = 1;
        this.f19062f.close();
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = this.f19074z;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f19073y[i11];
            if (i12 != 1 && i12 != 2) {
                if (i12 == 3 || i12 == 4 || i12 == 5) {
                    sb2.append('.');
                    String str = this.A[i11];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.B[i11]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    public String i0() throws IOException {
        String str;
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 10) {
            str = k0();
        } else if (i10 == 8) {
            str = f0('\'');
        } else if (i10 == 9) {
            str = f0('\"');
        } else if (i10 == 11) {
            str = this.f19072x;
            this.f19072x = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f19070v);
        } else if (i10 == 16) {
            str = new String(this.f19064p, this.f19065q, this.f19071w);
            this.f19065q += this.f19071w;
        } else {
            throw new IllegalStateException("Expected a string but was " + l0() + I());
        }
        this.f19069u = 0;
        int[] iArr = this.B;
        int i11 = this.f19074z - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    int j() throws IOException {
        int Y;
        int[] iArr = this.f19073y;
        int i10 = this.f19074z;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int Y2 = Y(true);
            if (Y2 != 44) {
                if (Y2 != 59) {
                    if (Y2 == 93) {
                        this.f19069u = 4;
                        return 4;
                    }
                    throw J0("Unterminated array");
                }
                d();
            }
        } else if (i11 != 3 && i11 != 5) {
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int Y3 = Y(true);
                if (Y3 != 58) {
                    if (Y3 == 61) {
                        d();
                        if (this.f19065q < this.f19066r || x(1)) {
                            char[] cArr = this.f19064p;
                            int i12 = this.f19065q;
                            if (cArr[i12] == '>') {
                                this.f19065q = i12 + 1;
                            }
                        }
                    } else {
                        throw J0("Expected ':'");
                    }
                }
            } else if (i11 == 6) {
                if (this.f19063m) {
                    e();
                }
                this.f19073y[this.f19074z - 1] = 7;
            } else if (i11 == 7) {
                if (Y(false) == -1) {
                    this.f19069u = 17;
                    return 17;
                }
                d();
                this.f19065q--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i10 - 1] = 4;
            if (i11 == 5 && (Y = Y(true)) != 44) {
                if (Y != 59) {
                    if (Y == 125) {
                        this.f19069u = 2;
                        return 2;
                    }
                    throw J0("Unterminated object");
                }
                d();
            }
            int Y4 = Y(true);
            if (Y4 != 34) {
                if (Y4 != 39) {
                    if (Y4 != 125) {
                        d();
                        this.f19065q--;
                        if (E((char) Y4)) {
                            this.f19069u = 14;
                            return 14;
                        }
                        throw J0("Expected name");
                    } else if (i11 != 5) {
                        this.f19069u = 2;
                        return 2;
                    } else {
                        throw J0("Expected name");
                    }
                }
                d();
                this.f19069u = 12;
                return 12;
            }
            this.f19069u = 13;
            return 13;
        }
        int Y5 = Y(true);
        if (Y5 != 34) {
            if (Y5 != 39) {
                if (Y5 != 44 && Y5 != 59) {
                    if (Y5 != 91) {
                        if (Y5 != 93) {
                            if (Y5 != 123) {
                                this.f19065q--;
                                int p02 = p0();
                                if (p02 != 0) {
                                    return p02;
                                }
                                int q02 = q0();
                                if (q02 != 0) {
                                    return q02;
                                }
                                if (E(this.f19064p[this.f19065q])) {
                                    d();
                                    this.f19069u = 10;
                                    return 10;
                                }
                                throw J0("Expected value");
                            }
                            this.f19069u = 1;
                            return 1;
                        } else if (i11 == 1) {
                            this.f19069u = 4;
                            return 4;
                        }
                    } else {
                        this.f19069u = 3;
                        return 3;
                    }
                }
                if (i11 != 1 && i11 != 2) {
                    throw J0("Unexpected value");
                }
                d();
                this.f19065q--;
                this.f19069u = 7;
                return 7;
            }
            d();
            this.f19069u = 8;
            return 8;
        }
        this.f19069u = 9;
        return 9;
    }

    public b l0() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        switch (i10) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public void m() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 4) {
            int i11 = this.f19074z - 1;
            this.f19074z = i11;
            int[] iArr = this.B;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f19069u = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + l0() + I());
    }

    public void q() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 == 2) {
            int i11 = this.f19074z - 1;
            this.f19074z = i11;
            this.A[i11] = null;
            int[] iArr = this.B;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
            this.f19069u = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + l0() + I());
    }

    public String toString() {
        return getClass().getSimpleName() + I();
    }

    public boolean z() throws IOException {
        int i10 = this.f19069u;
        if (i10 == 0) {
            i10 = j();
        }
        if (i10 != 2 && i10 != 4) {
            return true;
        }
        return false;
    }

    public final void z0(boolean z10) {
        this.f19063m = z10;
    }
}
