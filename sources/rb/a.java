package rb;

import io.reactivex.Scheduler;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* compiled from: RxAndroidPlugins.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Function<Callable<Scheduler>, Scheduler> f22534a;

    static <T, R> R a(Function<T, R> function, T t10) {
        try {
            return (R) function.apply(t10);
        } catch (Throwable th) {
            throw Exceptions.propagate(th);
        }
    }

    static Scheduler b(Function<Callable<Scheduler>, Scheduler> function, Callable<Scheduler> callable) {
        Scheduler scheduler = (Scheduler) a(function, callable);
        if (scheduler != null) {
            return scheduler;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static Scheduler c(Callable<Scheduler> callable) {
        try {
            Scheduler call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw Exceptions.propagate(th);
        }
    }

    public static Scheduler d(Callable<Scheduler> callable) {
        if (callable != null) {
            Function<Callable<Scheduler>, Scheduler> function = f22534a;
            if (function == null) {
                return c(callable);
            }
            return b(function, callable);
        }
        throw new NullPointerException("scheduler == null");
    }
}
