package ad;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public final class t extends y1 implements s {

    /* renamed from: r  reason: collision with root package name */
    public final u f557r;

    public t(u uVar) {
        this.f557r = uVar;
    }

    @Override // ad.s
    public boolean d(Throwable th) {
        return s().O(th);
    }

    @Override // ad.s
    public x1 getParent() {
        return s();
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(Throwable th) {
        r(th);
        return dc.w.f13270a;
    }

    @Override // ad.c0
    public void r(Throwable th) {
        this.f557r.q(s());
    }
}
