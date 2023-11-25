package androidx.compose.foundation.relocation;

import androidx.compose.ui.e;
import n1.s;
import o1.g;
import o1.i;
import p1.b0;
import p1.c0;
import p1.h;
import qc.q;

/* compiled from: BringIntoView.kt */
/* loaded from: classes.dex */
public abstract class a extends e.c implements i, c0, h {
    private final z.b A = z.f.b(this);
    private s B;

    private final z.b J1() {
        return (z.b) o(z.a.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s I1() {
        s sVar = this.B;
        if (sVar == null || !sVar.r()) {
            return null;
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final z.b K1() {
        z.b J1 = J1();
        if (J1 == null) {
            return this.A;
        }
        return J1;
    }

    @Override // p1.c0
    public /* synthetic */ void g(long j10) {
        b0.a(this, j10);
    }

    @Override // o1.i
    public /* synthetic */ g l0() {
        return o1.h.b(this);
    }

    @Override // o1.i, o1.l
    public /* synthetic */ Object o(o1.c cVar) {
        return o1.h.a(this, cVar);
    }

    @Override // p1.c0
    public void p(s sVar) {
        q.i(sVar, "coordinates");
        this.B = sVar;
    }
}
