package q0;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import j0.l;
import j0.x1;
import j0.y1;
import qc.q;

/* compiled from: ComposableLambda.kt */
/* loaded from: classes.dex */
public final class c {
    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final a b(l lVar, int i10, boolean z10, Object obj) {
        b bVar;
        q.i(lVar, "composer");
        q.i(obj, "block");
        lVar.e(i10);
        Object f10 = lVar.f();
        if (f10 == l.f18688a.a()) {
            bVar = new b(i10, z10);
            lVar.J(bVar);
        } else {
            q.g(f10, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
            bVar = (b) f10;
        }
        bVar.h(obj);
        lVar.N();
        return bVar;
    }

    public static final a c(int i10, boolean z10, Object obj) {
        q.i(obj, "block");
        b bVar = new b(i10, z10);
        bVar.h(obj);
        return bVar;
    }

    public static final int d(int i10) {
        return a(2, i10);
    }

    public static final boolean e(x1 x1Var, x1 x1Var2) {
        q.i(x1Var2, TaskSetupFragment.TYPE_OTHER);
        if (x1Var != null) {
            if ((x1Var instanceof y1) && (x1Var2 instanceof y1)) {
                y1 y1Var = (y1) x1Var;
                if (!y1Var.r() || q.d(x1Var, x1Var2) || q.d(y1Var.j(), ((y1) x1Var2).j())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
