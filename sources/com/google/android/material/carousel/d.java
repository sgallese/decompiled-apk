package com.google.android.material.carousel;

import com.google.android.material.carousel.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeylineStateList.java */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final c f9804a;

    /* renamed from: b  reason: collision with root package name */
    private final List<c> f9805b;

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f9806c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f9807d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f9808e;

    /* renamed from: f  reason: collision with root package name */
    private final float f9809f;

    /* renamed from: g  reason: collision with root package name */
    private final float f9810g;

    private d(c cVar, List<c> list, List<c> list2) {
        this.f9804a = cVar;
        this.f9805b = Collections.unmodifiableList(list);
        this.f9806c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f9800a - cVar.c().f9800a;
        this.f9809f = f10;
        float f11 = cVar.h().f9800a - list2.get(list2.size() - 1).h().f9800a;
        this.f9810g = f11;
        this.f9807d = j(f10, list, true);
        this.f9808e = j(f11, list2, false);
    }

    private static int a(c cVar) {
        for (int i10 = 0; i10 < cVar.e().size(); i10++) {
            if (cVar.e().get(i10).f9801b >= 0.0f) {
                return i10;
            }
        }
        return -1;
    }

    private static int b(c cVar, float f10) {
        for (int g10 = cVar.g(); g10 < cVar.e().size(); g10++) {
            if (f10 == cVar.e().get(g10).f9802c) {
                return g10;
            }
        }
        return cVar.e().size() - 1;
    }

    private static int c(a aVar, c cVar) {
        for (int size = cVar.e().size() - 1; size >= 0; size--) {
            if (cVar.e().get(size).f9801b <= aVar.a()) {
                return size;
            }
        }
        return -1;
    }

    private static int d(c cVar, float f10) {
        for (int b10 = cVar.b() - 1; b10 >= 0; b10--) {
            if (f10 == cVar.e().get(b10).f9802c) {
                return b10;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d e(a aVar, c cVar) {
        return new d(cVar, k(cVar), l(aVar, cVar));
    }

    private static float[] j(float f10, List<c> list, boolean z10) {
        float f11;
        float f12;
        int size = list.size();
        float[] fArr = new float[size];
        for (int i10 = 1; i10 < size; i10++) {
            int i11 = i10 - 1;
            c cVar = list.get(i11);
            c cVar2 = list.get(i10);
            if (z10) {
                f11 = cVar2.c().f9800a - cVar.c().f9800a;
            } else {
                f11 = cVar.h().f9800a - cVar2.h().f9800a;
            }
            float f13 = f11 / f10;
            if (i10 == size - 1) {
                f12 = 1.0f;
            } else {
                f12 = fArr[i11] + f13;
            }
            fArr[i10] = f12;
        }
        return fArr;
    }

    private static List<c> k(c cVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int a10 = a(cVar);
        if (!m(cVar) && a10 != -1) {
            int b10 = (cVar.b() - 1) - a10;
            float f10 = cVar.c().f9801b - (cVar.c().f9803d / 2.0f);
            for (int i10 = 0; i10 <= b10; i10++) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int size = cVar.e().size() - 1;
                int i11 = (a10 + i10) - 1;
                if (i11 >= 0) {
                    size = b(cVar2, cVar.e().get(i11).f9802c) - 1;
                }
                arrayList.add(p(cVar2, a10, size, f10, (cVar.b() - i10) - 1, (cVar.g() - i10) - 1));
            }
        }
        return arrayList;
    }

    private static List<c> l(a aVar, c cVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        int c10 = c(aVar, cVar);
        if (!n(aVar, cVar) && c10 != -1) {
            int g10 = c10 - cVar.g();
            float f10 = cVar.c().f9801b - (cVar.c().f9803d / 2.0f);
            for (int i11 = 0; i11 < g10; i11++) {
                c cVar2 = (c) arrayList.get(arrayList.size() - 1);
                int i12 = (c10 - i11) + 1;
                if (i12 < cVar.e().size()) {
                    i10 = d(cVar2, cVar.e().get(i12).f9802c) + 1;
                } else {
                    i10 = 0;
                }
                arrayList.add(p(cVar2, c10, i10, f10, cVar.b() + i11 + 1, cVar.g() + i11 + 1));
            }
        }
        return arrayList;
    }

    private static boolean m(c cVar) {
        if (cVar.a().f9801b - (cVar.a().f9803d / 2.0f) > 0.0f && cVar.a() != cVar.c()) {
            return false;
        }
        return true;
    }

    private static boolean n(a aVar, c cVar) {
        if (cVar.f().f9801b + (cVar.f().f9803d / 2.0f) < aVar.a() && cVar.f() != cVar.h()) {
            return false;
        }
        return true;
    }

    private static c o(List<c> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return c.i(list.get(i10 - 1), list.get(i10), w6.a.b(0.0f, 1.0f, f11, f12, f10));
            }
            i10++;
            f11 = f12;
        }
        return list.get(0);
    }

    private static c p(c cVar, int i10, int i11, float f10, int i12, int i13) {
        boolean z10;
        ArrayList arrayList = new ArrayList(cVar.e());
        arrayList.add(i11, (c.C0233c) arrayList.remove(i10));
        c.b bVar = new c.b(cVar.d());
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c.C0233c c0233c = (c.C0233c) arrayList.get(i14);
            float f11 = c0233c.f9803d;
            float f12 = (f11 / 2.0f) + f10;
            if (i14 >= i12 && i14 <= i13) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.b(f12, c0233c.f9802c, f11, z10);
            f10 += c0233c.f9803d;
        }
        return bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c f() {
        return this.f9804a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c g() {
        return this.f9805b.get(r0.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c h() {
        return this.f9806c.get(r0.size() - 1);
    }

    public c i(float f10, float f11, float f12) {
        float f13 = this.f9809f + f11;
        float f14 = f12 - this.f9810g;
        if (f10 < f13) {
            return o(this.f9805b, w6.a.b(1.0f, 0.0f, f11, f13, f10), this.f9807d);
        } else if (f10 > f14) {
            return o(this.f9806c, w6.a.b(0.0f, 1.0f, f14, f12, f10), this.f9808e);
        } else {
            return this.f9804a;
        }
    }
}
