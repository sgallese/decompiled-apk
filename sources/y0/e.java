package y0;

import androidx.compose.ui.e;
import androidx.compose.ui.focus.FocusTargetNode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import dc.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p1.z0;
import qc.r;

/* compiled from: FocusInvalidationManager.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final pc.l<pc.a<w>, w> f26166a;

    /* renamed from: b  reason: collision with root package name */
    private Set<FocusTargetNode> f26167b;

    /* renamed from: c  reason: collision with root package name */
    private Set<c> f26168c;

    /* renamed from: d  reason: collision with root package name */
    private Set<k> f26169d;

    /* renamed from: e  reason: collision with root package name */
    private final pc.a<w> f26170e;

    /* compiled from: FocusInvalidationManager.kt */
    /* loaded from: classes.dex */
    static final class a extends r implements pc.a<w> {
        a() {
            super(0);
        }

        @Override // pc.a
        public /* bridge */ /* synthetic */ w invoke() {
            invoke2();
            return w.f13270a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            o oVar;
            Set set = e.this.f26169d;
            e eVar = e.this;
            Iterator it = set.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                int i10 = UserVerificationMethods.USER_VERIFY_ALL;
                int i11 = 16;
                int i12 = 0;
                int i13 = 1;
                if (!hasNext) {
                    e.this.f26169d.clear();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Set<c> set2 = e.this.f26168c;
                    e eVar2 = e.this;
                    for (c cVar : set2) {
                        if (!cVar.getNode().p1()) {
                            cVar.j(p.Inactive);
                        } else {
                            int a10 = z0.a(i10);
                            e.c node = cVar.getNode();
                            FocusTargetNode focusTargetNode = null;
                            k0.f fVar = null;
                            boolean z10 = true;
                            boolean z11 = false;
                            while (node != null) {
                                if (node instanceof FocusTargetNode) {
                                    FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                    if (focusTargetNode != null) {
                                        z11 = true;
                                    }
                                    if (eVar2.f26167b.contains(focusTargetNode2)) {
                                        linkedHashSet.add(focusTargetNode2);
                                        z10 = false;
                                    }
                                    focusTargetNode = focusTargetNode2;
                                } else if (((node.k1() & a10) != 0) && (node instanceof p1.l)) {
                                    e.c J1 = ((p1.l) node).J1();
                                    int i14 = 0;
                                    while (J1 != null) {
                                        if ((J1.k1() & a10) != 0) {
                                            i14++;
                                            if (i14 == i13) {
                                                node = J1;
                                            } else {
                                                if (fVar == null) {
                                                    fVar = new k0.f(new e.c[i11], i12);
                                                }
                                                if (node != null) {
                                                    fVar.d(node);
                                                    node = null;
                                                }
                                                fVar.d(J1);
                                            }
                                        }
                                        J1 = J1.g1();
                                        i13 = 1;
                                    }
                                    if (i14 == 1) {
                                        i13 = 1;
                                    }
                                }
                                node = p1.k.g(fVar);
                                i13 = 1;
                            }
                            if (cVar.getNode().p1()) {
                                k0.f fVar2 = new k0.f(new e.c[i11], i12);
                                e.c g12 = cVar.getNode().g1();
                                if (g12 == null) {
                                    p1.k.c(fVar2, cVar.getNode());
                                } else {
                                    fVar2.d(g12);
                                }
                                while (fVar2.s()) {
                                    e.c cVar2 = (e.c) fVar2.x(fVar2.o() - 1);
                                    if ((cVar2.f1() & a10) == 0) {
                                        p1.k.c(fVar2, cVar2);
                                    } else {
                                        while (cVar2 != null) {
                                            if ((cVar2.k1() & a10) != 0) {
                                                k0.f fVar3 = null;
                                                while (cVar2 != null) {
                                                    if (cVar2 instanceof FocusTargetNode) {
                                                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) cVar2;
                                                        if (focusTargetNode != null) {
                                                            z11 = true;
                                                        }
                                                        if (eVar2.f26167b.contains(focusTargetNode3)) {
                                                            linkedHashSet.add(focusTargetNode3);
                                                            z10 = false;
                                                        }
                                                        focusTargetNode = focusTargetNode3;
                                                    } else if (((cVar2.k1() & a10) != 0) && (cVar2 instanceof p1.l)) {
                                                        e.c J12 = ((p1.l) cVar2).J1();
                                                        int i15 = 0;
                                                        while (J12 != null) {
                                                            if ((J12.k1() & a10) != 0) {
                                                                i15++;
                                                                if (i15 == 1) {
                                                                    cVar2 = J12;
                                                                } else {
                                                                    if (fVar3 == null) {
                                                                        fVar3 = new k0.f(new e.c[i11], 0);
                                                                    }
                                                                    if (cVar2 != null) {
                                                                        fVar3.d(cVar2);
                                                                        cVar2 = null;
                                                                    }
                                                                    fVar3.d(J12);
                                                                    J12 = J12.g1();
                                                                    i11 = 16;
                                                                }
                                                            }
                                                            J12 = J12.g1();
                                                            i11 = 16;
                                                        }
                                                        if (i15 == 1) {
                                                            i11 = 16;
                                                        }
                                                        cVar2 = p1.k.g(fVar3);
                                                        i11 = 16;
                                                    }
                                                    cVar2 = p1.k.g(fVar3);
                                                    i11 = 16;
                                                }
                                            } else {
                                                cVar2 = cVar2.g1();
                                                i11 = 16;
                                            }
                                        }
                                    }
                                    i11 = 16;
                                }
                                if (z10) {
                                    if (z11) {
                                        oVar = d.a(cVar);
                                    } else if (focusTargetNode == null || (oVar = focusTargetNode.O1()) == null) {
                                        oVar = p.Inactive;
                                    }
                                    cVar.j(oVar);
                                }
                            } else {
                                throw new IllegalStateException("visitChildren called on an unattached node".toString());
                            }
                        }
                        i10 = UserVerificationMethods.USER_VERIFY_ALL;
                        i11 = 16;
                        i12 = 0;
                        i13 = 1;
                    }
                    e.this.f26168c.clear();
                    for (FocusTargetNode focusTargetNode4 : e.this.f26167b) {
                        if (focusTargetNode4.p1()) {
                            p O1 = focusTargetNode4.O1();
                            focusTargetNode4.P1();
                            if (O1 != focusTargetNode4.O1() || linkedHashSet.contains(focusTargetNode4)) {
                                d.c(focusTargetNode4);
                            }
                        }
                    }
                    e.this.f26167b.clear();
                    linkedHashSet.clear();
                    if (e.this.f26169d.isEmpty()) {
                        if (e.this.f26168c.isEmpty()) {
                            if (!e.this.f26167b.isEmpty()) {
                                throw new IllegalStateException("Unprocessed FocusTarget nodes".toString());
                            }
                            return;
                        }
                        throw new IllegalStateException("Unprocessed FocusEvent nodes".toString());
                    }
                    throw new IllegalStateException("Unprocessed FocusProperties nodes".toString());
                }
                k kVar = (k) it.next();
                if (kVar.getNode().p1()) {
                    int a11 = z0.a(UserVerificationMethods.USER_VERIFY_ALL);
                    e.c node2 = kVar.getNode();
                    k0.f fVar4 = null;
                    while (node2 != null) {
                        if (node2 instanceof FocusTargetNode) {
                            eVar.f26167b.add((FocusTargetNode) node2);
                        } else if (((node2.k1() & a11) != 0) && (node2 instanceof p1.l)) {
                            int i16 = 0;
                            for (e.c J13 = ((p1.l) node2).J1(); J13 != null; J13 = J13.g1()) {
                                if ((J13.k1() & a11) != 0) {
                                    i16++;
                                    if (i16 == 1) {
                                        node2 = J13;
                                    } else {
                                        if (fVar4 == null) {
                                            fVar4 = new k0.f(new e.c[16], 0);
                                        }
                                        if (node2 != null) {
                                            fVar4.d(node2);
                                            node2 = null;
                                        }
                                        fVar4.d(J13);
                                    }
                                }
                            }
                            if (i16 == 1) {
                            }
                        }
                        node2 = p1.k.g(fVar4);
                    }
                    if (kVar.getNode().p1()) {
                        k0.f fVar5 = new k0.f(new e.c[16], 0);
                        e.c g13 = kVar.getNode().g1();
                        if (g13 == null) {
                            p1.k.c(fVar5, kVar.getNode());
                        } else {
                            fVar5.d(g13);
                        }
                        while (fVar5.s()) {
                            e.c cVar3 = (e.c) fVar5.x(fVar5.o() - 1);
                            if ((cVar3.f1() & a11) == 0) {
                                p1.k.c(fVar5, cVar3);
                            } else {
                                while (true) {
                                    if (cVar3 == null) {
                                        break;
                                    } else if ((cVar3.k1() & a11) != 0) {
                                        k0.f fVar6 = null;
                                        while (cVar3 != null) {
                                            if (cVar3 instanceof FocusTargetNode) {
                                                eVar.f26167b.add((FocusTargetNode) cVar3);
                                            } else if (((cVar3.k1() & a11) != 0) && (cVar3 instanceof p1.l)) {
                                                int i17 = 0;
                                                for (e.c J14 = ((p1.l) cVar3).J1(); J14 != null; J14 = J14.g1()) {
                                                    if ((J14.k1() & a11) != 0) {
                                                        i17++;
                                                        if (i17 == 1) {
                                                            cVar3 = J14;
                                                        } else {
                                                            if (fVar6 == null) {
                                                                fVar6 = new k0.f(new e.c[16], 0);
                                                            }
                                                            if (cVar3 != null) {
                                                                fVar6.d(cVar3);
                                                                cVar3 = null;
                                                            }
                                                            fVar6.d(J14);
                                                        }
                                                    }
                                                }
                                                if (i17 == 1) {
                                                }
                                            }
                                            cVar3 = p1.k.g(fVar6);
                                        }
                                    } else {
                                        cVar3 = cVar3.g1();
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("visitChildren called on an unattached node".toString());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(pc.l<? super pc.a<w>, w> lVar) {
        qc.q.i(lVar, "onRequestApplyChangesListener");
        this.f26166a = lVar;
        this.f26167b = new LinkedHashSet();
        this.f26168c = new LinkedHashSet();
        this.f26169d = new LinkedHashSet();
        this.f26170e = new a();
    }

    private final <T> void e(Set<T> set, T t10) {
        if (set.add(t10) && this.f26167b.size() + this.f26168c.size() + this.f26169d.size() == 1) {
            this.f26166a.invoke(this.f26170e);
        }
    }

    public final void d(FocusTargetNode focusTargetNode) {
        qc.q.i(focusTargetNode, "node");
        e(this.f26167b, focusTargetNode);
    }

    public final void f(c cVar) {
        qc.q.i(cVar, "node");
        e(this.f26168c, cVar);
    }

    public final void g(k kVar) {
        qc.q.i(kVar, "node");
        e(this.f26169d, kVar);
    }
}
