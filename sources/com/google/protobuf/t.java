package com.google.protobuf;

import com.google.protobuf.c0;
import com.google.protobuf.q0;
import com.google.protobuf.r1;
import com.google.protobuf.t.b;
import com.google.protobuf.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet.java */
/* loaded from: classes3.dex */
final class t<T extends b<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final t f12428d = new t(true);

    /* renamed from: a  reason: collision with root package name */
    private final i1<T, Object> f12429a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12430b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12431c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FieldSet.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12432a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f12433b;

        static {
            int[] iArr = new int[r1.b.values().length];
            f12433b = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12433b[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12433b[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12433b[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12433b[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12433b[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12433b[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12433b[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12433b[r1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12433b[r1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12433b[r1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12433b[r1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12433b[r1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12433b[r1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12433b[r1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f12433b[r1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f12433b[r1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f12433b[r1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r1.c.values().length];
            f12432a = iArr2;
            try {
                iArr2[r1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f12432a[r1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f12432a[r1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f12432a[r1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f12432a[r1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f12432a[r1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f12432a[r1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f12432a[r1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f12432a[r1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* compiled from: FieldSet.java */
    /* loaded from: classes3.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        boolean a();

        r1.b c();

        q0.a e(q0.a aVar, q0 q0Var);

        int getNumber();

        r1.c h();

        boolean isPacked();
    }

    private t() {
        this.f12429a = i1.r(16);
    }

    static void A(CodedOutputStream codedOutputStream, r1.b bVar, Object obj) throws IOException {
        switch (a.f12433b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.o0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.w0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.E0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.X0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.C0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.u0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.s0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.i0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.z0((q0) obj);
                return;
            case 10:
                codedOutputStream.G0((q0) obj);
                return;
            case 11:
                if (obj instanceof h) {
                    codedOutputStream.m0((h) obj);
                    return;
                } else {
                    codedOutputStream.S0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof h) {
                    codedOutputStream.m0((h) obj);
                    return;
                } else {
                    codedOutputStream.j0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.V0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.K0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.M0(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.O0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.Q0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof z.c) {
                    codedOutputStream.q0(((z.c) obj).getNumber());
                    return;
                } else {
                    codedOutputStream.q0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private static Object c(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(r1.b bVar, int i10, Object obj) {
        int U = CodedOutputStream.U(i10);
        if (bVar == r1.b.GROUP) {
            U *= 2;
        }
        return U + e(bVar, obj);
    }

    static int e(r1.b bVar, Object obj) {
        switch (a.f12433b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.Y(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.t((q0) obj);
            case 10:
                if (obj instanceof c0) {
                    return CodedOutputStream.B((c0) obj);
                }
                return CodedOutputStream.G((q0) obj);
            case 11:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.T((String) obj);
            case 12:
                if (obj instanceof h) {
                    return CodedOutputStream.h((h) obj);
                }
                return CodedOutputStream.f((byte[]) obj);
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.L(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.N(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.P(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.R(((Long) obj).longValue());
            case 18:
                if (obj instanceof z.c) {
                    return CodedOutputStream.l(((z.c) obj).getNumber());
                }
                return CodedOutputStream.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        r1.b c10 = bVar.c();
        int number = bVar.getNumber();
        if (bVar.a()) {
            int i10 = 0;
            if (bVar.isPacked()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i10 += e(c10, it.next());
                }
                return CodedOutputStream.U(number) + i10 + CodedOutputStream.J(i10);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i10 += d(c10, number, it2.next());
            }
            return i10;
        }
        return d(c10, number, obj);
    }

    public static <T extends b<T>> t<T> h() {
        return f12428d;
    }

    private int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.h() == r1.c.MESSAGE && !key.a() && !key.isPacked()) {
            if (value instanceof c0) {
                return CodedOutputStream.z(entry.getKey().getNumber(), (c0) value);
            }
            return CodedOutputStream.D(entry.getKey().getNumber(), (q0) value);
        }
        return f(key, value);
    }

    static int m(r1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.getWireType();
    }

    private static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.h() == r1.c.MESSAGE) {
            if (key.a()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((q0) it.next()).b()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof q0) {
                    if (!((q0) value).b()) {
                        return false;
                    }
                } else if (value instanceof c0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private static boolean r(r1.b bVar, Object obj) {
        z.a(obj);
        switch (a.f12432a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof h) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof z.c)) {
                    return true;
                }
                return false;
            case 9:
                if ((obj instanceof q0) || (obj instanceof c0)) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    private void v(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof c0) {
            value = ((c0) value).f();
        }
        if (key.a()) {
            Object i10 = i(key);
            if (i10 == null) {
                i10 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) i10).add(c(it.next()));
            }
            this.f12429a.put(key, i10);
        } else if (key.h() == r1.c.MESSAGE) {
            Object i11 = i(key);
            if (i11 == null) {
                this.f12429a.put(key, c(value));
                return;
            }
            this.f12429a.put(key, key.e(((q0) i11).d(), (q0) value).build());
        } else {
            this.f12429a.put(key, c(value));
        }
    }

    public static <T extends b<T>> t<T> w() {
        return new t<>();
    }

    private void y(T t10, Object obj) {
        if (r(t10.c(), obj)) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t10.getNumber()), t10.c().getJavaType(), obj.getClass().getName()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void z(CodedOutputStream codedOutputStream, r1.b bVar, int i10, Object obj) throws IOException {
        if (bVar == r1.b.GROUP) {
            codedOutputStream.x0(i10, (q0) obj);
            return;
        }
        codedOutputStream.T0(i10, m(bVar, false));
        A(codedOutputStream, bVar, obj);
    }

    public void a(T t10, Object obj) {
        List list;
        if (t10.a()) {
            y(t10, obj);
            Object i10 = i(t10);
            if (i10 == null) {
                list = new ArrayList();
                this.f12429a.put(t10, list);
            } else {
                list = (List) i10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public t<T> clone() {
        t<T> w10 = w();
        for (int i10 = 0; i10 < this.f12429a.l(); i10++) {
            Map.Entry<T, Object> k10 = this.f12429a.k(i10);
            w10.x(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f12429a.n()) {
            w10.x(entry.getKey(), entry.getValue());
        }
        w10.f12431c = this.f12431c;
        return w10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f12429a.equals(((t) obj).f12429a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Iterator<Map.Entry<T, Object>> g() {
        if (this.f12431c) {
            return new c0.c(this.f12429a.i().iterator());
        }
        return this.f12429a.i().iterator();
    }

    public int hashCode() {
        return this.f12429a.hashCode();
    }

    public Object i(T t10) {
        Object obj = this.f12429a.get(t10);
        if (obj instanceof c0) {
            return ((c0) obj).f();
        }
        return obj;
    }

    public int j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12429a.l(); i11++) {
            i10 += k(this.f12429a.k(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f12429a.n().iterator();
        while (it.hasNext()) {
            i10 += k(it.next());
        }
        return i10;
    }

    public int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f12429a.l(); i11++) {
            Map.Entry<T, Object> k10 = this.f12429a.k(i11);
            i10 += f(k10.getKey(), k10.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f12429a.n()) {
            i10 += f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n() {
        return this.f12429a.isEmpty();
    }

    public boolean o() {
        return this.f12430b;
    }

    public boolean p() {
        for (int i10 = 0; i10 < this.f12429a.l(); i10++) {
            if (!q(this.f12429a.k(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f12429a.n().iterator();
        while (it.hasNext()) {
            if (!q(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> s() {
        if (this.f12431c) {
            return new c0.c(this.f12429a.entrySet().iterator());
        }
        return this.f12429a.entrySet().iterator();
    }

    public void t() {
        if (this.f12430b) {
            return;
        }
        this.f12429a.q();
        this.f12430b = true;
    }

    public void u(t<T> tVar) {
        for (int i10 = 0; i10 < tVar.f12429a.l(); i10++) {
            v(tVar.f12429a.k(i10));
        }
        Iterator<Map.Entry<T, Object>> it = tVar.f12429a.n().iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public void x(T t10, Object obj) {
        if (t10.a()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y(t10, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            y(t10, obj);
        }
        if (obj instanceof c0) {
            this.f12431c = true;
        }
        this.f12429a.put(t10, obj);
    }

    private t(boolean z10) {
        this(i1.r(0));
        t();
    }

    private t(i1<T, Object> i1Var) {
        this.f12429a = i1Var;
        t();
    }
}
