package com.google.gson.internal.bind;

import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes3.dex */
public final class a extends ja.a {
    private static final Reader H = new C0254a();
    private static final Object I = new Object();
    private Object[] D;
    private int E;
    private String[] F;
    private int[] G;

    /* compiled from: JsonTreeReader.java */
    /* renamed from: com.google.gson.internal.bind.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0254a extends Reader {
        C0254a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i10, int i11) throws IOException {
            throw new AssertionError();
        }
    }

    public a(l lVar) {
        super(H);
        this.D = new Object[32];
        this.E = 0;
        this.F = new String[32];
        this.G = new int[32];
        X0(lVar);
    }

    private String I() {
        return " at path " + getPath();
    }

    private void N0(ja.b bVar) throws IOException {
        if (l0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + l0() + I());
    }

    private Object R0() {
        return this.D[this.E - 1];
    }

    private Object T0() {
        Object[] objArr = this.D;
        int i10 = this.E - 1;
        this.E = i10;
        Object obj = objArr[i10];
        objArr[i10] = null;
        return obj;
    }

    private void X0(Object obj) {
        int i10 = this.E;
        Object[] objArr = this.D;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[i10 * 2];
            int[] iArr = new int[i10 * 2];
            String[] strArr = new String[i10 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.G, 0, iArr, 0, this.E);
            System.arraycopy(this.F, 0, strArr, 0, this.E);
            this.D = objArr2;
            this.G = iArr;
            this.F = strArr;
        }
        Object[] objArr3 = this.D;
        int i11 = this.E;
        this.E = i11 + 1;
        objArr3[i11] = obj;
    }

    @Override // ja.a
    public void I0() throws IOException {
        if (l0() == ja.b.NAME) {
            V();
            this.F[this.E - 2] = "null";
        } else {
            T0();
            int i10 = this.E;
            if (i10 > 0) {
                this.F[i10 - 1] = "null";
            }
        }
        int i11 = this.E;
        if (i11 > 0) {
            int[] iArr = this.G;
            int i12 = i11 - 1;
            iArr[i12] = iArr[i12] + 1;
        }
    }

    @Override // ja.a
    public boolean L() throws IOException {
        N0(ja.b.BOOLEAN);
        boolean a10 = ((o) T0()).a();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return a10;
    }

    @Override // ja.a
    public double Q() throws IOException {
        ja.b l02 = l0();
        ja.b bVar = ja.b.NUMBER;
        if (l02 != bVar && l02 != ja.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + l02 + I());
        }
        double e10 = ((o) R0()).e();
        if (!B() && (Double.isNaN(e10) || Double.isInfinite(e10))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + e10);
        }
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return e10;
    }

    @Override // ja.a
    public int R() throws IOException {
        ja.b l02 = l0();
        ja.b bVar = ja.b.NUMBER;
        if (l02 != bVar && l02 != ja.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + l02 + I());
        }
        int g10 = ((o) R0()).g();
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return g10;
    }

    @Override // ja.a
    public long T() throws IOException {
        ja.b l02 = l0();
        ja.b bVar = ja.b.NUMBER;
        if (l02 != bVar && l02 != ja.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + l02 + I());
        }
        long k10 = ((o) R0()).k();
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return k10;
    }

    @Override // ja.a
    public String V() throws IOException {
        N0(ja.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) R0()).next();
        String str = (String) entry.getKey();
        this.F[this.E - 1] = str;
        X0(entry.getValue());
        return str;
    }

    public void V0() throws IOException {
        N0(ja.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) R0()).next();
        X0(entry.getValue());
        X0(new o((String) entry.getKey()));
    }

    @Override // ja.a
    public void b() throws IOException {
        N0(ja.b.BEGIN_ARRAY);
        X0(((i) R0()).iterator());
        this.G[this.E - 1] = 0;
    }

    @Override // ja.a
    public void c() throws IOException {
        N0(ja.b.BEGIN_OBJECT);
        X0(((n) R0()).w().iterator());
    }

    @Override // ja.a
    public void c0() throws IOException {
        N0(ja.b.NULL);
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ja.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.D = new Object[]{I};
        this.E = 1;
    }

    @Override // ja.a
    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (i10 < this.E) {
            Object[] objArr = this.D;
            Object obj = objArr[i10];
            if (obj instanceof i) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.G[i10]);
                    sb2.append(']');
                }
            } else if (obj instanceof n) {
                i10++;
                if (objArr[i10] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.F[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    @Override // ja.a
    public String i0() throws IOException {
        ja.b l02 = l0();
        ja.b bVar = ja.b.STRING;
        if (l02 != bVar && l02 != ja.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + l02 + I());
        }
        String l10 = ((o) T0()).l();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
        return l10;
    }

    @Override // ja.a
    public ja.b l0() throws IOException {
        if (this.E == 0) {
            return ja.b.END_DOCUMENT;
        }
        Object R0 = R0();
        if (R0 instanceof Iterator) {
            boolean z10 = this.D[this.E - 2] instanceof n;
            Iterator it = (Iterator) R0;
            if (it.hasNext()) {
                if (z10) {
                    return ja.b.NAME;
                }
                X0(it.next());
                return l0();
            } else if (z10) {
                return ja.b.END_OBJECT;
            } else {
                return ja.b.END_ARRAY;
            }
        } else if (R0 instanceof n) {
            return ja.b.BEGIN_OBJECT;
        } else {
            if (R0 instanceof i) {
                return ja.b.BEGIN_ARRAY;
            }
            if (R0 instanceof o) {
                o oVar = (o) R0;
                if (oVar.x()) {
                    return ja.b.STRING;
                }
                if (oVar.t()) {
                    return ja.b.BOOLEAN;
                }
                if (oVar.v()) {
                    return ja.b.NUMBER;
                }
                throw new AssertionError();
            } else if (R0 instanceof m) {
                return ja.b.NULL;
            } else {
                if (R0 == I) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // ja.a
    public void m() throws IOException {
        N0(ja.b.END_ARRAY);
        T0();
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ja.a
    public void q() throws IOException {
        N0(ja.b.END_OBJECT);
        T0();
        T0();
        int i10 = this.E;
        if (i10 > 0) {
            int[] iArr = this.G;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
        }
    }

    @Override // ja.a
    public String toString() {
        return a.class.getSimpleName();
    }

    @Override // ja.a
    public boolean z() throws IOException {
        ja.b l02 = l0();
        if (l02 != ja.b.END_OBJECT && l02 != ja.b.END_ARRAY) {
            return true;
        }
        return false;
    }
}
