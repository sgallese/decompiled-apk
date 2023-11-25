package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
/* loaded from: classes3.dex */
final class t extends b0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f22490a;

    /* renamed from: b  reason: collision with root package name */
    private final int f22491b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f22492c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22493d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22494e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22495f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Device.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f22496a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f22497b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f22498c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f22499d;

        /* renamed from: e  reason: collision with root package name */
        private Long f22500e;

        /* renamed from: f  reason: collision with root package name */
        private Long f22501f;

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c a() {
            String str = "";
            if (this.f22497b == null) {
                str = " batteryVelocity";
            }
            if (this.f22498c == null) {
                str = str + " proximityOn";
            }
            if (this.f22499d == null) {
                str = str + " orientation";
            }
            if (this.f22500e == null) {
                str = str + " ramUsed";
            }
            if (this.f22501f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new t(this.f22496a, this.f22497b.intValue(), this.f22498c.booleanValue(), this.f22499d.intValue(), this.f22500e.longValue(), this.f22501f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a b(Double d10) {
            this.f22496a = d10;
            return this;
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a c(int i10) {
            this.f22497b = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a d(long j10) {
            this.f22501f = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a e(int i10) {
            this.f22499d = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a f(boolean z10) {
            this.f22498c = Boolean.valueOf(z10);
            return this;
        }

        @Override // r8.b0.e.d.c.a
        public b0.e.d.c.a g(long j10) {
            this.f22500e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // r8.b0.e.d.c
    public Double b() {
        return this.f22490a;
    }

    @Override // r8.b0.e.d.c
    public int c() {
        return this.f22491b;
    }

    @Override // r8.b0.e.d.c
    public long d() {
        return this.f22495f;
    }

    @Override // r8.b0.e.d.c
    public int e() {
        return this.f22493d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.c)) {
            return false;
        }
        b0.e.d.c cVar = (b0.e.d.c) obj;
        Double d10 = this.f22490a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f22491b == cVar.c() && this.f22492c == cVar.g() && this.f22493d == cVar.e() && this.f22494e == cVar.f() && this.f22495f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.b0.e.d.c
    public long f() {
        return this.f22494e;
    }

    @Override // r8.b0.e.d.c
    public boolean g() {
        return this.f22492c;
    }

    public int hashCode() {
        int hashCode;
        int i10;
        Double d10 = this.f22490a;
        if (d10 == null) {
            hashCode = 0;
        } else {
            hashCode = d10.hashCode();
        }
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ this.f22491b) * 1000003;
        if (this.f22492c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (((i11 ^ i10) * 1000003) ^ this.f22493d) * 1000003;
        long j10 = this.f22494e;
        long j11 = this.f22495f;
        return ((i12 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f22490a + ", batteryVelocity=" + this.f22491b + ", proximityOn=" + this.f22492c + ", orientation=" + this.f22493d + ", ramUsed=" + this.f22494e + ", diskUsed=" + this.f22495f + "}";
    }

    private t(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f22490a = d10;
        this.f22491b = i10;
        this.f22492c = z10;
        this.f22493d = i11;
        this.f22494e = j10;
        this.f22495f = j11;
    }
}
