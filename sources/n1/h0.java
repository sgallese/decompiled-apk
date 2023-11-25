package n1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: MeasurePolicy.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 {
    public static int a(i0 i0Var, n nVar, List list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h((m) list.get(i11), o.Max, p.Height));
        }
        return i0Var.mo0measure3p2s80s(new q(nVar, nVar.getLayoutDirection()), arrayList, j2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int b(i0 i0Var, n nVar, List list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h((m) list.get(i11), o.Max, p.Width));
        }
        return i0Var.mo0measure3p2s80s(new q(nVar, nVar.getLayoutDirection()), arrayList, j2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }

    public static int c(i0 i0Var, n nVar, List list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h((m) list.get(i11), o.Min, p.Height));
        }
        return i0Var.mo0measure3p2s80s(new q(nVar, nVar.getLayoutDirection()), arrayList, j2.c.b(0, i10, 0, 0, 13, null)).getHeight();
    }

    public static int d(i0 i0Var, n nVar, List list, int i10) {
        qc.q.i(nVar, "<this>");
        qc.q.i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new h((m) list.get(i11), o.Min, p.Width));
        }
        return i0Var.mo0measure3p2s80s(new q(nVar, nVar.getLayoutDirection()), arrayList, j2.c.b(0, 0, 0, i10, 7, null)).getWidth();
    }
}
