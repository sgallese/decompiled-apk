package t0;

import j0.e3;
import j0.m3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import t0.g;
import t0.j;

/* compiled from: Snapshot.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private static final pc.l<j, dc.w> f23333a = b.f23346f;

    /* renamed from: b */
    private static final e3<g> f23334b = new e3<>();

    /* renamed from: c */
    private static final Object f23335c = new Object();

    /* renamed from: d */
    private static j f23336d;

    /* renamed from: e */
    private static int f23337e;

    /* renamed from: f */
    private static final i f23338f;

    /* renamed from: g */
    private static final w<d0> f23339g;

    /* renamed from: h */
    private static final List<pc.p<Set<? extends Object>, g, dc.w>> f23340h;

    /* renamed from: i */
    private static final List<pc.l<Object, dc.w>> f23341i;

    /* renamed from: j */
    private static final AtomicReference<androidx.compose.runtime.snapshots.a> f23342j;

    /* renamed from: k */
    private static final g f23343k;

    /* renamed from: l */
    private static j0.g f23344l;

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<j, dc.w> {

        /* renamed from: f */
        public static final a f23345f = new a();

        a() {
            super(1);
        }

        public final void a(j jVar) {
            qc.q.i(jVar, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(j jVar) {
            a(jVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<j, dc.w> {

        /* renamed from: f */
        public static final b f23346f = new b();

        b() {
            super(1);
        }

        public final void a(j jVar) {
            qc.q.i(jVar, "it");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(j jVar) {
            a(jVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Object, dc.w> f23347f;

        /* renamed from: m */
        final /* synthetic */ pc.l<Object, dc.w> f23348m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
            super(1);
            this.f23347f = lVar;
            this.f23348m = lVar2;
        }

        public final void a(Object obj) {
            qc.q.i(obj, "state");
            this.f23347f.invoke(obj);
            this.f23348m.invoke(obj);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<Object, dc.w> {

        /* renamed from: f */
        final /* synthetic */ pc.l<Object, dc.w> f23349f;

        /* renamed from: m */
        final /* synthetic */ pc.l<Object, dc.w> f23350m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
            super(1);
            this.f23349f = lVar;
            this.f23350m = lVar2;
        }

        public final void a(Object obj) {
            qc.q.i(obj, "state");
            this.f23349f.invoke(obj);
            this.f23350m.invoke(obj);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Object obj) {
            a(obj);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Snapshot.kt */
    /* loaded from: classes.dex */
    public static final class e<T> extends qc.r implements pc.l<j, T> {

        /* renamed from: f */
        final /* synthetic */ pc.l<j, T> f23351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(pc.l<? super j, ? extends T> lVar) {
            super(1);
            this.f23351f = lVar;
        }

        @Override // pc.l
        /* renamed from: a */
        public final g invoke(j jVar) {
            qc.q.i(jVar, "invalid");
            g gVar = (g) this.f23351f.invoke(jVar);
            synchronized (l.G()) {
                l.f23336d = l.f23336d.o(gVar.f());
                dc.w wVar = dc.w.f13270a;
            }
            return gVar;
        }
    }

    static {
        j.a aVar = j.f23321r;
        f23336d = aVar.a();
        f23337e = 1;
        f23338f = new i();
        f23339g = new w<>();
        f23340h = new ArrayList();
        f23341i = new ArrayList();
        int i10 = f23337e;
        f23337e = i10 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i10, aVar.a());
        f23336d = f23336d.o(aVar2.f());
        AtomicReference<androidx.compose.runtime.snapshots.a> atomicReference = new AtomicReference<>(aVar2);
        f23342j = atomicReference;
        androidx.compose.runtime.snapshots.a aVar3 = atomicReference.get();
        qc.q.h(aVar3, "currentGlobalSnapshot.get()");
        f23343k = aVar3;
        f23344l = new j0.g(0);
    }

    public static final void A() {
        w<d0> wVar = f23339g;
        int e10 = wVar.e();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            d0 d0Var = null;
            if (i10 >= e10) {
                break;
            }
            m3<d0> m3Var = wVar.f()[i10];
            if (m3Var != null) {
                d0Var = m3Var.get();
            }
            if (d0Var != null && (!R(d0Var)) == false) {
                if (i11 != i10) {
                    wVar.f()[i11] = m3Var;
                    wVar.d()[i11] = wVar.d()[i10];
                }
                i11++;
            }
            i10++;
        }
        for (int i12 = i11; i12 < e10; i12++) {
            wVar.f()[i12] = null;
            wVar.d()[i12] = 0;
        }
        if (i11 != e10) {
            wVar.g(i11);
        }
    }

    public static final g B(g gVar, pc.l<Object, dc.w> lVar, boolean z10) {
        t0.b bVar;
        boolean z11 = gVar instanceof t0.b;
        if (!z11 && gVar != null) {
            return new h0(gVar, lVar, false, z10);
        }
        if (z11) {
            bVar = (t0.b) gVar;
        } else {
            bVar = null;
        }
        return new g0(bVar, lVar, null, false, z10);
    }

    public static /* synthetic */ g C(g gVar, pc.l lVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return B(gVar, lVar, z10);
    }

    public static final <T extends e0> T D(T t10) {
        T t11;
        qc.q.i(t10, "r");
        g.a aVar = g.f23297e;
        g b10 = aVar.b();
        T t12 = (T) U(t10, b10.f(), b10.g());
        if (t12 == null) {
            synchronized (G()) {
                g b11 = aVar.b();
                t11 = (T) U(t10, b11.f(), b11.g());
            }
            if (t11 != null) {
                return t11;
            }
            T();
            throw new KotlinNothingValueException();
        }
        return t12;
    }

    public static final <T extends e0> T E(T t10, g gVar) {
        qc.q.i(t10, "r");
        qc.q.i(gVar, "snapshot");
        T t11 = (T) U(t10, gVar.f(), gVar.g());
        if (t11 != null) {
            return t11;
        }
        T();
        throw new KotlinNothingValueException();
    }

    public static final g F() {
        g a10 = f23334b.a();
        if (a10 == null) {
            androidx.compose.runtime.snapshots.a aVar = f23342j.get();
            qc.q.h(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return a10;
    }

    public static final Object G() {
        return f23335c;
    }

    public static final g H() {
        return f23343k;
    }

    public static final pc.l<Object, dc.w> I(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2, boolean z10) {
        if (!z10) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && !qc.q.d(lVar, lVar2)) {
            return new c(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static /* synthetic */ pc.l J(pc.l lVar, pc.l lVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return I(lVar, lVar2, z10);
    }

    public static final pc.l<Object, dc.w> K(pc.l<Object, dc.w> lVar, pc.l<Object, dc.w> lVar2) {
        if (lVar != null && lVar2 != null && !qc.q.d(lVar, lVar2)) {
            return new d(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    public static final <T extends e0> T L(T t10, d0 d0Var) {
        qc.q.i(t10, "<this>");
        qc.q.i(d0Var, "state");
        T t11 = (T) b0(d0Var);
        if (t11 != null) {
            t11.h(Integer.MAX_VALUE);
            return t11;
        }
        T t12 = (T) t10.d();
        t12.h(Integer.MAX_VALUE);
        t12.g(d0Var.e());
        qc.q.g(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        d0Var.k(t12);
        qc.q.g(t12, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t12;
    }

    public static final <T extends e0> T M(T t10, d0 d0Var, g gVar) {
        T t11;
        qc.q.i(t10, "<this>");
        qc.q.i(d0Var, "state");
        qc.q.i(gVar, "snapshot");
        synchronized (G()) {
            t11 = (T) N(t10, d0Var, gVar);
        }
        return t11;
    }

    private static final <T extends e0> T N(T t10, d0 d0Var, g gVar) {
        T t11 = (T) L(t10, d0Var);
        t11.c(t10);
        t11.h(gVar.f());
        return t11;
    }

    public static final void O(g gVar, d0 d0Var) {
        qc.q.i(gVar, "snapshot");
        qc.q.i(d0Var, "state");
        gVar.w(gVar.j() + 1);
        pc.l<Object, dc.w> k10 = gVar.k();
        if (k10 != null) {
            k10.invoke(d0Var);
        }
    }

    public static final Map<e0, e0> P(t0.b bVar, t0.b bVar2, j jVar) {
        e0 U;
        k0.c<d0> E = bVar2.E();
        int f10 = bVar.f();
        if (E == null) {
            return null;
        }
        j n10 = bVar2.g().o(bVar2.f()).n(bVar2.F());
        Object[] j10 = E.j();
        int size = E.size();
        HashMap hashMap = null;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = j10[i10];
            qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            d0 d0Var = (d0) obj;
            e0 e10 = d0Var.e();
            e0 U2 = U(e10, f10, jVar);
            if (U2 != null && (U = U(e10, f10, n10)) != null && !qc.q.d(U2, U)) {
                e0 U3 = U(e10, bVar2.f(), bVar2.g());
                if (U3 != null) {
                    e0 f11 = d0Var.f(U, U2, U3);
                    if (f11 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(U2, f11);
                    hashMap = hashMap;
                } else {
                    T();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends e0> T Q(T t10, d0 d0Var, g gVar, T t11) {
        T t12;
        qc.q.i(t10, "<this>");
        qc.q.i(d0Var, "state");
        qc.q.i(gVar, "snapshot");
        qc.q.i(t11, "candidate");
        if (gVar.i()) {
            gVar.p(d0Var);
        }
        int f10 = gVar.f();
        if (t11.f() == f10) {
            return t11;
        }
        synchronized (G()) {
            t12 = (T) L(t10, d0Var);
        }
        t12.h(f10);
        gVar.p(d0Var);
        return t12;
    }

    private static final boolean R(d0 d0Var) {
        e0 e0Var;
        boolean z10;
        int e10 = f23338f.e(f23337e);
        e0 e0Var2 = null;
        e0 e0Var3 = null;
        int i10 = 0;
        for (e0 e11 = d0Var.e(); e11 != null; e11 = e11.e()) {
            int f10 = e11.f();
            if (f10 != 0) {
                if (f10 < e10) {
                    if (e0Var2 == null) {
                        i10++;
                        e0Var2 = e11;
                    } else {
                        if (e11.f() < e0Var2.f()) {
                            e0Var = e0Var2;
                            e0Var2 = e11;
                        } else {
                            e0Var = e11;
                        }
                        if (e0Var3 == null) {
                            e0Var3 = d0Var.e();
                            e0 e0Var4 = e0Var3;
                            while (true) {
                                if (e0Var3 != null) {
                                    if (e0Var3.f() >= e10) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        break;
                                    }
                                    if (e0Var4.f() < e0Var3.f()) {
                                        e0Var4 = e0Var3;
                                    }
                                    e0Var3 = e0Var3.e();
                                } else {
                                    e0Var3 = e0Var4;
                                    break;
                                }
                            }
                        }
                        e0Var2.h(0);
                        e0Var2.c(e0Var3);
                        e0Var2 = e0Var;
                    }
                } else {
                    i10++;
                }
            }
        }
        if (i10 <= 1) {
            return false;
        }
        return true;
    }

    public static final void S(d0 d0Var) {
        if (R(d0Var)) {
            f23339g.a(d0Var);
        }
    }

    public static final Void T() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final <T extends e0> T U(T t10, int i10, j jVar) {
        T t11 = null;
        while (t10 != null) {
            if (d0(t10, i10, jVar) && (t11 == null || t11.f() < t10.f())) {
                t11 = t10;
            }
            t10 = (T) t10.e();
        }
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public static final <T extends e0> T V(T t10, d0 d0Var) {
        T t11;
        qc.q.i(t10, "<this>");
        qc.q.i(d0Var, "state");
        g.a aVar = g.f23297e;
        g b10 = aVar.b();
        pc.l<Object, dc.w> h10 = b10.h();
        if (h10 != null) {
            h10.invoke(d0Var);
        }
        T t12 = (T) U(t10, b10.f(), b10.g());
        if (t12 == null) {
            synchronized (G()) {
                g b11 = aVar.b();
                e0 e10 = d0Var.e();
                qc.q.g(e10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                t11 = (T) U(e10, b11.f(), b11.g());
                if (t11 == null) {
                    T();
                    throw new KotlinNothingValueException();
                }
            }
            return t11;
        }
        return t12;
    }

    public static final void W(int i10) {
        f23338f.f(i10);
    }

    public static final Void X() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    public static final <T> T Y(g gVar, pc.l<? super j, ? extends T> lVar) {
        T invoke = lVar.invoke(f23336d.k(gVar.f()));
        synchronized (G()) {
            int i10 = f23337e;
            f23337e = i10 + 1;
            f23336d = f23336d.k(gVar.f());
            f23342j.set(new androidx.compose.runtime.snapshots.a(i10, f23336d));
            gVar.d();
            f23336d = f23336d.o(i10);
            dc.w wVar = dc.w.f13270a;
        }
        return invoke;
    }

    public static final <T extends g> T Z(pc.l<? super j, ? extends T> lVar) {
        return (T) y(new e(lVar));
    }

    public static final int a0(int i10, j jVar) {
        int a10;
        qc.q.i(jVar, "invalid");
        int m10 = jVar.m(i10);
        synchronized (G()) {
            a10 = f23338f.a(m10);
        }
        return a10;
    }

    private static final e0 b0(d0 d0Var) {
        int e10 = f23338f.e(f23337e) - 1;
        j a10 = j.f23321r.a();
        e0 e0Var = null;
        for (e0 e11 = d0Var.e(); e11 != null; e11 = e11.e()) {
            if (e11.f() == 0) {
                return e11;
            }
            if (d0(e11, e10, a10)) {
                if (e0Var == null) {
                    e0Var = e11;
                } else if (e11.f() >= e0Var.f()) {
                    return e0Var;
                } else {
                    return e11;
                }
            }
        }
        return null;
    }

    private static final boolean c0(int i10, int i11, j jVar) {
        if (i11 != 0 && i11 <= i10 && !jVar.l(i11)) {
            return true;
        }
        return false;
    }

    private static final boolean d0(e0 e0Var, int i10, j jVar) {
        return c0(i10, e0Var.f(), jVar);
    }

    public static final void e0(g gVar) {
        if (f23336d.l(gVar.f())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }

    public static final <T extends e0> T f0(T t10, d0 d0Var, g gVar) {
        qc.q.i(t10, "<this>");
        qc.q.i(d0Var, "state");
        qc.q.i(gVar, "snapshot");
        if (gVar.i()) {
            gVar.p(d0Var);
        }
        T t11 = (T) U(t10, gVar.f(), gVar.g());
        if (t11 != null) {
            if (t11.f() == gVar.f()) {
                return t11;
            }
            T t12 = (T) M(t11, d0Var, gVar);
            gVar.p(d0Var);
            return t12;
        }
        T();
        throw new KotlinNothingValueException();
    }

    public static final j x(j jVar, int i10, int i11) {
        qc.q.i(jVar, "<this>");
        while (i10 < i11) {
            jVar = jVar.o(i10);
            i10++;
        }
        return jVar;
    }

    public static final <T> T y(pc.l<? super j, ? extends T> lVar) {
        androidx.compose.runtime.snapshots.a aVar;
        k0.c<d0> E;
        T t10;
        List F0;
        g gVar = f23343k;
        qc.q.g(gVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) gVar;
        synchronized (G()) {
            aVar = f23342j.get();
            qc.q.h(aVar, "currentGlobalSnapshot.get()");
            E = aVar.E();
            if (E != null) {
                f23344l.a(1);
            }
            t10 = (T) Y(aVar, lVar);
        }
        if (E != null) {
            try {
                synchronized (G()) {
                    F0 = ec.b0.F0(f23340h);
                }
                int size = F0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((pc.p) F0.get(i10)).invoke(E, aVar);
                }
            } finally {
                f23344l.a(-1);
            }
        }
        synchronized (G()) {
            A();
            if (E != null) {
                Object[] j10 = E.j();
                int size2 = E.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Object obj = j10[i11];
                    qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    S((d0) obj);
                }
                dc.w wVar = dc.w.f13270a;
            }
        }
        return t10;
    }

    public static final void z() {
        y(a.f23345f);
    }
}
