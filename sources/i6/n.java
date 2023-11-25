package i6;

import java.util.concurrent.Executor;

/* compiled from: SafeLoggingExecutor.java */
/* loaded from: classes.dex */
class n implements Executor {

    /* renamed from: f  reason: collision with root package name */
    private final Executor f17082f;

    /* compiled from: SafeLoggingExecutor.java */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private final Runnable f17083f;

        a(Runnable runnable) {
            this.f17083f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f17083f.run();
            } catch (Exception e10) {
                m6.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f17082f = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f17082f.execute(new a(runnable));
    }
}
