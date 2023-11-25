package androidx.compose.foundation.layout;

import androidx.compose.ui.e;
import p1.l1;
import qc.q;

/* compiled from: Box.kt */
/* loaded from: classes.dex */
final class c extends e.c implements l1 {
    private v0.b A;
    private boolean B;

    public c(v0.b bVar, boolean z10) {
        q.i(bVar, "alignment");
        this.A = bVar;
        this.B = z10;
    }

    public final v0.b I1() {
        return this.A;
    }

    public final boolean J1() {
        return this.B;
    }

    @Override // p1.l1
    /* renamed from: K1  reason: merged with bridge method [inline-methods] */
    public c y(j2.e eVar, Object obj) {
        q.i(eVar, "<this>");
        return this;
    }

    public final void L1(v0.b bVar) {
        q.i(bVar, "<set-?>");
        this.A = bVar;
    }

    public final void M1(boolean z10) {
        this.B = z10;
    }
}
