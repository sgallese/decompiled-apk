package androidx.lifecycle;

import androidx.lifecycle.p;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements s {

    /* renamed from: f  reason: collision with root package name */
    private final p0 f4917f;

    public SavedStateHandleAttacher(p0 p0Var) {
        qc.q.i(p0Var, "provider");
        this.f4917f = p0Var;
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        boolean z10;
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        if (aVar == p.a.ON_CREATE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            vVar.getLifecycle().d(this);
            this.f4917f.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
