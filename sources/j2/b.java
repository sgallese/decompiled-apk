package j2;

import okhttp3.internal.http2.Settings;
import r.x;

/* compiled from: Constraints.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18972b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f18973c = {18, 20, 17, 15};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f18974d = {Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143, 32767, 8191};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f18975e = {32767, 8191, Settings.DEFAULT_INITIAL_WINDOW_SIZE, 262143};

    /* renamed from: a  reason: collision with root package name */
    private final long f18976a;

    /* compiled from: Constraints.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        private final int a(int i10) {
            if (i10 < 8191) {
                return 13;
            }
            if (i10 < 32767) {
                return 15;
            }
            if (i10 < 65535) {
                return 16;
            }
            if (i10 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
        }

        public final long b(int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            long j10;
            int i16;
            if (i13 == Integer.MAX_VALUE) {
                i14 = i12;
            } else {
                i14 = i13;
            }
            int a10 = a(i14);
            if (i11 == Integer.MAX_VALUE) {
                i15 = i10;
            } else {
                i15 = i11;
            }
            int a11 = a(i15);
            if (a10 + a11 <= 31) {
                if (a11 != 13) {
                    if (a11 != 18) {
                        if (a11 != 15) {
                            if (a11 == 16) {
                                j10 = 0;
                            } else {
                                throw new IllegalStateException("Should only have the provided constants.");
                            }
                        } else {
                            j10 = 2;
                        }
                    } else {
                        j10 = 1;
                    }
                } else {
                    j10 = 3;
                }
                int i17 = 0;
                if (i11 == Integer.MAX_VALUE) {
                    i16 = 0;
                } else {
                    i16 = i11 + 1;
                }
                if (i13 != Integer.MAX_VALUE) {
                    i17 = i13 + 1;
                }
                int i18 = b.f18973c[(int) j10];
                return b.c((i16 << 33) | j10 | (i10 << 2) | (i12 << i18) | (i17 << (i18 + 31)));
            }
            throw new IllegalArgumentException("Can't represent a width of " + i15 + " and height of " + i14 + " in Constraints");
        }

        public final long c(int i10, int i11) {
            boolean z10;
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return b(i10, i10, i11, i11);
            }
            throw new IllegalArgumentException(("width(" + i10 + ") and height(" + i11 + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ b(long j10) {
        this.f18976a = j10;
    }

    public static final /* synthetic */ b b(long j10) {
        return new b(j10);
    }

    public static final long d(long j10, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (i12 >= 0 && i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 < i10 && i11 != Integer.MAX_VALUE) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                if (i13 < i12 && i13 != Integer.MAX_VALUE) {
                    z12 = false;
                }
                if (z12) {
                    return f18972b.b(i10, i11, i12, i13);
                }
                throw new IllegalArgumentException(("maxHeight(" + i13 + ") must be >= minHeight(" + i12 + ')').toString());
            }
            throw new IllegalArgumentException(("maxWidth(" + i11 + ") must be >= minWidth(" + i10 + ')').toString());
        }
        throw new IllegalArgumentException(("minHeight(" + i12 + ") and minWidth(" + i10 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long e(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = p(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = n(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = o(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = m(j10);
        }
        return d(j10, i15, i16, i17, i13);
    }

    public static boolean f(long j10, Object obj) {
        if (!(obj instanceof b) || j10 != ((b) obj).t()) {
            return false;
        }
        return true;
    }

    public static final boolean g(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    private static final int h(long j10) {
        return (int) (j10 & 3);
    }

    public static final boolean i(long j10) {
        int h10 = h(j10);
        if ((((int) (j10 >> (f18973c[h10] + 31))) & f18975e[h10]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean j(long j10) {
        if ((((int) (j10 >> 33)) & f18974d[h(j10)]) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean k(long j10) {
        if (m(j10) == o(j10)) {
            return true;
        }
        return false;
    }

    public static final boolean l(long j10) {
        if (n(j10) == p(j10)) {
            return true;
        }
        return false;
    }

    public static final int m(long j10) {
        int h10 = h(j10);
        int i10 = ((int) (j10 >> (f18973c[h10] + 31))) & f18975e[h10];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int n(long j10) {
        int i10 = ((int) (j10 >> 33)) & f18974d[h(j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int o(long j10) {
        int h10 = h(j10);
        return ((int) (j10 >> f18973c[h10])) & f18975e[h10];
    }

    public static final int p(long j10) {
        return ((int) (j10 >> 2)) & f18974d[h(j10)];
    }

    public static int q(long j10) {
        return x.a(j10);
    }

    public static final boolean r(long j10) {
        if (n(j10) != 0 && m(j10) != 0) {
            return false;
        }
        return true;
    }

    public static String s(long j10) {
        String valueOf;
        int n10 = n(j10);
        String str = "Infinity";
        if (n10 == Integer.MAX_VALUE) {
            valueOf = "Infinity";
        } else {
            valueOf = String.valueOf(n10);
        }
        int m10 = m(j10);
        if (m10 != Integer.MAX_VALUE) {
            str = String.valueOf(m10);
        }
        return "Constraints(minWidth = " + p(j10) + ", maxWidth = " + valueOf + ", minHeight = " + o(j10) + ", maxHeight = " + str + ')';
    }

    public boolean equals(Object obj) {
        return f(this.f18976a, obj);
    }

    public int hashCode() {
        return q(this.f18976a);
    }

    public final /* synthetic */ long t() {
        return this.f18976a;
    }

    public String toString() {
        return s(this.f18976a);
    }

    public static long c(long j10) {
        return j10;
    }
}
