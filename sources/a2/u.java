package a2;

import a2.h;
import a2.v;
import dc.m;
import java.util.List;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* loaded from: classes.dex */
public final class u {
    /* JADX INFO: Access modifiers changed from: private */
    public static final dc.l<List<k>, Object> b(List<? extends k> list, x0 x0Var, h hVar, h0 h0Var, pc.l<? super x0, ? extends Object> lVar) {
        d2.s sVar;
        z1.b bVar;
        Object b10;
        z1.c cVar;
        d2.s sVar2;
        z1.b bVar2;
        Object a10;
        z1.c cVar2;
        int size = list.size();
        List list2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = list.get(i10);
            int a11 = kVar.a();
            v.a aVar = v.f331a;
            if (v.e(a11, aVar.b())) {
                sVar = hVar.f285d;
                synchronized (sVar) {
                    h.b bVar3 = new h.b(kVar, h0Var.a());
                    bVar = hVar.f283b;
                    h.a aVar2 = (h.a) bVar.d(bVar3);
                    if (aVar2 == null) {
                        cVar = hVar.f284c;
                        aVar2 = (h.a) cVar.b(bVar3);
                    }
                    if (aVar2 != null) {
                        b10 = aVar2.g();
                    } else {
                        dc.w wVar = dc.w.f13270a;
                        try {
                            b10 = h0Var.b(kVar);
                            h.f(hVar, kVar, h0Var, b10, false, 8, null);
                        } catch (Exception e10) {
                            throw new IllegalStateException("Unable to load font " + kVar, e10);
                        }
                    }
                }
                if (b10 != null) {
                    return dc.r.a(list2, z.a(x0Var.e(), b10, kVar, x0Var.f(), x0Var.d()));
                }
                throw new IllegalStateException("Unable to load font " + kVar);
            }
            if (v.e(a11, aVar.c())) {
                sVar2 = hVar.f285d;
                synchronized (sVar2) {
                    h.b bVar4 = new h.b(kVar, h0Var.a());
                    bVar2 = hVar.f283b;
                    h.a aVar3 = (h.a) bVar2.d(bVar4);
                    if (aVar3 == null) {
                        cVar2 = hVar.f284c;
                        aVar3 = (h.a) cVar2.b(bVar4);
                    }
                    if (aVar3 != null) {
                        a10 = aVar3.g();
                    } else {
                        dc.w wVar2 = dc.w.f13270a;
                        try {
                            m.a aVar4 = dc.m.f13253f;
                            a10 = dc.m.a(h0Var.b(kVar));
                        } catch (Throwable th) {
                            m.a aVar5 = dc.m.f13253f;
                            a10 = dc.m.a(dc.n.a(th));
                        }
                        if (dc.m.c(a10)) {
                            a10 = null;
                        }
                        h.f(hVar, kVar, h0Var, a10, false, 8, null);
                    }
                }
                if (a10 != null) {
                    return dc.r.a(list2, z.a(x0Var.e(), a10, kVar, x0Var.f(), x0Var.d()));
                }
            } else if (v.e(a11, aVar.a())) {
                h.a d10 = hVar.d(kVar, h0Var);
                if (d10 == null) {
                    if (list2 == null) {
                        list2 = ec.t.n(kVar);
                    } else {
                        list2.add(kVar);
                    }
                } else if (!h.a.e(d10.g()) && d10.g() != null) {
                    return dc.r.a(list2, z.a(x0Var.e(), d10.g(), kVar, x0Var.f(), x0Var.d()));
                }
            } else {
                throw new IllegalStateException("Unknown font type " + kVar);
            }
        }
        return dc.r.a(list2, lVar.invoke(x0Var));
    }
}
