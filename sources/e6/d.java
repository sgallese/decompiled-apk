package e6;

import a1.p1;
import a1.r1;
import a2.c0;
import a2.l;
import a2.n;
import a2.r;
import a2.x;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.TypedValue;
import androidx.core.content.res.e;
import androidx.core.content.res.k;
import j2.e;
import j2.h;
import j2.s;
import j2.t;
import java.util.ArrayList;
import qc.q;
import yc.w;

/* compiled from: ResourceUtils.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f14115a = new ThreadLocal<>();

    private static final c0 a(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18 = true;
        if (i10 >= 0 && i10 < 150) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c0.f239m.h();
        }
        if (150 <= i10 && i10 < 250) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return c0.f239m.i();
        }
        if (250 <= i10 && i10 < 350) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return c0.f239m.j();
        }
        if (350 <= i10 && i10 < 450) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return c0.f239m.k();
        }
        if (450 <= i10 && i10 < 550) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            return c0.f239m.l();
        }
        if (550 <= i10 && i10 < 650) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            return c0.f239m.m();
        }
        if (650 <= i10 && i10 < 750) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (z16) {
            return c0.f239m.n();
        }
        if (750 <= i10 && i10 < 850) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            return c0.f239m.o();
        }
        if (850 > i10 || i10 >= 1000) {
            z18 = false;
        }
        if (z18) {
            return c0.f239m.p();
        }
        return c0.f239m.k();
    }

    public static final long b(TypedArray typedArray, int i10, long j10) {
        q.i(typedArray, "$this$parseColor");
        if (typedArray.hasValue(i10)) {
            return r1.b(k.b(typedArray, i10));
        }
        return j10;
    }

    public static /* synthetic */ long c(TypedArray typedArray, int i10, long j10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j10 = p1.f146b.e();
        }
        return b(typedArray, i10, j10);
    }

    public static final b0.b d(TypedArray typedArray, int i10) {
        int i11;
        q.i(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f14115a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (!typedArray.getValue(i10, typedValue2)) {
            return null;
        }
        int i12 = typedValue2.type;
        if (i12 != 5) {
            if (i12 != 6) {
                return null;
            }
            return b0.c.a(typedValue2.getFraction(1.0f, 1.0f));
        }
        if (Build.VERSION.SDK_INT > 22) {
            i11 = typedValue2.getComplexUnit();
        } else {
            i11 = (typedValue2.data >> 0) & 15;
        }
        if (i11 != 0) {
            if (i11 != 1) {
                return b0.c.b(typedArray.getDimensionPixelSize(i10, 0));
            }
            return b0.c.c(h.j(TypedValue.complexToFloat(typedValue2.data)));
        }
        return b0.c.a(TypedValue.complexToFloat(typedValue2.data));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a2.c0, qc.h] */
    public static final a e(TypedArray typedArray, int i10) {
        boolean D0;
        a aVar;
        boolean O;
        q.i(typedArray, "<this>");
        ThreadLocal<TypedValue> threadLocal = f14115a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        ?? r02 = 0;
        if (!typedArray.getValue(i10, typedValue2) || typedValue2.type != 3) {
            return null;
        }
        CharSequence charSequence = typedValue2.string;
        int i11 = 2;
        if (q.d(charSequence, "sans-serif")) {
            aVar = new a(l.f298m.d(), r02, i11, r02);
        } else if (q.d(charSequence, "sans-serif-thin")) {
            return new a(l.f298m.d(), c0.f239m.g());
        } else {
            if (q.d(charSequence, "sans-serif-light")) {
                return new a(l.f298m.d(), c0.f239m.c());
            }
            if (q.d(charSequence, "sans-serif-medium")) {
                return new a(l.f298m.d(), c0.f239m.d());
            }
            if (q.d(charSequence, "sans-serif-black")) {
                return new a(l.f298m.d(), c0.f239m.a());
            }
            if (q.d(charSequence, "serif")) {
                aVar = new a(l.f298m.e(), r02, i11, r02);
            } else if (q.d(charSequence, "cursive")) {
                aVar = new a(l.f298m.a(), r02, i11, r02);
            } else if (q.d(charSequence, "monospace")) {
                aVar = new a(l.f298m.c(), r02, i11, r02);
            } else if (typedValue2.resourceId == 0) {
                return null;
            } else {
                CharSequence charSequence2 = typedValue2.string;
                q.h(charSequence2, "tv.string");
                D0 = w.D0(charSequence2, "res/", false, 2, null);
                if (!D0) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    CharSequence charSequence3 = typedValue2.string;
                    q.h(charSequence3, "tv.string");
                    O = w.O(charSequence3, ".xml", false, 2, null);
                    if (O) {
                        Resources resources = typedArray.getResources();
                        q.h(resources, "resources");
                        l j10 = j(resources, typedValue2.resourceId);
                        if (j10 == null) {
                            return null;
                        }
                        return new a(j10, r02, i11, r02);
                    }
                }
                aVar = new a(r.c(r.b(typedValue2.resourceId, null, 0, 0, 14, null)), r02, i11, r02);
            }
        }
        return aVar;
    }

    public static final b0.a f(Context context, int i10, j2.r rVar, b0.a aVar) {
        boolean z10;
        b0.b bVar;
        b0.b bVar2;
        b0.a hVar;
        q.i(context, "context");
        q.i(rVar, "layoutDirection");
        q.i(aVar, "fallbackShape");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, b.A1);
        q.h(obtainStyledAttributes, "context.obtainStyledAttr…meAdapterShapeAppearance)");
        b0.b d10 = d(obtainStyledAttributes, b.C1);
        b0.b d11 = d(obtainStyledAttributes, b.F1);
        b0.b d12 = d(obtainStyledAttributes, b.G1);
        b0.b d13 = d(obtainStyledAttributes, b.D1);
        b0.b d14 = d(obtainStyledAttributes, b.E1);
        if (rVar == j2.r.Rtl) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bVar = d12;
        } else {
            bVar = d11;
        }
        if (!z10) {
            d11 = d12;
        }
        if (z10) {
            bVar2 = d14;
        } else {
            bVar2 = d13;
        }
        if (!z10) {
            d13 = d14;
        }
        int i11 = obtainStyledAttributes.getInt(b.B1, 0);
        if (i11 != 0) {
            if (i11 == 1) {
                if (bVar == null) {
                    if (d10 == null) {
                        bVar = aVar.i();
                    } else {
                        bVar = d10;
                    }
                }
                if (d11 == null) {
                    if (d10 == null) {
                        d11 = aVar.h();
                    } else {
                        d11 = d10;
                    }
                }
                if (d13 == null) {
                    if (d10 == null) {
                        d13 = aVar.f();
                    } else {
                        d13 = d10;
                    }
                }
                if (bVar2 == null) {
                    if (d10 == null) {
                        d10 = aVar.g();
                    }
                } else {
                    d10 = bVar2;
                }
                hVar = new b0.d(bVar, d11, d13, d10);
            } else {
                throw new IllegalArgumentException("Unknown cornerFamily set in ShapeAppearance");
            }
        } else {
            if (bVar == null) {
                if (d10 == null) {
                    bVar = aVar.i();
                } else {
                    bVar = d10;
                }
            }
            if (d11 == null) {
                if (d10 == null) {
                    d11 = aVar.h();
                } else {
                    d11 = d10;
                }
            }
            if (d13 == null) {
                if (d10 == null) {
                    d13 = aVar.f();
                } else {
                    d13 = d10;
                }
            }
            if (bVar2 == null) {
                if (d10 == null) {
                    d10 = aVar.g();
                }
            } else {
                d10 = bVar2;
            }
            hVar = new b0.h(bVar, d11, d13, d10);
        }
        obtainStyledAttributes.recycle();
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:208:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v1.k0 g(android.content.Context r43, int r44, j2.e r45, boolean r46, a2.l r47) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.d.g(android.content.Context, int, j2.e, boolean, a2.l):v1.k0");
    }

    public static final long h(TypedArray typedArray, int i10, e eVar, long j10) {
        int i11;
        q.i(typedArray, "$this$parseTextUnit");
        q.i(eVar, "density");
        ThreadLocal<TypedValue> threadLocal = f14115a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        TypedValue typedValue2 = typedValue;
        if (typedArray.getValue(i10, typedValue2) && typedValue2.type == 5) {
            if (Build.VERSION.SDK_INT > 22) {
                i11 = typedValue2.getComplexUnit();
            } else {
                i11 = (typedValue2.data >> 0) & 15;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    return eVar.c0(typedArray.getDimension(i10, 0.0f));
                }
                return t.f(TypedValue.complexToFloat(typedValue2.data));
            }
            return t.c(TypedValue.complexToFloat(typedValue2.data));
        }
        return j10;
    }

    public static /* synthetic */ long i(TypedArray typedArray, int i10, e eVar, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j10 = s.f19004b.a();
        }
        return h(typedArray, i10, eVar, j10);
    }

    @SuppressLint({"RestrictedApi"})
    public static final l j(Resources resources, int i10) {
        int b10;
        q.i(resources, "<this>");
        XmlResourceParser xml = resources.getXml(i10);
        q.h(xml, "getXml(id)");
        try {
            e.b b11 = androidx.core.content.res.e.b(xml, resources);
            if (b11 instanceof e.c) {
                e.d[] a10 = ((e.c) b11).a();
                q.h(a10, "result.entries");
                ArrayList arrayList = new ArrayList(a10.length);
                for (e.d dVar : a10) {
                    int b12 = dVar.b();
                    c0 a11 = a(dVar.e());
                    if (dVar.f()) {
                        b10 = x.f339b.a();
                    } else {
                        b10 = x.f339b.b();
                    }
                    arrayList.add(r.b(b12, a11, b10, 0, 8, null));
                }
                return n.a(arrayList);
            }
            xml.close();
            return null;
        } finally {
            xml.close();
        }
    }
}
