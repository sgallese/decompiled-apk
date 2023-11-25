package androidx.compose.ui.focus;

import androidx.compose.ui.e;

/* compiled from: FocusRequesterModifier.kt */
/* loaded from: classes.dex */
final class n extends e.c implements y0.n {
    private k A;

    public n(k kVar) {
        qc.q.i(kVar, "focusRequester");
        this.A = kVar;
    }

    public final k I1() {
        return this.A;
    }

    public final void J1(k kVar) {
        qc.q.i(kVar, "<set-?>");
        this.A = kVar;
    }

    @Override // androidx.compose.ui.e.c
    public void s1() {
        super.s1();
        this.A.d().d(this);
    }

    @Override // androidx.compose.ui.e.c
    public void t1() {
        this.A.d().v(this);
        super.t1();
    }
}
