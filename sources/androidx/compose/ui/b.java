package androidx.compose.ui;

import androidx.compose.ui.e;
import androidx.compose.ui.platform.m1;
import androidx.compose.ui.platform.n1;
import dc.w;
import j0.l;
import pc.p;
import pc.q;

/* compiled from: ComposedModifier.kt */
/* loaded from: classes.dex */
class b extends n1 implements e.b {

    /* renamed from: d  reason: collision with root package name */
    private final q<e, l, Integer, e> f2320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(pc.l<? super m1, w> lVar, q<? super e, ? super l, ? super Integer, ? extends e> qVar) {
        super(lVar);
        qc.q.i(lVar, "inspectorInfo");
        qc.q.i(qVar, "factory");
        this.f2320d = qVar;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ e a(e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    public final q<e, l, Integer, e> e() {
        return this.f2320d;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }
}
