package g2;

/* compiled from: TextMotion.android.kt */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16090c;

    /* renamed from: d  reason: collision with root package name */
    private static final t f16091d;

    /* renamed from: e  reason: collision with root package name */
    private static final t f16092e;

    /* renamed from: a  reason: collision with root package name */
    private final int f16093a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f16094b;

    /* compiled from: TextMotion.android.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final t a() {
            return t.f16091d;
        }
    }

    static {
        qc.h hVar = null;
        f16090c = new a(hVar);
        b.a aVar = b.f16095a;
        f16091d = new t(aVar.a(), false, hVar);
        f16092e = new t(aVar.b(), true, hVar);
    }

    public /* synthetic */ t(int i10, boolean z10, qc.h hVar) {
        this(i10, z10);
    }

    public final int b() {
        return this.f16093a;
    }

    public final boolean c() {
        return this.f16094b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (b.e(this.f16093a, tVar.f16093a) && this.f16094b == tVar.f16094b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (b.f(this.f16093a) * 31) + t.k.a(this.f16094b);
    }

    public String toString() {
        if (qc.q.d(this, f16091d)) {
            return "TextMotion.Static";
        }
        if (qc.q.d(this, f16092e)) {
            return "TextMotion.Animated";
        }
        return "Invalid";
    }

    private t(int i10, boolean z10) {
        this.f16093a = i10;
        this.f16094b = z10;
    }

    /* compiled from: TextMotion.android.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16095a = new a(null);

        /* renamed from: b  reason: collision with root package name */
        private static final int f16096b = d(1);

        /* renamed from: c  reason: collision with root package name */
        private static final int f16097c = d(2);

        /* renamed from: d  reason: collision with root package name */
        private static final int f16098d = d(3);

        /* compiled from: TextMotion.android.kt */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(qc.h hVar) {
                this();
            }

            public final int a() {
                return b.f16097c;
            }

            public final int b() {
                return b.f16096b;
            }

            public final int c() {
                return b.f16098d;
            }
        }

        public static final boolean e(int i10, int i11) {
            if (i10 == i11) {
                return true;
            }
            return false;
        }

        private static int d(int i10) {
            return i10;
        }

        public static int f(int i10) {
            return i10;
        }
    }
}
