package okhttp3;

import dc.w;
import ec.b0;
import ec.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import qc.q;

/* compiled from: Dispatcher.kt */
/* loaded from: classes4.dex */
public final class Dispatcher {
    private ExecutorService executorServiceOrNull;
    private Runnable idleCallback;
    private int maxRequests;
    private int maxRequestsPerHost;
    private final ArrayDeque<RealCall.AsyncCall> readyAsyncCalls;
    private final ArrayDeque<RealCall.AsyncCall> runningAsyncCalls;
    private final ArrayDeque<RealCall> runningSyncCalls;

    public Dispatcher() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    private final RealCall.AsyncCall findExistingCallWithHost(String str) {
        Iterator<RealCall.AsyncCall> it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall next = it.next();
            if (q.d(next.getHost(), str)) {
                return next;
            }
        }
        Iterator<RealCall.AsyncCall> it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall next2 = it2.next();
            if (q.d(next2.getHost(), str)) {
                return next2;
            }
        }
        return null;
    }

    private final <T> void finished(Deque<T> deque, T t10) {
        Runnable idleCallback;
        synchronized (this) {
            if (deque.remove(t10)) {
                idleCallback = getIdleCallback();
                w wVar = w.f13270a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!promoteAndExecute() && idleCallback != null) {
            idleCallback.run();
        }
    }

    private final boolean promoteAndExecute() {
        int i10;
        boolean z10;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
            q.h(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                RealCall.AsyncCall next = it.next();
                if (this.runningAsyncCalls.size() >= getMaxRequests()) {
                    break;
                } else if (next.getCallsPerHost().get() < getMaxRequestsPerHost()) {
                    it.remove();
                    next.getCallsPerHost().incrementAndGet();
                    q.h(next, "asyncCall");
                    arrayList.add(next);
                    this.runningAsyncCalls.add(next);
                }
            }
            if (runningCallsCount() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            w wVar = w.f13270a;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).executeOn(executorService());
        }
        return z10;
    }

    /* renamed from: -deprecated_executorService  reason: not valid java name */
    public final ExecutorService m271deprecated_executorService() {
        return executorService();
    }

    public final synchronized void cancelAll() {
        Iterator<RealCall.AsyncCall> it = this.readyAsyncCalls.iterator();
        while (it.hasNext()) {
            it.next().getCall().cancel();
        }
        Iterator<RealCall.AsyncCall> it2 = this.runningAsyncCalls.iterator();
        while (it2.hasNext()) {
            it2.next().getCall().cancel();
        }
        Iterator<RealCall> it3 = this.runningSyncCalls.iterator();
        while (it3.hasNext()) {
            it3.next().cancel();
        }
    }

    public final void enqueue$okhttp(RealCall.AsyncCall asyncCall) {
        RealCall.AsyncCall findExistingCallWithHost;
        q.i(asyncCall, "call");
        synchronized (this) {
            this.readyAsyncCalls.add(asyncCall);
            if (!asyncCall.getCall().getForWebSocket() && (findExistingCallWithHost = findExistingCallWithHost(asyncCall.getHost())) != null) {
                asyncCall.reuseCallsPerHostFrom(findExistingCallWithHost);
            }
            w wVar = w.f13270a;
        }
        promoteAndExecute();
    }

    public final synchronized void executed$okhttp(RealCall realCall) {
        q.i(realCall, "call");
        this.runningSyncCalls.add(realCall);
    }

    public final synchronized ExecutorService executorService() {
        ExecutorService executorService;
        if (this.executorServiceOrNull == null) {
            this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory(q.q(Util.okHttpName, " Dispatcher"), false));
        }
        executorService = this.executorServiceOrNull;
        q.f(executorService);
        return executorService;
    }

    public final void finished$okhttp(RealCall.AsyncCall asyncCall) {
        q.i(asyncCall, "call");
        asyncCall.getCallsPerHost().decrementAndGet();
        finished(this.runningAsyncCalls, asyncCall);
    }

    public final synchronized Runnable getIdleCallback() {
        return this.idleCallback;
    }

    public final synchronized int getMaxRequests() {
        return this.maxRequests;
    }

    public final synchronized int getMaxRequestsPerHost() {
        return this.maxRequestsPerHost;
    }

    public final synchronized List<Call> queuedCalls() {
        int s10;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall.AsyncCall> arrayDeque = this.readyAsyncCalls;
        s10 = u.s(arrayDeque, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        unmodifiableList = Collections.unmodifiableList(arrayList);
        q.h(unmodifiableList, "unmodifiableList(readyAsyncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int queuedCallsCount() {
        return this.readyAsyncCalls.size();
    }

    public final synchronized List<Call> runningCalls() {
        int s10;
        List r02;
        List<Call> unmodifiableList;
        ArrayDeque<RealCall> arrayDeque = this.runningSyncCalls;
        ArrayDeque<RealCall.AsyncCall> arrayDeque2 = this.runningAsyncCalls;
        s10 = u.s(arrayDeque2, 10);
        ArrayList arrayList = new ArrayList(s10);
        Iterator<T> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(((RealCall.AsyncCall) it.next()).getCall());
        }
        r02 = b0.r0(arrayDeque, arrayList);
        unmodifiableList = Collections.unmodifiableList(r02);
        q.h(unmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return unmodifiableList;
    }

    public final synchronized int runningCallsCount() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final synchronized void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }

    public final void setMaxRequests(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            synchronized (this) {
                this.maxRequests = i10;
                w wVar = w.f13270a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(q.q("max < 1: ", Integer.valueOf(i10)).toString());
    }

    public final void setMaxRequestsPerHost(int i10) {
        boolean z10 = true;
        if (i10 < 1) {
            z10 = false;
        }
        if (z10) {
            synchronized (this) {
                this.maxRequestsPerHost = i10;
                w wVar = w.f13270a;
            }
            promoteAndExecute();
            return;
        }
        throw new IllegalArgumentException(q.q("max < 1: ", Integer.valueOf(i10)).toString());
    }

    public final void finished$okhttp(RealCall realCall) {
        q.i(realCall, "call");
        finished(this.runningSyncCalls, realCall);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Dispatcher(ExecutorService executorService) {
        this();
        q.i(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
