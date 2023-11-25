package ec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: _ArraysJvm.kt */
/* loaded from: classes4.dex */
public class o extends n {
    public static boolean[] A(boolean[] zArr, boolean[] zArr2) {
        qc.q.i(zArr, "<this>");
        qc.q.i(zArr2, "elements");
        int length = zArr.length;
        int length2 = zArr2.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
        System.arraycopy(zArr2, 0, copyOf, length, length2);
        qc.q.h(copyOf, "result");
        return copyOf;
    }

    public static <T> void B(T[] tArr) {
        qc.q.i(tArr, "<this>");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }

    public static final <T> void C(T[] tArr, Comparator<? super T> comparator) {
        qc.q.i(tArr, "<this>");
        qc.q.i(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static <T> void D(T[] tArr, Comparator<? super T> comparator, int i10, int i11) {
        qc.q.i(tArr, "<this>");
        qc.q.i(comparator, "comparator");
        Arrays.sort(tArr, i10, i11, comparator);
    }

    public static <T> List<T> c(T[] tArr) {
        qc.q.i(tArr, "<this>");
        List<T> a10 = q.a(tArr);
        qc.q.h(a10, "asList(this)");
        return a10;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i10, int i11, int i12) {
        qc.q.i(bArr, "<this>");
        qc.q.i(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
        return bArr2;
    }

    public static char[] e(char[] cArr, char[] cArr2, int i10, int i11, int i12) {
        qc.q.i(cArr, "<this>");
        qc.q.i(cArr2, "destination");
        System.arraycopy(cArr, i11, cArr2, i10, i12 - i11);
        return cArr2;
    }

    public static float[] f(float[] fArr, float[] fArr2, int i10, int i11, int i12) {
        qc.q.i(fArr, "<this>");
        qc.q.i(fArr2, "destination");
        System.arraycopy(fArr, i11, fArr2, i10, i12 - i11);
        return fArr2;
    }

    public static int[] g(int[] iArr, int[] iArr2, int i10, int i11, int i12) {
        qc.q.i(iArr, "<this>");
        qc.q.i(iArr2, "destination");
        System.arraycopy(iArr, i11, iArr2, i10, i12 - i11);
        return iArr2;
    }

    public static long[] h(long[] jArr, long[] jArr2, int i10, int i11, int i12) {
        qc.q.i(jArr, "<this>");
        qc.q.i(jArr2, "destination");
        System.arraycopy(jArr, i11, jArr2, i10, i12 - i11);
        return jArr2;
    }

    public static <T> T[] i(T[] tArr, T[] tArr2, int i10, int i11, int i12) {
        qc.q.i(tArr, "<this>");
        qc.q.i(tArr2, "destination");
        System.arraycopy(tArr, i11, tArr2, i10, i12 - i11);
        return tArr2;
    }

    public static /* synthetic */ byte[] j(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        byte[] d10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        d10 = d(bArr, bArr2, i10, i11, i12);
        return d10;
    }

    public static /* synthetic */ float[] k(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        float[] f10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        f10 = f(fArr, fArr2, i10, i11, i12);
        return f10;
    }

    public static /* synthetic */ int[] l(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        int[] g10;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        g10 = g(iArr, iArr2, i10, i11, i12);
        return g10;
    }

    public static /* synthetic */ Object[] m(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        Object[] i14;
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        i14 = i(objArr, objArr2, i10, i11, i12);
        return i14;
    }

    public static byte[] n(byte[] bArr, int i10, int i11) {
        qc.q.i(bArr, "<this>");
        m.b(i11, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        qc.q.h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static char[] o(char[] cArr, int i10, int i11) {
        qc.q.i(cArr, "<this>");
        m.b(i11, cArr.length);
        char[] copyOfRange = Arrays.copyOfRange(cArr, i10, i11);
        qc.q.h(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static <T> T[] p(T[] tArr, int i10, int i11) {
        qc.q.i(tArr, "<this>");
        m.b(i11, tArr.length);
        T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i10, i11);
        qc.q.h(tArr2, "copyOfRange(this, fromIndex, toIndex)");
        return tArr2;
    }

    public static void q(int[] iArr, int i10, int i11, int i12) {
        qc.q.i(iArr, "<this>");
        Arrays.fill(iArr, i11, i12, i10);
    }

    public static <T> void r(T[] tArr, T t10, int i10, int i11) {
        qc.q.i(tArr, "<this>");
        Arrays.fill(tArr, i10, i11, t10);
    }

    public static /* synthetic */ void s(int[] iArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = iArr.length;
        }
        q(iArr, i10, i11, i12);
    }

    public static /* synthetic */ void t(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        r(objArr, obj, i10, i11);
    }

    public static float[] u(float[] fArr, float[] fArr2) {
        qc.q.i(fArr, "<this>");
        qc.q.i(fArr2, "elements");
        int length = fArr.length;
        int length2 = fArr2.length;
        float[] copyOf = Arrays.copyOf(fArr, length + length2);
        System.arraycopy(fArr2, 0, copyOf, length, length2);
        qc.q.h(copyOf, "result");
        return copyOf;
    }

    public static int[] v(int[] iArr, int i10) {
        qc.q.i(iArr, "<this>");
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i10;
        qc.q.h(copyOf, "result");
        return copyOf;
    }

    public static int[] w(int[] iArr, int[] iArr2) {
        qc.q.i(iArr, "<this>");
        qc.q.i(iArr2, "elements");
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] copyOf = Arrays.copyOf(iArr, length + length2);
        System.arraycopy(iArr2, 0, copyOf, length, length2);
        qc.q.h(copyOf, "result");
        return copyOf;
    }

    public static long[] x(long[] jArr, long[] jArr2) {
        qc.q.i(jArr, "<this>");
        qc.q.i(jArr2, "elements");
        int length = jArr.length;
        int length2 = jArr2.length;
        long[] copyOf = Arrays.copyOf(jArr, length + length2);
        System.arraycopy(jArr2, 0, copyOf, length, length2);
        qc.q.h(copyOf, "result");
        return copyOf;
    }

    public static <T> T[] y(T[] tArr, T t10) {
        qc.q.i(tArr, "<this>");
        int length = tArr.length;
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, length + 1);
        tArr2[length] = t10;
        qc.q.h(tArr2, "result");
        return tArr2;
    }

    public static <T> T[] z(T[] tArr, T[] tArr2) {
        qc.q.i(tArr, "<this>");
        qc.q.i(tArr2, "elements");
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (T[]) Arrays.copyOf(tArr, length + length2);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        qc.q.h(tArr3, "result");
        return tArr3;
    }
}
