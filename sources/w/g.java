package w;

/* compiled from: BoxWithConstraints.kt */
/* loaded from: classes.dex */
final class g implements f, d {

    /* renamed from: a  reason: collision with root package name */
    private final j2.e f25170a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25171b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ androidx.compose.foundation.layout.e f25172c;

    public /* synthetic */ g(j2.e eVar, long j10, qc.h hVar) {
        this(eVar, j10);
    }

    @Override // w.d
    public androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        qc.q.i(eVar, "<this>");
        return this.f25172c.a(eVar);
    }

    @Override // w.d
    public androidx.compose.ui.e b(androidx.compose.ui.e eVar, v0.b bVar) {
        qc.q.i(eVar, "<this>");
        qc.q.i(bVar, "alignment");
        return this.f25172c.b(eVar, bVar);
    }

    @Override // w.f
    public long c() {
        return this.f25171b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (qc.q.d(this.f25170a, gVar.f25170a) && j2.b.g(this.f25171b, gVar.f25171b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25170a.hashCode() * 31) + j2.b.q(this.f25171b);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f25170a + ", constraints=" + ((Object) j2.b.s(this.f25171b)) + ')';
    }

    private g(j2.e eVar, long j10) {
        qc.q.i(eVar, "density");
        this.f25170a = eVar;
        this.f25171b = j10;
        this.f25172c = androidx.compose.foundation.layout.e.f2083a;
    }
}
