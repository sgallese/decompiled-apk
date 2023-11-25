package androidx.compose.foundation.lazy;

import androidx.compose.ui.e;
import j0.g1;
import j0.o2;
import j2.l;
import qc.q;
import s.e0;
import x.d;

/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    private g1 f2147a = o2.a(Integer.MAX_VALUE);

    /* renamed from: b  reason: collision with root package name */
    private g1 f2148b = o2.a(Integer.MAX_VALUE);

    @Override // x.d
    public e a(e eVar, e0<l> e0Var) {
        q.i(eVar, "<this>");
        q.i(e0Var, "animationSpec");
        return eVar.a(new AnimateItemPlacementElement(e0Var));
    }

    @Override // x.d
    public e b(e eVar, float f10) {
        q.i(eVar, "<this>");
        return eVar.a(new ParentSizeElement(f10, this.f2147a, this.f2148b, "fillParentMaxSize"));
    }

    public final void c(int i10, int i11) {
        this.f2147a.i(i10);
        this.f2148b.i(i11);
    }
}
