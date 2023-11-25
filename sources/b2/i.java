package b2;

/* compiled from: EditingBuffer.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: f  reason: collision with root package name */
    public static final a f7774f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f7775g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final y f7776a;

    /* renamed from: b  reason: collision with root package name */
    private int f7777b;

    /* renamed from: c  reason: collision with root package name */
    private int f7778c;

    /* renamed from: d  reason: collision with root package name */
    private int f7779d;

    /* renamed from: e  reason: collision with root package name */
    private int f7780e;

    /* compiled from: EditingBuffer.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ i(v1.d dVar, long j10, qc.h hVar) {
        this(dVar, j10);
    }

    private final void q(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f7778c = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionEnd to a negative value: " + i10).toString());
    }

    private final void r(int i10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f7777b = i10;
            return;
        }
        throw new IllegalArgumentException(("Cannot set selectionStart to a negative value: " + i10).toString());
    }

    public final void a() {
        this.f7779d = -1;
        this.f7780e = -1;
    }

    public final void b(int i10, int i11) {
        long b10 = v1.j0.b(i10, i11);
        this.f7776a.c(i10, i11, "");
        long a10 = j.a(v1.j0.b(this.f7777b, this.f7778c), b10);
        r(v1.i0.l(a10));
        q(v1.i0.k(a10));
        if (l()) {
            long a11 = j.a(v1.j0.b(this.f7779d, this.f7780e), b10);
            if (v1.i0.h(a11)) {
                a();
                return;
            }
            this.f7779d = v1.i0.l(a11);
            this.f7780e = v1.i0.k(a11);
        }
    }

    public final char c(int i10) {
        return this.f7776a.a(i10);
    }

    public final v1.i0 d() {
        if (l()) {
            return v1.i0.b(v1.j0.b(this.f7779d, this.f7780e));
        }
        return null;
    }

    public final int e() {
        return this.f7780e;
    }

    public final int f() {
        return this.f7779d;
    }

    public final int g() {
        int i10 = this.f7777b;
        int i11 = this.f7778c;
        if (i10 != i11) {
            return -1;
        }
        return i11;
    }

    public final int h() {
        return this.f7776a.b();
    }

    public final long i() {
        return v1.j0.b(this.f7777b, this.f7778c);
    }

    public final int j() {
        return this.f7778c;
    }

    public final int k() {
        return this.f7777b;
    }

    public final boolean l() {
        if (this.f7779d != -1) {
            return true;
        }
        return false;
    }

    public final void m(int i10, int i11, String str) {
        qc.q.i(str, "text");
        if (i10 >= 0 && i10 <= this.f7776a.b()) {
            if (i11 >= 0 && i11 <= this.f7776a.b()) {
                if (i10 <= i11) {
                    this.f7776a.c(i10, i11, str);
                    r(str.length() + i10);
                    q(i10 + str.length());
                    this.f7779d = -1;
                    this.f7780e = -1;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
            }
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f7776a.b());
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f7776a.b());
    }

    public final void n(int i10, int i11) {
        if (i10 >= 0 && i10 <= this.f7776a.b()) {
            if (i11 >= 0 && i11 <= this.f7776a.b()) {
                if (i10 < i11) {
                    this.f7779d = i10;
                    this.f7780e = i11;
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
            }
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f7776a.b());
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f7776a.b());
    }

    public final void o(int i10) {
        p(i10, i10);
    }

    public final void p(int i10, int i11) {
        if (i10 >= 0 && i10 <= this.f7776a.b()) {
            if (i11 >= 0 && i11 <= this.f7776a.b()) {
                if (i10 <= i11) {
                    r(i10);
                    q(i11);
                    return;
                }
                throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
            }
            throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f7776a.b());
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f7776a.b());
    }

    public final v1.d s() {
        return new v1.d(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f7776a.toString();
    }

    private i(v1.d dVar, long j10) {
        qc.q.i(dVar, "text");
        this.f7776a = new y(dVar.i());
        this.f7777b = v1.i0.l(j10);
        this.f7778c = v1.i0.k(j10);
        this.f7779d = -1;
        this.f7780e = -1;
        int l10 = v1.i0.l(j10);
        int k10 = v1.i0.k(j10);
        if (l10 >= 0 && l10 <= dVar.length()) {
            if (k10 < 0 || k10 > dVar.length()) {
                throw new IndexOutOfBoundsException("end (" + k10 + ") offset is outside of text region " + dVar.length());
            } else if (l10 <= k10) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + l10 + " > " + k10);
            }
        }
        throw new IndexOutOfBoundsException("start (" + l10 + ") offset is outside of text region " + dVar.length());
    }
}
