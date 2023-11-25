package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* loaded from: classes3.dex */
final class s extends b0.e.d.a.b.AbstractC0513e.AbstractC0515b {

    /* renamed from: a  reason: collision with root package name */
    private final long f22480a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22481b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22482c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22483d;

    /* renamed from: e  reason: collision with root package name */
    private final int f22484e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a {

        /* renamed from: a  reason: collision with root package name */
        private Long f22485a;

        /* renamed from: b  reason: collision with root package name */
        private String f22486b;

        /* renamed from: c  reason: collision with root package name */
        private String f22487c;

        /* renamed from: d  reason: collision with root package name */
        private Long f22488d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f22489e;

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b a() {
            String str = "";
            if (this.f22485a == null) {
                str = " pc";
            }
            if (this.f22486b == null) {
                str = str + " symbol";
            }
            if (this.f22488d == null) {
                str = str + " offset";
            }
            if (this.f22489e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f22485a.longValue(), this.f22486b, this.f22487c, this.f22488d.longValue(), this.f22489e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a b(String str) {
            this.f22487c = str;
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a c(int i10) {
            this.f22489e = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a d(long j10) {
            this.f22488d = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a e(long j10) {
            this.f22485a = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public b0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a f(String str) {
            if (str != null) {
                this.f22486b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public String b() {
        return this.f22482c;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public int c() {
        return this.f22484e;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public long d() {
        return this.f22483d;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public long e() {
        return this.f22480a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0513e.AbstractC0515b)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0513e.AbstractC0515b abstractC0515b = (b0.e.d.a.b.AbstractC0513e.AbstractC0515b) obj;
        if (this.f22480a == abstractC0515b.e() && this.f22481b.equals(abstractC0515b.f()) && ((str = this.f22482c) != null ? str.equals(abstractC0515b.b()) : abstractC0515b.b() == null) && this.f22483d == abstractC0515b.d() && this.f22484e == abstractC0515b.c()) {
            return true;
        }
        return false;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public String f() {
        return this.f22481b;
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f22480a;
        int hashCode2 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f22481b.hashCode()) * 1000003;
        String str = this.f22482c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        long j11 = this.f22483d;
        return this.f22484e ^ ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f22480a + ", symbol=" + this.f22481b + ", file=" + this.f22482c + ", offset=" + this.f22483d + ", importance=" + this.f22484e + "}";
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f22480a = j10;
        this.f22481b = str;
        this.f22482c = str2;
        this.f22483d = j11;
        this.f22484e = i10;
    }
}
