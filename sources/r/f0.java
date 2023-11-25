package r;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes.dex */
final class f0 implements e0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21870a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.p<j2.p, j2.p, s.e0<j2.p>> f21871b;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(boolean z10, pc.p<? super j2.p, ? super j2.p, ? extends s.e0<j2.p>> pVar) {
        qc.q.i(pVar, "sizeAnimationSpec");
        this.f21870a = z10;
        this.f21871b = pVar;
    }

    @Override // r.e0
    public boolean a() {
        return this.f21870a;
    }

    @Override // r.e0
    public s.e0<j2.p> b(long j10, long j11) {
        return this.f21871b.invoke(j2.p.b(j10), j2.p.b(j11));
    }
}
