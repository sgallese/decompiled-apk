package p1;

import androidx.compose.ui.e;

/* compiled from: DelegatingNode.kt */
/* loaded from: classes.dex */
public abstract class l extends e.c {
    private final int A = a1.g(this);
    private e.c B;

    private final void L1(int i10, boolean z10) {
        int i11;
        e.c g12;
        int k12 = k1();
        C1(i10);
        if (k12 != i10) {
            if (k.f(this)) {
                y1(i10);
            }
            if (p1()) {
                e.c node = getNode();
                e.c cVar = this;
                while (cVar != null) {
                    i10 |= cVar.k1();
                    cVar.C1(i10);
                    if (cVar == node) {
                        break;
                    }
                    cVar = cVar.m1();
                }
                if (z10 && cVar == node) {
                    i10 = a1.h(node);
                    node.C1(i10);
                }
                if (cVar != null && (g12 = cVar.g1()) != null) {
                    i11 = g12.f1();
                } else {
                    i11 = 0;
                }
                int i12 = i10 | i11;
                while (cVar != null) {
                    i12 |= cVar.k1();
                    cVar.y1(i12);
                    cVar = cVar.m1();
                }
            }
        }
    }

    private final void M1(int i10, e.c cVar) {
        boolean z10;
        int k12 = k1();
        boolean z11 = true;
        if ((i10 & z0.a(2)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if ((z0.a(2) & k12) == 0) {
                z11 = false;
            }
            if (z11 && !(this instanceof e0)) {
                throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar).toString());
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void H1(x0 x0Var) {
        super.H1(x0Var);
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.H1(x0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T extends j> T I1(T t10) {
        boolean z10;
        boolean z11;
        e.c cVar;
        qc.q.i(t10, "delegatableNode");
        e.c node = t10.getNode();
        boolean z12 = true;
        if (node != t10) {
            z10 = true;
        } else {
            z10 = false;
        }
        e.c cVar2 = null;
        if (z10) {
            if (t10 instanceof e.c) {
                cVar = (e.c) t10;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar2 = cVar.m1();
            }
            if (node != getNode() || !qc.q.d(cVar2, this)) {
                z12 = false;
            }
            if (z12) {
                return t10;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        } else if ((!node.p1()) != false) {
            node.z1(getNode());
            int k12 = k1();
            int h10 = a1.h(node);
            node.C1(h10);
            M1(h10, node);
            node.A1(this.B);
            this.B = node;
            node.E1(this);
            L1(k1() | h10, false);
            if (p1()) {
                if ((h10 & z0.a(2)) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    if ((k12 & z0.a(2)) == 0) {
                        z12 = false;
                    }
                    if (!z12) {
                        androidx.compose.ui.node.a i02 = k.k(this).i0();
                        getNode().H1(null);
                        i02.C();
                        node.q1();
                        node.w1();
                        a1.a(node);
                    }
                }
                H1(h1());
                node.q1();
                node.w1();
                a1.a(node);
            }
            return t10;
        } else {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
    }

    public final e.c J1() {
        return this.B;
    }

    public final int K1() {
        return this.A;
    }

    @Override // androidx.compose.ui.e.c
    public void q1() {
        super.q1();
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.H1(h1());
            if (!J1.p1()) {
                J1.q1();
            }
        }
    }

    @Override // androidx.compose.ui.e.c
    public void r1() {
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.r1();
        }
        super.r1();
    }

    @Override // androidx.compose.ui.e.c
    public void v1() {
        super.v1();
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.v1();
        }
    }

    @Override // androidx.compose.ui.e.c
    public void w1() {
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.w1();
        }
        super.w1();
    }

    @Override // androidx.compose.ui.e.c
    public void x1() {
        super.x1();
        for (e.c J1 = J1(); J1 != null; J1 = J1.g1()) {
            J1.x1();
        }
    }
}
