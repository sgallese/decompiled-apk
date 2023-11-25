package x;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import n1.y0;
import v0.b;

/* compiled from: LazyListMeasuredItem.kt */
/* loaded from: classes.dex */
public final class u implements l {

    /* renamed from: a  reason: collision with root package name */
    private final int f25652a;

    /* renamed from: b  reason: collision with root package name */
    private final List<y0> f25653b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f25654c;

    /* renamed from: d  reason: collision with root package name */
    private final b.InterfaceC0571b f25655d;

    /* renamed from: e  reason: collision with root package name */
    private final b.c f25656e;

    /* renamed from: f  reason: collision with root package name */
    private final j2.r f25657f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f25658g;

    /* renamed from: h  reason: collision with root package name */
    private final int f25659h;

    /* renamed from: i  reason: collision with root package name */
    private final int f25660i;

    /* renamed from: j  reason: collision with root package name */
    private final int f25661j;

    /* renamed from: k  reason: collision with root package name */
    private final long f25662k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f25663l;

    /* renamed from: m  reason: collision with root package name */
    private final Object f25664m;

    /* renamed from: n  reason: collision with root package name */
    private int f25665n;

    /* renamed from: o  reason: collision with root package name */
    private final int f25666o;

    /* renamed from: p  reason: collision with root package name */
    private final int f25667p;

    /* renamed from: q  reason: collision with root package name */
    private final int f25668q;

    /* renamed from: r  reason: collision with root package name */
    private int f25669r;

    /* renamed from: s  reason: collision with root package name */
    private int f25670s;

    /* renamed from: t  reason: collision with root package name */
    private int f25671t;

    /* renamed from: u  reason: collision with root package name */
    private final int[] f25672u;

    public /* synthetic */ u(int i10, List list, boolean z10, b.InterfaceC0571b interfaceC0571b, b.c cVar, j2.r rVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, qc.h hVar) {
        this(i10, list, z10, interfaceC0571b, cVar, rVar, z11, i11, i12, i13, j10, obj, obj2);
    }

    private final int c(long j10) {
        if (this.f25654c) {
            return j2.l.k(j10);
        }
        return j2.l.j(j10);
    }

    private final int d(y0 y0Var) {
        if (this.f25654c) {
            return y0Var.l0();
        }
        return y0Var.A0();
    }

    public final int a() {
        return this.f25668q;
    }

    public Object b() {
        return this.f25663l;
    }

    public int e() {
        return this.f25665n;
    }

    public final long f(int i10) {
        int[] iArr = this.f25672u;
        int i11 = i10 * 2;
        return j2.m.a(iArr[i11], iArr[i11 + 1]);
    }

    public final Object g(int i10) {
        return this.f25653b.get(i10).A();
    }

    @Override // x.l
    public int getIndex() {
        return this.f25652a;
    }

    public final int h() {
        return this.f25653b.size();
    }

    public int i() {
        return this.f25666o;
    }

    public final int j() {
        return this.f25667p;
    }

    public final boolean k() {
        return this.f25654c;
    }

    public final void l(y0.a aVar) {
        boolean z10;
        y.e eVar;
        int j10;
        int k10;
        qc.q.i(aVar, "scope");
        if (this.f25669r != Integer.MIN_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int h10 = h();
            for (int i10 = 0; i10 < h10; i10++) {
                y0 y0Var = this.f25653b.get(i10);
                int d10 = this.f25670s - d(y0Var);
                int i11 = this.f25671t;
                long f10 = f(i10);
                Object g10 = g(i10);
                if (g10 instanceof y.e) {
                    eVar = (y.e) g10;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    long P1 = eVar.P1();
                    long a10 = j2.m.a(j2.l.j(f10) + j2.l.j(P1), j2.l.k(f10) + j2.l.k(P1));
                    if ((c(f10) <= d10 && c(a10) <= d10) || (c(f10) >= i11 && c(a10) >= i11)) {
                        eVar.N1();
                    }
                    f10 = a10;
                }
                if (this.f25658g) {
                    if (this.f25654c) {
                        j10 = j2.l.j(f10);
                    } else {
                        j10 = (this.f25669r - j2.l.j(f10)) - d(y0Var);
                    }
                    if (this.f25654c) {
                        k10 = (this.f25669r - j2.l.k(f10)) - d(y0Var);
                    } else {
                        k10 = j2.l.k(f10);
                    }
                    f10 = j2.m.a(j10, k10);
                }
                long j11 = this.f25662k;
                long a11 = j2.m.a(j2.l.j(f10) + j2.l.j(j11), j2.l.k(f10) + j2.l.k(j11));
                if (this.f25654c) {
                    y0.a.z(aVar, y0Var, a11, 0.0f, null, 6, null);
                } else {
                    y0.a.v(aVar, y0Var, a11, 0.0f, null, 6, null);
                }
            }
            return;
        }
        throw new IllegalArgumentException("position() should be called first".toString());
    }

    public final void m(int i10, int i11, int i12) {
        int i13;
        int A0;
        this.f25665n = i10;
        if (this.f25654c) {
            i13 = i12;
        } else {
            i13 = i11;
        }
        this.f25669r = i13;
        List<y0> list = this.f25653b;
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            y0 y0Var = list.get(i14);
            int i15 = i14 * 2;
            if (this.f25654c) {
                int[] iArr = this.f25672u;
                b.InterfaceC0571b interfaceC0571b = this.f25655d;
                if (interfaceC0571b != null) {
                    iArr[i15] = interfaceC0571b.a(y0Var.A0(), i11, this.f25657f);
                    this.f25672u[i15 + 1] = i10;
                    A0 = y0Var.l0();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                int[] iArr2 = this.f25672u;
                iArr2[i15] = i10;
                int i16 = i15 + 1;
                b.c cVar = this.f25656e;
                if (cVar != null) {
                    iArr2[i16] = cVar.a(y0Var.l0(), i12);
                    A0 = y0Var.A0();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            i10 += A0;
        }
        this.f25670s = -this.f25659h;
        this.f25671t = this.f25669r + this.f25660i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private u(int i10, List<? extends y0> list, boolean z10, b.InterfaceC0571b interfaceC0571b, b.c cVar, j2.r rVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2) {
        int d10;
        qc.q.i(list, "placeables");
        qc.q.i(rVar, "layoutDirection");
        qc.q.i(obj, "key");
        this.f25652a = i10;
        this.f25653b = list;
        this.f25654c = z10;
        this.f25655d = interfaceC0571b;
        this.f25656e = cVar;
        this.f25657f = rVar;
        this.f25658g = z11;
        this.f25659h = i11;
        this.f25660i = i12;
        this.f25661j = i13;
        this.f25662k = j10;
        this.f25663l = obj;
        this.f25664m = obj2;
        this.f25669r = RecyclerView.UNDEFINED_DURATION;
        int size = list.size();
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            y0 y0Var = (y0) list.get(i16);
            i14 += this.f25654c ? y0Var.l0() : y0Var.A0();
            i15 = Math.max(i15, !this.f25654c ? y0Var.l0() : y0Var.A0());
        }
        this.f25666o = i14;
        d10 = vc.l.d(i() + this.f25661j, 0);
        this.f25667p = d10;
        this.f25668q = i15;
        this.f25672u = new int[this.f25653b.size() * 2];
    }
}
