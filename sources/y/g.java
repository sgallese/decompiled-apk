package y;

/* compiled from: LazyLayoutBeyondBoundsInfo.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<a> f26077a = new k0.f<>(new a[16], 0);

    /* compiled from: LazyLayoutBeyondBoundsInfo.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f26078a;

        /* renamed from: b  reason: collision with root package name */
        private final int f26079b;

        public a(int i10, int i11) {
            boolean z10;
            this.f26078a = i10;
            this.f26079b = i11;
            if (i10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (i11 >= i10) {
                    return;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final int a() {
            return this.f26079b;
        }

        public final int b() {
            return this.f26078a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f26078a == aVar.f26078a && this.f26079b == aVar.f26079b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f26078a * 31) + this.f26079b;
        }

        public String toString() {
            return "Interval(start=" + this.f26078a + ", end=" + this.f26079b + ')';
        }
    }

    public final a a(int i10, int i11) {
        a aVar = new a(i10, i11);
        this.f26077a.d(aVar);
        return aVar;
    }

    public final int b() {
        int a10 = this.f26077a.m().a();
        k0.f<a> fVar = this.f26077a;
        int o10 = fVar.o();
        if (o10 > 0) {
            a[] n10 = fVar.n();
            int i10 = 0;
            do {
                a aVar = n10[i10];
                if (aVar.a() > a10) {
                    a10 = aVar.a();
                }
                i10++;
            } while (i10 < o10);
        }
        return a10;
    }

    public final int c() {
        int b10 = this.f26077a.m().b();
        k0.f<a> fVar = this.f26077a;
        int o10 = fVar.o();
        boolean z10 = false;
        if (o10 > 0) {
            a[] n10 = fVar.n();
            int i10 = 0;
            do {
                a aVar = n10[i10];
                if (aVar.b() < b10) {
                    b10 = aVar.b();
                }
                i10++;
            } while (i10 < o10);
        }
        if (b10 >= 0) {
            z10 = true;
        }
        if (z10) {
            return b10;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean d() {
        return this.f26077a.s();
    }

    public final void e(a aVar) {
        qc.q.i(aVar, "interval");
        this.f26077a.v(aVar);
    }
}
