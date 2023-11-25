package v0;

import j2.m;
import j2.p;
import j2.r;
import qc.q;
import v0.b;

/* compiled from: Alignment.kt */
/* loaded from: classes.dex */
public final class c implements v0.b {

    /* renamed from: b  reason: collision with root package name */
    private final float f24275b;

    /* renamed from: c  reason: collision with root package name */
    private final float f24276c;

    /* compiled from: Alignment.kt */
    /* loaded from: classes.dex */
    public static final class a implements b.InterfaceC0571b {

        /* renamed from: a  reason: collision with root package name */
        private final float f24277a;

        public a(float f10) {
            this.f24277a = f10;
        }

        @Override // v0.b.InterfaceC0571b
        public int a(int i10, int i11, r rVar) {
            float f10;
            int d10;
            q.i(rVar, "layoutDirection");
            float f11 = (i11 - i10) / 2.0f;
            if (rVar == r.Ltr) {
                f10 = this.f24277a;
            } else {
                f10 = (-1) * this.f24277a;
            }
            d10 = sc.c.d(f11 * (1 + f10));
            return d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && Float.compare(this.f24277a, ((a) obj).f24277a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f24277a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f24277a + ')';
        }
    }

    /* compiled from: Alignment.kt */
    /* loaded from: classes.dex */
    public static final class b implements b.c {

        /* renamed from: a  reason: collision with root package name */
        private final float f24278a;

        public b(float f10) {
            this.f24278a = f10;
        }

        @Override // v0.b.c
        public int a(int i10, int i11) {
            int d10;
            d10 = sc.c.d(((i11 - i10) / 2.0f) * (1 + this.f24278a));
            return d10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && Float.compare(this.f24278a, ((b) obj).f24278a) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f24278a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f24278a + ')';
        }
    }

    public c(float f10, float f11) {
        this.f24275b = f10;
        this.f24276c = f11;
    }

    @Override // v0.b
    public long a(long j10, long j11, r rVar) {
        float f10;
        int d10;
        int d11;
        q.i(rVar, "layoutDirection");
        float g10 = (p.g(j11) - p.g(j10)) / 2.0f;
        float f11 = (p.f(j11) - p.f(j10)) / 2.0f;
        if (rVar == r.Ltr) {
            f10 = this.f24275b;
        } else {
            f10 = (-1) * this.f24275b;
        }
        float f12 = 1;
        float f13 = f11 * (f12 + this.f24276c);
        d10 = sc.c.d(g10 * (f10 + f12));
        d11 = sc.c.d(f13);
        return m.a(d10, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.f24275b, cVar.f24275b) == 0 && Float.compare(this.f24276c, cVar.f24276c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f24275b) * 31) + Float.floatToIntBits(this.f24276c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f24275b + ", verticalBias=" + this.f24276c + ')';
    }
}
