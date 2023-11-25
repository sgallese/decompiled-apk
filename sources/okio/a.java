package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes4.dex */
public class a extends a1 {
    public static final C0462a Companion = new C0462a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static a head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: okio.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0462a {
        private C0462a() {
        }

        public /* synthetic */ C0462a(qc.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(a aVar) {
            ReentrantLock f10 = a.Companion.f();
            f10.lock();
            try {
                if (aVar.inQueue) {
                    aVar.inQueue = false;
                    for (a aVar2 = a.head; aVar2 != null; aVar2 = aVar2.next) {
                        if (aVar2.next == aVar) {
                            aVar2.next = aVar.next;
                            aVar.next = null;
                            return false;
                        }
                    }
                    f10.unlock();
                    return true;
                }
                return false;
            } finally {
                f10.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(a aVar, long j10, boolean z10) {
            ReentrantLock f10 = a.Companion.f();
            f10.lock();
            try {
                if ((!aVar.inQueue) != false) {
                    aVar.inQueue = true;
                    if (a.head == null) {
                        a.head = new a();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j10 != 0 && z10) {
                        aVar.timeoutAt = Math.min(j10, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j10 != 0) {
                        aVar.timeoutAt = j10 + nanoTime;
                    } else if (z10) {
                        aVar.timeoutAt = aVar.deadlineNanoTime();
                    } else {
                        throw new AssertionError();
                    }
                    long remainingNanos = aVar.remainingNanos(nanoTime);
                    a aVar2 = a.head;
                    qc.q.f(aVar2);
                    while (aVar2.next != null) {
                        a aVar3 = aVar2.next;
                        qc.q.f(aVar3);
                        if (remainingNanos < aVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        aVar2 = aVar2.next;
                        qc.q.f(aVar2);
                    }
                    aVar.next = aVar2.next;
                    aVar2.next = aVar;
                    if (aVar2 == a.head) {
                        a.Companion.e().signal();
                    }
                    dc.w wVar = dc.w.f13270a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            } finally {
                f10.unlock();
            }
        }

        public final a c() throws InterruptedException {
            a aVar = a.head;
            qc.q.f(aVar);
            a aVar2 = aVar.next;
            if (aVar2 != null) {
                long remainingNanos = aVar2.remainingNanos(System.nanoTime());
                if (remainingNanos <= 0) {
                    a aVar3 = a.head;
                    qc.q.f(aVar3);
                    aVar3.next = aVar2.next;
                    aVar2.next = null;
                    return aVar2;
                }
                e().await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            long nanoTime = System.nanoTime();
            e().await(a.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            a aVar4 = a.head;
            qc.q.f(aVar4);
            if (aVar4.next == null && System.nanoTime() - nanoTime >= a.IDLE_TIMEOUT_NANOS) {
                return a.head;
            }
            return null;
        }

        public final Condition e() {
            return a.condition;
        }

        public final ReentrantLock f() {
            return a.lock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f10;
            a c10;
            while (true) {
                try {
                    C0462a c0462a = a.Companion;
                    f10 = c0462a.f();
                    f10.lock();
                    try {
                        c10 = c0462a.c();
                    } finally {
                        f10.unlock();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
                if (c10 == a.head) {
                    a.head = null;
                    return;
                }
                dc.w wVar = dc.w.f13270a;
                f10.unlock();
                if (c10 != null) {
                    c10.timedOut();
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class c implements y0 {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ y0 f20599m;

        c(y0 y0Var) {
            this.f20599m = y0Var;
        }

        @Override // okio.y0
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public a timeout() {
            return a.this;
        }

        @Override // okio.y0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            y0 y0Var = this.f20599m;
            aVar.enter();
            try {
                y0Var.close();
                dc.w wVar = dc.w.f13270a;
                if (!aVar.exit()) {
                    return;
                }
                throw aVar.access$newTimeoutException(null);
            } catch (IOException e10) {
                if (!aVar.exit()) {
                    throw e10;
                }
                throw aVar.access$newTimeoutException(e10);
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.y0, java.io.Flushable
        public void flush() {
            a aVar = a.this;
            y0 y0Var = this.f20599m;
            aVar.enter();
            try {
                y0Var.flush();
                dc.w wVar = dc.w.f13270a;
                if (!aVar.exit()) {
                    return;
                }
                throw aVar.access$newTimeoutException(null);
            } catch (IOException e10) {
                if (!aVar.exit()) {
                    throw e10;
                }
                throw aVar.access$newTimeoutException(e10);
            } finally {
                aVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f20599m + ')';
        }

        @Override // okio.y0
        public void write(okio.c cVar, long j10) {
            qc.q.i(cVar, "source");
            f1.b(cVar.s0(), 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 > 0) {
                    v0 v0Var = cVar.f20602f;
                    qc.q.f(v0Var);
                    while (true) {
                        if (j11 >= 65536) {
                            break;
                        }
                        j11 += v0Var.f20689c - v0Var.f20688b;
                        if (j11 >= j10) {
                            j11 = j10;
                            break;
                        } else {
                            v0Var = v0Var.f20692f;
                            qc.q.f(v0Var);
                        }
                    }
                    a aVar = a.this;
                    y0 y0Var = this.f20599m;
                    aVar.enter();
                    try {
                        y0Var.write(cVar, j11);
                        dc.w wVar = dc.w.f13270a;
                        if (!aVar.exit()) {
                            j10 -= j11;
                        } else {
                            throw aVar.access$newTimeoutException(null);
                        }
                    } catch (IOException e10) {
                        if (!aVar.exit()) {
                            throw e10;
                        }
                        throw aVar.access$newTimeoutException(e10);
                    } finally {
                        aVar.exit();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes4.dex */
    public static final class d implements Source {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Source f20601m;

        d(Source source) {
            this.f20601m = source;
        }

        @Override // okio.Source
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public a timeout() {
            return a.this;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            Source source = this.f20601m;
            aVar.enter();
            try {
                source.close();
                dc.w wVar = dc.w.f13270a;
                if (!aVar.exit()) {
                    return;
                }
                throw aVar.access$newTimeoutException(null);
            } catch (IOException e10) {
                if (!aVar.exit()) {
                    throw e10;
                }
                throw aVar.access$newTimeoutException(e10);
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.Source
        public long read(okio.c cVar, long j10) {
            qc.q.i(cVar, "sink");
            a aVar = a.this;
            Source source = this.f20601m;
            aVar.enter();
            try {
                long read = source.read(cVar, j10);
                if (!aVar.exit()) {
                    return read;
                }
                throw aVar.access$newTimeoutException(null);
            } catch (IOException e10) {
                if (!aVar.exit()) {
                    throw e10;
                }
                throw aVar.access$newTimeoutException(e10);
            } finally {
                aVar.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f20601m + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        qc.q.h(newCondition, "lock.newCondition()");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j10) {
        return this.timeoutAt - j10;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final y0 sink(y0 y0Var) {
        qc.q.i(y0Var, "sink");
        return new c(y0Var);
    }

    public final Source source(Source source) {
        qc.q.i(source, "source");
        return new d(source);
    }

    public final <T> T withTimeout(pc.a<? extends T> aVar) {
        qc.q.i(aVar, "block");
        enter();
        try {
            try {
                T invoke = aVar.invoke();
                qc.o.b(1);
                if (!exit()) {
                    qc.o.a(1);
                    return invoke;
                }
                throw access$newTimeoutException(null);
            } catch (IOException e10) {
                if (!exit()) {
                    throw e10;
                }
                throw access$newTimeoutException(e10);
            }
        } catch (Throwable th) {
            qc.o.b(1);
            exit();
            qc.o.a(1);
            throw th;
        }
    }

    protected void timedOut() {
    }
}
