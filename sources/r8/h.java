package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* loaded from: classes3.dex */
final class h extends b0.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f22365a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22366b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22367c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f22368d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f22369e;

    /* renamed from: f  reason: collision with root package name */
    private final b0.e.a f22370f;

    /* renamed from: g  reason: collision with root package name */
    private final b0.e.f f22371g;

    /* renamed from: h  reason: collision with root package name */
    private final b0.e.AbstractC0518e f22372h;

    /* renamed from: i  reason: collision with root package name */
    private final b0.e.c f22373i;

    /* renamed from: j  reason: collision with root package name */
    private final c0<b0.e.d> f22374j;

    /* renamed from: k  reason: collision with root package name */
    private final int f22375k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f22376a;

        /* renamed from: b  reason: collision with root package name */
        private String f22377b;

        /* renamed from: c  reason: collision with root package name */
        private Long f22378c;

        /* renamed from: d  reason: collision with root package name */
        private Long f22379d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f22380e;

        /* renamed from: f  reason: collision with root package name */
        private b0.e.a f22381f;

        /* renamed from: g  reason: collision with root package name */
        private b0.e.f f22382g;

        /* renamed from: h  reason: collision with root package name */
        private b0.e.AbstractC0518e f22383h;

        /* renamed from: i  reason: collision with root package name */
        private b0.e.c f22384i;

        /* renamed from: j  reason: collision with root package name */
        private c0<b0.e.d> f22385j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f22386k;

        @Override // r8.b0.e.b
        public b0.e a() {
            String str = "";
            if (this.f22376a == null) {
                str = " generator";
            }
            if (this.f22377b == null) {
                str = str + " identifier";
            }
            if (this.f22378c == null) {
                str = str + " startedAt";
            }
            if (this.f22380e == null) {
                str = str + " crashed";
            }
            if (this.f22381f == null) {
                str = str + " app";
            }
            if (this.f22386k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f22376a, this.f22377b, this.f22378c.longValue(), this.f22379d, this.f22380e.booleanValue(), this.f22381f, this.f22382g, this.f22383h, this.f22384i, this.f22385j, this.f22386k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.b
        public b0.e.b b(b0.e.a aVar) {
            if (aVar != null) {
                this.f22381f = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // r8.b0.e.b
        public b0.e.b c(boolean z10) {
            this.f22380e = Boolean.valueOf(z10);
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b d(b0.e.c cVar) {
            this.f22384i = cVar;
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b e(Long l10) {
            this.f22379d = l10;
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b f(c0<b0.e.d> c0Var) {
            this.f22385j = c0Var;
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b g(String str) {
            if (str != null) {
                this.f22376a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // r8.b0.e.b
        public b0.e.b h(int i10) {
            this.f22386k = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b i(String str) {
            if (str != null) {
                this.f22377b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // r8.b0.e.b
        public b0.e.b k(b0.e.AbstractC0518e abstractC0518e) {
            this.f22383h = abstractC0518e;
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b l(long j10) {
            this.f22378c = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.b
        public b0.e.b m(b0.e.f fVar) {
            this.f22382g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(b0.e eVar) {
            this.f22376a = eVar.f();
            this.f22377b = eVar.h();
            this.f22378c = Long.valueOf(eVar.k());
            this.f22379d = eVar.d();
            this.f22380e = Boolean.valueOf(eVar.m());
            this.f22381f = eVar.b();
            this.f22382g = eVar.l();
            this.f22383h = eVar.j();
            this.f22384i = eVar.c();
            this.f22385j = eVar.e();
            this.f22386k = Integer.valueOf(eVar.g());
        }
    }

    @Override // r8.b0.e
    public b0.e.a b() {
        return this.f22370f;
    }

    @Override // r8.b0.e
    public b0.e.c c() {
        return this.f22373i;
    }

    @Override // r8.b0.e
    public Long d() {
        return this.f22368d;
    }

    @Override // r8.b0.e
    public c0<b0.e.d> e() {
        return this.f22374j;
    }

    public boolean equals(Object obj) {
        Long l10;
        b0.e.f fVar;
        b0.e.AbstractC0518e abstractC0518e;
        b0.e.c cVar;
        c0<b0.e.d> c0Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e)) {
            return false;
        }
        b0.e eVar = (b0.e) obj;
        if (this.f22365a.equals(eVar.f()) && this.f22366b.equals(eVar.h()) && this.f22367c == eVar.k() && ((l10 = this.f22368d) != null ? l10.equals(eVar.d()) : eVar.d() == null) && this.f22369e == eVar.m() && this.f22370f.equals(eVar.b()) && ((fVar = this.f22371g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0518e = this.f22372h) != null ? abstractC0518e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.f22373i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((c0Var = this.f22374j) != null ? c0Var.equals(eVar.e()) : eVar.e() == null) && this.f22375k == eVar.g()) {
            return true;
        }
        return false;
    }

    @Override // r8.b0.e
    public String f() {
        return this.f22365a;
    }

    @Override // r8.b0.e
    public int g() {
        return this.f22375k;
    }

    @Override // r8.b0.e
    public String h() {
        return this.f22366b;
    }

    public int hashCode() {
        int hashCode;
        int i10;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (((this.f22365a.hashCode() ^ 1000003) * 1000003) ^ this.f22366b.hashCode()) * 1000003;
        long j10 = this.f22367c;
        int i11 = (hashCode5 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f22368d;
        int i12 = 0;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        int i13 = (i11 ^ hashCode) * 1000003;
        if (this.f22369e) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int hashCode6 = (((i13 ^ i10) * 1000003) ^ this.f22370f.hashCode()) * 1000003;
        b0.e.f fVar = this.f22371g;
        if (fVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fVar.hashCode();
        }
        int i14 = (hashCode6 ^ hashCode2) * 1000003;
        b0.e.AbstractC0518e abstractC0518e = this.f22372h;
        if (abstractC0518e == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = abstractC0518e.hashCode();
        }
        int i15 = (i14 ^ hashCode3) * 1000003;
        b0.e.c cVar = this.f22373i;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i16 = (i15 ^ hashCode4) * 1000003;
        c0<b0.e.d> c0Var = this.f22374j;
        if (c0Var != null) {
            i12 = c0Var.hashCode();
        }
        return ((i16 ^ i12) * 1000003) ^ this.f22375k;
    }

    @Override // r8.b0.e
    public b0.e.AbstractC0518e j() {
        return this.f22372h;
    }

    @Override // r8.b0.e
    public long k() {
        return this.f22367c;
    }

    @Override // r8.b0.e
    public b0.e.f l() {
        return this.f22371g;
    }

    @Override // r8.b0.e
    public boolean m() {
        return this.f22369e;
    }

    @Override // r8.b0.e
    public b0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f22365a + ", identifier=" + this.f22366b + ", startedAt=" + this.f22367c + ", endedAt=" + this.f22368d + ", crashed=" + this.f22369e + ", app=" + this.f22370f + ", user=" + this.f22371g + ", os=" + this.f22372h + ", device=" + this.f22373i + ", events=" + this.f22374j + ", generatorType=" + this.f22375k + "}";
    }

    private h(String str, String str2, long j10, Long l10, boolean z10, b0.e.a aVar, b0.e.f fVar, b0.e.AbstractC0518e abstractC0518e, b0.e.c cVar, c0<b0.e.d> c0Var, int i10) {
        this.f22365a = str;
        this.f22366b = str2;
        this.f22367c = j10;
        this.f22368d = l10;
        this.f22369e = z10;
        this.f22370f = aVar;
        this.f22371g = fVar;
        this.f22372h = abstractC0518e;
        this.f22373i = cVar;
        this.f22374j = c0Var;
        this.f22375k = i10;
    }
}
