package l6;

/* compiled from: StorageMetrics.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f19586c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f19587a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19588b;

    /* compiled from: StorageMetrics.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f19589a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f19590b = 0;

        a() {
        }

        public e a() {
            return new e(this.f19589a, this.f19590b);
        }

        public a b(long j10) {
            this.f19589a = j10;
            return this;
        }

        public a c(long j10) {
            this.f19590b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f19587a = j10;
        this.f19588b = j11;
    }

    public static a c() {
        return new a();
    }

    @e9.d(tag = 1)
    public long a() {
        return this.f19587a;
    }

    @e9.d(tag = 2)
    public long b() {
        return this.f19588b;
    }
}
