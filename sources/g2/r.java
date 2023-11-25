package g2;

/* compiled from: TextIndent.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final a f16086c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final r f16087d = new r(0, 0, 3, null);

    /* renamed from: a  reason: collision with root package name */
    private final long f16088a;

    /* renamed from: b  reason: collision with root package name */
    private final long f16089b;

    /* compiled from: TextIndent.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final r a() {
            return r.f16087d;
        }
    }

    public /* synthetic */ r(long j10, long j11, qc.h hVar) {
        this(j10, j11);
    }

    public final long b() {
        return this.f16088a;
    }

    public final long c() {
        return this.f16089b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (j2.s.e(this.f16088a, rVar.f16088a) && j2.s.e(this.f16089b, rVar.f16089b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (j2.s.i(this.f16088a) * 31) + j2.s.i(this.f16089b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) j2.s.j(this.f16088a)) + ", restLine=" + ((Object) j2.s.j(this.f16089b)) + ')';
    }

    private r(long j10, long j11) {
        this.f16088a = j10;
        this.f16089b = j11;
    }

    public /* synthetic */ r(long j10, long j11, int i10, qc.h hVar) {
        this((i10 & 1) != 0 ? j2.t.g(0) : j10, (i10 & 2) != 0 ? j2.t.g(0) : j11, null);
    }
}
