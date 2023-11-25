package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import androidx.compose.ui.platform.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import t1.i;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.l<p1.j0, Boolean> {

        /* renamed from: f */
        public static final a f2952f = new a();

        a() {
            super(1);
        }

        @Override // pc.l
        /* renamed from: a */
        public final Boolean invoke(p1.j0 j0Var) {
            boolean z10;
            qc.q.i(j0Var, "it");
            t1.l G = j0Var.G();
            boolean z11 = true;
            if (G != null && G.m()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || !G.f(t1.k.f23437a.v())) {
                z11 = false;
            }
            return Boolean.valueOf(z11);
        }
    }

    public static final boolean A(t1.p pVar) {
        if (pVar.n().getLayoutDirection() == j2.r.Rtl) {
            return true;
        }
        return false;
    }

    public static final boolean B(t1.p pVar) {
        return pVar.u().f(t1.k.f23437a.v());
    }

    public static final Boolean C(t1.p pVar) {
        return (Boolean) t1.m.a(pVar.l(), t1.s.f23478a.n());
    }

    public static final boolean D(t1.p pVar) {
        if (!pVar.x() && !pVar.u().f(t1.s.f23478a.l())) {
            return true;
        }
        return false;
    }

    public static final boolean E(w1<Float> w1Var, w1<Float> w1Var2) {
        if (!w1Var.isEmpty() && !w1Var2.isEmpty() && Math.max(w1Var.a().floatValue(), w1Var2.a().floatValue()) < Math.min(w1Var.b().floatValue(), w1Var2.b().floatValue())) {
            return true;
        }
        return false;
    }

    public static final boolean F(t1.p pVar, x.h hVar) {
        Iterator<Map.Entry<? extends t1.w<?>, ? extends Object>> it = hVar.c().iterator();
        while (it.hasNext()) {
            if (!pVar.l().f(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final w1<Float> G(float f10, float f11) {
        return new v1(f10, f11);
    }

    public static final View H(r0 r0Var, int i10) {
        Object obj;
        boolean z10;
        qc.q.i(r0Var, "<this>");
        Set<Map.Entry<p1.j0, androidx.compose.ui.viewinterop.a>> entrySet = r0Var.getLayoutNodeToHolder().entrySet();
        qc.q.h(entrySet, "layoutNodeToHolder.entries");
        Iterator<T> it = entrySet.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((p1.j0) ((Map.Entry) obj).getKey()).n0() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (androidx.compose.ui.viewinterop.a) entry.getValue();
    }

    public static final String I(int i10) {
        i.a aVar = t1.i.f23425b;
        if (t1.i.k(i10, aVar.a())) {
            return "android.widget.Button";
        }
        if (t1.i.k(i10, aVar.b())) {
            return "android.widget.CheckBox";
        }
        if (t1.i.k(i10, aVar.e())) {
            return "android.widget.RadioButton";
        }
        if (t1.i.k(i10, aVar.d())) {
            return "android.widget.ImageView";
        }
        if (t1.i.k(i10, aVar.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }

    public static final /* synthetic */ boolean a(t1.a aVar, Object obj) {
        return p(aVar, obj);
    }

    public static final /* synthetic */ boolean b(t1.p pVar) {
        return q(pVar);
    }

    public static final /* synthetic */ boolean c(t1.p pVar) {
        return r(pVar);
    }

    public static final /* synthetic */ p1.j0 d(p1.j0 j0Var, pc.l lVar) {
        return t(j0Var, lVar);
    }

    public static final /* synthetic */ float e(t1.p pVar) {
        return w(pVar);
    }

    public static final /* synthetic */ String f(t1.p pVar) {
        return x(pVar);
    }

    public static final /* synthetic */ boolean g(t1.p pVar) {
        return y(pVar);
    }

    public static final /* synthetic */ boolean h(t1.p pVar) {
        return z(pVar);
    }

    public static final /* synthetic */ boolean i(t1.p pVar) {
        return A(pVar);
    }

    public static final /* synthetic */ boolean j(t1.p pVar) {
        return B(pVar);
    }

    public static final /* synthetic */ Boolean k(t1.p pVar) {
        return C(pVar);
    }

    public static final /* synthetic */ boolean l(t1.p pVar) {
        return D(pVar);
    }

    public static final /* synthetic */ boolean m(w1 w1Var, w1 w1Var2) {
        return E(w1Var, w1Var2);
    }

    public static final /* synthetic */ boolean n(t1.p pVar, x.h hVar) {
        return F(pVar, hVar);
    }

    public static final /* synthetic */ String o(int i10) {
        return I(i10);
    }

    public static final boolean p(t1.a<?> aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof t1.a)) {
            return false;
        }
        t1.a aVar2 = (t1.a) obj;
        if (!qc.q.d(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() == null && aVar2.a() != null) {
            return false;
        }
        if (aVar.a() == null || aVar2.a() != null) {
            return true;
        }
        return false;
    }

    public static final boolean q(t1.p pVar) {
        if (t1.m.a(pVar.l(), t1.s.f23478a.d()) == null) {
            return true;
        }
        return false;
    }

    public static final boolean r(t1.p pVar) {
        boolean z10;
        if (B(pVar) && !qc.q.d(t1.m.a(pVar.u(), t1.s.f23478a.g()), Boolean.TRUE)) {
            return true;
        }
        p1.j0 t10 = t(pVar.o(), a.f2952f);
        if (t10 != null) {
            t1.l G = t10.G();
            if (G != null) {
                z10 = qc.q.d(t1.m.a(G, t1.s.f23478a.g()), Boolean.TRUE);
            } else {
                z10 = false;
            }
            if (!z10) {
                return true;
            }
        }
        return false;
    }

    public static final t3 s(List<t3> list, int i10) {
        qc.q.i(list, "<this>");
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).d() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final p1.j0 t(p1.j0 j0Var, pc.l<? super p1.j0, Boolean> lVar) {
        for (p1.j0 l02 = j0Var.l0(); l02 != null; l02 = l02.l0()) {
            if (lVar.invoke(l02).booleanValue()) {
                return l02;
            }
        }
        return null;
    }

    public static final Map<Integer, u3> u(t1.r rVar) {
        int d10;
        int d11;
        int d12;
        int d13;
        qc.q.i(rVar, "<this>");
        t1.p a10 = rVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a10.o().f() && a10.o().H0()) {
            Region region = new Region();
            z0.h h10 = a10.h();
            d10 = sc.c.d(h10.i());
            d11 = sc.c.d(h10.l());
            d12 = sc.c.d(h10.j());
            d13 = sc.c.d(h10.e());
            region.set(new Rect(d10, d11, d12, d13));
            v(region, a10, linkedHashMap, a10);
        }
        return linkedHashMap;
    }

    private static final void v(Region region, t1.p pVar, Map<Integer, u3> map, t1.p pVar2) {
        boolean z10;
        int d10;
        int d11;
        int d12;
        int d13;
        int m10;
        z0.h hVar;
        int d14;
        int d15;
        int d16;
        int d17;
        n1.w n10;
        boolean z11 = false;
        if (pVar2.o().f() && pVar2.o().H0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!region.isEmpty() || pVar2.m() == pVar.m()) {
            if (z10 && !pVar2.v()) {
                return;
            }
            z0.h t10 = pVar2.t();
            d10 = sc.c.d(t10.i());
            d11 = sc.c.d(t10.l());
            d12 = sc.c.d(t10.j());
            d13 = sc.c.d(t10.e());
            Rect rect = new Rect(d10, d11, d12, d13);
            Region region2 = new Region();
            region2.set(rect);
            if (pVar2.m() == pVar.m()) {
                m10 = -1;
            } else {
                m10 = pVar2.m();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(m10);
                Rect bounds = region2.getBounds();
                qc.q.h(bounds, "region.bounds");
                map.put(valueOf, new u3(pVar2, bounds));
                List<t1.p> r10 = pVar2.r();
                for (int size = r10.size() - 1; -1 < size; size--) {
                    v(region, pVar, map, r10.get(size));
                }
                region.op(rect, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (pVar2.v()) {
                t1.p p10 = pVar2.p();
                if (p10 != null && (n10 = p10.n()) != null && n10.f()) {
                    z11 = true;
                }
                if (z11) {
                    hVar = p10.h();
                } else {
                    hVar = new z0.h(0.0f, 0.0f, 10.0f, 10.0f);
                }
                Integer valueOf2 = Integer.valueOf(m10);
                d14 = sc.c.d(hVar.i());
                d15 = sc.c.d(hVar.l());
                d16 = sc.c.d(hVar.j());
                d17 = sc.c.d(hVar.e());
                map.put(valueOf2, new u3(pVar2, new Rect(d14, d15, d16, d17)));
            } else if (m10 == -1) {
                Integer valueOf3 = Integer.valueOf(m10);
                Rect bounds2 = region2.getBounds();
                qc.q.h(bounds2, "region.bounds");
                map.put(valueOf3, new u3(pVar2, bounds2));
            }
        }
    }

    public static final float w(t1.p pVar) {
        t1.l l10 = pVar.l();
        t1.s sVar = t1.s.f23478a;
        if (l10.f(sVar.A())) {
            return ((Number) pVar.l().i(sVar.A())).floatValue();
        }
        return 0.0f;
    }

    public static final String x(t1.p pVar) {
        Object c02;
        List list = (List) t1.m.a(pVar.u(), t1.s.f23478a.c());
        if (list != null) {
            c02 = ec.b0.c0(list);
            return (String) c02;
        }
        return null;
    }

    public static final boolean y(t1.p pVar) {
        return pVar.l().f(t1.s.f23478a.p());
    }

    public static final boolean z(t1.p pVar) {
        return pVar.l().f(t1.s.f23478a.q());
    }
}
