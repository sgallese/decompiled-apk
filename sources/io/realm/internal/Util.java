package io.realm.internal;

import io.realm.a1;
import io.realm.d1;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class Util {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f17796a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f17797b;

    public static void a(String str, String str2) {
        if (!g(str)) {
            return;
        }
        throw new IllegalArgumentException("Non-empty '" + str2 + "' required.");
    }

    public static void b(String str) {
        if (!new vb.a().b()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new IllegalArgumentException("Nonnull '" + str + "' required.");
    }

    public static Class<? extends a1> d(Class<? extends a1> cls) {
        if (!cls.equals(a1.class) && !cls.equals(d1.class)) {
            Class superclass = cls.getSuperclass();
            if (!superclass.equals(Object.class) && !superclass.equals(d1.class)) {
                return superclass;
            }
            return cls;
        }
        throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
    }

    public static String e() {
        return nativeGetTablePrefix();
    }

    public static synchronized boolean f() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f17797b == null) {
                try {
                    f17797b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f17797b = Boolean.FALSE;
                }
            }
            booleanValue = f17797b.booleanValue();
        }
        return booleanValue;
    }

    public static boolean g(String str) {
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static synchronized boolean h() {
        boolean booleanValue;
        synchronized (Util.class) {
            if (f17796a == null) {
                try {
                    Class.forName("io.reactivex.Flowable");
                    f17796a = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f17796a = Boolean.FALSE;
                }
            }
            booleanValue = f17796a.booleanValue();
        }
        return booleanValue;
    }

    public static <T> Set<T> i(T... tArr) {
        if (tArr == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t10 : tArr) {
            if (t10 != null) {
                linkedHashSet.add(t10);
            }
        }
        return linkedHashSet;
    }

    static native String nativeGetTablePrefix();
}
