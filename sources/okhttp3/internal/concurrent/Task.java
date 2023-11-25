package okhttp3.internal.concurrent;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import qc.h;
import qc.q;

/* compiled from: Task.kt */
/* loaded from: classes4.dex */
public abstract class Task {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private TaskQueue queue;

    public Task(String str, boolean z10) {
        q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.name = str;
        this.cancelable = z10;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(TaskQueue taskQueue) {
        boolean z10;
        q.i(taskQueue, "queue");
        TaskQueue taskQueue2 = this.queue;
        if (taskQueue2 == taskQueue) {
            return;
        }
        if (taskQueue2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.queue = taskQueue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j10) {
        this.nextExecuteNanoTime = j10;
    }

    public final void setQueue$okhttp(TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z10, int i10, h hVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
