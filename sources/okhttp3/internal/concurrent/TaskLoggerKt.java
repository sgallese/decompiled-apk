package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;
import pc.a;
import qc.j0;
import qc.o;
import qc.q;

/* compiled from: TaskLogger.kt */
/* loaded from: classes4.dex */
public final class TaskLoggerKt {
    public static final /* synthetic */ void access$log(Task task, TaskQueue taskQueue, String str) {
        log(task, taskQueue, str);
    }

    public static final String formatDuration(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS)) + " s ";
        }
        j0 j0Var = j0.f21683a;
        String format = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        q.h(format, "format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName$okhttp());
        sb2.append(' ');
        j0 j0Var = j0.f21683a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        q.h(format, "format(format, *args)");
        sb2.append(format);
        sb2.append(": ");
        sb2.append(task.getName());
        logger.fine(sb2.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a<? extends T> aVar) {
        long j10;
        q.i(task, "task");
        q.i(taskQueue, "queue");
        q.i(aVar, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j10 = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j10 = -1;
        }
        try {
            T invoke = aVar.invoke();
            o.b(1);
            if (isLoggable) {
                log(task, taskQueue, q.q("finished run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j10)));
            }
            o.a(1);
            return invoke;
        } catch (Throwable th) {
            o.b(1);
            if (isLoggable) {
                log(task, taskQueue, q.q("failed a run in ", formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j10)));
            }
            o.a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a<String> aVar) {
        q.i(task, "task");
        q.i(taskQueue, "queue");
        q.i(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}
