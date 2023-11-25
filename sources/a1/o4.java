package a1;

/* compiled from: Shadow.kt */
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f137d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final o4 f138e = new o4(0, 0, 0.0f, 7, null);

    /* renamed from: a  reason: collision with root package name */
    private final long f139a;

    /* renamed from: b  reason: collision with root package name */
    private final long f140b;

    /* renamed from: c  reason: collision with root package name */
    private final float f141c;

    /* compiled from: Shadow.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final o4 a() {
            return o4.f138e;
        }
    }

    public /* synthetic */ o4(long j10, long j11, float f10, qc.h hVar) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f141c;
    }

    public final long c() {
        return this.f139a;
    }

    public final long d() {
        return this.f140b;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        if (!p1.q(this.f139a, o4Var.f139a) || !z0.f.l(this.f140b, o4Var.f140b)) {
            return false;
        }
        if (this.f141c == o4Var.f141c) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((p1.w(this.f139a) * 31) + z0.f.q(this.f140b)) * 31) + Float.floatToIntBits(this.f141c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) p1.x(this.f139a)) + ", offset=" + ((Object) z0.f.v(this.f140b)) + ", blurRadius=" + this.f141c + ')';
    }

    private o4(long j10, long j11, float f10) {
        this.f139a = j10;
        this.f140b = j11;
        this.f141c = f10;
    }

    public /* synthetic */ o4(long j10, long j11, float f10, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? r1.d(4278190080L) : j10, (i10 & 2) != 0 ? z0.f.f26354b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }
}
