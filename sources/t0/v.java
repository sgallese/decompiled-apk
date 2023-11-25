package t0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.b0;
import j0.y2;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import qc.k0;
import s.t0;

/* compiled from: SnapshotStateObserver.kt */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<pc.a<dc.w>, dc.w> f23367a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<Object> f23368b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23369c;

    /* renamed from: d  reason: collision with root package name */
    private final pc.p<Set<? extends Object>, g, dc.w> f23370d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.l<Object, dc.w> f23371e;

    /* renamed from: f  reason: collision with root package name */
    private final k0.f<a> f23372f;

    /* renamed from: g  reason: collision with root package name */
    private e f23373g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f23374h;

    /* renamed from: i  reason: collision with root package name */
    private a f23375i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final pc.l<Object, dc.w> f23376a;

        /* renamed from: b  reason: collision with root package name */
        private Object f23377b;

        /* renamed from: c  reason: collision with root package name */
        private k0.a f23378c;

        /* renamed from: d  reason: collision with root package name */
        private int f23379d;

        /* renamed from: e  reason: collision with root package name */
        private final k0.d<Object> f23380e;

        /* renamed from: f  reason: collision with root package name */
        private final k0.b<Object, k0.a> f23381f;

        /* renamed from: g  reason: collision with root package name */
        private final k0.c<Object> f23382g;

        /* renamed from: h  reason: collision with root package name */
        private final k0.f<j0.b0<?>> f23383h;

        /* renamed from: i  reason: collision with root package name */
        private final j0.c0 f23384i;

        /* renamed from: j  reason: collision with root package name */
        private int f23385j;

        /* renamed from: k  reason: collision with root package name */
        private final k0.d<j0.b0<?>> f23386k;

        /* renamed from: l  reason: collision with root package name */
        private final HashMap<j0.b0<?>, Object> f23387l;

        /* compiled from: SnapshotStateObserver.kt */
        /* renamed from: t0.v$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0549a implements j0.c0 {
            C0549a() {
            }

            @Override // j0.c0
            public void a(j0.b0<?> b0Var) {
                qc.q.i(b0Var, "derivedState");
                a aVar = a.this;
                aVar.f23385j--;
            }

            @Override // j0.c0
            public void b(j0.b0<?> b0Var) {
                qc.q.i(b0Var, "derivedState");
                a.this.f23385j++;
            }
        }

        public a(pc.l<Object, dc.w> lVar) {
            qc.q.i(lVar, "onChanged");
            this.f23376a = lVar;
            this.f23379d = -1;
            this.f23380e = new k0.d<>();
            this.f23381f = new k0.b<>(0, 1, null);
            this.f23382g = new k0.c<>();
            this.f23383h = new k0.f<>(new j0.b0[16], 0);
            this.f23384i = new C0549a();
            this.f23386k = new k0.d<>();
            this.f23387l = new HashMap<>();
        }

        private final void d(Object obj) {
            boolean z10;
            int i10 = this.f23379d;
            k0.a aVar = this.f23378c;
            if (aVar != null) {
                Object[] e10 = aVar.e();
                int[] g10 = aVar.g();
                int f10 = aVar.f();
                int i11 = 0;
                for (int i12 = 0; i12 < f10; i12++) {
                    Object obj2 = e10[i12];
                    qc.q.g(obj2, "null cannot be cast to non-null type kotlin.Any");
                    int i13 = g10[i12];
                    if (i13 != i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        k(obj, obj2);
                    }
                    if (!z10) {
                        if (i11 != i12) {
                            e10[i11] = obj2;
                            g10[i11] = i13;
                        }
                        i11++;
                    }
                }
                for (int i14 = i11; i14 < f10; i14++) {
                    e10[i14] = null;
                }
                aVar.f19120a = i11;
            }
        }

        private final void j(Object obj, int i10, Object obj2, k0.a aVar) {
            if (this.f23385j > 0) {
                return;
            }
            int b10 = aVar.b(obj, i10);
            if ((obj instanceof j0.b0) && b10 != i10) {
                b0.a q10 = ((j0.b0) obj).q();
                this.f23387l.put(obj, q10.a());
                Object[] b11 = q10.b();
                k0.d<j0.b0<?>> dVar = this.f23386k;
                dVar.n(obj);
                for (Object obj3 : b11) {
                    if (obj3 == null) {
                        break;
                    }
                    dVar.c(obj3, obj);
                }
            }
            if (b10 == -1) {
                this.f23380e.c(obj, obj2);
            }
        }

        private final void k(Object obj, Object obj2) {
            this.f23380e.m(obj2, obj);
            if ((obj2 instanceof j0.b0) && !this.f23380e.e(obj2)) {
                this.f23386k.n(obj2);
                this.f23387l.remove(obj2);
            }
        }

        public final void c() {
            this.f23380e.d();
            this.f23381f.b();
            this.f23386k.d();
            this.f23387l.clear();
        }

        public final pc.l<Object, dc.w> e() {
            return this.f23376a;
        }

        public final void f() {
            k0.c<Object> cVar = this.f23382g;
            pc.l<Object, dc.w> lVar = this.f23376a;
            Object[] j10 = cVar.j();
            int size = cVar.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = j10[i10];
                qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                lVar.invoke(obj);
            }
            cVar.clear();
        }

        public final void g(Object obj, pc.l<Object, dc.w> lVar, pc.a<dc.w> aVar) {
            qc.q.i(obj, "scope");
            qc.q.i(lVar, "readObserver");
            qc.q.i(aVar, "block");
            Object obj2 = this.f23377b;
            k0.a aVar2 = this.f23378c;
            int i10 = this.f23379d;
            this.f23377b = obj;
            this.f23378c = this.f23381f.f(obj);
            if (this.f23379d == -1) {
                this.f23379d = l.F().f();
            }
            j0.c0 c0Var = this.f23384i;
            k0.f<j0.c0> b10 = y2.b();
            try {
                b10.d(c0Var);
                g.f23297e.d(lVar, null, aVar);
                b10.x(b10.o() - 1);
                Object obj3 = this.f23377b;
                qc.q.f(obj3);
                d(obj3);
                this.f23377b = obj2;
                this.f23378c = aVar2;
                this.f23379d = i10;
            } catch (Throwable th) {
                b10.x(b10.o() - 1);
                throw th;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00f1, code lost:
        
            r9 = r2.f(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
        
            r14 = r2.f(r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean h(java.util.Set<? extends java.lang.Object> r20) {
            /*
                Method dump skipped, instructions count: 422
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: t0.v.a.h(java.util.Set):boolean");
        }

        public final void i(Object obj) {
            qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            Object obj2 = this.f23377b;
            qc.q.f(obj2);
            int i10 = this.f23379d;
            k0.a aVar = this.f23378c;
            if (aVar == null) {
                aVar = new k0.a();
                this.f23378c = aVar;
                this.f23381f.l(obj2, aVar);
                dc.w wVar = dc.w.f13270a;
            }
            j(obj, i10, obj2, aVar);
        }

        public final void l(pc.l<Object, Boolean> lVar) {
            qc.q.i(lVar, "predicate");
            k0.b<Object, k0.a> bVar = this.f23381f;
            int h10 = bVar.h();
            int i10 = 0;
            for (int i11 = 0; i11 < h10; i11++) {
                Object obj = bVar.g()[i11];
                qc.q.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                k0.a aVar = (k0.a) bVar.i()[i11];
                Boolean invoke = lVar.invoke(obj);
                if (invoke.booleanValue()) {
                    Object[] e10 = aVar.e();
                    int[] g10 = aVar.g();
                    int f10 = aVar.f();
                    for (int i12 = 0; i12 < f10; i12++) {
                        Object obj2 = e10[i12];
                        qc.q.g(obj2, "null cannot be cast to non-null type kotlin.Any");
                        int i13 = g10[i12];
                        k(obj, obj2);
                    }
                }
                if (!invoke.booleanValue()) {
                    if (i10 != i11) {
                        bVar.g()[i10] = obj;
                        bVar.i()[i10] = bVar.i()[i11];
                    }
                    i10++;
                }
            }
            if (bVar.h() > i10) {
                int h11 = bVar.h();
                for (int i14 = i10; i14 < h11; i14++) {
                    bVar.g()[i14] = null;
                    bVar.i()[i14] = null;
                }
                ((k0.b) bVar).f19125c = i10;
            }
        }

        public final void m(j0.b0<?> b0Var) {
            int f10;
            k0.c o10;
            qc.q.i(b0Var, "derivedState");
            k0.b<Object, k0.a> bVar = this.f23381f;
            int f11 = l.F().f();
            k0.d<Object> dVar = this.f23380e;
            f10 = dVar.f(b0Var);
            if (f10 >= 0) {
                o10 = dVar.o(f10);
                Object[] j10 = o10.j();
                int size = o10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = j10[i10];
                    qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    k0.a f12 = bVar.f(obj);
                    if (f12 == null) {
                        f12 = new k0.a();
                        bVar.l(obj, f12);
                        dc.w wVar = dc.w.f13270a;
                    }
                    j(b0Var, f11, obj, f12);
                }
            }
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.p<Set<? extends Object>, g, dc.w> {
        b() {
            super(2);
        }

        public final void a(Set<? extends Object> set, g gVar) {
            qc.q.i(set, "applied");
            qc.q.i(gVar, "<anonymous parameter 1>");
            v.this.i(set);
            if (v.this.l()) {
                v.this.q();
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(Set<? extends Object> set, g gVar) {
            a(set, gVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.l<Object, dc.w> {
        c() {
            super(1);
        }

        public final void a(Object obj) {
            qc.q.i(obj, "state");
            if (!v.this.f23374h) {
                k0.f fVar = v.this.f23372f;
                v vVar = v.this;
                synchronized (fVar) {
                    a aVar = vVar.f23375i;
                    qc.q.f(aVar);
                    aVar.i(obj);
                    dc.w wVar = dc.w.f13270a;
                }
            }
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SnapshotStateObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.a<dc.w> {
        d() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            do {
                k0.f fVar = v.this.f23372f;
                v vVar = v.this;
                synchronized (fVar) {
                    if (!vVar.f23369c) {
                        vVar.f23369c = true;
                        try {
                            k0.f fVar2 = vVar.f23372f;
                            int o10 = fVar2.o();
                            if (o10 > 0) {
                                Object[] n10 = fVar2.n();
                                int i10 = 0;
                                do {
                                    ((a) n10[i10]).f();
                                    i10++;
                                } while (i10 < o10);
                            }
                            vVar.f23369c = false;
                        } finally {
                        }
                    }
                    dc.w wVar = dc.w.f13270a;
                }
            } while (v.this.l());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(pc.l<? super pc.a<dc.w>, dc.w> lVar) {
        qc.q.i(lVar, "onChangedExecutor");
        this.f23367a = lVar;
        this.f23368b = new AtomicReference<>(null);
        this.f23370d = new b();
        this.f23371e = new c();
        this.f23372f = new k0.f<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void i(Set<? extends Object> set) {
        Object obj;
        List d10;
        List r02;
        List list;
        List l10;
        do {
            obj = this.f23368b.get();
            if (obj == null) {
                list = set;
            } else if (obj instanceof Set) {
                l10 = ec.t.l(obj, set);
                list = l10;
            } else if (obj instanceof List) {
                d10 = ec.s.d(set);
                r02 = ec.b0.r0((Collection) obj, d10);
                list = r02;
            } else {
                p();
                throw new KotlinNothingValueException();
            }
        } while (!t0.a(this.f23368b, obj, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean l() {
        boolean z10;
        synchronized (this.f23372f) {
            z10 = this.f23369c;
        }
        if (z10) {
            return false;
        }
        boolean z11 = false;
        while (true) {
            Set<? extends Object> o10 = o();
            if (o10 == null) {
                return z11;
            }
            synchronized (this.f23372f) {
                k0.f<a> fVar = this.f23372f;
                int o11 = fVar.o();
                if (o11 > 0) {
                    a[] n10 = fVar.n();
                    int i10 = 0;
                    do {
                        if (!n10[i10].h(o10) && !z11) {
                            z11 = false;
                            i10++;
                        }
                        z11 = true;
                        i10++;
                    } while (i10 < o11);
                }
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    private final <T> a m(pc.l<? super T, dc.w> lVar) {
        a aVar;
        boolean z10;
        k0.f<a> fVar = this.f23372f;
        int o10 = fVar.o();
        if (o10 > 0) {
            a[] n10 = fVar.n();
            int i10 = 0;
            do {
                aVar = n10[i10];
                if (aVar.e() == lVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i10++;
            } while (i10 < o10);
        }
        aVar = null;
        a aVar2 = aVar;
        if (aVar2 == null) {
            qc.q.g(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            a aVar3 = new a((pc.l) k0.e(lVar, 1));
            this.f23372f.d(aVar3);
            return aVar3;
        }
        return aVar2;
    }

    private final Set<Object> o() {
        Object obj;
        Object obj2;
        Set<Object> set;
        do {
            obj = this.f23368b.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else if (obj instanceof List) {
                List list = (List) obj;
                Set<Object> set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            } else {
                p();
                throw new KotlinNothingValueException();
            }
        } while (!t0.a(this.f23368b, obj, obj2));
        return set;
    }

    private final Void p() {
        j0.n.w("Unexpected notification");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.f23367a.invoke(new d());
    }

    public final void j() {
        synchronized (this.f23372f) {
            k0.f<a> fVar = this.f23372f;
            int o10 = fVar.o();
            if (o10 > 0) {
                a[] n10 = fVar.n();
                int i10 = 0;
                do {
                    n10[i10].c();
                    i10++;
                } while (i10 < o10);
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final void k(pc.l<Object, Boolean> lVar) {
        qc.q.i(lVar, "predicate");
        synchronized (this.f23372f) {
            k0.f<a> fVar = this.f23372f;
            int o10 = fVar.o();
            if (o10 > 0) {
                a[] n10 = fVar.n();
                int i10 = 0;
                do {
                    n10[i10].l(lVar);
                    i10++;
                } while (i10 < o10);
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public final <T> void n(T t10, pc.l<? super T, dc.w> lVar, pc.a<dc.w> aVar) {
        a m10;
        qc.q.i(t10, "scope");
        qc.q.i(lVar, "onValueChangedForScope");
        qc.q.i(aVar, "block");
        synchronized (this.f23372f) {
            m10 = m(lVar);
        }
        boolean z10 = this.f23374h;
        a aVar2 = this.f23375i;
        try {
            this.f23374h = false;
            this.f23375i = m10;
            m10.g(t10, this.f23371e, aVar);
        } finally {
            this.f23375i = aVar2;
            this.f23374h = z10;
        }
    }

    public final void r() {
        this.f23373g = g.f23297e.e(this.f23370d);
    }

    public final void s() {
        e eVar = this.f23373g;
        if (eVar != null) {
            eVar.dispose();
        }
    }
}
