package z0;

/* compiled from: RoundRect.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: i  reason: collision with root package name */
    public static final a f26365i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    private static final j f26366j = k.c(0.0f, 0.0f, 0.0f, 0.0f, z0.a.f26348a.a());

    /* renamed from: a  reason: collision with root package name */
    private final float f26367a;

    /* renamed from: b  reason: collision with root package name */
    private final float f26368b;

    /* renamed from: c  reason: collision with root package name */
    private final float f26369c;

    /* renamed from: d  reason: collision with root package name */
    private final float f26370d;

    /* renamed from: e  reason: collision with root package name */
    private final long f26371e;

    /* renamed from: f  reason: collision with root package name */
    private final long f26372f;

    /* renamed from: g  reason: collision with root package name */
    private final long f26373g;

    /* renamed from: h  reason: collision with root package name */
    private final long f26374h;

    /* compiled from: RoundRect.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public /* synthetic */ j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, qc.h hVar) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    public final float a() {
        return this.f26370d;
    }

    public final long b() {
        return this.f26374h;
    }

    public final long c() {
        return this.f26373g;
    }

    public final float d() {
        return this.f26370d - this.f26368b;
    }

    public final float e() {
        return this.f26367a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (Float.compare(this.f26367a, jVar.f26367a) == 0 && Float.compare(this.f26368b, jVar.f26368b) == 0 && Float.compare(this.f26369c, jVar.f26369c) == 0 && Float.compare(this.f26370d, jVar.f26370d) == 0 && z0.a.c(this.f26371e, jVar.f26371e) && z0.a.c(this.f26372f, jVar.f26372f) && z0.a.c(this.f26373g, jVar.f26373g) && z0.a.c(this.f26374h, jVar.f26374h)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f26369c;
    }

    public final float g() {
        return this.f26368b;
    }

    public final long h() {
        return this.f26371e;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.f26367a) * 31) + Float.floatToIntBits(this.f26368b)) * 31) + Float.floatToIntBits(this.f26369c)) * 31) + Float.floatToIntBits(this.f26370d)) * 31) + z0.a.f(this.f26371e)) * 31) + z0.a.f(this.f26372f)) * 31) + z0.a.f(this.f26373g)) * 31) + z0.a.f(this.f26374h);
    }

    public final long i() {
        return this.f26372f;
    }

    public final float j() {
        return this.f26369c - this.f26367a;
    }

    public String toString() {
        boolean z10;
        long j10 = this.f26371e;
        long j11 = this.f26372f;
        long j12 = this.f26373g;
        long j13 = this.f26374h;
        String str = c.a(this.f26367a, 1) + ", " + c.a(this.f26368b, 1) + ", " + c.a(this.f26369c, 1) + ", " + c.a(this.f26370d, 1);
        if (z0.a.c(j10, j11) && z0.a.c(j11, j12) && z0.a.c(j12, j13)) {
            if (z0.a.d(j10) == z0.a.e(j10)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "RoundRect(rect=" + str + ", radius=" + c.a(z0.a.d(j10), 1) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + c.a(z0.a.d(j10), 1) + ", y=" + c.a(z0.a.e(j10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) z0.a.g(j10)) + ", topRight=" + ((Object) z0.a.g(j11)) + ", bottomRight=" + ((Object) z0.a.g(j12)) + ", bottomLeft=" + ((Object) z0.a.g(j13)) + ')';
    }

    private j(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.f26367a = f10;
        this.f26368b = f11;
        this.f26369c = f12;
        this.f26370d = f13;
        this.f26371e = j10;
        this.f26372f = j11;
        this.f26373g = j12;
        this.f26374h = j13;
    }
}
