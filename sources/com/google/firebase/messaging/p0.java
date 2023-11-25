package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestDeduplicator.java */
/* loaded from: classes3.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11672a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Task<String>> f11673b = new androidx.collection.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RequestDeduplicator.java */
    /* loaded from: classes3.dex */
    public interface a {
        Task<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(Executor executor) {
        this.f11672a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task c(String str, Task task) throws Exception {
        synchronized (this) {
            this.f11673b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized Task<String> b(final String str, a aVar) {
        Task<String> task = this.f11673b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task continueWithTask = aVar.start().continueWithTask(this.f11672a, new Continuation() { // from class: com.google.firebase.messaging.o0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                Task c10;
                c10 = p0.this.c(str, task2);
                return c10;
            }
        });
        this.f11673b.put(str, continueWithTask);
        return continueWithTask;
    }
}
