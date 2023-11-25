package x;

import java.util.ArrayList;
import java.util.List;
import n1.y0;
import w.a;

/* compiled from: LazyListMeasure.kt */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: LazyListMeasure.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f25636f = new a();

        a() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$invoke");
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }
    }

    /* compiled from: LazyListMeasure.kt */
    /* loaded from: classes.dex */
    static final class b extends qc.r implements pc.l<y0.a, dc.w> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<u> f25637f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ u f25638m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<u> list, u uVar) {
            super(1);
            this.f25637f = list;
            this.f25638m = uVar;
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(y0.a aVar) {
            invoke2(aVar);
            return dc.w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(y0.a aVar) {
            qc.q.i(aVar, "$this$invoke");
            List<u> list = this.f25637f;
            u uVar = this.f25638m;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                u uVar2 = list.get(i10);
                if (uVar2 != uVar) {
                    uVar2.l(aVar);
                }
            }
            u uVar3 = this.f25638m;
            if (uVar3 != null) {
                uVar3.l(aVar);
            }
        }
    }

    private static final List<u> a(List<u> list, List<u> list2, List<u> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, a.l lVar, a.d dVar, boolean z11, j2.e eVar) {
        int i15;
        boolean z12;
        vc.d N;
        boolean z13;
        if (z10) {
            i15 = i11;
        } else {
            i15 = i10;
        }
        boolean z14 = true;
        if (i12 < Math.min(i15, i13)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (i14 == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!list2.isEmpty() || !list3.isEmpty()) {
                z14 = false;
            }
            if (z14) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i16 = 0; i16 < size; i16++) {
                    iArr[i16] = list.get(b(i16, z11, size)).i();
                }
                int[] iArr2 = new int[size];
                for (int i17 = 0; i17 < size; i17++) {
                    iArr2[i17] = 0;
                }
                if (z10) {
                    if (lVar != null) {
                        lVar.c(eVar, i15, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (dVar != null) {
                    dVar.b(eVar, i15, iArr, j2.r.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                N = ec.p.N(iArr2);
                if (z11) {
                    N = vc.l.q(N);
                }
                int h10 = N.h();
                int i18 = N.i();
                int j10 = N.j();
                if ((j10 > 0 && h10 <= i18) || (j10 < 0 && i18 <= h10)) {
                    while (true) {
                        int i19 = iArr2[h10];
                        u uVar = list.get(b(h10, z11, size));
                        if (z11) {
                            i19 = (i15 - i19) - uVar.i();
                        }
                        uVar.m(i19, i10, i11);
                        arrayList.add(uVar);
                        if (h10 == i18) {
                            break;
                        }
                        h10 += j10;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i20 = i14;
            for (int i21 = 0; i21 < size2; i21++) {
                u uVar2 = list2.get(i21);
                i20 -= uVar2.j();
                uVar2.m(i20, i10, i11);
                arrayList.add(uVar2);
            }
            int size3 = list.size();
            int i22 = i14;
            for (int i23 = 0; i23 < size3; i23++) {
                u uVar3 = list.get(i23);
                uVar3.m(i22, i10, i11);
                arrayList.add(uVar3);
                i22 += uVar3.j();
            }
            int size4 = list3.size();
            for (int i24 = 0; i24 < size4; i24++) {
                u uVar4 = list3.get(i24);
                uVar4.m(i22, i10, i11);
                arrayList.add(uVar4);
                i22 += uVar4.j();
            }
        }
        return arrayList;
    }

    private static final int b(int i10, boolean z10, int i11) {
        if (z10) {
            return (i11 - i10) - 1;
        }
        return i10;
    }

    private static final List<u> c(List<u> list, v vVar, int i10, int i11, List<Integer> list2) {
        Object m02;
        Object m03;
        List<u> i12;
        m02 = ec.b0.m0(list);
        int min = Math.min(((u) m02).getIndex() + i11, i10 - 1);
        m03 = ec.b0.m0(list);
        int index = ((u) m03).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vVar.b(index));
                if (index == min) {
                    break;
                }
                index++;
            }
        }
        int size = list2.size();
        for (int i13 = 0; i13 < size; i13++) {
            int intValue = list2.get(i13).intValue();
            if (intValue > min) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vVar.b(intValue));
            }
        }
        if (arrayList == null) {
            i12 = ec.t.i();
            return i12;
        }
        return arrayList;
    }

    private static final List<u> d(int i10, v vVar, int i11, List<Integer> list) {
        List<u> i12;
        int max = Math.max(0, i10 - i11);
        int i13 = i10 - 1;
        ArrayList arrayList = null;
        if (max <= i13) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vVar.b(i13));
                if (i13 == max) {
                    break;
                }
                i13--;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int intValue = list.get(i14).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(vVar.b(intValue));
            }
        }
        if (arrayList == null) {
            i12 = ec.t.i();
            return i12;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x.t e(int r31, x.v r32, int r33, int r34, int r35, int r36, int r37, int r38, float r39, long r40, boolean r42, java.util.List<java.lang.Integer> r43, w.a.l r44, w.a.d r45, boolean r46, j2.e r47, x.m r48, int r49, java.util.List<java.lang.Integer> r50, pc.q<? super java.lang.Integer, ? super java.lang.Integer, ? super pc.l<? super n1.y0.a, dc.w>, ? extends n1.j0> r51) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.s.e(int, x.v, int, int, int, int, int, int, float, long, boolean, java.util.List, w.a$l, w.a$d, boolean, j2.e, x.m, int, java.util.List, pc.q):x.t");
    }
}
