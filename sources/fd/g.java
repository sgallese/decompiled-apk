package fd;

import java.util.Collection;
import java.util.List;
import java.util.ServiceLoader;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection<ad.h0> f15632a;

    static {
        xc.g c10;
        List D;
        c10 = xc.m.c(ServiceLoader.load(ad.h0.class, ad.h0.class.getClassLoader()).iterator());
        D = xc.o.D(c10);
        f15632a = D;
    }

    public static final Collection<ad.h0> a() {
        return f15632a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
