package androidx.paging;

import androidx.paging.d1;
import androidx.paging.o2;
import androidx.paging.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PagePresenter.kt */
/* loaded from: classes.dex */
public final class m1<T> implements a1<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f5875r = new a(null);

    /* renamed from: s  reason: collision with root package name */
    private static final m1<Object> f5876s = new m1<>(d1.b.f5458g.e());

    /* renamed from: f  reason: collision with root package name */
    private final List<l2<T>> f5877f;

    /* renamed from: m  reason: collision with root package name */
    private int f5878m;

    /* renamed from: p  reason: collision with root package name */
    private int f5879p;

    /* renamed from: q  reason: collision with root package name */
    private int f5880q;

    /* compiled from: PagePresenter.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final <T> m1<T> a(d1.b<T> bVar) {
            if (bVar == null) {
                m1<T> m1Var = m1.f5876s;
                qc.q.g(m1Var, "null cannot be cast to non-null type androidx.paging.PagePresenter<T of androidx.paging.PagePresenter.Companion.initial>");
                return m1Var;
            }
            return new m1<>(bVar);
        }
    }

    /* compiled from: PagePresenter.kt */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, int i11);

        void b(int i10, int i11);

        void c(int i10, int i11);

        void d(t0 t0Var, boolean z10, q0 q0Var);

        void e(s0 s0Var, s0 s0Var2);
    }

    /* compiled from: PagePresenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5881a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f5881a = iArr;
        }
    }

    public m1(List<l2<T>> list, int i10, int i11) {
        List<l2<T>> F0;
        qc.q.i(list, "pages");
        F0 = ec.b0.F0(list);
        this.f5877f = F0;
        this.f5878m = j(list);
        this.f5879p = i10;
        this.f5880q = i11;
    }

    private final void c(int i10) {
        if (i10 >= 0 && i10 < getSize()) {
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + getSize());
    }

    private final void d(d1.a<T> aVar, b bVar) {
        int i10;
        int size = getSize();
        t0 a10 = aVar.a();
        t0 t0Var = t0.PREPEND;
        if (a10 == t0Var) {
            int g10 = g();
            this.f5878m = f() - e(new vc.f(aVar.c(), aVar.b()));
            this.f5879p = aVar.e();
            int size2 = getSize() - size;
            if (size2 > 0) {
                bVar.a(0, size2);
            } else if (size2 < 0) {
                bVar.b(0, -size2);
            }
            int max = Math.max(0, g10 + size2);
            int e10 = aVar.e() - max;
            if (e10 > 0) {
                bVar.c(max, e10);
            }
            bVar.d(t0Var, false, q0.c.f6001b.b());
            return;
        }
        int h10 = h();
        this.f5878m = f() - e(new vc.f(aVar.c(), aVar.b()));
        this.f5880q = aVar.e();
        int size3 = getSize() - size;
        if (size3 > 0) {
            bVar.a(size, size3);
        } else if (size3 < 0) {
            bVar.b(size + size3, -size3);
        }
        if (size3 < 0) {
            i10 = Math.min(h10, -size3);
        } else {
            i10 = 0;
        }
        int e11 = aVar.e() - (h10 - i10);
        if (e11 > 0) {
            bVar.c(getSize() - aVar.e(), e11);
        }
        bVar.d(t0.APPEND, false, q0.c.f6001b.b());
    }

    private final int e(vc.f fVar) {
        boolean z10;
        Iterator<l2<T>> it = this.f5877f.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            l2<T> next = it.next();
            int[] c10 = next.c();
            int length = c10.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    if (fVar.m(c10[i11])) {
                        z10 = true;
                        break;
                    }
                    i11++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                i10 += next.b().size();
                it.remove();
            }
        }
        return i10;
    }

    private final int j(List<l2<T>> list) {
        Iterator<T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((l2) it.next()).b().size();
        }
        return i10;
    }

    private final int l() {
        Object a02;
        Integer V;
        a02 = ec.b0.a0(this.f5877f);
        V = ec.p.V(((l2) a02).c());
        qc.q.f(V);
        return V.intValue();
    }

    private final int m() {
        Object m02;
        Integer U;
        m02 = ec.b0.m0(this.f5877f);
        U = ec.p.U(((l2) m02).c());
        qc.q.f(U);
        return U.intValue();
    }

    private final void o(d1.b<T> bVar, b bVar2) {
        int j10 = j(bVar.f());
        int size = getSize();
        int i10 = c.f5881a[bVar.d().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    int min = Math.min(h(), j10);
                    int g10 = g() + f();
                    int i11 = j10 - min;
                    List<l2<T>> list = this.f5877f;
                    list.addAll(list.size(), bVar.f());
                    this.f5878m = f() + j10;
                    this.f5880q = bVar.g();
                    bVar2.c(g10, min);
                    bVar2.a(g10 + min, i11);
                    int size2 = (getSize() - size) - i11;
                    if (size2 > 0) {
                        bVar2.a(getSize() - size2, size2);
                    } else if (size2 < 0) {
                        bVar2.b(getSize(), -size2);
                    }
                }
            } else {
                int min2 = Math.min(g(), j10);
                int g11 = g() - min2;
                int i12 = j10 - min2;
                this.f5877f.addAll(0, bVar.f());
                this.f5878m = f() + j10;
                this.f5879p = bVar.h();
                bVar2.c(g11, min2);
                bVar2.a(0, i12);
                int size3 = (getSize() - size) - i12;
                if (size3 > 0) {
                    bVar2.a(0, size3);
                } else if (size3 < 0) {
                    bVar2.b(0, -size3);
                }
            }
            bVar2.e(bVar.i(), bVar.e());
            return;
        }
        throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final o2.a b(int i10) {
        int k10;
        int i11 = 0;
        int g10 = i10 - g();
        while (g10 >= this.f5877f.get(i11).b().size()) {
            k10 = ec.t.k(this.f5877f);
            if (i11 >= k10) {
                break;
            }
            g10 -= this.f5877f.get(i11).b().size();
            i11++;
        }
        return this.f5877f.get(i11).d(g10, i10 - g(), ((getSize() - i10) - h()) - 1, l(), m());
    }

    @Override // androidx.paging.a1
    public int f() {
        return this.f5878m;
    }

    @Override // androidx.paging.a1
    public int g() {
        return this.f5879p;
    }

    @Override // androidx.paging.a1
    public int getSize() {
        return g() + f() + h();
    }

    @Override // androidx.paging.a1
    public int h() {
        return this.f5880q;
    }

    @Override // androidx.paging.a1
    public T i(int i10) {
        int size = this.f5877f.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = this.f5877f.get(i11).b().size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return this.f5877f.get(i11).b().get(i10);
    }

    public final T k(int i10) {
        c(i10);
        int g10 = i10 - g();
        if (g10 >= 0 && g10 < f()) {
            return i(g10);
        }
        return null;
    }

    public final o2.b n() {
        int f10 = f() / 2;
        return new o2.b(f10, f10, l(), m());
    }

    public final void p(d1<T> d1Var, b bVar) {
        qc.q.i(d1Var, "pageEvent");
        qc.q.i(bVar, "callback");
        if (d1Var instanceof d1.b) {
            o((d1.b) d1Var, bVar);
        } else if (d1Var instanceof d1.a) {
            d((d1.a) d1Var, bVar);
        } else if (d1Var instanceof d1.c) {
            d1.c cVar = (d1.c) d1Var;
            bVar.e(cVar.b(), cVar.a());
        } else if (!(d1Var instanceof d1.d)) {
        } else {
            throw new IllegalStateException("Paging received an event to display a static list, while still actively loading\nfrom an existing generation of PagingData. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
    }

    public final j0<T> q() {
        int g10 = g();
        int h10 = h();
        List<l2<T>> list = this.f5877f;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ec.y.w(arrayList, ((l2) it.next()).b());
        }
        return new j0<>(g10, h10, arrayList);
    }

    public String toString() {
        String k02;
        int f10 = f();
        ArrayList arrayList = new ArrayList(f10);
        for (int i10 = 0; i10 < f10; i10++) {
            arrayList.add(i(i10));
        }
        k02 = ec.b0.k0(arrayList, null, null, null, 0, null, null, 63, null);
        return "[(" + g() + " placeholders), " + k02 + ", (" + h() + " placeholders)]";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m1(d1.b<T> bVar) {
        this(bVar.f(), bVar.h(), bVar.g());
        qc.q.i(bVar, "insertEvent");
    }
}
