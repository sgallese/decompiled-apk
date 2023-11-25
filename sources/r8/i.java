package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
/* loaded from: classes3.dex */
final class i extends b0.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f22387a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22388b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22389c;

    /* renamed from: d  reason: collision with root package name */
    private final b0.e.a.b f22390d;

    /* renamed from: e  reason: collision with root package name */
    private final String f22391e;

    /* renamed from: f  reason: collision with root package name */
    private final String f22392f;

    /* renamed from: g  reason: collision with root package name */
    private final String f22393g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Application.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.a.AbstractC0505a {

        /* renamed from: a  reason: collision with root package name */
        private String f22394a;

        /* renamed from: b  reason: collision with root package name */
        private String f22395b;

        /* renamed from: c  reason: collision with root package name */
        private String f22396c;

        /* renamed from: d  reason: collision with root package name */
        private b0.e.a.b f22397d;

        /* renamed from: e  reason: collision with root package name */
        private String f22398e;

        /* renamed from: f  reason: collision with root package name */
        private String f22399f;

        /* renamed from: g  reason: collision with root package name */
        private String f22400g;

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a a() {
            String str = "";
            if (this.f22394a == null) {
                str = " identifier";
            }
            if (this.f22395b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f22394a, this.f22395b, this.f22396c, this.f22397d, this.f22398e, this.f22399f, this.f22400g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a b(String str) {
            this.f22399f = str;
            return this;
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a c(String str) {
            this.f22400g = str;
            return this;
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a d(String str) {
            this.f22396c = str;
            return this;
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a e(String str) {
            if (str != null) {
                this.f22394a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a f(String str) {
            this.f22398e = str;
            return this;
        }

        @Override // r8.b0.e.a.AbstractC0505a
        public b0.e.a.AbstractC0505a g(String str) {
            if (str != null) {
                this.f22395b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // r8.b0.e.a
    public String b() {
        return this.f22392f;
    }

    @Override // r8.b0.e.a
    public String c() {
        return this.f22393g;
    }

    @Override // r8.b0.e.a
    public String d() {
        return this.f22389c;
    }

    @Override // r8.b0.e.a
    public String e() {
        return this.f22387a;
    }

    public boolean equals(Object obj) {
        String str;
        b0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.a)) {
            return false;
        }
        b0.e.a aVar = (b0.e.a) obj;
        if (this.f22387a.equals(aVar.e()) && this.f22388b.equals(aVar.h()) && ((str = this.f22389c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f22390d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f22391e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f22392f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f22393g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.b0.e.a
    public String f() {
        return this.f22391e;
    }

    @Override // r8.b0.e.a
    public b0.e.a.b g() {
        return this.f22390d;
    }

    @Override // r8.b0.e.a
    public String h() {
        return this.f22388b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f22387a.hashCode() ^ 1000003) * 1000003) ^ this.f22388b.hashCode()) * 1000003;
        String str = this.f22389c;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode) * 1000003;
        b0.e.a.b bVar = this.f22390d;
        if (bVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f22391e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.f22392f;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.f22393g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i14 ^ i10;
    }

    public String toString() {
        return "Application{identifier=" + this.f22387a + ", version=" + this.f22388b + ", displayVersion=" + this.f22389c + ", organization=" + this.f22390d + ", installationUuid=" + this.f22391e + ", developmentPlatform=" + this.f22392f + ", developmentPlatformVersion=" + this.f22393g + "}";
    }

    private i(String str, String str2, String str3, b0.e.a.b bVar, String str4, String str5, String str6) {
        this.f22387a = str;
        this.f22388b = str2;
        this.f22389c = str3;
        this.f22390d = bVar;
        this.f22391e = str4;
        this.f22392f = str5;
        this.f22393g = str6;
    }
}
