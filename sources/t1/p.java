package t1;

import androidx.compose.ui.e;
import ec.b0;
import java.util.ArrayList;
import java.util.List;
import p1.j0;
import p1.r1;
import p1.s1;
import p1.t1;
import p1.x0;
import p1.z0;

/* compiled from: SemanticsNode.kt */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final e.c f23465a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23466b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f23467c;

    /* renamed from: d  reason: collision with root package name */
    private final l f23468d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23469e;

    /* renamed from: f  reason: collision with root package name */
    private p f23470f;

    /* renamed from: g  reason: collision with root package name */
    private final int f23471g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f23472f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i iVar) {
            super(1);
            this.f23472f = iVar;
        }

        public final void a(x xVar) {
            qc.q.i(xVar, "$this$fakeSemanticsNode");
            v.R(xVar, this.f23472f.n());
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class b extends qc.r implements pc.l<x, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f23473f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f23473f = str;
        }

        public final void a(x xVar) {
            qc.q.i(xVar, "$this$fakeSemanticsNode");
            v.J(xVar, this.f23473f);
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(x xVar) {
            a(xVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class c extends e.c implements s1 {
        final /* synthetic */ pc.l<x, dc.w> A;

        /* JADX WARN: Multi-variable type inference failed */
        c(pc.l<? super x, dc.w> lVar) {
            this.A = lVar;
        }

        @Override // p1.s1
        public void Z0(x xVar) {
            qc.q.i(xVar, "<this>");
            this.A.invoke(xVar);
        }

        @Override // p1.s1
        public /* synthetic */ boolean b0() {
            return r1.a(this);
        }

        @Override // p1.s1
        public /* synthetic */ boolean b1() {
            return r1.b(this);
        }
    }

    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    static final class d extends qc.r implements pc.l<j0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final d f23474f = new d();

        d() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j0 j0Var) {
            qc.q.i(j0Var, "it");
            l G = j0Var.G();
            boolean z10 = false;
            if (G != null && G.m()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class e extends qc.r implements pc.l<j0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final e f23475f = new e();

        e() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j0 j0Var) {
            qc.q.i(j0Var, "it");
            l G = j0Var.G();
            boolean z10 = false;
            if (G != null && G.m()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsNode.kt */
    /* loaded from: classes.dex */
    public static final class f extends qc.r implements pc.l<j0, Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final f f23476f = new f();

        f() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(j0 j0Var) {
            qc.q.i(j0Var, "it");
            return Boolean.valueOf(j0Var.i0().q(z0.a(8)));
        }
    }

    public p(e.c cVar, boolean z10, j0 j0Var, l lVar) {
        qc.q.i(cVar, "outerSemanticsNode");
        qc.q.i(j0Var, "layoutNode");
        qc.q.i(lVar, "unmergedConfig");
        this.f23465a = cVar;
        this.f23466b = z10;
        this.f23467c = j0Var;
        this.f23468d = lVar;
        this.f23471g = j0Var.n0();
    }

    public static /* synthetic */ List B(p pVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return pVar.A(z10);
    }

    private final void b(List<p> list) {
        i h10;
        String str;
        Object c02;
        h10 = q.h(this);
        if (h10 != null && this.f23468d.m() && (!list.isEmpty()) != false) {
            list.add(c(h10, new a(h10)));
        }
        l lVar = this.f23468d;
        s sVar = s.f23478a;
        if (lVar.f(sVar.c()) && (!list.isEmpty()) != false && this.f23468d.m()) {
            List list2 = (List) m.a(this.f23468d, sVar.c());
            if (list2 != null) {
                c02 = b0.c0(list2);
                str = (String) c02;
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, c(null, new b(str)));
            }
        }
    }

    private final p c(i iVar, pc.l<? super x, dc.w> lVar) {
        l lVar2 = new l();
        lVar2.p(false);
        lVar2.o(false);
        lVar.invoke(lVar2);
        p pVar = new p(new c(lVar), false, new j0(true, iVar != null ? q.i(this) : q.e(this)), lVar2);
        pVar.f23469e = true;
        pVar.f23470f = this;
        return pVar;
    }

    private final void d(j0 j0Var, List<p> list) {
        k0.f<j0> s02 = j0Var.s0();
        int o10 = s02.o();
        if (o10 > 0) {
            j0[] n10 = s02.n();
            int i10 = 0;
            do {
                j0 j0Var2 = n10[i10];
                if (j0Var2.H0()) {
                    if (j0Var2.i0().q(z0.a(8))) {
                        list.add(q.a(j0Var2, this.f23466b));
                    } else {
                        d(j0Var2, list);
                    }
                }
                i10++;
            } while (i10 < o10);
        }
    }

    private final List<p> f(List<p> list) {
        List B = B(this, false, 1, null);
        int size = B.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) B.get(i10);
            if (pVar.w()) {
                list.add(pVar);
            } else if (!pVar.f23468d.l()) {
                pVar.f(list);
            }
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(p pVar, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        return pVar.f(list);
    }

    private final List<p> k(boolean z10, boolean z11) {
        List<p> i10;
        if (!z10 && this.f23468d.l()) {
            i10 = ec.t.i();
            return i10;
        } else if (w()) {
            return g(this, null, 1, null);
        } else {
            return A(z11);
        }
    }

    private final boolean w() {
        if (this.f23466b && this.f23468d.m()) {
            return true;
        }
        return false;
    }

    private final void z(l lVar) {
        if (!this.f23468d.l()) {
            List B = B(this, false, 1, null);
            int size = B.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar = (p) B.get(i10);
                if (!pVar.w()) {
                    lVar.n(pVar.f23468d);
                    pVar.z(lVar);
                }
            }
        }
    }

    public final List<p> A(boolean z10) {
        List<p> i10;
        if (this.f23469e) {
            i10 = ec.t.i();
            return i10;
        }
        ArrayList arrayList = new ArrayList();
        d(this.f23467c, arrayList);
        if (z10) {
            b(arrayList);
        }
        return arrayList;
    }

    public final p a() {
        return new p(this.f23465a, true, this.f23467c, this.f23468d);
    }

    public final x0 e() {
        if (this.f23469e) {
            p p10 = p();
            if (p10 != null) {
                return p10.e();
            }
            return null;
        }
        p1.j g10 = q.g(this.f23467c);
        if (g10 == null) {
            g10 = this.f23465a;
        }
        return p1.k.h(g10, z0.a(8));
    }

    public final z0.h h() {
        z0.h b10;
        x0 e10 = e();
        if (e10 != null) {
            if (!e10.r()) {
                e10 = null;
            }
            if (e10 != null && (b10 = n1.t.b(e10)) != null) {
                return b10;
            }
        }
        return z0.h.f26359e.a();
    }

    public final z0.h i() {
        z0.h c10;
        x0 e10 = e();
        if (e10 != null) {
            if (!e10.r()) {
                e10 = null;
            }
            if (e10 != null && (c10 = n1.t.c(e10)) != null) {
                return c10;
            }
        }
        return z0.h.f26359e.a();
    }

    public final List<p> j() {
        return k(!this.f23466b, false);
    }

    public final l l() {
        if (w()) {
            l h10 = this.f23468d.h();
            z(h10);
            return h10;
        }
        return this.f23468d;
    }

    public final int m() {
        return this.f23471g;
    }

    public final n1.w n() {
        return this.f23467c;
    }

    public final j0 o() {
        return this.f23467c;
    }

    public final p p() {
        j0 j0Var;
        p pVar = this.f23470f;
        if (pVar != null) {
            return pVar;
        }
        if (this.f23466b) {
            j0Var = q.f(this.f23467c, e.f23475f);
        } else {
            j0Var = null;
        }
        if (j0Var == null) {
            j0Var = q.f(this.f23467c, f.f23476f);
        }
        if (j0Var == null) {
            return null;
        }
        return q.a(j0Var, this.f23466b);
    }

    public final long q() {
        x0 e10 = e();
        if (e10 != null) {
            if (!e10.r()) {
                e10 = null;
            }
            if (e10 != null) {
                return n1.t.e(e10);
            }
        }
        return z0.f.f26354b.c();
    }

    public final List<p> r() {
        return k(false, true);
    }

    public final long s() {
        x0 e10 = e();
        if (e10 != null) {
            return e10.a();
        }
        return j2.p.f19001b.a();
    }

    public final z0.h t() {
        p1.j jVar;
        if (this.f23468d.m()) {
            jVar = q.g(this.f23467c);
            if (jVar == null) {
                jVar = this.f23465a;
            }
        } else {
            jVar = this.f23465a;
        }
        return t1.c(jVar.getNode(), t1.a(this.f23468d));
    }

    public final l u() {
        return this.f23468d;
    }

    public final boolean v() {
        return this.f23469e;
    }

    public final boolean x() {
        x0 e10 = e();
        if (e10 != null) {
            return e10.h2();
        }
        return false;
    }

    public final boolean y() {
        if (!this.f23469e && r().isEmpty() && q.f(this.f23467c, d.f23474f) == null) {
            return true;
        }
        return false;
    }
}
