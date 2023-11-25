package com.google.protobuf;

import com.google.protobuf.r1;
import com.google.protobuf.x;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: ExtensionSchemaLite.java */
/* loaded from: classes3.dex */
final class q extends p<x.d> {

    /* compiled from: ExtensionSchemaLite.java */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12420a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f12420a = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12420a[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12420a[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12420a[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12420a[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12420a[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12420a[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12420a[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12420a[r1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12420a[r1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12420a[r1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12420a[r1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12420a[r1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12420a[r1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12420a[r1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12420a[r1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12420a[r1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12420a[r1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).getNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public Object b(o oVar, q0 q0Var, int i10) {
        return oVar.a(q0Var, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public t<x.d> d(Object obj) {
        return ((x.c) obj).Q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public boolean e(q0 q0Var) {
        return q0Var instanceof x.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void f(Object obj) {
        c(obj).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public <UT, UB> UB g(e1 e1Var, Object obj, o oVar, t<x.d> tVar, UB ub2, l1<UT, UB> l1Var) throws IOException {
        Object valueOf;
        Object i10;
        ArrayList arrayList;
        x.e eVar = (x.e) obj;
        int c10 = eVar.c();
        if (eVar.f12474b.a() && eVar.f12474b.isPacked()) {
            switch (a.f12420a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    e1Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e1Var.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e1Var.p(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e1Var.m(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e1Var.r(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e1Var.P(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e1Var.v(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    e1Var.y(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    e1Var.g(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    e1Var.d(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    e1Var.q(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e1Var.a(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e1Var.e(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e1Var.s(arrayList);
                    ub2 = (UB) h1.z(c10, arrayList, eVar.f12474b.d(), ub2, l1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f12474b.c());
            }
            tVar.x(eVar.f12474b, arrayList);
        } else {
            if (eVar.a() == r1.b.ENUM) {
                int I = e1Var.I();
                if (eVar.f12474b.d().a(I) == null) {
                    return (UB) h1.L(c10, I, ub2, l1Var);
                }
                valueOf = Integer.valueOf(I);
            } else {
                switch (a.f12420a[eVar.a().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(e1Var.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(e1Var.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(e1Var.N());
                        break;
                    case 4:
                        valueOf = Long.valueOf(e1Var.b());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(e1Var.I());
                        break;
                    case 6:
                        valueOf = Long.valueOf(e1Var.c());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(e1Var.i());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(e1Var.j());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(e1Var.o());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(e1Var.K());
                        break;
                    case 11:
                        valueOf = Long.valueOf(e1Var.l());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(e1Var.w());
                        break;
                    case 13:
                        valueOf = Long.valueOf(e1Var.x());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = e1Var.G();
                        break;
                    case 16:
                        valueOf = e1Var.z();
                        break;
                    case 17:
                        valueOf = e1Var.A(eVar.b().getClass(), oVar);
                        break;
                    case 18:
                        valueOf = e1Var.h(eVar.b().getClass(), oVar);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (eVar.d()) {
                tVar.a(eVar.f12474b, valueOf);
            } else {
                int i11 = a.f12420a[eVar.a().ordinal()];
                if ((i11 == 17 || i11 == 18) && (i10 = tVar.i(eVar.f12474b)) != null) {
                    valueOf = z.h(i10, valueOf);
                }
                tVar.x(eVar.f12474b, valueOf);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void h(e1 e1Var, Object obj, o oVar, t<x.d> tVar) throws IOException {
        x.e eVar = (x.e) obj;
        tVar.x(eVar.f12474b, e1Var.h(eVar.b().getClass(), oVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void i(h hVar, Object obj, o oVar, t<x.d> tVar) throws IOException {
        x.e eVar = (x.e) obj;
        q0 x10 = eVar.b().n().x();
        e Q = e.Q(ByteBuffer.wrap(hVar.t()), true);
        b1.a().b(x10, Q, oVar);
        tVar.x(eVar.f12474b, x10);
        if (Q.B() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.protobuf.p
    public void j(s1 s1Var, Map.Entry<?, ?> entry) throws IOException {
        x.d dVar = (x.d) entry.getKey();
        if (dVar.a()) {
            switch (a.f12420a[dVar.c().ordinal()]) {
                case 1:
                    h1.P(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 2:
                    h1.T(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 3:
                    h1.W(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 4:
                    h1.e0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 5:
                    h1.V(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 6:
                    h1.S(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 7:
                    h1.R(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 8:
                    h1.N(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 9:
                    h1.d0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 10:
                    h1.Y(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 11:
                    h1.Z(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 12:
                    h1.a0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 13:
                    h1.b0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 14:
                    h1.V(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 15:
                    h1.O(dVar.getNumber(), (List) entry.getValue(), s1Var);
                    return;
                case 16:
                    h1.c0(dVar.getNumber(), (List) entry.getValue(), s1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        h1.U(dVar.getNumber(), (List) entry.getValue(), s1Var, b1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        h1.X(dVar.getNumber(), (List) entry.getValue(), s1Var, b1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (a.f12420a[dVar.c().ordinal()]) {
            case 1:
                s1Var.g(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                s1Var.G(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                s1Var.q(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                s1Var.o(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                s1Var.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                s1Var.k(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                s1Var.f(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                s1Var.r(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                s1Var.d(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                s1Var.t(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                s1Var.z(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                s1Var.N(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                s1Var.F(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                s1Var.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                s1Var.v(dVar.getNumber(), (h) entry.getValue());
                return;
            case 16:
                s1Var.n(dVar.getNumber(), (String) entry.getValue());
                return;
            case 17:
                s1Var.s(dVar.getNumber(), entry.getValue(), b1.a().d(entry.getValue().getClass()));
                return;
            case 18:
                s1Var.j(dVar.getNumber(), entry.getValue(), b1.a().d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
