package ad;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
public final class o1 {
    public static final g0 a(Executor executor) {
        z0 z0Var;
        g0 g0Var;
        if (executor instanceof z0) {
            z0Var = (z0) executor;
        } else {
            z0Var = null;
        }
        if (z0Var == null || (g0Var = z0Var.f587f) == null) {
            return new n1(executor);
        }
        return g0Var;
    }

    public static final m1 b(ExecutorService executorService) {
        return new n1(executorService);
    }
}
