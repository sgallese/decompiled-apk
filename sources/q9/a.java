package q9;

/* compiled from: MessagingClientEvent.java */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: p  reason: collision with root package name */
    private static final a f21612p = new C0483a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f21613a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21614b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21615c;

    /* renamed from: d  reason: collision with root package name */
    private final c f21616d;

    /* renamed from: e  reason: collision with root package name */
    private final d f21617e;

    /* renamed from: f  reason: collision with root package name */
    private final String f21618f;

    /* renamed from: g  reason: collision with root package name */
    private final String f21619g;

    /* renamed from: h  reason: collision with root package name */
    private final int f21620h;

    /* renamed from: i  reason: collision with root package name */
    private final int f21621i;

    /* renamed from: j  reason: collision with root package name */
    private final String f21622j;

    /* renamed from: k  reason: collision with root package name */
    private final long f21623k;

    /* renamed from: l  reason: collision with root package name */
    private final b f21624l;

    /* renamed from: m  reason: collision with root package name */
    private final String f21625m;

    /* renamed from: n  reason: collision with root package name */
    private final long f21626n;

    /* renamed from: o  reason: collision with root package name */
    private final String f21627o;

    /* compiled from: MessagingClientEvent.java */
    /* renamed from: q9.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0483a {

        /* renamed from: a  reason: collision with root package name */
        private long f21628a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f21629b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f21630c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f21631d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f21632e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f21633f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f21634g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f21635h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f21636i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f21637j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f21638k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f21639l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f21640m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f21641n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f21642o = "";

        C0483a() {
        }

        public a a() {
            return new a(this.f21628a, this.f21629b, this.f21630c, this.f21631d, this.f21632e, this.f21633f, this.f21634g, this.f21635h, this.f21636i, this.f21637j, this.f21638k, this.f21639l, this.f21640m, this.f21641n, this.f21642o);
        }

        public C0483a b(String str) {
            this.f21640m = str;
            return this;
        }

        public C0483a c(String str) {
            this.f21634g = str;
            return this;
        }

        public C0483a d(String str) {
            this.f21642o = str;
            return this;
        }

        public C0483a e(b bVar) {
            this.f21639l = bVar;
            return this;
        }

        public C0483a f(String str) {
            this.f21630c = str;
            return this;
        }

        public C0483a g(String str) {
            this.f21629b = str;
            return this;
        }

        public C0483a h(c cVar) {
            this.f21631d = cVar;
            return this;
        }

        public C0483a i(String str) {
            this.f21633f = str;
            return this;
        }

        public C0483a j(long j10) {
            this.f21628a = j10;
            return this;
        }

        public C0483a k(d dVar) {
            this.f21632e = dVar;
            return this;
        }

        public C0483a l(String str) {
            this.f21637j = str;
            return this;
        }

        public C0483a m(int i10) {
            this.f21636i = i10;
            return this;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum b implements e9.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // e9.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum c implements e9.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // e9.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* compiled from: MessagingClientEvent.java */
    /* loaded from: classes3.dex */
    public enum d implements e9.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // e9.c
        public int getNumber() {
            return this.number_;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f21613a = j10;
        this.f21614b = str;
        this.f21615c = str2;
        this.f21616d = cVar;
        this.f21617e = dVar;
        this.f21618f = str3;
        this.f21619g = str4;
        this.f21620h = i10;
        this.f21621i = i11;
        this.f21622j = str5;
        this.f21623k = j11;
        this.f21624l = bVar;
        this.f21625m = str6;
        this.f21626n = j12;
        this.f21627o = str7;
    }

    public static C0483a p() {
        return new C0483a();
    }

    @e9.d(tag = 13)
    public String a() {
        return this.f21625m;
    }

    @e9.d(tag = 11)
    public long b() {
        return this.f21623k;
    }

    @e9.d(tag = 14)
    public long c() {
        return this.f21626n;
    }

    @e9.d(tag = 7)
    public String d() {
        return this.f21619g;
    }

    @e9.d(tag = 15)
    public String e() {
        return this.f21627o;
    }

    @e9.d(tag = 12)
    public b f() {
        return this.f21624l;
    }

    @e9.d(tag = 3)
    public String g() {
        return this.f21615c;
    }

    @e9.d(tag = 2)
    public String h() {
        return this.f21614b;
    }

    @e9.d(tag = 4)
    public c i() {
        return this.f21616d;
    }

    @e9.d(tag = 6)
    public String j() {
        return this.f21618f;
    }

    @e9.d(tag = 8)
    public int k() {
        return this.f21620h;
    }

    @e9.d(tag = 1)
    public long l() {
        return this.f21613a;
    }

    @e9.d(tag = 5)
    public d m() {
        return this.f21617e;
    }

    @e9.d(tag = 10)
    public String n() {
        return this.f21622j;
    }

    @e9.d(tag = 9)
    public int o() {
        return this.f21621i;
    }
}
