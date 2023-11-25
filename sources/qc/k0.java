package qc;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import rc.e;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes4.dex */
public class k0 {
    public static Collection a(Object obj) {
        if ((obj instanceof rc.a) && !(obj instanceof rc.b)) {
            p(obj, "kotlin.collections.MutableCollection");
        }
        return f(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof rc.a) && !(obj instanceof rc.c)) {
            p(obj, "kotlin.collections.MutableIterable");
        }
        return g(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof rc.a) && !(obj instanceof rc.d)) {
            p(obj, "kotlin.collections.MutableList");
        }
        return h(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof rc.a) && !(obj instanceof rc.e)) {
            p(obj, "kotlin.collections.MutableMap");
        }
        return i(obj);
    }

    public static Object e(Object obj, int i10) {
        if (obj != null && !k(obj, i10)) {
            p(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection f(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Iterable g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static List h(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static Map i(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw o(e10);
        }
    }

    public static int j(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).getArity();
        }
        if (obj instanceof pc.a) {
            return 0;
        }
        if (obj instanceof pc.l) {
            return 1;
        }
        if (obj instanceof pc.p) {
            return 2;
        }
        if (obj instanceof pc.q) {
            return 3;
        }
        if (obj instanceof pc.r) {
            return 4;
        }
        if (obj instanceof pc.s) {
            return 5;
        }
        if (obj instanceof pc.t) {
            return 6;
        }
        if (obj instanceof pc.u) {
            return 7;
        }
        if (obj instanceof pc.v) {
            return 8;
        }
        if (obj instanceof pc.w) {
            return 9;
        }
        if (obj instanceof pc.b) {
            return 10;
        }
        if (obj instanceof pc.c) {
            return 11;
        }
        if (obj instanceof pc.d) {
            return 12;
        }
        if (obj instanceof pc.e) {
            return 13;
        }
        if (obj instanceof pc.f) {
            return 14;
        }
        if (obj instanceof pc.g) {
            return 15;
        }
        if (obj instanceof pc.h) {
            return 16;
        }
        if (obj instanceof pc.i) {
            return 17;
        }
        if (obj instanceof pc.j) {
            return 18;
        }
        if (obj instanceof pc.k) {
            return 19;
        }
        if (obj instanceof pc.m) {
            return 20;
        }
        if (obj instanceof pc.n) {
            return 21;
        }
        if (obj instanceof pc.o) {
            return 22;
        }
        return -1;
    }

    public static boolean k(Object obj, int i10) {
        if ((obj instanceof dc.c) && j(obj) == i10) {
            return true;
        }
        return false;
    }

    public static boolean l(Object obj) {
        if ((obj instanceof Map.Entry) && (!(obj instanceof rc.a) || (obj instanceof e.a))) {
            return true;
        }
        return false;
    }

    public static boolean m(Object obj) {
        if ((obj instanceof Set) && (!(obj instanceof rc.a) || (obj instanceof rc.f))) {
            return true;
        }
        return false;
    }

    private static <T extends Throwable> T n(T t10) {
        return (T) q.p(t10, k0.class.getName());
    }

    public static ClassCastException o(ClassCastException classCastException) {
        throw ((ClassCastException) n(classCastException));
    }

    public static void p(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        q(name + " cannot be cast to " + str);
    }

    public static void q(String str) {
        throw o(new ClassCastException(str));
    }
}
