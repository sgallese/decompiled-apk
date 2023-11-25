package c0;

/* compiled from: KeyboardOptions.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: e  reason: collision with root package name */
    public static final a f8610e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final x f8611f = new x(0, false, 0, 0, 15, null);

    /* renamed from: a  reason: collision with root package name */
    private final int f8612a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8613b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8614c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8615d;

    /* compiled from: KeyboardOptions.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final x a() {
            return x.f8611f;
        }
    }

    public /* synthetic */ x(int i10, boolean z10, int i11, int i12, qc.h hVar) {
        this(i10, z10, i11, i12);
    }

    public final b2.p b(boolean z10) {
        return new b2.p(z10, this.f8612a, this.f8613b, this.f8614c, this.f8615d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (b2.u.f(this.f8612a, xVar.f8612a) && this.f8613b == xVar.f8613b && b2.v.k(this.f8614c, xVar.f8614c) && b2.o.l(this.f8615d, xVar.f8615d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((b2.u.g(this.f8612a) * 31) + t.k.a(this.f8613b)) * 31) + b2.v.l(this.f8614c)) * 31) + b2.o.m(this.f8615d);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) b2.u.h(this.f8612a)) + ", autoCorrect=" + this.f8613b + ", keyboardType=" + ((Object) b2.v.m(this.f8614c)) + ", imeAction=" + ((Object) b2.o.n(this.f8615d)) + ')';
    }

    private x(int i10, boolean z10, int i11, int i12) {
        this.f8612a = i10;
        this.f8613b = z10;
        this.f8614c = i11;
        this.f8615d = i12;
    }

    public /* synthetic */ x(int i10, boolean z10, int i11, int i12, int i13, qc.h hVar) {
        this((i13 & 1) != 0 ? b2.u.f7848a.b() : i10, (i13 & 2) != 0 ? true : z10, (i13 & 4) != 0 ? b2.v.f7853a.h() : i11, (i13 & 8) != 0 ? b2.o.f7817b.a() : i12, null);
    }
}
