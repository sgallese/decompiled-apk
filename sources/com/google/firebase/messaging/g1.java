package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.g1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: WithinAppServiceConnection.java */
/* loaded from: classes3.dex */
class g1 implements ServiceConnection {

    /* renamed from: f  reason: collision with root package name */
    private final Context f11644f;

    /* renamed from: m  reason: collision with root package name */
    private final Intent f11645m;

    /* renamed from: p  reason: collision with root package name */
    private final ScheduledExecutorService f11646p;

    /* renamed from: q  reason: collision with root package name */
    private final Queue<a> f11647q;

    /* renamed from: r  reason: collision with root package name */
    private d1 f11648r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f11649s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithinAppServiceConnection.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f11650a;

        /* renamed from: b  reason: collision with root package name */
        private final TaskCompletionSource<Void> f11651b = new TaskCompletionSource<>();

        a(Intent intent) {
            this.f11650a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f11650a.getAction() + " Releasing WakeLock.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            boolean z10;
            long j10;
            if ((this.f11650a.getFlags() & 268435456) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() { // from class: com.google.firebase.messaging.e1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.a.this.f();
                }
            };
            if (z10) {
                j10 = b1.f11617a;
            } else {
                j10 = 9000;
            }
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
            e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: com.google.firebase.messaging.f1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f11651b.trySetResult(null);
        }

        Task<Void> e() {
            return this.f11651b.getTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public g1(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f11647q.isEmpty()) {
            this.f11647q.poll().d();
        }
    }

    private synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f11647q.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            d1 d1Var = this.f11648r;
            if (d1Var != null && d1Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f11648r.c(this.f11647q.poll());
            } else {
                d();
                return;
            }
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("binder is dead. start connection? ");
            sb2.append(!this.f11649s);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f11649s) {
            return;
        }
        this.f11649s = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (ConnectionTracker.getInstance().bindService(this.f11644f, this.f11645m, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f11649s = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.c(this.f11646p);
        this.f11647q.add(aVar);
        b();
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
        }
        this.f11649s = false;
        if (!(iBinder instanceof d1)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            a();
            return;
        }
        this.f11648r = (d1) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    g1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f11647q = new ArrayDeque();
        this.f11649s = false;
        Context applicationContext = context.getApplicationContext();
        this.f11644f = applicationContext;
        this.f11645m = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f11646p = scheduledExecutorService;
    }
}
