package o4;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public class k implements Executor {

    /* renamed from: m  reason: collision with root package name */
    private final Executor f20488m;

    /* renamed from: q  reason: collision with root package name */
    private volatile Runnable f20490q;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<a> f20487f = new ArrayDeque<>();

    /* renamed from: p  reason: collision with root package name */
    private final Object f20489p = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SerialExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final k f20491f;

        /* renamed from: m  reason: collision with root package name */
        final Runnable f20492m;

        a(k kVar, Runnable runnable) {
            this.f20491f = kVar;
            this.f20492m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f20492m.run();
            } finally {
                this.f20491f.b();
            }
        }
    }

    public k(Executor executor) {
        this.f20488m = executor;
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f20489p) {
            if (!this.f20487f.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    void b() {
        synchronized (this.f20489p) {
            a poll = this.f20487f.poll();
            this.f20490q = poll;
            if (poll != null) {
                this.f20488m.execute(this.f20490q);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f20489p) {
            this.f20487f.add(new a(this, runnable));
            if (this.f20490q == null) {
                b();
            }
        }
    }
}
