package j0;

import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: SlotTable.kt */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a  reason: collision with root package name */
    private final k2 f18661a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f18662b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18663c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f18664d;

    /* renamed from: e  reason: collision with root package name */
    private final int f18665e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f18666f;

    /* renamed from: g  reason: collision with root package name */
    private int f18667g;

    /* renamed from: h  reason: collision with root package name */
    private int f18668h;

    /* renamed from: i  reason: collision with root package name */
    private int f18669i;

    /* renamed from: j  reason: collision with root package name */
    private int f18670j;

    /* renamed from: k  reason: collision with root package name */
    private int f18671k;

    /* renamed from: l  reason: collision with root package name */
    private int f18672l;

    public j2(k2 k2Var) {
        qc.q.i(k2Var, "table");
        this.f18661a = k2Var;
        this.f18662b = k2Var.k();
        int l10 = k2Var.l();
        this.f18663c = l10;
        this.f18664d = k2Var.m();
        this.f18665e = k2Var.n();
        this.f18668h = l10;
        this.f18669i = -1;
    }

    private final Object K(int[] iArr, int i10) {
        if (m2.l(iArr, i10)) {
            return this.f18664d[m2.p(iArr, i10)];
        }
        return l.f18688a.a();
    }

    private final Object M(int[] iArr, int i10) {
        if (m2.j(iArr, i10)) {
            return this.f18664d[m2.q(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        if (m2.h(iArr, i10)) {
            return this.f18664d[m2.a(iArr, i10)];
        }
        return l.f18688a.a();
    }

    public final int A(int i10) {
        return m2.m(this.f18662b, i10);
    }

    public final Object B(int i10) {
        return M(this.f18662b, i10);
    }

    public final int C(int i10) {
        return m2.g(this.f18662b, i10);
    }

    public final boolean D(int i10) {
        return m2.i(this.f18662b, i10);
    }

    public final boolean E(int i10) {
        return m2.j(this.f18662b, i10);
    }

    public final boolean F() {
        if (!s() && this.f18667g != this.f18668h) {
            return false;
        }
        return true;
    }

    public final boolean G() {
        return m2.l(this.f18662b, this.f18667g);
    }

    public final boolean H(int i10) {
        return m2.l(this.f18662b, i10);
    }

    public final Object I() {
        int i10;
        if (this.f18670j <= 0 && (i10 = this.f18671k) < this.f18672l) {
            Object[] objArr = this.f18664d;
            this.f18671k = i10 + 1;
            return objArr[i10];
        }
        return l.f18688a.a();
    }

    public final Object J(int i10) {
        if (m2.l(this.f18662b, i10)) {
            return K(this.f18662b, i10);
        }
        return null;
    }

    public final int L(int i10) {
        return m2.o(this.f18662b, i10);
    }

    public final int N(int i10) {
        return m2.r(this.f18662b, i10);
    }

    public final void O(int i10) {
        boolean z10;
        int i11;
        if (this.f18670j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18667g = i10;
            if (i10 < this.f18663c) {
                i11 = m2.r(this.f18662b, i10);
            } else {
                i11 = -1;
            }
            this.f18669i = i11;
            if (i11 < 0) {
                this.f18668h = this.f18663c;
            } else {
                this.f18668h = i11 + m2.g(this.f18662b, i11);
            }
            this.f18671k = 0;
            this.f18672l = 0;
            return;
        }
        n.w("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void P(int i10) {
        boolean z10;
        int g10 = m2.g(this.f18662b, i10) + i10;
        int i11 = this.f18667g;
        if (i11 >= i10 && i11 <= g10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18669i = i10;
            this.f18668h = g10;
            this.f18671k = 0;
            this.f18672l = 0;
            return;
        }
        n.w(("Index " + i10 + " is not a parent of " + i11).toString());
        throw new KotlinNothingValueException();
    }

    public final int Q() {
        boolean z10;
        int i10 = 1;
        if (this.f18670j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!m2.l(this.f18662b, this.f18667g)) {
                i10 = m2.o(this.f18662b, this.f18667g);
            }
            int i11 = this.f18667g;
            this.f18667g = i11 + m2.g(this.f18662b, i11);
            return i10;
        }
        n.w("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    public final void R() {
        boolean z10;
        if (this.f18670j == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18667g = this.f18668h;
        } else {
            n.w("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final void S() {
        boolean z10;
        int e10;
        if (this.f18670j <= 0) {
            if (m2.r(this.f18662b, this.f18667g) == this.f18669i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = this.f18667g;
                this.f18669i = i10;
                this.f18668h = i10 + m2.g(this.f18662b, i10);
                int i11 = this.f18667g;
                int i12 = i11 + 1;
                this.f18667g = i12;
                this.f18671k = m2.t(this.f18662b, i11);
                if (i11 >= this.f18663c - 1) {
                    e10 = this.f18665e;
                } else {
                    e10 = m2.e(this.f18662b, i12);
                }
                this.f18672l = e10;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void T() {
        if (this.f18670j <= 0) {
            if (m2.l(this.f18662b, this.f18667g)) {
                S();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    public final d a(int i10) {
        ArrayList<d> j10 = this.f18661a.j();
        int s10 = m2.s(j10, i10, this.f18663c);
        if (s10 < 0) {
            d dVar = new d(i10);
            j10.add(-(s10 + 1), dVar);
            return dVar;
        }
        d dVar2 = j10.get(s10);
        qc.q.h(dVar2, "get(location)");
        return dVar2;
    }

    public final void c() {
        this.f18670j++;
    }

    public final void d() {
        this.f18666f = true;
        this.f18661a.f(this);
    }

    public final boolean e(int i10) {
        return m2.c(this.f18662b, i10);
    }

    public final void f() {
        boolean z10;
        int i10 = this.f18670j;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18670j = i10 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void g() {
        boolean z10;
        int g10;
        if (this.f18670j == 0) {
            if (this.f18667g == this.f18668h) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int r10 = m2.r(this.f18662b, this.f18669i);
                this.f18669i = r10;
                if (r10 < 0) {
                    g10 = this.f18663c;
                } else {
                    g10 = r10 + m2.g(this.f18662b, r10);
                }
                this.f18668h = g10;
                return;
            }
            n.w("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final List<r0> h() {
        int o10;
        ArrayList arrayList = new ArrayList();
        if (this.f18670j > 0) {
            return arrayList;
        }
        int i10 = this.f18667g;
        int i11 = 0;
        while (i10 < this.f18668h) {
            int m10 = m2.m(this.f18662b, i10);
            Object M = M(this.f18662b, i10);
            if (m2.l(this.f18662b, i10)) {
                o10 = 1;
            } else {
                o10 = m2.o(this.f18662b, i10);
            }
            arrayList.add(new r0(m10, M, i10, o10, i11));
            i10 += m2.g(this.f18662b, i10);
            i11++;
        }
        return arrayList;
    }

    public final void i(int i10, pc.p<? super Integer, Object, dc.w> pVar) {
        int n10;
        qc.q.i(pVar, "block");
        int t10 = m2.t(this.f18662b, i10);
        int i11 = i10 + 1;
        if (i11 < this.f18661a.l()) {
            n10 = m2.e(this.f18661a.k(), i11);
        } else {
            n10 = this.f18661a.n();
        }
        for (int i12 = t10; i12 < n10; i12++) {
            pVar.invoke(Integer.valueOf(i12 - t10), this.f18664d[i12]);
        }
    }

    public final boolean j() {
        return this.f18666f;
    }

    public final int k() {
        return this.f18668h;
    }

    public final int l() {
        return this.f18667g;
    }

    public final Object m() {
        int i10 = this.f18667g;
        if (i10 < this.f18668h) {
            return b(this.f18662b, i10);
        }
        return 0;
    }

    public final int n() {
        return this.f18668h;
    }

    public final int o() {
        int i10 = this.f18667g;
        if (i10 < this.f18668h) {
            return m2.m(this.f18662b, i10);
        }
        return 0;
    }

    public final Object p() {
        int i10 = this.f18667g;
        if (i10 < this.f18668h) {
            return M(this.f18662b, i10);
        }
        return null;
    }

    public final int q() {
        return m2.g(this.f18662b, this.f18667g);
    }

    public final int r() {
        return this.f18671k - m2.t(this.f18662b, this.f18669i);
    }

    public final boolean s() {
        if (this.f18670j > 0) {
            return true;
        }
        return false;
    }

    public final int t() {
        return this.f18669i;
    }

    public String toString() {
        return "SlotReader(current=" + this.f18667g + ", key=" + o() + ", parent=" + this.f18669i + ", end=" + this.f18668h + ')';
    }

    public final int u() {
        int i10 = this.f18669i;
        if (i10 >= 0) {
            return m2.o(this.f18662b, i10);
        }
        return 0;
    }

    public final int v() {
        return this.f18663c;
    }

    public final k2 w() {
        return this.f18661a;
    }

    public final Object x(int i10) {
        return b(this.f18662b, i10);
    }

    public final Object y(int i10) {
        return z(this.f18667g, i10);
    }

    public final Object z(int i10, int i11) {
        int i12;
        int t10 = m2.t(this.f18662b, i10);
        int i13 = i10 + 1;
        if (i13 < this.f18663c) {
            i12 = m2.e(this.f18662b, i13);
        } else {
            i12 = this.f18665e;
        }
        int i14 = t10 + i11;
        if (i14 < i12) {
            return this.f18664d[i14];
        }
        return l.f18688a.a();
    }
}
