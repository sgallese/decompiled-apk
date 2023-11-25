package b1;

/* compiled from: TransferParameters.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final double f7727a;

    /* renamed from: b  reason: collision with root package name */
    private final double f7728b;

    /* renamed from: c  reason: collision with root package name */
    private final double f7729c;

    /* renamed from: d  reason: collision with root package name */
    private final double f7730d;

    /* renamed from: e  reason: collision with root package name */
    private final double f7731e;

    /* renamed from: f  reason: collision with root package name */
    private final double f7732f;

    /* renamed from: g  reason: collision with root package name */
    private final double f7733g;

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if ((r2 == 0.0d) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0093, code lost:
    
        if ((r2 == 0.0d) != false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(double r2, double r4, double r6, double r8, double r10, double r12, double r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.x.<init>(double, double, double, double, double, double, double):void");
    }

    public final double a() {
        return this.f7728b;
    }

    public final double b() {
        return this.f7729c;
    }

    public final double c() {
        return this.f7730d;
    }

    public final double d() {
        return this.f7731e;
    }

    public final double e() {
        return this.f7732f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (Double.compare(this.f7727a, xVar.f7727a) == 0 && Double.compare(this.f7728b, xVar.f7728b) == 0 && Double.compare(this.f7729c, xVar.f7729c) == 0 && Double.compare(this.f7730d, xVar.f7730d) == 0 && Double.compare(this.f7731e, xVar.f7731e) == 0 && Double.compare(this.f7732f, xVar.f7732f) == 0 && Double.compare(this.f7733g, xVar.f7733g) == 0) {
            return true;
        }
        return false;
    }

    public final double f() {
        return this.f7733g;
    }

    public final double g() {
        return this.f7727a;
    }

    public int hashCode() {
        return (((((((((((s.t.a(this.f7727a) * 31) + s.t.a(this.f7728b)) * 31) + s.t.a(this.f7729c)) * 31) + s.t.a(this.f7730d)) * 31) + s.t.a(this.f7731e)) * 31) + s.t.a(this.f7732f)) * 31) + s.t.a(this.f7733g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f7727a + ", a=" + this.f7728b + ", b=" + this.f7729c + ", c=" + this.f7730d + ", d=" + this.f7731e + ", e=" + this.f7732f + ", f=" + this.f7733g + ')';
    }

    public /* synthetic */ x(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, qc.h hVar) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
