package zc;

import okhttp3.internal.http2.Http2Connection;
import qc.h;
import qc.q;
import r.x;
import vc.i;
import vc.l;
import yc.w;

/* compiled from: Duration.kt */
/* loaded from: classes4.dex */
public final class a implements Comparable<a> {

    /* renamed from: m  reason: collision with root package name */
    public static final C0609a f26431m = new C0609a(null);

    /* renamed from: p  reason: collision with root package name */
    private static final long f26432p = k(0);

    /* renamed from: q  reason: collision with root package name */
    private static final long f26433q;

    /* renamed from: r  reason: collision with root package name */
    private static final long f26434r;

    /* renamed from: f  reason: collision with root package name */
    private final long f26435f;

    /* compiled from: Duration.kt */
    /* renamed from: zc.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0609a {
        private C0609a() {
        }

        public /* synthetic */ C0609a(h hVar) {
            this();
        }

        public final long a() {
            return a.f26432p;
        }
    }

    static {
        long i10;
        long i11;
        i10 = c.i(4611686018427387903L);
        f26433q = i10;
        i11 = c.i(-4611686018427387903L);
        f26434r = i11;
    }

    private /* synthetic */ a(long j10) {
        this.f26435f = j10;
    }

    private static final boolean A(long j10) {
        if ((((int) j10) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean B(long j10) {
        if ((((int) j10) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean C(long j10) {
        if (j10 != f26433q && j10 != f26434r) {
            return false;
        }
        return true;
    }

    public static final boolean D(long j10) {
        if (j10 < 0) {
            return true;
        }
        return false;
    }

    public static final long E(long j10, long j11) {
        return F(j10, J(j11));
    }

    public static final long F(long j10, long j11) {
        long j12;
        long l10;
        if (C(j10)) {
            if (!z(j11) && (j11 ^ j10) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j10;
        } else if (C(j11)) {
            return j11;
        } else {
            if ((((int) j10) & 1) == (((int) j11) & 1)) {
                long x10 = x(j10) + x(j11);
                if (B(j10)) {
                    l10 = c.l(x10);
                    return l10;
                }
                j12 = c.j(x10);
                return j12;
            } else if (A(j10)) {
                return d(j10, x(j10), x(j11));
            } else {
                return d(j10, x(j11), x(j10));
            }
        }
    }

    public static final int G(long j10, d dVar) {
        long n10;
        q.i(dVar, "unit");
        n10 = l.n(H(j10, dVar), -2147483648L, 2147483647L);
        return (int) n10;
    }

    public static final long H(long j10, d dVar) {
        q.i(dVar, "unit");
        if (j10 == f26433q) {
            return Long.MAX_VALUE;
        }
        if (j10 == f26434r) {
            return Long.MIN_VALUE;
        }
        return e.a(x(j10), w(j10), dVar);
    }

    public static String I(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f26433q) {
            return "Infinity";
        }
        if (j10 == f26434r) {
            return "-Infinity";
        }
        boolean D = D(j10);
        StringBuilder sb2 = new StringBuilder();
        if (D) {
            sb2.append('-');
        }
        long m10 = m(j10);
        long o10 = o(m10);
        int n10 = n(m10);
        int t10 = t(m10);
        int v10 = v(m10);
        int u10 = u(m10);
        int i10 = 0;
        if (o10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (n10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (t10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (v10 == 0 && u10 == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb2.append(o10);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(n10);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(t10);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (v10 == 0 && !z10 && !z11 && !z12) {
                if (u10 >= 1000000) {
                    f(j10, sb2, u10 / 1000000, u10 % 1000000, 6, "ms", false);
                } else if (u10 >= 1000) {
                    f(j10, sb2, u10 / 1000, u10 % 1000, 3, "us", false);
                } else {
                    sb2.append(u10);
                    sb2.append("ns");
                }
            } else {
                f(j10, sb2, v10, u10, 9, "s", false);
            }
            i10 = i13;
        }
        if (D && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        q.h(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final long J(long j10) {
        long h10;
        h10 = c.h(-x(j10), ((int) j10) & 1);
        return h10;
    }

    private static final long d(long j10, long j11, long j12) {
        long n10;
        long n11;
        long i10;
        long m10;
        long m11;
        long k10;
        n10 = c.n(j12);
        long j13 = j11 + n10;
        if (new i(-4611686018426L, 4611686018426L).k(j13)) {
            m10 = c.m(n10);
            long j14 = j12 - m10;
            m11 = c.m(j13);
            k10 = c.k(m11 + j14);
            return k10;
        }
        n11 = l.n(j13, -4611686018427387903L, 4611686018427387903L);
        i10 = c.i(n11);
        return i10;
    }

    private static final void f(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        String h02;
        boolean z11;
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            h02 = w.h0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = h02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (h02.charAt(length) != '0') {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (!z10 && i15 < 3) {
                sb2.append((CharSequence) h02, 0, i15);
                q.h(sb2, "this.append(value, startIndex, endIndex)");
            } else {
                sb2.append((CharSequence) h02, 0, ((i15 + 2) / 3) * 3);
                q.h(sb2, "this.append(value, startIndex, endIndex)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a g(long j10) {
        return new a(j10);
    }

    public static int j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (((int) j11) & 1);
            if (D(j10)) {
                return -i10;
            }
            return i10;
        }
        return q.l(j10, j11);
    }

    public static long k(long j10) {
        if (b.a()) {
            if (B(j10)) {
                if (!new i(-4611686018426999999L, 4611686018426999999L).k(x(j10))) {
                    throw new AssertionError(x(j10) + " ns is out of nanoseconds range");
                }
            } else if (new i(-4611686018427387903L, 4611686018427387903L).k(x(j10))) {
                if (new i(-4611686018426L, 4611686018426L).k(x(j10))) {
                    throw new AssertionError(x(j10) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(x(j10) + " ms is out of milliseconds range");
            }
        }
        return j10;
    }

    public static boolean l(long j10, Object obj) {
        if (!(obj instanceof a) || j10 != ((a) obj).K()) {
            return false;
        }
        return true;
    }

    public static final long m(long j10) {
        if (D(j10)) {
            return J(j10);
        }
        return j10;
    }

    public static final int n(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (p(j10) % 24);
    }

    public static final long o(long j10) {
        return H(j10, d.DAYS);
    }

    public static final long p(long j10) {
        return H(j10, d.HOURS);
    }

    public static final long q(long j10) {
        if (A(j10) && z(j10)) {
            return x(j10);
        }
        return H(j10, d.MILLISECONDS);
    }

    public static final long r(long j10) {
        return H(j10, d.MINUTES);
    }

    public static final long s(long j10) {
        return H(j10, d.SECONDS);
    }

    public static final int t(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (r(j10) % 60);
    }

    public static final int u(long j10) {
        long x10;
        if (C(j10)) {
            return 0;
        }
        if (A(j10)) {
            x10 = c.m(x(j10) % 1000);
        } else {
            x10 = x(j10) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
        }
        return (int) x10;
    }

    public static final int v(long j10) {
        if (C(j10)) {
            return 0;
        }
        return (int) (s(j10) % 60);
    }

    private static final d w(long j10) {
        if (B(j10)) {
            return d.NANOSECONDS;
        }
        return d.MILLISECONDS;
    }

    private static final long x(long j10) {
        return j10 >> 1;
    }

    public static int y(long j10) {
        return x.a(j10);
    }

    public static final boolean z(long j10) {
        return !C(j10);
    }

    public final /* synthetic */ long K() {
        return this.f26435f;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(a aVar) {
        return i(aVar.K());
    }

    public boolean equals(Object obj) {
        return l(this.f26435f, obj);
    }

    public int hashCode() {
        return y(this.f26435f);
    }

    public int i(long j10) {
        return j(this.f26435f, j10);
    }

    public String toString() {
        return I(this.f26435f);
    }
}
