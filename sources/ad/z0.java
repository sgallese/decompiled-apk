package ad;

import java.util.concurrent.Executor;

/* compiled from: Executors.kt */
/* loaded from: classes4.dex */
final class z0 implements Executor {

    /* renamed from: f  reason: collision with root package name */
    public final g0 f587f;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g0 g0Var = this.f587f;
        hc.g gVar = hc.g.f16601f;
        if (g0Var.D0(gVar)) {
            this.f587f.A0(gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f587f.toString();
    }
}
