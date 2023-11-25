package androidx.compose.ui.platform;

import androidx.compose.ui.e;

/* compiled from: InspectableValue.kt */
/* loaded from: classes.dex */
public final class j1 extends n1 implements e.b {

    /* renamed from: d  reason: collision with root package name */
    private final a f2733d;

    /* compiled from: InspectableValue.kt */
    /* loaded from: classes.dex */
    public final class a implements e.b {
        public a() {
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
            return v0.d.a(this, eVar);
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ Object b(Object obj, pc.p pVar) {
            return v0.e.b(this, obj, pVar);
        }

        @Override // androidx.compose.ui.e
        public /* synthetic */ boolean h(pc.l lVar) {
            return v0.e.a(this, lVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(pc.l<? super m1, dc.w> lVar) {
        super(lVar);
        qc.q.i(lVar, "inspectorInfo");
        this.f2733d = new a();
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return v0.d.a(this, eVar);
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ Object b(Object obj, pc.p pVar) {
        return v0.e.b(this, obj, pVar);
    }

    public final a e() {
        return this.f2733d;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ boolean h(pc.l lVar) {
        return v0.e.a(this, lVar);
    }
}
