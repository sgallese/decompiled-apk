package j0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* compiled from: Composition.kt */
/* loaded from: classes.dex */
public final class r implements y, a2 {
    private boolean A;
    private r B;
    private int C;
    private final m D;
    private final hc.f E;
    private final boolean F;
    private boolean G;
    private pc.p<? super l, ? super Integer, dc.w> H;

    /* renamed from: f  reason: collision with root package name */
    private final p f18865f;

    /* renamed from: m  reason: collision with root package name */
    private final f<?> f18866m;

    /* renamed from: p  reason: collision with root package name */
    private final AtomicReference<Object> f18867p;

    /* renamed from: q  reason: collision with root package name */
    private final Object f18868q;

    /* renamed from: r  reason: collision with root package name */
    private final HashSet<f2> f18869r;

    /* renamed from: s  reason: collision with root package name */
    private final k2 f18870s;

    /* renamed from: t  reason: collision with root package name */
    private final k0.d<y1> f18871t;

    /* renamed from: u  reason: collision with root package name */
    private final HashSet<y1> f18872u;

    /* renamed from: v  reason: collision with root package name */
    private final k0.d<b0<?>> f18873v;

    /* renamed from: w  reason: collision with root package name */
    private final List<pc.q<f<?>, n2, e2, dc.w>> f18874w;

    /* renamed from: x  reason: collision with root package name */
    private final List<pc.q<f<?>, n2, e2, dc.w>> f18875x;

    /* renamed from: y  reason: collision with root package name */
    private final k0.d<y1> f18876y;

    /* renamed from: z  reason: collision with root package name */
    private k0.b<y1, k0.c<Object>> f18877z;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composition.kt */
    /* loaded from: classes.dex */
    public static final class a implements e2 {

        /* renamed from: a  reason: collision with root package name */
        private final Set<f2> f18878a;

        /* renamed from: b  reason: collision with root package name */
        private final List<f2> f18879b;

        /* renamed from: c  reason: collision with root package name */
        private final List<f2> f18880c;

        /* renamed from: d  reason: collision with root package name */
        private final List<pc.a<dc.w>> f18881d;

        /* renamed from: e  reason: collision with root package name */
        private List<k> f18882e;

        /* renamed from: f  reason: collision with root package name */
        private List<k> f18883f;

        public a(Set<f2> set) {
            qc.q.i(set, "abandoning");
            this.f18878a = set;
            this.f18879b = new ArrayList();
            this.f18880c = new ArrayList();
            this.f18881d = new ArrayList();
        }

        @Override // j0.e2
        public void a(f2 f2Var) {
            qc.q.i(f2Var, "instance");
            int lastIndexOf = this.f18879b.lastIndexOf(f2Var);
            if (lastIndexOf >= 0) {
                this.f18879b.remove(lastIndexOf);
                this.f18878a.remove(f2Var);
                return;
            }
            this.f18880c.add(f2Var);
        }

        @Override // j0.e2
        public void b(k kVar) {
            qc.q.i(kVar, "instance");
            List list = this.f18883f;
            if (list == null) {
                list = new ArrayList();
                this.f18883f = list;
            }
            list.add(kVar);
        }

        @Override // j0.e2
        public void c(k kVar) {
            qc.q.i(kVar, "instance");
            List list = this.f18882e;
            if (list == null) {
                list = new ArrayList();
                this.f18882e = list;
            }
            list.add(kVar);
        }

        @Override // j0.e2
        public void d(f2 f2Var) {
            qc.q.i(f2Var, "instance");
            int lastIndexOf = this.f18880c.lastIndexOf(f2Var);
            if (lastIndexOf >= 0) {
                this.f18880c.remove(lastIndexOf);
                this.f18878a.remove(f2Var);
                return;
            }
            this.f18879b.add(f2Var);
        }

        @Override // j0.e2
        public void e(pc.a<dc.w> aVar) {
            qc.q.i(aVar, "effect");
            this.f18881d.add(aVar);
        }

        public final void f() {
            if ((!this.f18878a.isEmpty()) != false) {
                Object a10 = k3.f18687a.a("Compose:abandons");
                try {
                    Iterator<f2> it = this.f18878a.iterator();
                    while (it.hasNext()) {
                        f2 next = it.next();
                        it.remove();
                        next.b();
                    }
                    dc.w wVar = dc.w.f13270a;
                } finally {
                    k3.f18687a.b(a10);
                }
            }
        }

        public final void g() {
            boolean z10;
            Object a10;
            List<k> list = this.f18882e;
            List<k> list2 = list;
            boolean z11 = false;
            if (list2 != null && !list2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                a10 = k3.f18687a.a("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).i();
                    }
                    dc.w wVar = dc.w.f13270a;
                    k3.f18687a.b(a10);
                    list.clear();
                } finally {
                }
            }
            if ((!this.f18880c.isEmpty()) != false) {
                a10 = k3.f18687a.a("Compose:onForgotten");
                try {
                    for (int size2 = this.f18880c.size() - 1; -1 < size2; size2--) {
                        f2 f2Var = this.f18880c.get(size2);
                        if (!this.f18878a.contains(f2Var)) {
                            f2Var.c();
                        }
                    }
                    dc.w wVar2 = dc.w.f13270a;
                } finally {
                }
            }
            if ((!this.f18879b.isEmpty()) != false) {
                a10 = k3.f18687a.a("Compose:onRemembered");
                try {
                    List<f2> list3 = this.f18879b;
                    int size3 = list3.size();
                    for (int i10 = 0; i10 < size3; i10++) {
                        f2 f2Var2 = list3.get(i10);
                        this.f18878a.remove(f2Var2);
                        f2Var2.d();
                    }
                    dc.w wVar3 = dc.w.f13270a;
                } finally {
                }
            }
            List<k> list4 = this.f18883f;
            List<k> list5 = list4;
            if (list5 == null || list5.isEmpty()) {
                z11 = true;
            }
            if (!z11) {
                a10 = k3.f18687a.a("Compose:releases");
                try {
                    for (int size4 = list4.size() - 1; -1 < size4; size4--) {
                        list4.get(size4).b();
                    }
                    dc.w wVar4 = dc.w.f13270a;
                    k3.f18687a.b(a10);
                    list4.clear();
                } finally {
                }
            }
        }

        public final void h() {
            if ((!this.f18881d.isEmpty()) != false) {
                Object a10 = k3.f18687a.a("Compose:sideeffects");
                try {
                    List<pc.a<dc.w>> list = this.f18881d;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke();
                    }
                    this.f18881d.clear();
                    dc.w wVar = dc.w.f13270a;
                } finally {
                    k3.f18687a.b(a10);
                }
            }
        }
    }

    public r(p pVar, f<?> fVar, hc.f fVar2) {
        qc.q.i(pVar, "parent");
        qc.q.i(fVar, "applier");
        this.f18865f = pVar;
        this.f18866m = fVar;
        this.f18867p = new AtomicReference<>(null);
        this.f18868q = new Object();
        HashSet<f2> hashSet = new HashSet<>();
        this.f18869r = hashSet;
        k2 k2Var = new k2();
        this.f18870s = k2Var;
        this.f18871t = new k0.d<>();
        this.f18872u = new HashSet<>();
        this.f18873v = new k0.d<>();
        ArrayList arrayList = new ArrayList();
        this.f18874w = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f18875x = arrayList2;
        this.f18876y = new k0.d<>();
        this.f18877z = new k0.b<>(0, 1, null);
        m mVar = new m(fVar, pVar, k2Var, hashSet, arrayList, arrayList2, this);
        pVar.m(mVar);
        this.D = mVar;
        this.E = fVar2;
        this.F = pVar instanceof b2;
        this.H = i.f18651a.a();
    }

    private final void A() {
        Object andSet = this.f18867p.getAndSet(null);
        if (!qc.q.d(andSet, s.c())) {
            if (andSet instanceof Set) {
                w((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set<? extends Object> set : (Set[]) andSet) {
                    w(set, false);
                }
            } else if (andSet == null) {
                n.w("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            } else {
                n.w("corrupt pendingModifications drain: " + this.f18867p);
                throw new KotlinNothingValueException();
            }
        }
    }

    private final boolean B() {
        return this.D.z0();
    }

    private final p0 C(y1 y1Var, d dVar, Object obj) {
        synchronized (this.f18868q) {
            r rVar = this.B;
            if (rVar == null || !this.f18870s.r(this.C, dVar)) {
                rVar = null;
            }
            if (rVar == null) {
                if (H(y1Var, obj)) {
                    return p0.IMMINENT;
                } else if (obj == null) {
                    this.f18877z.l(y1Var, null);
                } else {
                    s.b(this.f18877z, y1Var, obj);
                }
            }
            if (rVar != null) {
                return rVar.C(y1Var, dVar, obj);
            }
            this.f18865f.i(this);
            if (n()) {
                return p0.DEFERRED;
            }
            return p0.SCHEDULED;
        }
    }

    private final void D(Object obj) {
        int f10;
        k0.c o10;
        k0.d<y1> dVar = this.f18871t;
        f10 = dVar.f(obj);
        if (f10 >= 0) {
            o10 = dVar.o(f10);
            Object[] j10 = o10.j();
            int size = o10.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = j10[i10];
                qc.q.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                y1 y1Var = (y1) obj2;
                if (y1Var.s(obj) == p0.IMMINENT) {
                    this.f18876y.c(obj, y1Var);
                }
            }
        }
    }

    private final k0.b<y1, k0.c<Object>> G() {
        k0.b<y1, k0.c<Object>> bVar = this.f18877z;
        this.f18877z = new k0.b<>(0, 1, null);
        return bVar;
    }

    private final boolean H(y1 y1Var, Object obj) {
        if (n() && this.D.G1(y1Var, obj)) {
            return true;
        }
        return false;
    }

    private final void p() {
        this.f18867p.set(null);
        this.f18874w.clear();
        this.f18875x.clear();
        this.f18869r.clear();
    }

    private final HashSet<y1> v(HashSet<y1> hashSet, Object obj, boolean z10) {
        int f10;
        k0.c o10;
        k0.d<y1> dVar = this.f18871t;
        f10 = dVar.f(obj);
        if (f10 >= 0) {
            o10 = dVar.o(f10);
            Object[] j10 = o10.j();
            int size = o10.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = j10[i10];
                qc.q.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                y1 y1Var = (y1) obj2;
                if (!this.f18876y.m(obj, y1Var) && y1Var.s(obj) != p0.IGNORED) {
                    if (y1Var.t() && !z10) {
                        this.f18872u.add(y1Var);
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                        }
                        hashSet.add(y1Var);
                    }
                }
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(java.util.Set<? extends java.lang.Object> r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.r.w(java.util.Set, boolean):void");
    }

    private final void x(List<pc.q<f<?>, n2, e2, dc.w>> list) {
        boolean isEmpty;
        a aVar = new a(this.f18869r);
        try {
            if (list.isEmpty()) {
                if (isEmpty) {
                    return;
                }
                return;
            }
            Object a10 = k3.f18687a.a("Compose:applyChanges");
            try {
                this.f18866m.e();
                n2 t10 = this.f18870s.t();
                try {
                    f<?> fVar = this.f18866m;
                    int size = list.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        list.get(i11).invoke(fVar, t10, aVar);
                    }
                    list.clear();
                    dc.w wVar = dc.w.f13270a;
                    t10.G();
                    this.f18866m.i();
                    k3 k3Var = k3.f18687a;
                    k3Var.b(a10);
                    aVar.g();
                    aVar.h();
                    if (this.A) {
                        a10 = k3Var.a("Compose:unobserve");
                        try {
                            this.A = false;
                            k0.d<y1> dVar = this.f18871t;
                            int[] k10 = dVar.k();
                            k0.c<y1>[] i12 = dVar.i();
                            Object[] l10 = dVar.l();
                            int j10 = dVar.j();
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < j10) {
                                int i15 = k10[i13];
                                k0.c<y1> cVar = i12[i15];
                                qc.q.f(cVar);
                                Object[] j11 = cVar.j();
                                int size2 = cVar.size();
                                int i16 = 0;
                                while (i10 < size2) {
                                    k0.c<y1>[] cVarArr = i12;
                                    Object obj = j11[i10];
                                    int i17 = j10;
                                    qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    if ((!((y1) obj).r()) == false) {
                                        if (i16 != i10) {
                                            j11[i16] = obj;
                                        }
                                        i16++;
                                    }
                                    i10++;
                                    i12 = cVarArr;
                                    j10 = i17;
                                }
                                k0.c<y1>[] cVarArr2 = i12;
                                int i18 = j10;
                                for (int i19 = i16; i19 < size2; i19++) {
                                    j11[i19] = null;
                                }
                                ((k0.c) cVar).f19126f = i16;
                                if (cVar.size() > 0) {
                                    if (i14 != i13) {
                                        int i20 = k10[i14];
                                        k10[i14] = i15;
                                        k10[i13] = i20;
                                    }
                                    i14++;
                                }
                                i13++;
                                i12 = cVarArr2;
                                j10 = i18;
                                i10 = 0;
                            }
                            int j12 = dVar.j();
                            for (int i21 = i14; i21 < j12; i21++) {
                                l10[k10[i21]] = null;
                            }
                            dVar.p(i14);
                            y();
                            dc.w wVar2 = dc.w.f13270a;
                            k3.f18687a.b(a10);
                        } finally {
                        }
                    }
                    if (this.f18875x.isEmpty()) {
                        aVar.f();
                    }
                } catch (Throwable th) {
                    t10.G();
                    throw th;
                }
            } finally {
            }
        } finally {
            if (this.f18875x.isEmpty()) {
                aVar.f();
            }
        }
    }

    private final void y() {
        k0.d<b0<?>> dVar = this.f18873v;
        int[] k10 = dVar.k();
        k0.c<b0<?>>[] i10 = dVar.i();
        Object[] l10 = dVar.l();
        int j10 = dVar.j();
        int i11 = 0;
        int i12 = 0;
        while (i11 < j10) {
            int i13 = k10[i11];
            k0.c<b0<?>> cVar = i10[i13];
            qc.q.f(cVar);
            Object[] j11 = cVar.j();
            int size = cVar.size();
            int i14 = 0;
            int i15 = 0;
            while (i14 < size) {
                Object obj = j11[i14];
                qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                k0.c<b0<?>>[] cVarArr = i10;
                if ((!this.f18871t.e((b0) obj)) == false) {
                    if (i15 != i14) {
                        j11[i15] = obj;
                    }
                    i15++;
                }
                i14++;
                i10 = cVarArr;
            }
            k0.c<b0<?>>[] cVarArr2 = i10;
            for (int i16 = i15; i16 < size; i16++) {
                j11[i16] = null;
            }
            ((k0.c) cVar).f19126f = i15;
            if (cVar.size() > 0) {
                if (i12 != i11) {
                    int i17 = k10[i12];
                    k10[i12] = i13;
                    k10[i11] = i17;
                }
                i12++;
            }
            i11++;
            i10 = cVarArr2;
        }
        int j12 = dVar.j();
        for (int i18 = i12; i18 < j12; i18++) {
            l10[k10[i18]] = null;
        }
        dVar.p(i12);
        if ((!this.f18872u.isEmpty()) != false) {
            Iterator<y1> it = this.f18872u.iterator();
            qc.q.h(it, "iterator()");
            while (it.hasNext()) {
                if ((!it.next().t()) != false) {
                    it.remove();
                }
            }
        }
    }

    private final void z() {
        Object andSet = this.f18867p.getAndSet(s.c());
        if (andSet != null) {
            if (!qc.q.d(andSet, s.c())) {
                if (andSet instanceof Set) {
                    w((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set<? extends Object> set : (Set[]) andSet) {
                        w(set, true);
                    }
                    return;
                } else {
                    n.w("corrupt pendingModifications drain: " + this.f18867p);
                    throw new KotlinNothingValueException();
                }
            }
            n.w("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    public final void E(b0<?> b0Var) {
        qc.q.i(b0Var, "state");
        if (!this.f18871t.e(b0Var)) {
            this.f18873v.n(b0Var);
        }
    }

    public final void F(Object obj, y1 y1Var) {
        qc.q.i(obj, "instance");
        qc.q.i(y1Var, "scope");
        this.f18871t.m(obj, y1Var);
    }

    @Override // j0.y, j0.a2
    public void a(Object obj) {
        y1 B0;
        qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (!B() && (B0 = this.D.B0()) != null) {
            B0.F(true);
            if (!B0.v(obj)) {
                this.f18871t.c(obj, B0);
                if (obj instanceof b0) {
                    this.f18873v.n(obj);
                    for (Object obj2 : ((b0) obj).q().b()) {
                        if (obj2 != null) {
                            this.f18873v.c(obj2, obj);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // j0.y
    public void b(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "block");
        this.D.Q0(aVar);
    }

    @Override // j0.a2
    public void c(y1 y1Var) {
        qc.q.i(y1Var, "scope");
        this.A = true;
    }

    @Override // j0.a2
    public p0 d(y1 y1Var, Object obj) {
        r rVar;
        qc.q.i(y1Var, "scope");
        boolean z10 = true;
        if (y1Var.l()) {
            y1Var.B(true);
        }
        d j10 = y1Var.j();
        if (j10 != null && j10.b()) {
            if (!this.f18870s.u(j10)) {
                synchronized (this.f18868q) {
                    rVar = this.B;
                }
                if (rVar == null || !rVar.H(y1Var, obj)) {
                    z10 = false;
                }
                if (z10) {
                    return p0.IMMINENT;
                }
                return p0.IGNORED;
            } else if (!y1Var.k()) {
                return p0.IGNORED;
            } else {
                return C(y1Var, j10, obj);
            }
        }
        return p0.IGNORED;
    }

    @Override // j0.o
    public void dispose() {
        boolean z10;
        synchronized (this.f18868q) {
            if (!this.G) {
                this.G = true;
                this.H = i.f18651a.b();
                List<pc.q<f<?>, n2, e2, dc.w>> C0 = this.D.C0();
                if (C0 != null) {
                    x(C0);
                }
                if (this.f18870s.l() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || (true ^ this.f18869r.isEmpty())) {
                    a aVar = new a(this.f18869r);
                    if (z10) {
                        this.f18866m.e();
                        n2 t10 = this.f18870s.t();
                        try {
                            n.Q(t10, aVar);
                            dc.w wVar = dc.w.f13270a;
                            t10.G();
                            this.f18866m.clear();
                            this.f18866m.i();
                            aVar.g();
                        } catch (Throwable th) {
                            t10.G();
                            throw th;
                        }
                    }
                    aVar.f();
                }
                this.D.p0();
            }
            dc.w wVar2 = dc.w.f13270a;
        }
        this.f18865f.q(this);
    }

    @Override // j0.o
    public void e(pc.p<? super l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        if ((!this.G) != false) {
            this.H = pVar;
            this.f18865f.a(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // j0.y
    public boolean f(Set<? extends Object> set) {
        qc.q.i(set, "values");
        for (Object obj : set) {
            if (this.f18871t.e(obj) || this.f18873v.e(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.y
    public void g(b1 b1Var) {
        qc.q.i(b1Var, "state");
        a aVar = new a(this.f18869r);
        n2 t10 = b1Var.a().t();
        try {
            n.Q(t10, aVar);
            dc.w wVar = dc.w.f13270a;
            t10.G();
            aVar.g();
        } catch (Throwable th) {
            t10.G();
            throw th;
        }
    }

    @Override // j0.y
    public <R> R h(y yVar, int i10, pc.a<? extends R> aVar) {
        qc.q.i(aVar, "block");
        if (yVar != null && !qc.q.d(yVar, this) && i10 >= 0) {
            this.B = (r) yVar;
            this.C = i10;
            try {
                return aVar.invoke();
            } finally {
                this.B = null;
                this.C = 0;
            }
        }
        return aVar.invoke();
    }

    @Override // j0.y
    public void i() {
        synchronized (this.f18868q) {
            try {
                if ((!this.f18875x.isEmpty()) != false) {
                    x(this.f18875x);
                }
                dc.w wVar = dc.w.f13270a;
            } catch (Throwable th) {
                try {
                    if ((!this.f18869r.isEmpty()) != false) {
                        new a(this.f18869r).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    p();
                    throw e10;
                }
            }
        }
    }

    @Override // j0.y
    public void j(pc.p<? super l, ? super Integer, dc.w> pVar) {
        qc.q.i(pVar, "content");
        try {
            synchronized (this.f18868q) {
                z();
                k0.b<y1, k0.c<Object>> G = G();
                try {
                    this.D.k0(G, pVar);
                    dc.w wVar = dc.w.f13270a;
                } catch (Exception e10) {
                    this.f18877z = G;
                    throw e10;
                }
            }
        } finally {
        }
    }

    @Override // j0.o
    public boolean k() {
        return this.G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // j0.y
    public void l(Set<? extends Object> set) {
        Object obj;
        boolean d10;
        ?? y10;
        Set<? extends Object> set2;
        qc.q.i(set, "values");
        do {
            obj = this.f18867p.get();
            if (obj == null) {
                d10 = true;
            } else {
                d10 = qc.q.d(obj, s.c());
            }
            if (d10) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else if (obj instanceof Object[]) {
                qc.q.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                y10 = ec.o.y((Set[]) obj, set);
                set2 = y10;
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f18867p).toString());
            }
        } while (!s.t0.a(this.f18867p, obj, set2));
        if (obj == null) {
            synchronized (this.f18868q) {
                A();
                dc.w wVar = dc.w.f13270a;
            }
        }
    }

    @Override // j0.y
    public void m() {
        synchronized (this.f18868q) {
            try {
                x(this.f18874w);
                A();
                dc.w wVar = dc.w.f13270a;
            } catch (Throwable th) {
                try {
                    if ((!this.f18869r.isEmpty()) != false) {
                        new a(this.f18869r).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    p();
                    throw e10;
                }
            }
        }
    }

    @Override // j0.y
    public boolean n() {
        return this.D.M0();
    }

    @Override // j0.y
    public void o(List<dc.l<c1, c1>> list) {
        qc.q.i(list, "references");
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (!qc.q.d(list.get(i10).c().b(), this)) {
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        n.T(z10);
        try {
            this.D.J0(list);
            dc.w wVar = dc.w.f13270a;
        } finally {
        }
    }

    @Override // j0.y
    public void q(Object obj) {
        int f10;
        k0.c o10;
        qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        synchronized (this.f18868q) {
            D(obj);
            k0.d<b0<?>> dVar = this.f18873v;
            f10 = dVar.f(obj);
            if (f10 >= 0) {
                o10 = dVar.o(f10);
                Object[] j10 = o10.j();
                int size = o10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj2 = j10[i10];
                    qc.q.g(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    D((b0) obj2);
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    @Override // j0.o
    public boolean r() {
        boolean z10;
        synchronized (this.f18868q) {
            if (this.f18877z.h() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // j0.y
    public void s() {
        synchronized (this.f18868q) {
            try {
                this.D.h0();
                if ((!this.f18869r.isEmpty()) != false) {
                    new a(this.f18869r).f();
                }
                dc.w wVar = dc.w.f13270a;
            } catch (Throwable th) {
                try {
                    if ((!this.f18869r.isEmpty()) != false) {
                        new a(this.f18869r).f();
                    }
                    throw th;
                } catch (Exception e10) {
                    p();
                    throw e10;
                }
            }
        }
    }

    @Override // j0.y
    public boolean t() {
        boolean X0;
        synchronized (this.f18868q) {
            z();
            try {
                k0.b<y1, k0.c<Object>> G = G();
                try {
                    X0 = this.D.X0(G);
                    if (!X0) {
                        A();
                    }
                } catch (Exception e10) {
                    this.f18877z = G;
                    throw e10;
                }
            } finally {
            }
        }
        return X0;
    }

    @Override // j0.y
    public void u() {
        y1 y1Var;
        synchronized (this.f18868q) {
            for (Object obj : this.f18870s.m()) {
                if (obj instanceof y1) {
                    y1Var = (y1) obj;
                } else {
                    y1Var = null;
                }
                if (y1Var != null) {
                    y1Var.invalidate();
                }
            }
            dc.w wVar = dc.w.f13270a;
        }
    }

    public /* synthetic */ r(p pVar, f fVar, hc.f fVar2, int i10, qc.h hVar) {
        this(pVar, fVar, (i10 & 4) != 0 ? null : fVar2);
    }
}
