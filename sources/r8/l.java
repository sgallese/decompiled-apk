package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* loaded from: classes3.dex */
final class l extends b0.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f22420a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22421b;

    /* renamed from: c  reason: collision with root package name */
    private final b0.e.d.a f22422c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.d.c f22423d;

    /* renamed from: e  reason: collision with root package name */
    private final b0.e.d.AbstractC0517d f22424e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f22425a;

        /* renamed from: b  reason: collision with root package name */
        private String f22426b;

        /* renamed from: c  reason: collision with root package name */
        private b0.e.d.a f22427c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.d.c f22428d;

        /* renamed from: e  reason: collision with root package name */
        private b0.e.d.AbstractC0517d f22429e;

        @Override // r8.b0.e.d.b
        public b0.e.d a() {
            String str = "";
            if (this.f22425a == null) {
                str = " timestamp";
            }
            if (this.f22426b == null) {
                str = str + " type";
            }
            if (this.f22427c == null) {
                str = str + " app";
            }
            if (this.f22428d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f22425a.longValue(), this.f22426b, this.f22427c, this.f22428d, this.f22429e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.d.b
        public b0.e.d.b b(b0.e.d.a aVar) {
            if (aVar != null) {
                this.f22427c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // r8.b0.e.d.b
        public b0.e.d.b c(b0.e.d.c cVar) {
            if (cVar != null) {
                this.f22428d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // r8.b0.e.d.b
        public b0.e.d.b d(b0.e.d.AbstractC0517d abstractC0517d) {
            this.f22429e = abstractC0517d;
            return this;
        }

        @Override // r8.b0.e.d.b
        public b0.e.d.b e(long j10) {
            this.f22425a = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.d.b
        public b0.e.d.b f(String str) {
            if (str != null) {
                this.f22426b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e.d dVar) {
            this.f22425a = Long.valueOf(dVar.e());
            this.f22426b = dVar.f();
            this.f22427c = dVar.b();
            this.f22428d = dVar.c();
            this.f22429e = dVar.d();
        }
    }

    @Override // r8.b0.e.d
    public b0.e.d.a b() {
        return this.f22422c;
    }

    @Override // r8.b0.e.d
    public b0.e.d.c c() {
        return this.f22423d;
    }

    @Override // r8.b0.e.d
    public b0.e.d.AbstractC0517d d() {
        return this.f22424e;
    }

    @Override // r8.b0.e.d
    public long e() {
        return this.f22420a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.d)) {
            return false;
        }
        b0.e.d dVar = (b0.e.d) obj;
        if (this.f22420a == dVar.e() && this.f22421b.equals(dVar.f()) && this.f22422c.equals(dVar.b()) && this.f22423d.equals(dVar.c())) {
            b0.e.d.AbstractC0517d abstractC0517d = this.f22424e;
            if (abstractC0517d == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (abstractC0517d.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.b0.e.d
    public String f() {
        return this.f22421b;
    }

    @Override // r8.b0.e.d
    public b0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j10 = this.f22420a;
        int hashCode2 = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f22421b.hashCode()) * 1000003) ^ this.f22422c.hashCode()) * 1000003) ^ this.f22423d.hashCode()) * 1000003;
        b0.e.d.AbstractC0517d abstractC0517d = this.f22424e;
        if (abstractC0517d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0517d.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "Event{timestamp=" + this.f22420a + ", type=" + this.f22421b + ", app=" + this.f22422c + ", device=" + this.f22423d + ", log=" + this.f22424e + "}";
    }

    private l(long j10, String str, b0.e.d.a aVar, b0.e.d.c cVar, b0.e.d.AbstractC0517d abstractC0517d) {
        this.f22420a = j10;
        this.f22421b = str;
        this.f22422c = aVar;
        this.f22423d = cVar;
        this.f22424e = abstractC0517d;
    }
}
