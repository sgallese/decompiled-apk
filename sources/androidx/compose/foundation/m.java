package androidx.compose.foundation;

import androidx.compose.ui.e;
import p1.r1;
import p1.s1;
import t1.v;
import t1.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Focusable.kt */
/* loaded from: classes.dex */
public final class m extends e.c implements s1, y0.n {
    private t1.l A = new t1.l();
    private boolean B;

    /* compiled from: Focusable.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // pc.a
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.m.a(m.this));
        }
    }

    public final void I1(boolean z10) {
        this.B = z10;
    }

    @Override // p1.s1
    public void Z0(x xVar) {
        qc.q.i(xVar, "<this>");
        v.L(xVar, this.B);
        v.C(xVar, null, new a(), 1, null);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b0() {
        return r1.a(this);
    }

    @Override // p1.s1
    public /* synthetic */ boolean b1() {
        return r1.b(this);
    }
}
