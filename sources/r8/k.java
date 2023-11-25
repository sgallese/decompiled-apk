package r8;

import r8.b0;

/* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
/* loaded from: classes3.dex */
final class k extends b0.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f22402a;

    /* renamed from: b  reason: collision with root package name */
    private final String f22403b;

    /* renamed from: c  reason: collision with root package name */
    private final int f22404c;

    /* renamed from: d  reason: collision with root package name */
    private final long f22405d;

    /* renamed from: e  reason: collision with root package name */
    private final long f22406e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f22407f;

    /* renamed from: g  reason: collision with root package name */
    private final int f22408g;

    /* renamed from: h  reason: collision with root package name */
    private final String f22409h;

    /* renamed from: i  reason: collision with root package name */
    private final String f22410i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Device.java */
    /* loaded from: classes3.dex */
    public static final class b extends b0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f22411a;

        /* renamed from: b  reason: collision with root package name */
        private String f22412b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f22413c;

        /* renamed from: d  reason: collision with root package name */
        private Long f22414d;

        /* renamed from: e  reason: collision with root package name */
        private Long f22415e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f22416f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f22417g;

        /* renamed from: h  reason: collision with root package name */
        private String f22418h;

        /* renamed from: i  reason: collision with root package name */
        private String f22419i;

        @Override // r8.b0.e.c.a
        public b0.e.c a() {
            String str = "";
            if (this.f22411a == null) {
                str = " arch";
            }
            if (this.f22412b == null) {
                str = str + " model";
            }
            if (this.f22413c == null) {
                str = str + " cores";
            }
            if (this.f22414d == null) {
                str = str + " ram";
            }
            if (this.f22415e == null) {
                str = str + " diskSpace";
            }
            if (this.f22416f == null) {
                str = str + " simulator";
            }
            if (this.f22417g == null) {
                str = str + " state";
            }
            if (this.f22418h == null) {
                str = str + " manufacturer";
            }
            if (this.f22419i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f22411a.intValue(), this.f22412b, this.f22413c.intValue(), this.f22414d.longValue(), this.f22415e.longValue(), this.f22416f.booleanValue(), this.f22417g.intValue(), this.f22418h, this.f22419i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a b(int i10) {
            this.f22411a = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a c(int i10) {
            this.f22413c = Integer.valueOf(i10);
            return this;
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a d(long j10) {
            this.f22415e = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a e(String str) {
            if (str != null) {
                this.f22418h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a f(String str) {
            if (str != null) {
                this.f22412b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a g(String str) {
            if (str != null) {
                this.f22419i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a h(long j10) {
            this.f22414d = Long.valueOf(j10);
            return this;
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a i(boolean z10) {
            this.f22416f = Boolean.valueOf(z10);
            return this;
        }

        @Override // r8.b0.e.c.a
        public b0.e.c.a j(int i10) {
            this.f22417g = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // r8.b0.e.c
    public int b() {
        return this.f22402a;
    }

    @Override // r8.b0.e.c
    public int c() {
        return this.f22404c;
    }

    @Override // r8.b0.e.c
    public long d() {
        return this.f22406e;
    }

    @Override // r8.b0.e.c
    public String e() {
        return this.f22409h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0.e.c)) {
            return false;
        }
        b0.e.c cVar = (b0.e.c) obj;
        if (this.f22402a == cVar.b() && this.f22403b.equals(cVar.f()) && this.f22404c == cVar.c() && this.f22405d == cVar.h() && this.f22406e == cVar.d() && this.f22407f == cVar.j() && this.f22408g == cVar.i() && this.f22409h.equals(cVar.e()) && this.f22410i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // r8.b0.e.c
    public String f() {
        return this.f22403b;
    }

    @Override // r8.b0.e.c
    public String g() {
        return this.f22410i;
    }

    @Override // r8.b0.e.c
    public long h() {
        return this.f22405d;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((this.f22402a ^ 1000003) * 1000003) ^ this.f22403b.hashCode()) * 1000003) ^ this.f22404c) * 1000003;
        long j10 = this.f22405d;
        int i11 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f22406e;
        int i12 = (i11 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.f22407f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return ((((((i12 ^ i10) * 1000003) ^ this.f22408g) * 1000003) ^ this.f22409h.hashCode()) * 1000003) ^ this.f22410i.hashCode();
    }

    @Override // r8.b0.e.c
    public int i() {
        return this.f22408g;
    }

    @Override // r8.b0.e.c
    public boolean j() {
        return this.f22407f;
    }

    public String toString() {
        return "Device{arch=" + this.f22402a + ", model=" + this.f22403b + ", cores=" + this.f22404c + ", ram=" + this.f22405d + ", diskSpace=" + this.f22406e + ", simulator=" + this.f22407f + ", state=" + this.f22408g + ", manufacturer=" + this.f22409h + ", modelClass=" + this.f22410i + "}";
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f22402a = i10;
        this.f22403b = str;
        this.f22404c = i11;
        this.f22405d = j10;
        this.f22406e = j11;
        this.f22407f = z10;
        this.f22408g = i12;
        this.f22409h = str2;
        this.f22410i = str3;
    }
}
