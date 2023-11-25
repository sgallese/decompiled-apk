package j0;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final pc.q<f<?>, n2, e2, dc.w> f18804a = b.f18816f;

    /* renamed from: b  reason: collision with root package name */
    private static final pc.q<f<?>, n2, e2, dc.w> f18805b = d.f18818f;

    /* renamed from: c  reason: collision with root package name */
    private static final pc.q<f<?>, n2, e2, dc.w> f18806c = a.f18815f;

    /* renamed from: d  reason: collision with root package name */
    private static final pc.q<f<?>, n2, e2, dc.w> f18807d = e.f18819f;

    /* renamed from: e  reason: collision with root package name */
    private static final pc.q<f<?>, n2, e2, dc.w> f18808e = c.f18817f;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f18809f = new m1("provider");

    /* renamed from: g  reason: collision with root package name */
    private static final Object f18810g = new m1("provider");

    /* renamed from: h  reason: collision with root package name */
    private static final Object f18811h = new m1("compositionLocalMap");

    /* renamed from: i  reason: collision with root package name */
    private static final Object f18812i = new m1("providerValues");

    /* renamed from: j  reason: collision with root package name */
    private static final Object f18813j = new m1("providers");

    /* renamed from: k  reason: collision with root package name */
    private static final Object f18814k = new m1("reference");

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.q<f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f18815f = new a();

        a() {
            super(3);
        }

        public final void a(f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.O();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.q<f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f18816f = new b();

        b() {
            super(3);
        }

        public final void a(f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "rememberManager");
            n.Q(n2Var, e2Var);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.q<f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final c f18817f = new c();

        c() {
            super(3);
        }

        public final void a(f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.I0();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.q<f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f18818f = new d();

        d() {
            super(3);
        }

        public final void a(f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.P0();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.q<f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f18819f = new e();

        e() {
            super(3);
        }

        public final void a(f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.Q(0);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    private static final int A(List<o0> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int k10 = qc.q.k(list.get(i12).b(), i10);
            if (k10 < 0) {
                i11 = i12 + 1;
            } else if (k10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 B(List<o0> list, int i10, int i11) {
        int z10 = z(list, i10);
        if (z10 < list.size()) {
            o0 o0Var = list.get(z10);
            if (o0Var.b() < i11) {
                return o0Var;
            }
            return null;
        }
        return null;
    }

    public static final Object C() {
        return f18811h;
    }

    public static final Object D() {
        return f18809f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E(r0 r0Var) {
        if (r0Var.d() != null) {
            return new q0(Integer.valueOf(r0Var.a()), r0Var.d());
        }
        return Integer.valueOf(r0Var.a());
    }

    public static final Object F() {
        return f18810g;
    }

    public static final Object G() {
        return f18813j;
    }

    public static final Object H() {
        return f18812i;
    }

    public static final Object I() {
        return f18814k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(List<o0> list, int i10, y1 y1Var, Object obj) {
        int A = A(list, i10);
        k0.c cVar = null;
        if (A < 0) {
            int i11 = -(A + 1);
            if (obj != null) {
                cVar = new k0.c();
                cVar.add(obj);
            }
            list.add(i11, new o0(y1Var, i10, cVar));
        } else if (obj == null) {
            list.get(A).e(null);
        } else {
            k0.c<Object> a10 = list.get(A).a();
            if (a10 != null) {
                a10.add(obj);
            }
        }
    }

    public static final boolean K() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> L() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int M(j2 j2Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 != i12 && i11 != i12) {
            if (j2Var.N(i10) == i11) {
                return i11;
            }
            if (j2Var.N(i11) == i10) {
                return i10;
            }
            if (j2Var.N(i10) == j2Var.N(i11)) {
                return j2Var.N(i10);
            }
            int x10 = x(j2Var, i10, i12);
            int x11 = x(j2Var, i11, i12);
            int i13 = x10 - x11;
            for (int i14 = 0; i14 < i13; i14++) {
                i10 = j2Var.N(i10);
            }
            int i15 = x11 - x10;
            for (int i16 = 0; i16 < i15; i16++) {
                i11 = j2Var.N(i11);
            }
            while (i10 != i11) {
                i10 = j2Var.N(i10);
                i11 = j2Var.N(i11);
            }
            return i10;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V N(HashMap<K, LinkedHashSet<V>> hashMap, K k10) {
        Object b02;
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet != null) {
            b02 = ec.b0.b0(linkedHashSet);
            V v10 = (V) b02;
            if (v10 != null) {
                P(hashMap, k10, v10);
                return v10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean O(HashMap<K, LinkedHashSet<V>> hashMap, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k10, linkedHashSet);
        }
        return linkedHashSet.add(v10);
    }

    private static final <K, V> dc.w P(HashMap<K, LinkedHashSet<V>> hashMap, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k10);
        if (linkedHashSet != null) {
            linkedHashSet.remove(v10);
            if (linkedHashSet.isEmpty()) {
                hashMap.remove(k10);
            }
            return dc.w.f13270a;
        }
        return null;
    }

    public static final void Q(n2 n2Var, e2 e2Var) {
        qc.q.i(n2Var, "<this>");
        qc.q.i(e2Var, "rememberManager");
        Iterator<Object> e02 = n2Var.e0();
        while (e02.hasNext()) {
            Object next = e02.next();
            if (next instanceof k) {
                e2Var.b((k) next);
            }
            if (next instanceof f2) {
                e2Var.a((f2) next);
            }
            if (next instanceof y1) {
                ((y1) next).w();
            }
        }
        n2Var.F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 R(List<o0> list, int i10) {
        int A = A(list, i10);
        if (A >= 0) {
            return list.remove(A);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(List<o0> list, int i10, int i11) {
        int z10 = z(list, i10);
        while (z10 < list.size() && list.get(z10).b() < i11) {
            list.remove(z10);
        }
    }

    public static final void T(boolean z10) {
        if (z10) {
            return;
        }
        w("Check failed".toString());
        throw new KotlinNothingValueException();
    }

    public static final void V(int i10, int i11, int i12, String str) {
        qc.q.i(str, "info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> u(k2 k2Var, j0.d dVar) {
        ArrayList arrayList = new ArrayList();
        j2 s10 = k2Var.s();
        try {
            v(s10, arrayList, k2Var.e(dVar));
            dc.w wVar = dc.w.f13270a;
            return arrayList;
        } finally {
            s10.d();
        }
    }

    private static final void v(j2 j2Var, List<Object> list, int i10) {
        if (j2Var.H(i10)) {
            list.add(j2Var.J(i10));
            return;
        }
        int i11 = i10 + 1;
        int C = i10 + j2Var.C(i10);
        while (i11 < C) {
            v(j2Var, list, i11);
            i11 += j2Var.C(i11);
        }
    }

    public static final Void w(String str) {
        qc.q.i(str, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    private static final int x(j2 j2Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = j2Var.N(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<o0> y(List<o0> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int z10 = z(list, i10); z10 < list.size(); z10++) {
            o0 o0Var = list.get(z10);
            if (o0Var.b() >= i11) {
                break;
            }
            arrayList.add(o0Var);
        }
        return arrayList;
    }

    private static final int z(List<o0> list, int i10) {
        int A = A(list, i10);
        if (A < 0) {
            return -(A + 1);
        }
        return A;
    }

    public static final void U() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(boolean z10) {
        return z10 ? 1 : 0;
    }
}
