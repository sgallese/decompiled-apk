package androidx.lifecycle;

import androidx.lifecycle.p;

/* compiled from: SingleGeneratedAdapterObserver.kt */
/* loaded from: classes.dex */
public final class SingleGeneratedAdapterObserver implements s {

    /* renamed from: f  reason: collision with root package name */
    private final n f4921f;

    public SingleGeneratedAdapterObserver(n nVar) {
        qc.q.i(nVar, "generatedAdapter");
        this.f4921f = nVar;
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        this.f4921f.a(vVar, aVar, false, null);
        this.f4921f.a(vVar, aVar, true, null);
    }
}
