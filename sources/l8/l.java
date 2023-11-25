package l8;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SequentialExecutor.java */
/* loaded from: classes3.dex */
public final class l implements Executor {

    /* renamed from: s  reason: collision with root package name */
    private static final Logger f19600s = Logger.getLogger(l.class.getName());

    /* renamed from: f  reason: collision with root package name */
    private final Executor f19601f;

    /* renamed from: m  reason: collision with root package name */
    private final Deque<Runnable> f19602m = new ArrayDeque();

    /* renamed from: p  reason: collision with root package name */
    private c f19603p = c.IDLE;

    /* renamed from: q  reason: collision with root package name */
    private long f19604q = 0;

    /* renamed from: r  reason: collision with root package name */
    private final b f19605r = new b(this, null);

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Runnable f19606f;

        a(Runnable runnable) {
            this.f19606f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19606f.run();
        }

        public String toString() {
            return this.f19606f.toString();
        }
    }

    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes3.dex */
    private final class b implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        Runnable f19608f;

        private b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r8.f19608f.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            l8.l.f19600s.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f19608f, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        
            r8.f19608f = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L2:
                l8.l r2 = l8.l.this     // Catch: java.lang.Throwable -> L82
                java.util.Deque r2 = l8.l.a(r2)     // Catch: java.lang.Throwable -> L82
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L82
                if (r0 != 0) goto L2b
                l8.l r0 = l8.l.this     // Catch: java.lang.Throwable -> L7f
                l8.l$c r0 = l8.l.b(r0)     // Catch: java.lang.Throwable -> L7f
                l8.l$c r3 = l8.l.c.RUNNING     // Catch: java.lang.Throwable -> L7f
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                l8.l r0 = l8.l.this     // Catch: java.lang.Throwable -> L7f
                l8.l.e(r0)     // Catch: java.lang.Throwable -> L7f
                l8.l r0 = l8.l.this     // Catch: java.lang.Throwable -> L7f
                l8.l.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                r0 = 1
            L2b:
                l8.l r3 = l8.l.this     // Catch: java.lang.Throwable -> L7f
                java.util.Deque r3 = l8.l.a(r3)     // Catch: java.lang.Throwable -> L7f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L7f
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L7f
                r8.f19608f = r3     // Catch: java.lang.Throwable -> L7f
                if (r3 != 0) goto L4d
                l8.l r0 = l8.l.this     // Catch: java.lang.Throwable -> L7f
                l8.l$c r3 = l8.l.c.IDLE     // Catch: java.lang.Throwable -> L7f
                l8.l.c(r0, r3)     // Catch: java.lang.Throwable -> L7f
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L82
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f19608f     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r8.f19608f = r2     // Catch: java.lang.Throwable -> L82
                goto L2
            L5c:
                r0 = move-exception
                goto L7c
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = l8.l.f()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r6.<init>()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r7 = r8.f19608f     // Catch: java.lang.Throwable -> L5c
                r6.append(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L7c:
                r8.f19608f = r2     // Catch: java.lang.Throwable -> L82
                throw r0     // Catch: java.lang.Throwable -> L82
            L7f:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
                throw r0     // Catch: java.lang.Throwable -> L82
            L82:
                r0 = move-exception
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: l8.l.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (l.this.f19602m) {
                    l.this.f19603p = c.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f19608f;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + l.this.f19603p + "}";
        }

        /* synthetic */ b(l lVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SequentialExecutor.java */
    /* loaded from: classes3.dex */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Executor executor) {
        this.f19601f = (Executor) Preconditions.checkNotNull(executor);
    }

    static /* synthetic */ long e(l lVar) {
        long j10 = lVar.f19604q;
        lVar.f19604q = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c cVar;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f19602m) {
            c cVar2 = this.f19603p;
            if (cVar2 != c.RUNNING && cVar2 != (cVar = c.QUEUED)) {
                long j10 = this.f19604q;
                a aVar = new a(runnable);
                this.f19602m.add(aVar);
                c cVar3 = c.QUEUING;
                this.f19603p = cVar3;
                boolean z10 = true;
                try {
                    this.f19601f.execute(this.f19605r);
                    if (this.f19603p == cVar3) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f19602m) {
                        if (this.f19604q == j10 && this.f19603p == cVar3) {
                            this.f19603p = cVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f19602m) {
                        c cVar4 = this.f19603p;
                        if ((cVar4 != c.IDLE && cVar4 != c.QUEUING) || !this.f19602m.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f19602m.add(runnable);
        }
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f19601f + "}";
    }
}
