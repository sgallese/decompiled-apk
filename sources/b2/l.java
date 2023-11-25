package b2;

/* compiled from: GapBuffer.kt */
/* loaded from: classes.dex */
final class l {

    /* renamed from: a  reason: collision with root package name */
    private int f7790a;

    /* renamed from: b  reason: collision with root package name */
    private char[] f7791b;

    /* renamed from: c  reason: collision with root package name */
    private int f7792c;

    /* renamed from: d  reason: collision with root package name */
    private int f7793d;

    public l(char[] cArr, int i10, int i11) {
        qc.q.i(cArr, "initBuffer");
        this.f7790a = cArr.length;
        this.f7791b = cArr;
        this.f7792c = i10;
        this.f7793d = i11;
    }

    private final void b(int i10, int i11) {
        int i12 = this.f7792c;
        if (i10 < i12 && i11 <= i12) {
            int i13 = i12 - i11;
            char[] cArr = this.f7791b;
            ec.o.e(cArr, cArr, this.f7793d - i13, i11, i12);
            this.f7792c = i10;
            this.f7793d -= i13;
        } else if (i10 < i12 && i11 >= i12) {
            this.f7793d = i11 + c();
            this.f7792c = i10;
        } else {
            int c10 = i10 + c();
            int c11 = i11 + c();
            int i14 = this.f7793d;
            int i15 = c10 - i14;
            char[] cArr2 = this.f7791b;
            ec.o.e(cArr2, cArr2, this.f7792c, i14, c10);
            this.f7792c += i15;
            this.f7793d = c11;
        }
    }

    private final int c() {
        return this.f7793d - this.f7792c;
    }

    private final void f(int i10) {
        if (i10 <= c()) {
            return;
        }
        int c10 = i10 - c();
        int i11 = this.f7790a;
        do {
            i11 *= 2;
        } while (i11 - this.f7790a < c10);
        char[] cArr = new char[i11];
        ec.o.e(this.f7791b, cArr, 0, 0, this.f7792c);
        int i12 = this.f7790a;
        int i13 = this.f7793d;
        int i14 = i12 - i13;
        int i15 = i11 - i14;
        ec.o.e(this.f7791b, cArr, i15, i13, i14 + i13);
        this.f7791b = cArr;
        this.f7790a = i11;
        this.f7793d = i15;
    }

    public final void a(StringBuilder sb2) {
        qc.q.i(sb2, "builder");
        sb2.append(this.f7791b, 0, this.f7792c);
        char[] cArr = this.f7791b;
        int i10 = this.f7793d;
        sb2.append(cArr, i10, this.f7790a - i10);
    }

    public final char d(int i10) {
        int i11 = this.f7792c;
        if (i10 < i11) {
            return this.f7791b[i10];
        }
        return this.f7791b[(i10 - i11) + this.f7793d];
    }

    public final int e() {
        return this.f7790a - c();
    }

    public final void g(int i10, int i11, String str) {
        qc.q.i(str, "text");
        f(str.length() - (i11 - i10));
        b(i10, i11);
        m.b(str, this.f7791b, this.f7792c);
        this.f7792c += str.length();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb2);
        String sb3 = sb2.toString();
        qc.q.h(sb3, "StringBuilder().apply { append(this) }.toString()");
        return sb3;
    }
}
