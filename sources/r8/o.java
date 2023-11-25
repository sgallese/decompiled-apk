package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* loaded from: classes3.dex */
final class o extends b0.e.d.a.b.AbstractC0507a {

    /* renamed from: a  reason: collision with root package name */
    private final long f22450a;

    /* renamed from: b  reason: collision with root package name */
    private final long f22451b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22452c;

    /* renamed from: d  reason: collision with root package name */
    private final String f22453d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0507a.AbstractC0508a {

        /* renamed from: a  reason: collision with root package name */
        private Long f22454a;

        /* renamed from: b  reason: collision with root package name */
        private Long f22455b;

        /* renamed from: c  reason: collision with root package name */
        private String f22456c;

        /* renamed from: d  reason: collision with root package name */
        private String f22457d;

        @Override // r8.b0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public b0.e.d.a.b.AbstractC0507a a() {
            String str = "";
            if (this.f22454a == null) {
                str = " baseAddress";
            }
            if (this.f22455b == null) {
                str = str + " size";
            }
            if (this.f22456c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f22454a.longValue(), this.f22455b.longValue(), this.f22456c, this.f22457d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public b0.e.d.a.b.AbstractC0507a.AbstractC0508a b(long j10) {
            this.f22454a = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public b0.e.d.a.b.AbstractC0507a.AbstractC0508a c(String str) {
            if (str != null) {
                this.f22456c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // r8.b0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public b0.e.d.a.b.AbstractC0507a.AbstractC0508a d(long j10) {
            this.f22455b = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public b0.e.d.a.b.AbstractC0507a.AbstractC0508a e(String str) {
            this.f22457d = str;
            return this;
        }
    }

    @Override // r8.b0.e.d.a.b.AbstractC0507a
    public long b() {
        return this.f22450a;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0507a
    public String c() {
        return this.f22452c;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0507a
    public long d() {
        return this.f22451b;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0507a
    public String e() {
        return this.f22453d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0507a)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0507a abstractC0507a = (b0.e.d.a.b.AbstractC0507a) obj;
        if (this.f22450a == abstractC0507a.b() && this.f22451b == abstractC0507a.d() && this.f22452c.equals(abstractC0507a.c())) {
            String str = this.f22453d;
            if (str == null) {
                if (abstractC0507a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0507a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f22450a;
        long j11 = this.f22451b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f22452c.hashCode()) * 1000003;
        String str = this.f22453d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f22450a + ", size=" + this.f22451b + ", name=" + this.f22452c + ", uuid=" + this.f22453d + "}";
    }

    private o(long j10, long j11, String str, String str2) {
        this.f22450a = j10;
        this.f22451b = j11;
        this.f22452c = str;
        this.f22453d = str2;
    }
}
