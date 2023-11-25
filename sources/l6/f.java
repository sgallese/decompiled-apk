package l6;

/* compiled from: TimeWindow.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f19591c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f19592a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19593b;

    /* compiled from: TimeWindow.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f19594a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f19595b = 0;

        a() {
        }

        public f a() {
            return new f(this.f19594a, this.f19595b);
        }

        public a b(long j10) {
            this.f19595b = j10;
            return this;
        }

        public a c(long j10) {
            this.f19594a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f19592a = j10;
        this.f19593b = j11;
    }

    public static a c() {
        return new a();
    }

    @e9.d(tag = 2)
    public long a() {
        return this.f19593b;
    }

    @e9.d(tag = 1)
    public long b() {
        return this.f19592a;
    }
}
