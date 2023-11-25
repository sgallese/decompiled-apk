package tc;

import java.io.Serializable;
import qc.h;

/* compiled from: Random.kt */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: f  reason: collision with root package name */
    public static final a f23726f = new a(null);

    /* renamed from: m  reason: collision with root package name */
    private static final c f23727m = kc.b.f19451a.b();

    /* compiled from: Random.kt */
    /* loaded from: classes4.dex */
    public static final class a extends c implements Serializable {
        public /* synthetic */ a(h hVar) {
            this();
        }

        @Override // tc.c
        public int b(int i10) {
            return c.f23727m.b(i10);
        }

        @Override // tc.c
        public double c() {
            return c.f23727m.c();
        }

        @Override // tc.c
        public double d(double d10) {
            return c.f23727m.d(d10);
        }

        @Override // tc.c
        public double e(double d10, double d11) {
            return c.f23727m.e(d10, d11);
        }

        @Override // tc.c
        public float f() {
            return c.f23727m.f();
        }

        @Override // tc.c
        public int g() {
            return c.f23727m.g();
        }

        @Override // tc.c
        public int h(int i10, int i11) {
            return c.f23727m.h(i10, i11);
        }

        private a() {
        }
    }

    public abstract int b(int i10);

    public abstract double c();

    public double d(double d10) {
        return e(0.0d, d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double e(double r7, double r9) {
        /*
            r6 = this;
            tc.d.b(r7, r9)
            double r0 = r9 - r7
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r7)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            boolean r2 = java.lang.Double.isNaN(r7)
            if (r2 != 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 == 0) goto L3e
            boolean r2 = java.lang.Double.isInfinite(r9)
            if (r2 != 0) goto L2b
            boolean r2 = java.lang.Double.isNaN(r9)
            if (r2 != 0) goto L2b
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L3e
            double r0 = r6.c()
            r2 = 2
            double r2 = (double) r2
            double r4 = r9 / r2
            double r2 = r7 / r2
            double r4 = r4 - r2
            double r0 = r0 * r4
            double r7 = r7 + r0
            double r7 = r7 + r0
            goto L45
        L3e:
            double r2 = r6.c()
            double r2 = r2 * r0
            double r7 = r7 + r2
        L45:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L4f
            r7 = -4503599627370496(0xfff0000000000000, double:-Infinity)
            double r7 = java.lang.Math.nextAfter(r9, r7)
        L4f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.c.e(double, double):double");
    }

    public abstract float f();

    public abstract int g();

    public int h(int i10, int i11) {
        int g10;
        int i12;
        int i13;
        int g11;
        boolean z10;
        d.c(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i13 = b(d.d(i14));
                return i10 + i13;
            }
            do {
                g10 = g() >>> 1;
                i12 = g10 % i14;
            } while ((g10 - i12) + (i14 - 1) < 0);
            i13 = i12;
            return i10 + i13;
        }
        do {
            g11 = g();
            z10 = false;
            if (i10 <= g11 && g11 < i11) {
                z10 = true;
            }
        } while (!z10);
        return g11;
    }
}
