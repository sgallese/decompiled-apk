package ad;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes4.dex */
public final class u2 {

    /* renamed from: a  reason: collision with root package name */
    public static final u2 f562a = new u2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<g1> f563b = fd.l0.a(new fd.g0("ThreadLocalEventLoop"));

    private u2() {
    }

    public final g1 a() {
        return f563b.get();
    }

    public final g1 b() {
        ThreadLocal<g1> threadLocal = f563b;
        g1 g1Var = threadLocal.get();
        if (g1Var == null) {
            g1 a10 = j1.a();
            threadLocal.set(a10);
            return a10;
        }
        return g1Var;
    }

    public final void c() {
        f563b.set(null);
    }

    public final void d(g1 g1Var) {
        f563b.set(g1Var);
    }
}
