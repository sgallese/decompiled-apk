package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.e;
import pc.l;
import qc.q;

/* compiled from: KeyInputModifier.kt */
/* loaded from: classes.dex */
final class b extends e.c implements i1.e {
    private l<? super i1.b, Boolean> A;
    private l<? super i1.b, Boolean> B;

    public b(l<? super i1.b, Boolean> lVar, l<? super i1.b, Boolean> lVar2) {
        this.A = lVar;
        this.B = lVar2;
    }

    @Override // i1.e
    public boolean A(KeyEvent keyEvent) {
        q.i(keyEvent, "event");
        l<? super i1.b, Boolean> lVar = this.B;
        if (lVar != null) {
            return lVar.invoke(i1.b.a(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void I1(l<? super i1.b, Boolean> lVar) {
        this.A = lVar;
    }

    public final void J1(l<? super i1.b, Boolean> lVar) {
        this.B = lVar;
    }

    @Override // i1.e
    public boolean Y(KeyEvent keyEvent) {
        q.i(keyEvent, "event");
        l<? super i1.b, Boolean> lVar = this.A;
        if (lVar != null) {
            return lVar.invoke(i1.b.a(keyEvent)).booleanValue();
        }
        return false;
    }
}
