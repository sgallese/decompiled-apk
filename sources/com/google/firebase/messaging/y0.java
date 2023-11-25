package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSubscriber.java */
/* loaded from: classes3.dex */
public class y0 {

    /* renamed from: i  reason: collision with root package name */
    private static final long f11722i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    private final Context f11723a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f11724b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f11725c;

    /* renamed from: d  reason: collision with root package name */
    private final FirebaseMessaging f11726d;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f11728f;

    /* renamed from: h  reason: collision with root package name */
    private final w0 f11730h;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f11727e = new androidx.collection.a();

    /* renamed from: g  reason: collision with root package name */
    private boolean f11729g = false;

    private y0(FirebaseMessaging firebaseMessaging, f0 f0Var, w0 w0Var, a0 a0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f11726d = firebaseMessaging;
        this.f11724b = f0Var;
        this.f11730h = w0Var;
        this.f11725c = a0Var;
        this.f11723a = context;
        this.f11728f = scheduledExecutorService;
    }

    private static <T> void b(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e11);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e12) {
            e = e12;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    private void c(String str) throws IOException {
        b(this.f11725c.k(this.f11726d.i(), str));
    }

    private void d(String str) throws IOException {
        b(this.f11725c.l(this.f11726d.i(), str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Task<y0> e(final FirebaseMessaging firebaseMessaging, final f0 f0Var, final a0 a0Var, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                y0 i10;
                i10 = y0.i(context, scheduledExecutorService, firebaseMessaging, f0Var, a0Var);
                return i10;
            }
        });
    }

    static boolean g() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y0 i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, f0 f0Var, a0 a0Var) throws Exception {
        return new y0(firebaseMessaging, f0Var, w0.a(context, scheduledExecutorService), a0Var, context, scheduledExecutorService);
    }

    private void j(v0 v0Var) {
        synchronized (this.f11727e) {
            String e10 = v0Var.e();
            if (!this.f11727e.containsKey(e10)) {
                return;
            }
            ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f11727e.get(e10);
            TaskCompletionSource<Void> poll = arrayDeque.poll();
            if (poll != null) {
                poll.setResult(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f11727e.remove(e10);
            }
        }
    }

    private void n() {
        if (!h()) {
            q(0L);
        }
    }

    boolean f() {
        if (this.f11730h.b() != null) {
            return true;
        }
        return false;
    }

    synchronized boolean h() {
        return this.f11729g;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:3:0x0003, B:18:0x0030, B:20:0x0036, B:21:0x0050, B:23:0x005d, B:24:0x0079, B:26:0x0086, B:8:0x0015, B:11:0x001f), top: B:41:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean k(com.google.firebase.messaging.v0 r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.b()     // Catch: java.io.IOException -> La2
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> La2
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = 1
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = 0
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L50
            boolean r2 = g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L50:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> La2
            r6.d(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L79:
            java.lang.String r2 = r7.c()     // Catch: java.io.IOException -> La2
            r6.c(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
        La1:
            return r5
        La2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbc
            goto Lc9
        Lbc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lc8:
            throw r7
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y0.k(com.google.firebase.messaging.v0):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(Runnable runnable, long j10) {
        this.f11728f.schedule(runnable, j10, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void m(boolean z10) {
        this.f11729g = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o() {
        if (f()) {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (g() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p() throws java.io.IOException {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f11730h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.v0 r0 = r0.b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.w0 r1 = r2.f11730h
            r1.d(r0)
            r2.j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.y0.p():boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(long j10) {
        l(new z0(this, this.f11723a, this.f11724b, Math.min(Math.max(30L, 2 * j10), f11722i)), j10);
        m(true);
    }
}
