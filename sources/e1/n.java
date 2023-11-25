package e1;

/* compiled from: VectorCompose.kt */
/* loaded from: classes.dex */
public final class n extends j0.a<m> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar) {
        super(mVar);
        qc.q.i(mVar, "root");
    }

    private final e m(m mVar) {
        if (mVar instanceof e) {
            return (e) mVar;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group".toString());
    }

    @Override // j0.f
    public void a(int i10, int i11) {
        m(b()).j(i10, i11);
    }

    @Override // j0.f
    public void f(int i10, int i11, int i12) {
        m(b()).i(i10, i11, i12);
    }

    @Override // j0.a
    protected void k() {
        e m10 = m(j());
        m10.j(0, m10.f());
    }

    @Override // j0.f
    /* renamed from: n  reason: merged with bridge method [inline-methods] */
    public void c(int i10, m mVar) {
        qc.q.i(mVar, "instance");
    }

    @Override // j0.f
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public void h(int i10, m mVar) {
        qc.q.i(mVar, "instance");
        m(b()).h(i10, mVar);
    }
}
