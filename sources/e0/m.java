package e0;

/* compiled from: SelectionHandles.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final c0.l f13648a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13649b;

    public /* synthetic */ m(c0.l lVar, long j10, qc.h hVar) {
        this(lVar, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f13648a == mVar.f13648a && z0.f.l(this.f13649b, mVar.f13649b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f13648a.hashCode() * 31) + z0.f.q(this.f13649b);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.f13648a + ", position=" + ((Object) z0.f.v(this.f13649b)) + ')';
    }

    private m(c0.l lVar, long j10) {
        qc.q.i(lVar, "handle");
        this.f13648a = lVar;
        this.f13649b = j10;
    }
}
