package q4;

import dc.l;
import dc.r;
import ec.b0;
import java.util.ArrayList;
import java.util.List;
import qc.q;
import t4.i;
import w4.i;
import w4.m;

/* compiled from: ComponentRegistry.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<x4.b> f21379a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l<z4.d<? extends Object, ? extends Object>, Class<? extends Object>>> f21380b;

    /* renamed from: c  reason: collision with root package name */
    private final List<l<y4.b<? extends Object>, Class<? extends Object>>> f21381c;

    /* renamed from: d  reason: collision with root package name */
    private final List<l<i.a<? extends Object>, Class<? extends Object>>> f21382d;

    /* renamed from: e  reason: collision with root package name */
    private final List<i.a> f21383e;

    public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, qc.h hVar) {
        this(list, list2, list3, list4, list5);
    }

    public final List<i.a> a() {
        return this.f21383e;
    }

    public final List<l<i.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f21382d;
    }

    public final List<x4.b> c() {
        return this.f21379a;
    }

    public final List<l<y4.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f21381c;
    }

    public final List<l<z4.d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f21380b;
    }

    public final String f(Object obj, b5.l lVar) {
        List<l<y4.b<? extends Object>, Class<? extends Object>>> list = this.f21381c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l<y4.b<? extends Object>, Class<? extends Object>> lVar2 = list.get(i10);
            y4.b<? extends Object> a10 = lVar2.a();
            if (lVar2.b().isAssignableFrom(obj.getClass())) {
                q.g(a10, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String a11 = a10.a(obj, lVar);
                if (a11 != null) {
                    return a11;
                }
            }
        }
        return null;
    }

    public final Object g(Object obj, b5.l lVar) {
        List<l<z4.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f21380b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l<z4.d<? extends Object, ? extends Object>, Class<? extends Object>> lVar2 = list.get(i10);
            z4.d<? extends Object, ? extends Object> a10 = lVar2.a();
            if (lVar2.b().isAssignableFrom(obj.getClass())) {
                q.g(a10, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object a11 = a10.a(obj, lVar);
                if (a11 != null) {
                    obj = a11;
                }
            }
        }
        return obj;
    }

    public final a h() {
        return new a(this);
    }

    public final l<t4.i, Integer> i(m mVar, b5.l lVar, g gVar, int i10) {
        int size = this.f21383e.size();
        while (i10 < size) {
            t4.i a10 = this.f21383e.get(i10).a(mVar, lVar, gVar);
            if (a10 != null) {
                return r.a(a10, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    public final l<w4.i, Integer> j(Object obj, b5.l lVar, g gVar, int i10) {
        int size = this.f21382d.size();
        while (i10 < size) {
            l<i.a<? extends Object>, Class<? extends Object>> lVar2 = this.f21382d.get(i10);
            i.a<? extends Object> a10 = lVar2.a();
            if (lVar2.b().isAssignableFrom(obj.getClass())) {
                q.g(a10, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                w4.i a11 = a10.a(obj, lVar, gVar);
                if (a11 != null) {
                    return r.a(a11, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(List<? extends x4.b> list, List<? extends l<? extends z4.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends l<? extends y4.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends l<? extends i.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends i.a> list5) {
        this.f21379a = list;
        this.f21380b = list2;
        this.f21381c = list3;
        this.f21382d = list4;
        this.f21383e = list5;
    }

    /* compiled from: ComponentRegistry.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<x4.b> f21384a;

        /* renamed from: b  reason: collision with root package name */
        private final List<l<z4.d<? extends Object, ?>, Class<? extends Object>>> f21385b;

        /* renamed from: c  reason: collision with root package name */
        private final List<l<y4.b<? extends Object>, Class<? extends Object>>> f21386c;

        /* renamed from: d  reason: collision with root package name */
        private final List<l<i.a<? extends Object>, Class<? extends Object>>> f21387d;

        /* renamed from: e  reason: collision with root package name */
        private final List<i.a> f21388e;

        public a() {
            this.f21384a = new ArrayList();
            this.f21385b = new ArrayList();
            this.f21386c = new ArrayList();
            this.f21387d = new ArrayList();
            this.f21388e = new ArrayList();
        }

        public final a a(i.a aVar) {
            this.f21388e.add(aVar);
            return this;
        }

        public final <T> a b(i.a<T> aVar, Class<T> cls) {
            this.f21387d.add(r.a(aVar, cls));
            return this;
        }

        public final <T> a c(y4.b<T> bVar, Class<T> cls) {
            this.f21386c.add(r.a(bVar, cls));
            return this;
        }

        public final <T> a d(z4.d<T, ?> dVar, Class<T> cls) {
            this.f21385b.add(r.a(dVar, cls));
            return this;
        }

        public final b e() {
            return new b(g5.c.a(this.f21384a), g5.c.a(this.f21385b), g5.c.a(this.f21386c), g5.c.a(this.f21387d), g5.c.a(this.f21388e), null);
        }

        public final List<i.a> f() {
            return this.f21388e;
        }

        public final List<l<i.a<? extends Object>, Class<? extends Object>>> g() {
            return this.f21387d;
        }

        public a(b bVar) {
            List<x4.b> F0;
            List<l<z4.d<? extends Object, ?>, Class<? extends Object>>> F02;
            List<l<y4.b<? extends Object>, Class<? extends Object>>> F03;
            List<l<i.a<? extends Object>, Class<? extends Object>>> F04;
            List<i.a> F05;
            F0 = b0.F0(bVar.c());
            this.f21384a = F0;
            F02 = b0.F0(bVar.e());
            this.f21385b = F02;
            F03 = b0.F0(bVar.d());
            this.f21386c = F03;
            F04 = b0.F0(bVar.b());
            this.f21387d = F04;
            F05 = b0.F0(bVar.a());
            this.f21388e = F05;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r6 = this;
            java.util.List r1 = ec.r.i()
            java.util.List r2 = ec.r.i()
            java.util.List r3 = ec.r.i()
            java.util.List r4 = ec.r.i()
            java.util.List r5 = ec.r.i()
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.b.<init>():void");
    }
}
