package ac;

import dd.g;
import io.realm.a1;
import io.realm.g1;
import io.realm.n;
import io.realm.o0;
import qc.q;

/* compiled from: RealmResultsExtensions.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final <T extends a1> g<g1<T>> a(g1<T> g1Var) {
        q.i(g1Var, "<this>");
        io.realm.a aVar = g1Var.f17618f;
        if (aVar instanceof o0) {
            o0 o0Var = (o0) aVar;
            g<g1<T>> c10 = o0Var.L().g().c(o0Var, g1Var);
            q.h(c10, "realmInstance.configurat…from(realmInstance, this)");
            return c10;
        } else if (aVar instanceof n) {
            n nVar = (n) aVar;
            g<g1<T>> d10 = nVar.L().g().d(nVar, g1Var);
            q.h(d10, "realmInstance.configurat…from(realmInstance, this)");
            return d10;
        } else {
            throw new IllegalStateException("Wrong type of Realm.");
        }
    }
}
