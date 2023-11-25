package b2;

/* compiled from: GapBuffer.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7866e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f7867f = 8;

    /* renamed from: a  reason: collision with root package name */
    private String f7868a;

    /* renamed from: b  reason: collision with root package name */
    private l f7869b;

    /* renamed from: c  reason: collision with root package name */
    private int f7870c;

    /* renamed from: d  reason: collision with root package name */
    private int f7871d;

    /* compiled from: GapBuffer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public y(String str) {
        qc.q.i(str, "text");
        this.f7868a = str;
        this.f7870c = -1;
        this.f7871d = -1;
    }

    public final char a(int i10) {
        l lVar = this.f7869b;
        if (lVar == null) {
            return this.f7868a.charAt(i10);
        }
        if (i10 < this.f7870c) {
            return this.f7868a.charAt(i10);
        }
        int e10 = lVar.e();
        int i11 = this.f7870c;
        if (i10 < e10 + i11) {
            return lVar.d(i10 - i11);
        }
        return this.f7868a.charAt(i10 - ((e10 - this.f7871d) + i11));
    }

    public final int b() {
        l lVar = this.f7869b;
        if (lVar == null) {
            return this.f7868a.length();
        }
        return (this.f7868a.length() - (this.f7871d - this.f7870c)) + lVar.e();
    }

    public final void c(int i10, int i11, String str) {
        boolean z10;
        qc.q.i(str, "text");
        boolean z11 = true;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 < 0) {
                z11 = false;
            }
            if (z11) {
                l lVar = this.f7869b;
                if (lVar == null) {
                    int max = Math.max(255, str.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i10, 64);
                    int min2 = Math.min(this.f7868a.length() - i11, 64);
                    int i12 = i10 - min;
                    n.a(this.f7868a, cArr, 0, i12, i10);
                    int i13 = max - min2;
                    int i14 = min2 + i11;
                    n.a(this.f7868a, cArr, i13, i11, i14);
                    m.b(str, cArr, min);
                    this.f7869b = new l(cArr, min + str.length(), i13);
                    this.f7870c = i12;
                    this.f7871d = i14;
                    return;
                }
                int i15 = this.f7870c;
                int i16 = i10 - i15;
                int i17 = i11 - i15;
                if (i16 >= 0 && i17 <= lVar.e()) {
                    lVar.g(i16, i17, str);
                    return;
                }
                this.f7868a = toString();
                this.f7869b = null;
                this.f7870c = -1;
                this.f7871d = -1;
                c(i10, i11, str);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i10).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i10 + " > " + i11).toString());
    }

    public String toString() {
        l lVar = this.f7869b;
        if (lVar == null) {
            return this.f7868a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f7868a, 0, this.f7870c);
        lVar.a(sb2);
        String str = this.f7868a;
        sb2.append((CharSequence) str, this.f7871d, str.length());
        String sb3 = sb2.toString();
        qc.q.h(sb3, "sb.toString()");
        return sb3;
    }
}
