package androidx.compose.ui.focus;

import java.util.Comparator;
import p1.j0;
import p1.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OneDimensionalFocusSearch.kt */
/* loaded from: classes.dex */
public final class q implements Comparator<FocusTargetNode> {

    /* renamed from: f  reason: collision with root package name */
    public static final q f2406f = new q();

    private q() {
    }

    private final k0.f<j0> b(j0 j0Var) {
        k0.f<j0> fVar = new k0.f<>(new j0[16], 0);
        while (j0Var != null) {
            fVar.a(0, j0Var);
            j0Var = j0Var.l0();
        }
        return fVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a  reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        j0 j0Var;
        if (focusTargetNode != null) {
            if (focusTargetNode2 != null) {
                int i10 = 0;
                if (p.g(focusTargetNode) && p.g(focusTargetNode2)) {
                    x0 h12 = focusTargetNode.h1();
                    j0 j0Var2 = null;
                    if (h12 != null) {
                        j0Var = h12.f1();
                    } else {
                        j0Var = null;
                    }
                    if (j0Var != null) {
                        x0 h13 = focusTargetNode2.h1();
                        if (h13 != null) {
                            j0Var2 = h13.f1();
                        }
                        if (j0Var2 != null) {
                            if (qc.q.d(j0Var, j0Var2)) {
                                return 0;
                            }
                            k0.f<j0> b10 = b(j0Var);
                            k0.f<j0> b11 = b(j0Var2);
                            int min = Math.min(b10.o() - 1, b11.o() - 1);
                            if (min >= 0) {
                                while (qc.q.d(b10.n()[i10], b11.n()[i10])) {
                                    if (i10 != min) {
                                        i10++;
                                    }
                                }
                                return qc.q.k(b10.n()[i10].m0(), b11.n()[i10].m0());
                            }
                            throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                } else if (p.g(focusTargetNode)) {
                    return -1;
                } else {
                    if (!p.g(focusTargetNode2)) {
                        return 0;
                    }
                    return 1;
                }
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
