package okio;

import com.habitrpg.android.habitica.ui.fragments.setup.TaskSetupFragment;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* compiled from: Timeout.kt */
/* loaded from: classes4.dex */
public class a1 {
    public static final b Companion = new b(null);
    public static final a1 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    /* compiled from: Timeout.kt */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(qc.h hVar) {
            this();
        }

        public final long a(long j10, long j11) {
            if (j10 == 0 || (j11 != 0 && j10 >= j11)) {
                return j11;
            }
            return j10;
        }
    }

    public final void awaitSignal(Condition condition) throws InterruptedIOException {
        qc.q.i(condition, "condition");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j10 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                condition.await();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                condition.await(timeoutNanos, TimeUnit.NANOSECONDS);
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public a1 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public a1 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final a1 deadline(long j10, TimeUnit timeUnit) {
        boolean z10;
        qc.q.i(timeUnit, "unit");
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return deadlineNanoTime(System.nanoTime() + timeUnit.toNanos(j10));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j10).toString());
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(a1 a1Var, pc.a<? extends T> aVar) {
        qc.q.i(a1Var, TaskSetupFragment.TYPE_OTHER);
        qc.q.i(aVar, "block");
        long timeoutNanos = timeoutNanos();
        long a10 = Companion.a(a1Var.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(a10, timeUnit);
        if (hasDeadline()) {
            long deadlineNanoTime = deadlineNanoTime();
            if (a1Var.hasDeadline()) {
                deadlineNanoTime(Math.min(deadlineNanoTime(), a1Var.deadlineNanoTime()));
            }
            try {
                T invoke = aVar.invoke();
                qc.o.b(1);
                timeout(timeoutNanos, timeUnit);
                if (a1Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                qc.o.a(1);
                return invoke;
            } catch (Throwable th) {
                qc.o.b(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (a1Var.hasDeadline()) {
                    deadlineNanoTime(deadlineNanoTime);
                }
                qc.o.a(1);
                throw th;
            }
        }
        if (a1Var.hasDeadline()) {
            deadlineNanoTime(a1Var.deadlineNanoTime());
        }
        try {
            T invoke2 = aVar.invoke();
            qc.o.b(1);
            timeout(timeoutNanos, timeUnit);
            if (a1Var.hasDeadline()) {
                clearDeadline();
            }
            qc.o.a(1);
            return invoke2;
        } catch (Throwable th2) {
            qc.o.b(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (a1Var.hasDeadline()) {
                clearDeadline();
            }
            qc.o.a(1);
            throw th2;
        }
    }

    public void throwIfReached() throws IOException {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public a1 timeout(long j10, TimeUnit timeUnit) {
        boolean z10;
        qc.q.i(timeUnit, "unit");
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.timeoutNanos = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object obj) throws InterruptedIOException {
        qc.q.i(obj, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j10 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j11 = timeoutNanos / 1000000;
                Long.signum(j11);
                obj.wait(j11, (int) (timeoutNanos - (1000000 * j11)));
                j10 = System.nanoTime() - nanoTime;
            }
            if (j10 < timeoutNanos) {
                return;
            }
            throw new InterruptedIOException("timeout");
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public a1 deadlineNanoTime(long j10) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j10;
        return this;
    }

    /* compiled from: Timeout.kt */
    /* loaded from: classes4.dex */
    public static final class a extends a1 {
        a() {
        }

        @Override // okio.a1
        public a1 timeout(long j10, TimeUnit timeUnit) {
            qc.q.i(timeUnit, "unit");
            return this;
        }

        @Override // okio.a1
        public void throwIfReached() {
        }

        @Override // okio.a1
        public a1 deadlineNanoTime(long j10) {
            return this;
        }
    }
}
