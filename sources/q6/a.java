package q6;

import q6.e;

/* compiled from: AutoValue_EventStoreConfig.java */
/* loaded from: classes.dex */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f21483b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21484c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21485d;

    /* renamed from: e  reason: collision with root package name */
    private final long f21486e;

    /* renamed from: f  reason: collision with root package name */
    private final int f21487f;

    /* compiled from: AutoValue_EventStoreConfig.java */
    /* loaded from: classes.dex */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f21488a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f21489b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f21490c;

        /* renamed from: d  reason: collision with root package name */
        private Long f21491d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f21492e;

        @Override // q6.e.a
        e a() {
            String str = "";
            if (this.f21488a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f21489b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f21490c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f21491d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f21492e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f21488a.longValue(), this.f21489b.intValue(), this.f21490c.intValue(), this.f21491d.longValue(), this.f21492e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // q6.e.a
        e.a b(int i10) {
            this.f21490c = Integer.valueOf(i10);
            return this;
        }

        @Override // q6.e.a
        e.a c(long j10) {
            this.f21491d = Long.valueOf(j10);
            return this;
        }

        @Override // q6.e.a
        e.a d(int i10) {
            this.f21489b = Integer.valueOf(i10);
            return this;
        }

        @Override // q6.e.a
        e.a e(int i10) {
            this.f21492e = Integer.valueOf(i10);
            return this;
        }

        @Override // q6.e.a
        e.a f(long j10) {
            this.f21488a = Long.valueOf(j10);
            return this;
        }
    }

    @Override // q6.e
    int b() {
        return this.f21485d;
    }

    @Override // q6.e
    long c() {
        return this.f21486e;
    }

    @Override // q6.e
    int d() {
        return this.f21484c;
    }

    @Override // q6.e
    int e() {
        return this.f21487f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f21483b == eVar.f() && this.f21484c == eVar.d() && this.f21485d == eVar.b() && this.f21486e == eVar.c() && this.f21487f == eVar.e()) {
            return true;
        }
        return false;
    }

    @Override // q6.e
    long f() {
        return this.f21483b;
    }

    public int hashCode() {
        long j10 = this.f21483b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f21484c) * 1000003) ^ this.f21485d) * 1000003;
        long j11 = this.f21486e;
        return this.f21487f ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f21483b + ", loadBatchSize=" + this.f21484c + ", criticalSectionEnterTimeoutMs=" + this.f21485d + ", eventCleanUpAge=" + this.f21486e + ", maxBlobByteSizePerRow=" + this.f21487f + "}";
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f21483b = j10;
        this.f21484c = i10;
        this.f21485d = i11;
        this.f21486e = j11;
        this.f21487f = i12;
    }
}
