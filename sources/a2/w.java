package a2;

import a2.c0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FontMatcher.kt */
/* loaded from: classes.dex */
public final class w {
    public final List<k> a(List<? extends k> list, c0 c0Var, int i10) {
        qc.q.i(list, "fontList");
        qc.q.i(c0Var, "fontWeight");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z10 = true;
            if (i12 >= size) {
                break;
            }
            k kVar = list.get(i12);
            k kVar2 = kVar;
            if (!qc.q.d(kVar2.b(), c0Var) || !x.f(kVar2.c(), i10)) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(kVar);
            }
            i12++;
        }
        if ((!arrayList.isEmpty()) != false) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            k kVar3 = list.get(i13);
            if (x.f(kVar3.c(), i10)) {
                arrayList2.add(kVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends k> list2 = list;
        c0.a aVar = c0.f239m;
        c0 c0Var2 = null;
        if (c0Var.compareTo(aVar.k()) < 0) {
            int size3 = list2.size();
            c0 c0Var3 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                c0 b10 = list2.get(i14).b();
                if (b10.compareTo(c0Var) < 0) {
                    if (c0Var2 == null || b10.compareTo(c0Var2) > 0) {
                        c0Var2 = b10;
                    }
                } else if (b10.compareTo(c0Var) > 0) {
                    if (c0Var3 == null || b10.compareTo(c0Var3) < 0) {
                        c0Var3 = b10;
                    }
                } else {
                    c0Var3 = b10;
                    c0Var2 = c0Var3;
                    break;
                }
                i14++;
            }
            if (c0Var2 != null) {
                c0Var3 = c0Var2;
            }
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size4 = list2.size();
            while (i11 < size4) {
                k kVar4 = list2.get(i11);
                if (qc.q.d(kVar4.b(), c0Var3)) {
                    arrayList3.add(kVar4);
                }
                i11++;
            }
            return arrayList3;
        } else if (c0Var.compareTo(aVar.l()) > 0) {
            int size5 = list2.size();
            c0 c0Var4 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                c0 b11 = list2.get(i15).b();
                if (b11.compareTo(c0Var) < 0) {
                    if (c0Var2 == null || b11.compareTo(c0Var2) > 0) {
                        c0Var2 = b11;
                    }
                } else if (b11.compareTo(c0Var) > 0) {
                    if (c0Var4 == null || b11.compareTo(c0Var4) < 0) {
                        c0Var4 = b11;
                    }
                } else {
                    c0Var4 = b11;
                    c0Var2 = c0Var4;
                    break;
                }
                i15++;
            }
            if (c0Var4 == null) {
                c0Var4 = c0Var2;
            }
            ArrayList arrayList4 = new ArrayList(list2.size());
            int size6 = list2.size();
            while (i11 < size6) {
                k kVar5 = list2.get(i11);
                if (qc.q.d(kVar5.b(), c0Var4)) {
                    arrayList4.add(kVar5);
                }
                i11++;
            }
            return arrayList4;
        } else {
            c0 l10 = aVar.l();
            int size7 = list2.size();
            c0 c0Var5 = null;
            c0 c0Var6 = null;
            int i16 = 0;
            while (true) {
                if (i16 >= size7) {
                    break;
                }
                c0 b12 = list2.get(i16).b();
                if (l10 == null || b12.compareTo(l10) <= 0) {
                    if (b12.compareTo(c0Var) < 0) {
                        if (c0Var5 == null || b12.compareTo(c0Var5) > 0) {
                            c0Var5 = b12;
                        }
                    } else if (b12.compareTo(c0Var) > 0) {
                        if (c0Var6 == null || b12.compareTo(c0Var6) < 0) {
                            c0Var6 = b12;
                        }
                    } else {
                        c0Var5 = b12;
                        c0Var6 = c0Var5;
                        break;
                    }
                }
                i16++;
            }
            if (c0Var6 != null) {
                c0Var5 = c0Var6;
            }
            ArrayList arrayList5 = new ArrayList(list2.size());
            int size8 = list2.size();
            for (int i17 = 0; i17 < size8; i17++) {
                k kVar6 = list2.get(i17);
                if (qc.q.d(kVar6.b(), c0Var5)) {
                    arrayList5.add(kVar6);
                }
            }
            if (arrayList5.isEmpty()) {
                c0 l11 = c0.f239m.l();
                int size9 = list2.size();
                c0 c0Var7 = null;
                int i18 = 0;
                while (true) {
                    if (i18 >= size9) {
                        break;
                    }
                    c0 b13 = list2.get(i18).b();
                    if (l11 == null || b13.compareTo(l11) >= 0) {
                        if (b13.compareTo(c0Var) < 0) {
                            if (c0Var2 == null || b13.compareTo(c0Var2) > 0) {
                                c0Var2 = b13;
                            }
                        } else if (b13.compareTo(c0Var) > 0) {
                            if (c0Var7 == null || b13.compareTo(c0Var7) < 0) {
                                c0Var7 = b13;
                            }
                        } else {
                            c0Var2 = b13;
                            c0Var7 = c0Var2;
                            break;
                        }
                    }
                    i18++;
                }
                if (c0Var7 != null) {
                    c0Var2 = c0Var7;
                }
                ArrayList arrayList6 = new ArrayList(list2.size());
                int size10 = list2.size();
                while (i11 < size10) {
                    k kVar7 = list2.get(i11);
                    if (qc.q.d(kVar7.b(), c0Var2)) {
                        arrayList6.add(kVar7);
                    }
                    i11++;
                }
                return arrayList6;
            }
            return arrayList5;
        }
    }
}
