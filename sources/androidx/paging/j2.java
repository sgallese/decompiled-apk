package androidx.paging;

/* compiled from: SnapshotPagedList.kt */
/* loaded from: classes.dex */
public final class j2<T> extends n1<T> {

    /* renamed from: x  reason: collision with root package name */
    private final n1<T> f5805x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f5806y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f5807z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(n1<T> n1Var) {
        super(n1Var.v(), n1Var.r(), n1Var.t(), n1Var.y().A(), n1Var.p());
        qc.q.i(n1Var, "pagedList");
        this.f5805x = n1Var;
        this.f5806y = true;
        this.f5807z = true;
    }

    @Override // androidx.paging.n1
    public boolean A() {
        return this.f5807z;
    }

    @Override // androidx.paging.n1
    public boolean C() {
        return this.f5806y;
    }

    @Override // androidx.paging.n1
    public void n(pc.p<? super t0, ? super q0, dc.w> pVar) {
        qc.q.i(pVar, "callback");
    }

    @Override // androidx.paging.n1
    public Object s() {
        return this.f5805x.s();
    }

    @Override // androidx.paging.n1
    public void F(int i10) {
    }
}
