package x;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: LazyListItemPlacementAnimator.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c  reason: collision with root package name */
    private int f25572c;

    /* renamed from: a  reason: collision with root package name */
    private final Set<Object> f25570a = new LinkedHashSet();

    /* renamed from: b  reason: collision with root package name */
    private y.r f25571b = y.r.f26125a;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedHashSet<Object> f25573d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    private final List<u> f25574e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List<u> f25575f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<u> f25576g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final List<u> f25577h = new ArrayList();

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y.r f25578f;

        public a(y.r rVar) {
            this.f25578f = rVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(this.f25578f.b(((u) t10).b())), Integer.valueOf(this.f25578f.b(((u) t11).b())));
            return d10;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(m.this.f25571b.b(((u) t10).b())), Integer.valueOf(m.this.f25571b.b(((u) t11).b())));
            return d10;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ y.r f25580f;

        public c(y.r rVar) {
            this.f25580f = rVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(this.f25580f.b(((u) t11).b())), Integer.valueOf(this.f25580f.b(((u) t10).b())));
            return d10;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class d<T> implements Comparator {
        public d() {
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(m.this.f25571b.b(((u) t11).b())), Integer.valueOf(m.this.f25571b.b(((u) t10).b())));
            return d10;
        }
    }

    private final boolean b(u uVar) {
        int h10 = uVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            if (c(uVar.g(i10)) != null) {
                return true;
            }
        }
        return false;
    }

    private final y.e c(Object obj) {
        if (obj instanceof y.e) {
            return (y.e) obj;
        }
        return null;
    }

    private final void d(u uVar, int i10) {
        long g10;
        long f10 = uVar.f(0);
        if (uVar.k()) {
            g10 = j2.l.g(f10, 0, i10, 1, null);
        } else {
            g10 = j2.l.g(f10, i10, 0, 2, null);
        }
        int h10 = uVar.h();
        for (int i11 = 0; i11 < h10; i11++) {
            y.e c10 = c(uVar.g(i11));
            if (c10 != null) {
                long f11 = uVar.f(i11);
                long a10 = j2.m.a(j2.l.j(f11) - j2.l.j(f10), j2.l.k(f11) - j2.l.k(f10));
                c10.V1(j2.m.a(j2.l.j(g10) + j2.l.j(a10), j2.l.k(g10) + j2.l.k(a10)));
            }
        }
    }

    private final void g(u uVar) {
        int h10 = uVar.h();
        for (int i10 = 0; i10 < h10; i10++) {
            y.e c10 = c(uVar.g(i10));
            if (c10 != null) {
                long f10 = uVar.f(i10);
                long Q1 = c10.Q1();
                if (!j2.l.i(Q1, y.e.F.a()) && !j2.l.i(Q1, f10)) {
                    c10.M1(j2.m.a(j2.l.j(f10) - j2.l.j(Q1), j2.l.k(f10) - j2.l.k(Q1)));
                }
                c10.V1(f10);
            }
        }
    }

    public final void e(int i10, int i11, int i12, List<u> list, v vVar, boolean z10) {
        boolean z11;
        Object c02;
        long a10;
        int i13;
        List<u> list2 = list;
        qc.q.i(list2, "positionedItems");
        qc.q.i(vVar, "itemProvider");
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                z11 = false;
                break;
            } else if (b(list2.get(i14))) {
                z11 = true;
                break;
            } else {
                i14++;
            }
        }
        if (!z11 && this.f25570a.isEmpty()) {
            f();
            return;
        }
        int i15 = this.f25572c;
        c02 = ec.b0.c0(list);
        u uVar = (u) c02;
        this.f25572c = uVar != null ? uVar.getIndex() : 0;
        y.r rVar = this.f25571b;
        this.f25571b = vVar.d();
        int i16 = z10 ? i12 : i11;
        if (z10) {
            a10 = j2.m.a(0, i10);
        } else {
            a10 = j2.m.a(i10, 0);
        }
        this.f25573d.addAll(this.f25570a);
        int size2 = list.size();
        int i17 = 0;
        while (i17 < size2) {
            u uVar2 = list2.get(i17);
            this.f25573d.remove(uVar2.b());
            if (b(uVar2)) {
                if (!this.f25570a.contains(uVar2.b())) {
                    this.f25570a.add(uVar2.b());
                    int b10 = rVar.b(uVar2.b());
                    if (b10 == -1 || uVar2.getIndex() == b10) {
                        long f10 = uVar2.f(0);
                        d(uVar2, uVar2.k() ? j2.l.k(f10) : j2.l.j(f10));
                    } else if (b10 < i15) {
                        this.f25574e.add(uVar2);
                    } else {
                        this.f25575f.add(uVar2);
                    }
                    i13 = size2;
                } else {
                    int h10 = uVar2.h();
                    int i18 = 0;
                    while (i18 < h10) {
                        y.e c10 = c(uVar2.g(i18));
                        int i19 = size2;
                        if (c10 != null && !j2.l.i(c10.Q1(), y.e.F.a())) {
                            long Q1 = c10.Q1();
                            c10.V1(j2.m.a(j2.l.j(Q1) + j2.l.j(a10), j2.l.k(Q1) + j2.l.k(a10)));
                        }
                        i18++;
                        size2 = i19;
                    }
                    i13 = size2;
                    g(uVar2);
                }
            } else {
                i13 = size2;
                this.f25570a.remove(uVar2.b());
            }
            i17++;
            size2 = i13;
            list2 = list;
        }
        List<u> list3 = this.f25574e;
        if (list3.size() > 1) {
            ec.x.v(list3, new c(rVar));
        }
        List<u> list4 = this.f25574e;
        int size3 = list4.size();
        int i20 = 0;
        for (int i21 = 0; i21 < size3; i21++) {
            u uVar3 = list4.get(i21);
            i20 += uVar3.i();
            d(uVar3, 0 - i20);
            g(uVar3);
        }
        List<u> list5 = this.f25575f;
        if (list5.size() > 1) {
            ec.x.v(list5, new a(rVar));
        }
        List<u> list6 = this.f25575f;
        int size4 = list6.size();
        int i22 = 0;
        for (int i23 = 0; i23 < size4; i23++) {
            u uVar4 = list6.get(i23);
            int i24 = i16 + i22;
            i22 += uVar4.i();
            d(uVar4, i24);
            g(uVar4);
        }
        for (Object obj : this.f25573d) {
            int b11 = this.f25571b.b(obj);
            if (b11 == -1) {
                this.f25570a.remove(obj);
            } else {
                u b12 = vVar.b(b11);
                int h11 = b12.h();
                boolean z12 = false;
                for (int i25 = 0; i25 < h11; i25++) {
                    y.e c11 = c(b12.g(i25));
                    if (c11 != null && c11.R1()) {
                        z12 = true;
                    }
                }
                if (!z12 && b11 == rVar.b(obj)) {
                    this.f25570a.remove(obj);
                } else if (b11 < this.f25572c) {
                    this.f25576g.add(b12);
                } else {
                    this.f25577h.add(b12);
                }
            }
        }
        List<u> list7 = this.f25576g;
        if (list7.size() > 1) {
            ec.x.v(list7, new d());
        }
        List<u> list8 = this.f25576g;
        int size5 = list8.size();
        int i26 = 0;
        for (int i27 = 0; i27 < size5; i27++) {
            u uVar5 = list8.get(i27);
            i26 += uVar5.i();
            uVar5.m(0 - i26, i11, i12);
            list.add(uVar5);
            g(uVar5);
        }
        List<u> list9 = this.f25577h;
        if (list9.size() > 1) {
            ec.x.v(list9, new b());
        }
        List<u> list10 = this.f25577h;
        int size6 = list10.size();
        int i28 = 0;
        for (int i29 = 0; i29 < size6; i29++) {
            u uVar6 = list10.get(i29);
            int i30 = i16 + i28;
            i28 += uVar6.i();
            uVar6.m(i30, i11, i12);
            list.add(uVar6);
            g(uVar6);
        }
        this.f25574e.clear();
        this.f25575f.clear();
        this.f25576g.clear();
        this.f25577h.clear();
        this.f25573d.clear();
    }

    public final void f() {
        this.f25570a.clear();
        this.f25571b = y.r.f26125a;
        this.f25572c = -1;
    }
}
