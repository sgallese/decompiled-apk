package okio;

import java.util.Arrays;

/* compiled from: Segment.kt */
/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: h  reason: collision with root package name */
    public static final a f20686h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f20687a;

    /* renamed from: b  reason: collision with root package name */
    public int f20688b;

    /* renamed from: c  reason: collision with root package name */
    public int f20689c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20690d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20691e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f20692f;

    /* renamed from: g  reason: collision with root package name */
    public v0 f20693g;

    /* compiled from: Segment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public v0() {
        this.f20687a = new byte[8192];
        this.f20691e = true;
        this.f20690d = false;
    }

    public final void a() {
        boolean z10;
        v0 v0Var = this.f20693g;
        int i10 = 0;
        if (v0Var != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            qc.q.f(v0Var);
            if (!v0Var.f20691e) {
                return;
            }
            int i11 = this.f20689c - this.f20688b;
            v0 v0Var2 = this.f20693g;
            qc.q.f(v0Var2);
            int i12 = 8192 - v0Var2.f20689c;
            v0 v0Var3 = this.f20693g;
            qc.q.f(v0Var3);
            if (!v0Var3.f20690d) {
                v0 v0Var4 = this.f20693g;
                qc.q.f(v0Var4);
                i10 = v0Var4.f20688b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            v0 v0Var5 = this.f20693g;
            qc.q.f(v0Var5);
            g(v0Var5, i11);
            b();
            w0.b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    public final v0 b() {
        v0 v0Var = this.f20692f;
        if (v0Var == this) {
            v0Var = null;
        }
        v0 v0Var2 = this.f20693g;
        qc.q.f(v0Var2);
        v0Var2.f20692f = this.f20692f;
        v0 v0Var3 = this.f20692f;
        qc.q.f(v0Var3);
        v0Var3.f20693g = this.f20693g;
        this.f20692f = null;
        this.f20693g = null;
        return v0Var;
    }

    public final v0 c(v0 v0Var) {
        qc.q.i(v0Var, "segment");
        v0Var.f20693g = this;
        v0Var.f20692f = this.f20692f;
        v0 v0Var2 = this.f20692f;
        qc.q.f(v0Var2);
        v0Var2.f20693g = v0Var;
        this.f20692f = v0Var;
        return v0Var;
    }

    public final v0 d() {
        this.f20690d = true;
        return new v0(this.f20687a, this.f20688b, this.f20689c, true, false);
    }

    public final v0 e(int i10) {
        boolean z10;
        v0 c10;
        if (i10 > 0 && i10 <= this.f20689c - this.f20688b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 1024) {
                c10 = d();
            } else {
                c10 = w0.c();
                byte[] bArr = this.f20687a;
                byte[] bArr2 = c10.f20687a;
                int i11 = this.f20688b;
                ec.o.j(bArr, bArr2, 0, i11, i11 + i10, 2, null);
            }
            c10.f20689c = c10.f20688b + i10;
            this.f20688b += i10;
            v0 v0Var = this.f20693g;
            qc.q.f(v0Var);
            v0Var.c(c10);
            return c10;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    public final v0 f() {
        byte[] bArr = this.f20687a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        qc.q.h(copyOf, "copyOf(this, size)");
        return new v0(copyOf, this.f20688b, this.f20689c, false, true);
    }

    public final void g(v0 v0Var, int i10) {
        qc.q.i(v0Var, "sink");
        if (v0Var.f20691e) {
            int i11 = v0Var.f20689c;
            if (i11 + i10 > 8192) {
                if (!v0Var.f20690d) {
                    int i12 = v0Var.f20688b;
                    if ((i11 + i10) - i12 <= 8192) {
                        byte[] bArr = v0Var.f20687a;
                        ec.o.j(bArr, bArr, 0, i12, i11, 2, null);
                        v0Var.f20689c -= v0Var.f20688b;
                        v0Var.f20688b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f20687a;
            byte[] bArr3 = v0Var.f20687a;
            int i13 = v0Var.f20689c;
            int i14 = this.f20688b;
            ec.o.d(bArr2, bArr3, i13, i14, i14 + i10);
            v0Var.f20689c += i10;
            this.f20688b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public v0(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        qc.q.i(bArr, "data");
        this.f20687a = bArr;
        this.f20688b = i10;
        this.f20689c = i11;
        this.f20690d = z10;
        this.f20691e = z11;
    }
}
