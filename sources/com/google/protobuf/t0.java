package com.google.protobuf;

import com.google.protobuf.h;
import com.google.protobuf.j0;
import com.google.protobuf.r1;
import com.google.protobuf.s1;
import com.google.protobuf.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema.java */
/* loaded from: classes3.dex */
final class t0<T> implements f1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f12434r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f12435s = p1.D();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f12436a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f12437b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12438c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12439d;

    /* renamed from: e  reason: collision with root package name */
    private final q0 f12440e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f12441f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f12442g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f12443h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f12444i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f12445j;

    /* renamed from: k  reason: collision with root package name */
    private final int f12446k;

    /* renamed from: l  reason: collision with root package name */
    private final int f12447l;

    /* renamed from: m  reason: collision with root package name */
    private final v0 f12448m;

    /* renamed from: n  reason: collision with root package name */
    private final g0 f12449n;

    /* renamed from: o  reason: collision with root package name */
    private final l1<?, ?> f12450o;

    /* renamed from: p  reason: collision with root package name */
    private final p<?> f12451p;

    /* renamed from: q  reason: collision with root package name */
    private final l0 f12452q;

    private t0(int[] iArr, Object[] objArr, int i10, int i11, q0 q0Var, boolean z10, boolean z11, int[] iArr2, int i12, int i13, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, p<?> pVar, l0 l0Var) {
        boolean z12;
        this.f12436a = iArr;
        this.f12437b = objArr;
        this.f12438c = i10;
        this.f12439d = i11;
        this.f12442g = q0Var instanceof x;
        this.f12443h = z10;
        if (pVar != null && pVar.e(q0Var)) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f12441f = z12;
        this.f12444i = z11;
        this.f12445j = iArr2;
        this.f12446k = i12;
        this.f12447l = i13;
        this.f12448m = v0Var;
        this.f12449n = g0Var;
        this.f12450o = l1Var;
        this.f12451p = pVar;
        this.f12440e = q0Var;
        this.f12452q = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean A(Object obj, int i10, f1 f1Var) {
        return f1Var.d(p1.C(obj, R(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean B(Object obj, int i10, int i11) {
        List list = (List) p1.C(obj, R(i10));
        if (list.isEmpty()) {
            return true;
        }
        f1 s10 = s(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!s10.d(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.f1] */
    private boolean C(T t10, int i10, int i11) {
        Map<?, ?> h10 = this.f12452q.h(p1.C(t10, R(i10)));
        if (h10.isEmpty()) {
            return true;
        }
        if (this.f12452q.c(r(i11)).f12360c.getJavaType() != r1.c.MESSAGE) {
            return true;
        }
        f1<T> f1Var = 0;
        for (Object obj : h10.values()) {
            if (f1Var == null) {
                f1Var = b1.a().d(obj.getClass());
            }
            if (!f1Var.d(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long Y = Y(i10) & 1048575;
        if (p1.z(t10, Y) == p1.z(t11, Y)) {
            return true;
        }
        return false;
    }

    private boolean E(T t10, int i10, int i11) {
        if (p1.z(t10, Y(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean F(int i10) {
        if ((i10 & 268435456) != 0) {
            return true;
        }
        return false;
    }

    private static List<?> G(Object obj, long j10) {
        return (List) p1.C(obj, j10);
    }

    private static <T> long H(T t10, long j10) {
        return p1.A(t10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        r0 = r16.f12446k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 >= r16.f12447l) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        r13 = n(r19, r16.f12445j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r13 == null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.t.b<ET>> void I(com.google.protobuf.l1<UT, UB> r17, com.google.protobuf.p<ET> r18, T r19, com.google.protobuf.e1 r20, com.google.protobuf.o r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.I(com.google.protobuf.l1, com.google.protobuf.p, java.lang.Object, com.google.protobuf.e1, com.google.protobuf.o):void");
    }

    private final <K, V> void J(Object obj, int i10, Object obj2, o oVar, e1 e1Var) throws IOException {
        long R = R(i0(i10));
        Object C = p1.C(obj, R);
        if (C == null) {
            C = this.f12452q.e(obj2);
            p1.R(obj, R, C);
        } else if (this.f12452q.g(C)) {
            Object e10 = this.f12452q.e(obj2);
            this.f12452q.a(e10, C);
            p1.R(obj, R, e10);
            C = e10;
        }
        e1Var.E(this.f12452q.d(C), this.f12452q.c(obj2), oVar);
    }

    private void K(T t10, T t11, int i10) {
        long R = R(i0(i10));
        if (!y(t11, i10)) {
            return;
        }
        Object C = p1.C(t10, R);
        Object C2 = p1.C(t11, R);
        if (C != null && C2 != null) {
            p1.R(t10, R, z.h(C, C2));
            e0(t10, i10);
        } else if (C2 != null) {
            p1.R(t10, R, C2);
            e0(t10, i10);
        }
    }

    private void L(T t10, T t11, int i10) {
        Object obj;
        int i02 = i0(i10);
        int Q = Q(i10);
        long R = R(i02);
        if (!E(t11, Q, i10)) {
            return;
        }
        if (E(t10, Q, i10)) {
            obj = p1.C(t10, R);
        } else {
            obj = null;
        }
        Object C = p1.C(t11, R);
        if (obj != null && C != null) {
            p1.R(t10, R, z.h(obj, C));
            f0(t10, Q, i10);
        } else if (C != null) {
            p1.R(t10, R, C);
            f0(t10, Q, i10);
        }
    }

    private void M(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        int Q = Q(i10);
        switch (h0(i02)) {
            case 0:
                if (y(t11, i10)) {
                    p1.N(t10, R, p1.x(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 1:
                if (y(t11, i10)) {
                    p1.O(t10, R, p1.y(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 2:
                if (y(t11, i10)) {
                    p1.Q(t10, R, p1.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 3:
                if (y(t11, i10)) {
                    p1.Q(t10, R, p1.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 4:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 5:
                if (y(t11, i10)) {
                    p1.Q(t10, R, p1.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 6:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 7:
                if (y(t11, i10)) {
                    p1.H(t10, R, p1.r(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 8:
                if (y(t11, i10)) {
                    p1.R(t10, R, p1.C(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 9:
                K(t10, t11, i10);
                return;
            case 10:
                if (y(t11, i10)) {
                    p1.R(t10, R, p1.C(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 11:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 12:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 13:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 14:
                if (y(t11, i10)) {
                    p1.Q(t10, R, p1.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 15:
                if (y(t11, i10)) {
                    p1.P(t10, R, p1.z(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 16:
                if (y(t11, i10)) {
                    p1.Q(t10, R, p1.A(t11, R));
                    e0(t10, i10);
                    return;
                }
                return;
            case 17:
                K(t10, t11, i10);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f12449n.d(t10, t11, R);
                return;
            case 50:
                h1.F(this.f12452q, t10, t11, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (E(t11, Q, i10)) {
                    p1.R(t10, R, p1.C(t11, R));
                    f0(t10, Q, i10);
                    return;
                }
                return;
            case 60:
                L(t10, t11, i10);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, Q, i10)) {
                    p1.R(t10, R, p1.C(t11, R));
                    f0(t10, Q, i10);
                    return;
                }
                return;
            case 68:
                L(t10, t11, i10);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> t0<T> N(Class<T> cls, o0 o0Var, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, p<?> pVar, l0 l0Var) {
        if (o0Var instanceof d1) {
            return P((d1) o0Var, v0Var, g0Var, l1Var, pVar, l0Var);
        }
        return O((j1) o0Var, v0Var, g0Var, l1Var, pVar, l0Var);
    }

    static <T> t0<T> O(j1 j1Var, v0 v0Var, g0 g0Var, l1<?, ?> l1Var, p<?> pVar, l0 l0Var) {
        boolean z10;
        if (j1Var.c() == a1.PROTO3) {
            z10 = true;
        } else {
            z10 = false;
        }
        s[] e10 = j1Var.e();
        if (e10.length == 0) {
            int length = e10.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e10.length <= 0) {
                int[] d10 = j1Var.d();
                if (d10 == null) {
                    d10 = f12434r;
                }
                if (e10.length <= 0) {
                    int[] iArr2 = f12434r;
                    int[] iArr3 = f12434r;
                    int[] iArr4 = new int[d10.length + iArr2.length + iArr3.length];
                    System.arraycopy(d10, 0, iArr4, 0, d10.length);
                    System.arraycopy(iArr2, 0, iArr4, d10.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d10.length + iArr2.length, iArr3.length);
                    return new t0<>(iArr, objArr, 0, 0, j1Var.b(), z10, true, iArr4, d10.length, d10.length + iArr2.length, v0Var, g0Var, l1Var, pVar, l0Var);
                }
                s sVar = e10[0];
                throw null;
            }
            s sVar2 = e10[0];
            throw null;
        }
        s sVar3 = e10[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.t0<T> P(com.google.protobuf.d1 r34, com.google.protobuf.v0 r35, com.google.protobuf.g0 r36, com.google.protobuf.l1<?, ?> r37, com.google.protobuf.p<?> r38, com.google.protobuf.l0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.P(com.google.protobuf.d1, com.google.protobuf.v0, com.google.protobuf.g0, com.google.protobuf.l1, com.google.protobuf.p, com.google.protobuf.l0):com.google.protobuf.t0");
    }

    private int Q(int i10) {
        return this.f12436a[i10];
    }

    private static long R(int i10) {
        return i10 & 1048575;
    }

    private static <T> boolean S(T t10, long j10) {
        return ((Boolean) p1.C(t10, j10)).booleanValue();
    }

    private static <T> double T(T t10, long j10) {
        return ((Double) p1.C(t10, j10)).doubleValue();
    }

    private static <T> float U(T t10, long j10) {
        return ((Float) p1.C(t10, j10)).floatValue();
    }

    private static <T> int V(T t10, long j10) {
        return ((Integer) p1.C(t10, j10)).intValue();
    }

    private static <T> long W(T t10, long j10) {
        return ((Long) p1.C(t10, j10)).longValue();
    }

    private int X(int i10) {
        if (i10 >= this.f12438c && i10 <= this.f12439d) {
            return g0(i10, 0);
        }
        return -1;
    }

    private int Y(int i10) {
        return this.f12436a[i10 + 2];
    }

    private <E> void Z(Object obj, long j10, e1 e1Var, f1<E> f1Var, o oVar) throws IOException {
        e1Var.f(this.f12449n.e(obj, j10), f1Var, oVar);
    }

    private <E> void a0(Object obj, int i10, e1 e1Var, f1<E> f1Var, o oVar) throws IOException {
        e1Var.k(this.f12449n.e(obj, R(i10)), f1Var, oVar);
    }

    private void b0(Object obj, int i10, e1 e1Var) throws IOException {
        if (x(i10)) {
            p1.R(obj, R(i10), e1Var.O());
        } else if (this.f12442g) {
            p1.R(obj, R(i10), e1Var.z());
        } else {
            p1.R(obj, R(i10), e1Var.G());
        }
    }

    private void c0(Object obj, int i10, e1 e1Var) throws IOException {
        if (x(i10)) {
            e1Var.F(this.f12449n.e(obj, R(i10)));
        } else {
            e1Var.C(this.f12449n.e(obj, R(i10)));
        }
    }

    private static Field d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private void e0(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 == 1048575) {
            return;
        }
        p1.P(t10, j10, (1 << (Y >>> 20)) | p1.z(t10, j10));
    }

    private void f0(T t10, int i10, int i11) {
        p1.P(t10, Y(i11) & 1048575, i10);
    }

    private int g0(int i10, int i11) {
        int length = (this.f12436a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int Q = Q(i13);
            if (i10 == Q) {
                return i13;
            }
            if (i10 < Q) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int h0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private int i0(int i10) {
        return this.f12436a[i10 + 1];
    }

    private boolean j(T t10, T t11, int i10) {
        if (y(t10, i10) == y(t11, i10)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j0(T r18, com.google.protobuf.s1 r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.j0(java.lang.Object, com.google.protobuf.s1):void");
    }

    private static <T> boolean k(T t10, long j10) {
        return p1.r(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0588  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(T r13, com.google.protobuf.s1 r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.k0(java.lang.Object, com.google.protobuf.s1):void");
    }

    private static <T> double l(T t10, long j10) {
        return p1.x(t10, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x058e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l0(T r11, com.google.protobuf.s1 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.t0.l0(java.lang.Object, com.google.protobuf.s1):void");
    }

    private boolean m(T t10, T t11, int i10) {
        int i02 = i0(i10);
        long R = R(i02);
        switch (h0(i02)) {
            case 0:
                if (!j(t10, t11, i10) || Double.doubleToLongBits(p1.x(t10, R)) != Double.doubleToLongBits(p1.x(t11, R))) {
                    return false;
                }
                return true;
            case 1:
                if (!j(t10, t11, i10) || Float.floatToIntBits(p1.y(t10, R)) != Float.floatToIntBits(p1.y(t11, R))) {
                    return false;
                }
                return true;
            case 2:
                if (!j(t10, t11, i10) || p1.A(t10, R) != p1.A(t11, R)) {
                    return false;
                }
                return true;
            case 3:
                if (!j(t10, t11, i10) || p1.A(t10, R) != p1.A(t11, R)) {
                    return false;
                }
                return true;
            case 4:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 5:
                if (!j(t10, t11, i10) || p1.A(t10, R) != p1.A(t11, R)) {
                    return false;
                }
                return true;
            case 6:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 7:
                if (!j(t10, t11, i10) || p1.r(t10, R) != p1.r(t11, R)) {
                    return false;
                }
                return true;
            case 8:
                if (!j(t10, t11, i10) || !h1.K(p1.C(t10, R), p1.C(t11, R))) {
                    return false;
                }
                return true;
            case 9:
                if (!j(t10, t11, i10) || !h1.K(p1.C(t10, R), p1.C(t11, R))) {
                    return false;
                }
                return true;
            case 10:
                if (!j(t10, t11, i10) || !h1.K(p1.C(t10, R), p1.C(t11, R))) {
                    return false;
                }
                return true;
            case 11:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 12:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 13:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 14:
                if (!j(t10, t11, i10) || p1.A(t10, R) != p1.A(t11, R)) {
                    return false;
                }
                return true;
            case 15:
                if (!j(t10, t11, i10) || p1.z(t10, R) != p1.z(t11, R)) {
                    return false;
                }
                return true;
            case 16:
                if (!j(t10, t11, i10) || p1.A(t10, R) != p1.A(t11, R)) {
                    return false;
                }
                return true;
            case 17:
                if (!j(t10, t11, i10) || !h1.K(p1.C(t10, R), p1.C(t11, R))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return h1.K(p1.C(t10, R), p1.C(t11, R));
            case 50:
                return h1.K(p1.C(t10, R), p1.C(t11, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!D(t10, t11, i10) || !h1.K(p1.C(t10, R), p1.C(t11, R))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    private <K, V> void m0(s1 s1Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            s1Var.C(i10, this.f12452q.c(r(i11)), this.f12452q.h(obj));
        }
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub2, l1<UT, UB> l1Var) {
        int Q = Q(i10);
        Object C = p1.C(obj, R(i0(i10)));
        if (C == null) {
            return ub2;
        }
        z.e q10 = q(i10);
        if (q10 == null) {
            return ub2;
        }
        return (UB) o(i10, Q, this.f12452q.d(C), q10, ub2, l1Var);
    }

    private void n0(int i10, Object obj, s1 s1Var) throws IOException {
        if (obj instanceof String) {
            s1Var.n(i10, (String) obj);
        } else {
            s1Var.v(i10, (h) obj);
        }
    }

    private final <K, V, UT, UB> UB o(int i10, int i11, Map<K, V> map, z.e eVar, UB ub2, l1<UT, UB> l1Var) {
        j0.a<?, ?> c10 = this.f12452q.c(r(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l1Var.n();
                }
                h.C0256h n10 = h.n(j0.b(c10, next.getKey(), next.getValue()));
                try {
                    j0.e(n10.b(), c10, next.getKey(), next.getValue());
                    l1Var.d(ub2, i11, n10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private <UT, UB> void o0(l1<UT, UB> l1Var, T t10, s1 s1Var) throws IOException {
        l1Var.t(l1Var.g(t10), s1Var);
    }

    private static <T> float p(T t10, long j10) {
        return p1.y(t10, j10);
    }

    private z.e q(int i10) {
        return (z.e) this.f12437b[((i10 / 3) * 2) + 1];
    }

    private Object r(int i10) {
        return this.f12437b[(i10 / 3) * 2];
    }

    private f1 s(int i10) {
        int i11 = (i10 / 3) * 2;
        f1 f1Var = (f1) this.f12437b[i11];
        if (f1Var != null) {
            return f1Var;
        }
        f1<T> d10 = b1.a().d((Class) this.f12437b[i11 + 1]);
        this.f12437b[i11] = d10;
        return d10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int t(T t10) {
        int i10;
        int i11;
        int i12;
        int d10;
        int K;
        int i13;
        int U;
        int W;
        Unsafe unsafe = f12435s;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        int i18 = 0;
        while (i15 < this.f12436a.length) {
            int i02 = i0(i15);
            int Q = Q(i15);
            int h02 = h0(i02);
            if (h02 <= 17) {
                i10 = this.f12436a[i15 + 2];
                int i19 = i10 & i14;
                i11 = 1 << (i10 >>> 20);
                if (i19 != i17) {
                    i18 = unsafe.getInt(t10, i19);
                    i17 = i19;
                }
            } else {
                if (this.f12444i && h02 >= u.DOUBLE_LIST_PACKED.id() && h02 <= u.SINT64_LIST_PACKED.id()) {
                    i10 = this.f12436a[i15 + 2] & i14;
                } else {
                    i10 = 0;
                }
                i11 = 0;
            }
            long R = R(i02);
            switch (h02) {
                case 0:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.i(Q, 0.0d);
                        i16 += i12;
                        break;
                    }
                case 1:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.q(Q, 0.0f);
                        i16 += i12;
                        break;
                    }
                case 2:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.x(Q, unsafe.getLong(t10, R));
                        i16 += i12;
                        break;
                    }
                case 3:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.X(Q, unsafe.getLong(t10, R));
                        i16 += i12;
                        break;
                    }
                case 4:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.v(Q, unsafe.getInt(t10, R));
                        i16 += i12;
                        break;
                    }
                case 5:
                    if ((i18 & i11) == 0) {
                        break;
                    } else {
                        i12 = CodedOutputStream.o(Q, 0L);
                        i16 += i12;
                        break;
                    }
                case 6:
                    if ((i18 & i11) != 0) {
                        i12 = CodedOutputStream.m(Q, 0);
                        i16 += i12;
                        break;
                    }
                    break;
                case 7:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.d(Q, true);
                        i16 += d10;
                    }
                    break;
                case 8:
                    if ((i18 & i11) != 0) {
                        Object object = unsafe.getObject(t10, R);
                        if (object instanceof h) {
                            d10 = CodedOutputStream.g(Q, (h) object);
                        } else {
                            d10 = CodedOutputStream.S(Q, (String) object);
                        }
                        i16 += d10;
                    }
                    break;
                case 9:
                    if ((i18 & i11) != 0) {
                        d10 = h1.o(Q, unsafe.getObject(t10, R), s(i15));
                        i16 += d10;
                    }
                    break;
                case 10:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.g(Q, (h) unsafe.getObject(t10, R));
                        i16 += d10;
                    }
                    break;
                case 11:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.V(Q, unsafe.getInt(t10, R));
                        i16 += d10;
                    }
                    break;
                case 12:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.k(Q, unsafe.getInt(t10, R));
                        i16 += d10;
                    }
                    break;
                case 13:
                    if ((i18 & i11) != 0) {
                        K = CodedOutputStream.K(Q, 0);
                        i16 += K;
                    }
                    break;
                case 14:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.M(Q, 0L);
                        i16 += d10;
                    }
                    break;
                case 15:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.O(Q, unsafe.getInt(t10, R));
                        i16 += d10;
                    }
                    break;
                case 16:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.Q(Q, unsafe.getLong(t10, R));
                        i16 += d10;
                    }
                    break;
                case 17:
                    if ((i18 & i11) != 0) {
                        d10 = CodedOutputStream.s(Q, (q0) unsafe.getObject(t10, R), s(i15));
                        i16 += d10;
                    }
                    break;
                case 18:
                    d10 = h1.h(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 19:
                    d10 = h1.f(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 20:
                    d10 = h1.m(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 21:
                    d10 = h1.x(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 22:
                    d10 = h1.k(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 23:
                    d10 = h1.h(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 24:
                    d10 = h1.f(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 25:
                    d10 = h1.a(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 26:
                    d10 = h1.u(Q, (List) unsafe.getObject(t10, R));
                    i16 += d10;
                    break;
                case 27:
                    d10 = h1.p(Q, (List) unsafe.getObject(t10, R), s(i15));
                    i16 += d10;
                    break;
                case 28:
                    d10 = h1.c(Q, (List) unsafe.getObject(t10, R));
                    i16 += d10;
                    break;
                case 29:
                    d10 = h1.v(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 30:
                    d10 = h1.d(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 31:
                    d10 = h1.f(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 32:
                    d10 = h1.h(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 33:
                    d10 = h1.q(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 34:
                    d10 = h1.s(Q, (List) unsafe.getObject(t10, R), false);
                    i16 += d10;
                    break;
                case 35:
                    i13 = h1.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 36:
                    i13 = h1.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 37:
                    i13 = h1.n((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 38:
                    i13 = h1.y((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 39:
                    i13 = h1.l((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 40:
                    i13 = h1.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 41:
                    i13 = h1.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 42:
                    i13 = h1.b((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 43:
                    i13 = h1.w((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 44:
                    i13 = h1.e((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 45:
                    i13 = h1.g((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 46:
                    i13 = h1.i((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 47:
                    i13 = h1.r((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 48:
                    i13 = h1.t((List) unsafe.getObject(t10, R));
                    if (i13 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i13);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i13);
                        K = U + W + i13;
                        i16 += K;
                    }
                    break;
                case 49:
                    d10 = h1.j(Q, (List) unsafe.getObject(t10, R), s(i15));
                    i16 += d10;
                    break;
                case 50:
                    d10 = this.f12452q.f(Q, unsafe.getObject(t10, R), r(i15));
                    i16 += d10;
                    break;
                case 51:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.i(Q, 0.0d);
                        i16 += d10;
                    }
                    break;
                case 52:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.q(Q, 0.0f);
                        i16 += d10;
                    }
                    break;
                case 53:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.x(Q, W(t10, R));
                        i16 += d10;
                    }
                    break;
                case 54:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.X(Q, W(t10, R));
                        i16 += d10;
                    }
                    break;
                case 55:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.v(Q, V(t10, R));
                        i16 += d10;
                    }
                    break;
                case 56:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.o(Q, 0L);
                        i16 += d10;
                    }
                    break;
                case 57:
                    if (E(t10, Q, i15)) {
                        K = CodedOutputStream.m(Q, 0);
                        i16 += K;
                    }
                    break;
                case 58:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.d(Q, true);
                        i16 += d10;
                    }
                    break;
                case 59:
                    if (E(t10, Q, i15)) {
                        Object object2 = unsafe.getObject(t10, R);
                        if (object2 instanceof h) {
                            d10 = CodedOutputStream.g(Q, (h) object2);
                        } else {
                            d10 = CodedOutputStream.S(Q, (String) object2);
                        }
                        i16 += d10;
                    }
                    break;
                case 60:
                    if (E(t10, Q, i15)) {
                        d10 = h1.o(Q, unsafe.getObject(t10, R), s(i15));
                        i16 += d10;
                    }
                    break;
                case 61:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.g(Q, (h) unsafe.getObject(t10, R));
                        i16 += d10;
                    }
                    break;
                case 62:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.V(Q, V(t10, R));
                        i16 += d10;
                    }
                    break;
                case 63:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.k(Q, V(t10, R));
                        i16 += d10;
                    }
                    break;
                case 64:
                    if (E(t10, Q, i15)) {
                        K = CodedOutputStream.K(Q, 0);
                        i16 += K;
                    }
                    break;
                case 65:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.M(Q, 0L);
                        i16 += d10;
                    }
                    break;
                case 66:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.O(Q, V(t10, R));
                        i16 += d10;
                    }
                    break;
                case 67:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.Q(Q, W(t10, R));
                        i16 += d10;
                    }
                    break;
                case 68:
                    if (E(t10, Q, i15)) {
                        d10 = CodedOutputStream.s(Q, (q0) unsafe.getObject(t10, R), s(i15));
                        i16 += d10;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        int v10 = i16 + v(this.f12450o, t10);
        if (this.f12441f) {
            return v10 + this.f12451p.c(t10).l();
        }
        return v10;
    }

    private int u(T t10) {
        int i10;
        int i11;
        int i12;
        int U;
        int W;
        Unsafe unsafe = f12435s;
        int i13 = 0;
        for (int i14 = 0; i14 < this.f12436a.length; i14 += 3) {
            int i02 = i0(i14);
            int h02 = h0(i02);
            int Q = Q(i14);
            long R = R(i02);
            if (h02 >= u.DOUBLE_LIST_PACKED.id() && h02 <= u.SINT64_LIST_PACKED.id()) {
                i10 = this.f12436a[i14 + 2] & 1048575;
            } else {
                i10 = 0;
            }
            switch (h02) {
                case 0:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.x(Q, p1.A(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.X(Q, p1.A(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.v(Q, p1.z(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (y(t10, i14)) {
                        Object C = p1.C(t10, R);
                        if (C instanceof h) {
                            i11 = CodedOutputStream.g(Q, (h) C);
                            break;
                        } else {
                            i11 = CodedOutputStream.S(Q, (String) C);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (y(t10, i14)) {
                        i11 = h1.o(Q, p1.C(t10, R), s(i14));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.g(Q, (h) p1.C(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.V(Q, p1.z(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.k(Q, p1.z(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.K(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.M(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.O(Q, p1.z(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.Q(Q, p1.A(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (y(t10, i14)) {
                        i11 = CodedOutputStream.s(Q, (q0) p1.C(t10, R), s(i14));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i11 = h1.h(Q, G(t10, R), false);
                    break;
                case 19:
                    i11 = h1.f(Q, G(t10, R), false);
                    break;
                case 20:
                    i11 = h1.m(Q, G(t10, R), false);
                    break;
                case 21:
                    i11 = h1.x(Q, G(t10, R), false);
                    break;
                case 22:
                    i11 = h1.k(Q, G(t10, R), false);
                    break;
                case 23:
                    i11 = h1.h(Q, G(t10, R), false);
                    break;
                case 24:
                    i11 = h1.f(Q, G(t10, R), false);
                    break;
                case 25:
                    i11 = h1.a(Q, G(t10, R), false);
                    break;
                case 26:
                    i11 = h1.u(Q, G(t10, R));
                    break;
                case 27:
                    i11 = h1.p(Q, G(t10, R), s(i14));
                    break;
                case 28:
                    i11 = h1.c(Q, G(t10, R));
                    break;
                case 29:
                    i11 = h1.v(Q, G(t10, R), false);
                    break;
                case 30:
                    i11 = h1.d(Q, G(t10, R), false);
                    break;
                case 31:
                    i11 = h1.f(Q, G(t10, R), false);
                    break;
                case 32:
                    i11 = h1.h(Q, G(t10, R), false);
                    break;
                case 33:
                    i11 = h1.q(Q, G(t10, R), false);
                    break;
                case 34:
                    i11 = h1.s(Q, G(t10, R), false);
                    break;
                case 35:
                    i12 = h1.i((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i12 = h1.g((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i12 = h1.n((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i12 = h1.y((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i12 = h1.l((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i12 = h1.i((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i12 = h1.g((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i12 = h1.b((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i12 = h1.w((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i12 = h1.e((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i12 = h1.g((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i12 = h1.i((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i12 = h1.r((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i12 = h1.t((List) unsafe.getObject(t10, R));
                    if (i12 > 0) {
                        if (this.f12444i) {
                            unsafe.putInt(t10, i10, i12);
                        }
                        U = CodedOutputStream.U(Q);
                        W = CodedOutputStream.W(i12);
                        i11 = U + W + i12;
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i11 = h1.j(Q, G(t10, R), s(i14));
                    break;
                case 50:
                    i11 = this.f12452q.f(Q, p1.C(t10, R), r(i14));
                    break;
                case 51:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.i(Q, 0.0d);
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.q(Q, 0.0f);
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.x(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.X(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.v(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.o(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.m(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.d(Q, true);
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (E(t10, Q, i14)) {
                        Object C2 = p1.C(t10, R);
                        if (C2 instanceof h) {
                            i11 = CodedOutputStream.g(Q, (h) C2);
                            break;
                        } else {
                            i11 = CodedOutputStream.S(Q, (String) C2);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (E(t10, Q, i14)) {
                        i11 = h1.o(Q, p1.C(t10, R), s(i14));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.g(Q, (h) p1.C(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 62:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.V(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.k(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.K(Q, 0);
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.M(Q, 0L);
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.O(Q, V(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.Q(Q, W(t10, R));
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (E(t10, Q, i14)) {
                        i11 = CodedOutputStream.s(Q, (q0) p1.C(t10, R), s(i14));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i13 += i11;
        }
        return i13 + v(this.f12450o, t10);
    }

    private <UT, UB> int v(l1<UT, UB> l1Var, T t10) {
        return l1Var.h(l1Var.g(t10));
    }

    private static <T> int w(T t10, long j10) {
        return p1.z(t10, j10);
    }

    private static boolean x(int i10) {
        if ((i10 & 536870912) != 0) {
            return true;
        }
        return false;
    }

    private boolean y(T t10, int i10) {
        int Y = Y(i10);
        long j10 = 1048575 & Y;
        if (j10 == 1048575) {
            int i02 = i0(i10);
            long R = R(i02);
            switch (h0(i02)) {
                case 0:
                    if (p1.x(t10, R) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (p1.y(t10, R) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (p1.A(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (p1.A(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (p1.A(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return p1.r(t10, R);
                case 8:
                    Object C = p1.C(t10, R);
                    if (C instanceof String) {
                        return !((String) C).isEmpty();
                    }
                    if (C instanceof h) {
                        return !h.f12293m.equals(C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (p1.C(t10, R) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !h.f12293m.equals(p1.C(t10, R));
                case 11:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (p1.A(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (p1.z(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (p1.A(t10, R) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (p1.C(t10, R) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((p1.z(t10, j10) & (1 << (Y >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private boolean z(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return y(t10, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.f1
    public void a(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f12436a.length; i10 += 3) {
            M(t10, t11, i10);
        }
        h1.G(this.f12450o, t10, t11);
        if (this.f12441f) {
            h1.E(this.f12451p, t10, t11);
        }
    }

    @Override // com.google.protobuf.f1
    public void b(T t10, s1 s1Var) throws IOException {
        if (s1Var.l() == s1.a.DESCENDING) {
            l0(t10, s1Var);
        } else if (this.f12443h) {
            k0(t10, s1Var);
        } else {
            j0(t10, s1Var);
        }
    }

    @Override // com.google.protobuf.f1
    public void c(T t10) {
        int i10;
        int i11 = this.f12446k;
        while (true) {
            i10 = this.f12447l;
            if (i11 >= i10) {
                break;
            }
            long R = R(i0(this.f12445j[i11]));
            Object C = p1.C(t10, R);
            if (C != null) {
                p1.R(t10, R, this.f12452q.b(C));
            }
            i11++;
        }
        int length = this.f12445j.length;
        while (i10 < length) {
            this.f12449n.c(t10, this.f12445j[i10]);
            i10++;
        }
        this.f12450o.j(t10);
        if (this.f12441f) {
            this.f12451p.f(t10);
        }
    }

    @Override // com.google.protobuf.f1
    public final boolean d(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f12446k) {
            int i15 = this.f12445j[i14];
            int Q = Q(i15);
            int i02 = i0(i15);
            int i16 = this.f12436a[i15 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i12) {
                if (i17 != 1048575) {
                    i13 = f12435s.getInt(t10, i17);
                }
                i11 = i13;
                i10 = i17;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (F(i02) && !z(t10, i15, i10, i11, i18)) {
                return false;
            }
            int h02 = h0(i02);
            if (h02 != 9 && h02 != 17) {
                if (h02 != 27) {
                    if (h02 != 60 && h02 != 68) {
                        if (h02 != 49) {
                            if (h02 == 50 && !C(t10, i02, i15)) {
                                return false;
                            }
                        }
                    } else if (E(t10, Q, i15) && !A(t10, i02, s(i15))) {
                        return false;
                    }
                }
                if (!B(t10, i02, i15)) {
                    return false;
                }
            } else if (z(t10, i15, i10, i11, i18) && !A(t10, i02, s(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.f12441f && !this.f12451p.c(t10).p()) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.f1
    public void e(T t10, e1 e1Var, o oVar) throws IOException {
        oVar.getClass();
        I(this.f12450o, this.f12451p, t10, e1Var, oVar);
    }

    @Override // com.google.protobuf.f1
    public boolean f(T t10, T t11) {
        int length = this.f12436a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!m(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f12450o.g(t10).equals(this.f12450o.g(t11))) {
            return false;
        }
        if (this.f12441f) {
            return this.f12451p.c(t10).equals(this.f12451p.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.f1
    public int g(T t10) {
        if (this.f12443h) {
            return u(t10);
        }
        return t(t10);
    }

    @Override // com.google.protobuf.f1
    public T h() {
        return (T) this.f12448m.a(this.f12440e);
    }

    @Override // com.google.protobuf.f1
    public int i(T t10) {
        int i10;
        int f10;
        int length = this.f12436a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int i02 = i0(i12);
            int Q = Q(i12);
            long R = R(i02);
            int i13 = 37;
            switch (h0(i02)) {
                case 0:
                    i10 = i11 * 53;
                    f10 = z.f(Double.doubleToLongBits(p1.x(t10, R)));
                    i11 = i10 + f10;
                    break;
                case 1:
                    i10 = i11 * 53;
                    f10 = Float.floatToIntBits(p1.y(t10, R));
                    i11 = i10 + f10;
                    break;
                case 2:
                    i10 = i11 * 53;
                    f10 = z.f(p1.A(t10, R));
                    i11 = i10 + f10;
                    break;
                case 3:
                    i10 = i11 * 53;
                    f10 = z.f(p1.A(t10, R));
                    i11 = i10 + f10;
                    break;
                case 4:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 5:
                    i10 = i11 * 53;
                    f10 = z.f(p1.A(t10, R));
                    i11 = i10 + f10;
                    break;
                case 6:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 7:
                    i10 = i11 * 53;
                    f10 = z.c(p1.r(t10, R));
                    i11 = i10 + f10;
                    break;
                case 8:
                    i10 = i11 * 53;
                    f10 = ((String) p1.C(t10, R)).hashCode();
                    i11 = i10 + f10;
                    break;
                case 9:
                    Object C = p1.C(t10, R);
                    if (C != null) {
                        i13 = C.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 10:
                    i10 = i11 * 53;
                    f10 = p1.C(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 11:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 12:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 13:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 14:
                    i10 = i11 * 53;
                    f10 = z.f(p1.A(t10, R));
                    i11 = i10 + f10;
                    break;
                case 15:
                    i10 = i11 * 53;
                    f10 = p1.z(t10, R);
                    i11 = i10 + f10;
                    break;
                case 16:
                    i10 = i11 * 53;
                    f10 = z.f(p1.A(t10, R));
                    i11 = i10 + f10;
                    break;
                case 17:
                    Object C2 = p1.C(t10, R);
                    if (C2 != null) {
                        i13 = C2.hashCode();
                    }
                    i11 = (i11 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    f10 = p1.C(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 50:
                    i10 = i11 * 53;
                    f10 = p1.C(t10, R).hashCode();
                    i11 = i10 + f10;
                    break;
                case 51:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(Double.doubleToLongBits(T(t10, R)));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = Float.floatToIntBits(U(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.c(S(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = ((String) p1.C(t10, R)).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = p1.C(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = p1.C(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = V(t10, R);
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = z.f(W(t10, R));
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, Q, i12)) {
                        i10 = i11 * 53;
                        f10 = p1.C(t10, R).hashCode();
                        i11 = i10 + f10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.f12450o.g(t10).hashCode();
        if (this.f12441f) {
            return (hashCode * 53) + this.f12451p.c(t10).hashCode();
        }
        return hashCode;
    }
}
