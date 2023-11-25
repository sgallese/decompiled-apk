package com.google.protobuf;

import com.google.protobuf.t;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: SchemaUtil.java */
/* loaded from: classes3.dex */
final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f12308a = B();

    /* renamed from: b  reason: collision with root package name */
    private static final l1<?, ?> f12309b = C(false);

    /* renamed from: c  reason: collision with root package name */
    private static final l1<?, ?> f12310c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final l1<?, ?> f12311d = new n1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i10, List<Integer> list, z.e eVar, UB ub2, l1<UT, UB> l1Var) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, l1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub2 = (UB) L(i10, intValue2, ub2, l1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static l1<?, ?> C(boolean z10) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (l1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t10, T t11) {
        t<FT> c10 = pVar.c(t11);
        if (!c10.n()) {
            pVar.d(t10).u(c10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(l0 l0Var, T t10, T t11, long j10) {
        p1.R(t10, j10, l0Var.a(p1.C(t10, j10), p1.C(t11, j10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(l1<UT, UB> l1Var, T t10, T t11) {
        l1Var.p(t10, l1Var.k(l1Var.g(t10), l1Var.g(t11)));
    }

    public static l1<?, ?> H() {
        return f12309b;
    }

    public static l1<?, ?> I() {
        return f12310c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && (cls2 = f12308a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(int i10, int i11, UB ub2, l1<UT, UB> l1Var) {
        if (ub2 == null) {
            ub2 = l1Var.n();
        }
        l1Var.e(ub2, i10, i11);
        return ub2;
    }

    public static l1<?, ?> M() {
        return f12311d;
    }

    public static void N(int i10, List<Boolean> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.B(i10, list, z10);
        }
    }

    public static void O(int i10, List<h> list, s1 s1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.O(i10, list);
        }
    }

    public static void P(int i10, List<Double> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.M(i10, list, z10);
        }
    }

    public static void Q(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.L(i10, list, z10);
        }
    }

    public static void R(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.A(i10, list, z10);
        }
    }

    public static void S(int i10, List<Long> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.x(i10, list, z10);
        }
    }

    public static void T(int i10, List<Float> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.c(i10, list, z10);
        }
    }

    public static void U(int i10, List<?> list, s1 s1Var, f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.b(i10, list, f1Var);
        }
    }

    public static void V(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.p(i10, list, z10);
        }
    }

    public static void W(int i10, List<Long> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.K(i10, list, z10);
        }
    }

    public static void X(int i10, List<?> list, s1 s1Var, f1 f1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.a(i10, list, f1Var);
        }
    }

    public static void Y(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.y(i10, list, z10);
        }
    }

    public static void Z(int i10, List<Long> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.h(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i10, true);
    }

    public static void a0(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.I(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<Long> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.E(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * CodedOutputStream.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            U += CodedOutputStream.h(list.get(i11));
        }
        return U;
    }

    public static void c0(int i10, List<String> list, s1 s1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.m(i10, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(e10);
        }
        return e10 + (size * CodedOutputStream.U(i10));
    }

    public static void d0(int i10, List<Integer> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.D(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.l(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void e0(int i10, List<Long> list, s1 s1Var, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.i(i10, list, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i10, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i10, List<q0> list, f1 f1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.s(i10, list.get(i12), f1Var);
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(l10);
        }
        return l10 + (size * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.w(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(n10);
        }
        return n10 + (list.size() * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.y(h0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i10, Object obj, f1 f1Var) {
        if (obj instanceof d0) {
            return CodedOutputStream.A(i10, (d0) obj);
        }
        return CodedOutputStream.F(i10, (q0) obj, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i10, List<?> list, f1 f1Var) {
        int H;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof d0) {
                H = CodedOutputStream.B((d0) obj);
            } else {
                H = CodedOutputStream.H((q0) obj, f1Var);
            }
            U += H;
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(r10);
        }
        return r10 + (size * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.P(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.P(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(t10);
        }
        return t10 + (size * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.R(h0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.R(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i10, List<?> list) {
        int T;
        int T2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int U = CodedOutputStream.U(i10) * size;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i11 < size) {
                Object J0 = f0Var.J0(i11);
                if (J0 instanceof h) {
                    T2 = CodedOutputStream.h((h) J0);
                } else {
                    T2 = CodedOutputStream.T((String) J0);
                }
                U += T2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof h) {
                    T = CodedOutputStream.h((h) obj);
                } else {
                    T = CodedOutputStream.T((String) obj);
                }
                U += T;
                i11++;
            }
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(w10);
        }
        return w10 + (size * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof y) {
            y yVar = (y) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.W(yVar.getInt(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.W(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(y10);
        }
        return y10 + (size * CodedOutputStream.U(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Y(h0Var.k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += CodedOutputStream.Y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i10, List<Integer> list, z.d<?> dVar, UB ub2, l1<UT, UB> l1Var) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) L(i10, intValue, ub2, l1Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub2 = (UB) L(i10, intValue2, ub2, l1Var);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
