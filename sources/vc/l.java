package vc;

import qc.q;
import vc.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
/* loaded from: classes4.dex */
public class l extends k {
    public static float c(float f10, float f11) {
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return i11;
        }
        return i10;
    }

    public static long e(long j10, long j11) {
        if (j10 < j11) {
            return j11;
        }
        return j10;
    }

    public static double f(double d10, double d11) {
        if (d10 > d11) {
            return d11;
        }
        return d10;
    }

    public static float g(float f10, float f11) {
        if (f10 > f11) {
            return f11;
        }
        return f10;
    }

    public static int h(int i10, int i11) {
        if (i10 > i11) {
            return i11;
        }
        return i10;
    }

    public static long i(long j10, long j11) {
        if (j10 > j11) {
            return j11;
        }
        return j10;
    }

    public static double j(double d10, double d11, double d12) {
        if (d11 <= d12) {
            if (d10 < d11) {
                return d11;
            }
            if (d10 > d12) {
                return d12;
            }
            return d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    public static float k(float f10, float f11, float f12) {
        if (f11 <= f12) {
            if (f10 < f11) {
                return f11;
            }
            if (f10 > f12) {
                return f12;
            }
            return f10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
    }

    public static int l(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i10 < i11) {
                return i11;
            }
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    public static int m(int i10, c<Integer> cVar) {
        Comparable o10;
        q.i(cVar, "range");
        if (cVar instanceof b) {
            o10 = o(Integer.valueOf(i10), (b) cVar);
            return ((Number) o10).intValue();
        } else if (!cVar.isEmpty()) {
            if (i10 < cVar.a().intValue()) {
                return cVar.a().intValue();
            }
            if (i10 > cVar.f().intValue()) {
                return cVar.f().intValue();
            }
            return i10;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cVar + '.');
        }
    }

    public static long n(long j10, long j11, long j12) {
        if (j11 <= j12) {
            if (j10 < j11) {
                return j11;
            }
            if (j10 > j12) {
                return j12;
            }
            return j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    public static <T extends Comparable<? super T>> T o(T t10, b<T> bVar) {
        q.i(t10, "<this>");
        q.i(bVar, "range");
        if (!bVar.isEmpty()) {
            if (bVar.e(t10, bVar.a()) && !bVar.e(bVar.a(), t10)) {
                return bVar.a();
            }
            if (bVar.e(bVar.f(), t10) && !bVar.e(t10, bVar.f())) {
                return bVar.f();
            }
            return t10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + bVar + '.');
    }

    public static d p(int i10, int i11) {
        return d.f25115q.a(i10, i11, -1);
    }

    public static d q(d dVar) {
        q.i(dVar, "<this>");
        return d.f25115q.a(dVar.i(), dVar.h(), -dVar.j());
    }

    public static d r(d dVar, int i10) {
        boolean z10;
        q.i(dVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        k.a(z10, Integer.valueOf(i10));
        d.a aVar = d.f25115q;
        int h10 = dVar.h();
        int i11 = dVar.i();
        if (dVar.j() <= 0) {
            i10 = -i10;
        }
        return aVar.a(h10, i11, i10);
    }

    public static f s(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return f.f25123r.a();
        }
        return new f(i10, i11 - 1);
    }
}
