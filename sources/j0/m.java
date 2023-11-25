package j0;

import androidx.recyclerview.widget.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.l0;
import j0.y1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import l0.g;

/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class m implements j0.l {
    private int A;
    private int B;
    private int C;
    private boolean D;
    private final h E;
    private final f3<y1> F;
    private boolean G;
    private boolean H;
    private j2 I;
    private k2 J;
    private n2 K;
    private boolean L;
    private p1 M;
    private List<pc.q<j0.f<?>, n2, e2, dc.w>> N;
    private j0.d O;
    private final List<pc.q<j0.f<?>, n2, e2, dc.w>> P;
    private boolean Q;
    private int R;
    private int S;
    private f3<Object> T;
    private int U;
    private boolean V;
    private boolean W;
    private final m0 X;
    private final f3<pc.q<j0.f<?>, n2, e2, dc.w>> Y;
    private int Z;

    /* renamed from: a0  reason: collision with root package name */
    private int f18701a0;

    /* renamed from: b  reason: collision with root package name */
    private final j0.f<?> f18702b;

    /* renamed from: b0  reason: collision with root package name */
    private int f18703b0;

    /* renamed from: c  reason: collision with root package name */
    private final j0.p f18704c;

    /* renamed from: c0  reason: collision with root package name */
    private int f18705c0;

    /* renamed from: d  reason: collision with root package name */
    private final k2 f18706d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f2> f18707e;

    /* renamed from: f  reason: collision with root package name */
    private List<pc.q<j0.f<?>, n2, e2, dc.w>> f18708f;

    /* renamed from: g  reason: collision with root package name */
    private List<pc.q<j0.f<?>, n2, e2, dc.w>> f18709g;

    /* renamed from: h  reason: collision with root package name */
    private final j0.y f18710h;

    /* renamed from: i  reason: collision with root package name */
    private final f3<o1> f18711i;

    /* renamed from: j  reason: collision with root package name */
    private o1 f18712j;

    /* renamed from: k  reason: collision with root package name */
    private int f18713k;

    /* renamed from: l  reason: collision with root package name */
    private m0 f18714l;

    /* renamed from: m  reason: collision with root package name */
    private int f18715m;

    /* renamed from: n  reason: collision with root package name */
    private m0 f18716n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f18717o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<Integer, Integer> f18718p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18719q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f18720r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f18721s;

    /* renamed from: t  reason: collision with root package name */
    private final List<o0> f18722t;

    /* renamed from: u  reason: collision with root package name */
    private final m0 f18723u;

    /* renamed from: v  reason: collision with root package name */
    private p1 f18724v;

    /* renamed from: w  reason: collision with root package name */
    private final k0.e<p1> f18725w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f18726x;

    /* renamed from: y  reason: collision with root package name */
    private final m0 f18727y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f18728z;

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class a0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<dc.w> f18730f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(pc.a<dc.w> aVar) {
            super(3);
            this.f18730f = aVar;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "rememberManager");
            e2Var.e(this.f18730f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public final class b extends j0.p {

        /* renamed from: a  reason: collision with root package name */
        private final int f18731a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f18732b;

        /* renamed from: c  reason: collision with root package name */
        private Set<Set<u0.a>> f18733c;

        /* renamed from: d  reason: collision with root package name */
        private final Set<m> f18734d = new LinkedHashSet();

        /* renamed from: e  reason: collision with root package name */
        private final j1 f18735e;

        public b(int i10, boolean z10) {
            j1 e10;
            this.f18731a = i10;
            this.f18732b = z10;
            e10 = d3.e(q0.e.a(), null, 2, null);
            this.f18735e = e10;
        }

        private final p1 t() {
            return (p1) this.f18735e.getValue();
        }

        private final void u(p1 p1Var) {
            this.f18735e.setValue(p1Var);
        }

        @Override // j0.p
        public void a(j0.y yVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
            qc.q.i(yVar, "composition");
            qc.q.i(pVar, "content");
            m.this.f18704c.a(yVar, pVar);
        }

        @Override // j0.p
        public void b(c1 c1Var) {
            qc.q.i(c1Var, "reference");
            m.this.f18704c.b(c1Var);
        }

        @Override // j0.p
        public void c() {
            m mVar = m.this;
            mVar.B--;
        }

        @Override // j0.p
        public boolean d() {
            return this.f18732b;
        }

        @Override // j0.p
        public p1 e() {
            return t();
        }

        @Override // j0.p
        public int f() {
            return this.f18731a;
        }

        @Override // j0.p
        public hc.f g() {
            return m.this.f18704c.g();
        }

        @Override // j0.p
        public void h(c1 c1Var) {
            qc.q.i(c1Var, "reference");
            m.this.f18704c.h(c1Var);
        }

        @Override // j0.p
        public void i(j0.y yVar) {
            qc.q.i(yVar, "composition");
            m.this.f18704c.i(m.this.A0());
            m.this.f18704c.i(yVar);
        }

        @Override // j0.p
        public void j(c1 c1Var, b1 b1Var) {
            qc.q.i(c1Var, "reference");
            qc.q.i(b1Var, "data");
            m.this.f18704c.j(c1Var, b1Var);
        }

        @Override // j0.p
        public b1 k(c1 c1Var) {
            qc.q.i(c1Var, "reference");
            return m.this.f18704c.k(c1Var);
        }

        @Override // j0.p
        public void l(Set<u0.a> set) {
            qc.q.i(set, "table");
            Set set2 = this.f18733c;
            if (set2 == null) {
                set2 = new HashSet();
                this.f18733c = set2;
            }
            set2.add(set);
        }

        @Override // j0.p
        public void m(j0.l lVar) {
            qc.q.i(lVar, "composer");
            super.m((m) lVar);
            this.f18734d.add(lVar);
        }

        @Override // j0.p
        public void n(j0.y yVar) {
            qc.q.i(yVar, "composition");
            m.this.f18704c.n(yVar);
        }

        @Override // j0.p
        public void o() {
            m.this.B++;
        }

        @Override // j0.p
        public void p(j0.l lVar) {
            qc.q.i(lVar, "composer");
            Set<Set<u0.a>> set = this.f18733c;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((m) lVar).f18706d);
                }
            }
            qc.k0.a(this.f18734d).remove(lVar);
        }

        @Override // j0.p
        public void q(j0.y yVar) {
            qc.q.i(yVar, "composition");
            m.this.f18704c.q(yVar);
        }

        public final void r() {
            if ((!this.f18734d.isEmpty()) != false) {
                Set<Set<u0.a>> set = this.f18733c;
                if (set != null) {
                    for (m mVar : this.f18734d) {
                        Iterator<Set<u0.a>> it = set.iterator();
                        while (it.hasNext()) {
                            it.next().remove(mVar.f18706d);
                        }
                    }
                }
                this.f18734d.clear();
            }
        }

        public final Set<m> s() {
            return this.f18734d;
        }

        public final void v(p1 p1Var) {
            qc.q.i(p1Var, "scope");
            u(p1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class b0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0.d f18737f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(j0.d dVar) {
            super(3);
            this.f18737f = dVar;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.R(this.f18737f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class c extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.p<T, V, dc.w> f18738f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ V f18739m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(pc.p<? super T, ? super V, dc.w> pVar, V v10) {
            super(3);
            this.f18738f = pVar;
            this.f18739m = v10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            this.f18738f.invoke(fVar.b(), this.f18739m);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class c0 implements a2 {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0.y f18740f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c1 f18741m;

        c0(j0.y yVar, c1 c1Var) {
            this.f18740f = yVar;
            this.f18741m = c1Var;
        }

        @Override // j0.a2
        public void a(Object obj) {
            qc.q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        }

        @Override // j0.a2
        public void c(y1 y1Var) {
            qc.q.i(y1Var, "scope");
        }

        @Override // j0.a2
        public p0 d(y1 y1Var, Object obj) {
            a2 a2Var;
            p0 p0Var;
            List<dc.l<y1, k0.c<Object>>> s02;
            qc.q.i(y1Var, "scope");
            j0.y yVar = this.f18740f;
            k0.c cVar = null;
            if (yVar instanceof a2) {
                a2Var = (a2) yVar;
            } else {
                a2Var = null;
            }
            if (a2Var == null || (p0Var = a2Var.d(y1Var, obj)) == null) {
                p0Var = p0.IGNORED;
            }
            if (p0Var == p0.IGNORED) {
                c1 c1Var = this.f18741m;
                List<dc.l<y1, k0.c<Object>>> d10 = c1Var.d();
                if (obj != null) {
                    cVar = new k0.c();
                    cVar.add(cVar);
                }
                s02 = ec.b0.s0(d10, dc.r.a(y1Var, cVar));
                c1Var.h(s02);
                return p0.SCHEDULED;
            }
            return p0Var;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.a<T> f18742f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.d f18743m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f18744p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.a<? extends T> aVar, j0.d dVar, int i10) {
            super(3);
            this.f18742f = aVar;
            this.f18743m = dVar;
            this.f18744p = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            Object invoke = this.f18742f.invoke();
            n2Var.e1(this.f18743m, invoke);
            fVar.h(this.f18744p, invoke);
            fVar.d(invoke);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class d0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c1 f18746m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(c1 c1Var) {
            super(3);
            this.f18746m = c1Var;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            m.this.u1(this.f18746m, n2Var);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class e extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j0.d f18747f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18748m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(j0.d dVar, int i10) {
            super(3);
            this.f18747f = dVar;
            this.f18748m = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            Object w02 = n2Var.w0(this.f18747f);
            fVar.g();
            fVar.c(this.f18748m, w02);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class e0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18749f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(int i10) {
            super(3);
            this.f18749f = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.q0(this.f18749f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class f extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f18750f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Object obj) {
            super(3);
            this.f18750f = obj;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "rememberManager");
            e2Var.c((j0.k) this.f18750f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class f0 extends qc.r implements pc.p<j0.l, Integer, p1> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ w1<?>[] f18751f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ p1 f18752m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(w1<?>[] w1VarArr, p1 p1Var) {
            super(2);
            this.f18751f = w1VarArr;
            this.f18752m = p1Var;
        }

        public final p1 a(j0.l lVar, int i10) {
            lVar.e(-948105361);
            if (j0.n.K()) {
                j0.n.V(-948105361, i10, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1994)");
            }
            p1 a10 = j0.w.a(this.f18751f, this.f18752m, lVar, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
            lVar.N();
            return a10;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ p1 invoke(j0.l lVar, Integer num) {
            return a(lVar, num.intValue());
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class g extends qc.r implements pc.p<Integer, Object, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18754m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Composer.kt */
        /* loaded from: classes.dex */
        public static final class a extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f18755f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f18756m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, int i10) {
                super(3);
                this.f18755f = obj;
                this.f18756m = i10;
            }

            public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
                qc.q.i(fVar, "<anonymous parameter 0>");
                qc.q.i(n2Var, "slots");
                qc.q.i(e2Var, "rememberManager");
                if (qc.q.d(this.f18755f, n2Var.Q0(n2Var.V(), this.f18756m))) {
                    e2Var.a((f2) this.f18755f);
                    n2Var.L0(this.f18756m, j0.l.f18688a.a());
                    return;
                }
                j0.n.w("Slot table is out of sync".toString());
                throw new KotlinNothingValueException();
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
                a(fVar, n2Var, e2Var);
                return dc.w.f13270a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Composer.kt */
        /* loaded from: classes.dex */
        public static final class b extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f18757f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ int f18758m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, int i10) {
                super(3);
                this.f18757f = obj;
                this.f18758m = i10;
            }

            public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
                qc.q.i(fVar, "<anonymous parameter 0>");
                qc.q.i(n2Var, "slots");
                qc.q.i(e2Var, "<anonymous parameter 2>");
                if (qc.q.d(this.f18757f, n2Var.Q0(n2Var.V(), this.f18758m))) {
                    n2Var.L0(this.f18758m, j0.l.f18688a.a());
                } else {
                    j0.n.w("Slot table is out of sync".toString());
                    throw new KotlinNothingValueException();
                }
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
                a(fVar, n2Var, e2Var);
                return dc.w.f13270a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i10) {
            super(2);
            this.f18754m = i10;
        }

        public final void a(int i10, Object obj) {
            if (obj instanceof f2) {
                m.this.I.O(this.f18754m);
                m.q1(m.this, false, new a(obj, i10), 1, null);
            } else if (obj instanceof y1) {
                ((y1) obj).w();
                m.this.I.O(this.f18754m);
                m.q1(m.this, false, new b(obj, i10), 1, null);
            }
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(Integer num, Object obj) {
            a(num.intValue(), obj);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class g0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f18759f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(Object obj) {
            super(3);
            this.f18759f = obj;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.a1(this.f18759f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class h implements j0.c0 {
        h() {
        }

        @Override // j0.c0
        public void a(j0.b0<?> b0Var) {
            qc.q.i(b0Var, "derivedState");
            m mVar = m.this;
            mVar.B--;
        }

        @Override // j0.c0
        public void b(j0.b0<?> b0Var) {
            qc.q.i(b0Var, "derivedState");
            m.this.B++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class h0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f18761f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(Object obj) {
            super(3);
            this.f18761f = obj;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "rememberManager");
            e2Var.d((f2) this.f18761f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes.dex */
    public static final class i<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int d10;
            d10 = gc.c.d(Integer.valueOf(((o0) t10).b()), Integer.valueOf(((o0) t11).b()));
            return d10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class i0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f18762f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18763m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(Object obj, int i10) {
            super(3);
            this.f18762f = obj;
            this.f18763m = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "rememberManager");
            Object obj = this.f18762f;
            if (obj instanceof f2) {
                e2Var.d((f2) obj);
            }
            Object L0 = n2Var.L0(this.f18763m, this.f18762f);
            if (L0 instanceof f2) {
                e2Var.a((f2) L0);
            } else if (L0 instanceof y1) {
                ((y1) L0).w();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class j extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ pc.l<j0.o, dc.w> f18764f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f18765m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(pc.l<? super j0.o, dc.w> lVar, m mVar) {
            super(3);
            this.f18764f = lVar;
            this.f18765m = mVar;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            this.f18764f.invoke(this.f18765m.A0());
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    static final class j0 extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final j0 f18766f = new j0();

        j0() {
            super(3);
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            Object b10 = fVar.b();
            qc.q.g(b10, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((j0.k) b10).l();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class k extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f18767f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.d f18768m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qc.d0 d0Var, j0.d dVar) {
            super(3);
            this.f18767f = d0Var;
            this.f18768m = dVar;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            this.f18767f.f21667f = m.H0(n2Var, this.f18768m, fVar);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class l extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<pc.q<j0.f<?>, n2, e2, dc.w>> f18770m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ j2 f18771p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c1 f18772q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<pc.q<j0.f<?>, n2, e2, dc.w>> list, j2 j2Var, c1 c1Var) {
            super(0);
            this.f18770m = list;
            this.f18771p = j2Var;
            this.f18772q = c1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            m mVar = m.this;
            List<pc.q<j0.f<?>, n2, e2, dc.w>> list = this.f18770m;
            j2 j2Var = this.f18771p;
            c1 c1Var = this.f18772q;
            List list2 = mVar.f18708f;
            try {
                mVar.f18708f = list;
                j2 j2Var2 = mVar.I;
                int[] iArr = mVar.f18717o;
                mVar.f18717o = null;
                try {
                    mVar.I = j2Var;
                    mVar.L0(c1Var.c(), c1Var.e(), c1Var.f(), true);
                    dc.w wVar = dc.w.f13270a;
                } finally {
                    mVar.I = j2Var2;
                    mVar.f18717o = iArr;
                }
            } finally {
                mVar.f18708f = list2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* renamed from: j0.m$m  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0422m extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f18773f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<pc.q<j0.f<?>, n2, e2, dc.w>> f18774m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0422m(qc.d0 d0Var, List<pc.q<j0.f<?>, n2, e2, dc.w>> list) {
            super(3);
            this.f18773f = d0Var;
            this.f18774m = list;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "rememberManager");
            int i10 = this.f18773f.f21667f;
            if (i10 > 0) {
                fVar = new l1(fVar, i10);
            }
            List<pc.q<j0.f<?>, n2, e2, dc.w>> list = this.f18774m;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(fVar, n2Var, e2Var);
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class n extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f18775f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<Object> f18776m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(qc.d0 d0Var, List<? extends Object> list) {
            super(3);
            this.f18775f = d0Var;
            this.f18776m = list;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            int i10 = this.f18775f.f21667f;
            List<Object> list = this.f18776m;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = list.get(i11);
                int i12 = i10 + i11;
                fVar.c(i12, obj);
                fVar.h(i12, obj);
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class o extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b1 f18777f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m f18778m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c1 f18779p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c1 f18780q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(b1 b1Var, m mVar, c1 c1Var, c1 c1Var2) {
            super(3);
            this.f18777f = b1Var;
            this.f18778m = mVar;
            this.f18779p = c1Var;
            this.f18780q = c1Var2;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            b1 b1Var = this.f18777f;
            if (b1Var == null && (b1Var = this.f18778m.f18704c.k(this.f18779p)) == null) {
                j0.n.w("Could not resolve state for movable content");
                throw new KotlinNothingValueException();
            }
            List<j0.d> s02 = n2Var.s0(1, b1Var.a(), 2);
            y1.a aVar = y1.f18925h;
            j0.y b10 = this.f18780q.b();
            qc.q.g(b10, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeOwner");
            aVar.a(n2Var, s02, (a2) b10);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class p extends qc.r implements pc.a<dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c1 f18782m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(c1 c1Var) {
            super(0);
            this.f18782m = c1Var;
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ dc.w invoke() {
            invoke2();
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            m.this.L0(this.f18782m.c(), this.f18782m.e(), this.f18782m.f(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class q extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ qc.d0 f18783f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ List<pc.q<j0.f<?>, n2, e2, dc.w>> f18784m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(qc.d0 d0Var, List<pc.q<j0.f<?>, n2, e2, dc.w>> list) {
            super(3);
            this.f18783f = d0Var;
            this.f18784m = list;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "rememberManager");
            int i10 = this.f18783f.f21667f;
            if (i10 > 0) {
                fVar = new l1(fVar, i10);
            }
            List<pc.q<j0.f<?>, n2, e2, dc.w>> list = this.f18784m;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                list.get(i11).invoke(fVar, n2Var, e2Var);
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class r extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final r f18785f = new r();

        r() {
            super(3);
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            m.I0(n2Var, fVar, 0);
            n2Var.O();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class s extends qc.r implements pc.p<j0.l, Integer, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ a1<Object> f18786f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f18787m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(a1<Object> a1Var, Object obj) {
            super(2);
            this.f18786f = a1Var;
            this.f18787m = obj;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ dc.w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return dc.w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (j0.n.K()) {
                j0.n.V(316014703, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2946)");
            }
            this.f18786f.a().invoke(this.f18787m, lVar, 8);
            if (j0.n.K()) {
                j0.n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class t extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object[] f18788f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Object[] objArr) {
            super(3);
            this.f18788f = objArr;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            int length = this.f18788f.length;
            for (int i10 = 0; i10 < length; i10++) {
                fVar.d(this.f18788f[i10]);
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class u extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18789f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18790m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(int i10, int i11) {
            super(3);
            this.f18789f = i10;
            this.f18790m = i11;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            fVar.a(this.f18789f, this.f18790m);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class v extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18791f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ int f18792m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ int f18793p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(int i10, int i11, int i12) {
            super(3);
            this.f18791f = i10;
            this.f18792m = i11;
            this.f18793p = i12;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            fVar.f(this.f18791f, this.f18792m, this.f18793p);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class w extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18794f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i10) {
            super(3);
            this.f18794f = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.z(this.f18794f);
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class x extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18795f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(int i10) {
            super(3);
            this.f18795f = i10;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "<anonymous parameter 1>");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            int i10 = this.f18795f;
            for (int i11 = 0; i11 < i10; i11++) {
                fVar.g();
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class y extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k2 f18796f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.d f18797m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(k2 k2Var, j0.d dVar) {
            super(3);
            this.f18796f = k2Var;
            this.f18797m = dVar;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "<anonymous parameter 0>");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "<anonymous parameter 2>");
            n2Var.D();
            k2 k2Var = this.f18796f;
            n2Var.p0(k2Var, this.f18797m.d(k2Var), false);
            n2Var.P();
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class z extends qc.r implements pc.q<j0.f<?>, n2, e2, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k2 f18798f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.d f18799m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ List<pc.q<j0.f<?>, n2, e2, dc.w>> f18800p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(k2 k2Var, j0.d dVar, List<pc.q<j0.f<?>, n2, e2, dc.w>> list) {
            super(3);
            this.f18798f = k2Var;
            this.f18799m = dVar;
            this.f18800p = list;
        }

        public final void a(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            qc.q.i(fVar, "applier");
            qc.q.i(n2Var, "slots");
            qc.q.i(e2Var, "rememberManager");
            k2 k2Var = this.f18798f;
            List<pc.q<j0.f<?>, n2, e2, dc.w>> list = this.f18800p;
            n2 t10 = k2Var.t();
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invoke(fVar, t10, e2Var);
                }
                dc.w wVar = dc.w.f13270a;
                t10.G();
                n2Var.D();
                k2 k2Var2 = this.f18798f;
                n2Var.p0(k2Var2, this.f18799m.d(k2Var2), false);
                n2Var.P();
            } catch (Throwable th) {
                t10.G();
                throw th;
            }
        }

        @Override // pc.q
        public /* bridge */ /* synthetic */ dc.w invoke(j0.f<?> fVar, n2 n2Var, e2 e2Var) {
            a(fVar, n2Var, e2Var);
            return dc.w.f13270a;
        }
    }

    public m(j0.f<?> fVar, j0.p pVar, k2 k2Var, Set<f2> set, List<pc.q<j0.f<?>, n2, e2, dc.w>> list, List<pc.q<j0.f<?>, n2, e2, dc.w>> list2, j0.y yVar) {
        qc.q.i(fVar, "applier");
        qc.q.i(pVar, "parentContext");
        qc.q.i(k2Var, "slotTable");
        qc.q.i(set, "abandonSet");
        qc.q.i(list, "changes");
        qc.q.i(list2, "lateChanges");
        qc.q.i(yVar, "composition");
        this.f18702b = fVar;
        this.f18704c = pVar;
        this.f18706d = k2Var;
        this.f18707e = set;
        this.f18708f = list;
        this.f18709g = list2;
        this.f18710h = yVar;
        this.f18711i = new f3<>();
        this.f18714l = new m0();
        this.f18716n = new m0();
        this.f18722t = new ArrayList();
        this.f18723u = new m0();
        this.f18724v = q0.e.a();
        this.f18725w = new k0.e<>(0, 1, null);
        this.f18727y = new m0();
        this.A = -1;
        this.D = true;
        this.E = new h();
        this.F = new f3<>();
        j2 s10 = k2Var.s();
        s10.d();
        this.I = s10;
        k2 k2Var2 = new k2();
        this.J = k2Var2;
        n2 t10 = k2Var2.t();
        t10.G();
        this.K = t10;
        j2 s11 = this.J.s();
        try {
            j0.d a10 = s11.a(0);
            s11.d();
            this.O = a10;
            this.P = new ArrayList();
            this.T = new f3<>();
            this.W = true;
            this.X = new m0();
            this.Y = new f3<>();
            this.Z = -1;
            this.f18701a0 = -1;
            this.f18703b0 = -1;
        } catch (Throwable th) {
            s11.d();
            throw th;
        }
    }

    private final void A1() {
        this.f18715m = this.I.u();
        this.I.R();
    }

    private final void B1(int i10, Object obj, int i11, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj3 = obj;
        R1();
        H1(i10, obj, obj2);
        l0.a aVar = l0.f18691a;
        int i12 = 0;
        if (i11 != aVar.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        o1 o1Var = null;
        if (n()) {
            this.I.c();
            int V = this.K.V();
            if (z10) {
                this.K.X0(i10, j0.l.f18688a.a());
            } else if (obj2 != null) {
                n2 n2Var = this.K;
                if (obj3 == null) {
                    obj3 = j0.l.f18688a.a();
                }
                n2Var.T0(i10, obj3, obj2);
            } else {
                n2 n2Var2 = this.K;
                if (obj3 == null) {
                    obj3 = j0.l.f18688a.a();
                }
                n2Var2.V0(i10, obj3);
            }
            o1 o1Var2 = this.f18712j;
            if (o1Var2 != null) {
                r0 r0Var = new r0(i10, -1, K0(V), -1, 0);
                o1Var2.i(r0Var, this.f18713k - o1Var2.e());
                o1Var2.h(r0Var);
            }
            w0(z10, null);
            return;
        }
        if (i11 != aVar.b()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && this.f18728z) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f18712j == null) {
            int o10 = this.I.o();
            if (!z12 && o10 == i10 && qc.q.d(obj, this.I.p())) {
                E1(z10, obj2);
            } else {
                this.f18712j = new o1(this.I.h(), this.f18713k);
            }
        }
        o1 o1Var3 = this.f18712j;
        if (o1Var3 != null) {
            r0 d10 = o1Var3.d(i10, obj);
            if (!z12 && d10 != null) {
                o1Var3.h(d10);
                int b10 = d10.b();
                this.f18713k = o1Var3.g(d10) + o1Var3.e();
                int m10 = o1Var3.m(d10);
                int a10 = m10 - o1Var3.a();
                o1Var3.k(m10, o1Var3.a());
                l1(b10);
                this.I.O(b10);
                if (a10 > 0) {
                    o1(new e0(a10));
                }
                E1(z10, obj2);
            } else {
                this.I.c();
                this.Q = true;
                this.M = null;
                v0();
                this.K.D();
                int V2 = this.K.V();
                if (z10) {
                    this.K.X0(i10, j0.l.f18688a.a());
                } else if (obj2 != null) {
                    n2 n2Var3 = this.K;
                    if (obj3 == null) {
                        obj3 = j0.l.f18688a.a();
                    }
                    n2Var3.T0(i10, obj3, obj2);
                } else {
                    n2 n2Var4 = this.K;
                    if (obj3 == null) {
                        obj3 = j0.l.f18688a.a();
                    }
                    n2Var4.V0(i10, obj3);
                }
                this.O = this.K.A(V2);
                r0 r0Var2 = new r0(i10, -1, K0(V2), -1, 0);
                o1Var3.i(r0Var2, this.f18713k - o1Var3.e());
                o1Var3.h(r0Var2);
                ArrayList arrayList = new ArrayList();
                if (!z10) {
                    i12 = this.f18713k;
                }
                o1Var = new o1(arrayList, i12);
            }
        }
        w0(z10, o1Var);
    }

    private final void C1(int i10) {
        B1(i10, null, l0.f18691a.a(), null);
    }

    private final Object D0(j2 j2Var) {
        return j2Var.J(j2Var.t());
    }

    private final void D1(int i10, Object obj) {
        B1(i10, obj, l0.f18691a.a(), null);
    }

    private final int E0(j2 j2Var, int i10) {
        Object x10;
        if (j2Var.E(i10)) {
            Object B = j2Var.B(i10);
            if (B != null) {
                if (B instanceof Enum) {
                    return ((Enum) B).ordinal();
                }
                if (B instanceof a1) {
                    return 126665345;
                }
                return B.hashCode();
            }
            return 0;
        }
        int A = j2Var.A(i10);
        if (A == 207 && (x10 = j2Var.x(i10)) != null && !qc.q.d(x10, j0.l.f18688a.a())) {
            A = x10.hashCode();
        }
        return A;
    }

    private final void E1(boolean z10, Object obj) {
        if (z10) {
            this.I.T();
            return;
        }
        if (obj != null && this.I.m() != obj) {
            q1(this, false, new g0(obj), 1, null);
        }
        this.I.S();
    }

    private final void F0(List<dc.l<c1, c1>> list) {
        pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar;
        k2 g10;
        j0.d a10;
        List u10;
        j2 s10;
        List list2;
        k2 a11;
        pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar2;
        List<pc.q<j0.f<?>, n2, e2, dc.w>> list3 = this.f18709g;
        List list4 = this.f18708f;
        try {
            this.f18708f = list3;
            qVar = j0.n.f18808e;
            b1(qVar);
            int size = list.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                dc.l<c1, c1> lVar = list.get(i11);
                c1 a12 = lVar.a();
                c1 b10 = lVar.b();
                j0.d a13 = a12.a();
                int e10 = a12.g().e(a13);
                qc.d0 d0Var = new qc.d0();
                W0();
                b1(new k(d0Var, a13));
                if (b10 == null) {
                    if (qc.q.d(a12.g(), this.J)) {
                        m0();
                    }
                    s10 = a12.g().s();
                    try {
                        s10.O(e10);
                        this.U = e10;
                        ArrayList arrayList = new ArrayList();
                        Z0(this, null, null, null, null, new l(arrayList, s10, a12), 15, null);
                        if ((!arrayList.isEmpty()) != false) {
                            b1(new C0422m(d0Var, arrayList));
                        }
                        dc.w wVar = dc.w.f13270a;
                        s10.d();
                    } finally {
                    }
                } else {
                    b1 k10 = this.f18704c.k(b10);
                    if (k10 == null || (g10 = k10.a()) == null) {
                        g10 = b10.g();
                    }
                    if (k10 == null || (a11 = k10.a()) == null || (a10 = a11.a(i10)) == null) {
                        a10 = b10.a();
                    }
                    u10 = j0.n.u(g10, a10);
                    if ((!u10.isEmpty()) != false) {
                        b1(new n(d0Var, u10));
                        if (qc.q.d(a12.g(), this.f18706d)) {
                            int e11 = this.f18706d.e(a13);
                            L1(e11, P1(e11) + u10.size());
                        }
                    }
                    b1(new o(k10, this, b10, a12));
                    s10 = g10.s();
                    try {
                        j2 j2Var = this.I;
                        int[] iArr = this.f18717o;
                        this.f18717o = null;
                        try {
                            this.I = s10;
                            int e12 = g10.e(a10);
                            s10.O(e12);
                            this.U = e12;
                            ArrayList arrayList2 = new ArrayList();
                            List list5 = this.f18708f;
                            try {
                                this.f18708f = arrayList2;
                                list2 = list5;
                                try {
                                    Y0(b10.b(), a12.b(), Integer.valueOf(s10.l()), b10.d(), new p(a12));
                                    dc.w wVar2 = dc.w.f13270a;
                                    this.f18708f = list2;
                                    if ((!arrayList2.isEmpty()) != false) {
                                        b1(new q(d0Var, arrayList2));
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    this.f18708f = list2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                list2 = list5;
                            }
                        } finally {
                        }
                    } finally {
                    }
                }
                qVar2 = j0.n.f18805b;
                b1(qVar2);
                i11++;
                i10 = 0;
            }
            b1(r.f18785f);
            this.U = 0;
            dc.w wVar3 = dc.w.f13270a;
        } finally {
            this.f18708f = list4;
        }
    }

    private final void F1() {
        int t10;
        this.I = this.f18706d.s();
        C1(100);
        this.f18704c.o();
        this.f18724v = this.f18704c.e();
        m0 m0Var = this.f18727y;
        t10 = j0.n.t(this.f18726x);
        m0Var.i(t10);
        this.f18726x = Q(this.f18724v);
        this.M = null;
        if (!this.f18719q) {
            this.f18719q = this.f18704c.d();
        }
        Set<u0.a> set = (Set) j0.w.d(this.f18724v, u0.c.a());
        if (set != null) {
            set.add(this.f18706d);
            this.f18704c.l(set);
        }
        C1(this.f18704c.f());
    }

    private static final int G0(n2 n2Var) {
        int x02;
        int V = n2Var.V();
        int W = n2Var.W();
        while (W >= 0 && !n2Var.l0(W)) {
            W = n2Var.z0(W);
        }
        int i10 = W + 1;
        int i11 = 0;
        while (i10 < V) {
            if (n2Var.g0(V, i10)) {
                if (n2Var.l0(i10)) {
                    i11 = 0;
                }
                i10++;
            } else {
                if (n2Var.l0(i10)) {
                    x02 = 1;
                } else {
                    x02 = n2Var.x0(i10);
                }
                i11 += x02;
                i10 += n2Var.d0(i10);
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H0(n2 n2Var, j0.d dVar, j0.f<Object> fVar) {
        boolean z10;
        int B = n2Var.B(dVar);
        boolean z11 = true;
        if (n2Var.V() < B) {
            z10 = true;
        } else {
            z10 = false;
        }
        j0.n.T(z10);
        I0(n2Var, fVar, B);
        int G0 = G0(n2Var);
        while (n2Var.V() < B) {
            if (n2Var.f0(B)) {
                if (n2Var.k0()) {
                    fVar.d(n2Var.v0(n2Var.V()));
                    G0 = 0;
                }
                n2Var.U0();
            } else {
                G0 += n2Var.O0();
            }
        }
        if (n2Var.V() != B) {
            z11 = false;
        }
        j0.n.T(z11);
        return G0;
    }

    private final void H1(int i10, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !qc.q.d(obj2, j0.l.f18688a.a())) {
                I1(obj2.hashCode());
            } else {
                I1(i10);
            }
        } else if (obj instanceof Enum) {
            I1(((Enum) obj).ordinal());
        } else {
            I1(obj.hashCode());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(n2 n2Var, j0.f<Object> fVar, int i10) {
        while (!n2Var.h0(i10)) {
            n2Var.P0();
            if (n2Var.l0(n2Var.W())) {
                fVar.g();
            }
            n2Var.O();
        }
    }

    private final void I1(int i10) {
        this.R = i10 ^ Integer.rotateLeft(K(), 3);
    }

    private final void J1(int i10, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i10 == 207 && !qc.q.d(obj2, j0.l.f18688a.a())) {
                K1(obj2.hashCode());
            } else {
                K1(i10);
            }
        } else if (obj instanceof Enum) {
            K1(((Enum) obj).ordinal());
        } else {
            K1(obj.hashCode());
        }
    }

    private final int K0(int i10) {
        return (-2) - i10;
    }

    private final void K1(int i10) {
        this.R = Integer.rotateRight(i10 ^ K(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        r10.f18725w.c(r10.I.l(), r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L0(j0.a1<java.lang.Object> r11, j0.p1 r12, java.lang.Object r13, boolean r14) {
        /*
            r10 = this;
            r0 = 126665345(0x78cc281, float:2.1179178E-34)
            r10.r(r0, r11)
            r10.Q(r13)
            int r1 = r10.K()
            r10.R = r0     // Catch: java.lang.Throwable -> La1
            boolean r0 = r10.n()     // Catch: java.lang.Throwable -> La1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L1d
            j0.n2 r0 = r10.K     // Catch: java.lang.Throwable -> La1
            j0.n2.n0(r0, r3, r4, r2)     // Catch: java.lang.Throwable -> La1
        L1d:
            boolean r0 = r10.n()     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L24
            goto L31
        L24:
            j0.j2 r0 = r10.I     // Catch: java.lang.Throwable -> La1
            java.lang.Object r0 = r0.m()     // Catch: java.lang.Throwable -> La1
            boolean r0 = qc.q.d(r0, r12)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L31
            r3 = 1
        L31:
            if (r3 == 0) goto L3e
            k0.e<j0.p1> r0 = r10.f18725w     // Catch: java.lang.Throwable -> La1
            j0.j2 r5 = r10.I     // Catch: java.lang.Throwable -> La1
            int r5 = r5.l()     // Catch: java.lang.Throwable -> La1
            r0.c(r5, r12)     // Catch: java.lang.Throwable -> La1
        L3e:
            java.lang.Object r0 = j0.n.C()     // Catch: java.lang.Throwable -> La1
            j0.l0$a r5 = j0.l0.f18691a     // Catch: java.lang.Throwable -> La1
            int r5 = r5.a()     // Catch: java.lang.Throwable -> La1
            r6 = 202(0xca, float:2.83E-43)
            r10.B1(r6, r0, r5, r12)     // Catch: java.lang.Throwable -> La1
            boolean r12 = r10.n()     // Catch: java.lang.Throwable -> La1
            if (r12 == 0) goto L83
            if (r14 != 0) goto L83
            r10.L = r4     // Catch: java.lang.Throwable -> La1
            r10.M = r2     // Catch: java.lang.Throwable -> La1
            j0.n2 r12 = r10.K     // Catch: java.lang.Throwable -> La1
            int r14 = r12.W()     // Catch: java.lang.Throwable -> La1
            int r14 = r12.z0(r14)     // Catch: java.lang.Throwable -> La1
            j0.d r7 = r12.A(r14)     // Catch: java.lang.Throwable -> La1
            j0.c1 r12 = new j0.c1     // Catch: java.lang.Throwable -> La1
            j0.y r5 = r10.A0()     // Catch: java.lang.Throwable -> La1
            j0.k2 r6 = r10.J     // Catch: java.lang.Throwable -> La1
            java.util.List r8 = ec.r.i()     // Catch: java.lang.Throwable -> La1
            j0.p1 r9 = r10.n0()     // Catch: java.lang.Throwable -> La1
            r2 = r12
            r3 = r11
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La1
            j0.p r11 = r10.f18704c     // Catch: java.lang.Throwable -> La1
            r11.h(r12)     // Catch: java.lang.Throwable -> La1
            goto L98
        L83:
            boolean r12 = r10.f18726x     // Catch: java.lang.Throwable -> La1
            r10.f18726x = r3     // Catch: java.lang.Throwable -> La1
            j0.m$s r14 = new j0.m$s     // Catch: java.lang.Throwable -> La1
            r14.<init>(r11, r13)     // Catch: java.lang.Throwable -> La1
            r11 = 316014703(0x12d6006f, float:1.3505406E-27)
            q0.a r11 = q0.c.c(r11, r4, r14)     // Catch: java.lang.Throwable -> La1
            j0.c.b(r10, r11)     // Catch: java.lang.Throwable -> La1
            r10.f18726x = r12     // Catch: java.lang.Throwable -> La1
        L98:
            r10.t0()
            r10.R = r1
            r10.M()
            return
        La1:
            r11 = move-exception
            r10.t0()
            r10.R = r1
            r10.M()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.m.L0(j0.a1, j0.p1, java.lang.Object, boolean):void");
    }

    private final void L1(int i10, int i11) {
        if (P1(i10) != i11) {
            if (i10 < 0) {
                HashMap<Integer, Integer> hashMap = this.f18718p;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.f18718p = hashMap;
                }
                hashMap.put(Integer.valueOf(i10), Integer.valueOf(i11));
                return;
            }
            int[] iArr = this.f18717o;
            if (iArr == null) {
                iArr = new int[this.I.v()];
                ec.o.s(iArr, -1, 0, 0, 6, null);
                this.f18717o = iArr;
            }
            iArr[i10] = i11;
        }
    }

    private final void M1(int i10, int i11) {
        int P1 = P1(i10);
        if (P1 != i11) {
            int i12 = i11 - P1;
            int b10 = this.f18711i.b() - 1;
            while (i10 != -1) {
                int P12 = P1(i10) + i12;
                L1(i10, P12);
                int i13 = b10;
                while (true) {
                    if (-1 < i13) {
                        o1 f10 = this.f18711i.f(i13);
                        if (f10 != null && f10.n(i10, P12)) {
                            b10 = i13 - 1;
                            break;
                        }
                        i13--;
                    } else {
                        break;
                    }
                }
                if (i10 < 0) {
                    i10 = this.I.t();
                } else if (!this.I.H(i10)) {
                    i10 = this.I.N(i10);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [j0.p1, java.lang.Object] */
    private final p1 N1(p1 p1Var, p1 p1Var2) {
        g.a<j0.t<Object>, g3<? extends Object>> l10 = p1Var.l();
        l10.putAll(p1Var2);
        ?? e10 = l10.e();
        D1(204, j0.n.G());
        Q(e10);
        Q(p1Var2);
        t0();
        return e10;
    }

    private final Object O0(j2 j2Var, int i10) {
        return j2Var.J(i10);
    }

    private final int P0(int i10, int i11, int i12, int i13) {
        int N = this.I.N(i11);
        while (N != i12 && !this.I.H(N)) {
            N = this.I.N(N);
        }
        if (this.I.H(N)) {
            i13 = 0;
        }
        if (N == i11) {
            return i13;
        }
        int P1 = (P1(N) - this.I.L(i11)) + i13;
        loop1: while (i13 < P1 && N != i10) {
            N++;
            while (N < i10) {
                int C = this.I.C(N) + N;
                if (i10 >= C) {
                    i13 += P1(N);
                    N = C;
                }
            }
            break loop1;
        }
        return i13;
    }

    private final int P1(int i10) {
        int i11;
        Integer num;
        if (i10 < 0) {
            HashMap<Integer, Integer> hashMap = this.f18718p;
            if (hashMap != null && (num = hashMap.get(Integer.valueOf(i10))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.f18717o;
        if (iArr != null && (i11 = iArr[i10]) >= 0) {
            return i11;
        }
        return this.I.L(i10);
    }

    private final void Q1() {
        if (this.f18721s) {
            this.f18721s = false;
        } else {
            j0.n.w("A call to createNode(), emitNode() or useNode() expected was not expected".toString());
            throw new KotlinNothingValueException();
        }
    }

    private final void R() {
        i0();
        this.f18711i.a();
        this.f18714l.a();
        this.f18716n.a();
        this.f18723u.a();
        this.f18727y.a();
        this.f18725w.a();
        if (!this.I.j()) {
            this.I.d();
        }
        if (!this.K.U()) {
            this.K.G();
        }
        this.P.clear();
        m0();
        this.R = 0;
        this.B = 0;
        this.f18721s = false;
        this.Q = false;
        this.f18728z = false;
        this.G = false;
        this.f18720r = false;
        this.A = -1;
    }

    private final void R0() {
        if (this.T.d()) {
            S0(this.T.i());
            this.T.a();
        }
    }

    private final void R1() {
        if ((!this.f18721s) != false) {
            return;
        }
        j0.n.w("A call to createNode(), emitNode() or useNode() expected".toString());
        throw new KotlinNothingValueException();
    }

    private final void S0(Object[] objArr) {
        b1(new t(objArr));
    }

    private final void T0() {
        int i10 = this.f18705c0;
        this.f18705c0 = 0;
        if (i10 > 0) {
            int i11 = this.Z;
            if (i11 >= 0) {
                this.Z = -1;
                c1(new u(i11, i10));
                return;
            }
            int i12 = this.f18701a0;
            this.f18701a0 = -1;
            int i13 = this.f18703b0;
            this.f18703b0 = -1;
            c1(new v(i12, i13, i10));
        }
    }

    private final void U0(boolean z10) {
        int l10;
        boolean z11;
        if (z10) {
            l10 = this.I.t();
        } else {
            l10 = this.I.l();
        }
        int i10 = l10 - this.U;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (i10 > 0) {
                b1(new w(i10));
                this.U = l10;
                return;
            }
            return;
        }
        j0.n.w("Tried to seek backward".toString());
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ void V0(m mVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.U0(z10);
    }

    private final void W0() {
        int i10 = this.S;
        if (i10 > 0) {
            this.S = 0;
            b1(new x(i10));
        }
    }

    private final <R> R Y0(j0.y yVar, j0.y yVar2, Integer num, List<dc.l<y1, k0.c<Object>>> list, pc.a<? extends R> aVar) {
        R r10;
        int i10;
        boolean z10 = this.W;
        boolean z11 = this.G;
        int i11 = this.f18713k;
        try {
            this.W = false;
            this.G = true;
            this.f18713k = 0;
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                dc.l<y1, k0.c<Object>> lVar = list.get(i12);
                y1 a10 = lVar.a();
                k0.c<Object> b10 = lVar.b();
                if (b10 != null) {
                    Object[] j10 = b10.j();
                    int size2 = b10.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        Object obj = j10[i13];
                        qc.q.g(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        G1(a10, obj);
                    }
                } else {
                    G1(a10, null);
                }
            }
            if (yVar != null) {
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = -1;
                }
                r10 = (R) yVar.h(yVar2, i10, aVar);
                if (r10 == null) {
                }
                return r10;
            }
            r10 = aVar.invoke();
            return r10;
        } finally {
            this.W = z10;
            this.G = z11;
            this.f18713k = i11;
        }
    }

    static /* synthetic */ Object Z0(m mVar, j0.y yVar, j0.y yVar2, Integer num, List list, pc.a aVar, int i10, Object obj) {
        j0.y yVar3;
        j0.y yVar4;
        Integer num2;
        List i11;
        if ((i10 & 1) != 0) {
            yVar3 = null;
        } else {
            yVar3 = yVar;
        }
        if ((i10 & 2) != 0) {
            yVar4 = null;
        } else {
            yVar4 = yVar2;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        } else {
            num2 = num;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            i11 = ec.t.i();
            list2 = i11;
        }
        return mVar.Y0(yVar3, yVar4, num2, list2, aVar);
    }

    private final void a1() {
        o0 B;
        boolean z10 = this.G;
        this.G = true;
        int t10 = this.I.t();
        int C = this.I.C(t10) + t10;
        int i10 = this.f18713k;
        int K = K();
        int i11 = this.f18715m;
        B = j0.n.B(this.f18722t, this.I.l(), C);
        boolean z11 = false;
        int i12 = t10;
        while (B != null) {
            int b10 = B.b();
            j0.n.R(this.f18722t, b10);
            if (B.d()) {
                this.I.O(b10);
                int l10 = this.I.l();
                s1(i12, l10, t10);
                this.f18713k = P0(b10, l10, t10, i10);
                this.R = l0(this.I.N(l10), t10, K);
                this.M = null;
                B.c().h(this);
                this.M = null;
                this.I.P(t10);
                i12 = l10;
                z11 = true;
            } else {
                this.F.h(B.c());
                B.c().x();
                this.F.g();
            }
            B = j0.n.B(this.f18722t, this.I.l(), C);
        }
        if (z11) {
            s1(i12, t10, t10);
            this.I.R();
            int P1 = P1(t10);
            this.f18713k = i10 + P1;
            this.f18715m = i11 + P1;
        } else {
            A1();
        }
        this.R = K;
        this.G = z10;
    }

    private final void b1(pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        this.f18708f.add(qVar);
    }

    private final void c1(pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        W0();
        R0();
        b1(qVar);
    }

    private final void d1() {
        pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar;
        w1(this.I.l());
        qVar = j0.n.f18804a;
        o1(qVar);
        this.U += this.I.q();
    }

    private final void e1(Object obj) {
        this.T.h(obj);
    }

    private final void f1() {
        boolean z10;
        pc.q qVar;
        int t10 = this.I.t();
        if (this.X.g(-1) <= t10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.X.g(-1) == t10) {
                this.X.h();
                qVar = j0.n.f18806c;
                q1(this, false, qVar, 1, null);
                return;
            }
            return;
        }
        j0.n.w("Missed recording an endGroup".toString());
        throw new KotlinNothingValueException();
    }

    private final void g0() {
        o0 R;
        y1 y1Var;
        boolean z10;
        if (!n()) {
            R = j0.n.R(this.f18722t, this.I.t());
            Object I = this.I.I();
            if (qc.q.d(I, j0.l.f18688a.a())) {
                j0.y A0 = A0();
                qc.q.g(A0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                y1Var = new y1((j0.r) A0);
                O1(y1Var);
            } else {
                qc.q.g(I, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                y1Var = (y1) I;
            }
            if (R != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            y1Var.C(z10);
            this.F.h(y1Var);
            y1Var.G(this.C);
            return;
        }
        j0.y A02 = A0();
        qc.q.g(A02, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        y1 y1Var2 = new y1((j0.r) A02);
        this.F.h(y1Var2);
        O1(y1Var2);
        y1Var2.G(this.C);
    }

    private final void g1() {
        pc.q qVar;
        if (this.V) {
            qVar = j0.n.f18806c;
            q1(this, false, qVar, 1, null);
            this.V = false;
        }
    }

    private final void h1(pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        this.P.add(qVar);
    }

    private final void i0() {
        this.f18712j = null;
        this.f18713k = 0;
        this.f18715m = 0;
        this.U = 0;
        this.R = 0;
        this.f18721s = false;
        this.V = false;
        this.X.a();
        this.F.a();
        j0();
    }

    private final void i1(j0.d dVar) {
        List F0;
        if (!this.P.isEmpty()) {
            F0 = ec.b0.F0(this.P);
            this.P.clear();
            W0();
            R0();
            o1(new z(this.J, dVar, F0));
            return;
        }
        o1(new y(this.J, dVar));
    }

    private final void j0() {
        this.f18717o = null;
        this.f18718p = null;
    }

    private final void j1(pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        this.Y.h(qVar);
    }

    private final void k1(int i10, int i11, int i12) {
        if (i12 > 0) {
            int i13 = this.f18705c0;
            if (i13 > 0 && this.f18701a0 == i10 - i13 && this.f18703b0 == i11 - i13) {
                this.f18705c0 = i13 + i12;
                return;
            }
            T0();
            this.f18701a0 = i10;
            this.f18703b0 = i11;
            this.f18705c0 = i12;
        }
    }

    private final int l0(int i10, int i11, int i12) {
        if (i10 != i11) {
            int E0 = E0(this.I, i10);
            if (E0 == 126665345) {
                return E0;
            }
            return Integer.rotateLeft(l0(this.I.N(i10), i11, i12), 3) ^ E0;
        }
        return i12;
    }

    private final void l1(int i10) {
        this.U = i10 - (this.I.l() - this.U);
    }

    private final void m0() {
        j0.n.T(this.K.U());
        k2 k2Var = new k2();
        this.J = k2Var;
        n2 t10 = k2Var.t();
        t10.G();
        this.K = t10;
    }

    private final void m1(int i10, int i11) {
        boolean z10;
        if (i11 > 0) {
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.Z == i10) {
                    this.f18705c0 += i11;
                    return;
                }
                T0();
                this.Z = i10;
                this.f18705c0 = i11;
                return;
            }
            j0.n.w(("Invalid remove index " + i10).toString());
            throw new KotlinNothingValueException();
        }
    }

    private final p1 n0() {
        p1 p1Var = this.M;
        if (p1Var != null) {
            return p1Var;
        }
        return o0(this.I.t());
    }

    private final void n1() {
        j2 j2Var;
        int t10;
        pc.q qVar;
        if (this.I.v() > 0 && this.X.g(-2) != (t10 = (j2Var = this.I).t())) {
            if (!this.V && this.W) {
                qVar = j0.n.f18807d;
                q1(this, false, qVar, 1, null);
                this.V = true;
            }
            if (t10 > 0) {
                j0.d a10 = j2Var.a(t10);
                this.X.i(t10);
                q1(this, false, new b0(a10), 1, null);
            }
        }
    }

    private final p1 o0(int i10) {
        if (n() && this.L) {
            int W = this.K.W();
            while (W > 0) {
                if (this.K.b0(W) == 202 && qc.q.d(this.K.c0(W), j0.n.C())) {
                    Object Z = this.K.Z(W);
                    qc.q.g(Z, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    p1 p1Var = (p1) Z;
                    this.M = p1Var;
                    return p1Var;
                }
                W = this.K.z0(W);
            }
        }
        if (this.I.v() > 0) {
            while (i10 > 0) {
                if (this.I.A(i10) == 202 && qc.q.d(this.I.B(i10), j0.n.C())) {
                    p1 b10 = this.f18725w.b(i10);
                    if (b10 == null) {
                        Object x10 = this.I.x(i10);
                        qc.q.g(x10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        b10 = (p1) x10;
                    }
                    this.M = b10;
                    return b10;
                }
                i10 = this.I.N(i10);
            }
        }
        p1 p1Var2 = this.f18724v;
        this.M = p1Var2;
        return p1Var2;
    }

    private final void o1(pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        V0(this, false, 1, null);
        n1();
        b1(qVar);
    }

    private final void p1(boolean z10, pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar) {
        U0(z10);
        b1(qVar);
    }

    private final void q0(k0.b<y1, k0.c<Object>> bVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        if ((!this.G) != false) {
            Object a10 = k3.f18687a.a("Compose:recompose");
            try {
                this.C = t0.l.F().f();
                this.f18725w.a();
                int h10 = bVar.h();
                for (int i10 = 0; i10 < h10; i10++) {
                    Object obj = bVar.g()[i10];
                    qc.q.g(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    k0.c cVar = (k0.c) bVar.i()[i10];
                    y1 y1Var = (y1) obj;
                    j0.d j10 = y1Var.j();
                    if (j10 != null) {
                        this.f18722t.add(new o0(y1Var, j10.a(), cVar));
                    } else {
                        return;
                    }
                }
                List<o0> list = this.f18722t;
                if (list.size() > 1) {
                    ec.x.v(list, new i());
                }
                this.f18713k = 0;
                this.G = true;
                try {
                    F1();
                    Object N0 = N0();
                    if (N0 != pVar && pVar != null) {
                        O1(pVar);
                    }
                    h hVar = this.E;
                    k0.f<j0.c0> b10 = y2.b();
                    try {
                        b10.d(hVar);
                        if (pVar != null) {
                            D1(m.e.DEFAULT_DRAG_ANIMATION_DURATION, j0.n.D());
                            j0.c.b(this, pVar);
                            t0();
                        } else if ((this.f18720r || this.f18726x) && N0 != null && !qc.q.d(N0, j0.l.f18688a.a())) {
                            D1(m.e.DEFAULT_DRAG_ANIMATION_DURATION, j0.n.D());
                            j0.c.b(this, (pc.p) qc.k0.e(N0, 2));
                            t0();
                        } else {
                            y1();
                        }
                        b10.x(b10.o() - 1);
                        u0();
                        this.G = false;
                        this.f18722t.clear();
                        dc.w wVar = dc.w.f13270a;
                        return;
                    } catch (Throwable th) {
                        b10.x(b10.o() - 1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.G = false;
                    this.f18722t.clear();
                    R();
                    throw th2;
                }
            } finally {
                k3.f18687a.b(a10);
            }
        }
        j0.n.w("Reentrant composition is not supported".toString());
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ void q1(m mVar, boolean z10, pc.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.p1(z10, qVar);
    }

    private final void r0(int i10, int i11) {
        if (i10 > 0 && i10 != i11) {
            r0(this.I.N(i10), i11);
            if (this.I.H(i10)) {
                e1(O0(this.I, i10));
            }
        }
    }

    private final void r1() {
        if (this.T.d()) {
            this.T.g();
        } else {
            this.S++;
        }
    }

    private final void s0(boolean z10) {
        List<r0> list;
        if (n()) {
            int W = this.K.W();
            J1(this.K.b0(W), this.K.c0(W), this.K.Z(W));
        } else {
            int t10 = this.I.t();
            J1(this.I.A(t10), this.I.B(t10), this.I.x(t10));
        }
        int i10 = this.f18715m;
        o1 o1Var = this.f18712j;
        int i11 = 0;
        if (o1Var != null && o1Var.b().size() > 0) {
            List<r0> b10 = o1Var.b();
            List<r0> f10 = o1Var.f();
            Set e10 = t0.a.e(f10);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = f10.size();
            int size2 = b10.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < size2) {
                r0 r0Var = b10.get(i12);
                if (!e10.contains(r0Var)) {
                    m1(o1Var.g(r0Var) + o1Var.e(), r0Var.c());
                    o1Var.n(r0Var.b(), i11);
                    l1(r0Var.b());
                    this.I.O(r0Var.b());
                    d1();
                    this.I.Q();
                    j0.n.S(this.f18722t, r0Var.b(), r0Var.b() + this.I.C(r0Var.b()));
                } else if (!linkedHashSet.contains(r0Var)) {
                    if (i13 < size) {
                        r0 r0Var2 = f10.get(i13);
                        if (r0Var2 != r0Var) {
                            int g10 = o1Var.g(r0Var2);
                            linkedHashSet.add(r0Var2);
                            if (g10 != i14) {
                                int o10 = o1Var.o(r0Var2);
                                list = f10;
                                k1(o1Var.e() + g10, i14 + o1Var.e(), o10);
                                o1Var.j(g10, i14, o10);
                            } else {
                                list = f10;
                            }
                        } else {
                            list = f10;
                            i12++;
                        }
                        i13++;
                        i14 += o1Var.o(r0Var2);
                        f10 = list;
                    }
                    i11 = 0;
                }
                i12++;
                i11 = 0;
            }
            T0();
            if (b10.size() > 0) {
                l1(this.I.n());
                this.I.R();
            }
        }
        int i15 = this.f18713k;
        while (!this.I.F()) {
            int l10 = this.I.l();
            d1();
            m1(i15, this.I.Q());
            j0.n.S(this.f18722t, l10, this.I.l());
        }
        boolean n10 = n();
        if (n10) {
            if (z10) {
                t1();
                i10 = 1;
            }
            this.I.f();
            int W2 = this.K.W();
            this.K.O();
            if (!this.I.s()) {
                int K0 = K0(W2);
                this.K.P();
                this.K.G();
                i1(this.O);
                this.Q = false;
                if (!this.f18706d.isEmpty()) {
                    L1(K0, 0);
                    M1(K0, i10);
                }
            }
        } else {
            if (z10) {
                r1();
            }
            f1();
            int t11 = this.I.t();
            if (i10 != P1(t11)) {
                M1(t11, i10);
            }
            if (z10) {
                i10 = 1;
            }
            this.I.g();
            T0();
        }
        x0(i10, n10);
    }

    private final void s1(int i10, int i11, int i12) {
        int M;
        j2 j2Var = this.I;
        M = j0.n.M(j2Var, i10, i11, i12);
        while (i10 > 0 && i10 != M) {
            if (j2Var.H(i10)) {
                r1();
            }
            i10 = j2Var.N(i10);
        }
        r0(i11, M);
    }

    private final void t0() {
        s0(false);
    }

    private final void t1() {
        this.P.add(this.Y.g());
    }

    private final void u0() {
        t0();
        this.f18704c.c();
        t0();
        g1();
        y0();
        this.I.d();
        this.f18720r = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u1(c1 c1Var, n2 n2Var) {
        k2 k2Var = new k2();
        n2 t10 = k2Var.t();
        try {
            t10.D();
            t10.V0(126665345, c1Var.c());
            n2.n0(t10, 0, 1, null);
            t10.Y0(c1Var.f());
            List<j0.d> u02 = n2Var.u0(c1Var.a(), 1, t10);
            t10.O0();
            t10.O();
            t10.P();
            t10.G();
            b1 b1Var = new b1(k2Var);
            y1.a aVar = y1.f18925h;
            if (aVar.b(k2Var, u02)) {
                try {
                    aVar.a(k2Var.t(), u02, new c0(A0(), c1Var));
                    dc.w wVar = dc.w.f13270a;
                } finally {
                }
            }
            this.f18704c.j(c1Var, b1Var);
        } finally {
        }
    }

    private final void v0() {
        if (this.K.U()) {
            n2 t10 = this.J.t();
            this.K = t10;
            t10.P0();
            this.L = false;
            this.M = null;
        }
    }

    private final void v1() {
        pc.q<? super j0.f<?>, ? super n2, ? super e2, dc.w> qVar;
        if (this.f18706d.i()) {
            ArrayList arrayList = new ArrayList();
            this.N = arrayList;
            j2 s10 = this.f18706d.s();
            try {
                this.I = s10;
                List list = this.f18708f;
                try {
                    this.f18708f = arrayList;
                    w1(0);
                    W0();
                    if (this.V) {
                        qVar = j0.n.f18805b;
                        b1(qVar);
                        g1();
                    }
                    dc.w wVar = dc.w.f13270a;
                } finally {
                    this.f18708f = list;
                }
            } finally {
                s10.d();
            }
        }
    }

    private final void w0(boolean z10, o1 o1Var) {
        this.f18711i.h(this.f18712j);
        this.f18712j = o1Var;
        this.f18714l.i(this.f18713k);
        if (z10) {
            this.f18713k = 0;
        }
        this.f18716n.i(this.f18715m);
        this.f18715m = 0;
    }

    private final void w1(int i10) {
        x1(this, i10, false, 0);
        T0();
    }

    private final void x0(int i10, boolean z10) {
        o1 g10 = this.f18711i.g();
        if (g10 != null && !z10) {
            g10.l(g10.a() + 1);
        }
        this.f18712j = g10;
        this.f18713k = this.f18714l.h() + i10;
        this.f18715m = this.f18716n.h() + i10;
    }

    private static final int x1(m mVar, int i10, boolean z10, int i11) {
        boolean z11;
        int i12;
        a aVar;
        List y10;
        int i13 = 1;
        if (mVar.I.D(i10)) {
            int A = mVar.I.A(i10);
            Object B = mVar.I.B(i10);
            if (A == 126665345 && (B instanceof a1)) {
                a1 a1Var = (a1) B;
                Object z12 = mVar.I.z(i10, 0);
                j0.d a10 = mVar.I.a(i10);
                y10 = j0.n.y(mVar.f18722t, i10, mVar.I.C(i10) + i10);
                ArrayList arrayList = new ArrayList(y10.size());
                int size = y10.size();
                for (int i14 = 0; i14 < size; i14++) {
                    o0 o0Var = (o0) y10.get(i14);
                    arrayList.add(dc.r.a(o0Var.c(), o0Var.a()));
                }
                c1 c1Var = new c1(a1Var, z12, mVar.A0(), mVar.f18706d, a10, arrayList, mVar.o0(i10));
                mVar.f18704c.b(c1Var);
                mVar.n1();
                mVar.b1(new d0(c1Var));
                if (z10) {
                    mVar.T0();
                    mVar.W0();
                    mVar.R0();
                    if (!mVar.I.H(i10)) {
                        i13 = mVar.I.L(i10);
                    }
                    if (i13 <= 0) {
                        return 0;
                    }
                    mVar.m1(i11, i13);
                    return 0;
                }
                return mVar.I.L(i10);
            } else if (A == 206 && qc.q.d(B, j0.n.I())) {
                Object z13 = mVar.I.z(i10, 0);
                if (z13 instanceof a) {
                    aVar = (a) z13;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    for (m mVar2 : aVar.a().s()) {
                        mVar2.v1();
                        mVar.f18704c.n(mVar2.A0());
                    }
                }
                return mVar.I.L(i10);
            } else {
                return mVar.I.L(i10);
            }
        } else if (mVar.I.e(i10)) {
            int C = mVar.I.C(i10) + i10;
            int i15 = i10 + 1;
            int i16 = 0;
            while (i15 < C) {
                boolean H = mVar.I.H(i15);
                if (H) {
                    mVar.T0();
                    mVar.e1(mVar.I.J(i15));
                }
                if (!H && !z10) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (H) {
                    i12 = 0;
                } else {
                    i12 = i11 + i16;
                }
                i16 += x1(mVar, i15, z11, i12);
                if (H) {
                    mVar.T0();
                    mVar.r1();
                }
                i15 += mVar.I.C(i15);
            }
            return i16;
        } else {
            return mVar.I.L(i10);
        }
    }

    private final void y0() {
        W0();
        if (this.f18711i.c()) {
            if (this.X.d()) {
                i0();
                return;
            } else {
                j0.n.w("Missed recording an endGroup()".toString());
                throw new KotlinNothingValueException();
            }
        }
        j0.n.w("Start/end imbalance".toString());
        throw new KotlinNothingValueException();
    }

    private final void z1() {
        this.f18715m += this.I.Q();
    }

    @Override // j0.l
    public void A(x1 x1Var) {
        y1 y1Var;
        qc.q.i(x1Var, "scope");
        if (x1Var instanceof y1) {
            y1Var = (y1) x1Var;
        } else {
            y1Var = null;
        }
        if (y1Var != null) {
            y1Var.F(true);
        }
    }

    public j0.y A0() {
        return this.f18710h;
    }

    @Override // j0.l
    public <T> void B(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "factory");
        Q1();
        if (n()) {
            int e10 = this.f18714l.e();
            n2 n2Var = this.K;
            j0.d A = n2Var.A(n2Var.W());
            this.f18715m++;
            h1(new d(aVar, A, e10));
            j1(new e(A, e10));
            return;
        }
        j0.n.w("createNode() can only be called when inserting".toString());
        throw new KotlinNothingValueException();
    }

    public final y1 B0() {
        f3<y1> f3Var = this.F;
        if (this.B == 0 && f3Var.d()) {
            return f3Var.e();
        }
        return null;
    }

    @Override // j0.l
    public <T> T C(j0.t<T> tVar) {
        qc.q.i(tVar, "key");
        return (T) j0.w.d(n0(), tVar);
    }

    public final List<pc.q<j0.f<?>, n2, e2, dc.w>> C0() {
        return this.N;
    }

    @Override // j0.l
    public hc.f D() {
        return this.f18704c.g();
    }

    @Override // j0.l
    public void E() {
        boolean s10;
        t0();
        t0();
        s10 = j0.n.s(this.f18727y.h());
        this.f18726x = s10;
        this.M = null;
    }

    @Override // j0.l
    public j0.v F() {
        return n0();
    }

    @Override // j0.l
    public boolean G() {
        boolean z10;
        if (this.f18726x) {
            return true;
        }
        y1 B0 = B0();
        if (B0 != null && B0.m()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public final boolean G1(y1 y1Var, Object obj) {
        qc.q.i(y1Var, "scope");
        j0.d j10 = y1Var.j();
        if (j10 == null) {
            return false;
        }
        int d10 = j10.d(this.I.w());
        if (this.G && d10 >= this.I.l()) {
            j0.n.J(this.f18722t, d10, y1Var, obj);
            return true;
        }
        return false;
    }

    @Override // j0.l
    public void H() {
        Q1();
        if ((!n()) != false) {
            Object D0 = D0(this.I);
            e1(D0);
            if (this.f18728z && (D0 instanceof j0.k)) {
                c1(j0.f18766f);
                return;
            }
            return;
        }
        j0.n.w("useNode() called while inserting".toString());
        throw new KotlinNothingValueException();
    }

    @Override // j0.l
    public <V, T> void I(V v10, pc.p<? super T, ? super V, dc.w> pVar) {
        qc.q.i(pVar, "block");
        c cVar = new c(pVar, v10);
        if (n()) {
            h1(cVar);
        } else {
            c1(cVar);
        }
    }

    @Override // j0.l
    public void J(Object obj) {
        O1(obj);
    }

    public void J0(List<dc.l<c1, c1>> list) {
        qc.q.i(list, "references");
        try {
            F0(list);
            i0();
        } catch (Throwable th) {
            R();
            throw th;
        }
    }

    @Override // j0.l
    public int K() {
        return this.R;
    }

    @Override // j0.l
    public j0.p L() {
        D1(206, j0.n.I());
        a aVar = null;
        if (n()) {
            n2.n0(this.K, 0, 1, null);
        }
        Object N0 = N0();
        if (N0 instanceof a) {
            aVar = (a) N0;
        }
        if (aVar == null) {
            aVar = new a(new b(K(), this.f18719q));
            O1(aVar);
        }
        aVar.a().v(n0());
        t0();
        return aVar.a();
    }

    @Override // j0.l
    public void M() {
        t0();
    }

    public final boolean M0() {
        return this.G;
    }

    @Override // j0.l
    public void N() {
        t0();
    }

    public final Object N0() {
        if (n()) {
            R1();
            return j0.l.f18688a.a();
        }
        Object I = this.I.I();
        if (this.f18728z) {
            return j0.l.f18688a.a();
        }
        return I;
    }

    @Override // j0.l
    public void O() {
        s0(true);
    }

    public final void O1(Object obj) {
        if (n()) {
            this.K.Y0(obj);
            if (obj instanceof f2) {
                b1(new h0(obj));
                this.f18707e.add(obj);
                return;
            }
            return;
        }
        int r10 = this.I.r() - 1;
        if (obj instanceof f2) {
            this.f18707e.add(obj);
        }
        p1(true, new i0(obj, r10));
    }

    @Override // j0.l
    public void P() {
        t0();
        y1 B0 = B0();
        if (B0 != null && B0.q()) {
            B0.A(true);
        }
    }

    @Override // j0.l
    public boolean Q(Object obj) {
        if (!qc.q.d(N0(), obj)) {
            O1(obj);
            return true;
        }
        return false;
    }

    public final void Q0(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "block");
        if ((!this.G) != false) {
            this.G = true;
            try {
                aVar.invoke();
                return;
            } finally {
                this.G = false;
            }
        }
        j0.n.w("Preparing a composition while composing is not supported".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean X0(k0.b<y1, k0.c<Object>> bVar) {
        qc.q.i(bVar, "invalidationsRequested");
        if (this.f18708f.isEmpty()) {
            if (!bVar.j() && (!this.f18722t.isEmpty()) == false && !this.f18720r) {
                return false;
            }
            q0(bVar, null);
            return !this.f18708f.isEmpty();
        }
        j0.n.w("Expected applyChanges() to have been called".toString());
        throw new KotlinNothingValueException();
    }

    @Override // j0.l
    public void a() {
        this.f18719q = true;
    }

    @Override // j0.l
    public x1 b() {
        return B0();
    }

    @Override // j0.l
    public boolean c(boolean z10) {
        Object N0 = N0();
        if ((N0 instanceof Boolean) && z10 == ((Boolean) N0).booleanValue()) {
            return false;
        }
        O1(Boolean.valueOf(z10));
        return true;
    }

    @Override // j0.l
    public void d() {
        if (this.f18728z && this.I.t() == this.A) {
            this.A = -1;
            this.f18728z = false;
        }
        s0(false);
    }

    @Override // j0.l
    public void e(int i10) {
        B1(i10, null, l0.f18691a.a(), null);
    }

    @Override // j0.l
    public Object f() {
        return N0();
    }

    @Override // j0.l
    public boolean g(float f10) {
        boolean z10;
        Object N0 = N0();
        if (N0 instanceof Float) {
            if (f10 == ((Number) N0).floatValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
        }
        O1(Float.valueOf(f10));
        return true;
    }

    @Override // j0.l
    public void h(pc.a<dc.w> aVar) {
        qc.q.i(aVar, "effect");
        b1(new a0(aVar));
    }

    public final void h0() {
        m0();
        this.f18725w.a();
    }

    @Override // j0.l
    public boolean i(int i10) {
        Object N0 = N0();
        if ((N0 instanceof Integer) && i10 == ((Number) N0).intValue()) {
            return false;
        }
        O1(Integer.valueOf(i10));
        return true;
    }

    @Override // j0.l
    public boolean j(long j10) {
        Object N0 = N0();
        if ((N0 instanceof Long) && j10 == ((Number) N0).longValue()) {
            return false;
        }
        O1(Long.valueOf(j10));
        return true;
    }

    @Override // j0.l
    public u0.a k() {
        return this.f18706d;
    }

    public final void k0(k0.b<y1, k0.c<Object>> bVar, pc.p<? super j0.l, ? super Integer, dc.w> pVar) {
        qc.q.i(bVar, "invalidationsRequested");
        qc.q.i(pVar, "content");
        if (this.f18708f.isEmpty()) {
            q0(bVar, pVar);
        } else {
            j0.n.w("Expected applyChanges() to have been called".toString());
            throw new KotlinNothingValueException();
        }
    }

    @Override // j0.l
    public boolean l(Object obj) {
        if (N0() != obj) {
            O1(obj);
            return true;
        }
        return false;
    }

    @Override // j0.l
    public boolean m(double d10) {
        boolean z10;
        Object N0 = N0();
        if (N0 instanceof Double) {
            if (d10 == ((Number) N0).doubleValue()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
        }
        O1(Double.valueOf(d10));
        return true;
    }

    @Override // j0.l
    public boolean n() {
        return this.Q;
    }

    @Override // j0.l
    public void o(boolean z10) {
        boolean z11;
        if (this.f18715m == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (!n()) {
                if (!z10) {
                    A1();
                    return;
                }
                int l10 = this.I.l();
                int k10 = this.I.k();
                for (int i10 = l10; i10 < k10; i10++) {
                    if (this.I.H(i10)) {
                        Object J = this.I.J(i10);
                        if (J instanceof j0.k) {
                            b1(new f(J));
                        }
                    }
                    this.I.i(i10, new g(i10));
                }
                j0.n.S(this.f18722t, l10, k10);
                this.I.O(l10);
                this.I.R();
                return;
            }
            return;
        }
        j0.n.w("No nodes can be emitted before calling dactivateToEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    @Override // j0.l
    public void p() {
        B1(-127, null, l0.f18691a.a(), null);
    }

    public final void p0() {
        k3 k3Var = k3.f18687a;
        Object a10 = k3Var.a("Compose:Composer.dispose");
        try {
            this.f18704c.p(this);
            this.F.a();
            this.f18722t.clear();
            this.f18708f.clear();
            this.f18725w.a();
            u().clear();
            this.H = true;
            dc.w wVar = dc.w.f13270a;
            k3Var.b(a10);
        } catch (Throwable th) {
            k3.f18687a.b(a10);
            throw th;
        }
    }

    @Override // j0.l
    public j0.l q(int i10) {
        B1(i10, null, l0.f18691a.a(), null);
        g0();
        return this;
    }

    @Override // j0.l
    public void r(int i10, Object obj) {
        B1(i10, obj, l0.f18691a.a(), null);
    }

    @Override // j0.l
    public void s() {
        B1(125, null, l0.f18691a.c(), null);
        this.f18721s = true;
    }

    @Override // j0.l
    public boolean t() {
        boolean z10;
        if (n() || this.f18728z || this.f18726x) {
            return false;
        }
        y1 B0 = B0();
        if (B0 != null && !B0.n()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || this.f18720r) {
            return false;
        }
        return true;
    }

    @Override // j0.l
    public j0.f<?> u() {
        return this.f18702b;
    }

    @Override // j0.l
    public void v(int i10, Object obj) {
        if (this.I.o() == i10 && !qc.q.d(this.I.m(), obj) && this.A < 0) {
            this.A = this.I.l();
            this.f18728z = true;
        }
        B1(i10, null, l0.f18691a.a(), obj);
    }

    @Override // j0.l
    public g2 w() {
        y1 y1Var;
        j0.d a10;
        pc.l<j0.o, dc.w> i10;
        y1 y1Var2 = null;
        if (this.F.d()) {
            y1Var = this.F.g();
        } else {
            y1Var = null;
        }
        if (y1Var != null) {
            y1Var.C(false);
        }
        if (y1Var != null && (i10 = y1Var.i(this.C)) != null) {
            b1(new j(i10, this));
        }
        if (y1Var != null && !y1Var.p() && (y1Var.q() || this.f18719q)) {
            if (y1Var.j() == null) {
                if (n()) {
                    n2 n2Var = this.K;
                    a10 = n2Var.A(n2Var.W());
                } else {
                    j2 j2Var = this.I;
                    a10 = j2Var.a(j2Var.t());
                }
                y1Var.z(a10);
            }
            y1Var.B(false);
            y1Var2 = y1Var;
        }
        s0(false);
        return y1Var2;
    }

    @Override // j0.l
    public void x() {
        B1(125, null, l0.f18691a.b(), null);
        this.f18721s = true;
    }

    @Override // j0.l
    public void y(w1<?>[] w1VarArr) {
        p1 N1;
        int t10;
        qc.q.i(w1VarArr, "values");
        p1 n02 = n0();
        D1(201, j0.n.F());
        D1(203, j0.n.H());
        p1 p1Var = (p1) j0.c.c(this, new f0(w1VarArr, n02));
        t0();
        boolean z10 = false;
        if (n()) {
            N1 = N1(n02, p1Var);
            this.L = true;
        } else {
            Object y10 = this.I.y(0);
            qc.q.g(y10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            p1 p1Var2 = (p1) y10;
            Object y11 = this.I.y(1);
            qc.q.g(y11, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            p1 p1Var3 = (p1) y11;
            if (t() && qc.q.d(p1Var3, p1Var)) {
                z1();
                N1 = p1Var2;
            } else {
                N1 = N1(n02, p1Var);
                z10 = !qc.q.d(N1, p1Var2);
            }
        }
        if (z10 && !n()) {
            this.f18725w.c(this.I.l(), N1);
        }
        m0 m0Var = this.f18727y;
        t10 = j0.n.t(this.f18726x);
        m0Var.i(t10);
        this.f18726x = z10;
        this.M = N1;
        B1(202, j0.n.C(), l0.f18691a.a(), N1);
    }

    public void y1() {
        if (this.f18722t.isEmpty()) {
            z1();
            return;
        }
        j2 j2Var = this.I;
        int o10 = j2Var.o();
        Object p10 = j2Var.p();
        Object m10 = j2Var.m();
        H1(o10, p10, m10);
        E1(j2Var.G(), null);
        a1();
        j2Var.g();
        J1(o10, p10, m10);
    }

    @Override // j0.l
    public void z() {
        boolean z10;
        if (this.f18715m == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            y1 B0 = B0();
            if (B0 != null) {
                B0.y();
            }
            if (this.f18722t.isEmpty()) {
                A1();
                return;
            } else {
                a1();
                return;
            }
        }
        j0.n.w("No nodes can be emitted before calling skipAndEndGroup".toString());
        throw new KotlinNothingValueException();
    }

    public final boolean z0() {
        if (this.B > 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Composer.kt */
    /* loaded from: classes.dex */
    public static final class a implements f2 {

        /* renamed from: f  reason: collision with root package name */
        private final b f18729f;

        public a(b bVar) {
            qc.q.i(bVar, "ref");
            this.f18729f = bVar;
        }

        public final b a() {
            return this.f18729f;
        }

        @Override // j0.f2
        public void b() {
            this.f18729f.r();
        }

        @Override // j0.f2
        public void c() {
            this.f18729f.r();
        }

        @Override // j0.f2
        public void d() {
        }
    }
}
