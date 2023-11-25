package s;

/* compiled from: AnimationSpec.kt */
/* loaded from: classes.dex */
public final class l0<T> implements j<T> {

    /* renamed from: d  reason: collision with root package name */
    public static final int f22760d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final b0<T> f22761a;

    /* renamed from: b  reason: collision with root package name */
    private final v0 f22762b;

    /* renamed from: c  reason: collision with root package name */
    private final long f22763c;

    public /* synthetic */ l0(b0 b0Var, v0 v0Var, long j10, qc.h hVar) {
        this(b0Var, v0Var, j10);
    }

    @Override // s.j
    public <V extends q> m1<V> a(i1<T, V> i1Var) {
        qc.q.i(i1Var, "converter");
        return new v1(this.f22761a.a((i1) i1Var), this.f22762b, this.f22763c, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!qc.q.d(l0Var.f22761a, this.f22761a) || l0Var.f22762b != this.f22762b || !a1.d(l0Var.f22763c, this.f22763c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f22761a.hashCode() * 31) + this.f22762b.hashCode()) * 31) + a1.e(this.f22763c);
    }

    private l0(b0<T> b0Var, v0 v0Var, long j10) {
        qc.q.i(b0Var, "animation");
        qc.q.i(v0Var, "repeatMode");
        this.f22761a = b0Var;
        this.f22762b = v0Var;
        this.f22763c = j10;
    }
}
