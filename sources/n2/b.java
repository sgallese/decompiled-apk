package n2;

import java.util.ArrayList;
import java.util.Iterator;
import n2.d;
import n2.i;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e  reason: collision with root package name */
    public a f20065e;

    /* renamed from: a  reason: collision with root package name */
    i f20061a = null;

    /* renamed from: b  reason: collision with root package name */
    float f20062b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f20063c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<i> f20064d = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    boolean f20066f = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        i b(int i10);

        void c();

        void clear();

        float d(int i10);

        float e(i iVar);

        float f(b bVar, boolean z10);

        boolean g(i iVar);

        void h(i iVar, float f10);

        void i(i iVar, float f10, boolean z10);

        float j(i iVar, boolean z10);

        void k(float f10);
    }

    public b() {
    }

    private boolean v(i iVar, d dVar) {
        if (iVar.f20117m <= 1) {
            return true;
        }
        return false;
    }

    private i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int a10 = this.f20065e.a();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float d10 = this.f20065e.d(i10);
            if (d10 < 0.0f) {
                i b10 = this.f20065e.b(i10);
                if ((zArr == null || !zArr[b10.f20107c]) && b10 != iVar && (((aVar = b10.f20114j) == i.a.SLACK || aVar == i.a.ERROR) && d10 < f10)) {
                    f10 = d10;
                    iVar2 = b10;
                }
            }
        }
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z10) {
        if (!iVar.f20111g) {
            return;
        }
        this.f20062b += iVar.f20110f * this.f20065e.e(iVar);
        this.f20065e.j(iVar, z10);
        if (z10) {
            iVar.c(this);
        }
    }

    public void C(b bVar, boolean z10) {
        this.f20062b += bVar.f20062b * this.f20065e.f(bVar, z10);
        if (z10) {
            bVar.f20061a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f20080f.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int a10 = this.f20065e.a();
            for (int i10 = 0; i10 < a10; i10++) {
                i b10 = this.f20065e.b(i10);
                if (b10.f20108d != -1 || b10.f20111g) {
                    this.f20064d.add(b10);
                }
            }
            if (this.f20064d.size() > 0) {
                Iterator<i> it = this.f20064d.iterator();
                while (it.hasNext()) {
                    i next = it.next();
                    if (next.f20111g) {
                        B(dVar, next, true);
                    } else {
                        C(dVar.f20080f[next.f20108d], true);
                    }
                }
                this.f20064d.clear();
            } else {
                z10 = true;
            }
        }
    }

    @Override // n2.d.a
    public void a(i iVar) {
        int i10 = iVar.f20109e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f20065e.h(iVar, f10);
    }

    @Override // n2.d.a
    public i b(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // n2.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f20061a = null;
            this.f20065e.clear();
            for (int i10 = 0; i10 < bVar.f20065e.a(); i10++) {
                this.f20065e.i(bVar.f20065e.b(i10), bVar.f20065e.d(i10), true);
            }
        }
    }

    @Override // n2.d.a
    public void clear() {
        this.f20065e.clear();
        this.f20061a = null;
        this.f20062b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f20065e.h(dVar.o(i10, "ep"), 1.0f);
        this.f20065e.h(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b e(i iVar, int i10) {
        this.f20065e.h(iVar, i10);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            y(g10);
            z10 = false;
        }
        if (this.f20065e.a() == 0) {
            this.f20066f = true;
        }
        return z10;
    }

    i g(d dVar) {
        boolean v10;
        boolean v11;
        int a10 = this.f20065e.a();
        i iVar = null;
        i iVar2 = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float d10 = this.f20065e.d(i10);
            i b10 = this.f20065e.b(i10);
            if (b10.f20114j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    v11 = v(b10, dVar);
                } else if (f10 > d10) {
                    v11 = v(b10, dVar);
                } else if (!z10 && v(b10, dVar)) {
                    f10 = d10;
                    iVar = b10;
                    z10 = true;
                }
                z10 = v11;
                f10 = d10;
                iVar = b10;
            } else if (iVar == null && d10 < 0.0f) {
                if (iVar2 == null) {
                    v10 = v(b10, dVar);
                } else if (f11 > d10) {
                    v10 = v(b10, dVar);
                } else if (!z11 && v(b10, dVar)) {
                    f11 = d10;
                    iVar2 = b10;
                    z11 = true;
                }
                z11 = v10;
                f11 = d10;
                iVar2 = b10;
            }
        }
        if (iVar != null) {
            return iVar;
        }
        return iVar2;
    }

    @Override // n2.d.a
    public i getKey() {
        return this.f20061a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar4, 1.0f);
            this.f20065e.h(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar2, -1.0f);
            this.f20065e.h(iVar3, -1.0f);
            this.f20065e.h(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f20062b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            this.f20065e.h(iVar, -1.0f);
            this.f20065e.h(iVar2, 1.0f);
            this.f20062b = i10;
        } else if (f10 >= 1.0f) {
            this.f20065e.h(iVar4, -1.0f);
            this.f20065e.h(iVar3, 1.0f);
            this.f20062b = -i11;
        } else {
            float f11 = 1.0f - f10;
            this.f20065e.h(iVar, f11 * 1.0f);
            this.f20065e.h(iVar2, f11 * (-1.0f));
            this.f20065e.h(iVar3, (-1.0f) * f10);
            this.f20065e.h(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f20062b = ((-i10) * f11) + (i11 * f10);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b i(i iVar, int i10) {
        this.f20061a = iVar;
        float f10 = i10;
        iVar.f20110f = f10;
        this.f20062b = f10;
        this.f20066f = true;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b j(i iVar, i iVar2, float f10) {
        this.f20065e.h(iVar, -1.0f);
        this.f20065e.h(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f20065e.h(iVar, -1.0f);
        this.f20065e.h(iVar2, 1.0f);
        this.f20065e.h(iVar3, f10);
        this.f20065e.h(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f20062b = 0.0f;
        if (f11 != 0.0f && f10 != f12) {
            if (f10 == 0.0f) {
                this.f20065e.h(iVar, 1.0f);
                this.f20065e.h(iVar2, -1.0f);
            } else if (f12 == 0.0f) {
                this.f20065e.h(iVar3, 1.0f);
                this.f20065e.h(iVar4, -1.0f);
            } else {
                float f13 = (f10 / f11) / (f12 / f11);
                this.f20065e.h(iVar, 1.0f);
                this.f20065e.h(iVar2, -1.0f);
                this.f20065e.h(iVar4, f13);
                this.f20065e.h(iVar3, -f13);
            }
        } else {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar2, -1.0f);
            this.f20065e.h(iVar4, 1.0f);
            this.f20065e.h(iVar3, -1.0f);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f20062b = i10 * (-1);
            this.f20065e.h(iVar, 1.0f);
        } else {
            this.f20062b = i10;
            this.f20065e.h(iVar, -1.0f);
        }
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20062b = i10;
        }
        if (!z10) {
            this.f20065e.h(iVar, -1.0f);
            this.f20065e.h(iVar2, 1.0f);
        } else {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20062b = i10;
        }
        if (!z10) {
            this.f20065e.h(iVar, -1.0f);
            this.f20065e.h(iVar2, 1.0f);
            this.f20065e.h(iVar3, 1.0f);
        } else {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar2, -1.0f);
            this.f20065e.h(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f20062b = i10;
        }
        if (!z10) {
            this.f20065e.h(iVar, -1.0f);
            this.f20065e.h(iVar2, 1.0f);
            this.f20065e.h(iVar3, -1.0f);
        } else {
            this.f20065e.h(iVar, 1.0f);
            this.f20065e.h(iVar2, -1.0f);
            this.f20065e.h(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f20065e.h(iVar3, 0.5f);
        this.f20065e.h(iVar4, 0.5f);
        this.f20065e.h(iVar, -0.5f);
        this.f20065e.h(iVar2, -0.5f);
        this.f20062b = -f10;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f20062b;
        if (f10 < 0.0f) {
            this.f20062b = f10 * (-1.0f);
            this.f20065e.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean s() {
        i iVar = this.f20061a;
        if (iVar != null && (iVar.f20114j == i.a.UNRESTRICTED || this.f20062b >= 0.0f)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t(i iVar) {
        return this.f20065e.g(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        if (this.f20061a == null && this.f20062b == 0.0f && this.f20065e.a() == 0) {
            return true;
        }
        return false;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(i iVar) {
        i iVar2 = this.f20061a;
        if (iVar2 != null) {
            this.f20065e.h(iVar2, -1.0f);
            this.f20061a = null;
        }
        float j10 = this.f20065e.j(iVar, true) * (-1.0f);
        this.f20061a = iVar;
        if (j10 == 1.0f) {
            return;
        }
        this.f20062b /= j10;
        this.f20065e.k(j10);
    }

    public void z() {
        this.f20061a = null;
        this.f20065e.clear();
        this.f20062b = 0.0f;
        this.f20066f = false;
    }

    public b(c cVar) {
        this.f20065e = new n2.a(this, cVar);
    }
}
