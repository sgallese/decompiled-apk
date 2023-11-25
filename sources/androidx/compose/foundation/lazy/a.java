package androidx.compose.foundation.lazy;

import p1.l;
import p1.l1;
import qc.q;
import s.e0;
import y.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyItemScopeImpl.kt */
/* loaded from: classes.dex */
public final class a extends l implements l1 {
    private final e C;

    public a(e0<j2.l> e0Var) {
        q.i(e0Var, "animationSpec");
        this.C = (e) I1(new e(e0Var));
    }

    public final e N1() {
        return this.C;
    }

    @Override // p1.l1
    public Object y(j2.e eVar, Object obj) {
        q.i(eVar, "<this>");
        return this.C;
    }
}
