package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport.java */
/* loaded from: classes3.dex */
final class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f22309b;

    /* renamed from: c  reason: collision with root package name */
    private final String f22310c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22311d;

    /* renamed from: e  reason: collision with root package name */
    private final String f22312e;

    /* renamed from: f  reason: collision with root package name */
    private final String f22313f;

    /* renamed from: g  reason: collision with root package name */
    private final String f22314g;

    /* renamed from: h  reason: collision with root package name */
    private final b0.e f22315h;

    /* renamed from: i  reason: collision with root package name */
    private final b0.d f22316i;

    /* renamed from: j  reason: collision with root package name */
    private final b0.a f22317j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport.java */
    /* renamed from: r8.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0502b extends b0.b {

        /* renamed from: a  reason: collision with root package name */
        private String f22318a;

        /* renamed from: b  reason: collision with root package name */
        private String f22319b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f22320c;

        /* renamed from: d  reason: collision with root package name */
        private String f22321d;

        /* renamed from: e  reason: collision with root package name */
        private String f22322e;

        /* renamed from: f  reason: collision with root package name */
        private String f22323f;

        /* renamed from: g  reason: collision with root package name */
        private b0.e f22324g;

        /* renamed from: h  reason: collision with root package name */
        private b0.d f22325h;

        /* renamed from: i  reason: collision with root package name */
        private b0.a f22326i;

        @Override // r8.b0.b
        public b0 a() {
            String str = "";
            if (this.f22318a == null) {
                str = " sdkVersion";
            }
            if (this.f22319b == null) {
                str = str + " gmpAppId";
            }
            if (this.f22320c == null) {
                str = str + " platform";
            }
            if (this.f22321d == null) {
                str = str + " installationUuid";
            }
            if (this.f22322e == null) {
                str = str + " buildVersion";
            }
            if (this.f22323f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f22318a, this.f22319b, this.f22320c.intValue(), this.f22321d, this.f22322e, this.f22323f, this.f22324g, this.f22325h, this.f22326i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.b
        public b0.b b(b0.a aVar) {
            this.f22326i = aVar;
            return this;
        }

        @Override // r8.b0.b
        public b0.b c(String str) {
            if (str != null) {
                this.f22322e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // r8.b0.b
        public b0.b d(String str) {
            if (str != null) {
                this.f22323f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // r8.b0.b
        public b0.b e(String str) {
            if (str != null) {
                this.f22319b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // r8.b0.b
        public b0.b f(String str) {
            if (str != null) {
                this.f22321d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // r8.b0.b
        public b0.b g(b0.d dVar) {
            this.f22325h = dVar;
            return this;
        }

        @Override // r8.b0.b
        public b0.b h(int i10) {
            this.f22320c = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.b
        public b0.b i(String str) {
            if (str != null) {
                this.f22318a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // r8.b0.b
        public b0.b j(b0.e eVar) {
            this.f22324g = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0502b() {
        }

        private C0502b(b0 b0Var) {
            this.f22318a = b0Var.j();
            this.f22319b = b0Var.f();
            this.f22320c = Integer.valueOf(b0Var.i());
            this.f22321d = b0Var.g();
            this.f22322e = b0Var.d();
            this.f22323f = b0Var.e();
            this.f22324g = b0Var.k();
            this.f22325h = b0Var.h();
            this.f22326i = b0Var.c();
        }
    }

    @Override // r8.b0
    public b0.a c() {
        return this.f22317j;
    }

    @Override // r8.b0
    public String d() {
        return this.f22313f;
    }

    @Override // r8.b0
    public String e() {
        return this.f22314g;
    }

    public boolean equals(Object obj) {
        b0.e eVar;
        b0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f22309b.equals(b0Var.j()) && this.f22310c.equals(b0Var.f()) && this.f22311d == b0Var.i() && this.f22312e.equals(b0Var.g()) && this.f22313f.equals(b0Var.d()) && this.f22314g.equals(b0Var.e()) && ((eVar = this.f22315h) != null ? eVar.equals(b0Var.k()) : b0Var.k() == null) && ((dVar = this.f22316i) != null ? dVar.equals(b0Var.h()) : b0Var.h() == null)) {
            b0.a aVar = this.f22317j;
            if (aVar == null) {
                if (b0Var.c() == null) {
                    return true;
                }
            } else if (aVar.equals(b0Var.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.b0
    public String f() {
        return this.f22310c;
    }

    @Override // r8.b0
    public String g() {
        return this.f22312e;
    }

    @Override // r8.b0
    public b0.d h() {
        return this.f22316i;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((((((this.f22309b.hashCode() ^ 1000003) * 1000003) ^ this.f22310c.hashCode()) * 1000003) ^ this.f22311d) * 1000003) ^ this.f22312e.hashCode()) * 1000003) ^ this.f22313f.hashCode()) * 1000003) ^ this.f22314g.hashCode()) * 1000003;
        b0.e eVar = this.f22315h;
        int i10 = 0;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        int i11 = (hashCode3 ^ hashCode) * 1000003;
        b0.d dVar = this.f22316i;
        if (dVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = dVar.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        b0.a aVar = this.f22317j;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return i12 ^ i10;
    }

    @Override // r8.b0
    public int i() {
        return this.f22311d;
    }

    @Override // r8.b0
    public String j() {
        return this.f22309b;
    }

    @Override // r8.b0
    public b0.e k() {
        return this.f22315h;
    }

    @Override // r8.b0
    protected b0.b l() {
        return new C0502b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f22309b + ", gmpAppId=" + this.f22310c + ", platform=" + this.f22311d + ", installationUuid=" + this.f22312e + ", buildVersion=" + this.f22313f + ", displayVersion=" + this.f22314g + ", session=" + this.f22315h + ", ndkPayload=" + this.f22316i + ", appExitInfo=" + this.f22317j + "}";
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, b0.e eVar, b0.d dVar, b0.a aVar) {
        this.f22309b = str;
        this.f22310c = str2;
        this.f22311d = i10;
        this.f22312e = str3;
        this.f22313f = str4;
        this.f22314g = str5;
        this.f22315h = eVar;
        this.f22316i = dVar;
        this.f22317j = aVar;
    }
}
