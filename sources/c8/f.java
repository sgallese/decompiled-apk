package c8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import x7.w;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes3.dex */
public final class f {
    public static <ResultT> ResultT a(d<ResultT> dVar) throws ExecutionException, InterruptedException {
        w.a(dVar, "Task must not be null");
        if (dVar.f()) {
            return (ResultT) d(dVar);
        }
        t tVar = new t(null);
        e(dVar, tVar);
        tVar.a();
        return (ResultT) d(dVar);
    }

    public static d b(Exception exc) {
        r rVar = new r();
        rVar.h(exc);
        return rVar;
    }

    public static d c(Object obj) {
        r rVar = new r();
        rVar.i(obj);
        return rVar;
    }

    private static Object d(d dVar) throws ExecutionException {
        if (dVar.g()) {
            return dVar.e();
        }
        throw new ExecutionException(dVar.d());
    }

    private static void e(d dVar, u uVar) {
        Executor executor = e.f8867b;
        dVar.c(executor, uVar);
        dVar.b(executor, uVar);
    }
}
