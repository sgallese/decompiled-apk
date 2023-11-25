package t1;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f23420d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final h f23421e;

    /* renamed from: a  reason: collision with root package name */
    private final float f23422a;

    /* renamed from: b  reason: collision with root package name */
    private final vc.b<Float> f23423b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23424c;

    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a() {
            return h.f23421e;
        }
    }

    static {
        vc.b b10;
        b10 = vc.k.b(0.0f, 0.0f);
        f23421e = new h(0.0f, b10, 0, 4, null);
    }

    public h(float f10, vc.b<Float> bVar, int i10) {
        qc.q.i(bVar, "range");
        this.f23422a = f10;
        this.f23423b = bVar;
        this.f23424c = i10;
        if ((!Float.isNaN(f10)) != true) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final float b() {
        return this.f23422a;
    }

    public final vc.b<Float> c() {
        return this.f23423b;
    }

    public final int d() {
        return this.f23424c;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f23422a == hVar.f23422a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && qc.q.d(this.f23423b, hVar.f23423b) && this.f23424c == hVar.f23424c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f23422a) * 31) + this.f23423b.hashCode()) * 31) + this.f23424c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f23422a + ", range=" + this.f23423b + ", steps=" + this.f23424c + ')';
    }

    public /* synthetic */ h(float f10, vc.b bVar, int i10, int i11, qc.h hVar) {
        this(f10, bVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
