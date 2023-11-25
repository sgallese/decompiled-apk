package androidx.collection;

/* compiled from: ContainerHelpers.java */
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    static final int[] f1797a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    static final long[] f1798b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    static final Object[] f1799c = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            long j11 = jArr[i13];
            if (j11 < j10) {
                i12 = i13 + 1;
            } else if (j11 > j10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int d(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static int e(int i10) {
        return d(i10 * 4) / 4;
    }

    public static int f(int i10) {
        return d(i10 * 8) / 8;
    }
}
