package okhttp3.internal.concurrent;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import dc.w;
import ec.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import okhttp3.internal.Util;
import pc.a;
import qc.q;

/* compiled from: TaskQueue.kt */
/* loaded from: classes4.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    /* compiled from: TaskQueue.kt */
    /* loaded from: classes4.dex */
    private static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(q.q(Util.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        q.i(taskRunner, "taskRunner");
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j10, boolean z10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(aVar, "block");
        taskQueue.schedule(new TaskQueue$execute$1(str, z10, aVar), j10);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        taskQueue.schedule(task, j10);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            w wVar = w.f13270a;
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            q.f(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        int size = this.futureTasks.size() - 1;
        boolean z10 = false;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                if (this.futureTasks.get(size).getCancelable()) {
                    Task task2 = this.futureTasks.get(size);
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task2, this, "canceled");
                    }
                    this.futureTasks.remove(size);
                    z10 = true;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
        }
        return z10;
    }

    public final void execute(String str, long j10, boolean z10, a<w> aVar) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(aVar, "block");
        schedule(new TaskQueue$execute$1(str, z10, aVar), j10);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> C0;
        synchronized (this.taskRunner) {
            C0 = b0.C0(getFutureTasks$okhttp());
        }
        return C0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (getActiveTask$okhttp() == null && getFutureTasks$okhttp().isEmpty()) {
                return new CountDownLatch(0);
            }
            Task activeTask$okhttp = getActiveTask$okhttp();
            if (activeTask$okhttp instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) activeTask$okhttp).getLatch();
            }
            for (Task task : getFutureTasks$okhttp()) {
                if (task instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(Task task, long j10) {
        q.i(task, "task");
        synchronized (this.taskRunner) {
            if (getShutdown$okhttp()) {
                if (task.getCancelable()) {
                    if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                        TaskLoggerKt.access$log(task, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                }
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
            if (scheduleAndDecide$okhttp(task, j10, false)) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            w wVar = w.f13270a;
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j10, boolean z10) {
        boolean z11;
        String q10;
        q.i(task, "task");
        task.initQueue$okhttp(this);
        long nanoTime = this.taskRunner.getBackend().nanoTime();
        long j11 = nanoTime + j10;
        int indexOf = this.futureTasks.indexOf(task);
        if (indexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j11) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.access$log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(indexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j11);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z10) {
                q10 = q.q("run again after ", TaskLoggerKt.formatDuration(j11 - nanoTime));
            } else {
                q10 = q.q("scheduled after ", TaskLoggerKt.formatDuration(j11 - nanoTime));
            }
            TaskLoggerKt.access$log(task, this, q10);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (it.next().getNextExecuteNanoTime$okhttp() - nanoTime > j10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = this.futureTasks.size();
        }
        this.futureTasks.add(i10, task);
        if (i10 != 0) {
            return false;
        }
        return true;
    }

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void setShutdown$okhttp(boolean z10) {
        this.shutdown = z10;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            setShutdown$okhttp(true);
            if (cancelAllAndDecide$okhttp()) {
                getTaskRunner$okhttp().kickCoordinator$okhttp(this);
            }
            w wVar = w.f13270a;
        }
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j10, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(aVar, "block");
        taskQueue.schedule(new TaskQueue$schedule$2(str, aVar), j10);
    }

    public final void schedule(String str, long j10, a<Long> aVar) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        q.i(aVar, "block");
        schedule(new TaskQueue$schedule$2(str, aVar), j10);
    }
}
