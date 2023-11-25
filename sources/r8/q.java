package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* loaded from: classes3.dex */
final class q extends b0.e.d.a.b.AbstractC0511d {

    /* renamed from: a  reason: collision with root package name */
    private final String f22468a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22469b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22470c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.a.b.AbstractC0511d.AbstractC0512a {

        /* renamed from: a  reason: collision with root package name */
        private String f22471a;

        /* renamed from: b  reason: collision with root package name */
        private String f22472b;

        /* renamed from: c  reason: collision with root package name */
        private Long f22473c;

        @Override // r8.b0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public b0.e.d.a.b.AbstractC0511d a() {
            String str = "";
            if (this.f22471a == null) {
                str = " name";
            }
            if (this.f22472b == null) {
                str = str + " code";
            }
            if (this.f22473c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f22471a, this.f22472b, this.f22473c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public b0.e.d.a.b.AbstractC0511d.AbstractC0512a b(long j10) {
            this.f22473c = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public b0.e.d.a.b.AbstractC0511d.AbstractC0512a c(String str) {
            if (str != null) {
                this.f22472b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // r8.b0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public b0.e.d.a.b.AbstractC0511d.AbstractC0512a d(String str) {
            if (str != null) {
                this.f22471a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // r8.b0.e.d.a.b.AbstractC0511d
    public long b() {
        return this.f22470c;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0511d
    public String c() {
        return this.f22469b;
    }

    @Override // r8.b0.e.d.a.b.AbstractC0511d
    public String d() {
        return this.f22468a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d.a.b.AbstractC0511d)) {
            return false;
        }
        b0.e.d.a.b.AbstractC0511d abstractC0511d = (b0.e.d.a.b.AbstractC0511d) obj;
        if (this.f22468a.equals(abstractC0511d.d()) && this.f22469b.equals(abstractC0511d.c()) && this.f22470c == abstractC0511d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f22468a.hashCode() ^ 1000003) * 1000003) ^ this.f22469b.hashCode()) * 1000003;
        long j10 = this.f22470c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f22468a + ", code=" + this.f22469b + ", address=" + this.f22470c + "}";
    }

    private q(String str, String str2, long j10) {
        this.f22468a = str;
        this.f22469b = str2;
        this.f22470c = j10;
    }
}
