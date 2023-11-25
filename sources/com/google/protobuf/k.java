package com.google.protobuf;

import com.google.protobuf.j0;
import com.google.protobuf.r1;
import com.google.protobuf.s1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedOutputStreamWriter.java */
/* loaded from: classes3.dex */
public final class k implements s1 {

    /* renamed from: a  reason: collision with root package name */
    private final CodedOutputStream f12367a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedOutputStreamWriter.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12368a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f12368a = iArr;
            try {
                iArr[r1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12368a[r1.b.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12368a[r1.b.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12368a[r1.b.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12368a[r1.b.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12368a[r1.b.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12368a[r1.b.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12368a[r1.b.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12368a[r1.b.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12368a[r1.b.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12368a[r1.b.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12368a[r1.b.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) z.b(codedOutputStream, "output");
        this.f12367a = codedOutputStream2;
        codedOutputStream2.f12244a = this;
    }

    public static k P(CodedOutputStream codedOutputStream) {
        k kVar = codedOutputStream.f12244a;
        if (kVar != null) {
            return kVar;
        }
        return new k(codedOutputStream);
    }

    private <V> void Q(int i10, boolean z10, V v10, j0.a<Boolean, V> aVar) throws IOException {
        this.f12367a.T0(i10, 2);
        this.f12367a.V0(j0.b(aVar, Boolean.valueOf(z10), v10));
        j0.e(this.f12367a, aVar, Boolean.valueOf(z10), v10);
    }

    private <V> void R(int i10, j0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f12367a.T0(i10, 2);
            this.f12367a.V0(j0.b(aVar, Integer.valueOf(i13), v10));
            j0.e(this.f12367a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, j0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f12367a.T0(i10, 2);
            this.f12367a.V0(j0.b(aVar, Long.valueOf(j10), v10));
            j0.e(this.f12367a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <K, V> void T(int i10, j0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f12368a[aVar.f12358a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f12358a);
        }
    }

    private <V> void U(int i10, j0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f12367a.T0(i10, 2);
            this.f12367a.V0(j0.b(aVar, str, v10));
            j0.e(this.f12367a, aVar, str, v10);
        }
    }

    private void V(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f12367a.R0(i10, (String) obj);
        } else {
            this.f12367a.l0(i10, (h) obj);
        }
    }

    @Override // com.google.protobuf.s1
    public void A(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.n(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.s0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.r0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void B(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.e(list.get(i13).booleanValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.i0(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.h0(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public <K, V> void C(int i10, j0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f12367a.c0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f12367a.T0(i10, 2);
            this.f12367a.V0(j0.b(aVar, entry.getKey(), entry.getValue()));
            j0.e(this.f12367a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.s1
    public void D(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.W(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.V0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.U0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void E(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.R(list.get(i13).longValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.Q0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.P0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void F(int i10, long j10) throws IOException {
        this.f12367a.P0(i10, j10);
    }

    @Override // com.google.protobuf.s1
    public void G(int i10, float f10) throws IOException {
        this.f12367a.v0(i10, f10);
    }

    @Override // com.google.protobuf.s1
    public void H(int i10) throws IOException {
        this.f12367a.T0(i10, 4);
    }

    @Override // com.google.protobuf.s1
    public void I(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.P(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.O0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.N0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void J(int i10, int i11) throws IOException {
        this.f12367a.p0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public void K(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.y(list.get(i13).longValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.E0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.D0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void L(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.l(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.q0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.p0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void M(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.j(list.get(i13).doubleValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.o0(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.n0(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void N(int i10, int i11) throws IOException {
        this.f12367a.N0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public void O(int i10, List<h> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f12367a.l0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.s1
    public void a(int i10, List<?> list, f1 f1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            j(i10, list.get(i11), f1Var);
        }
    }

    @Override // com.google.protobuf.s1
    public void b(int i10, List<?> list, f1 f1Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            s(i10, list.get(i11), f1Var);
        }
    }

    @Override // com.google.protobuf.s1
    public void c(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.r(list.get(i13).floatValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.w0(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.v0(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void d(int i10, int i11) throws IOException {
        this.f12367a.U0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public final void e(int i10, Object obj) throws IOException {
        if (obj instanceof h) {
            this.f12367a.I0(i10, (h) obj);
        } else {
            this.f12367a.H0(i10, (q0) obj);
        }
    }

    @Override // com.google.protobuf.s1
    public void f(int i10, int i11) throws IOException {
        this.f12367a.r0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public void g(int i10, double d10) throws IOException {
        this.f12367a.n0(i10, d10);
    }

    @Override // com.google.protobuf.s1
    public void h(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.N(list.get(i13).longValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.M0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.L0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void i(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.Y(list.get(i13).longValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.X0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.W0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void j(int i10, Object obj, f1 f1Var) throws IOException {
        this.f12367a.F0(i10, (q0) obj, f1Var);
    }

    @Override // com.google.protobuf.s1
    public void k(int i10, long j10) throws IOException {
        this.f12367a.t0(i10, j10);
    }

    @Override // com.google.protobuf.s1
    public s1.a l() {
        return s1.a.ASCENDING;
    }

    @Override // com.google.protobuf.s1
    public void m(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (list instanceof f0) {
            f0 f0Var = (f0) list;
            while (i11 < list.size()) {
                V(i10, f0Var.J0(i11));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.R0(i10, list.get(i11));
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void n(int i10, String str) throws IOException {
        this.f12367a.R0(i10, str);
    }

    @Override // com.google.protobuf.s1
    public void o(int i10, long j10) throws IOException {
        this.f12367a.W0(i10, j10);
    }

    @Override // com.google.protobuf.s1
    public void p(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.w(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.C0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.B0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void q(int i10, long j10) throws IOException {
        this.f12367a.D0(i10, j10);
    }

    @Override // com.google.protobuf.s1
    public void r(int i10, boolean z10) throws IOException {
        this.f12367a.h0(i10, z10);
    }

    @Override // com.google.protobuf.s1
    public void s(int i10, Object obj, f1 f1Var) throws IOException {
        this.f12367a.y0(i10, (q0) obj, f1Var);
    }

    @Override // com.google.protobuf.s1
    public void t(int i10, int i11) throws IOException {
        this.f12367a.J0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public void u(int i10) throws IOException {
        this.f12367a.T0(i10, 3);
    }

    @Override // com.google.protobuf.s1
    public void v(int i10, h hVar) throws IOException {
        this.f12367a.l0(i10, hVar);
    }

    @Override // com.google.protobuf.s1
    public void w(int i10, int i11) throws IOException {
        this.f12367a.B0(i10, i11);
    }

    @Override // com.google.protobuf.s1
    public void x(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.p(list.get(i13).longValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.u0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.t0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void y(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (z10) {
            this.f12367a.T0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += CodedOutputStream.L(list.get(i13).intValue());
            }
            this.f12367a.V0(i12);
            while (i11 < list.size()) {
                this.f12367a.K0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f12367a.J0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s1
    public void z(int i10, long j10) throws IOException {
        this.f12367a.L0(i10, j10);
    }
}
