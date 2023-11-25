package androidx.compose.ui.layout;

import androidx.compose.ui.e;
import n1.g0;
import n1.v;
import qc.q;

/* compiled from: LayoutId.kt */
/* loaded from: classes.dex */
public final class a {
    public static final Object a(g0 g0Var) {
        v vVar;
        q.i(g0Var, "<this>");
        Object A = g0Var.A();
        if (A instanceof v) {
            vVar = (v) A;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            return null;
        }
        return vVar.L();
    }

    public static final e b(e eVar, Object obj) {
        q.i(eVar, "<this>");
        q.i(obj, "layoutId");
        return eVar.a(new LayoutIdElement(obj));
    }
}
