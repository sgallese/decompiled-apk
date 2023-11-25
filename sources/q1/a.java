package q1;

import androidx.core.view.accessibility.n0;
import ec.b0;
import ec.t;
import java.util.ArrayList;
import java.util.List;
import qc.q;
import qc.r;
import t1.c;
import t1.l;
import t1.m;
import t1.p;
import t1.s;
import z0.f;
import z0.g;

/* compiled from: CollectionInfo.kt */
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    /* renamed from: q1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0478a extends r implements pc.a<Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0478a f21339f = new C0478a();

        C0478a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CollectionInfo.kt */
    /* loaded from: classes.dex */
    public static final class b extends r implements pc.a<Boolean> {

        /* renamed from: f  reason: collision with root package name */
        public static final b f21340f = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List i10;
        Object a02;
        int k10;
        long x10;
        Object a03;
        int k11;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            i10 = t.i();
        } else {
            i10 = new ArrayList();
            p pVar = list.get(0);
            k11 = t.k(list);
            int i11 = 0;
            while (i11 < k11) {
                i11++;
                p pVar2 = list.get(i11);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                i10.add(f.d(g.a(Math.abs(f.o(pVar4.h().g()) - f.o(pVar3.h().g())), Math.abs(f.p(pVar4.h().g()) - f.p(pVar3.h().g())))));
                pVar = pVar2;
            }
        }
        if (i10.size() == 1) {
            a03 = b0.a0(i10);
            x10 = ((f) a03).x();
        } else if (!i10.isEmpty()) {
            a02 = b0.a0(i10);
            k10 = t.k(i10);
            if (1 <= k10) {
                int i12 = 1;
                while (true) {
                    a02 = f.d(f.t(((f) a02).x(), ((f) i10.get(i12)).x()));
                    if (i12 == k10) {
                        break;
                    }
                    i12++;
                }
            }
            x10 = ((f) a02).x();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (f.f(x10) < f.e(x10)) {
            return true;
        }
        return false;
    }

    public static final boolean b(p pVar) {
        q.i(pVar, "<this>");
        l l10 = pVar.l();
        s sVar = s.f23478a;
        if (m.a(l10, sVar.a()) == null && m.a(pVar.l(), sVar.t()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean c(t1.b bVar) {
        if (bVar.b() >= 0 && bVar.a() >= 0) {
            return false;
        }
        return true;
    }

    public static final void d(p pVar, n0 n0Var) {
        int size;
        q.i(pVar, "node");
        q.i(n0Var, "info");
        l l10 = pVar.l();
        s sVar = s.f23478a;
        t1.b bVar = (t1.b) m.a(l10, sVar.a());
        if (bVar != null) {
            n0Var.p0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.l(), sVar.t()) != null) {
            List<p> r10 = pVar.r();
            int size2 = r10.size();
            for (int i10 = 0; i10 < size2; i10++) {
                p pVar2 = r10.get(i10);
                if (pVar2.l().f(s.f23478a.u())) {
                    arrayList.add(pVar2);
                }
            }
        }
        int i11 = 1;
        if ((!arrayList.isEmpty()) != false) {
            boolean a10 = a(arrayList);
            if (a10) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (a10) {
                i11 = arrayList.size();
            }
            n0Var.p0(n0.f.a(size, i11, false, 0));
        }
    }

    public static final void e(p pVar, n0 n0Var) {
        int i10;
        int i11;
        q.i(pVar, "node");
        q.i(n0Var, "info");
        l l10 = pVar.l();
        s sVar = s.f23478a;
        c cVar = (c) m.a(l10, sVar.b());
        if (cVar != null) {
            n0Var.q0(g(cVar, pVar));
        }
        p p10 = pVar.p();
        if (p10 != null && m.a(p10.l(), sVar.t()) != null) {
            t1.b bVar = (t1.b) m.a(p10.l(), sVar.a());
            if ((bVar != null && c(bVar)) || !pVar.l().f(sVar.u())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<p> r10 = p10.r();
            int size = r10.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                p pVar2 = r10.get(i13);
                if (pVar2.l().f(s.f23478a.u())) {
                    arrayList.add(pVar2);
                    if (pVar2.o().m0() < pVar.o().m0()) {
                        i12++;
                    }
                }
            }
            if ((!arrayList.isEmpty()) != false) {
                boolean a10 = a(arrayList);
                if (a10) {
                    i10 = 0;
                } else {
                    i10 = i12;
                }
                if (a10) {
                    i11 = i12;
                } else {
                    i11 = 0;
                }
                n0.g a11 = n0.g.a(i10, 1, i11, 1, false, ((Boolean) pVar.l().j(s.f23478a.u(), C0478a.f21339f)).booleanValue());
                if (a11 != null) {
                    n0Var.q0(a11);
                }
            }
        }
    }

    private static final n0.f f(t1.b bVar) {
        return n0.f.a(bVar.b(), bVar.a(), false, 0);
    }

    private static final n0.g g(c cVar, p pVar) {
        return n0.g.a(cVar.c(), cVar.d(), cVar.a(), cVar.b(), false, ((Boolean) pVar.l().j(s.f23478a.u(), b.f21340f)).booleanValue());
    }
}
