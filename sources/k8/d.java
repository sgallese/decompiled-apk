package k8;

import java.util.Set;

/* compiled from: ComponentContainer.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class d {
    public static Object a(e eVar, Class cls) {
        return eVar.f(b0.b(cls));
    }

    public static Object b(e eVar, b0 b0Var) {
        i9.b e10 = eVar.e(b0Var);
        if (e10 == null) {
            return null;
        }
        return e10.get();
    }

    public static i9.a c(e eVar, Class cls) {
        return eVar.d(b0.b(cls));
    }

    public static i9.b d(e eVar, Class cls) {
        return eVar.e(b0.b(cls));
    }

    public static Set e(e eVar, Class cls) {
        return eVar.b(b0.b(cls));
    }

    public static Set f(e eVar, b0 b0Var) {
        return (Set) eVar.h(b0Var).get();
    }
}
