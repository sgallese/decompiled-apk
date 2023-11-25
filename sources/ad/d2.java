package ad;

/* compiled from: JobSupport.kt */
/* loaded from: classes4.dex */
public abstract class d2 extends c0 implements c1, r1 {

    /* renamed from: q  reason: collision with root package name */
    public e2 f475q;

    @Override // ad.r1
    public boolean b() {
        return true;
    }

    @Override // ad.r1
    public j2 c() {
        return null;
    }

    @Override // ad.c1
    public void dispose() {
        s().H0(this);
    }

    public final e2 s() {
        e2 e2Var = this.f475q;
        if (e2Var != null) {
            return e2Var;
        }
        qc.q.z("job");
        return null;
    }

    public final void t(e2 e2Var) {
        this.f475q = e2Var;
    }

    @Override // fd.r
    public String toString() {
        return o0.a(this) + '@' + o0.b(this) + "[job@" + o0.b(s()) + ']';
    }
}
