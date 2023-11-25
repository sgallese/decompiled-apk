package com.google.protobuf;

import com.google.protobuf.r1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodedInputStreamReader.java */
/* loaded from: classes3.dex */
public final class j implements e1 {

    /* renamed from: a  reason: collision with root package name */
    private final i f12350a;

    /* renamed from: b  reason: collision with root package name */
    private int f12351b;

    /* renamed from: c  reason: collision with root package name */
    private int f12352c;

    /* renamed from: d  reason: collision with root package name */
    private int f12353d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodedInputStreamReader.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12354a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f12354a = iArr;
            try {
                iArr[r1.b.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12354a[r1.b.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12354a[r1.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12354a[r1.b.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12354a[r1.b.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12354a[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12354a[r1.b.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12354a[r1.b.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12354a[r1.b.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12354a[r1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12354a[r1.b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12354a[r1.b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12354a[r1.b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12354a[r1.b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12354a[r1.b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12354a[r1.b.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12354a[r1.b.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private j(i iVar) {
        i iVar2 = (i) z.b(iVar, "input");
        this.f12350a = iVar2;
        iVar2.f12315d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f12315d;
        if (jVar != null) {
            return jVar;
        }
        return new j(iVar);
    }

    private Object R(r1.b bVar, Class<?> cls, o oVar) throws IOException {
        switch (a.f12354a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(j());
            case 2:
                return G();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(t());
            case 5:
                return Integer.valueOf(i());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(I());
            case 9:
                return Long.valueOf(N());
            case 10:
                return h(cls, oVar);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(l());
            case 13:
                return Integer.valueOf(w());
            case 14:
                return Long.valueOf(x());
            case 15:
                return O();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(f1<T> f1Var, o oVar) throws IOException {
        int i10 = this.f12352c;
        this.f12352c = r1.c(r1.a(this.f12351b), 4);
        try {
            T h10 = f1Var.h();
            f1Var.e(h10, this, oVar);
            f1Var.c(h10);
            if (this.f12351b == this.f12352c) {
                return h10;
            }
            throw InvalidProtocolBufferException.h();
        } finally {
            this.f12352c = i10;
        }
    }

    private <T> T T(f1<T> f1Var, o oVar) throws IOException {
        int A = this.f12350a.A();
        i iVar = this.f12350a;
        if (iVar.f12312a < iVar.f12313b) {
            int j10 = iVar.j(A);
            T h10 = f1Var.h();
            this.f12350a.f12312a++;
            f1Var.e(h10, this, oVar);
            f1Var.c(h10);
            this.f12350a.a(0);
            r5.f12312a--;
            this.f12350a.i(j10);
            return h10;
        }
        throw InvalidProtocolBufferException.i();
    }

    private void V(int i10) throws IOException {
        if (this.f12350a.d() == i10) {
            return;
        }
        throw InvalidProtocolBufferException.k();
    }

    private void W(int i10) throws IOException {
        if (r1.b(this.f12351b) == i10) {
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    private void X(int i10) throws IOException {
        if ((i10 & 3) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    private void Y(int i10) throws IOException {
        if ((i10 & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    @Override // com.google.protobuf.e1
    public <T> T A(Class<T> cls, o oVar) throws IOException {
        W(3);
        return (T) S(b1.a().d(cls), oVar);
    }

    @Override // com.google.protobuf.e1
    public int B() throws IOException {
        int i10 = this.f12353d;
        if (i10 != 0) {
            this.f12351b = i10;
            this.f12353d = 0;
        } else {
            this.f12351b = this.f12350a.z();
        }
        int i11 = this.f12351b;
        if (i11 != 0 && i11 != this.f12352c) {
            return r1.a(i11);
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.e1
    public void C(List<String> list) throws IOException {
        U(list, false);
    }

    @Override // com.google.protobuf.e1
    public <T> T D(f1<T> f1Var, o oVar) throws IOException {
        W(2);
        return (T) T(f1Var, oVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <K, V> void E(java.util.Map<K, V> r8, com.google.protobuf.j0.a<K, V> r9, com.google.protobuf.o r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            com.google.protobuf.i r1 = r7.f12350a
            int r1 = r1.A()
            com.google.protobuf.i r2 = r7.f12350a
            int r1 = r2.j(r1)
            K r2 = r9.f12359b
            V r3 = r9.f12361d
        L14:
            int r4 = r7.B()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            com.google.protobuf.i r5 = r7.f12350a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.J()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            com.google.protobuf.r1$b r4 = r9.f12360c     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f12361d     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            com.google.protobuf.r1$b r4 = r9.f12358a     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.J()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            com.google.protobuf.i r8 = r7.f12350a
            r8.i(r1)
            return
        L65:
            r8 = move-exception
            com.google.protobuf.i r9 = r7.f12350a
            r9.i(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.E(java.util.Map, com.google.protobuf.j0$a, com.google.protobuf.o):void");
    }

    @Override // com.google.protobuf.e1
    public void F(List<String> list) throws IOException {
        U(list, true);
    }

    @Override // com.google.protobuf.e1
    public h G() throws IOException {
        W(2);
        return this.f12350a.l();
    }

    @Override // com.google.protobuf.e1
    public void H(List<Float> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof v) {
            v vVar = (v) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    vVar.g(this.f12350a.q());
                    if (this.f12350a.e()) {
                        return;
                    }
                    z11 = this.f12350a.z();
                } while (z11 == this.f12351b);
                this.f12353d = z11;
                return;
            }
            int A = this.f12350a.A();
            X(A);
            int d10 = this.f12350a.d() + A;
            do {
                vVar.g(this.f12350a.q());
            } while (this.f12350a.d() < d10);
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 2) {
            if (b11 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f12350a.q()));
                if (this.f12350a.e()) {
                    return;
                }
                z10 = this.f12350a.z();
            } while (z10 == this.f12351b);
            this.f12353d = z10;
            return;
        }
        int A2 = this.f12350a.A();
        X(A2);
        int d11 = this.f12350a.d() + A2;
        do {
            list.add(Float.valueOf(this.f12350a.q()));
        } while (this.f12350a.d() < d11);
    }

    @Override // com.google.protobuf.e1
    public int I() throws IOException {
        W(0);
        return this.f12350a.r();
    }

    @Override // com.google.protobuf.e1
    public boolean J() throws IOException {
        int i10;
        if (!this.f12350a.e() && (i10 = this.f12351b) != this.f12352c) {
            return this.f12350a.C(i10);
        }
        return false;
    }

    @Override // com.google.protobuf.e1
    public int K() throws IOException {
        W(5);
        return this.f12350a.t();
    }

    @Override // com.google.protobuf.e1
    public void L(List<h> list) throws IOException {
        int z10;
        if (r1.b(this.f12351b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(G());
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public void M(List<Double> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof l) {
            l lVar = (l) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 1) {
                if (b10 == 2) {
                    int A = this.f12350a.A();
                    Y(A);
                    int d10 = this.f12350a.d() + A;
                    do {
                        lVar.g(this.f12350a.m());
                    } while (this.f12350a.d() < d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                lVar.g(this.f12350a.m());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 1) {
            if (b11 == 2) {
                int A2 = this.f12350a.A();
                Y(A2);
                int d11 = this.f12350a.d() + A2;
                do {
                    list.add(Double.valueOf(this.f12350a.m()));
                } while (this.f12350a.d() < d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Double.valueOf(this.f12350a.m()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public long N() throws IOException {
        W(0);
        return this.f12350a.s();
    }

    @Override // com.google.protobuf.e1
    public String O() throws IOException {
        W(2);
        return this.f12350a.y();
    }

    @Override // com.google.protobuf.e1
    public void P(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 1) {
                if (b10 == 2) {
                    int A = this.f12350a.A();
                    Y(A);
                    int d10 = this.f12350a.d() + A;
                    do {
                        h0Var.h(this.f12350a.p());
                    } while (this.f12350a.d() < d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                h0Var.h(this.f12350a.p());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 1) {
            if (b11 == 2) {
                int A2 = this.f12350a.A();
                Y(A2);
                int d11 = this.f12350a.d() + A2;
                do {
                    list.add(Long.valueOf(this.f12350a.p()));
                } while (this.f12350a.d() < d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.f12350a.p()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    public void U(List<String> list, boolean z10) throws IOException {
        String z11;
        int z12;
        int z13;
        if (r1.b(this.f12351b) == 2) {
            if ((list instanceof f0) && !z10) {
                f0 f0Var = (f0) list;
                do {
                    f0Var.d(G());
                    if (this.f12350a.e()) {
                        return;
                    }
                    z13 = this.f12350a.z();
                } while (z13 == this.f12351b);
                this.f12353d = z13;
                return;
            }
            do {
                if (z10) {
                    z11 = O();
                } else {
                    z11 = z();
                }
                list.add(z11);
                if (this.f12350a.e()) {
                    return;
                }
                z12 = this.f12350a.z();
            } while (z12 == this.f12351b);
            this.f12353d = z12;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.e1
    public void a(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        yVar.q(this.f12350a.v());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                yVar.q(this.f12350a.v());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Integer.valueOf(this.f12350a.v()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.f12350a.v()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public long b() throws IOException {
        W(0);
        return this.f12350a.B();
    }

    @Override // com.google.protobuf.e1
    public long c() throws IOException {
        W(1);
        return this.f12350a.p();
    }

    @Override // com.google.protobuf.e1
    public void d(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(this.f12350a.t());
                    if (this.f12350a.e()) {
                        return;
                    }
                    z11 = this.f12350a.z();
                } while (z11 == this.f12351b);
                this.f12353d = z11;
                return;
            }
            int A = this.f12350a.A();
            X(A);
            int d10 = this.f12350a.d() + A;
            do {
                yVar.q(this.f12350a.t());
            } while (this.f12350a.d() < d10);
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 2) {
            if (b11 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f12350a.t()));
                if (this.f12350a.e()) {
                    return;
                }
                z10 = this.f12350a.z();
            } while (z10 == this.f12351b);
            this.f12353d = z10;
            return;
        }
        int A2 = this.f12350a.A();
        X(A2);
        int d11 = this.f12350a.d() + A2;
        do {
            list.add(Integer.valueOf(this.f12350a.t()));
        } while (this.f12350a.d() < d11);
    }

    @Override // com.google.protobuf.e1
    public void e(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        h0Var.h(this.f12350a.w());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                h0Var.h(this.f12350a.w());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Long.valueOf(this.f12350a.w()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.f12350a.w()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e1
    public <T> void f(List<T> list, f1<T> f1Var, o oVar) throws IOException {
        int z10;
        if (r1.b(this.f12351b) == 3) {
            int i10 = this.f12351b;
            do {
                list.add(S(f1Var, oVar));
                if (!this.f12350a.e() && this.f12353d == 0) {
                    z10 = this.f12350a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f12353d = z10;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.e1
    public void g(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        yVar.q(this.f12350a.A());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                yVar.q(this.f12350a.A());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Integer.valueOf(this.f12350a.A()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.f12350a.A()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public <T> T h(Class<T> cls, o oVar) throws IOException {
        W(2);
        return (T) T(b1.a().d(cls), oVar);
    }

    @Override // com.google.protobuf.e1
    public int i() throws IOException {
        W(5);
        return this.f12350a.o();
    }

    @Override // com.google.protobuf.e1
    public boolean j() throws IOException {
        W(0);
        return this.f12350a.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e1
    public <T> void k(List<T> list, f1<T> f1Var, o oVar) throws IOException {
        int z10;
        if (r1.b(this.f12351b) == 2) {
            int i10 = this.f12351b;
            do {
                list.add(T(f1Var, oVar));
                if (!this.f12350a.e() && this.f12353d == 0) {
                    z10 = this.f12350a.z();
                } else {
                    return;
                }
            } while (z10 == i10);
            this.f12353d = z10;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    @Override // com.google.protobuf.e1
    public long l() throws IOException {
        W(1);
        return this.f12350a.u();
    }

    @Override // com.google.protobuf.e1
    public void m(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        h0Var.h(this.f12350a.B());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                h0Var.h(this.f12350a.B());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Long.valueOf(this.f12350a.B()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.f12350a.B()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public <T> T n(f1<T> f1Var, o oVar) throws IOException {
        W(3);
        return (T) S(f1Var, oVar);
    }

    @Override // com.google.protobuf.e1
    public int o() throws IOException {
        W(0);
        return this.f12350a.A();
    }

    @Override // com.google.protobuf.e1
    public void p(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        h0Var.h(this.f12350a.s());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                h0Var.h(this.f12350a.s());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Long.valueOf(this.f12350a.s()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.f12350a.s()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public void q(List<Long> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 1) {
                if (b10 == 2) {
                    int A = this.f12350a.A();
                    Y(A);
                    int d10 = this.f12350a.d() + A;
                    do {
                        h0Var.h(this.f12350a.u());
                    } while (this.f12350a.d() < d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                h0Var.h(this.f12350a.u());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 1) {
            if (b11 == 2) {
                int A2 = this.f12350a.A();
                Y(A2);
                int d11 = this.f12350a.d() + A2;
                do {
                    list.add(Long.valueOf(this.f12350a.u()));
                } while (this.f12350a.d() < d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Long.valueOf(this.f12350a.u()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public void r(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        yVar.q(this.f12350a.r());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                yVar.q(this.f12350a.r());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Integer.valueOf(this.f12350a.r()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.f12350a.r()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public double readDouble() throws IOException {
        W(1);
        return this.f12350a.m();
    }

    @Override // com.google.protobuf.e1
    public float readFloat() throws IOException {
        W(5);
        return this.f12350a.q();
    }

    @Override // com.google.protobuf.e1
    public void s(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        yVar.q(this.f12350a.n());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                yVar.q(this.f12350a.n());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Integer.valueOf(this.f12350a.n()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Integer.valueOf(this.f12350a.n()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public int t() throws IOException {
        W(0);
        return this.f12350a.n();
    }

    @Override // com.google.protobuf.e1
    public int u() {
        return this.f12351b;
    }

    @Override // com.google.protobuf.e1
    public void v(List<Integer> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof y) {
            y yVar = (y) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 2) {
                if (b10 != 5) {
                    throw InvalidProtocolBufferException.e();
                }
                do {
                    yVar.q(this.f12350a.o());
                    if (this.f12350a.e()) {
                        return;
                    }
                    z11 = this.f12350a.z();
                } while (z11 == this.f12351b);
                this.f12353d = z11;
                return;
            }
            int A = this.f12350a.A();
            X(A);
            int d10 = this.f12350a.d() + A;
            do {
                yVar.q(this.f12350a.o());
            } while (this.f12350a.d() < d10);
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 2) {
            if (b11 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f12350a.o()));
                if (this.f12350a.e()) {
                    return;
                }
                z10 = this.f12350a.z();
            } while (z10 == this.f12351b);
            this.f12353d = z10;
            return;
        }
        int A2 = this.f12350a.A();
        X(A2);
        int d11 = this.f12350a.d() + A2;
        do {
            list.add(Integer.valueOf(this.f12350a.o()));
        } while (this.f12350a.d() < d11);
    }

    @Override // com.google.protobuf.e1
    public int w() throws IOException {
        W(0);
        return this.f12350a.v();
    }

    @Override // com.google.protobuf.e1
    public long x() throws IOException {
        W(0);
        return this.f12350a.w();
    }

    @Override // com.google.protobuf.e1
    public void y(List<Boolean> list) throws IOException {
        int z10;
        int z11;
        if (list instanceof f) {
            f fVar = (f) list;
            int b10 = r1.b(this.f12351b);
            if (b10 != 0) {
                if (b10 == 2) {
                    int d10 = this.f12350a.d() + this.f12350a.A();
                    do {
                        fVar.h(this.f12350a.k());
                    } while (this.f12350a.d() < d10);
                    V(d10);
                    return;
                }
                throw InvalidProtocolBufferException.e();
            }
            do {
                fVar.h(this.f12350a.k());
                if (this.f12350a.e()) {
                    return;
                }
                z11 = this.f12350a.z();
            } while (z11 == this.f12351b);
            this.f12353d = z11;
            return;
        }
        int b11 = r1.b(this.f12351b);
        if (b11 != 0) {
            if (b11 == 2) {
                int d11 = this.f12350a.d() + this.f12350a.A();
                do {
                    list.add(Boolean.valueOf(this.f12350a.k()));
                } while (this.f12350a.d() < d11);
                V(d11);
                return;
            }
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(Boolean.valueOf(this.f12350a.k()));
            if (this.f12350a.e()) {
                return;
            }
            z10 = this.f12350a.z();
        } while (z10 == this.f12351b);
        this.f12353d = z10;
    }

    @Override // com.google.protobuf.e1
    public String z() throws IOException {
        W(2);
        return this.f12350a.x();
    }
}
