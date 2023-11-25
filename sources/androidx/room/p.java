package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: TransactionExecutor.java */
/* loaded from: classes.dex */
class p implements Executor {

    /* renamed from: f  reason: collision with root package name */
    private final Executor f7082f;

    /* renamed from: m  reason: collision with root package name */
    private final ArrayDeque<Runnable> f7083m = new ArrayDeque<>();

    /* renamed from: p  reason: collision with root package name */
    private Runnable f7084p;

    /* compiled from: TransactionExecutor.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Runnable f7085f;

        a(Runnable runnable) {
            this.f7085f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f7085f.run();
            } finally {
                p.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Executor executor) {
        this.f7082f = executor;
    }

    synchronized void a() {
        Runnable poll = this.f7083m.poll();
        this.f7084p = poll;
        if (poll != null) {
            this.f7082f.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f7083m.offer(new a(runnable));
        if (this.f7084p == null) {
            a();
        }
    }
}
