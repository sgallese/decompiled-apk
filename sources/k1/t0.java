package k1;

/* compiled from: PointerInteropFilter.android.kt */
/* loaded from: classes.dex */
public final class t0 implements pc.l<Boolean, dc.w> {

    /* renamed from: f  reason: collision with root package name */
    private m0 f19237f;

    public void a(boolean z10) {
        m0 m0Var = this.f19237f;
        if (m0Var != null) {
            m0Var.v(z10);
        }
    }

    public final void b(m0 m0Var) {
        this.f19237f = m0Var;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Boolean bool) {
        a(bool.booleanValue());
        return dc.w.f13270a;
    }
}
