package ac;

import io.realm.a1;
import io.realm.d1;
import qc.q;

/* compiled from: RealmModelExtensions.kt */
/* loaded from: classes4.dex */
public final class a {
    public static final void a(a1 a1Var) {
        q.i(a1Var, "<this>");
        d1.deleteFromRealm(a1Var);
    }

    public static final boolean b(a1 a1Var) {
        q.i(a1Var, "<this>");
        return d1.isValid(a1Var);
    }
}
