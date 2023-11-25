package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.d1;
import java.util.concurrent.ExecutorService;

/* compiled from: EnhancedIntentService.java */
@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: classes3.dex */
public abstract class i extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = n.d();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* compiled from: EnhancedIntentService.java */
    /* loaded from: classes3.dex */
    class a implements d1.a {
        a() {
        }

        @Override // com.google.firebase.messaging.d1.a
        @KeepForSdk
        public Task<Void> a(Intent intent) {
            return i.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            b1.c(intent);
        }
        synchronized (this.lock) {
            int i10 = this.runningTasks - 1;
            this.runningTasks = i10;
            if (i10 == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.g
            @Override // java.lang.Runnable
            public final void run() {
                i.this.lambda$processIntent$0(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new d1(new a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, int i11) {
        synchronized (this.lock) {
            this.lastStartId = i11;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        processIntent.addOnCompleteListener(new s3.m(), new OnCompleteListener() { // from class: com.google.firebase.messaging.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                i.this.lambda$onStartCommand$1(intent, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i10) {
        return stopSelfResult(i10);
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }
}
