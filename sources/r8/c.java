package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
/* loaded from: classes3.dex */
final class c extends b0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f22328a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22329b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22330c;

    /* renamed from: d  reason: collision with root package name */
    private final int f22331d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22332e;

    /* renamed from: f  reason: collision with root package name */
    private final long f22333f;

    /* renamed from: g  reason: collision with root package name */
    private final long f22334g;

    /* renamed from: h  reason: collision with root package name */
    private final String f22335h;

    /* renamed from: i  reason: collision with root package name */
    private final c0<b0.a.AbstractC0503a> f22336i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.a.b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f22337a;

        /* renamed from: b  reason: collision with root package name */
        private String f22338b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f22339c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f22340d;

        /* renamed from: e  reason: collision with root package name */
        private Long f22341e;

        /* renamed from: f  reason: collision with root package name */
        private Long f22342f;

        /* renamed from: g  reason: collision with root package name */
        private Long f22343g;

        /* renamed from: h  reason: collision with root package name */
        private String f22344h;

        /* renamed from: i  reason: collision with root package name */
        private c0<b0.a.AbstractC0503a> f22345i;

        @Override // r8.b0.a.b
        public b0.a a() {
            String str = "";
            if (this.f22337a == null) {
                str = " pid";
            }
            if (this.f22338b == null) {
                str = str + " processName";
            }
            if (this.f22339c == null) {
                str = str + " reasonCode";
            }
            if (this.f22340d == null) {
                str = str + " importance";
            }
            if (this.f22341e == null) {
                str = str + " pss";
            }
            if (this.f22342f == null) {
                str = str + " rss";
            }
            if (this.f22343g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f22337a.intValue(), this.f22338b, this.f22339c.intValue(), this.f22340d.intValue(), this.f22341e.longValue(), this.f22342f.longValue(), this.f22343g.longValue(), this.f22344h, this.f22345i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.a.b
        public b0.a.b b(c0<b0.a.AbstractC0503a> c0Var) {
            this.f22345i = c0Var;
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b c(int i10) {
            this.f22340d = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b d(int i10) {
            this.f22337a = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b e(String str) {
            if (str != null) {
                this.f22338b = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        @Override // r8.b0.a.b
        public b0.a.b f(long j10) {
            this.f22341e = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b g(int i10) {
            this.f22339c = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b h(long j10) {
            this.f22342f = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b i(long j10) {
            this.f22343g = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.a.b
        public b0.a.b j(String str) {
            this.f22344h = str;
            return this;
        }
    }

    @Override // r8.b0.a
    public c0<b0.a.AbstractC0503a> b() {
        return this.f22336i;
    }

    @Override // r8.b0.a
    public int c() {
        return this.f22331d;
    }

    @Override // r8.b0.a
    public int d() {
        return this.f22328a;
    }

    @Override // r8.b0.a
    public String e() {
        return this.f22329b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.a)) {
            return false;
        }
        b0.a aVar = (b0.a) obj;
        if (this.f22328a == aVar.d() && this.f22329b.equals(aVar.e()) && this.f22330c == aVar.g() && this.f22331d == aVar.c() && this.f22332e == aVar.f() && this.f22333f == aVar.h() && this.f22334g == aVar.i() && ((str = this.f22335h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            c0<b0.a.AbstractC0503a> c0Var = this.f22336i;
            if (c0Var == null) {
                if (aVar.b() == null) {
                    return true;
                }
            } else if (c0Var.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // r8.b0.a
    public long f() {
        return this.f22332e;
    }

    @Override // r8.b0.a
    public int g() {
        return this.f22330c;
    }

    @Override // r8.b0.a
    public long h() {
        return this.f22333f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f22328a ^ 1000003) * 1000003) ^ this.f22329b.hashCode()) * 1000003) ^ this.f22330c) * 1000003) ^ this.f22331d) * 1000003;
        long j10 = this.f22332e;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22333f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f22334g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f22335h;
        int i13 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i14 = (i12 ^ hashCode) * 1000003;
        c0<b0.a.AbstractC0503a> c0Var = this.f22336i;
        if (c0Var != null) {
            i13 = c0Var.hashCode();
        }
        return i14 ^ i13;
    }

    @Override // r8.b0.a
    public long i() {
        return this.f22334g;
    }

    @Override // r8.b0.a
    public String j() {
        return this.f22335h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f22328a + ", processName=" + this.f22329b + ", reasonCode=" + this.f22330c + ", importance=" + this.f22331d + ", pss=" + this.f22332e + ", rss=" + this.f22333f + ", timestamp=" + this.f22334g + ", traceFile=" + this.f22335h + ", buildIdMappingForArch=" + this.f22336i + "}";
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, c0<b0.a.AbstractC0503a> c0Var) {
        this.f22328a = i10;
        this.f22329b = str;
        this.f22330c = i11;
        this.f22331d = i12;
        this.f22332e = j10;
        this.f22333f = j11;
        this.f22334g = j12;
        this.f22335h = str2;
        this.f22336i = c0Var;
    }
}
