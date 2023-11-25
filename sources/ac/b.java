package ac;

import dd.g;
import dd.i;
import io.realm.a1;
import io.realm.internal.o;
import io.realm.n;
import io.realm.o0;
import io.realm.p;

/* compiled from: RealmObjectExtensions.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final <T extends a1> g<T> a(T t10) {
        g<p> gVar;
        if (t10 != null) {
            if (t10 instanceof o) {
                io.realm.a f10 = ((o) t10).b().f();
                if (f10 instanceof o0) {
                    o0 o0Var = (o0) f10;
                    gVar = o0Var.L().g().a(o0Var, t10);
                } else if (f10 instanceof n) {
                    n nVar = (n) f10;
                    gVar = nVar.L().g().b(nVar, (p) t10);
                    if (gVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of io.realm.kotlin.RealmObjectExtensionsKt.toFlow$lambda-1$lambda-0?>");
                    }
                } else {
                    throw new UnsupportedOperationException(f10.getClass() + " is not supported as a candidate for 'toFlow'. Only subclasses of RealmModel/RealmObject can be used.");
                }
            } else {
                return i.B(t10);
            }
        } else {
            gVar = null;
        }
        if (gVar == null) {
            return i.B(null);
        }
        return gVar;
    }
}
