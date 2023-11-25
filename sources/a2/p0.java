package a2;

/* compiled from: Font.kt */
/* loaded from: classes.dex */
public final class p0 implements k {

    /* renamed from: a  reason: collision with root package name */
    private final int f316a;

    /* renamed from: b  reason: collision with root package name */
    private final c0 f317b;

    /* renamed from: c  reason: collision with root package name */
    private final int f318c;

    /* renamed from: d  reason: collision with root package name */
    private final b0 f319d;

    /* renamed from: e  reason: collision with root package name */
    private final int f320e;

    public /* synthetic */ p0(int i10, c0 c0Var, int i11, b0 b0Var, int i12, qc.h hVar) {
        this(i10, c0Var, i11, b0Var, i12);
    }

    @Override // a2.k
    public int a() {
        return this.f320e;
    }

    @Override // a2.k
    public c0 b() {
        return this.f317b;
    }

    @Override // a2.k
    public int c() {
        return this.f318c;
    }

    public final int d() {
        return this.f316a;
    }

    public final b0 e() {
        return this.f319d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (this.f316a == p0Var.f316a && qc.q.d(b(), p0Var.b()) && x.f(c(), p0Var.c()) && qc.q.d(this.f319d, p0Var.f319d) && v.e(a(), p0Var.a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f316a * 31) + b().hashCode()) * 31) + x.g(c())) * 31) + v.f(a())) * 31) + this.f319d.hashCode();
    }

    public String toString() {
        return "ResourceFont(resId=" + this.f316a + ", weight=" + b() + ", style=" + ((Object) x.h(c())) + ", loadingStrategy=" + ((Object) v.g(a())) + ')';
    }

    private p0(int i10, c0 c0Var, int i11, b0 b0Var, int i12) {
        qc.q.i(c0Var, "weight");
        qc.q.i(b0Var, "variationSettings");
        this.f316a = i10;
        this.f317b = c0Var;
        this.f318c = i11;
        this.f319d = b0Var;
        this.f320e = i12;
    }
}
