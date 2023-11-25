package h1;

import j0.d3;
import j0.j1;
import pc.l;
import qc.h;
import qc.q;

/* compiled from: InputModeManager.kt */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final l<a, Boolean> f16442a;

    /* renamed from: b  reason: collision with root package name */
    private final j1 f16443b;

    public /* synthetic */ c(int i10, l lVar, h hVar) {
        this(i10, lVar);
    }

    @Override // h1.b
    public int a() {
        return ((a) this.f16443b.getValue()).i();
    }

    public void b(int i10) {
        this.f16443b.setValue(a.c(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(int i10, l<? super a, Boolean> lVar) {
        j1 e10;
        q.i(lVar, "onRequestInputModeChange");
        this.f16442a = lVar;
        e10 = d3.e(a.c(i10), null, 2, null);
        this.f16443b = e10;
    }
}
