package androidx.lifecycle;

import androidx.lifecycle.p;

/* compiled from: SavedStateHandleController.kt */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements s {

    /* renamed from: f  reason: collision with root package name */
    private final String f4918f;

    /* renamed from: m  reason: collision with root package name */
    private final n0 f4919m;

    /* renamed from: p  reason: collision with root package name */
    private boolean f4920p;

    public SavedStateHandleController(String str, n0 n0Var) {
        qc.q.i(str, "key");
        qc.q.i(n0Var, "handle");
        this.f4918f = str;
        this.f4919m = n0Var;
    }

    public final void a(androidx.savedstate.a aVar, p pVar) {
        qc.q.i(aVar, "registry");
        qc.q.i(pVar, "lifecycle");
        if ((!this.f4920p) != false) {
            this.f4920p = true;
            pVar.a(this);
            aVar.h(this.f4918f, this.f4919m.h());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final n0 b() {
        return this.f4919m;
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        if (aVar == p.a.ON_DESTROY) {
            this.f4920p = false;
            vVar.getLifecycle().d(this);
        }
    }

    public final boolean e() {
        return this.f4920p;
    }
}
