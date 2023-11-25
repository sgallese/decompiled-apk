package r;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final v0.b f21967a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.l<j2.p, j2.p> f21968b;

    /* renamed from: c  reason: collision with root package name */
    private final s.e0<j2.p> f21969c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21970d;

    /* JADX WARN: Multi-variable type inference failed */
    public m(v0.b bVar, pc.l<? super j2.p, j2.p> lVar, s.e0<j2.p> e0Var, boolean z10) {
        qc.q.i(bVar, "alignment");
        qc.q.i(lVar, "size");
        qc.q.i(e0Var, "animationSpec");
        this.f21967a = bVar;
        this.f21968b = lVar;
        this.f21969c = e0Var;
        this.f21970d = z10;
    }

    public final v0.b a() {
        return this.f21967a;
    }

    public final s.e0<j2.p> b() {
        return this.f21969c;
    }

    public final boolean c() {
        return this.f21970d;
    }

    public final pc.l<j2.p, j2.p> d() {
        return this.f21968b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (qc.q.d(this.f21967a, mVar.f21967a) && qc.q.d(this.f21968b, mVar.f21968b) && qc.q.d(this.f21969c, mVar.f21969c) && this.f21970d == mVar.f21970d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f21967a.hashCode() * 31) + this.f21968b.hashCode()) * 31) + this.f21969c.hashCode()) * 31;
        boolean z10 = this.f21970d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f21967a + ", size=" + this.f21968b + ", animationSpec=" + this.f21969c + ", clip=" + this.f21970d + ')';
    }
}
