package n2;

import java.util.Arrays;
import java.util.HashMap;
import n2.i;
import o2.d;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: q  reason: collision with root package name */
    private static int f20071q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static boolean f20072r = true;

    /* renamed from: s  reason: collision with root package name */
    public static long f20073s;

    /* renamed from: t  reason: collision with root package name */
    public static long f20074t;

    /* renamed from: c  reason: collision with root package name */
    private a f20077c;

    /* renamed from: f  reason: collision with root package name */
    n2.b[] f20080f;

    /* renamed from: m  reason: collision with root package name */
    final c f20087m;

    /* renamed from: p  reason: collision with root package name */
    private a f20090p;

    /* renamed from: a  reason: collision with root package name */
    int f20075a = 0;

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, i> f20076b = null;

    /* renamed from: d  reason: collision with root package name */
    private int f20078d = 32;

    /* renamed from: e  reason: collision with root package name */
    private int f20079e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20081g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20082h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean[] f20083i = new boolean[32];

    /* renamed from: j  reason: collision with root package name */
    int f20084j = 1;

    /* renamed from: k  reason: collision with root package name */
    int f20085k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f20086l = 32;

    /* renamed from: n  reason: collision with root package name */
    private i[] f20088n = new i[f20071q];

    /* renamed from: o  reason: collision with root package name */
    private int f20089o = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public class b extends n2.b {
        public b(c cVar) {
            this.f20065e = new j(this, cVar);
        }
    }

    public d() {
        this.f20080f = null;
        this.f20080f = new n2.b[32];
        C();
        c cVar = new c();
        this.f20087m = cVar;
        this.f20077c = new h(cVar);
        if (f20072r) {
            this.f20090p = new b(cVar);
        } else {
            this.f20090p = new n2.b(cVar);
        }
    }

    private final int B(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f20084j; i10++) {
            this.f20083i[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f20084j * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f20083i[aVar.getKey().f20107c] = true;
            }
            i b10 = aVar.b(this, this.f20083i);
            if (b10 != null) {
                boolean[] zArr = this.f20083i;
                int i12 = b10.f20107c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f20085k; i14++) {
                    n2.b bVar = this.f20080f[i14];
                    if (bVar.f20061a.f20114j != i.a.UNRESTRICTED && !bVar.f20066f && bVar.t(b10)) {
                        float e10 = bVar.f20065e.e(b10);
                        if (e10 < 0.0f) {
                            float f11 = (-bVar.f20062b) / e10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    n2.b bVar2 = this.f20080f[i13];
                    bVar2.f20061a.f20108d = -1;
                    bVar2.y(b10);
                    i iVar = bVar2.f20061a;
                    iVar.f20108d = i13;
                    iVar.g(bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void C() {
        int i10 = 0;
        if (f20072r) {
            while (true) {
                n2.b[] bVarArr = this.f20080f;
                if (i10 < bVarArr.length) {
                    n2.b bVar = bVarArr[i10];
                    if (bVar != null) {
                        this.f20087m.f20067a.a(bVar);
                    }
                    this.f20080f[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                n2.b[] bVarArr2 = this.f20080f;
                if (i10 < bVarArr2.length) {
                    n2.b bVar2 = bVarArr2[i10];
                    if (bVar2 != null) {
                        this.f20087m.f20068b.a(bVar2);
                    }
                    this.f20080f[i10] = null;
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private i a(i.a aVar, String str) {
        i b10 = this.f20087m.f20069c.b();
        if (b10 == null) {
            b10 = new i(aVar, str);
            b10.f(aVar, str);
        } else {
            b10.d();
            b10.f(aVar, str);
        }
        int i10 = this.f20089o;
        int i11 = f20071q;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            f20071q = i12;
            this.f20088n = (i[]) Arrays.copyOf(this.f20088n, i12);
        }
        i[] iVarArr = this.f20088n;
        int i13 = this.f20089o;
        this.f20089o = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private final void l(n2.b bVar) {
        if (f20072r) {
            n2.b bVar2 = this.f20080f[this.f20085k];
            if (bVar2 != null) {
                this.f20087m.f20067a.a(bVar2);
            }
        } else {
            n2.b bVar3 = this.f20080f[this.f20085k];
            if (bVar3 != null) {
                this.f20087m.f20068b.a(bVar3);
            }
        }
        n2.b[] bVarArr = this.f20080f;
        int i10 = this.f20085k;
        bVarArr[i10] = bVar;
        i iVar = bVar.f20061a;
        iVar.f20108d = i10;
        this.f20085k = i10 + 1;
        iVar.g(bVar);
    }

    private void n() {
        for (int i10 = 0; i10 < this.f20085k; i10++) {
            n2.b bVar = this.f20080f[i10];
            bVar.f20061a.f20110f = bVar.f20062b;
        }
    }

    public static n2.b s(d dVar, i iVar, i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) throws Exception {
        float f10;
        boolean z10;
        int i10 = 0;
        while (true) {
            f10 = 0.0f;
            if (i10 < this.f20085k) {
                n2.b bVar = this.f20080f[i10];
                if (bVar.f20061a.f20114j != i.a.UNRESTRICTED && bVar.f20062b < 0.0f) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i11 = 0;
            while (!z11) {
                i11++;
                float f11 = Float.MAX_VALUE;
                int i12 = 0;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                while (i12 < this.f20085k) {
                    n2.b bVar2 = this.f20080f[i12];
                    if (bVar2.f20061a.f20114j != i.a.UNRESTRICTED && !bVar2.f20066f && bVar2.f20062b < f10) {
                        int i16 = 1;
                        while (i16 < this.f20084j) {
                            i iVar = this.f20087m.f20070d[i16];
                            float e10 = bVar2.f20065e.e(iVar);
                            if (e10 > f10) {
                                for (int i17 = 0; i17 < 9; i17++) {
                                    float f12 = iVar.f20112h[i17] / e10;
                                    if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                        i15 = i17;
                                        f11 = f12;
                                        i13 = i12;
                                        i14 = i16;
                                    }
                                }
                            }
                            i16++;
                            f10 = 0.0f;
                        }
                    }
                    i12++;
                    f10 = 0.0f;
                }
                if (i13 != -1) {
                    n2.b bVar3 = this.f20080f[i13];
                    bVar3.f20061a.f20108d = -1;
                    bVar3.y(this.f20087m.f20070d[i14]);
                    i iVar2 = bVar3.f20061a;
                    iVar2.f20108d = i13;
                    iVar2.g(bVar3);
                } else {
                    z11 = true;
                }
                if (i11 > this.f20084j / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
            }
            return i11;
        }
        return 0;
    }

    public static e w() {
        return null;
    }

    private void y() {
        int i10 = this.f20078d * 2;
        this.f20078d = i10;
        this.f20080f = (n2.b[]) Arrays.copyOf(this.f20080f, i10);
        c cVar = this.f20087m;
        cVar.f20070d = (i[]) Arrays.copyOf(cVar.f20070d, this.f20078d);
        int i11 = this.f20078d;
        this.f20083i = new boolean[i11];
        this.f20079e = i11;
        this.f20086l = i11;
    }

    void A(a aVar) throws Exception {
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f20087m;
            i[] iVarArr = cVar.f20070d;
            if (i10 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.d();
            }
            i10++;
        }
        cVar.f20069c.c(this.f20088n, this.f20089o);
        this.f20089o = 0;
        Arrays.fill(this.f20087m.f20070d, (Object) null);
        HashMap<String, i> hashMap = this.f20076b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f20075a = 0;
        this.f20077c.clear();
        this.f20084j = 1;
        for (int i11 = 0; i11 < this.f20085k; i11++) {
            this.f20080f[i11].f20063c = false;
        }
        C();
        this.f20085k = 0;
        if (f20072r) {
            this.f20090p = new b(this.f20087m);
        } else {
            this.f20090p = new n2.b(this.f20087m);
        }
    }

    public void b(o2.e eVar, o2.e eVar2, float f10, int i10) {
        d.b bVar = d.b.LEFT;
        i q10 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q11 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q12 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q13 = q(eVar.m(bVar4));
        i q14 = q(eVar2.m(bVar));
        i q15 = q(eVar2.m(bVar2));
        i q16 = q(eVar2.m(bVar3));
        i q17 = q(eVar2.m(bVar4));
        n2.b r10 = r();
        double d10 = f10;
        double d11 = i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        n2.b r11 = r();
        r11.q(q10, q12, q14, q16, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11, int i12) {
        n2.b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i12 != 8) {
            r10.d(this, i12);
        }
        d(r10);
    }

    public void d(n2.b bVar) {
        i w10;
        if (bVar == null) {
            return;
        }
        boolean z10 = true;
        if (this.f20085k + 1 >= this.f20086l || this.f20084j + 1 >= this.f20079e) {
            y();
        }
        boolean z11 = false;
        if (!bVar.f20066f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i p10 = p();
                bVar.f20061a = p10;
                l(bVar);
                this.f20090p.c(bVar);
                B(this.f20090p, true);
                if (p10.f20108d == -1) {
                    if (bVar.f20061a == p10 && (w10 = bVar.w(p10)) != null) {
                        bVar.y(w10);
                    }
                    if (!bVar.f20066f) {
                        bVar.f20061a.g(bVar);
                    }
                    this.f20085k--;
                }
            } else {
                z10 = false;
            }
            if (!bVar.s()) {
                return;
            }
            z11 = z10;
        }
        if (!z11) {
            l(bVar);
        }
    }

    public n2.b e(i iVar, i iVar2, int i10, int i11) {
        if (i11 == 8 && iVar2.f20111g && iVar.f20108d == -1) {
            iVar.e(this, iVar2.f20110f + i10);
            return null;
        }
        n2.b r10 = r();
        r10.n(iVar, iVar2, i10);
        if (i11 != 8) {
            r10.d(this, i11);
        }
        d(r10);
        return r10;
    }

    public void f(i iVar, int i10) {
        int i11 = iVar.f20108d;
        if (i11 == -1) {
            iVar.e(this, i10);
        } else if (i11 != -1) {
            n2.b bVar = this.f20080f[i11];
            if (bVar.f20066f) {
                bVar.f20062b = i10;
            } else if (bVar.f20065e.a() == 0) {
                bVar.f20066f = true;
                bVar.f20062b = i10;
            } else {
                n2.b r10 = r();
                r10.m(iVar, i10);
                d(r10);
            }
        } else {
            n2.b r11 = r();
            r11.i(iVar, i10);
            d(r11);
        }
    }

    public void g(i iVar, i iVar2, int i10, boolean z10) {
        n2.b r10 = r();
        i t10 = t();
        t10.f20109e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(i iVar, i iVar2, int i10, int i11) {
        n2.b r10 = r();
        i t10 = t();
        t10.f20109e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f20065e.e(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void i(i iVar, i iVar2, int i10, boolean z10) {
        n2.b r10 = r();
        i t10 = t();
        t10.f20109e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(i iVar, i iVar2, int i10, int i11) {
        n2.b r10 = r();
        i t10 = t();
        t10.f20109e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f20065e.e(t10) * (-1.0f)), i11);
        }
        d(r10);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f10, int i10) {
        n2.b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    void m(n2.b bVar, int i10, int i11) {
        bVar.e(o(i11, null), i10);
    }

    public i o(int i10, String str) {
        if (this.f20084j + 1 >= this.f20079e) {
            y();
        }
        i a10 = a(i.a.ERROR, str);
        int i11 = this.f20075a + 1;
        this.f20075a = i11;
        this.f20084j++;
        a10.f20107c = i11;
        a10.f20109e = i10;
        this.f20087m.f20070d[i11] = a10;
        this.f20077c.a(a10);
        return a10;
    }

    public i p() {
        if (this.f20084j + 1 >= this.f20079e) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f20075a + 1;
        this.f20075a = i10;
        this.f20084j++;
        a10.f20107c = i10;
        this.f20087m.f20070d[i10] = a10;
        return a10;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f20084j + 1 >= this.f20079e) {
            y();
        }
        if (obj instanceof o2.d) {
            o2.d dVar = (o2.d) obj;
            iVar = dVar.f();
            if (iVar == null) {
                dVar.m(this.f20087m);
                iVar = dVar.f();
            }
            int i10 = iVar.f20107c;
            if (i10 == -1 || i10 > this.f20075a || this.f20087m.f20070d[i10] == null) {
                if (i10 != -1) {
                    iVar.d();
                }
                int i11 = this.f20075a + 1;
                this.f20075a = i11;
                this.f20084j++;
                iVar.f20107c = i11;
                iVar.f20114j = i.a.UNRESTRICTED;
                this.f20087m.f20070d[i11] = iVar;
            }
        }
        return iVar;
    }

    public n2.b r() {
        n2.b b10;
        if (f20072r) {
            b10 = this.f20087m.f20067a.b();
            if (b10 == null) {
                b10 = new b(this.f20087m);
                f20074t++;
            } else {
                b10.z();
            }
        } else {
            b10 = this.f20087m.f20068b.b();
            if (b10 == null) {
                b10 = new n2.b(this.f20087m);
                f20073s++;
            } else {
                b10.z();
            }
        }
        i.b();
        return b10;
    }

    public i t() {
        if (this.f20084j + 1 >= this.f20079e) {
            y();
        }
        i a10 = a(i.a.SLACK, null);
        int i10 = this.f20075a + 1;
        this.f20075a = i10;
        this.f20084j++;
        a10.f20107c = i10;
        this.f20087m.f20070d[i10] = a10;
        return a10;
    }

    public c v() {
        return this.f20087m;
    }

    public int x(Object obj) {
        i f10 = ((o2.d) obj).f();
        if (f10 != null) {
            return (int) (f10.f20110f + 0.5f);
        }
        return 0;
    }

    public void z() throws Exception {
        if (!this.f20081g && !this.f20082h) {
            A(this.f20077c);
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < this.f20085k) {
                if (!this.f20080f[i10].f20066f) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            A(this.f20077c);
        } else {
            n();
        }
    }
}
