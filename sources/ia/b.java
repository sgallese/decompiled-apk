package ia;

import ga.d;
import java.lang.reflect.AccessibleObject;

/* compiled from: ReflectionAccessor.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private static final b f17124a;

    static {
        b cVar;
        if (d.c() < 9) {
            cVar = new a();
        } else {
            cVar = new c();
        }
        f17124a = cVar;
    }

    public static b a() {
        return f17124a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
