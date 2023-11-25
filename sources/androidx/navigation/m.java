package androidx.navigation;

/* compiled from: NavOptions.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5340a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5341b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5342c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f5343d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5344e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5345f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5346g;

    /* renamed from: h  reason: collision with root package name */
    private final int f5347h;

    /* renamed from: i  reason: collision with root package name */
    private final int f5348i;

    /* renamed from: j  reason: collision with root package name */
    private String f5349j;

    /* compiled from: NavOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5350a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5351b;

        /* renamed from: d  reason: collision with root package name */
        private String f5353d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f5354e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f5355f;

        /* renamed from: c  reason: collision with root package name */
        private int f5352c = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f5356g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f5357h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f5358i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f5359j = -1;

        public static /* synthetic */ a i(a aVar, int i10, boolean z10, boolean z11, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                z11 = false;
            }
            return aVar.g(i10, z10, z11);
        }

        public final m a() {
            String str = this.f5353d;
            if (str != null) {
                return new m(this.f5350a, this.f5351b, str, this.f5354e, this.f5355f, this.f5356g, this.f5357h, this.f5358i, this.f5359j);
            }
            return new m(this.f5350a, this.f5351b, this.f5352c, this.f5354e, this.f5355f, this.f5356g, this.f5357h, this.f5358i, this.f5359j);
        }

        public final a b(int i10) {
            this.f5356g = i10;
            return this;
        }

        public final a c(int i10) {
            this.f5357h = i10;
            return this;
        }

        public final a d(boolean z10) {
            this.f5350a = z10;
            return this;
        }

        public final a e(int i10) {
            this.f5358i = i10;
            return this;
        }

        public final a f(int i10) {
            this.f5359j = i10;
            return this;
        }

        public final a g(int i10, boolean z10, boolean z11) {
            this.f5352c = i10;
            this.f5353d = null;
            this.f5354e = z10;
            this.f5355f = z11;
            return this;
        }

        public final a h(String str, boolean z10, boolean z11) {
            this.f5353d = str;
            this.f5352c = -1;
            this.f5354e = z10;
            this.f5355f = z11;
            return this;
        }

        public final a j(boolean z10) {
            this.f5351b = z10;
            return this;
        }
    }

    public m(boolean z10, boolean z11, int i10, boolean z12, boolean z13, int i11, int i12, int i13, int i14) {
        this.f5340a = z10;
        this.f5341b = z11;
        this.f5342c = i10;
        this.f5343d = z12;
        this.f5344e = z13;
        this.f5345f = i11;
        this.f5346g = i12;
        this.f5347h = i13;
        this.f5348i = i14;
    }

    public final int a() {
        return this.f5345f;
    }

    public final int b() {
        return this.f5346g;
    }

    public final int c() {
        return this.f5347h;
    }

    public final int d() {
        return this.f5348i;
    }

    public final int e() {
        return this.f5342c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !qc.q.d(m.class, obj.getClass())) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f5340a == mVar.f5340a && this.f5341b == mVar.f5341b && this.f5342c == mVar.f5342c && qc.q.d(this.f5349j, mVar.f5349j) && this.f5343d == mVar.f5343d && this.f5344e == mVar.f5344e && this.f5345f == mVar.f5345f && this.f5346g == mVar.f5346g && this.f5347h == mVar.f5347h && this.f5348i == mVar.f5348i) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f5343d;
    }

    public final boolean g() {
        return this.f5340a;
    }

    public final boolean h() {
        return this.f5344e;
    }

    public int hashCode() {
        int i10;
        int i11 = (((((g() ? 1 : 0) * 31) + (i() ? 1 : 0)) * 31) + this.f5342c) * 31;
        String str = this.f5349j;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((((((((((((i11 + i10) * 31) + (f() ? 1 : 0)) * 31) + (h() ? 1 : 0)) * 31) + this.f5345f) * 31) + this.f5346g) * 31) + this.f5347h) * 31) + this.f5348i;
    }

    public final boolean i() {
        return this.f5341b;
    }

    public m(boolean z10, boolean z11, String str, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(z10, z11, i.f5309w.a(str).hashCode(), z12, z13, i10, i11, i12, i13);
        this.f5349j = str;
    }
}
