package androidx.compose.ui.node;

import androidx.compose.ui.e;
import p1.u0;
import qc.q;

/* compiled from: NodeChain.kt */
/* loaded from: classes.dex */
final class ForceUpdateElement extends u0<e.c> {

    /* renamed from: c  reason: collision with root package name */
    private final u0<?> f2474c;

    public ForceUpdateElement(u0<?> u0Var) {
        q.i(u0Var, "original");
        this.f2474c = u0Var;
    }

    @Override // p1.u0
    public e.c e() {
        throw new IllegalStateException("Shouldn't be called");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ForceUpdateElement) && q.d(this.f2474c, ((ForceUpdateElement) obj).f2474c)) {
            return true;
        }
        return false;
    }

    @Override // p1.u0
    public int hashCode() {
        return this.f2474c.hashCode();
    }

    @Override // p1.u0
    public void m(e.c cVar) {
        q.i(cVar, "node");
        throw new IllegalStateException("Shouldn't be called");
    }

    public String toString() {
        return "ForceUpdateElement(original=" + this.f2474c + ')';
    }

    public final u0<?> v() {
        return this.f2474c;
    }
}
