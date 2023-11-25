package androidx.lifecycle;

import androidx.lifecycle.p;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements s {

    /* renamed from: f  reason: collision with root package name */
    private final n[] f4853f;

    public CompositeGeneratedAdaptersObserver(n[] nVarArr) {
        qc.q.i(nVarArr, "generatedAdapters");
        this.f4853f = nVarArr;
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        e0 e0Var = new e0();
        for (n nVar : this.f4853f) {
            nVar.a(vVar, aVar, false, e0Var);
        }
        for (n nVar2 : this.f4853f) {
            nVar2.a(vVar, aVar, true, e0Var);
        }
    }
}
