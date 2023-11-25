package v1;

import java.util.ArrayList;
import java.util.List;
import v1.d;

/* compiled from: AnnotatedString.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private static final d f24432a = new d("", null, null, 6, null);

    public static final boolean f(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (i10 > i12 || i13 > i11) {
            return false;
        }
        if (i11 == i13) {
            if (i12 == i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == i11) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 != z11) {
                return false;
            }
        }
        return true;
    }

    public static final d g() {
        return f24432a;
    }

    public static final <T> List<d.b<T>> h(List<? extends d.b<? extends T>> list, int i10, int i11) {
        boolean z10;
        if (i10 <= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                d.b<? extends T> bVar = list.get(i12);
                d.b<? extends T> bVar2 = bVar;
                if (l(i10, i11, bVar2.f(), bVar2.d())) {
                    arrayList.add(bVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i13 = 0; i13 < size2; i13++) {
                d.b bVar3 = (d.b) arrayList.get(i13);
                arrayList2.add(new d.b(bVar3.e(), Math.max(i10, bVar3.f()) - i10, Math.min(i11, bVar3.d()) - i10, bVar3.g()));
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
    }

    public static final List<d.b<? extends Object>> i(d dVar, int i10, int i11) {
        List<d.b<? extends Object>> b10;
        int l10;
        int l11;
        if (i10 == i11 || (b10 = dVar.b()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.i().length()) {
            return b10;
        }
        ArrayList arrayList = new ArrayList(b10.size());
        int size = b10.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<? extends Object> bVar = b10.get(i12);
            d.b<? extends Object> bVar2 = bVar;
            if (l(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            String g10 = bVar3.g();
            Object e10 = bVar3.e();
            l10 = vc.l.l(bVar3.f(), i10, i11);
            l11 = vc.l.l(bVar3.d(), i10, i11);
            arrayList2.add(new d.b(e10, l10 - i10, l11 - i10, g10));
        }
        return arrayList2;
    }

    public static final List<d.b<s>> j(d dVar, int i10, int i11) {
        List<d.b<s>> e10;
        int l10;
        int l11;
        if (i10 == i11 || (e10 = dVar.e()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.i().length()) {
            return e10;
        }
        ArrayList arrayList = new ArrayList(e10.size());
        int size = e10.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<s> bVar = e10.get(i12);
            d.b<s> bVar2 = bVar;
            if (l(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            Object e11 = bVar3.e();
            l10 = vc.l.l(bVar3.f(), i10, i11);
            l11 = vc.l.l(bVar3.d(), i10, i11);
            arrayList2.add(new d.b(e11, l10 - i10, l11 - i10));
        }
        return arrayList2;
    }

    public static final List<d.b<b0>> k(d dVar, int i10, int i11) {
        List<d.b<b0>> g10;
        int l10;
        int l11;
        if (i10 == i11 || (g10 = dVar.g()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= dVar.i().length()) {
            return g10;
        }
        ArrayList arrayList = new ArrayList(g10.size());
        int size = g10.size();
        for (int i12 = 0; i12 < size; i12++) {
            d.b<b0> bVar = g10.get(i12);
            d.b<b0> bVar2 = bVar;
            if (l(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            d.b bVar3 = (d.b) arrayList.get(i13);
            Object e10 = bVar3.e();
            l10 = vc.l.l(bVar3.f(), i10, i11);
            l11 = vc.l.l(bVar3.d(), i10, i11);
            arrayList2.add(new d.b(e10, l10 - i10, l11 - i10));
        }
        return arrayList2;
    }

    public static final boolean l(int i10, int i11, int i12, int i13) {
        if (Math.max(i10, i12) >= Math.min(i11, i13) && !f(i10, i11, i12, i13) && !f(i12, i13, i10, i11)) {
            return false;
        }
        return true;
    }

    public static final List<d.b<s>> m(d dVar, s sVar) {
        qc.q.i(dVar, "<this>");
        qc.q.i(sVar, "defaultParagraphStyle");
        int length = dVar.i().length();
        List<d.b<s>> e10 = dVar.e();
        if (e10 == null) {
            e10 = ec.t.i();
        }
        ArrayList arrayList = new ArrayList();
        int size = e10.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            d.b<s> bVar = e10.get(i10);
            s a10 = bVar.a();
            int b10 = bVar.b();
            int c10 = bVar.c();
            if (b10 != i11) {
                arrayList.add(new d.b(sVar, i11, b10));
            }
            arrayList.add(new d.b(sVar.o(a10), b10, c10));
            i10++;
            i11 = c10;
        }
        if (i11 != length) {
            arrayList.add(new d.b(sVar, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new d.b(sVar, 0, 0));
        }
        return arrayList;
    }

    public static final d n(d dVar, int i10, int i11) {
        String str;
        if (i10 != i11) {
            str = dVar.i().substring(i10, i11);
            qc.q.h(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new d(str, k(dVar, i10, i11), null, null, 12, null);
    }
}
