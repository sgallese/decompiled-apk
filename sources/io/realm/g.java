package io.realm;

import io.realm.internal.OsObjectStore;
import io.realm.internal.Util;
import io.realm.p0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: CollectionUtils.java */
/* loaded from: classes4.dex */
public class g {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(a aVar, a1 a1Var, String str, String str2) {
        if (a1Var instanceof io.realm.internal.o) {
            io.realm.internal.o oVar = (io.realm.internal.o) a1Var;
            if (oVar instanceof p) {
                if (oVar.b().f() == aVar) {
                    String type = ((p) a1Var).getType();
                    if (str.equals(p0.class.getCanonicalName()) || str.equals(type)) {
                        return false;
                    }
                    throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'.", str2, str2, str, type));
                } else if (aVar.f17239m == oVar.b().f().f17239m) {
                    throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
                } else {
                    throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
                }
            } else if (oVar.b().g() != null && oVar.b().f().getPath().equals(aVar.getPath())) {
                if (aVar == oVar.b().f()) {
                    return false;
                }
                throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
            }
        }
        return true;
    }

    public static <E extends a1> E b(a aVar, E e10) {
        o0 o0Var = (o0) aVar;
        if (OsObjectStore.b(o0Var.T(), o0Var.L().p().m(e10.getClass())) != null) {
            return (E) o0Var.F0(e10, new v[0]);
        }
        return (E) o0Var.D0(e10, new v[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 c(a aVar, p0 p0Var) {
        if (p0Var.c() == p0.a.OBJECT) {
            Class<?> d10 = p0Var.d();
            a1 a10 = p0Var.a(d10);
            if (a10 instanceof io.realm.internal.o) {
                io.realm.internal.o oVar = (io.realm.internal.o) a10;
                if (oVar instanceof p) {
                    if (oVar.b().f() == aVar) {
                        return p0Var;
                    }
                    if (aVar.f17239m == oVar.b().f().f17239m) {
                        throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                    }
                    throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
                } else if (!aVar.R().h(d10).f()) {
                    if (oVar.b().g() != null && oVar.b().f().getPath().equals(aVar.getPath())) {
                        if (aVar == oVar.b().f()) {
                            return p0Var;
                        }
                        throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
                    }
                } else {
                    throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
                }
            }
            return p0.e(b(aVar, a10));
        }
        return p0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(a aVar, a1 a1Var) {
        if (aVar instanceof o0) {
            return aVar.R().h(a1Var.getClass()).f();
        }
        return aVar.R().i(((p) a1Var).getType()).f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(o0 o0Var, a1 a1Var, long j10) {
        io.realm.internal.p p10 = o0Var.L().p();
        Class<? extends a1> d10 = Util.d(a1Var.getClass());
        p10.v(o0Var, a1Var, p10.t(d10, o0Var, o0Var.c1(d10).s(j10), o0Var.R().e(d10), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}
