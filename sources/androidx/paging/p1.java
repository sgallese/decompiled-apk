package androidx.paging;

import androidx.paging.k0;
import androidx.paging.n1;
import androidx.paging.u1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PagedStorage.kt */
/* loaded from: classes.dex */
public final class p1<T> extends AbstractList<T> implements k0.a<Object>, a1<T> {

    /* renamed from: f  reason: collision with root package name */
    private final List<u1.b.C0145b<?, T>> f5982f;

    /* renamed from: m  reason: collision with root package name */
    private int f5983m;

    /* renamed from: p  reason: collision with root package name */
    private int f5984p;

    /* renamed from: q  reason: collision with root package name */
    private int f5985q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f5986r;

    /* renamed from: s  reason: collision with root package name */
    private int f5987s;

    /* renamed from: t  reason: collision with root package name */
    private int f5988t;

    /* compiled from: PagedStorage.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, int i11, int i12);

        void f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);

        void j(int i10, int i11, int i12);
    }

    public p1() {
        this.f5982f = new ArrayList();
        this.f5986r = true;
    }

    private final void r(int i10, u1.b.C0145b<?, T> c0145b, int i11, int i12, boolean z10) {
        this.f5983m = i10;
        this.f5982f.clear();
        this.f5982f.add(c0145b);
        this.f5984p = i11;
        this.f5985q = i12;
        this.f5987s = c0145b.e().size();
        this.f5986r = z10;
        this.f5988t = c0145b.e().size() / 2;
    }

    private final boolean s(int i10, int i11, int i12) {
        u1.b.C0145b<?, T> c0145b = this.f5982f.get(i12);
        if (f() > i10 && this.f5982f.size() > 2 && f() - c0145b.e().size() >= i11) {
            return true;
        }
        return false;
    }

    public final p1<T> A() {
        return new p1<>(this);
    }

    public final boolean C(boolean z10, int i10, int i11, a aVar) {
        int h10;
        qc.q.i(aVar, "callback");
        int i12 = 0;
        while (t(i10, i11)) {
            List<u1.b.C0145b<?, T>> list = this.f5982f;
            int size = list.remove(list.size() - 1).e().size();
            i12 += size;
            this.f5987s = f() - size;
        }
        h10 = vc.l.h(this.f5988t, f() - 1);
        this.f5988t = h10;
        if (i12 > 0) {
            int g10 = g() + f();
            if (z10) {
                this.f5984p = h() + i12;
                aVar.g(g10, i12);
            } else {
                aVar.h(g10, i12);
            }
        }
        if (i12 <= 0) {
            return false;
        }
        return true;
    }

    public final boolean D(boolean z10, int i10, int i11, a aVar) {
        int d10;
        qc.q.i(aVar, "callback");
        int i12 = 0;
        while (u(i10, i11)) {
            int size = this.f5982f.remove(0).e().size();
            i12 += size;
            this.f5987s = f() - size;
        }
        d10 = vc.l.d(this.f5988t - i12, 0);
        this.f5988t = d10;
        if (i12 > 0) {
            if (z10) {
                int g10 = g();
                this.f5983m = g() + i12;
                aVar.g(g10, i12);
            } else {
                this.f5985q += i12;
                aVar.h(g(), i12);
            }
        }
        if (i12 <= 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.paging.k0.a
    public Object a() {
        Object a02;
        if (!this.f5986r || g() + this.f5985q > 0) {
            a02 = ec.b0.a0(this.f5982f);
            return ((u1.b.C0145b) a02).j();
        }
        return null;
    }

    @Override // androidx.paging.k0.a
    public Object e() {
        Object m02;
        if (!this.f5986r || h() > 0) {
            m02 = ec.b0.m0(this.f5982f);
            return ((u1.b.C0145b) m02).i();
        }
        return null;
    }

    @Override // androidx.paging.a1
    public int f() {
        return this.f5987s;
    }

    @Override // androidx.paging.a1
    public int g() {
        return this.f5983m;
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        int g10 = i10 - g();
        if (i10 >= 0 && i10 < size()) {
            if (g10 >= 0 && g10 < f()) {
                return i(g10);
            }
            return null;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @Override // androidx.paging.a1
    public int getSize() {
        return g() + f() + h();
    }

    @Override // androidx.paging.a1
    public int h() {
        return this.f5984p;
    }

    @Override // androidx.paging.a1
    public T i(int i10) {
        int size = this.f5982f.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f5982f.get(i11).e().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.f5982f.get(i11).e().get(i10);
    }

    public final void j(u1.b.C0145b<?, T> c0145b, a aVar) {
        qc.q.i(c0145b, "page");
        int size = c0145b.e().size();
        if (size == 0) {
            return;
        }
        this.f5982f.add(c0145b);
        this.f5987s = f() + size;
        int min = Math.min(h(), size);
        int i10 = size - min;
        if (min != 0) {
            this.f5984p = h() - min;
        }
        if (aVar != null) {
            aVar.j((g() + f()) - size, min, i10);
        }
    }

    public final T k() {
        Object a02;
        Object a03;
        a02 = ec.b0.a0(this.f5982f);
        a03 = ec.b0.a0(((u1.b.C0145b) a02).e());
        return (T) a03;
    }

    public final int l() {
        return g() + this.f5988t;
    }

    public final T m() {
        Object m02;
        Object m03;
        m02 = ec.b0.m0(this.f5982f);
        m03 = ec.b0.m0(((u1.b.C0145b) m02).e());
        return (T) m03;
    }

    public final int n() {
        return g() + (f() / 2);
    }

    public final w1<?, T> o(n1.d dVar) {
        List C0;
        qc.q.i(dVar, "config");
        if (!this.f5982f.isEmpty()) {
            C0 = ec.b0.C0(this.f5982f);
            qc.q.g(C0, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
            return new w1<>(C0, Integer.valueOf(l()), new r1(dVar.f5913a, dVar.f5914b, dVar.f5915c, dVar.f5916d, dVar.f5917e, 0, 32, null), g());
        }
        return null;
    }

    public final void p(int i10, u1.b.C0145b<?, T> c0145b, int i11, int i12, a aVar, boolean z10) {
        qc.q.i(c0145b, "page");
        qc.q.i(aVar, "callback");
        r(i10, c0145b, i11, i12, z10);
        aVar.f(size());
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) w(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final boolean t(int i10, int i11) {
        return s(i10, i11, this.f5982f.size() - 1);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String k02;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("leading ");
        sb2.append(g());
        sb2.append(", storage ");
        sb2.append(f());
        sb2.append(", trailing ");
        sb2.append(h());
        sb2.append(' ');
        k02 = ec.b0.k0(this.f5982f, " ", null, null, 0, null, null, 62, null);
        sb2.append(k02);
        return sb2.toString();
    }

    public final boolean u(int i10, int i11) {
        return s(i10, i11, 0);
    }

    public final void v(u1.b.C0145b<?, T> c0145b, a aVar) {
        qc.q.i(c0145b, "page");
        int size = c0145b.e().size();
        if (size == 0) {
            return;
        }
        this.f5982f.add(0, c0145b);
        this.f5987s = f() + size;
        int min = Math.min(g(), size);
        int i10 = size - min;
        if (min != 0) {
            this.f5983m = g() - min;
        }
        this.f5985q -= i10;
        if (aVar != null) {
            aVar.a(g(), min, i10);
        }
    }

    public /* bridge */ Object w(int i10) {
        return super.remove(i10);
    }

    public final void x(int i10) {
        int l10;
        l10 = vc.l.l(i10 - g(), 0, f() - 1);
        this.f5988t = l10;
    }

    public final boolean y(int i10, int i11, int i12) {
        if (f() + i12 > i10 && this.f5982f.size() > 1 && f() >= i11) {
            return true;
        }
        return false;
    }

    private p1(p1<T> p1Var) {
        ArrayList arrayList = new ArrayList();
        this.f5982f = arrayList;
        this.f5986r = true;
        arrayList.addAll(p1Var.f5982f);
        this.f5983m = p1Var.g();
        this.f5984p = p1Var.h();
        this.f5985q = p1Var.f5985q;
        this.f5986r = p1Var.f5986r;
        this.f5987s = p1Var.f();
        this.f5988t = p1Var.f5988t;
    }
}
