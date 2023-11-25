package l6;

/* compiled from: LogEventDropped.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f19576c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f19577a;

    /* renamed from: b  reason: collision with root package name */
    private final b f19578b;

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f19579a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f19580b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f19579a, this.f19580b);
        }

        public a b(long j10) {
            this.f19579a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f19580b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped.java */
    /* loaded from: classes.dex */
    public enum b implements e9.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // e9.c
        public int getNumber() {
            return this.number_;
        }
    }

    c(long j10, b bVar) {
        this.f19577a = j10;
        this.f19578b = bVar;
    }

    public static a c() {
        return new a();
    }

    @e9.d(tag = 1)
    public long a() {
        return this.f19577a;
    }

    @e9.d(tag = 3)
    public b b() {
        return this.f19578b;
    }
}
