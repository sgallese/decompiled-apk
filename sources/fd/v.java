package fd;

import ad.i2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f15681a;

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f15682b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final i2 f15683c;

    static {
        v vVar = new v();
        f15681a = vVar;
        h0.f("kotlinx.coroutines.fast.service.loader", true);
        f15683c = vVar.a();
    }

    private v() {
    }

    private final i2 a() {
        xc.g c10;
        List<u> D;
        Object next;
        i2 e10;
        try {
            if (!f15682b) {
                c10 = xc.m.c(ServiceLoader.load(u.class, u.class.getClassLoader()).iterator());
                D = xc.o.D(c10);
            } else {
                D = k.f15642a.c();
            }
            Iterator<T> it = D.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c11 = ((u) next).c();
                    do {
                        Object next2 = it.next();
                        int c12 = ((u) next2).c();
                        if (c11 < c12) {
                            next = next2;
                            c11 = c12;
                        }
                    } while (it.hasNext());
                }
            }
            u uVar = (u) next;
            if (uVar == null || (e10 = w.e(uVar, D)) == null) {
                return w.b(null, null, 3, null);
            }
            return e10;
        } catch (Throwable th) {
            return w.b(th, null, 2, null);
        }
    }
}
